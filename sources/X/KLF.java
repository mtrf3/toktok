package X;

import android.animation.TypeEvaluator;
import android.graphics.RectF;

/* loaded from: classes9.dex */
public final class KLF<T> implements TypeEvaluator {
    public final /* synthetic */ RectF LIZ;

    public KLF(RectF rectF) {
        this.LIZ = rectF;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        RectF rectF = (RectF) obj;
        RectF rectF2 = (RectF) obj2;
        RectF rectF3 = this.LIZ;
        float f2 = rectF.left;
        rectF3.left = C06420Na.LIZIZ(rectF2.left, f2, f, f2);
        float f3 = rectF.right;
        rectF3.right = C06420Na.LIZIZ(rectF2.right, f3, f, f3);
        float f4 = rectF.top;
        rectF3.top = C06420Na.LIZIZ(rectF2.top, f4, f, f4);
        float f5 = rectF.bottom;
        rectF3.bottom = C06420Na.LIZIZ(rectF2.bottom, f5, f, f5);
        return rectF3;
    }
}
