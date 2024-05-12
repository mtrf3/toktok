package X;

import Y.IDAListenerS77S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class LU7 extends FrameLayout {
    public final C62822Ol8 LJLIL;
    public final AnimatorSet LJLILLLLZI;
    public final AnimatorSet LJLJI;
    public boolean LJLJJI;

    public abstract View LIZ();

    public final void LIZIZ() {
        if (!this.LJLJJI) {
            return;
        }
        this.LJLJJI = false;
        if (this.LJLILLLLZI.isRunning()) {
            this.LJLILLLLZI.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", getTranslationY(), getHeight());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f);
        this.LJLJI.setDuration(200L);
        this.LJLJI.setInterpolator(new SJM());
        this.LJLJI.play(ofFloat).with(ofFloat2);
        this.LJLJI.start();
        this.LJLJI.addListener(new IDAListenerS77S0100000_9(this, 12));
    }

    public final void LIZJ() {
        if (this.LJLJJI) {
            return;
        }
        this.LJLJJI = true;
        if (this.LJLJI.isRunning()) {
            this.LJLJI.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", getTranslationY(), -KL2.LIZJ(getContext(), 16.0f));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f);
        this.LJLILLLLZI.setDuration(200L);
        this.LJLILLLLZI.setInterpolator(new SJJ());
        this.LJLILLLLZI.play(ofFloat).with(ofFloat2);
        setVisibility(0);
        this.LJLILLLLZI.start();
    }

    public final View getView() {
        return (View) this.LJLIL.getValue();
    }

    public final void setShow(boolean z) {
        this.LJLJJI = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LU7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LU7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 841));
        this.LJLILLLLZI = new AnimatorSet();
        this.LJLJI = new AnimatorSet();
    }
}
