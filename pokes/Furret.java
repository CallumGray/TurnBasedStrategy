package capturedanimalsfighting.pokes;

import capturedanimalsfighting.Poke;
import capturedanimalsfighting.Type;
import capturedanimalsfighting.moves.BrickBreak;
import capturedanimalsfighting.moves.Slam;

public class Furret extends Poke
{
    public Furret(int level)
    {
        super("Furret", Type.NORMAL,Type.NONE,level,85,76,64,90);
        //MIGHT NOT WORK ROFLLL
        move = new Slam();
        moves.add(move);
        move = new BrickBreak();
        moves.add(move);
    }
}
