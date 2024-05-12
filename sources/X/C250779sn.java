package X;

import Y.IDAListenerS2S0110000_4;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* renamed from: X.9sn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public class C250779sn extends FrameLayout {
    public final Context LJLIL;
    public float LJLILLLLZI;
    public View LJLJI;
    public InterfaceC250789so LJLJJI;
    public VelocityTracker LJLJJL;
    public ObjectAnimator LJLJJLL;
    public InterfaceC250629sY LJLJL;

    public void setAnimationListener(InterfaceC250769sm interfaceC250769sm) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLJJL = VelocityTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.LJLJJL;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.LJLJJL.recycle();
            this.LJLJJL = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC250629sY interfaceC250629sY = this.LJLJL;
        if (interfaceC250629sY != null) {
            interfaceC250629sY.LJIIIIZZ(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LJLILLLLZI = motionEvent.getY();
            return false;
        }
        if (motionEvent.getAction() != 2 || this.LJLILLLLZI - motionEvent.getY() <= ViewConfiguration.get(this.LJLIL).getScaledTouchSlop()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.LJLJJL.addMovement(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.LJLILLLLZI = motionEvent.getY();
        }
        boolean z = false;
        if (motionEvent.getAction() == 2) {
            View view = this.LJLJI;
            if ((view == null || view.getTranslationY() <= 0.0f) && !onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            this.LJLJI.setTranslationY((int) Math.min(0.0f, motionEvent.getY() - this.LJLILLLLZI));
        } else if (motionEvent.getAction() == 1) {
            float translationY = this.LJLJI.getTranslationY();
            if (Math.abs(this.LJLJI.getTranslationY() / this.LJLJI.getHeight()) > 0.3f) {
                z = true;
            }
            LIZ(translationY, z);
        }
        return true;
    }

    public void setInternalTouchEventListener(InterfaceC250629sY interfaceC250629sY) {
        this.LJLJL = interfaceC250629sY;
    }

    public void setPullUpListener(InterfaceC250789so interfaceC250789so) {
        this.LJLJJI = interfaceC250789so;
    }

    public C250779sn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = context;
        this.LJLJJL = VelocityTracker.obtain();
    }

    public final void LIZ(float f, boolean z) {
        long j;
        if (this.LJLJI != null) {
            this.LJLJJL.computeCurrentVelocity(2);
            long j2 = 300;
            if (z) {
                if (this.LJLJJL.getYVelocity() != 0.0f) {
                    j = (this.LJLJI.getHeight() + f) / Math.abs(this.LJLJJL.getYVelocity());
                } else {
                    j = 300;
                }
                this.LJLJJLL = ObjectAnimator.ofFloat(this.LJLJI, "translationY", f, -r8.getHeight());
            } else {
                if (this.LJLJJL.getYVelocity() != 0.0f) {
                    j = f / Math.abs(this.LJLJJL.getYVelocity());
                } else {
                    j = 300;
                }
                this.LJLJJLL = ObjectAnimator.ofFloat(this.LJLJI, "translationY", f, 0.0f);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (Math.abs(j) <= 300) {
                j2 = Math.abs(j);
            }
            animatorSet.setDuration(j2);
            animatorSet.play(this.LJLJJLL);
            animatorSet.addListener(new IDAListenerS2S0110000_4(this, z, 0));
            animatorSet.start();
        }
    }
}
