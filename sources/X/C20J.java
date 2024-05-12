package X;

import Y.IDUListenerS263S0100000;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.20J, reason: invalid class name */
/* loaded from: classes.dex */
public final class C20J extends AbstractC42741m2 {
    public final LayeredElementContext LJLJJI;
    public final View LJLJJL;
    public boolean LJLJJLL;

    @Override // X.AbstractC42741m2
    public final void LIZ() {
        if (this.LJLJJLL) {
            this.LJLJJI.downElement(R.id.gi_);
            this.LJLJJI.downElement(R.id.n4b);
            this.LJLJJI.downElement(R.id.k58);
            this.LJLJJI.downElement(R.id.dn0);
            this.LJLJJLL = false;
        }
    }

    @Override // X.AbstractC42741m2
    public final void LIZIZ() {
        if (!this.LJLJJLL) {
            this.LJLJJI.upElement(R.id.gi_);
            this.LJLJJI.upElement(R.id.n4b);
            this.LJLJJI.upElement(R.id.k58);
            this.LJLJJI.upElement(R.id.dn0);
            this.LJLJJLL = true;
        }
    }

    public C20J(LayeredElementContext layeredElementContext, View view) {
        super(layeredElementContext, view);
        this.LJLJJI = layeredElementContext;
        this.LJLJJL = view;
        addSceneObserver(new RxBusSceneObserver<B4Q>() { // from class: X.1lV
            public final C5H3 LIZ;

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final Class<B4Q> getType() {
                return B4Q.class;
            }

            {
                this.LIZ = C78996UzQ.LJJIJIIJI(new IDqS420S0100000(C20J.this, 106));
            }

            @Override // com.bytedance.ies.sdk.widgets.SceneObserver
            public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
                o.LJIIIZ(context, "context");
                o.LJIIIZ(constraintProperty, "constraintProperty");
                super.dispose(context, constraintProperty);
                constraintProperty.alpha(1.0f);
                ((ValueAnimator) this.LIZ.getValue()).cancel();
                C20J.this.LJLJJL.setVisibility(8);
                C20J.this.LIZ();
            }

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, B4Q b4q) {
                B4Q value = b4q;
                o.LJIIIZ(layeredElementContext2, "layeredElementContext");
                o.LJIIIZ(constraintProperty, "constraintProperty");
                o.LJIIIZ(value, "value");
                if (value.LIZIZ) {
                    C20J.this.LJLJJL.setVisibility(0);
                    C20J.this.LIZIZ();
                } else {
                    C20J.this.LJLJJL.setVisibility(8);
                    C20J.this.LIZ();
                }
                ValueAnimator valueAnimator = (ValueAnimator) this.LIZ.getValue();
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
                C16880lQ.LJLJL(valueAnimator);
                if (value.LIZIZ) {
                    valueAnimator.setFloatValues(constraintProperty.alpha(), 0.0f);
                } else {
                    valueAnimator.setFloatValues(constraintProperty.alpha(), 1.0f);
                }
                valueAnimator.addUpdateListener(new IDUListenerS263S0100000(constraintProperty, 19));
                valueAnimator.start();
            }
        });
    }
}
