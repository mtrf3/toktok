package X;

import android.animation.TypeEvaluator;
import android.graphics.PointF;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeAnimationOptConfig;

/* loaded from: classes6.dex */
public final class CXD implements TypeEvaluator<PointF> {
    public final PointF LIZ;
    public final InterfaceC88472Yns<Float, Float> LIZIZ;

    public CXD(PointF pointF) {
        this.LIZ = pointF;
    }

    public CXD(PointF pointF, InterfaceC88472Yns<Float, Float> interfaceC88472Yns) {
        this.LIZ = pointF;
        this.LIZIZ = interfaceC88472Yns;
    }

    @Override // android.animation.TypeEvaluator
    public final PointF evaluate(float f, PointF pointF, PointF pointF2) {
        InterfaceC88472Yns<Float, Float> interfaceC88472Yns;
        PointF pointF3 = pointF;
        PointF pointF4 = pointF2;
        PointF pointF5 = new PointF();
        if (LiveLikeAnimationOptConfig.enableDynamicAdjustAnimation() && (interfaceC88472Yns = this.LIZIZ) != null) {
            f = interfaceC88472Yns.invoke(Float.valueOf(f)).floatValue();
        }
        float f2 = 1.0f - f;
        double d = f2;
        float f3 = 2.0f * f * f2;
        float f4 = f * f;
        pointF5.x = (float) ((Math.pow(d, 2.0d) * pointF3.x) + (this.LIZ.x * f3) + (pointF4.x * f4));
        pointF5.y = (float) ((Math.pow(d, 2.0d) * pointF3.y) + (f3 * this.LIZ.y) + (f4 * pointF4.y));
        return pointF5;
    }
}
