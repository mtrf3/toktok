package X;

import Y.AUListenerS100S0100000_13;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.watch.StartClearScreenEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ULK extends DataChannelSceneObserver<C29717BlR, StartClearScreenEvent> {
    public final C5H3 LIZ;
    public C29717BlR LIZIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<StartClearScreenEvent> getType() {
        return StartClearScreenEvent.class;
    }

    public ULK(C1O4 c1o4) {
        super(false, 1, null);
        this.LIZ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(c1o4, 8));
    }

    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
    public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.dispose(context, constraintProperty);
        constraintProperty.alpha(1.0f);
        ((ValueAnimator) this.LIZ.getValue()).cancel();
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C29717BlR c29717BlR) {
        C29717BlR value = c29717BlR;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        C29717BlR c29717BlR2 = this.LIZIZ;
        if (c29717BlR2 != null && c29717BlR2.LIZ == value.LIZ) {
            return;
        }
        ValueAnimator valueAnimator = (ValueAnimator) this.LIZ.getValue();
        this.LIZIZ = value;
        valueAnimator.cancel();
        valueAnimator.removeAllUpdateListeners();
        C16880lQ.LJLJL(valueAnimator);
        if (value.LIZ) {
            valueAnimator.setFloatValues(1.0f, 0.0f);
        } else {
            valueAnimator.setFloatValues(0.0f, 1.0f);
        }
        valueAnimator.addUpdateListener(new AUListenerS100S0100000_13(constraintProperty, 1));
        valueAnimator.start();
    }
}
