package com.bytedance.ies.sdk.widgets;

import X.C16880lQ;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class AnimationInfo {
    public Animator hideAnimator;
    public final int id;
    public final LayeredElementContext layeredElementContext;
    public Animator showAnimator;

    public Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        return null;
    }

    public Animator onCreateShowAnimator(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
        return null;
    }

    public void onHideAnimationEnd(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
    }

    public void onHideAnimationStart(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
    }

    public void onShowAnimationEnd(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
    }

    public void onShowAnimationStart(ConstraintProperty constraintProperty) {
        o.LJIIIZ(constraintProperty, "constraintProperty");
    }

    public final void animateHide() {
        Animator animator = this.hideAnimator;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.hideAnimator;
        if (animator2 != null) {
            C16880lQ.LJLJJI(animator2);
        }
        ConstraintProperty constraintPropertyById = this.layeredElementContext.getConstraintPropertyById(this.id);
        if (constraintPropertyById != null) {
            Animator onCreateHideAnimator = onCreateHideAnimator(constraintPropertyById);
            if (onCreateHideAnimator != null) {
                onCreateHideAnimator.setDuration(this.layeredElementContext.getAnimationDuration());
                onCreateHideAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.ies.sdk.widgets.AnimationInfo$animateHide$1$1$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                        super.onAnimationEnd(animation);
                        AnimationInfo.this.hideAnimationEnd();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                        super.onAnimationStart(animation);
                        AnimationInfo.this.hideAnimationStart();
                    }
                });
                onCreateHideAnimator.start();
            } else {
                onCreateHideAnimator = null;
            }
            this.hideAnimator = onCreateHideAnimator;
        }
    }

    public final void animateShow() {
        Animator animator = this.showAnimator;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.showAnimator;
        if (animator2 != null) {
            C16880lQ.LJLJJI(animator2);
        }
        ConstraintProperty constraintPropertyById = this.layeredElementContext.getConstraintPropertyById(this.id);
        if (constraintPropertyById != null) {
            Animator onCreateShowAnimator = onCreateShowAnimator(constraintPropertyById);
            if (onCreateShowAnimator != null) {
                onCreateShowAnimator.setDuration(this.layeredElementContext.getAnimationDuration());
                onCreateShowAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.ies.sdk.widgets.AnimationInfo$animateShow$1$1$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                        super.onAnimationEnd(animation);
                        AnimationInfo.this.showAnimationEnd();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                        super.onAnimationStart(animation);
                        AnimationInfo.this.showAnimationStart();
                    }
                });
                onCreateShowAnimator.start();
            } else {
                onCreateShowAnimator = null;
            }
            this.showAnimator = onCreateShowAnimator;
        }
    }

    public final void cancelHideAnimation() {
        Animator animator;
        Animator animator2 = this.hideAnimator;
        if (animator2 != null && animator2.isRunning() && (animator = this.hideAnimator) != null) {
            animator.cancel();
        }
    }

    public final void cancelShowAnimation() {
        Animator animator;
        Animator animator2 = this.showAnimator;
        if (animator2 != null && animator2.isRunning() && (animator = this.showAnimator) != null) {
            animator.cancel();
        }
    }

    public final void hideAnimationEnd() {
        this.layeredElementContext.notifyHideAnimationEnd$live_widget_release(this.id);
        ConstraintProperty constraintPropertyById = this.layeredElementContext.getConstraintPropertyById(this.id);
        if (constraintPropertyById != null) {
            onHideAnimationEnd(constraintPropertyById);
        }
    }

    public final void hideAnimationStart() {
        this.layeredElementContext.notifyHideAnimationStart$live_widget_release(this.id);
        ConstraintProperty constraintPropertyById = this.layeredElementContext.getConstraintPropertyById(this.id);
        if (constraintPropertyById != null) {
            onHideAnimationStart(constraintPropertyById);
        }
    }

    public final void showAnimationEnd() {
        this.layeredElementContext.notifyShowAnimationEnd$live_widget_release(this.id);
        ConstraintProperty constraintPropertyById = this.layeredElementContext.getConstraintPropertyById(this.id);
        if (constraintPropertyById != null) {
            onShowAnimationEnd(constraintPropertyById);
        }
    }

    public final void showAnimationStart() {
        this.layeredElementContext.notifyShowAnimationStart$live_widget_release(this.id);
        ConstraintProperty constraintPropertyById = this.layeredElementContext.getConstraintPropertyById(this.id);
        if (constraintPropertyById != null) {
            onShowAnimationStart(constraintPropertyById);
        }
    }

    public final int getId() {
        return this.id;
    }

    public final LayeredElementContext getLayeredElementContext() {
        return this.layeredElementContext;
    }

    public AnimationInfo(int i, LayeredElementContext layeredElementContext) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        this.id = i;
        this.layeredElementContext = layeredElementContext;
    }
}
