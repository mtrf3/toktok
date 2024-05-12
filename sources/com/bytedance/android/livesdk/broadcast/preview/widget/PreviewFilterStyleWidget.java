package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C11040c0;
import X.C15380j0;
import X.C30901Je;
import X.C30911Jf;
import X.C47121t6;
import X.C5H3;
import X.C73943T0h;
import X.C78996UzQ;
import Y.AfS57S0100000_5;
import Y.IDAListenerS232S0100000_5;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;

/* loaded from: classes6.dex */
public final class PreviewFilterStyleWidget extends PreviewWidget {
    public View LJLJI;
    public View LJLJJI;
    public C47121t6 LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public final C5H3 LJLJLJ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 134));
    public final C5H3 LJLJLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 135));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.cv0;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (this.LJLJL) {
            super.show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        super.LJZ();
        View view = getView();
        if (view != null) {
            view.clearAnimation();
        }
        this.LJLJL = false;
        hide();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        this.LJLJI = findViewById(R.id.na7);
        this.LJLJJI = findViewById(R.id.na8);
        this.LJLJJL = (C47121t6) findViewById(R.id.d_d);
        this.LJLJJLL = C15380j0.LJIIL();
        C73943T0h.LIZ().LIZJ(this, C11040c0.class).LIZIZ(new AfS57S0100000_5(this, 220));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        View view = getView();
        if (view != null) {
            view.clearAnimation();
        }
    }

    public final AnimationSet LL(boolean z) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        C47121t6 c47121t6 = this.LJLJJL;
        if (c47121t6 != null) {
            i = c47121t6.getWidth();
        } else {
            i = 0;
        }
        int i2 = (this.LJLJJLL - i) / 2;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new C30911Jf());
        alphaAnimation.setDuration(300L);
        if (z) {
            f = -i2;
        } else {
            f = i2;
        }
        float f6 = -50.0f;
        if (z) {
            f2 = -50.0f;
        } else {
            f2 = 50.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f, f2, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new C30911Jf());
        translateAnimation.setDuration(300L);
        if (z) {
            f3 = -50.0f;
            f4 = 50.0f;
        } else {
            f3 = 50.0f;
            f4 = -50.0f;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(f3, f4, 0.0f, 0.0f);
        translateAnimation2.setInterpolator(new LinearInterpolator());
        translateAnimation2.setStartOffset(300L);
        translateAnimation2.setDuration(200L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(500L);
        alphaAnimation2.setInterpolator(new C30901Je());
        alphaAnimation2.setDuration(300L);
        if (z) {
            f6 = 50.0f;
            f5 = i2;
        } else {
            f5 = -i2;
        }
        TranslateAnimation translateAnimation3 = new TranslateAnimation(f6, f5, 0.0f, 0.0f);
        translateAnimation3.setStartOffset(500L);
        translateAnimation3.setInterpolator(new C30901Je());
        translateAnimation3.setDuration(300L);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.addAnimation(translateAnimation3);
        animationSet.setAnimationListener(new IDAListenerS232S0100000_5(this, 6));
        return animationSet;
    }

    public final void LLF(String str, boolean z) {
        Animation animation;
        Animation animation2;
        if (!this.isViewValid || str == null || str.length() == 0) {
            return;
        }
        C47121t6 c47121t6 = this.LJLJJL;
        if (c47121t6 != null) {
            c47121t6.setText(str);
        }
        View view = getView();
        if (view != null) {
            view.clearAnimation();
        }
        if (C15380j0.LJIIZILJ()) {
            View view2 = getView();
            if (view2 == null) {
                return;
            }
            if (z) {
                animation2 = (Animation) this.LJLJLLL.getValue();
            } else {
                animation2 = (Animation) this.LJLJLJ.getValue();
            }
            view2.startAnimation(animation2);
            return;
        }
        View view3 = getView();
        if (view3 == null) {
            return;
        }
        if (z) {
            animation = (Animation) this.LJLJLJ.getValue();
        } else {
            animation = (Animation) this.LJLJLLL.getValue();
        }
        view3.startAnimation(animation);
    }
}
