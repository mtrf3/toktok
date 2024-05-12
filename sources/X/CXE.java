package X;

import android.animation.TypeEvaluator;
import android.graphics.PointF;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeAnimationOptConfig;

/* loaded from: classes6.dex */
public final class CXE implements TypeEvaluator<PointF> {
    public final InterfaceC88472Yns<Float, Float> LIZ;

    public CXE(InterfaceC88472Yns<Float, Float> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    @Override // android.animation.TypeEvaluator
    public final PointF evaluate(float f, PointF pointF, PointF pointF2) {
        InterfaceC88472Yns<Float, Float> interfaceC88472Yns;
        PointF pointF3 = pointF;
        PointF pointF4 = pointF2;
        PointF pointF5 = new PointF();
        if (LiveLikeAnimationOptConfig.enableDynamicAdjustAnimation() && (interfaceC88472Yns = this.LIZ) != null) {
            f = interfaceC88472Yns.invoke(Float.valueOf(f)).floatValue();
        }
        float f2 = pointF4.x;
        float f3 = pointF3.x;
        pointF5.x = C06420Na.LIZIZ(f2, f3, f, f3);
        float f4 = pointF4.y;
        float f5 = pointF3.y;
        pointF5.y = C06420Na.LIZIZ(f4, f5, f, f5);
        return pointF5;
    }
}
