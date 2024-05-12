package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.1nj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43791nj extends AbstractC35131Zl<PointF> {
    public final PointF LJIIJ;

    public C43791nj(List<C06780Ok<PointF>> list) {
        super(list);
        this.LJIIJ = new PointF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC22650uj
    public final Object LJII(C06780Ok c06780Ok, float f) {
        T t;
        T t2 = c06780Ok.LIZIZ;
        if (t2 != 0 && (t = c06780Ok.LIZJ) != 0) {
            PointF pointF = (PointF) t2;
            PointF pointF2 = (PointF) t;
            C06800Om<A> c06800Om = this.LJFF;
            if (c06800Om != 0) {
                c06780Ok.LJFF.floatValue();
                return c06800Om.LIZIZ(pointF, pointF2, LJ());
            }
            PointF pointF3 = this.LJIIJ;
            float f2 = pointF.x;
            float LIZIZ = C06420Na.LIZIZ(pointF2.x, f2, f, f2);
            float f3 = pointF.y;
            pointF3.set(LIZIZ, ((pointF2.y - f3) * f) + f3);
            return this.LJIIJ;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
