package X;

import Y.AUListenerS100S0100000_13;
import Y.AUListenerS4S0100001_13;
import android.animation.Animator;
import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.AnimationInfo;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UKf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77009UKf extends AnimationInfo {
    public final ULA LIZ;
    public final C5H3 LIZIZ;
    public final C5H3 LIZJ;

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        ValueAnimator valueAnimator = (ValueAnimator) this.LIZJ.getValue();
        valueAnimator.removeAllUpdateListeners();
        ULA ula = this.LIZ;
        int i = ula.LIZLLL;
        int dimensionPixelSize = ula.getContext().getResources().getDimensionPixelSize(R.dimen.agh);
        int i2 = this.LIZ.LJIILL - dimensionPixelSize;
        int i3 = dimensionPixelSize + i2 + i;
        constraintProperty.removeConstraints(3);
        constraintProperty.removeConstraints(4);
        constraintProperty.connect(4, 0, 4, i2);
        constraintProperty.apply();
        float alpha = constraintProperty.alpha();
        valueAnimator.setIntValues(i3, i2);
        valueAnimator.addUpdateListener(new AUListenerS4S0100001_13(constraintProperty, alpha, 0));
        return valueAnimator;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateShowAnimator(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        ValueAnimator valueAnimator = (ValueAnimator) this.LIZIZ.getValue();
        valueAnimator.removeAllUpdateListeners();
        ULA ula = this.LIZ;
        int i = ula.LIZLLL;
        int dimensionPixelSize = ula.getContext().getResources().getDimensionPixelSize(R.dimen.agh);
        int i2 = this.LIZ.LJIILL - dimensionPixelSize;
        constraintProperty.removeConstraints(3);
        constraintProperty.removeConstraints(4);
        constraintProperty.connect(4, 0, 4, i2);
        constraintProperty.apply();
        constraintProperty.alpha(0.0f);
        valueAnimator.setIntValues(i2, dimensionPixelSize + i2 + i);
        valueAnimator.addUpdateListener(new AUListenerS100S0100000_13(constraintProperty, 14));
        return valueAnimator;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onHideAnimationEnd(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.onHideAnimationEnd(constraintProperty);
        constraintProperty.removeConstraints(3);
        constraintProperty.removeConstraints(4);
        constraintProperty.connect(4, R.id.eqe, 3, 0);
        constraintProperty.apply();
        constraintProperty.alpha(1.0f);
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onShowAnimationEnd(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.onShowAnimationEnd(constraintProperty);
        constraintProperty.removeConstraints(3);
        constraintProperty.removeConstraints(4);
        constraintProperty.connect(4, R.id.eqe, 3, 0);
        constraintProperty.apply();
        constraintProperty.alpha(1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77009UKf(int i, ULA portraitLayeredElementContext) {
        super(i, portraitLayeredElementContext);
        o.LJIIIZ(portraitLayeredElementContext, "portraitLayeredElementContext");
        this.LIZ = portraitLayeredElementContext;
        this.LIZIZ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 45));
        this.LIZJ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 44));
    }
}
