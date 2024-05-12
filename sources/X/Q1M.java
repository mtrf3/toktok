package X;

/* loaded from: classes12.dex */
public final class Q1M {
    public static InterfaceC66328Q1k LJ;
    public static final Q1W LJFF = new Q1W();
    public final C38521F9x LIZ;
    public final Q2I LIZIZ;
    public final C61576OEq LIZJ;
    public String LIZLLL;

    public Q1M(int i) {
        C38521F9x c38521F9x = new C38521F9x(new C66321Q1d(i));
        this.LIZ = c38521F9x;
        this.LIZIZ = new Q2I(c38521F9x);
        this.LIZJ = new C61576OEq();
    }

    public static C66318Q1a LIZ(Q1M q1m, Object obj, int i, Throwable th, int i2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            th = null;
        }
        q1m.getClass();
        C66318Q1a c66318Q1a = new C66318Q1a(obj, th, i, null);
        if (th instanceof C61596OFk) {
            c66318Q1a.LJLILLLLZI = ((C61596OFk) th).getErrorCode();
        }
        return c66318Q1a;
    }
}
