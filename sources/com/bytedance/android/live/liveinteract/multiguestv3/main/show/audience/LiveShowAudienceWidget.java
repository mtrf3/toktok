package com.bytedance.android.live.liveinteract.multiguestv3.main.show.audience;

import X.AbstractC74727TUl;
import X.C05170If;
import X.C0NB;
import X.C221108m2;
import X.C62822Ol8;
import X.C74946TbC;
import X.C75394TiQ;
import X.C75559Tl5;
import X.C76574U3m;
import X.TQ8;
import X.U2R;
import Y.AObserverS81S0100000_13;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.event.MultiGuestLiveShowPanelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowWidgetDestroyTimeSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public final class LiveShowAudienceWidget extends BaseLiveShowWidget {
    public final FrameLayout LJLLJ;
    public U2R LJLLL;
    public final C74946TbC LJLLLL;
    public final AObserverS81S0100000_13 LJLLLLLL;
    public final AObserverS81S0100000_13 LJLZ;
    public final AObserverS81S0100000_13 LJZ;
    public final AObserverS81S0100000_13 LJZI;
    public final C62822Ol8 LJZL;
    public final C75394TiQ LL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C0NB.LIZIZ("LiveShowAudienceWidget", "onCreate");
        super.onCreate();
        LiveShowAudienceViewModel liveShowAudienceViewModel = (LiveShowAudienceViewModel) this.LJLILLLLZI;
        if (liveShowAudienceViewModel != null) {
            liveShowAudienceViewModel.LJLILLLLZI.observe(this, this.LJLZ);
            liveShowAudienceViewModel.LJLIL.observe(this, this.LJZ);
            liveShowAudienceViewModel.LJLL.observe(this, this.LJLLLLLL);
            liveShowAudienceViewModel.LJLLILLLL.observe(this, this.LJZI);
        }
        DataChannelGlobal.LJLJJI.ov0(MultiGuestLiveShowPanelEvent.class, this, new AqS179S0100000_13(this, 178));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C0NB.LIZIZ("LiveShowAudienceWidget", "onDestroy");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        if (this.LJZL.isInitialized()) {
            ((C76574U3m) this.LJZL.getValue()).LIZIZ();
        }
        MultiGuestLiveShowWidgetDestroyTimeSetting multiGuestLiveShowWidgetDestroyTimeSetting = MultiGuestLiveShowWidgetDestroyTimeSetting.INSTANCE;
        if (multiGuestLiveShowWidgetDestroyTimeSetting.isFix()) {
            super.onDestroy();
        }
        LJLZ();
        if (!multiGuestLiveShowWidgetDestroyTimeSetting.isFix()) {
            super.onDestroy();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget, com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget, com.bytedance.android.widget.Widget
    public final void onStop() {
        super.onStop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveShowAudienceWidget(FrameLayout container) {
        super(LiveShowAudienceViewModel.class);
        o.LJIIIZ(container, "container");
        this.LJLLJ = container;
        this.LJLLLL = new C74946TbC(this);
        this.LJLLLLLL = new AObserverS81S0100000_13(this, 35);
        this.LJLZ = new AObserverS81S0100000_13(this, 38);
        this.LJZ = new AObserverS81S0100000_13(this, 37);
        this.LJZI = new AObserverS81S0100000_13(this, 36);
        this.LJZL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 96));
        this.LL = new C75394TiQ(this);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget
    public final String LJZI(ShowListUser showListUser) {
        AbstractC74727TUl LIZ;
        LinkListUser linkListUser;
        o.LJIIIZ(showListUser, "showListUser");
        if (!o.LJ(showListUser.nickname, "")) {
            return showListUser.nickname;
        }
        TQ8 tq8 = (TQ8) C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        User user = null;
        if (tq8 != null && (LIZ = tq8.LIZ()) != null && (linkListUser = (LinkListUser) LIZ.LJIIJJI(showListUser.linkmicIdStr)) != null) {
            user = linkListUser.user;
        }
        String LIZLLL = C05170If.LIZLLL(user);
        o.LJIIIIZZ(LIZLLL, "getNickname(linkUser?.user)");
        return LIZLLL;
    }
}
