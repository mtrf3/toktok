package X;

import java.util.List;

/* renamed from: X.1nf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43751nf extends AbstractC35131Zl<Float> {
    public final float LJIIJJI() {
        C06780Ok<Float> LIZIZ = LIZIZ();
        float LIZLLL = LIZLLL();
        if (LIZIZ.LIZIZ != null && LIZIZ.LIZJ != null) {
            C06800Om<A> c06800Om = this.LJFF;
            if (c06800Om != 0) {
                LIZIZ.LJFF.floatValue();
                Float f = (Float) c06800Om.LIZIZ(LIZIZ.LIZIZ, LIZIZ.LIZJ, LJ());
                if (f != null) {
                    return f.floatValue();
                }
            }
            if (LIZIZ.LJI == -3987645.8f) {
                LIZIZ.LJI = LIZIZ.LIZIZ.floatValue();
            }
            float f2 = LIZIZ.LJI;
            if (LIZIZ.LJII == -3987645.8f) {
                LIZIZ.LJII = LIZIZ.LIZJ.floatValue();
            }
            return C06420Na.LIZIZ(LIZIZ.LJII, f2, LIZLLL, f2);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    public C43751nf(List<C06780Ok<Float>> list) {
        super(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC22650uj
    public final Object LJII(C06780Ok c06780Ok, float f) {
        T t = c06780Ok.LIZIZ;
        if (t != 0 && c06780Ok.LIZJ != 0) {
            C06800Om<A> c06800Om = this.LJFF;
            if (c06800Om != 0) {
                c06780Ok.LJFF.floatValue();
                return c06800Om.LIZIZ(c06780Ok.LIZIZ, c06780Ok.LIZJ, LJ());
            }
            float floatValue = ((Float) t).floatValue();
            return Float.valueOf(((((Float) c06780Ok.LIZJ).floatValue() - floatValue) * f) + floatValue);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
