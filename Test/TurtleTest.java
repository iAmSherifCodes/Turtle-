package TurtleTest;

import org.junit.jupiter.api.Test;

import static TurtleTest.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {

    Turtle turtle = new Turtle();

    @Test
    public void thereIsATurtle(){
        assertNotNull(turtle);
    }

    @Test
    void testThatPenIsDownByDefault(){
        assertFalse(turtle.isPenDown());

        turtle.movePenDown();
        assertTrue(turtle.isPenDown());
    }

    @Test
    void turtleCanMovePenUp(){
        turtle.movePenDown();
        turtle.movePenUp();
        assertFalse(turtle.isPenDown());
    }

    @Test
    void turtleCanTurnRightFacingEast(){
        assertSame(EAST, turtle.getDirection());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getDirection());
    }
    @Test
    void turtleFacingSouthCanFaceWest(){
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getDirection());
    }
    @Test
    void turtleFaceWestTurnNorth(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH, turtle.getDirection());
    }

    @Test
    void turtleFaceNorthTurnRightFaceEast(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(EAST, turtle.getDirection());
    }
    @Test
    void turtleCanTurnLeftFaceNorth(){
        turtle.turnLeft();
        assertSame(NORTH, turtle.getDirection());
    }
    @Test
    void turtleFacingNorthCanFaceWest(){
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(WEST, turtle.getDirection());
    }
    @Test
    void turtleFaceWestTurnSouth(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getDirection());
    }

    @Test
    void turtleFaceSouthTurnRightFaceEast(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(EAST, turtle.getDirection());
    }
    @Test
    void  turtleTurnLeftAndTurnRightPositionDoesNotChange(){
        turtle.turnLeft();
        turtle.turnRight();
        assertSame(EAST, turtle.getDirection());
    }
    @Test
    void turtleCanMoveWhileFacingEastTest(){
        assertSame(EAST, turtle.getDirection());
        assertFalse(turtle.isPenDown());
        Position position1 = new Position(0,0);
        assertEquals(new Position(0,0), turtle.getPosition());
        turtle.moveForward(4);
        assertEquals(new Position(0,4), turtle.getPosition());

        position1.equals(turtle);
    }
    @Test
    void turtleCanMoveAnywhere(){
        assertSame(EAST, turtle.getDirection());
        assertFalse(turtle.isPenDown());
        turtle.moveForward(5);
        assertEquals(new Position(0,5), turtle.getPosition());
        turtle.turnRight();
        turtle.turnRight();
        turtle.moveForward(4);
        assertEquals(new Position(0,1), turtle.getPosition());

    }
}
