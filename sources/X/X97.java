package X;

/* loaded from: classes16.dex */
public final class X97 {
    public static volatile boolean LIZIZ;
    public static final X97 LIZJ = new X97();
    public static X96 LIZ = X98.LIZ;

    public final void LIZ() {
        if (LIZIZ) {
            return;
        }
        synchronized (this) {
            if (!LIZIZ) {
                LIZ.loadLibrary("newep");
                LIZIZ = true;
            }
        }
    }
}
