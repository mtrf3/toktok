package com.ss.android.ugc.aweme.feed.adapter;

import X.B4U;
import X.B73;
import X.C107794Kx;
import X.C1IZ;
import X.C232629Ba;
import X.C28156B3g;
import X.C2QN;
import X.C2U8;
import X.C30176Bsq;
import X.C30326BvG;
import X.C32537Cpp;
import X.C3G4;
import X.C52556Kjw;
import X.C52565Kk5;
import X.C53199KuJ;
import X.C53200KuK;
import X.C55045Liz;
import X.C57822Os;
import X.C5H3;
import X.C62532OgS;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73411SrX;
import X.C75862Tpy;
import X.C76800UCe;
import X.C77699UeV;
import X.C78895Uxn;
import X.C78963Uyt;
import X.C86340Xua;
import X.C86343Xud;
import X.C86360Xuu;
import X.C86361Xuv;
import X.C86362Xuw;
import X.C86393XvR;
import X.C9BZ;
import X.EnumC32070CiI;
import X.IG8;
import X.InterfaceC28737BPp;
import X.InterfaceC65350Pko;
import X.LFH;
import X.OSZ;
import X.QD3;
import X.RunnableC78498UrO;
import X.VFU;
import X.XJ8;
import Y.AObjectS150S0100000_15;
import Y.AObserverS81S0100000_13;
import Y.AObserverS83S0100000_15;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.message.LiveMessagePreviewSetting;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.BgWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.CoverWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.LongPressWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.interactwidget.LogicInteractionContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.MaskLayerAndWarningVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.subscribe.SubscribeMaskLayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.share.LivePreviewShareVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.videobottomblock.VideoBottomBlockVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes16.dex */
public final class FeedLiveViewHolderOpt extends BaseFeedLiveViewHolder implements C3G4 {
    public final C86343Xud LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C5H3 LJLL;
    public final C5H3 LJLLI;
    public final C5H3 LJLLILLLL;
    public final C5H3 LJLLJ;
    public final C5H3 LJLLL;
    public final ViewGroup LJLLLL;

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final void o6(C2QN event) {
        o.LJIIIZ(event, "event");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final boolean K7() {
        return this.LJLJJLL.LJ;
    }

    public final FeedLiveViewHolderVM LJLZ() {
        return (FeedLiveViewHolderVM) this.LJLJL.getValue();
    }

    public final LivePreviewGuideEnterVM LJZ() {
        return (LivePreviewGuideEnterVM) this.LJLLJ.getValue();
    }

    public final LivePreviewPlayerVM LJZI() {
        return (LivePreviewPlayerVM) this.LJLJLJ.getValue();
    }

    public final ViewHolderStatusVM LJZL() {
        return (ViewHolderStatusVM) this.LJLJLLL.getValue();
    }

    public final void LLF() {
        C86343Xud c86343Xud = this.LJLJJLL;
        if (c86343Xud.LIZIZ != null) {
            if (c86343Xud.LJ) {
                FeedLiveViewHolderVM LJLZ = LJLZ();
                if (LJLZ != null) {
                    LJLZ.LJZ.setValue(Boolean.TRUE);
                }
                MaskLayerAndWarningVM maskLayerAndWarningVM = (MaskLayerAndWarningVM) this.LJLL.getValue();
                if (maskLayerAndWarningVM != null) {
                    maskLayerAndWarningVM.hv0();
                    return;
                }
                return;
            }
            FeedLiveViewHolderVM LJLZ2 = LJLZ();
            if (LJLZ2 == null) {
                return;
            }
            LJLZ2.rv0();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final boolean R7() {
        return this.LJLJJLL.LJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final void unBind() {
        MutableLiveData<C76800UCe> mutableLiveData;
        InterfaceC28737BPp LJJJJZ;
        this.LJLJJL = -1.0d;
        if (!C53200KuK.LIZ()) {
            LivePerformanceManager LIZ = B4U.LIZ();
            if (LIZ.LJLZ.enable) {
                LIZ.release();
            }
        }
        C86343Xud c86343Xud = this.LJLJJLL;
        c86343Xud.LJ = true;
        c86343Xud.LJIJ = null;
        String str = (String) c86343Xud.LJII.LIZIZ;
        if (str != null && (LJJJJZ = LiveOuterService.LJJJLL().LJJIJIL().LJJJJZ(str)) != null) {
            LJJJJZ.LIZLLL(true);
        }
        EventBus.LIZJ().LJIJ(this);
        if (this.widgetCallback == null) {
            return;
        }
        LivePreviewPlayerVM LJZI = LJZI();
        if (LJZI != null) {
            LJZI.mv0();
        }
        FeedLiveViewHolderVM LJLZ = LJLZ();
        if (LJLZ != null) {
            LJLZ.iv0();
        }
        ViewHolderStatusVM LJZL = LJZL();
        if (LJZL != null && (mutableLiveData = LJZL.LJLILLLLZI) != null) {
            mutableLiveData.setValue(C76800UCe.LIZ);
        }
        IMessageManager iMessageManager = this.LJLJJLL.LJIL;
        if (iMessageManager != null) {
            iMessageManager.destroyMessage();
        }
        LiveOuterService.LJJJLL().LJJIZ().LJJIJIL().LL(null);
    }

    @Override // X.C3G4
    public final void LJIIIZ() {
        int i;
        int i2;
        LivePreviewPlayerVM LJZI = LJZI();
        if (LJZI != null && (i = LJZI.LJLJLLL) != -1 && (i2 = LJZI.LJLL) != -1) {
            LJZI.LJLILLLLZI.setValue(new C86361Xuv(i, i2));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.InterfaceC222408o8
    public final void LJJJJLL() {
        ViewHolderStatusVM LJZL = LJZL();
        if (LJZL != null) {
            LJZL.LJLL.setValue(C76800UCe.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final void onDestroyView() {
        EventBus.LIZJ().LJIJ(this);
        if (C52556Kjw.LIZ()) {
            B73.LIZJ(this);
        }
        if (this.widgetCallback == null) {
            return;
        }
        LivePreviewPlayerVM LJZI = LJZI();
        if (LJZI != null) {
            LJZI.destroy();
        }
        FeedLiveViewHolderVM LJLZ = LJLZ();
        if (LJLZ != null) {
            C86340Xua.LIZ(LJLZ.kv0());
            C73411SrX c73411SrX = LJLZ.LJLLJ;
            if (c73411SrX != null && !c73411SrX.isDisposed()) {
                c73411SrX.dispose();
            }
            LJLZ.LJLLJ = null;
            LJLZ.LJLLL = null;
        }
        LivePreviewGuideEnterVM LJZ = LJZ();
        if (LJZ != null) {
            LJZ.ov0();
            C77699UeV.LIZ.LIZJ();
        }
        IMessageManager iMessageManager = this.LJLJJLL.LJIL;
        if (iMessageManager != null) {
            iMessageManager.destroyMessage();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final void LJJIII(int i) {
        NextLiveData<C86362Xuw> nextLiveData;
        MutableLiveData<Integer> mutableLiveData;
        FeedLiveViewHolderVM LJLZ = LJLZ();
        if (LJLZ != null) {
            LJLZ.pv0(i);
        }
        MaskLayerAndWarningVM maskLayerAndWarningVM = (MaskLayerAndWarningVM) this.LJLL.getValue();
        if (maskLayerAndWarningVM != null) {
            C86340Xua.LIZJ((C86343Xud) maskLayerAndWarningVM.LJLIL.getValue(), false, maskLayerAndWarningVM.gv0());
        }
        ViewHolderStatusVM LJZL = LJZL();
        if (LJZL != null && (mutableLiveData = LJZL.LJLJJI) != null) {
            mutableLiveData.setValue(Integer.valueOf(i));
        }
        LivePreviewGuideEnterVM LJZ = LJZ();
        if (LJZ != null) {
            LJZ.mv0();
        }
        SubscribeMaskLayerVM subscribeMaskLayerVM = (SubscribeMaskLayerVM) this.LJLLL.getValue();
        if (subscribeMaskLayerVM != null && (nextLiveData = subscribeMaskLayerVM.LJLJI) != null) {
            nextLiveData.setValue(new C86362Xuw());
        }
        IMessageManager iMessageManager = this.LJLJJLL.LJIL;
        if (iMessageManager != null) {
            iMessageManager.stopMessage(new C30176Bsq(true, true, LiveMessagePreviewSetting.INSTANCE.getValue().getStopDisconnectWsDelay()));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final void LJJIJIIJIL(int i) {
        LivePreviewGuideEnterVM LJZ;
        MutableLiveData<C76800UCe> mutableLiveData;
        this.LJLJJLL.LJIIJ = false;
        ViewHolderStatusVM LJZL = LJZL();
        if (LJZL != null && (mutableLiveData = LJZL.LJLJJL) != null) {
            mutableLiveData.setValue(C76800UCe.LIZ);
        }
        FeedLiveViewHolderVM LJLZ = LJLZ();
        if (LJLZ != null) {
            C2U8.LIZ(new IG8(true));
            C86343Xud kv0 = LJLZ.kv0();
            if (kv0 != null && (true ^ kv0.LJ)) {
                LJLZ.jv0();
            }
        }
        if (!C78963Uyt.LJIIIIZZ(this.LJLJJLL) && (LJZ = LJZ()) != null) {
            LJZ.pv0();
        }
    }

    public final void LL(Aweme aweme) {
        MutableLiveData<C76800UCe> mutableLiveData;
        long j;
        IMessageManager iMessageManager;
        C86393XvR LJJIJIL;
        long j2;
        LIZLLL(aweme);
        SystemClock.currentThreadTimeMillis();
        LiveMessagePreviewSetting liveMessagePreviewSetting = LiveMessagePreviewSetting.INSTANCE;
        if (liveMessagePreviewSetting.getValue().getEnableMessage()) {
            C86343Xud c86343Xud = this.LJLJJLL;
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null) {
                LiveRoomStruct liveRoomStruct = this.LJLJJLL.LIZIZ;
                if (liveRoomStruct != null) {
                    j2 = liveRoomStruct.id;
                } else {
                    j2 = 0;
                }
                iMessageManager = LJJIJIL.LJJZZIII(j2, this.context, liveMessagePreviewSetting.getValue().getStartMessageInstant(), EnumC32070CiI.PREVIEW);
            } else {
                iMessageManager = null;
            }
            c86343Xud.LJIL = iMessageManager;
        }
        EventBus.LIZJ().LJIILJJIL(this);
        if (!C53200KuK.LIZ()) {
            LivePerformanceManager LIZ = B4U.LIZ();
            LiveRoomStruct liveRoomStruct2 = this.LJLJJI;
            if (liveRoomStruct2 != null) {
                j = liveRoomStruct2.id;
                liveRoomStruct2.getAnchorId();
            } else {
                j = -1;
            }
            LIZ.LLII = j;
            C30326BvG.LIZ.post(RunnableC78498UrO.LJLIL, null);
        }
        ViewHolderStatusVM LJZL = LJZL();
        if (LJZL != null && (mutableLiveData = LJZL.LJLJI) != null) {
            mutableLiveData.setValue(C76800UCe.LIZ);
        }
        ViewHolderStatusVM LJZL2 = LJZL();
        if (LJZL2 != null) {
            LJZL2.gv0();
        }
        LLF();
        FeedLiveViewHolderVM LJLZ = LJLZ();
        if (LJLZ != null) {
            LJLZ.gv0();
        }
        C78895Uxn.LIZ().LL(new C86360Xuu(this));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final void P7(C9BZ c9bz) {
        C86343Xud c86343Xud;
        LivePreviewShareVM livePreviewShareVM = (LivePreviewShareVM) this.LJLLI.getValue();
        if (livePreviewShareVM != null && (c86343Xud = (C86343Xud) livePreviewShareVM.LJLIL.getValue()) != null && c86343Xud.LIZ != null && c9bz != null) {
            livePreviewShareVM.LJLJI.setValue(c9bz);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final void U7(C232629Ba c232629Ba) {
        LivePreviewShareVM livePreviewShareVM = (LivePreviewShareVM) this.LJLLI.getValue();
        if (livePreviewShareVM != null && c232629Ba != null) {
            livePreviewShareVM.LJLJJI.setValue(c232629Ba);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.Xud, O] */
    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.InterfaceC222708oc
    public final void Y2(Aweme aweme) {
        LivePreviewGuideEnterVM LJZ;
        C86393XvR LJJIJIL;
        long j;
        MutableLiveData<C76800UCe> mutableLiveData;
        C86343Xud c86343Xud = this.LJLJJLL;
        c86343Xud.LIZ = aweme;
        LiveRoomStruct liveRoomStruct = c86343Xud.LIZIZ;
        if (liveRoomStruct == null) {
            if (aweme != null) {
                liveRoomStruct = aweme.getNewLiveRoomData();
                if (liveRoomStruct == null) {
                    RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
                    if (roomFeedCellStruct != null) {
                        liveRoomStruct = roomFeedCellStruct.getNewLiveRoomData();
                    }
                }
            }
            liveRoomStruct = null;
        }
        c86343Xud.LIZIZ = liveRoomStruct;
        c86343Xud.LIZJ = C78963Uyt.LJIIL(c86343Xud);
        c86343Xud.LJIIJ = false;
        ((C32537Cpp) this.dataChannel.gv0(C75862Tpy.class)).LIZ = this.LJLJJLL;
        ViewHolderStatusVM LJZL = LJZL();
        if (LJZL != null && (mutableLiveData = LJZL.LJLJJLL) != null) {
            mutableLiveData.setValue(C76800UCe.LIZ);
        }
        FeedLiveViewHolderVM LJLZ = LJLZ();
        if (LJLZ != null) {
            LJLZ.qv0();
        }
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null) {
            C86343Xud c86343Xud2 = this.LJLJJLL;
            IMessageManager iMessageManager = c86343Xud2.LJIL;
            LiveRoomStruct liveRoomStruct2 = c86343Xud2.LIZIZ;
            if (liveRoomStruct2 != null) {
                j = liveRoomStruct2.id;
            } else {
                j = 0;
            }
            LJJIJIL.updateRoomInfo(iMessageManager, j, this.context);
        }
        IMessageManager iMessageManager2 = this.LJLJJLL.LJIL;
        if (iMessageManager2 != null) {
            iMessageManager2.startMessage();
        }
        if (C78963Uyt.LJIIIIZZ(this.LJLJJLL) && (LJZ = LJZ()) != null) {
            LJZ.pv0();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final void Z1(boolean z) {
        ViewHolderStatusVM LJZL = LJZL();
        if (LJZL != null) {
            LJZL.LJLLI.setValue(Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final void j5(C107794Kx c107794Kx) {
        LivePreviewShareVM livePreviewShareVM = (LivePreviewShareVM) this.LJLLI.getValue();
        if (livePreviewShareVM != null && c107794Kx != null) {
            livePreviewShareVM.LJLILLLLZI.setValue(c107794Kx);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final void l8(int i) {
        LivePreviewGuideEnterVM LJZ;
        MutableLiveData<Integer> mutableLiveData;
        super.l8(i);
        C2U8.LIZ(new SuperEntranceEvent(0, false));
        LivePreviewPlayerVM LJZI = LJZI();
        if (LJZI != null) {
            LJZI.kv0();
        }
        SubscribeMaskLayerVM subscribeMaskLayerVM = (SubscribeMaskLayerVM) this.LJLLL.getValue();
        if (subscribeMaskLayerVM != null) {
            subscribeMaskLayerVM.hv0();
        }
        FeedLiveViewHolderVM LJLZ = LJLZ();
        if (LJLZ != null) {
            LJLZ.nv0(i);
        }
        LivePreviewPlayerVM LJZI2 = LJZI();
        if (LJZI2 != null) {
            LJZI2.setMute(false);
        }
        ViewHolderStatusVM LJZL = LJZL();
        if (LJZL != null && (mutableLiveData = LJZL.LJLJL) != null) {
            mutableLiveData.setValue(Integer.valueOf(i));
        }
        MaskLayerAndWarningVM maskLayerAndWarningVM = (MaskLayerAndWarningVM) this.LJLL.getValue();
        if (maskLayerAndWarningVM != null) {
            maskLayerAndWarningVM.LJLILLLLZI = false;
            maskLayerAndWarningVM.hv0();
        }
        if (!C78963Uyt.LJIIIIZZ(this.LJLJJLL) && (LJZ = LJZ()) != null) {
            LJZ.pv0();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final void n8(boolean z) {
        FeedLiveViewHolderVM LJLZ = LJLZ();
        if (LJLZ != null) {
            LJLZ.LLIIIILZ = z;
        }
    }

    @QD3
    public final void onEvent(C28156B3g event) {
        o.LJIIIZ(event, "event");
        LiveRoomStruct liveRoomStruct = this.LJLJJI;
        if (liveRoomStruct != null && liveRoomStruct.id == event.LJLIL) {
            C2U8.LIZ(new C55045Liz(this.LJLJI, this.LJLJJLL.LIZLLL));
        }
    }

    @QD3
    public final void onFollowLiveStatusChange(C1IZ event) {
        o.LJIIIZ(event, "event");
        LiveRoomStruct liveRoomStruct = this.LJLJJI;
        if (liveRoomStruct != null && liveRoomStruct.id == event.LJLIL && event.LJLJI) {
            FeedLiveViewHolderVM LJLZ = LJLZ();
            if (LJLZ != null) {
                C86343Xud kv0 = LJLZ.kv0();
                if (kv0 != null) {
                    kv0.LJ = false;
                }
                LJLZ.LJLJLJ = true;
                LJLZ.LJLJJL = "normal";
            }
            LivePreviewPlayerVM LJZI = LJZI();
            if (LJZI != null) {
                LJZI.LJLLLL.LIZLLL(false);
            }
            LLF();
            if (C53199KuJ.LIZ()) {
                LivePreviewPlayerVM LJZI2 = LJZI();
                if (LJZI2 != null) {
                    LJZI2.destroy();
                    return;
                }
                return;
            }
            LivePreviewPlayerVM LJZI3 = LJZI();
            if (LJZI3 == null) {
                return;
            }
            LJZI3.iv0();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onReportReceive(C62532OgS event) {
        NextLiveData<Boolean> nextLiveData;
        o.LJIIIZ(event, "event");
        String str = event.LJLIL;
        Aweme aweme = this.LJLJI;
        String str2 = null;
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        if (o.LJ(str, str2)) {
            FeedLiveViewHolderVM LJLZ = LJLZ();
            if (LJLZ != null && (nextLiveData = LJLZ.LLD) != null) {
                nextLiveData.setValue(Boolean.FALSE);
            }
            C57822Os.LIZJ(event.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    public final void t7(boolean z) {
        NextLiveData<C86362Xuw> nextLiveData;
        FeedLiveViewHolderVM LJLZ = LJLZ();
        if (LJLZ != null) {
            LJLZ.sv0();
        }
        ViewHolderStatusVM LJZL = LJZL();
        if (LJZL != null) {
            LJZL.LJLJLJ.setValue(C76800UCe.LIZ);
        }
        MaskLayerAndWarningVM maskLayerAndWarningVM = (MaskLayerAndWarningVM) this.LJLL.getValue();
        if (maskLayerAndWarningVM != null) {
            C86340Xua.LIZJ((C86343Xud) maskLayerAndWarningVM.LJLIL.getValue(), false, maskLayerAndWarningVM.gv0());
            maskLayerAndWarningVM.LJLJJI = 100;
        }
        LivePreviewGuideEnterVM LJZ = LJZ();
        if (LJZ != null) {
            LJZ.ov0();
        }
        SubscribeMaskLayerVM subscribeMaskLayerVM = (SubscribeMaskLayerVM) this.LJLLL.getValue();
        if (subscribeMaskLayerVM != null) {
            subscribeMaskLayerVM.gv0(false);
        }
        SubscribeMaskLayerVM subscribeMaskLayerVM2 = (SubscribeMaskLayerVM) this.LJLLL.getValue();
        if (subscribeMaskLayerVM2 != null && (nextLiveData = subscribeMaskLayerVM2.LJLJI) != null) {
            nextLiveData.setValue(new C86362Xuw());
        }
        IMessageManager iMessageManager = this.LJLJJLL.LJIL;
        if (iMessageManager != null) {
            iMessageManager.stopMessage(new C30176Bsq(true, true, LiveMessagePreviewSetting.INSTANCE.getValue().getStopDisconnectWsDelay()));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.InterfaceC56362Jc
    public final void LJJJJJ(int i, boolean z) {
        VideoBottomBlockVM videoBottomBlockVM = (VideoBottomBlockVM) this.LJLLILLLL.getValue();
        if (videoBottomBlockVM != null) {
            videoBottomBlockVM.LJLIL.setValue(new VFU(z, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Xud, O] */
    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C2MA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZ(int r4, com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r3 = this;
            X.Xud r0 = r3.LJLJJLL
            r0.LJI = r4
            r3.LIZLLL(r5)
            X.Xud r2 = r3.LJLJJLL
            r2.LIZ = r5
            com.bytedance.android.livesdk.livesetting.feed.ProgrammedLiveFeedTypeSetting r0 = com.bytedance.android.livesdk.livesetting.feed.ProgrammedLiveFeedTypeSetting.INSTANCE
            int r0 = r0.getValue()
            r2.LJIIZILJ = r0
            r1 = 0
            if (r5 == 0) goto L5e
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r5.getNewLiveRoomData()
            if (r0 != 0) goto L26
            com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct r0 = r5.getRoomFeedCellStruct()
            if (r0 == 0) goto L5e
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r0.getNewLiveRoomData()
        L26:
            r2.LIZIZ = r0
            r2.LJIJ = r1
            X.C55088Ljg.LIZJ(r0)
            java.lang.String r0 = X.C78963Uyt.LJIIL(r2)
            r2.LIZJ = r0
            r0 = 0
            r2.LJIIJ = r0
            X.C78963Uyt.LJIIJ(r2)
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r3.dataChannel
            java.lang.Class<X.Tpy> r0 = X.C75862Tpy.class
            X.Xud r1 = r3.LJLJJLL
            X.Cps r0 = r2.gv0(r0)
            X.Cpp r0 = (X.C32537Cpp) r0
            r0.LIZ = r1
            boolean r0 = X.C52556Kjw.LIZ()
            if (r0 == 0) goto L5a
            X.BvG r2 = X.C30326BvG.LIZ
            Y.ARunnableS32S0200000_13 r1 = new Y.ARunnableS32S0200000_13
            r0 = 115(0x73, float:1.61E-43)
            r1.<init>(r3, r5, r0)
            r2.post(r1, r3)
        L59:
            return
        L5a:
            r3.LL(r5)
            goto L59
        L5e:
            r0 = r1
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderOpt.LLLZ(int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xud, O] */
    public FeedLiveViewHolderOpt(View view, Fragment fragment, String str) {
        super(view, fragment);
        NextLiveData<OSZ<Boolean, Boolean>> nextLiveData;
        NextLiveData<C76800UCe> nextLiveData2;
        ?? c86343Xud = new C86343Xud(str, -9);
        this.LJLJJLL = c86343Xud;
        C65776Prg LIZ = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 551);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        XJ8 xj8 = XJ8.WIDGET;
        this.LJLJL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS160S0100000_10, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C65776Prg LIZ2 = C65352Pkq.LIZ(LivePreviewPlayerVM.class);
        this.LJLJLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ2, 552), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ3 = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        this.LJLJLLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ3, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ3, 553), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ4 = C65352Pkq.LIZ(MaskLayerAndWarningVM.class);
        this.LJLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ4, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ4, 554), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ5 = C65352Pkq.LIZ(LivePreviewShareVM.class);
        this.LJLLI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ5, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ5, 555), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ6 = C65352Pkq.LIZ(VideoBottomBlockVM.class);
        this.LJLLILLLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ6, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ6, 556), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ7 = C65352Pkq.LIZ(LivePreviewGuideEnterVM.class);
        this.LJLLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ7, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ7, 557), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ8 = C65352Pkq.LIZ(SubscribeMaskLayerVM.class);
        this.LJLLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ8, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ8, 558), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        View findViewById = view.findViewById(R.id.view_rootview);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.view_rootview)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.LJLLLL = viewGroup;
        widgetWithoutSyncConfig.setInitVmWithoutSync(((Boolean) C52565Kk5.LIZ.getValue()).booleanValue());
        SystemClock.currentThreadTimeMillis();
        RecyclableWidgetManager of = RecyclableWidgetManager.of(fragment, this, view, LiveWidgetProvider.Companion.getInstance(), (FluencyOpt) null);
        setWidgetCallback(of.widgetCallback);
        ((C32537Cpp) this.dataChannel.gv0(C75862Tpy.class)).LIZ = c86343Xud;
        of.createWidget(viewGroup, this);
        enableSubWidgetManager();
        this.subWidgetManager.createWidget(viewGroup.findViewById(R.id.view_rootview), new CoverWidget());
        this.subWidgetManager.createWidget(viewGroup.findViewById(R.id.dei), new LivePreviewPlayerWidget());
        this.subWidgetManager.createWidget(viewGroup.findViewById(R.id.long_press_layout), new LongPressWidget());
        this.subWidgetManager.createWidget(viewGroup.findViewById(R.id.view_rootview), new BgWidget());
        this.subWidgetManager.load(R.id.i31, LogicInteractionContainerWidget.class);
        FeedLiveViewHolderVM LJLZ = LJLZ();
        if (LJLZ != null && (nextLiveData2 = LJLZ.LJLLLLLL) != null) {
            nextLiveData2.observe(this, new AObserverS83S0100000_15(this, 97));
        }
        FeedLiveViewHolderVM LJLZ2 = LJLZ();
        if (LJLZ2 != null && (nextLiveData = LJLZ2.LJLZ) != null) {
            nextLiveData.observe(this, new AObserverS81S0100000_13(this, 70));
        }
        FeedLiveViewHolderVM LJLZ3 = LJLZ();
        if (LJLZ3 != null) {
            LJLZ3.LL = new AObjectS150S0100000_15(this, 1);
        }
        LFH.LIZIZ.LIZLLL().LJIILLIIL().LJI().LIZIZ(viewGroup, this);
    }
}
