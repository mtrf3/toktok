package X;

/* renamed from: X.0O2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0O2 {
    public final float LIZ;
    public final InterfaceC23370vt LIZIZ;
    public final float LIZJ;

    public final C0O1 LIZ(float f) {
        double LIZIZ = LIZIZ(f);
        double d = C0O3.LIZ;
        double d2 = d - 1.0d;
        return new C0O1((long) (Math.exp(LIZIZ / d2) * 1000.0d), f, (float) (Math.exp((d / d2) * LIZIZ) * this.LIZ * this.LIZJ));
    }

    public final double LIZIZ(float f) {
        return Math.log((Math.abs(f) * 0.35f) / (this.LIZ * this.LIZJ));
    }

    public C0O2(float f, InterfaceC23370vt interfaceC23370vt) {
        this.LIZ = f;
        this.LIZIZ = interfaceC23370vt;
        this.LIZJ = interfaceC23370vt.getDensity() * 386.0878f * 160.0f * 0.84f;
    }
}
