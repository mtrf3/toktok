package com.bytedance.android.live.liveinteract.multiguestv3.main.show.anchor;

import X.AbstractC73638SvC;
import X.C03880Dg;
import X.C0NB;
import X.C221108m2;
import X.C28467BFf;
import X.C29306Beo;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C73318Sq2;
import X.C75271TgR;
import X.C75442TjC;
import X.C76548U2m;
import X.C76574U3m;
import X.C76800UCe;
import X.DialogC76540U2e;
import X.InterfaceC65784Pro;
import X.InterfaceC75092TdY;
import X.InterfaceC92693kP;
import X.T28;
import X.TQA;
import X.U2W;
import X.U35;
import X.U37;
import X.U3A;
import X.U3D;
import X.U3L;
import X.U3U;
import X.U3W;
import Y.AObserverS81S0100000_13;
import Y.AfS65S0100000_13;
import Y.IDDListenerS152S0100000_13;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.api.event.MultiGuestLiveShowPanelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowWidgetDestroyTimeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public final class LiveShowAnchorWidget extends BaseLiveShowWidget implements InterfaceC75092TdY {
    public final FrameLayout LJLLJ;
    public DialogC76540U2e LJLLL;
    public U3D LJLLLL;
    public U2W LJLLLLLL;
    public boolean LJLZ;
    public final C62822Ol8 LJZ;
    public final U37 LJZI;
    public final U3W LJZL;
    public final U3A LL;
    public final AObserverS81S0100000_13 LLD;
    public final C75442TjC LLF;
    public final AObserverS81S0100000_13 LLFF;
    public final AObserverS81S0100000_13 LLFFF;
    public final AObserverS81S0100000_13 LLFII;
    public final C62822Ol8 LLFZ;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LLFZ() {
        U2W u2w = this.LJLLLLLL;
        if (u2w != null) {
            C29306Beo.LJJJJ(u2w);
        }
        U3D u3d = this.LJLLLL;
        if (u3d != null) {
            C29306Beo.LJJJJ(u3d);
        }
        DialogC76540U2e dialogC76540U2e = this.LJLLL;
        if (dialogC76540U2e != null) {
            C29306Beo.LJJJJ(dialogC76540U2e);
        }
    }

    public final void LLII() {
        List<LinkPlayerInfo> list;
        C75271TgR c75271TgR;
        Long l;
        MutableLiveData<ShowConfig> mutableLiveData;
        ShowConfig value;
        MutableLiveData<ShowConfig> mutableLiveData2;
        ShowConfig value2;
        MutableLiveData<C75271TgR> mutableLiveData3;
        MutableLiveData<List<LinkPlayerInfo>> mutableLiveData4;
        U2W u2w = this.LJLLLLLL;
        if (u2w != null && u2w.isShowing()) {
            return;
        }
        if (this.LJLLLLLL == null) {
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            U37 u37 = this.LJZI;
            LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) this.LJLILLLLZI;
            Boolean bool = null;
            if (liveShowAnchorViewModel != null && (mutableLiveData4 = liveShowAnchorViewModel.LJLL) != null) {
                list = mutableLiveData4.getValue();
            } else {
                list = null;
            }
            BaseLiveShowViewModel baseLiveShowViewModel = this.LJLILLLLZI;
            if (baseLiveShowViewModel != null && (mutableLiveData3 = baseLiveShowViewModel.LJLILLLLZI) != null) {
                c75271TgR = mutableLiveData3.getValue();
            } else {
                c75271TgR = null;
            }
            BaseLiveShowViewModel baseLiveShowViewModel2 = this.LJLILLLLZI;
            if (baseLiveShowViewModel2 != null && (mutableLiveData2 = baseLiveShowViewModel2.LJLJJI) != null && (value2 = mutableLiveData2.getValue()) != null) {
                l = Long.valueOf(value2.durationPerGuest);
            } else {
                l = null;
            }
            BaseLiveShowViewModel baseLiveShowViewModel3 = this.LJLILLLLZI;
            if (baseLiveShowViewModel3 != null && (mutableLiveData = baseLiveShowViewModel3.LJLJJI) != null && (value = mutableLiveData.getValue()) != null) {
                bool = Boolean.valueOf(value.allowOpenMicFreely);
            }
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            this.LJLLLLLL = new U2W(context, u37, list, c75271TgR, l, bool, dataChannel);
        }
        U2W u2w2 = this.LJLLLLLL;
        if (u2w2 != null && !new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/show/anchor/LiveShowAnchorListDialog", "show", u2w2, new Object[0], "void", new C65300Pk0(false, "()V", "-5134989465411479383")).LIZ) {
            u2w2.show();
        }
        U2W u2w3 = this.LJLLLLLL;
        if (u2w3 != null) {
            u2w3.setOnDismissListener(new IDDListenerS152S0100000_13(this, 5));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C0NB.LIZIZ("LiveShowAnchorWidget", "onDestroy");
        U35 LIZ = TQA.LIZ();
        if (LIZ != null && LIZ.LJIIJJI()) {
            C76548U2m.LJIIJJI();
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        LLFZ();
        if (this.LLFZ.isInitialized()) {
            ((C76574U3m) this.LLFZ.getValue()).LIZIZ();
        }
        ((C73318Sq2) this.LJZ.getValue()).LIZLLL();
        MultiGuestLiveShowWidgetDestroyTimeSetting multiGuestLiveShowWidgetDestroyTimeSetting = MultiGuestLiveShowWidgetDestroyTimeSetting.INSTANCE;
        if (multiGuestLiveShowWidgetDestroyTimeSetting.isFix()) {
            super.onDestroy();
        }
        LJLZ();
        U35 LIZ2 = TQA.LIZ();
        if (LIZ2 != null) {
            LIZ2.destroy();
        }
        if (!multiGuestLiveShowWidgetDestroyTimeSetting.isFix()) {
            super.onDestroy();
        }
    }

    @Override // X.InterfaceC75092TdY
    public final void LJJIIZ() {
        U35 LIZ;
        AbstractC73638SvC<C28467BFf<GetShowSettingsResponse.ResponseData>> showSetting;
        U35 LIZ2 = TQA.LIZ();
        if (LIZ2 != null && LIZ2.LJII() == 3) {
            return;
        }
        LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) this.LJLILLLLZI;
        if (liveShowAnchorViewModel != null) {
            liveShowAnchorViewModel.pv0(false);
        }
        U35 LIZ3 = TQA.LIZ();
        if (LIZ3 != null && LIZ3.LJII() == 0 && this.LJLZ) {
            this.LJLZ = false;
            LiveShowAnchorViewModel liveShowAnchorViewModel2 = (LiveShowAnchorViewModel) this.LJLILLLLZI;
            if (liveShowAnchorViewModel2 != null && (LIZ = TQA.LIZ()) != null && (showSetting = LIZ.getShowSetting(new GetShowSettingsParams())) != null) {
                InterfaceC92693kP LJJII = T28.LIZLLL(showSetting).LJJII(new AfS65S0100000_13(liveShowAnchorViewModel2, 221), U3L.LJLIL);
                C73318Sq2 cb = liveShowAnchorViewModel2.nv0();
                o.LJIIIZ(cb, "cb");
                cb.LIZ(LJJII);
            }
        }
        LLII();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget
    public final void LJLZ() {
        super.LJLZ();
        this.LJLZ = true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C0NB.LIZIZ("LiveShowAnchorWidget", "onCreate");
        LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) this.LJLILLLLZI;
        if (liveShowAnchorViewModel != null) {
            liveShowAnchorViewModel.LJLILLLLZI.observe(this, this.LLD);
            liveShowAnchorViewModel.LJLIL.observe(this, this.LLFF);
            liveShowAnchorViewModel.LJLJJI.observe(this, this.LLFFF);
            liveShowAnchorViewModel.LJLL.observe(this, this.LLFII);
        }
        DataChannelGlobal.LJLJJI.ov0(MultiGuestLiveShowPanelEvent.class, this, new AqS179S0100000_13(this, 175));
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        C0NB.LIZIZ("LiveShowAnchorWidget", "onPause");
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStart() {
        super.onStart();
        C0NB.LIZIZ("LiveShowAnchorWidget", "onStart");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget, com.bytedance.android.widget.Widget
    public final void onStop() {
        super.onStop();
        C0NB.LIZIZ("LiveShowAnchorWidget", "onStop");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveShowAnchorWidget(FrameLayout mAnchorContainer) {
        super(LiveShowAnchorViewModel.class);
        o.LJIIIZ(mAnchorContainer, "mAnchorContainer");
        this.LJLLJ = mAnchorContainer;
        this.LJLZ = true;
        this.LJZ = C221108m2.LIZIZ(U3U.LJLIL);
        this.LJZI = new U37(this);
        this.LJZL = new U3W(this);
        this.LL = new U3A(this);
        this.LLD = new AObserverS81S0100000_13(this, 34);
        this.LLF = new C75442TjC(this);
        this.LLFF = new AObserverS81S0100000_13(this, 33);
        this.LLFFF = new AObserverS81S0100000_13(this, 32);
        this.LLFII = new AObserverS81S0100000_13(this, 31);
        this.LLFZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 95));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget
    public final String LJZI(ShowListUser showListUser) {
        o.LJIIIZ(showListUser, "showListUser");
        return showListUser.nickname;
    }

    public final void LLIIII(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Boolean bool;
        U2W u2w = this.LJLLLLLL;
        if (u2w != null) {
            bool = Boolean.valueOf(u2w.LJZ);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            U2W u2w2 = this.LJLLLLLL;
            if (u2w2 == null) {
                return;
            }
            u2w2.LJZI = interfaceC65784Pro;
            return;
        }
        interfaceC65784Pro.invoke();
    }
}
