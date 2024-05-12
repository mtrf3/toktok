package X;

import Y.ALAdapterS10S0100000_13;
import Y.ALAdapterS10S0200000_13;
import Y.AUListenerS100S0100000_13;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UKu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77024UKu extends DataChannelSceneObserver<C30744C4u, ProgrammedLiveMenuVisibilityChannel> {
    public final C5H3 LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<ProgrammedLiveMenuVisibilityChannel> getType() {
        return ProgrammedLiveMenuVisibilityChannel.class;
    }

    public C77024UKu(UL8 ul8) {
        super(false);
        this.LIZ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(ul8, 558));
    }

    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
    public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.dispose(context, constraintProperty);
        constraintProperty.alpha(1.0f);
        constraintProperty.translationY(0.0f);
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
            valueAnimator.setFloatValues(constraintProperty.alpha(), 0.0f);
            valueAnimator.addListener(new ALAdapterS10S0200000_13(constraintProperty, layeredElementContext, 21));
        } else {
            valueAnimator.setFloatValues(constraintProperty.alpha(), 1.0f);
            valueAnimator.addListener(new ALAdapterS10S0100000_13(constraintProperty, 51));
        }
        valueAnimator.addUpdateListener(new AUListenerS100S0100000_13(constraintProperty, 96));
        valueAnimator.start();
    }
}
