package com.bytedance.android.live.liveinteract.multiguestv3.main.show.guest;

import X.C0NB;
import X.C221108m2;
import X.C29306Beo;
import X.C62822Ol8;
import X.C75342Tha;
import X.C76548U2m;
import X.C76574U3m;
import X.U2R;
import Y.AObserverS81S0100000_13;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.event.MultiGuestLiveShowPanelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowAudienceAndGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowWidgetDestroyTimeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public final class LiveShowGuestWidget extends BaseLiveShowWidget {
    public final FrameLayout LJLLJ;
    public U2R LJLLL;
    public boolean LJLLLL;
    public final AObserverS81S0100000_13 LJLLLLLL;
    public final AObserverS81S0100000_13 LJLZ;
    public final AObserverS81S0100000_13 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C75342Tha LL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C0NB.LIZIZ("LiveShowGuestWidget", "onDestroy");
        if (C76548U2m.LIZLLL) {
            C76548U2m.LJIIL();
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        U2R u2r = this.LJLLL;
        if (u2r != null) {
            C29306Beo.LJJJJ(u2r);
        }
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

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Long l;
        super.onCreate();
        C0NB.LIZIZ("LiveShowGuestWidget", "onCreate");
        BaseLiveShowAudienceAndGuestViewModel baseLiveShowAudienceAndGuestViewModel = (BaseLiveShowAudienceAndGuestViewModel) this.LJLILLLLZI;
        if (baseLiveShowAudienceAndGuestViewModel != null) {
            baseLiveShowAudienceAndGuestViewModel.LJLIL.observe(this, this.LJZ);
            baseLiveShowAudienceAndGuestViewModel.LJLILLLLZI.observe(this, this.LJLLLLLL);
            baseLiveShowAudienceAndGuestViewModel.LJLL.observe(this, this.LJLZ);
        }
        DataChannelGlobal.LJLJJI.ov0(MultiGuestLiveShowPanelEvent.class, this, new AqS179S0100000_13(this, 182));
        if (this.LJLILLLLZI != null) {
            l = Long.valueOf(BaseLiveShowViewModel.ov0());
        } else {
            l = null;
        }
        if (l == null || (this.LJLILLLLZI != null && BaseLiveShowViewModel.ov0() == 0)) {
            this.LJLLLL = true;
        } else {
            LiveShowGuestViewModel liveShowGuestViewModel = (LiveShowGuestViewModel) this.LJLILLLLZI;
            if (liveShowGuestViewModel != null) {
                liveShowGuestViewModel.qv0(true);
            }
        }
        C76548U2m.LIZLLL = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveShowGuestWidget(FrameLayout container) {
        super(LiveShowGuestViewModel.class);
        o.LJIIIZ(container, "container");
        this.LJLLJ = container;
        this.LJLLLLLL = new AObserverS81S0100000_13(this, 42);
        this.LJLZ = new AObserverS81S0100000_13(this, 40);
        this.LJZ = new AObserverS81S0100000_13(this, 41);
        this.LJZI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 101));
        this.LJZL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 100));
        this.LL = new C75342Tha(this);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget
    public final String LJZI(ShowListUser showListUser) {
        o.LJIIIZ(showListUser, "showListUser");
        return showListUser.nickname;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFZ(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.show.guest.LiveShowGuestWidget.LLFZ(java.lang.String):void");
    }
}
