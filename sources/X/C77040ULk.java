package X;

import Y.AUListenerS100S0100000_13;
import android.animation.Animator;
import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.AnimationInfo;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.ULk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77040ULk extends AnimationInfo {
    public final ULA LIZ;
    public final C5H3 LIZIZ;
    public final C5H3 LIZJ;

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        CVQ cvq = (CVQ) this.LIZ.getContainer().findViewById(R.id.krk);
        Object value = this.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-hideAnimator>(...)");
        ValueAnimator valueAnimator = (ValueAnimator) value;
        valueAnimator.addUpdateListener(new AUListenerS100S0100000_13(cvq, 15));
        return valueAnimator;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateShowAnimator(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        CVQ cvq = (CVQ) this.LIZ.getContainer().findViewById(R.id.krk);
        Object value = this.LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-showAnimator>(...)");
        ValueAnimator valueAnimator = (ValueAnimator) value;
        valueAnimator.addUpdateListener(new AUListenerS100S0100000_13(cvq, 16));
        return valueAnimator;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onHideAnimationEnd(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        constraintProperty.visibility(8);
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onShowAnimationStart(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        constraintProperty.visibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77040ULk(int i, ULA portraitLayeredElementContext) {
        super(i, portraitLayeredElementContext);
        o.LJIIIZ(portraitLayeredElementContext, "portraitLayeredElementContext");
        this.LIZ = portraitLayeredElementContext;
        this.LIZIZ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 47));
        this.LIZJ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 46));
    }
}
