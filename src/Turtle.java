package TurtleTest;
import static TurtleTest.Direction.*;

public class Turtle {

    private boolean penIsDown;
    private Direction direction = EAST;

    private Position position = new Position(0,0);

    public boolean isPenDown() {
        return penIsDown;
    }

    public void movePenDown() {
        penIsDown = true;
    }

    public void movePenUp() {
        penIsDown = false;
    }

    public Direction getDirection() {
        return direction;
    }
    public void turnRight(){
        switch (direction){
            case EAST -> face(SOUTH);
            case SOUTH -> face(WEST);
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);
        }
    }

    public void turnLeft(){
        switch (direction){
            case EAST -> face(NORTH);
            case SOUTH -> face(EAST);
            case NORTH -> face(WEST);
            case WEST -> face(SOUTH);
        }
    }

    private void face(Direction newDirection){
        direction = newDirection;
    }

    public Position getPosition() {
        return position;
    }

    public void moveForward(int movement) {
        switch (direction){
            case EAST -> moveEast(movement);
            case SOUTH -> moveSouth(movement);
            case NORTH -> moveNorth(movement);
            case WEST -> moveWest(movement);
        }
    }

    private void moveWest(int movement){
        int currentColumn =position.getColumn();
        int newColumn = currentColumn - movement;
        moveInColumn(newColumn);
    }

    private void moveNorth(int movement){
        int currentRow =position.getRow();
        int newRow = currentRow + movement;
        moveInRow(newRow);
    }
    private void moveSouth(int movement){
        int currentRow =position.getRow();
        int newRow = currentRow - movement;
        moveInRow(newRow);
    }
    private void moveEast(int movement){
        int currentColumn =position.getColumn();
        int newColumn = currentColumn + movement;
        moveInColumn(newColumn);
    }




    private void moveInColumn(int noOfMovement){
        position.setColumn(noOfMovement);
    }
    private void moveInRow(int noOfMovement){
        position.setColumn(noOfMovement);
    }
}
