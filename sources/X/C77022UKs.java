package X;

import Y.ALAdapterS10S0100000_13;
import Y.ALAdapterS10S0200000_13;
import Y.AUListenerS100S0100000_13;
import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import kotlin.jvm.internal.o;

/* renamed from: X.UKs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77022UKs extends RxBusSceneObserver<BNL> {
    public final int LIZ;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LIZIZ;
    public ValueAnimator LIZJ;
    public boolean LIZLLL;

    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
    public final Class<BNL> getType() {
        return BNL.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C77022UKs(int i, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LIZ = i;
        this.LIZIZ = interfaceC88472Yns;
    }

    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
    public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.dispose(context, constraintProperty);
        this.LIZLLL = false;
        ValueAnimator valueAnimator = this.LIZJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        constraintProperty.alpha(1.0f);
        constraintProperty.translationY(0.0f);
    }

    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, BNL bnl) {
        BNL value = bnl;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        boolean z = value.LIZ.get(this.LIZ);
        if (z == this.LIZLLL) {
            return;
        }
        this.LIZLLL = z;
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LIZIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(z));
        }
        ValueAnimator valueAnimator = this.LIZJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LIZJ;
        if (valueAnimator2 != null) {
            C16880lQ.LJLJL(valueAnimator2);
        }
        ValueAnimator valueAnimator3 = this.LIZJ;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        if (value.LIZJ) {
            if (z) {
                constraintProperty.alpha(0.0f);
                constraintProperty.translationY(layeredElementContext.getContainer().getHeight());
                return;
            } else {
                constraintProperty.alpha(1.0f);
                constraintProperty.translationY(0.0f);
                return;
            }
        }
        if (this.LIZJ == null) {
            ValueAnimator valueAnimator4 = new ValueAnimator();
            valueAnimator4.setDuration(layeredElementContext.getAnimationDuration());
            this.LIZJ = valueAnimator4;
        }
        if (z) {
            ValueAnimator valueAnimator5 = this.LIZJ;
            if (valueAnimator5 != null) {
                valueAnimator5.setFloatValues(constraintProperty.alpha(), 0.0f);
                valueAnimator5.addUpdateListener(new AUListenerS100S0100000_13(constraintProperty, 94));
                valueAnimator5.addListener(new ALAdapterS10S0200000_13(constraintProperty, layeredElementContext, 20));
            }
        } else {
            ValueAnimator valueAnimator6 = this.LIZJ;
            if (valueAnimator6 != null) {
                valueAnimator6.setFloatValues(constraintProperty.alpha(), 1.0f);
                valueAnimator6.addUpdateListener(new AUListenerS100S0100000_13(constraintProperty, 95));
                valueAnimator6.addListener(new ALAdapterS10S0100000_13(constraintProperty, 50));
            }
        }
        ValueAnimator valueAnimator7 = this.LIZJ;
        if (valueAnimator7 == null) {
            return;
        }
        valueAnimator7.start();
    }
}
