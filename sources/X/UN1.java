package X;

import Y.AUListenerS100S0100000_13;
import android.animation.Animator;
import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.AnimationInfo;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UN1 extends AnimationInfo {
    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new AUListenerS100S0100000_13(constraintProperty, 71));
        return ofFloat;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateShowAnimator(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new AUListenerS100S0100000_13(constraintProperty, 72));
        return ofFloat;
    }

    public UN1(int i, LayeredElementContext layeredElementContext) {
        super(i, layeredElementContext);
    }
}
