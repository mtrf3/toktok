package X;

import Y.IDUListenerS263S0100000;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.AnimationInfo;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ok, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32261Ok extends AnimationInfo {
    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        if (constraintProperty.getView() != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, r1.getHeight() + C15380j0.LIZ(8.0f));
            ofFloat.addUpdateListener(new IDUListenerS263S0100000(constraintProperty, 15));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.setInterpolator(C18950ol.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
            ofFloat2.addUpdateListener(new IDUListenerS263S0100000(constraintProperty, 16));
            animatorSet.playTogether(ofFloat, ofFloat2);
            return animatorSet;
        }
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateShowAnimator(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        if (constraintProperty.getView() != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getHeight() + C15380j0.LIZ(8.0f), 0.0f);
            ofFloat.addUpdateListener(new IDUListenerS263S0100000(constraintProperty, 17));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.setInterpolator(C18950ol.LIZIZ(0.42f, 0.0f, 1.0f, 1.0f));
            ofFloat2.addUpdateListener(new IDUListenerS263S0100000(constraintProperty, 18));
            animatorSet.playTogether(ofFloat, ofFloat2);
            return animatorSet;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32261Ok(int i, LayeredElementContext layeredElementContext) {
        super(i, layeredElementContext);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
    }
}
