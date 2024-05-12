package X;

/* renamed from: X.QvR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68557QvR implements InterfaceC68629Qwb {
    public static final C68059QnP LIZ;
    public static final C68191QpX LIZIZ;
    public static final C68192QpY LIZJ;
    public static final C68192QpY LIZLLL;
    public static final C68604QwC LJ;

    static {
        C68559QvT LIZ2 = new C68559QvT(C48261Iwr.LIZ(), false, false).LIZ();
        LIZ = LIZ2.LJ("measurement.test.boolean_flag", false);
        LIZIZ = new C68191QpX(LIZ2, Double.valueOf(-3.0d));
        LIZJ = LIZ2.LIZJ(-2L, "measurement.test.int_flag");
        LIZLLL = LIZ2.LIZJ(-1L, "measurement.test.long_flag");
        LJ = new C68604QwC(LIZ2, "measurement.test.string_flag", "---");
    }

    @Override // X.InterfaceC68629Qwb
    public final long LIZ() {
        return ((Long) LIZJ.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68629Qwb
    public final long LIZIZ() {
        return ((Long) LIZLLL.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68629Qwb
    public final String LIZLLL() {
        return (String) LJ.LIZIZ();
    }

    @Override // X.InterfaceC68629Qwb
    public final boolean LJ() {
        return ((Boolean) LIZ.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68629Qwb
    public final double zza() {
        return ((Double) LIZIZ.LIZIZ()).doubleValue();
    }
}
