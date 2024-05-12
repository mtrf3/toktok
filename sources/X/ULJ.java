package X;

import Y.ALAdapterS3S0300000_5;
import Y.AUListenerS102S0200000_13;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.watch.StartClearScreenEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ULJ extends DataChannelSceneObserver<C29717BlR, StartClearScreenEvent> {
    public final C5H3 LIZ;
    public C29717BlR LIZIZ;
    public final /* synthetic */ ULG LIZJ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<StartClearScreenEvent> getType() {
        return StartClearScreenEvent.class;
    }

    public final ValueAnimator LIZ() {
        return (ValueAnimator) this.LIZ.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ULJ(C1O4 c1o4, ULG ulg) {
        super(false, 1, null);
        this.LIZJ = ulg;
        this.LIZ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(c1o4, 7));
    }

    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
    public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.dispose(context, constraintProperty);
        if (this.LIZJ.LIZIZ) {
            constraintProperty.forceHasOverlappingRenderingCompat(true);
        }
        constraintProperty.translationX(0.0f);
        constraintProperty.alpha(1.0f);
        LIZ().cancel();
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C29717BlR c29717BlR) {
        float width;
        C29717BlR value = c29717BlR;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        C29717BlR c29717BlR2 = this.LIZIZ;
        if (c29717BlR2 != null && c29717BlR2.LIZ == value.LIZ) {
            return;
        }
        this.LIZIZ = value;
        LIZ().cancel();
        LIZ().removeAllUpdateListeners();
        C16880lQ.LJLJL(LIZ());
        if (value.LIZ) {
            LIZ().cancel();
            ValueAnimator LIZ = LIZ();
            float[] fArr = new float[2];
            fArr[0] = constraintProperty.translationX();
            if (C16310kV.LIZLLL(layeredElementContext.getContainer()) == 1) {
                width = -layeredElementContext.getContainer().getWidth();
            } else {
                width = layeredElementContext.getContainer().getWidth();
            }
            fArr[1] = width;
            LIZ.setFloatValues(fArr);
            LIZ().addListener(new ALAdapterS3S0300000_5(value, this.LIZJ, constraintProperty, 0));
        } else {
            LIZ().setFloatValues(constraintProperty.translationX(), 0.0f);
            LIZ().addListener(new ALAdapterS3S0300000_5(value, this.LIZJ, constraintProperty, 1));
        }
        LIZ().addUpdateListener(new AUListenerS102S0200000_13(constraintProperty, layeredElementContext, 0));
        LIZ().start();
    }
}
