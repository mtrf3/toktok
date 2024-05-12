package X;

/* renamed from: X.QGo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC66722QGo {
    public static final /* synthetic */ int LIZ = 0;

    public abstract String LIZ();

    public abstract long LIZIZ();

    public abstract String LIZJ();

    public abstract String LIZLLL();

    public abstract String LJ();

    public abstract EnumC66725QGr LJFF();

    public abstract long LJI();

    public abstract C66721QGn LJII();

    static {
        C66721QGn c66721QGn = new C66721QGn();
        c66721QGn.LJFF = 0L;
        c66721QGn.LIZIZ(EnumC66725QGr.ATTEMPT_MIGRATION);
        c66721QGn.LJ = 0L;
        c66721QGn.LIZ();
    }

    public final C66720QGm LJIIIIZZ() {
        C66721QGn LJII = LJII();
        LJII.LJI = "BAD CONFIG";
        LJII.LIZIZ(EnumC66725QGr.REGISTER_ERROR);
        return LJII.LIZ();
    }
}
