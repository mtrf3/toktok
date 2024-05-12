package X;

/* renamed from: X.0ht, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14690ht {
    public final /* synthetic */ InterfaceC14710hv LIZ;

    public C14690ht(InterfaceC14710hv interfaceC14710hv) {
        this.LIZ = interfaceC14710hv;
    }

    public final void LIZLLL(long j) {
        InterfaceC11750d9 LIZ = this.LIZ.LIZ();
        LIZ.LJIILLIIL(C10370av.LIZLLL(j), C10370av.LJ(j));
        LIZ.LJIJJ();
        LIZ.LJIILLIIL(-C10370av.LIZLLL(j), -C10370av.LJ(j));
    }

    public final void LJ(long j) {
        InterfaceC11750d9 LIZ = this.LIZ.LIZ();
        LIZ.LJIILLIIL(C10370av.LIZLLL(j), C10370av.LJ(j));
        LIZ.LJIJ();
        LIZ.LJIILLIIL(-C10370av.LIZLLL(j), -C10370av.LJ(j));
    }

    public final void LJFF(float[] fArr) {
        this.LIZ.LIZ().LJIILIIL(fArr);
    }

    public final void LIZ(C1QX c1qx, int i) {
        this.LIZ.LIZ().LJIIIZ(c1qx, i);
    }

    public final void LJI(float f, float f2) {
        this.LIZ.LIZ().LJIILLIIL(f, f2);
    }

    public final void LIZJ(float f, float f2, float f3, float f4) {
        InterfaceC11750d9 LIZ = this.LIZ.LIZ();
        InterfaceC14710hv interfaceC14710hv = this.LIZ;
        long LIZIZ = C1DF.LIZIZ(C10430b1.LIZLLL(interfaceC14710hv.LIZIZ()) - (f3 + f), C10430b1.LIZIZ(this.LIZ.LIZIZ()) - (f4 + f2));
        if (C10430b1.LIZLLL(LIZIZ) >= 0.0f && C10430b1.LIZIZ(LIZIZ) >= 0.0f) {
            interfaceC14710hv.LIZJ(LIZIZ);
            LIZ.LJIILLIIL(f, f2);
        } else {
            "Width and height must be greater than or equal to zero".toString();
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }
    }

    public final void LIZIZ(float f, float f2, float f3, float f4, int i) {
        this.LIZ.LIZ().LIZLLL(f, f2, f3, f4, i);
    }
}
