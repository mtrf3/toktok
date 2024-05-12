package X;

import Y.IDRunnableS85S0100000;
import Y.IDUListenerS263S0100000;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.VelocityTracker;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a1;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30061Fy extends ConstraintLayout {
    public C0J5 LJLIL;
    public boolean LJLILLLLZI;
    public final float LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public boolean LJLJL;
    public InterfaceC30182Bsw LJLJLJ;
    public VelocityTracker LJLJLLL;
    public final C5H3 LJLL;
    public final C5H3 LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public InterfaceC88472Yns<? super Float, C76800UCe> LJLLL;
    public InterfaceC65784Pro<Boolean> LJLLLL;

    private final ObjectAnimator getForceCloseAnimator() {
        return (ObjectAnimator) this.LJLL.getValue();
    }

    private final ObjectAnimator getForceOpenAnimator() {
        return (ObjectAnimator) this.LJLLI.getValue();
    }

    public final void LJJLJLI() {
        LJJZZI();
        getForceCloseAnimator().start();
    }

    public final void LJJZ() {
        LJJZZI();
        getForceOpenAnimator().start();
    }

    public final void LJJZZI() {
        if (getForceCloseAnimator().isRunning()) {
            getForceCloseAnimator().cancel();
        }
        if (getForceOpenAnimator().isRunning()) {
            getForceOpenAnimator().cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLJLLL = VelocityTracker.obtain();
        post(new IDRunnableS85S0100000(this, 47));
        this.LJLILLLLZI = C15380j0.LJIIZILJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.LJLJLLL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.LJLJLLL = null;
    }

    public final InterfaceC65784Pro<Boolean> getOnScrollInterceptor() {
        return this.LJLLLL;
    }

    public final InterfaceC88472Yns<Float, C76800UCe> getOnScrollListener() {
        return this.LJLLL;
    }

    public final boolean getShouldHandleMove() {
        return this.LJLLILLLL;
    }

    public final void setDownTouched(boolean z) {
        this.LJLLJ = z;
    }

    public final void setGestureDetectLayout(InterfaceC30182Bsw interfaceC30182Bsw) {
        this.LJLJLJ = interfaceC30182Bsw;
    }

    public final void setOnScrollInterceptor(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LJLLLL = interfaceC65784Pro;
    }

    public final void setOnScrollListener(InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns) {
        this.LJLLL = interfaceC88472Yns;
    }

    public final void setShouldHandleMove(boolean z) {
        this.LJLLILLLL = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30061Fy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public final void LJJLL(long j, boolean z) {
        final float f;
        C0J5 c0j5 = this.LJLIL;
        C0J5 c0j52 = C0J5.DISMISS;
        if (c0j5 == c0j52) {
            return;
        }
        if (this.LJLILLLLZI) {
            f = this.LJLJI;
        } else {
            f = -this.LJLJI;
        }
        if (z) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(this, (Property<C30061Fy, Float>) View.TRANSLATION_X, f).setDuration(j);
            duration.addUpdateListener(new IDUListenerS263S0100000(this, 30));
            duration.addListener(new C75742To2() { // from class: X.1UG
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    InterfaceC88472Yns<Float, C76800UCe> onScrollListener = C30061Fy.this.getOnScrollListener();
                    if (onScrollListener != null) {
                        onScrollListener.invoke(Float.valueOf(f));
                    }
                }
            });
            duration.start();
        } else {
            setTranslationX(f);
            InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns = this.LJLLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Float.valueOf(getTranslationX()));
            }
        }
        this.LJLIL = c0j52;
        this.LJLJL = false;
        this.LJLLJ = false;
    }

    public final void LJJZZIII(long j, boolean z) {
        C0J5 c0j5 = this.LJLIL;
        C0J5 c0j52 = C0J5.SHOWING;
        if (c0j5 == c0j52) {
            return;
        }
        if (z) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(this, (Property<C30061Fy, Float>) View.TRANSLATION_X, 0.0f).setDuration(j);
            duration.addUpdateListener(new IDUListenerS263S0100000(this, 31));
            duration.addListener(new C75742To2() { // from class: X.1UH
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    InterfaceC88472Yns<Float, C76800UCe> onScrollListener = C30061Fy.this.getOnScrollListener();
                    if (onScrollListener != null) {
                        onScrollListener.invoke(Float.valueOf(0.0f));
                    }
                }
            });
            duration.start();
        } else {
            setTranslationX(0.0f);
            InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns = this.LJLLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Float.valueOf(getTranslationX()));
            }
        }
        this.LJLIL = c0j52;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30061Fy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = C0J5.DISMISS;
        this.LJLJI = C15380j0.LJIIL();
        this.LJLL = C78996UzQ.LJJIJIIJI(new IDqS420S0100000(this, 33));
        this.LJLLI = C78996UzQ.LJJIJIIJI(new IDqS420S0100000(this, 34));
        this.LJLLILLLL = true;
    }
}
