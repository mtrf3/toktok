package X;

/* renamed from: X.0sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21380sg {
    public static final C1P9 LIZ;
    public static final float LIZIZ = 64;
    public static final float LIZJ = 36;
    public static final C1P9 LIZLLL;

    static {
        float f = 16;
        float f2 = 8;
        LIZ = new C1P9(f, f2, f, f2);
        LIZLLL = new C1P9(f2, f2, f2, f2);
    }

    public static C1ZJ LIZ(long j, long j2, long j3, long j4, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        interfaceC24520xk.LJJIIJ(1870371134);
        if ((i2 & 1) != 0) {
            j = C21350sd.LIZ(interfaceC24520xk).LJFF();
        }
        if ((i2 & 2) != 0) {
            j2 = C21570sz.LIZIZ(j, interfaceC24520xk);
        }
        if ((i2 & 4) != 0) {
            j3 = C78897Uxp.LJIIJJI(C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJ(), 0.12f), C21350sd.LIZ(interfaceC24520xk).LJI());
        }
        if ((i2 & 8) != 0) {
            j4 = C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJ(), C21590t1.LIZIZ(interfaceC24520xk));
        }
        C1ZJ c1zj = new C1ZJ(j, j2, j3, j4);
        interfaceC24520xk.LJJIJIIJIL();
        return c1zj;
    }
}
