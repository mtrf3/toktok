package X;

/* renamed from: X.1ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48041ua extends AbstractC65781Prl implements InterfaceC88472Yns<C11850dJ, C1JP> {
    public static final C48041ua LJLIL = new C48041ua();

    public C48041ua() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C1JP invoke(C11850dJ c11850dJ) {
        long j = c11850dJ.LIZ;
        long LIZ = C11850dJ.LIZ(j, C13240fY.LJIILLIIL);
        float LJII = C11850dJ.LJII(LIZ);
        float LJI = C11850dJ.LJI(LIZ);
        float LJ = C11850dJ.LJ(LIZ);
        float[] fArr = C06590Nr.LIZIZ;
        double d = 0.33333334f;
        return new C1JP(C11850dJ.LIZLLL(j), (float) Math.pow(C06590Nr.LIZ(LJII, LJI, LJ, 0, fArr), d), (float) Math.pow(C06590Nr.LIZ(LJII, LJI, LJ, 1, fArr), d), (float) Math.pow(C06590Nr.LIZ(LJII, LJI, LJ, 2, fArr), d));
    }
}
