package com.ss.android.ugc.aweme.ecommerce.gallery.transfer;

import X.C80841Vo5;
import Y.IDAListenerS81S0100000_14;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.viewpager.widget.PagerAdapter;

/* loaded from: classes15.dex */
public final class BounceBackViewPager$OverScrollEffect {
    public Animator mAnimator;
    public float mOverscroll;
    public final /* synthetic */ C80841Vo5 this$0;

    public final boolean isOverScrolling() {
        PagerAdapter adapter = this.this$0.getAdapter();
        if (adapter == null) {
            return false;
        }
        if (this.this$0.LLJJLIIIJLLLLLLLZ == 0 && this.mOverscroll < 0.0f) {
            return true;
        }
        if (adapter.getCount() - 1 != this.this$0.LLJJLIIIJLLLLLLLZ || this.mOverscroll <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void onRelease() {
        Animator animator = this.mAnimator;
        if (animator != null && animator.isRunning()) {
            Animator animator2 = this.mAnimator;
            if (animator2 != null) {
                animator2.addListener(new IDAListenerS81S0100000_14(this, 3));
            }
            Animator animator3 = this.mAnimator;
            if (animator3 != null) {
                animator3.cancel();
                return;
            }
            return;
        }
        startAnimation(0.0f);
    }

    public final float getMOverscroll() {
        return this.mOverscroll;
    }

    public BounceBackViewPager$OverScrollEffect(C80841Vo5 c80841Vo5) {
        this.this$0 = c80841Vo5;
    }

    public final void setMOverscroll(float f) {
        this.mOverscroll = f;
    }

    public final void setPull(float f) {
        this.mOverscroll = f;
        C80841Vo5 c80841Vo5 = this.this$0;
        int childCount = c80841Vo5.getChildCount();
        for (int i = 0; i < childCount; i++) {
            c80841Vo5.getChildAt(i).invalidate();
        }
    }

    public final void startAnimation(float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "pull", this.mOverscroll, f);
        this.mAnimator = ofFloat;
        if (ofFloat != null) {
            ofFloat.setInterpolator(new DecelerateInterpolator());
        }
        float abs = Math.abs(f - this.mOverscroll);
        Animator animator = this.mAnimator;
        if (animator != null) {
            animator.setDuration(this.this$0.getOverScrollAnimationDuration() * abs);
        }
        Animator animator2 = this.mAnimator;
        if (animator2 != null) {
            animator2.start();
        }
    }
}
