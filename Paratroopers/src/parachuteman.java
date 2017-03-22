/**
 * Created by tony_park on 3/22/17.
 */
public class parachuteman extends Sprite {

    public parachuteman(int x, int y, int dir) {
        super(x, y, dir);
        setSpeed(5);
        setPic("28223-200.png", SOUTH);
//        int z = (int)(Math.random())*400;
        int z = 100;
        if(getLoc().getX()==z) {
            setDir(SOUTH);
        }

    }

    @Override
    public void update(){
        super.update(); //move forward
    }

}
