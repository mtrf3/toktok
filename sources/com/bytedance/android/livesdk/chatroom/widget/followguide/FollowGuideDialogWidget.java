package com.bytedance.android.livesdk.chatroom.widget.followguide;

import X.AnonymousClass149;
import X.B4J;
import X.B4K;
import X.B83;
import X.BCW;
import X.BKY;
import X.C16880lQ;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29862Bnm;
import X.C29863Bnn;
import X.C29917Bof;
import X.C30868C9o;
import X.C45804HyK;
import X.C47261Igj;
import X.C78598Ut0;
import X.CN1;
import X.DialogInterfaceOnShowListenerC29864Bno;
import X.OSZ;
import X.ViewOnClickListenerC29861Bnl;
import Y.ARunnableS41S0100000_5;
import Y.IDDListenerS145S0100000_5;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.CustomPollVisibleChannel;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.FastGiftVisibleChannel;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.liveinteract.match.business.event.MvpDialogVisibleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestVisibleChannel;
import com.bytedance.android.live.room.UserProfileShowingChannel;
import com.bytedance.android.live.wallet.model.ReChargeDialogOnShow;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.FullScreenSurveyShowing;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.SubscribeWebOnShow;
import com.bytedance.android.livesdk.rank.api.OnlineAudienceRankListDialogVisibilityChannel;
import com.bytedance.android.livesdk.rank.api.RankListDialogVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.event.LiveExploreDrawerShowChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FollowGuideDialogWidget extends FollowGuideAbsWidget {
    public ViewOnClickListenerC29861Bnl LJLJLLL;
    public final ARunnableS41S0100000_5 LJLL = new ARunnableS41S0100000_5(this, 147);
    public final ARunnableS41S0100000_5 LJLLI = new ARunnableS41S0100000_5(this, 146);

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final long LJZI() {
        return 0L;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final OSZ<String, Boolean> LJLZ() {
        if (((ISubscribeService) CN1.LIZ(ISubscribeService.class)).bv()) {
            return new OSZ<>("subscribe", Boolean.FALSE);
        }
        if (AnonymousClass149.LIZ.LIZJ() || BKY.LIZIZ().LIZJ()) {
            return new OSZ<>("dialog", Boolean.FALSE);
        }
        B4K LIZJ = B4J.LIZJ(C16880lQ.LJLLJ(this.context.getClass()));
        if (LIZJ != null && LIZJ.dg()) {
            return new OSZ<>("drawer", Boolean.FALSE);
        }
        for (Class cls : C47261Igj.LJJIJIIJI(UserProfileShowingChannel.class, GiftDialogVisibilityChannel.class, KeyboardStatusChannel.class, RankListDialogVisibilityChannel.class, OnlineAudienceRankListDialogVisibilityChannel.class, FastGiftVisibleChannel.class, MultiGuestVisibleChannel.class, CustomPollVisibleChannel.class, ToolBarShareVisibleChannel.class, MvpDialogVisibleChannel.class, ReChargeDialogOnShow.class, SubscribeWebOnShow.class)) {
            if (C78598Ut0.LJIILJJIL((Boolean) this.dataChannel.kv0(cls))) {
                return new OSZ<>(C16880lQ.LJLLJ(cls), Boolean.FALSE);
            }
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final void LJZL() {
        ViewOnClickListenerC29861Bnl viewOnClickListenerC29861Bnl = this.LJLJLLL;
        if (viewOnClickListenerC29861Bnl != null && viewOnClickListenerC29861Bnl.isShowing()) {
            return;
        }
        OSZ<String, Boolean> LJLZ = LJLZ();
        if (LJLZ != null) {
            LL(LJLZ.getFirst());
        } else {
            this.LJLILLLLZI.post(this.LJLL);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final void LLFFF() {
        ViewOnClickListenerC29861Bnl viewOnClickListenerC29861Bnl = this.LJLJLLL;
        if (viewOnClickListenerC29861Bnl != null) {
            viewOnClickListenerC29861Bnl.LJLJL.setText(R.string.l9o);
        }
        C30868C9o.LIZJ(R.string.l9o);
        LLIIII(false);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final void LLFII() {
        DataChannel dataChannel = this.dataChannel;
        dataChannel.lv0(this, UserProfileShowingChannel.class, new AqS171S0100000_5(this, 359));
        dataChannel.lv0(this, GiftDialogVisibilityChannel.class, new AqS171S0100000_5(this, 360));
        dataChannel.lv0(this, KeyboardStatusChannel.class, new AqS171S0100000_5(this, 361));
        dataChannel.lv0(this, RankListDialogVisibilityChannel.class, new AqS171S0100000_5(this, 362));
        dataChannel.lv0(this, OnlineAudienceRankListDialogVisibilityChannel.class, new AqS171S0100000_5(this, 363));
        dataChannel.lv0(this, FastGiftVisibleChannel.class, new AqS171S0100000_5(this, 364));
        dataChannel.lv0(this, MultiGuestVisibleChannel.class, new AqS171S0100000_5(this, 365));
        dataChannel.lv0(this, CustomPollVisibleChannel.class, new AqS171S0100000_5(this, 366));
        dataChannel.lv0(this, ToolBarShareVisibleChannel.class, new AqS171S0100000_5(this, 367));
        dataChannel.lv0(this, MvpDialogVisibleChannel.class, new AqS171S0100000_5(this, 357));
        dataChannel.lv0(this, LiveExploreDrawerShowChannel.class, new AqS171S0100000_5(this, 358));
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        LLIIII(false);
    }

    public final void LLII(Boolean bool) {
        if (C29306Beo.LJIILLIIL(bool) && this.LJLJJI != null) {
            LJZL();
        }
    }

    public final void LLIIII(boolean z) {
        User owner;
        if (z) {
            if (this.LJLJJI == null || !((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
                return;
            }
            Room room = this.LJLJI;
            if ((room == null || (owner = room.getOwner()) == null || !owner.isFollowing()) && isViewValid()) {
                ViewOnClickListenerC29861Bnl viewOnClickListenerC29861Bnl = this.LJLJLLL;
                if (viewOnClickListenerC29861Bnl != null && viewOnClickListenerC29861Bnl.isShowing()) {
                    return;
                }
                Context context = this.context;
                o.LJIIIIZZ(context, "context");
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                if (LJIJJ != null && LJIJJ.isFinishing()) {
                    return;
                }
                Object kv0 = this.dataChannel.kv0(PIPStatusData.class);
                Boolean bool = Boolean.TRUE;
                if (o.LJ(kv0, bool) || o.LJ(this.dataChannel.kv0(FullScreenSurveyShowing.class), bool)) {
                    return;
                }
                if (this.LJLJLLL == null) {
                    ViewOnClickListenerC29861Bnl viewOnClickListenerC29861Bnl2 = new ViewOnClickListenerC29861Bnl(this.context, o.LJ(this.dataChannel.kv0(BCW.class), bool), this.LJLJI);
                    viewOnClickListenerC29861Bnl2.LJLJLLL = this.LJLJJI;
                    viewOnClickListenerC29861Bnl2.setOnShowListener(new DialogInterfaceOnShowListenerC29864Bno(this));
                    viewOnClickListenerC29861Bnl2.setOnDismissListener(new IDDListenerS145S0100000_5(this, 3));
                    viewOnClickListenerC29861Bnl2.LJLL = new C29862Bnm(this, viewOnClickListenerC29861Bnl2);
                    this.LJLJLLL = viewOnClickListenerC29861Bnl2;
                }
                C29917Bof.LIZ().LIZ(new C29863Bnn(this));
                return;
            }
            return;
        }
        ViewOnClickListenerC29861Bnl viewOnClickListenerC29861Bnl3 = this.LJLJLLL;
        if (viewOnClickListenerC29861Bnl3 != null) {
            viewOnClickListenerC29861Bnl3.dismiss();
        }
        this.LJLJLLL = null;
    }
}
