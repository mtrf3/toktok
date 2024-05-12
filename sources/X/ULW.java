package X;

import Y.ALAdapterS10S0100000_13;
import Y.ALAdapterS10S0200000_13;
import Y.AUListenerS100S0100000_13;
import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ULW extends RxBusSceneObserver<BNL> {
    public Boolean LIZ;
    public final /* synthetic */ ULZ LIZIZ;

    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
    public final Class<BNL> getType() {
        return BNL.class;
    }

    public ULW(ULZ ulz) {
        this.LIZIZ = ulz;
    }

    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
    public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.dispose(context, constraintProperty);
        ValueAnimator valueAnimator = this.LIZIZ.LJLILLLLZI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        constraintProperty.margin(7, this.LIZIZ.LJLIL.LJIILL);
        constraintProperty.apply();
        this.LIZ = Boolean.TRUE;
    }

    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, BNL bnl) {
        BNL value = bnl;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        if (C30149BsP.LIZIZ(layeredElementContext.getDataChannel()) && value.LIZIZ == 1) {
            boolean z = value.LIZ.get(1, false);
            boolean z2 = !z;
            if (o.LJ(this.LIZ, Boolean.valueOf(z2))) {
                return;
            }
            this.LIZ = Boolean.valueOf(z2);
            ULZ ulz = this.LIZIZ;
            if (ulz.LJLILLLLZI == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setDuration(200L);
                valueAnimator.addUpdateListener(new AUListenerS100S0100000_13(constraintProperty, 93));
                ulz.LJLILLLLZI = valueAnimator;
            }
            ValueAnimator valueAnimator2 = this.LIZIZ.LJLILLLLZI;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                C16880lQ.LJLJL(valueAnimator2);
                if (!z) {
                    valueAnimator2.setIntValues(constraintProperty.margin(7), ((UL8) layeredElementContext).LJIILL);
                    valueAnimator2.addListener(new ALAdapterS10S0200000_13(constraintProperty, layeredElementContext, 19));
                } else {
                    valueAnimator2.setIntValues(constraintProperty.margin(7), 0);
                    valueAnimator2.addListener(new ALAdapterS10S0100000_13(constraintProperty, 49));
                }
                valueAnimator2.start();
            }
            C73943T0h.LIZ().LIZIZ(new C28166B3q(z2, true));
        }
    }
}
