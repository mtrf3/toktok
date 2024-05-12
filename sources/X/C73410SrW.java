package X;

/* renamed from: X.SrW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73410SrW implements InterfaceC65048Pfw {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    @Override // X.InterfaceC65048Pfw
    public final Object LIZ(YMG ymg) {
        C73915Szf c73915Szf = new C73915Szf(ymg);
        if (this.LIZ) {
            return c73915Szf.LJJLIIJ(EnumC73681Svt.LATEST);
        }
        if (this.LIZIZ) {
            return new C73460SsK(c73915Szf);
        }
        if (this.LIZJ) {
            return new C73506St4(c73915Szf);
        }
        if (this.LIZLLL) {
            return new C73440Ss0(c73915Szf);
        }
        return c73915Szf;
    }

    public C73410SrW(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }
}
