package X;

import Y.AUListenerS100S0100000_13;
import android.animation.Animator;
import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.AnimationInfo;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.ULs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77048ULs extends AnimationInfo {
    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new AUListenerS100S0100000_13(constraintProperty, 73));
        return ofFloat;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateShowAnimator(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(-C15380j0.LIZ(126.0f), 0.0f);
        ofFloat.addUpdateListener(new AUListenerS100S0100000_13(constraintProperty, 74));
        return ofFloat;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onHideAnimationStart(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.onHideAnimationStart(constraintProperty);
        constraintProperty.translationY(0.0f);
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onShowAnimationStart(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.onShowAnimationStart(constraintProperty);
        constraintProperty.alpha(1.0f);
    }

    public C77048ULs(int i, LayeredElementContext layeredElementContext) {
        super(i, layeredElementContext);
    }
}
