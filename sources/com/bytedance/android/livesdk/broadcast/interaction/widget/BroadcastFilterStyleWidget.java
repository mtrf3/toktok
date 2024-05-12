package com.bytedance.android.livesdk.broadcast.interaction.widget;

import X.C15380j0;
import X.C16880lQ;
import X.C29306Beo;
import X.C30791C6p;
import X.C30901Je;
import X.C30911Jf;
import X.C47121t6;
import X.C5H3;
import X.C78996UzQ;
import Y.ACListenerS40S0200000_5;
import Y.IDAListenerS232S0100000_5;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.OnFilterIndexChangeEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterLayoutStyleSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMemoryOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class BroadcastFilterStyleWidget extends LiveWidget {
    public View LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public C47121t6 LJLJJI;
    public int LJLJJL;
    public final C5H3 LJLJJLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 115));
    public final C5H3 LJLJL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 116));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.cuy;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJZ() {
        Keva repo = Keva.getRepo("live-app-core-sdk");
        if (!repo.getBoolean("has_show_filter_guide", false) && LiveCenterLayoutStyleSetting.INSTANCE.enableNewStyle() && !C30791C6p.LIZ((Room) this.dataChannel.kv0(RoomChannel.class))) {
            repo.storeBoolean("has_show_filter_guide", true);
            C29306Beo.LJJLJLI(this.LJLIL);
            C29306Beo.LJJLJLI(this.LJLILLLLZI);
            C47121t6 c47121t6 = this.LJLJJI;
            if (c47121t6 != null) {
                c47121t6.setText(C15380j0.LJIILJJIL(R.string.t19));
            }
            View view = this.LJLJI;
            if (view != null) {
                view.setClickable(true);
                view.setVisibility(0);
                C16880lQ.LJIIJ(new ACListenerS40S0200000_5(this, view, 5), view);
                return;
            }
            return;
        }
        C29306Beo.LJIIIZ(this.LJLJI);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LJLIL = findViewById(R.id.na7);
        this.LJLILLLLZI = findViewById(R.id.na8);
        View view = getView();
        this.LJLJI = view;
        C29306Beo.LJIIIZ(view);
        this.LJLJJI = (C47121t6) findViewById(R.id.d_d);
        this.LJLJJL = C15380j0.LJIIL();
        this.dataChannel.ov0(this, OnFilterIndexChangeEvent.class, new AqS171S0100000_5(this, 133));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        View view = this.LJLJI;
        if (view != null) {
            view.clearAnimation();
        }
        if (LiveMemoryOptSetting.INSTANCE.enableMemoryOpt()) {
            ((Animation) this.LJLJJLL.getValue()).cancel();
            ((Animation) this.LJLJJLL.getValue()).cancel();
        }
    }

    public final AnimationSet LJLZ(boolean z) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        C47121t6 c47121t6 = this.LJLJJI;
        if (c47121t6 != null) {
            i = c47121t6.getWidth();
        } else {
            i = 0;
        }
        int i2 = (this.LJLJJL - i) / 2;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new C30911Jf());
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new IDAListenerS232S0100000_5(this, 2));
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
        translateAnimation2.setAnimationListener(new IDAListenerS232S0100000_5(this, 4));
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
        translateAnimation3.setAnimationListener(new IDAListenerS232S0100000_5(this, 3));
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.addAnimation(translateAnimation3);
        return animationSet;
    }

    public final void LJZI(String str, boolean z) {
        Animation animation;
        Animation animation2;
        if (!this.isViewValid || str == null || str.length() == 0) {
            return;
        }
        C47121t6 c47121t6 = this.LJLJJI;
        if (c47121t6 != null) {
            c47121t6.setText(str);
        }
        View view = this.LJLJI;
        if (view != null) {
            view.clearAnimation();
        }
        if (C15380j0.LJIIZILJ()) {
            View view2 = this.LJLJI;
            if (view2 == null) {
                return;
            }
            if (z) {
                animation2 = (Animation) this.LJLJL.getValue();
            } else {
                animation2 = (Animation) this.LJLJJLL.getValue();
            }
            view2.startAnimation(animation2);
            return;
        }
        View view3 = this.LJLJI;
        if (view3 == null) {
            return;
        }
        if (z) {
            animation = (Animation) this.LJLJJLL.getValue();
        } else {
            animation = (Animation) this.LJLJL.getValue();
        }
        view3.startAnimation(animation);
    }
}
