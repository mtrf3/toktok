package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.58K, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C58K extends ValueAnimator {
    public final ArrayList<ValueAnimator.AnimatorUpdateListener> LJLIL = new ArrayList<>();
    public final ArrayList<Animator.AnimatorListener> LJLILLLLZI = new ArrayList<>();

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        super.removeAllListeners();
        this.LJLILLLLZI.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        super.removeAllUpdateListeners();
        this.LJLIL.clear();
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        super.addListener(animatorListener);
        if (animatorListener != null) {
            this.LJLILLLLZI.add(animatorListener);
        }
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        super.addUpdateListener(animatorUpdateListener);
        if (animatorUpdateListener != null) {
            this.LJLIL.add(animatorUpdateListener);
        }
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        super.removeListener(animatorListener);
        if (animatorListener != null) {
            this.LJLILLLLZI.remove(animatorListener);
        }
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        super.removeUpdateListener(animatorUpdateListener);
        if (animatorUpdateListener != null) {
            this.LJLIL.remove(animatorUpdateListener);
        }
    }

    @Override // android.animation.ValueAnimator
    public final void setFloatValues(float... values) {
        o.LJIIIZ(values, "values");
        super.setFloatValues(Arrays.copyOf(values, values.length));
    }

    @Override // android.animation.ValueAnimator
    public final void setIntValues(int... values) {
        o.LJIIIZ(values, "values");
        super.setIntValues(Arrays.copyOf(values, values.length));
    }
}
