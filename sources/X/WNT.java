package X;

/* loaded from: classes15.dex */
public abstract class WNT {
    public static final WNS LIZIZ = new WNS();
    public final float LIZ;

    public WNT() {
        this(0);
    }

    public abstract void LIZIZ(float f);

    static {
        new WNU(Float.class);
    }

    public WNT(int i) {
        this.LIZ = 1.0f;
    }

    public final void LIZ(float f) {
        LIZIZ(Math.min(1.0f, f / this.LIZ));
    }
}
