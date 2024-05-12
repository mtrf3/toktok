package X;

import Y.ALAdapterS10S0100000_13;
import Y.AUListenerS100S0100000_13;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ULI extends DataChannelSceneObserver<C30744C4u, ProgrammedLiveMenuVisibilityChannel> {
    public final C5H3 LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<ProgrammedLiveMenuVisibilityChannel> getType() {
        return ProgrammedLiveMenuVisibilityChannel.class;
    }

    public ULI(C1O4 c1o4) {
        super(false);
        this.LIZ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(c1o4, 10));
    }

    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
    public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.dispose(context, constraintProperty);
        constraintProperty.alpha(0.0f);
        constraintProperty.visibility(8);
        ((ValueAnimator) this.LIZ.getValue()).cancel();
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C30744C4u c30744C4u) {
        C30744C4u value = c30744C4u;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        ValueAnimator valueAnimator = (ValueAnimator) this.LIZ.getValue();
        valueAnimator.cancel();
        C16880lQ.LJLJL(valueAnimator);
        valueAnimator.removeAllUpdateListeners();
        if (value.LIZ) {
            valueAnimator.setFloatValues(constraintProperty.alpha(), 1.0f);
            valueAnimator.addListener(new ALAdapterS10S0100000_13(constraintProperty, 0));
        } else {
            valueAnimator.setFloatValues(constraintProperty.alpha(), 0.0f);
            valueAnimator.addListener(new ALAdapterS10S0100000_13(constraintProperty, 1));
        }
        valueAnimator.addUpdateListener(new AUListenerS100S0100000_13(constraintProperty, 4));
        valueAnimator.start();
    }
}
