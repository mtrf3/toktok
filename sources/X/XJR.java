package X;

/* loaded from: classes16.dex */
public final class XJR {
    public static final C3BS LIZ = new C3BS("UNLOCK_FAIL");
    public static final C3BS LIZIZ;
    public static final C3BS LIZJ;
    public static final XJS LIZLLL;
    public static final XJS LJ;

    static {
        C3BS c3bs = new C3BS("LOCKED");
        LIZIZ = c3bs;
        C3BS c3bs2 = new C3BS("UNLOCKED");
        LIZJ = c3bs2;
        LIZLLL = new XJS(c3bs);
        LJ = new XJS(c3bs2);
    }

    public static XJO LIZ() {
        return new XJO(false);
    }
}
