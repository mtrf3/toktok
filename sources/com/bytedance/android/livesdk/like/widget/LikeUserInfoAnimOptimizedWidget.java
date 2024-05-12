package com.bytedance.android.livesdk.like.widget;

import X.BML;
import X.C15380j0;
import X.C16880lQ;
import X.C29982Bpi;
import X.C30011BqB;
import X.C30013BqD;
import X.C30015BqF;
import X.C31665Cbl;
import X.CCJ;
import X.CN1;
import X.InterfaceC29980Bpg;
import X.InterfaceC29986Bpm;
import X.InterfaceC30008Bq8;
import Y.ACListenerS24S0101000_5;
import Y.ALAdapterS4S0100000_5;
import Y.AUListenerS94S0100000_5;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAnimationOptimizationSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class LikeUserInfoAnimOptimizedWidget extends LiveRecyclableWidget implements InterfaceC29986Bpm {
    public static final float LJZL;
    public View LJLIL;
    public ProgressBar LJLILLLLZI;
    public ValueAnimator LJLJI;
    public ObjectAnimator LJLJJI;
    public ObjectAnimator LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public AnimatorSet LJLJLJ;
    public AnimatorSet LJLJLLL;
    public Keyframe[] LJLL;
    public AnimatorSet LJLLI;
    public Keyframe[] LJLLILLLL;
    public InterfaceC30008Bq8 LJLLJ;
    public View LJLLL;
    public ImageView LJLLLL;
    public TextView LJLLLLLL;
    public AnimatorSet LJLZ;
    public C30013BqD LJZ;
    public boolean LJZI;

    @Override // X.InterfaceC29986Bpm
    public final String A4() {
        return "LikeUserInfoAnimOptimizedWidget";
    }

    @Override // X.InterfaceC29986Bpm
    public final /* synthetic */ void dc(LikeHelper likeHelper, String str) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d_n;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLZ() {
        if (this.LJZI) {
            return;
        }
        this.LJZI = true;
        this.LJLIL = findViewById(R.id.e4u);
        this.LJLILLLLZI = (ProgressBar) findViewById(R.id.ia9);
        if (LiveAnimationOptimizationSetting.INSTANCE.getValue()) {
            this.LJLLJ = new C30015BqF(getView());
        } else {
            this.LJLLJ = new C30011BqB(getView());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, LinkMicRtcMixBitrateSetting.DEFAULT);
        this.LJLJI = ofInt;
        ofInt.addUpdateListener(new AUListenerS94S0100000_5(this, 70));
        this.LJLJI.setDuration(1200L);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLIL, (Property<View, Float>) View.ROTATION, 0.0f, LJZL, 0.0f);
        this.LJLJJI = ofFloat;
        ofFloat.setDuration(200L);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.LJLIL, PropertyValuesHolder.ofKeyframe(View.SCALE_X, Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.6f, 1.7f), Keyframe.ofFloat(1.0f, 1.5f)), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.6f, 1.7f), Keyframe.ofFloat(1.0f, 1.5f)));
        this.LJLJJL = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(200L);
        this.LJLL = new Keyframe[]{Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.375f, 1.15f), Keyframe.ofFloat(1.0f, 0.0f)};
        AnimatorSet animatorSet = new AnimatorSet();
        this.LJLJLLL = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofPropertyValuesHolder(this.LJLILLLLZI, PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.0f, this.LJLIL.getAlpha()), Keyframe.ofFloat(0.5f, 0.0f))));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.LJLJLJ = animatorSet2;
        animatorSet2.setDuration(400L);
        this.LJLLILLLL = new Keyframe[]{Keyframe.ofFloat(0.0f, 1.5f), Keyframe.ofFloat(0.375f, 1.7f), Keyframe.ofFloat(1.0f, 0.0f)};
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.LJLLI = animatorSet3;
        animatorSet3.setDuration(400L);
        this.LJLLL = findViewById(R.id.kwh);
        this.LJLLLL = (ImageView) findViewById(R.id.kwg);
        this.LJLLLLLL = (TextView) findViewById(R.id.kwi);
        this.LJZ = new C30013BqD(Integer.class);
        LJZ();
    }

    public final void LJZ() {
        Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
        this.LJLLL.setVisibility(8);
        if (room != null && room.getOwner() != null) {
            C31665Cbl.LJIIIZ(this.LJLLLL, room.getOwner().getAvatarThumb(), R.drawable.cuk);
            C16880lQ.LJIILLIIL(this.LJLLLL, new ACListenerS24S0101000_5(1, room, 2));
        }
        this.LJLIL.setScaleX(0.0f);
        this.LJLIL.setScaleY(0.0f);
        this.LJLIL.setRotation(0.0f);
        this.LJLILLLLZI.setAlpha(0.0f);
        this.LJLILLLLZI.setProgress(0);
        this.LJLLJ.setVisibility(4);
        this.LJLJJLL = 0;
        this.LJLJL = 0;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        InterfaceC29980Bpg hq0;
        Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
        if (room != null && (hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(room.getId())) != null && hq0.isEnabled() && hq0.LIZIZ()) {
            hq0.LJIILJJIL(this);
        }
        if (!this.LJZI) {
            return;
        }
        AnimatorSet animatorSet = this.LJLZ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LJLJI.cancel();
        this.LJLJJI.cancel();
        this.LJLJJL.cancel();
        this.LJLJLJ.cancel();
        this.LJLJLLL.cancel();
        this.LJLLJ.LIZIZ();
    }

    static {
        float f;
        if (CCJ.LIZ(C15380j0.LIZLLL())) {
            f = -18.0f;
        } else {
            f = 18.0f;
        }
        LJZL = f;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        InterfaceC29980Bpg hq0;
        Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
        if (room != null && (hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(room.getId())) != null && hq0.isEnabled() && hq0.LIZIZ()) {
            hq0.LJ(this);
        }
        if (this.LJZI) {
            LJZ();
        }
    }

    @Override // X.InterfaceC29986Bpm
    public final void t3(LikeHelper likeHelper, int i) {
        ObjectAnimator ofPropertyValuesHolder;
        ObjectAnimator ofPropertyValuesHolder2;
        ObjectAnimator ofPropertyValuesHolder3;
        ObjectAnimator ofPropertyValuesHolder4;
        if (!likeHelper.LLFF) {
            return;
        }
        if (i >= likeHelper.LJZI) {
            LJLZ();
            if (this.LJLJJL.isRunning()) {
                this.LJLJJL.cancel();
                View view = this.LJLIL;
                ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe(View.SCALE_X, Keyframe.ofFloat(0.0f, view.getScaleX()), Keyframe.ofFloat(1.0f, 0.0f)));
                View view2 = this.LJLIL;
                ofPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(view2, PropertyValuesHolder.ofKeyframe(View.SCALE_Y, Keyframe.ofFloat(0.0f, view2.getScaleY()), Keyframe.ofFloat(1.0f, 0.0f)));
            } else {
                ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(this.LJLIL, PropertyValuesHolder.ofKeyframe(View.SCALE_X, this.LJLLILLLL));
                ofPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(this.LJLIL, PropertyValuesHolder.ofKeyframe(View.SCALE_Y, this.LJLLILLLL));
            }
            this.LJLLI.playTogether(ofPropertyValuesHolder3, ofPropertyValuesHolder4, this.LJLJLLL);
            this.LJLLI.start();
            AnimatorSet animatorSet = this.LJLZ;
            if (animatorSet != null) {
                animatorSet.cancel();
            } else {
                this.LJLZ = new AnimatorSet();
            }
            TextView textView = this.LJLLLLLL;
            textView.setText(textView.getContext().getString(R.string.o1o, BML.LIZIZ(i)));
            this.LJLLL.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            float f = (float) 1300;
            ObjectAnimator ofPropertyValuesHolder5 = ObjectAnimator.ofPropertyValuesHolder(this.LJLLL, PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(200.0f / f, 1.0f)), PropertyValuesHolder.ofKeyframe(this.LJZ, Keyframe.ofInt(0.0f, C15380j0.LIZ(36.0f)), Keyframe.ofInt(100.0f / f, C15380j0.LIZ(36.0f)), Keyframe.ofInt(1.0f, this.LJLLL.getMeasuredWidth())));
            ofPropertyValuesHolder5.setInterpolator(new DecelerateInterpolator());
            ofPropertyValuesHolder5.setDuration(1300L);
            ViewGroup.LayoutParams layoutParams = this.LJLLLLLL.getLayoutParams();
            layoutParams.width = this.LJLLL.getMeasuredWidth();
            this.LJLLLLLL.setLayoutParams(layoutParams);
            ObjectAnimator ofPropertyValuesHolder6 = ObjectAnimator.ofPropertyValuesHolder(this.LJLLL, PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(800.0f / ((float) 1000), 1.0f), Keyframe.ofFloat(1.0f, 0.0f)), PropertyValuesHolder.ofKeyframe(this.LJZ, Keyframe.ofInt(0.0f, this.LJLLL.getMeasuredWidth()), Keyframe.ofInt(1.0f, C15380j0.LIZ(36.0f))));
            ofPropertyValuesHolder6.setInterpolator(new DecelerateInterpolator());
            ofPropertyValuesHolder6.setDuration(1000L);
            ofPropertyValuesHolder6.setStartDelay(2000L);
            this.LJLZ.playSequentially(ofPropertyValuesHolder5, ofPropertyValuesHolder6);
            this.LJLZ.addListener(new ALAdapterS4S0100000_5(this, 71));
            this.LJLZ.start();
            return;
        }
        if (i < likeHelper.LJZ) {
            return;
        }
        LJLZ();
        if (this.LJLJI.isRunning()) {
            this.LJLJI.cancel();
            View view3 = this.LJLIL;
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view3, PropertyValuesHolder.ofKeyframe(View.SCALE_X, Keyframe.ofFloat(0.0f, view3.getScaleX()), Keyframe.ofFloat(1.0f, 0.0f)));
            View view4 = this.LJLIL;
            ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view4, PropertyValuesHolder.ofKeyframe(View.SCALE_Y, Keyframe.ofFloat(0.0f, view4.getScaleY()), Keyframe.ofFloat(1.0f, 0.0f)));
        } else {
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.LJLIL, PropertyValuesHolder.ofKeyframe(View.SCALE_X, this.LJLL));
            ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.LJLIL, PropertyValuesHolder.ofKeyframe(View.SCALE_Y, this.LJLL));
        }
        this.LJLJLJ.playTogether(ofPropertyValuesHolder, ofPropertyValuesHolder2, this.LJLJLLL);
        this.LJLJLJ.start();
    }

    @Override // X.InterfaceC29986Bpm
    public final void g4(LikeHelper likeHelper, int i, int i2, float f, float f2, float f3, float f4) {
        if (!likeHelper.LLFF) {
            return;
        }
        if (i2 >= likeHelper.LJZI) {
            LJLZ();
            if (this.LJLJL != i) {
                this.LJLJL = i;
                if (this.LJLJI.isRunning()) {
                    this.LJLILLLLZI.setProgress(100);
                    this.LJLILLLLZI.setAlpha(1.0f);
                    this.LJLJI.cancel();
                }
                this.LJLJJL.start();
            }
            this.LJLJJI.start();
            if (i2 == likeHelper.LJZI) {
                this.LJLLJ.LIZJ("full_progress_bubbles_lottie");
            } else {
                this.LJLLJ.LIZJ("like_after_full_progress_bubbles_lottie");
            }
            this.LJLLJ.LIZ();
            C29982Bpi.LJFF++;
            return;
        }
        if (i2 < likeHelper.LJZ) {
            return;
        }
        LJLZ();
        if (this.LJLJJLL != i) {
            this.LJLJJLL = i;
            this.LJLJI.start();
        }
        this.LJLJJI.start();
        ProgressBar progressBar = this.LJLILLLLZI;
        int i3 = likeHelper.LJZI;
        int i4 = likeHelper.LJZ;
        progressBar.setProgress((int) ((100.0f / (i3 - i4)) * (i2 - i4)));
        C29982Bpi.LJ++;
    }
}
