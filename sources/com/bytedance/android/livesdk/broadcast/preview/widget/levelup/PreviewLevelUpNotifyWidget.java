package com.bytedance.android.livesdk.broadcast.preview.widget.levelup;

import X.B9K;
import X.BQW;
import X.BZI;
import X.C018905p;
import X.C0NA;
import X.C15380j0;
import X.C15490jB;
import X.C15510jD;
import X.C16880lQ;
import X.C18950ol;
import X.C28503BGp;
import X.C28509BGv;
import X.C28787BRn;
import X.C29306Beo;
import X.C30554Byw;
import X.C41081jM;
import X.C47121t6;
import X.C65352Pkq;
import X.CFX;
import X.InterfaceC30442Bx8;
import Y.ALAdapterS4S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.AnchorCheckOutTipsFinished;
import com.bytedance.android.livesdk.dataChannel.LevelupNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewLevelUpNotifyWidget extends PreviewWidget {
    public static final /* synthetic */ int LJLLL = 0;
    public Integer LJLJI;
    public Integer LJLJJI;
    public Boolean LJLJJL;
    public String LJLJJLL;
    public Integer LJLJL;
    public Integer LJLJLJ;
    public C47121t6 LJLJLLL;
    public ImageView LJLL;
    public C41081jM LJLLI;
    public final AnimatorSet LJLLILLLL = new AnimatorSet();
    public final AnimatorSet LJLLJ = new AnimatorSet();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.db5;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C0NA.LIZJ(C65352Pkq.LIZ(LevelupNotifyBannerChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C0NA.LIZIZ(C65352Pkq.LIZ(LevelupNotifyBannerChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LL() {
        String str;
        BZI LIZ = C28787BRn.LIZ("banner_show");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJIJJ("creator_onboard", "banner_type");
        LIZ.LJIJJ(1, "banner_position");
        LIZ.LJIJJ(0, "is_fe");
        LIZ.LJIJJ(1, "is_anchor");
        LIZ.LJIJJ("live_take_page", "banner_page");
        LIZ.LJIJJ(this.LJLJJLL, "banner_content_starling_key");
        LiveMode liveMode = (LiveMode) this.dataChannel.kv0(LiveModeChannel.class);
        if (liveMode != null) {
            str = C28509BGv.LIZ(liveMode);
        } else {
            str = null;
        }
        LIZ.LJIJJ(str, "live_type");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJJIIZI();
        }
    }

    public final void LLII() {
        C15490jB.LIZJ(this.LJLLI, C15510jD.LJIIIZ("tiktok_live_broadcast_demand_4", "ttlive_icon_level_up_new_preview.png"));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        C47121t6 c47121t6;
        ImageView imageView;
        int i;
        super.LJZL();
        hide();
        View view = getView();
        if (view != null) {
            if (C28503BGp.LIZ()) {
                i = R.drawable.cav;
            } else {
                i = R.drawable.cmm;
            }
            view.setBackgroundResource(i);
        }
        View view2 = getView();
        ImageView imageView2 = null;
        if (view2 != null) {
            c47121t6 = (C47121t6) view2.findViewById(R.id.i35);
        } else {
            c47121t6 = null;
        }
        this.LJLJLLL = c47121t6;
        View view3 = getView();
        if (view3 != null) {
            imageView2 = (ImageView) view3.findViewById(R.id.msn);
        }
        this.LJLL = imageView2;
        this.LJLLI = (C41081jM) this.contentView.findViewById(R.id.i34);
        ImageView imageView3 = this.LJLL;
        if (imageView3 != null) {
            C29306Beo.LJI(imageView3);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 200));
        }
        if (C28503BGp.LIZ() && (imageView = (ImageView) findViewById(R.id.age)) != null) {
            imageView.setVisibility(0);
            C29306Beo.LJJJLL(imageView, 500L, new AqS171S0100000_5(this, 201));
        }
        View view4 = this.contentView;
        if (view4 != null) {
            C29306Beo.LJJJLL(view4, 1000L, new AqS171S0100000_5(this, 202));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.ov0(this, AnchorCheckOutTipsFinished.class, new AqS171S0100000_5(this, 657));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        AnimatorSet animatorSet = this.LJLLILLLL;
        if (animatorSet != null) {
            C16880lQ.LJLJJL(animatorSet);
        }
        AnimatorSet animatorSet2 = this.LJLLJ;
        if (animatorSet2 != null) {
            C16880lQ.LJLJJL(animatorSet2);
        }
        AnimatorSet animatorSet3 = this.LJLLILLLL;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.LJLLJ;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
    }

    public final void LLF(boolean z) {
        int i;
        BQW bqw;
        ViewGroup.LayoutParams layoutParams;
        ImageView imageView = this.LJLL;
        if (imageView != null) {
            C29306Beo.LJJLJLI(imageView);
        }
        C47121t6 c47121t6 = this.LJLJLLL;
        if (c47121t6 != null) {
            if (z) {
                i = R.string.nkt;
            } else {
                i = R.string.nku;
            }
            c47121t6.setText(C15380j0.LJIILJJIL(i));
        }
        if (z) {
            bqw = BQW.TNS_STAGE1_KEY;
        } else {
            bqw = BQW.TNS_STAGE2_KEY;
        }
        this.LJLJJLL = bqw.getKey();
        LLFZ(false);
        C47121t6 c47121t62 = this.LJLJLLL;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (c47121t62 != null) {
            layoutParams = c47121t62.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof C018905p) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart((int) B9K.LIZ(this.context, 5.0f));
        }
        C47121t6 c47121t63 = this.LJLJLLL;
        if (c47121t63 == null) {
            return;
        }
        c47121t63.setLayoutParams(marginLayoutParams);
    }

    public final void LLFF(int i) {
        Resources resources;
        C47121t6 c47121t6 = this.LJLJLLL;
        if (c47121t6 == null) {
            return;
        }
        Integer num = this.LJLJJI;
        String str = null;
        if (num != null) {
            int intValue = num.intValue();
            Context context = this.context;
            if (context != null && (resources = context.getResources()) != null) {
                str = resources.getQuantityString(i, intValue, Integer.valueOf(intValue));
            }
        }
        c47121t6.setText(str);
    }

    public final void LLFII(boolean z) {
        show();
        if (o.LJ(this.LJLJJL, Boolean.TRUE)) {
            LLF(false);
            return;
        }
        if (z) {
            C47121t6 c47121t6 = this.LJLJLLL;
            if (c47121t6 != null) {
                c47121t6.setText(C15380j0.LJIILJJIL(R.string.nkp));
            }
            this.LJLJJLL = BQW.L1_COMPLETE_KEY.getKey();
            LLFZ(true);
            return;
        }
        C30554Byw<Boolean> c30554Byw = InterfaceC30442Bx8.v1;
        if (c30554Byw.LIZ() == null) {
            C47121t6 c47121t62 = this.LJLJLLL;
            if (c47121t62 != null) {
                c47121t62.setText(C15380j0.LJIILJJIL(R.string.nkp));
            }
            this.LJLJJLL = BQW.L1_COMPLETE_KEY.getKey();
            LL();
            LLFZ(true);
            PathInterpolator LIZIZ = C18950ol.LIZIZ(0.47f, 0.0f, 0.75f, 0.72f);
            o.LJIIIIZZ(LIZIZ, "create(0.47f, 0f, 0.75f, 0.72f)");
            ObjectAnimator LLFFF = LLFFF(this.LJLJLLL, true, LIZIZ, 300L, 5000L);
            ObjectAnimator LLFFF2 = LLFFF(this.LJLLI, true, LIZIZ, 300L, 5000L);
            AnimatorSet animatorSet = this.LJLLJ;
            if (animatorSet != null) {
                animatorSet.playTogether(LLFFF, LLFFF2);
            }
            AnimatorSet animatorSet2 = this.LJLLJ;
            if (animatorSet2 != null) {
                animatorSet2.addListener(new ALAdapterS4S0100000_5(this, 55));
            }
            AnimatorSet animatorSet3 = this.LJLLJ;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
            c30554Byw.LIZJ(Boolean.FALSE);
            return;
        }
        LLFZ(false);
        LLFF(R.plurals.nz);
        this.LJLJJLL = BQW.L1_TASK_KEY.getKey();
        LL();
    }

    public final void LLFZ(boolean z) {
        String LJIIIZ;
        if (z) {
            LJIIIZ = C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1"), "ttlive_icon_level_up_completed_preview.png");
        } else {
            LJIIIZ = C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_normal_1"), "ttlive_icon_level_up_preview.png");
        }
        C15490jB.LIZJ(this.LJLLI, LJIIIZ);
    }

    public final ObjectAnimator LLFFF(View view, boolean z, Interpolator interpolator, long j, long j2) {
        ObjectAnimator ofFloat;
        if (z) {
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            o.LJIIIIZZ(ofFloat, "{\n            ObjectAnim….ALPHA, 1f, 0f)\n        }");
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            o.LJIIIIZZ(ofFloat, "{\n            ObjectAnim….ALPHA, 0f, 1f)\n        }");
        }
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(interpolator);
        ofFloat.setStartDelay(j2);
        return ofFloat;
    }
}
