package X;

/* loaded from: classes15.dex */
public final class VDC {
    public static String LIZIZ = "330361";
    public static volatile VDC LIZJ;
    public long LIZ = -1;

    public static VDC LIZ() {
        if (LIZJ == null) {
            synchronized (VDC.class) {
                if (LIZJ == null) {
                    LIZJ = new VDC();
                }
            }
        }
        return LIZJ;
    }
}
