package X;

import Y.IDUListenerS263S0100000;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1ly, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C42701ly extends ElementSpecImpl {
    public final C1O4 LJLIL;
    public final C5H3 LJLILLLLZI;

    public final ValueAnimator LIZIZ() {
        return (ValueAnimator) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void onDispose() {
        super.onDispose();
        if (LIZIZ().isRunning()) {
            LIZIZ().cancel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42701ly(C1O4 layeredElementContext) {
        super(R.id.eqe);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        this.LJLIL = layeredElementContext;
        this.LJLILLLLZI = C78996UzQ.LJJIJIIJI(new IDqS420S0100000(this, 115));
    }

    public final void LIZ(final ConstraintProperty constraintProperty, int i) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        int i2 = this.LJLIL.LIZLLL;
        LIZIZ().cancel();
        LIZIZ().removeAllUpdateListeners();
        C16880lQ.LJLJL(LIZIZ());
        LIZIZ().setIntValues(i, i2);
        constraintProperty.removeConstraints(4);
        constraintProperty.connect(4, R.id.apg, 3, i);
        constraintProperty.apply();
        LIZIZ().addUpdateListener(new IDUListenerS263S0100000(constraintProperty, 23));
        LIZIZ().addListener(new AnimatorListenerAdapter() { // from class: X.0f5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                super.onAnimationEnd(animation);
                ConstraintProperty.this.removeConstraints(4);
                ConstraintProperty constraintProperty2 = ConstraintProperty.this;
                constraintProperty2.connect(4, R.id.eqh, 3, this.LJLIL.LIZLLL);
                constraintProperty2.apply();
            }
        });
        LIZIZ().start();
    }
}
