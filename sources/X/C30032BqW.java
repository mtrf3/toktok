package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.BqW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30032BqW implements Animator.AnimatorListener {
    public final /* synthetic */ TextView LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, 50.0f, 0.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(TRANSLATION_X, 50f, 0f)");
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f);
        o.LJIIIIZZ(ofFloat2, "ofFloat(ALPHA, 0f, 1f)");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.LJLIL, ofFloat, ofFloat2);
        o.LJIIIIZZ(ofPropertyValuesHolder, "ofPropertyValuesHolder(view, holderX, holderAlpha)");
        ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        ofPropertyValuesHolder.setDuration(200L);
        TextView textView = this.LJLIL;
        if (textView != null) {
            textView.setText(this.LJLILLLLZI);
        }
        ofPropertyValuesHolder.start();
    }

    public C30032BqW(TuxTextView tuxTextView, String str) {
        this.LJLIL = tuxTextView;
        this.LJLILLLLZI = str;
    }
}
