/*
Class Player
    Variables:
        Private:
            Deck drawDeck
            Deck hand
            Deck discard

            String  name
            int     actions
            int     value
            int     buys

    Functions:
        Private:

        Public:
            void    showHand()
            void    playCard(String)
            void    buy()
            void    draw()
            void    discard()
            void    draw(int)
            void    recycle()
            String  getName()
            int     getActions()
            int     getValues()
            int     getBuys()
            boolean hasActions()
            boolean hasMoves()


        ShowHand:


        PlayCard:


        Buy:


        Draw:


        Discard:


        Draw:
            Description: draws a certain number of cards and adds it to hand
            Input:  number of cards to draw
            Output: none
            Potential Errors:
                - Draws more cards than are in the drawDeck
                - Number exceeds the number of cards in the deck
                - Number is negative

        Recycle:


        GetName:


        GetActions:


        GetValues:


        GetBuys:


        HasActions:


        HasMoves:

*/

public class Player {

    private Deck drawDeck;
    public Deck hand;
    private Deck discard;

    //the name of the player
    private String name;
    //number of actions the player has left in the turn
    private int actions;
    //purchasing power of the players hand
    private int value;
    //how many buys you can use
    private int buys;

    public Player() {
        //build the starter deck
        drawDeck = new Deck("starter");
        //build an empty hand
        hand = new Deck();
        //build and empty discard pile
        discard = new Deck();

        //both the actions of the player start with 0
        //the game should add and remove action ammounts
        actions = 0;
        value = 0;
        buys = 0;
        name = "null";
        drawDeck.shuffle();
    }

    public Player(String playerName) {
        drawDeck = new Deck("starter");
        hand = new Deck();
        discard = new Deck();
        actions = 0;
        value = 0;
        buys = 0;
        name = playerName;
        drawDeck.shuffle();
    }

    public void showHand() {
        hand.printDeck();
    }

    public void playCard(String cardName) {
        if (hand.indexOf(cardName) >= 0) {
            Card temp = new Card(cardName);
            if (temp.isVictoryCard()) {
                System.out.println("Error. You cannot play a victory card");
                System.exit(1);
            }
            else if (temp.isTreasureCard()) {
                System.out.println("Error. You cannot play a treasure card");
                System.exit(1);
            }
            else {
                applyCardActions(temp);
                printMoves();
            }
        }
        else {
            System.out.println("Error. That card does not exist");
            System.exit(1);
        }
    }

    public void printMoves() {
        System.out.println("You have " + actions + " actions, " + buys + " pruchases you can make, and " + value + " coins to spend");
    }

    public void buy() {

    }

    public void draw() {
        if (!drawDeck.empty()) {
            //the hand is drawing a card from the drawCard deck
            hand.addCard(drawDeck.drawCard());
        }
    }

    public void discard() {
        if (!hand.empty()) {
            //the discard deck is drawing from the hand
            discard.addCard(hand.drawCard());
        }
    }

    public void draw(int number) {
        for (int x = 0; x < number; x++) {
            draw();
        }
    }

    public void recycle() {

    }

    public String getName() {return name;}
    public int getActions() {return actions;}
    public int getValues()  {return value;}
    public int getBuys()    {return buys;}

    public boolean hasActions() {
        if (actions > 0 && hand.hasActions()) {
            return true;
        }
        return false;
    }

    public boolean hasMoves() {
        if (actions > 0 || buys > 0) {
            return true;
        }
        return false;
    }

    public void applyCardActions(Card card) {
        actions += card.getActions();
        value += card.getValue();
        buys += card.getBuys();
    }
}
