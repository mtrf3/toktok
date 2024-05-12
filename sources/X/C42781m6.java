package X;

import Y.IDUListenerS263S0100000;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.dataChannel.LiveInputProgressEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1m6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42781m6 extends ElementSpecImpl {
    public final C1O4 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42781m6(C1O4 baseLayeredElementContext) {
        super(C12960f6.LIZIZ);
        o.LJIIIZ(baseLayeredElementContext, "baseLayeredElementContext");
        this.LJLIL = baseLayeredElementContext;
        addSceneObserver(new RxBusSceneObserver<B4Q>() { // from class: X.1m4
            public final C5H3 LIZ;

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final Class<B4Q> getType() {
                return B4Q.class;
            }

            public final ValueAnimator LIZ() {
                return (ValueAnimator) this.LIZ.getValue();
            }

            {
                this.LIZ = C78996UzQ.LJJIJIIJI(new IDqS420S0100000(C42781m6.this, 119));
            }

            @Override // com.bytedance.ies.sdk.widgets.SceneObserver
            public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
                o.LJIIIZ(context, "context");
                o.LJIIIZ(constraintProperty, "constraintProperty");
                super.dispose(context, constraintProperty);
                constraintProperty.translationY(0.0f);
                LIZ().cancel();
            }

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, B4Q b4q) {
                B4Q value = b4q;
                o.LJIIIZ(layeredElementContext, "layeredElementContext");
                o.LJIIIZ(constraintProperty, "constraintProperty");
                o.LJIIIZ(value, "value");
                if (value.LIZLLL) {
                    return;
                }
                LIZ().cancel();
                LIZ().removeAllUpdateListeners();
                ValueAnimator LIZ = LIZ();
                float[] fArr = new float[2];
                fArr[0] = constraintProperty.translationY();
                float f = value.LIZ;
                C42781m6 c42781m6 = C42781m6.this;
                if (f > 0.0f) {
                    f += Math.abs(c42781m6.LJLIL.LJIIJJI - value.LIZJ);
                }
                fArr[1] = -f;
                LIZ.setFloatValues(fArr);
                LIZ().addUpdateListener(new IDUListenerS263S0100000(constraintProperty, 28));
                LIZ().start();
            }
        });
        addSceneObserver(new DataChannelSceneObserver<C31093CIf, LiveInputProgressEvent>() { // from class: X.1m5
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<LiveInputProgressEvent> getType() {
                return LiveInputProgressEvent.class;
            }

            {
                super(false);
            }

            @Override // com.bytedance.ies.sdk.widgets.SceneObserver
            public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
                o.LJIIIZ(context, "context");
                o.LJIIIZ(constraintProperty, "constraintProperty");
                super.dispose(context, constraintProperty);
                constraintProperty.translationY(0.0f);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C31093CIf c31093CIf) {
                int abs;
                C31093CIf value = c31093CIf;
                o.LJIIIZ(layeredElementContext, "layeredElementContext");
                o.LJIIIZ(constraintProperty, "constraintProperty");
                o.LJIIIZ(value, "value");
                float f = value.LIZ;
                C42781m6 c42781m6 = C42781m6.this;
                if (f > 0.0f) {
                    int i = value.LIZJ;
                    if (i > 0) {
                        float f2 = f / (i * 1.0f);
                        if (C29306Beo.LJIL(Boolean.valueOf(value.LIZLLL)) && f2 < 0.3d) {
                            f = (f + Math.abs(c42781m6.LJLIL.LJIIJJI - value.LIZIZ)) * f2 * 2;
                        } else {
                            abs = Math.abs(c42781m6.LJLIL.LJIIJJI - value.LIZIZ);
                        }
                    } else {
                        abs = Math.abs(c42781m6.LJLIL.LJIIJJI - value.LIZIZ);
                    }
                    f += abs;
                }
                constraintProperty.translationY(-f);
            }
        });
    }
}
