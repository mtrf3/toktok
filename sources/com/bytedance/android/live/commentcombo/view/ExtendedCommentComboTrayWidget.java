package com.bytedance.android.live.commentcombo.view;

import X.C15380j0;
import X.C18950ol;
import X.C259610e;
import X.C37861eA;
import Y.IDLAdapterS2S0100000;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;

/* loaded from: classes.dex */
public final class ExtendedCommentComboTrayWidget extends CommentComboTrayWidget {
    public Animator LJLJLLL;
    public Animator LJLL;

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget, X.AnonymousClass148
    public final void LJJIIJ() {
        this.LJLJL = null;
        LJLZ();
        View view = getView();
        if (view != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            ofFloat.setInterpolator(C18950ol.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, view.getHeight() + C15380j0.LIZ(8.0f)), ofFloat);
            animatorSet.addListener(new IDLAdapterS2S0100000(this, 8));
            animatorSet.start();
            this.LJLL = animatorSet;
        }
    }

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.do1;
    }

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C37861eA.LJLJI = null;
        LJLZ();
        hide();
    }

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget
    public final void LJLZ() {
        Animator animator = this.LJLJLLL;
        if (animator != null && animator.isRunning()) {
            animator.cancel();
        }
        Animator animator2 = this.LJLL;
        if (animator2 != null && animator2.isRunning()) {
            animator2.cancel();
        }
        super.LJLZ();
    }

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget, X.AnonymousClass148
    public final void LJJJJZ(C259610e c259610e) {
        this.LJLJL = c259610e;
        LJLZ();
        LJZI(c259610e.LIZ, c259610e.LIZJ, c259610e.LIZLLL, c259610e.LIZIZ);
        View view = getView();
        if (view != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat.setInterpolator(C18950ol.LIZIZ(0.42f, 0.0f, 1.0f, 1.0f));
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, view.getHeight() + C15380j0.LIZ(8.0f), 0.0f), ofFloat);
            animatorSet.addListener(new IDLAdapterS2S0100000(this, 9));
            animatorSet.start();
            this.LJLJLLL = animatorSet;
        }
    }

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C37861eA.LJLJI = this;
        C37861eA.LJ();
    }
}
