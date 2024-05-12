package X;

import Y.IDLAdapterS2S0100000;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.1HK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HK extends AppCompatImageView {
    public static boolean LJLJI;
    public InterfaceC05930Ld LJLIL;
    public final AnimatorSet LJLILLLLZI;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final void setOnStateChangeListener(InterfaceC05930Ld onStateChangeListener) {
        o.LJIIIZ(onStateChangeListener, "onStateChangeListener");
        this.LJLIL = onStateChangeListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1HK(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1HK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<C1HK, Float>) View.SCALE_X, 1.0f, 1.08f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<C1HK, Float>) View.SCALE_Y, 1.0f, 1.08f);
        long j = 100;
        ofFloat.setDuration(j);
        ofFloat2.setDuration(j);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, (Property<C1HK, Float>) View.SCALE_X, 1.08f, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, (Property<C1HK, Float>) View.SCALE_Y, 1.08f, 0.0f);
        ofFloat3.setDuration(j);
        ofFloat4.setDuration(j);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, (Property<C1HK, Float>) View.ALPHA, 0.0f, 1.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, (Property<C1HK, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat6.setDuration(j);
        ofFloat5.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        this.LJLILLLLZI = animatorSet;
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).with(ofFloat6).after(ofFloat);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this, (Property<C1HK, Float>) View.SCALE_X, 0.0f, 1.08f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this, (Property<C1HK, Float>) View.SCALE_Y, 0.0f, 1.08f);
        ofFloat7.setDuration(j);
        ofFloat8.setDuration(j);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this, (Property<C1HK, Float>) View.SCALE_X, 1.08f, 1.0f);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this, (Property<C1HK, Float>) View.SCALE_Y, 1.08f, 1.0f);
        ofFloat9.setDuration(j);
        ofFloat9.setDuration(j);
        final AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat7).with(ofFloat8).with(ofFloat5);
        animatorSet2.play(ofFloat9).with(ofFloat10).after(ofFloat7);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.0Lb
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                animatorSet2.start();
                InterfaceC05930Ld interfaceC05930Ld = C1HK.this.LJLIL;
                if (interfaceC05930Ld != null) {
                    o.LJI(interfaceC05930Ld);
                    interfaceC05930Ld.LIZIZ(1);
                }
                C1HK.this.getClass();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animation) {
                o.LJIIIZ(animation, "animation");
                InterfaceC05930Ld interfaceC05930Ld = C1HK.this.LJLIL;
                if (interfaceC05930Ld != null) {
                    o.LJI(interfaceC05930Ld);
                    interfaceC05930Ld.LIZIZ(0);
                }
                C1HK.this.getClass();
            }
        });
        animatorSet2.addListener(new IDLAdapterS2S0100000(this, 4));
    }
}
