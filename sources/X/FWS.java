package X;

/* loaded from: classes7.dex */
public final class FWS {
    public static FWS LIZJ;
    public boolean LIZ = true;
    public boolean LIZIZ = true;

    public static FWS LIZ() {
        if (LIZJ == null) {
            synchronized (FWS.class) {
                if (LIZJ == null) {
                    LIZJ = new FWS();
                }
            }
        }
        return LIZJ;
    }
}
