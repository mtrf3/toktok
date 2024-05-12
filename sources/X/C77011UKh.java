package X;

import Y.ALAdapterS3S0300000_5;
import Y.ALAdapterS4S0200000_5;
import Y.AUListenerS94S0100000_5;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UKh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77011UKh extends DataChannelSceneObserver<C30744C4u, ProgrammedLiveMenuVisibilityChannel> {
    public final C5H3 LIZ;
    public final /* synthetic */ UL8 LIZIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<ProgrammedLiveMenuVisibilityChannel> getType() {
        return ProgrammedLiveMenuVisibilityChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77011UKh(UL8 ul8) {
        super(false);
        this.LIZIZ = ul8;
        this.LIZ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(ul8, 557));
    }

    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
    public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
        float LJIIJJI;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.dispose(context, constraintProperty);
        if (CCJ.LIZ(this.LIZIZ.getContext())) {
            LJIIJJI = -C15380j0.LJIIJJI();
        } else {
            LJIIJJI = C15380j0.LJIIJJI();
        }
        constraintProperty.translationX(LJIIJJI);
        C73943T0h.LIZ().LIZIZ(new C30743C4t(false, null));
        ((ValueAnimator) this.LIZ.getValue()).cancel();
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C30744C4u c30744C4u) {
        float LJIIJJI;
        C30744C4u value = c30744C4u;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        ValueAnimator valueAnimator = (ValueAnimator) this.LIZ.getValue();
        valueAnimator.cancel();
        C16880lQ.LJLJL(valueAnimator);
        valueAnimator.removeAllUpdateListeners();
        if (value.LIZ) {
            valueAnimator.setFloatValues(constraintProperty.translationX(), 0.0f);
            valueAnimator.addListener(new ALAdapterS4S0200000_5(value, constraintProperty, 25));
        } else {
            float[] fArr = new float[2];
            fArr[0] = constraintProperty.translationX();
            if (CCJ.LIZ(layeredElementContext.getContext())) {
                LJIIJJI = -C15380j0.LJIIJJI();
            } else {
                LJIIJJI = C15380j0.LJIIJJI();
            }
            fArr[1] = LJIIJJI;
            valueAnimator.setFloatValues(fArr);
            valueAnimator.addListener(new ALAdapterS3S0300000_5(constraintProperty, layeredElementContext, value, 5));
        }
        valueAnimator.addUpdateListener(new AUListenerS94S0100000_5(constraintProperty, 69));
        valueAnimator.start();
    }
}
