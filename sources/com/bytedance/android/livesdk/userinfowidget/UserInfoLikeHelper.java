package com.bytedance.android.livesdk.userinfowidget;

import X.C29044Baa;
import X.C30326BvG;
import X.C31597Caf;
import X.CY3;
import X.InterfaceC29986Bpm;
import Y.ALAdapterS4S0100000_5;
import Y.ARunnableS8S0201000_5;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.other.LiveSelfLinkedLikeBehaviorSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* loaded from: classes6.dex */
public class UserInfoLikeHelper implements GenericLifecycleObserver, InterfaceC29986Bpm {
    public final ObjectAnimator LJLIL;
    public ObjectAnimator LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public ObjectAnimator LJLJJL;
    public View LJLJJLL;

    @Override // X.InterfaceC29986Bpm
    public final String A4() {
        return "UserInfoLikeHelper";
    }

    @Override // X.InterfaceC29986Bpm
    public final /* synthetic */ void dc(LikeHelper likeHelper, String str) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.LJLIL.cancel();
        this.LJLILLLLZI.cancel();
        ObjectAnimator objectAnimator = this.LJLJJL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.LJLJJLL.setAlpha(1.0f);
    }

    public final void LIZ(View view) {
        if (view != null && view == this.LJLJJLL && this.LJLILLLLZI != null) {
            return;
        }
        this.LJLJJLL = view;
        ObjectAnimator objectAnimator = this.LJLILLLLZI;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            this.LJLILLLLZI = ofFloat;
            ofFloat.setDuration(200L);
            return;
        }
        objectAnimator.setTarget(view);
    }

    @Override // X.InterfaceC29986Bpm
    public final void t3(LikeHelper likeHelper, int i) {
        if (i >= likeHelper.LJZ) {
            if (this.LJLILLLLZI.isRunning()) {
                this.LJLILLLLZI.cancel();
            }
            View view = this.LJLJJLL;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.5f, view.getAlpha()), Keyframe.ofFloat(1.0f, 1.0f)));
            this.LJLJJL = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setStartDelay(200L);
            this.LJLJJL.setDuration(200L);
            this.LJLJJL.start();
        }
    }

    public UserInfoLikeHelper(LifecycleOwner lifecycleOwner, C31597Caf c31597Caf, CY3 cy3) {
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LJLJJLL = cy3;
        cy3.setAlpha(1.0f);
        c31597Caf.setScaleX(0.0f);
        c31597Caf.setScaleY(0.0f);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && room.getOwner() != null) {
            C30326BvG.LIZ.post(new ARunnableS8S0201000_5(0, c31597Caf, room, 0), null);
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c31597Caf, PropertyValuesHolder.ofKeyframe(View.SCALE_X, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(1.0f, 1.5f)), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(1.0f, 1.5f)), PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.0f, 0.5f), Keyframe.ofFloat(0.5f, 0.5f), Keyframe.ofFloat(1.0f, 0.0f)));
        this.LJLIL = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(1000L);
        ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        ofPropertyValuesHolder.addListener(new ALAdapterS4S0100000_5(c31597Caf, 9));
        LIZ(cy3);
    }

    @Override // X.InterfaceC29986Bpm
    public final void g4(LikeHelper likeHelper, int i, int i2, float f, float f2, float f3, float f4) {
        if (LiveSelfLinkedLikeBehaviorSetting.INSTANCE.isSelfLikeLinkedBreathAnimatorEnable()) {
            if (i2 >= likeHelper.LJZI) {
                if (this.LJLJJI != i) {
                    this.LJLJJI = i;
                    if (this.LJLILLLLZI.isRunning()) {
                        this.LJLILLLLZI.cancel();
                        this.LJLJJLL.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i2 >= likeHelper.LJZ) {
                if (this.LJLJI == i) {
                    return;
                }
                this.LJLJI = i;
                this.LJLILLLLZI.start();
                return;
            }
            if (this.LJLIL.isRunning()) {
                return;
            }
            this.LJLIL.start();
        }
    }
}
