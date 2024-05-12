package X;

/* loaded from: classes10.dex */
public final class LNU {
    public static volatile LNU LIZJ;
    public LNY LIZ;
    public String LIZIZ;

    public static LNU LIZ() {
        if (LIZJ == null) {
            synchronized (LNU.class) {
                if (LIZJ == null) {
                    LIZJ = new LNU();
                }
            }
        }
        return LIZJ;
    }
}
