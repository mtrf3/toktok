package X;

import Y.AUListenerS100S0100000_13;
import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UKw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77026UKw extends RxBusSceneObserver<B4Q> {
    public final C5H3 LIZ;

    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
    public final Class<B4Q> getType() {
        return B4Q.class;
    }

    public C77026UKw(UL8 ul8) {
        this.LIZ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(ul8, 559));
    }

    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, B4Q b4q) {
        float f;
        B4Q value = b4q;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        ValueAnimator valueAnimator = (ValueAnimator) this.LIZ.getValue();
        valueAnimator.cancel();
        C16880lQ.LJLJL(valueAnimator);
        valueAnimator.removeAllUpdateListeners();
        float[] fArr = new float[2];
        fArr[0] = constraintProperty.alpha();
        if (value.LIZIZ) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[1] = f;
        valueAnimator.setFloatValues(fArr);
        valueAnimator.addUpdateListener(new AUListenerS100S0100000_13(constraintProperty, 97));
        valueAnimator.start();
    }
}
