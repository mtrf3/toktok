package X;

/* renamed from: X.1AA, reason: invalid class name */
/* loaded from: classes.dex */
public class C1AA extends AbstractInterpolatorC267413e {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public final /* synthetic */ C45601qe LIZLLL;

    @Override // X.AbstractInterpolatorC267413e
    public final float LIZ() {
        return this.LIZLLL.LJLJI;
    }

    public C1AA(C45601qe c45601qe) {
        this.LIZLLL = c45601qe;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = this.LIZ;
        if (f2 > 0.0f) {
            float f3 = this.LIZJ;
            if (f2 / f3 < f) {
                f = f2 / f3;
            }
            this.LIZLLL.LJLJI = f2 - (f3 * f);
            return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.LIZIZ;
        }
        float f4 = this.LIZJ;
        if ((-f2) / f4 < f) {
            f = (-f2) / f4;
        }
        this.LIZLLL.LJLJI = (f4 * f) + f2;
        return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.LIZIZ;
    }
}
