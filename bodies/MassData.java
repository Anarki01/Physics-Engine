package bodies;

/**
 * Created by Jordan on 2016-11-06.
 */
public class MassData {

    public float mass;
    public float invMass;
    // for rotations
    public float inertia;
    public float invInertia;

    // Constructor
    public MassData(float mass/*, float inertia*/) {
        this.mass = mass;
        this.invMass = 1 / mass;
        /*this.inertia = inertia;
        this.invInertia = 1 / inertia;*/
    }

    /**
     *
     * */
    public void setSTATIC() {
        this.mass = 0.0f;
        this.invMass = 0.0f;
        this.inertia = 0.0f;
        this.invInertia = 0.0f;
    }
}
