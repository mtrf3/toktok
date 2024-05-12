package X;

import android.animation.TypeEvaluator;
import android.graphics.PointF;

/* loaded from: classes10.dex */
public final class MKJ implements TypeEvaluator<PointF> {
    public final PointF LIZ = new PointF();
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;

    public MKJ(PointF pointF, PointF pointF2) {
        float f = pointF.x * 3.0f;
        float f2 = pointF2.x * 3.0f;
        this.LIZIZ = f - f2;
        this.LIZJ = f2 - (f * 2.0f);
        this.LIZLLL = f;
        float f3 = pointF.y * 3.0f;
        float f4 = pointF2.y * 3.0f;
        this.LJ = f3 - f4;
        this.LJFF = f4 - (2.0f * f3);
        this.LJI = f3;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final PointF evaluate(float f, PointF pointF, PointF pointF2) {
        float f2 = pointF.x;
        float f3 = f2 * 3.0f;
        float f4 = pointF.y;
        float f5 = 3.0f * f4;
        PointF pointF3 = this.LIZ;
        pointF3.x = (((((((((pointF2.x - f2) + this.LIZIZ) * f) + f3) + this.LIZJ) * f) - f3) + this.LIZLLL) * f) + f2;
        pointF3.y = (((((((((pointF2.y - f4) + this.LJ) * f) + f5) + this.LJFF) * f) - f5) + this.LJI) * f) + f4;
        return pointF3;
    }
}
