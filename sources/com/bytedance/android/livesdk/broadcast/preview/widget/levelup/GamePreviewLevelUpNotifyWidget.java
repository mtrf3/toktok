package com.bytedance.android.livesdk.broadcast.preview.widget.levelup;

import X.BZI;
import X.C15490jB;
import X.C15510jD;
import X.C16880lQ;
import X.C28503BGp;
import X.C28787BRn;
import X.C29306Beo;
import X.C41081jM;
import X.C47121t6;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.livesdk.broadcast.AnchorCheckOutTipsFinished;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class GamePreviewLevelUpNotifyWidget extends BannerWidget {
    public String LJLJLLL;
    public Integer LJLL;
    public Integer LJLLI;
    public C47121t6 LJLLILLLL;
    public ImageView LJLLJ;
    public C41081jM LJLLL;
    public boolean LJLZ;
    public final AnimatorSet LJLLLL = new AnimatorSet();
    public final AnimatorSet LJLLLLLL = new AnimatorSet();
    public final String LJZ = "lop_banner";

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.db5;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LLFFF() {
        BZI LIZ = C28787BRn.LIZ("banner_show");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJIJJ("creator_onboard", "banner_type");
        LIZ.LJIJJ(1, "banner_position");
        LIZ.LJIJJ(0, "is_fe");
        LIZ.LJIJJ(1, "is_anchor");
        LIZ.LJIJJ("live_take_page", "banner_page");
        LIZ.LJIJJ(this.LJLJLLL, "banner_content_starling_key");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJJIIZI();
        }
    }

    public final void LLFII() {
        C15490jB.LIZJ(this.LJLLL, C15510jD.LJIIIZ("tiktok_live_broadcast_demand_4", "ttlive_icon_level_up_new_preview.png"));
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (this.LJLZ) {
            super.show();
        }
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
        this.LJLLILLLL = c47121t6;
        View view3 = getView();
        if (view3 != null) {
            imageView2 = (ImageView) view3.findViewById(R.id.msn);
        }
        this.LJLLJ = imageView2;
        this.LJLLL = (C41081jM) this.contentView.findViewById(R.id.i34);
        ImageView imageView3 = this.LJLLJ;
        if (imageView3 != null) {
            C29306Beo.LJI(imageView3);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 197));
        }
        if (C28503BGp.LIZ() && (imageView = (ImageView) findViewById(R.id.age)) != null) {
            imageView.setVisibility(0);
            C29306Beo.LJJJLL(imageView, 500L, new AqS171S0100000_5(this, 198));
        }
        View view4 = this.contentView;
        if (view4 != null) {
            C29306Beo.LJJJLL(view4, 1000L, new AqS171S0100000_5(this, 199));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.ov0(this, AnchorCheckOutTipsFinished.class, new AqS171S0100000_5(this, 656));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        AnimatorSet animatorSet = this.LJLLLL;
        if (animatorSet != null) {
            C16880lQ.LJLJJL(animatorSet);
        }
        AnimatorSet animatorSet2 = this.LJLLLLLL;
        if (animatorSet2 != null) {
            C16880lQ.LJLJJL(animatorSet2);
        }
        AnimatorSet animatorSet3 = this.LJLLLL;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.LJLLLLLL;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String LL() {
        return this.LJZ;
    }
}
