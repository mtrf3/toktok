package com.ss.android.ugc.aweme.feed.adapter;

import X.B4U;
import X.B73;
import X.C107794Kx;
import X.C1IY;
import X.C1IZ;
import X.C232629Ba;
import X.C28156B3g;
import X.C28423BDn;
import X.C2U8;
import X.C30176Bsq;
import X.C30326BvG;
import X.C32537Cpp;
import X.C3G4;
import X.C52556Kjw;
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
import X.C86332XuS;
import X.C86340Xua;
import X.C86343Xud;
import X.C86350Xuk;
import X.C86359Xut;
import X.C86361Xuv;
import X.C86362Xuw;
import X.C86393XvR;
import X.C9BZ;
import X.EnumC32070CiI;
import X.EnumC79342VBy;
import X.IG8;
import X.InterfaceC28737BPp;
import X.InterfaceC65350Pko;
import X.LFH;
import X.OSZ;
import X.QD3;
import X.RunnableC78497UrN;
import X.VFU;
import X.X1D;
import X.XJ8;
import Y.AObjectS150S0100000_15;
import Y.AObserverS81S0100000_13;
import Y.AObserverS82S0100000_14;
import Y.AObserverS83S0100000_15;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.message.LiveMessagePreviewSetting;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.ab.PreviewGuideData;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.BgWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.BottomTipsWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.CoverWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.EcLiveFeedCardWidgetV1;
import com.ss.android.ugc.aweme.feed.adapter.widget.EcLiveFeedCardWidgetV2;
import com.ss.android.ugc.aweme.feed.adapter.widget.GiftEffectWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.InteractionContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.LiveInfoContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.LongPressWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.NameWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ReportWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.SCMLabelWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ShowInfoWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.TitleWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdDescLabelWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdProductBannerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.bc.BcToggleInfoWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.PreviewEnterRoomGuideWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.MaskLayerAndWarningVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.MaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.ReportPreviewMaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.SubscribeMaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.WarningInfoWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.subscribe.SubscribeMaskLayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.share.LivePreviewShareVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.share.ShareWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.videobottomblock.VideoBottomBarBlockWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.videobottomblock.VideoBottomBlockVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.live.TopFrameSummary;
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
public final class FeedLiveViewHolderNew extends BaseFeedLiveViewHolder implements C3G4 {
    public static final /* synthetic */ int LJZL = 0;
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
    public final MaskLayerWidget LJLLLLLL;
    public final ShowInfoWidget LJLZ;
    public final PreviewEnterRoomGuideWidget LJZ;
    public final SubscribeMaskLayerWidget LJZI;

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

    public final SubscribeMaskLayerVM LJZL() {
        return (SubscribeMaskLayerVM) this.LJLLL.getValue();
    }

    public final ViewHolderStatusVM LL() {
        return (ViewHolderStatusVM) this.LJLJLLL.getValue();
    }

    public final void LLFII() {
        C86343Xud c86343Xud = this.LJLJJLL;
        LiveRoomStruct liveRoomStruct = c86343Xud.LIZIZ;
        if (liveRoomStruct != null) {
            if (c86343Xud.LJ) {
                FeedLiveViewHolderVM LJLZ = LJLZ();
                if (LJLZ != null) {
                    LJLZ.LJZ.setValue(Boolean.TRUE);
                }
                MaskLayerAndWarningVM maskLayerAndWarningVM = (MaskLayerAndWarningVM) this.LJLL.getValue();
                if (maskLayerAndWarningVM != null) {
                    maskLayerAndWarningVM.hv0();
                }
                if (liveRoomStruct.allowPreviewTime == 0 && !this.LJZI.isShowing()) {
                    LLFF(false);
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
        LLF(false);
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
        ViewHolderStatusVM LL = LL();
        if (LL != null && (mutableLiveData = LL.LJLILLLLZI) != null) {
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
        ViewHolderStatusVM LL = LL();
        if (LL != null) {
            LL.LJLL.setValue(C76800UCe.LIZ);
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
        ViewHolderStatusVM LL = LL();
        if (LL != null && (mutableLiveData = LL.LJLJJI) != null) {
            mutableLiveData.setValue(Integer.valueOf(i));
        }
        LivePreviewGuideEnterVM LJZ = LJZ();
        if (LJZ != null) {
            LJZ.mv0();
        }
        SubscribeMaskLayerVM LJZL2 = LJZL();
        if (LJZL2 != null && (nextLiveData = LJZL2.LJLJI) != null) {
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
        LivePreviewPlayerVM LJZI;
        MutableLiveData<C76800UCe> mutableLiveData;
        this.LJLJJLL.LJIIJ = false;
        ViewHolderStatusVM LL = LL();
        if (LL != null && (mutableLiveData = LL.LJLJJL) != null) {
            mutableLiveData.setValue(C76800UCe.LIZ);
        }
        FeedLiveViewHolderVM LJLZ = LJLZ();
        if (LJLZ != null) {
            C2U8.LIZ(new IG8(true));
            if (LJLZ.kv0() != null && (!r0.LJ)) {
                LJLZ.jv0();
            }
        }
        if (this.LJZI.isShowing() && (LJZI = LJZI()) != null) {
            LJZI.gv0(true);
        }
        if (!C78963Uyt.LJIIIIZZ(this.LJLJJLL) && (LJZ = LJZ()) != null) {
            LJZ.pv0();
        }
    }

    public final void LLF(boolean z) {
        LivePreviewPlayerVM LJZI;
        MutableLiveData<C76800UCe> mutableLiveData;
        SubscribeMaskLayerWidget subscribeMaskLayerWidget = this.LJZI;
        if (subscribeMaskLayerWidget.isInitialized()) {
            subscribeMaskLayerWidget.hide();
            C86343Xud LJLZ = subscribeMaskLayerWidget.LJLZ();
            if (LJLZ != null) {
                LJLZ.LJIILLIIL = false;
            }
        }
        if (!z || (LJZI = LJZI()) == null || (mutableLiveData = LJZI.LJLJJL) == null) {
            return;
        }
        mutableLiveData.setValue(C76800UCe.LIZ);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, O] */
    public final void LLFF(boolean z) {
        LiveRoomStruct liveRoomStruct = this.LJLJJLL.LIZIZ;
        if (liveRoomStruct != null) {
            liveRoomStruct.allowPreviewTime = 0L;
        }
        ((C32537Cpp) this.dataChannel.gv0(C28423BDn.class)).LIZ = Boolean.valueOf(z);
        if (!this.LJZI.isInitialized()) {
            RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
            if (recyclableWidgetManager != null) {
                recyclableWidgetManager.load(R.id.fwt, this.LJZI);
                return;
            }
            return;
        }
        this.LJZI.LJZ();
    }

    public final void LLFFF(Aweme aweme) {
        TopFrameSummary topFrameSummary;
        boolean z;
        String str;
        String str2;
        String str3;
        LiveRoomStruct newLiveRoomData;
        TopFrameSummary topFrameSummary2;
        LiveRoomStruct newLiveRoomData2;
        TopFrameSummary topFrameSummary3;
        LiveRoomStruct newLiveRoomData3;
        LiveRoomStruct newLiveRoomData4;
        MutableLiveData<C76800UCe> mutableLiveData;
        long j;
        IMessageManager iMessageManager;
        C86393XvR LJJIJIL;
        long j2;
        SystemClock.currentThreadTimeMillis();
        LiveMessagePreviewSetting liveMessagePreviewSetting = LiveMessagePreviewSetting.INSTANCE;
        String str4 = null;
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
        LIZLLL(aweme);
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
            C30326BvG.LIZ.post(RunnableC78497UrN.LJLIL, null);
        }
        ViewHolderStatusVM LL = LL();
        if (LL != null && (mutableLiveData = LL.LJLJI) != null) {
            mutableLiveData.setValue(C76800UCe.LIZ);
        }
        ViewHolderStatusVM LL2 = LL();
        if (LL2 != null) {
            LL2.gv0();
        }
        LLFII();
        FeedLiveViewHolderVM LJLZ = LJLZ();
        if (LJLZ != null) {
            LJLZ.gv0();
        }
        C78895Uxn.LIZ().LL(new C86359Xut(this));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("abkey = ");
        LIZ2.append(this.LJLJJLL.LJIIZILJ);
        LIZ2.append(", isProgrammedLive = ");
        Aweme aweme2 = this.LJLJJLL.LIZ;
        if (aweme2 != null && (newLiveRoomData4 = aweme2.getNewLiveRoomData()) != null) {
            topFrameSummary = newLiveRoomData4.topFrameSummary;
        } else {
            topFrameSummary = null;
        }
        boolean z2 = true;
        if (topFrameSummary != null) {
            z = true;
        } else {
            z = false;
        }
        LIZ2.append(z);
        LIZ2.append(", isLiveEvent = ");
        Aweme aweme3 = this.LJLJJLL.LIZ;
        if (aweme3 == null || (newLiveRoomData3 = aweme3.getNewLiveRoomData()) == null || newLiveRoomData3.liveEventInfo == null) {
            z2 = false;
        }
        LIZ2.append(z2);
        LIZ2.append(", enterFromMerge = ");
        LIZ2.append(this.LJLJJLL.LIZJ);
        LIZ2.append(", showInfoWidget.isInitialized = ");
        LIZ2.append(this.LJLZ.isInitialized());
        LIZ2.append(", ProgrammedLive title = ");
        Aweme aweme4 = this.LJLJJLL.LIZ;
        if (aweme4 != null && (newLiveRoomData2 = aweme4.getNewLiveRoomData()) != null && (topFrameSummary3 = newLiveRoomData2.topFrameSummary) != null) {
            str = topFrameSummary3.getTitle();
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append(", Live title = ");
        LiveRoomStruct liveRoomStruct3 = this.LJLJJLL.LIZIZ;
        if (liveRoomStruct3 != null) {
            str2 = liveRoomStruct3.title;
        } else {
            str2 = null;
        }
        LIZ2.append(str2);
        Logger.i("PROGRAMMED_LIVE_DEBUG", X1D.LIZIZ(LIZ2));
        C86343Xud c86343Xud2 = this.LJLJJLL;
        if (c86343Xud2.LJIIZILJ != 0 && C78963Uyt.LJJIJIIJIL(c86343Xud2)) {
            if ((C78963Uyt.LJII(this.LJLJJLL) || C78963Uyt.LJI(this.LJLJJLL)) && !this.LJLZ.isInitialized()) {
                Aweme aweme5 = this.LJLJJLL.LIZ;
                if (aweme5 != null && (newLiveRoomData = aweme5.getNewLiveRoomData()) != null && (topFrameSummary2 = newLiveRoomData.topFrameSummary) != null) {
                    str3 = topFrameSummary2.getTitle();
                } else {
                    str3 = null;
                }
                if (TextUtils.isEmpty(str3)) {
                    LiveRoomStruct liveRoomStruct4 = this.LJLJJLL.LIZIZ;
                    if (liveRoomStruct4 != null) {
                        str4 = liveRoomStruct4.title;
                    }
                    if (TextUtils.isEmpty(str4)) {
                        return;
                    }
                }
                this.subWidgetManager.load(R.id.ia8, this.LJLZ);
                this.LJLZ.show();
            }
        }
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
        ViewHolderStatusVM LL = LL();
        if (LL != null && (mutableLiveData = LL.LJLJJLL) != null) {
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
        ViewHolderStatusVM LL = LL();
        if (LL != null) {
            LL.LJLLI.setValue(Boolean.valueOf(z));
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
        SubscribeMaskLayerVM LJZL2 = LJZL();
        if (LJZL2 != null) {
            LJZL2.hv0();
        }
        FeedLiveViewHolderVM LJLZ = LJLZ();
        if (LJLZ != null) {
            LJLZ.nv0(i);
        }
        LivePreviewPlayerVM LJZI2 = LJZI();
        if (LJZI2 != null) {
            LJZI2.setMute(false);
        }
        ViewHolderStatusVM LL = LL();
        if (LL != null && (mutableLiveData = LL.LJLJL) != null) {
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
            LLFII();
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
        ViewHolderStatusVM LL = LL();
        if (LL != null) {
            LL.LJLJLJ.setValue(C76800UCe.LIZ);
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
        LLF(false);
        SubscribeMaskLayerVM LJZL2 = LJZL();
        if (LJZL2 != null) {
            LJZL2.gv0(false);
        }
        SubscribeMaskLayerVM LJZL3 = LJZL();
        if (LJZL3 != null && (nextLiveData = LJZL3.LJLJI) != null) {
            nextLiveData.setValue(new C86362Xuw());
        }
        IMessageManager iMessageManager = this.LJLJJLL.LJIL;
        if (iMessageManager != null) {
            iMessageManager.stopMessage(new C30176Bsq(true, true, LiveMessagePreviewSetting.INSTANCE.getValue().getStopDisconnectWsDelay()));
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onEvent(C1IY c1iy) {
        NextLiveData<Boolean> nextLiveData;
        FeedLiveViewHolderVM LJLZ = LJLZ();
        if (LJLZ == null || (nextLiveData = LJLZ.LLD) == null) {
            return;
        }
        nextLiveData.setValue(Boolean.FALSE);
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
            r0 = 114(0x72, float:1.6E-43)
            r1.<init>(r3, r5, r0)
            r2.post(r1, r3)
        L59:
            return
        L5a:
            r3.LLFFF(r5)
            goto L59
        L5e:
            r0 = r1
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderNew.LLLZ(int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xud, O] */
    public FeedLiveViewHolderNew(View view, Fragment fragment, String str) {
        super(view, fragment);
        MutableLiveData<Boolean> mutableLiveData;
        NextLiveData<OSZ<Boolean, Boolean>> nextLiveData;
        NextLiveData nextLiveData2;
        MutableLiveData<C86350Xuk> mutableLiveData2;
        NextLiveData<C76800UCe> nextLiveData3;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<EnumC79342VBy> mutableLiveData4;
        ?? c86343Xud = new C86343Xud(str, -9);
        this.LJLJJLL = c86343Xud;
        C65776Prg LIZ = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 543);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        XJ8 xj8 = XJ8.WIDGET;
        this.LJLJL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS160S0100000_10, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C65776Prg LIZ2 = C65352Pkq.LIZ(LivePreviewPlayerVM.class);
        this.LJLJLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ2, 544), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ3 = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        this.LJLJLLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ3, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ3, 545), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ4 = C65352Pkq.LIZ(MaskLayerAndWarningVM.class);
        C5H3 provideViewModelDelegate = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ4, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ4, 546), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LJLL = provideViewModelDelegate;
        C65776Prg LIZ5 = C65352Pkq.LIZ(LivePreviewShareVM.class);
        this.LJLLI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ5, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ5, 547), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ6 = C65352Pkq.LIZ(VideoBottomBlockVM.class);
        this.LJLLILLLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ6, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ6, 548), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ7 = C65352Pkq.LIZ(LivePreviewGuideEnterVM.class);
        this.LJLLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ7, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ7, 549), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ8 = C65352Pkq.LIZ(SubscribeMaskLayerVM.class);
        this.LJLLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ8, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ8, 550), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        View findViewById = view.findViewById(R.id.view_rootview);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.view_rootview)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.LJLLLL = viewGroup;
        this.LJLLLLLL = new MaskLayerWidget();
        this.LJLZ = new ShowInfoWidget();
        this.LJZI = new SubscribeMaskLayerWidget();
        SystemClock.currentThreadTimeMillis();
        RecyclableWidgetManager of = RecyclableWidgetManager.of(fragment, this, view, LiveWidgetProvider.Companion.getInstance(), (FluencyOpt) null);
        setWidgetCallback(of.widgetCallback);
        ((C32537Cpp) this.dataChannel.gv0(C75862Tpy.class)).LIZ = c86343Xud;
        of.createWidget(view, this);
        enableSubWidgetManager();
        this.subWidgetManager.createWidget(view.findViewById(R.id.arq), new BottomTipsWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.view_rootview), new CoverWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.dei), new LivePreviewPlayerWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.dsq), new GiftEffectWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.nh0), new WarningInfoWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.ma9), new NameWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.fzv), new TitleWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.fyn), new ShareWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.long_press_layout), new LongPressWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.n4i), new VideoBottomBarBlockWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.iwt), new ReportWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.dck), new InteractionContainerWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.sq), new AdDescLabelWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.ff5), new LabelContainerWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.fsn), new LiveInfoContainerWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.view_rootview), new BgWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.fss), new BcToggleInfoWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.jbx), new SCMLabelWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.ad_live_product_banner_container), new AdProductBannerWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.fwu), new ReportPreviewMaskLayerWidget());
        this.subWidgetManager.createWidget(view.findViewById(R.id.fwg), new EcLiveFeedCardWidgetV1());
        this.subWidgetManager.createWidget(view.findViewById(R.id.fwh), new EcLiveFeedCardWidgetV2());
        LivePreviewPlayerVM LJZI = LJZI();
        if (LJZI != null && (mutableLiveData4 = LJZI.LJLIL) != null) {
            mutableLiveData4.observe(this, new AObserverS82S0100000_14(this, 69));
        }
        MaskLayerAndWarningVM maskLayerAndWarningVM = (MaskLayerAndWarningVM) provideViewModelDelegate.getValue();
        if (maskLayerAndWarningVM != null && (mutableLiveData3 = maskLayerAndWarningVM.LJLJJL) != null) {
            mutableLiveData3.observe(this, new AObserverS83S0100000_15(this, 98));
        }
        FeedLiveViewHolderVM LJLZ = LJLZ();
        if (LJLZ != null && (nextLiveData3 = LJLZ.LJLLLLLL) != null) {
            nextLiveData3.observe(this, new AObserverS83S0100000_15(this, 99));
        }
        LivePreviewPlayerVM LJZI2 = LJZI();
        if (LJZI2 != null && (mutableLiveData2 = LJZI2.LJLJJI) != null) {
            mutableLiveData2.observe(this, new AObserverS83S0100000_15(this, 100));
        }
        SubscribeMaskLayerVM LJZL2 = LJZL();
        if (LJZL2 != null && (nextLiveData2 = LJZL2.LJLILLLLZI) != null) {
            nextLiveData2.observe(this, new AObserverS82S0100000_14(this, 70));
        }
        FeedLiveViewHolderVM LJLZ2 = LJLZ();
        if (LJLZ2 != null && (nextLiveData = LJLZ2.LJLZ) != null) {
            nextLiveData.observe(this, new AObserverS81S0100000_13(this, 71));
        }
        FeedLiveViewHolderVM LJLZ3 = LJLZ();
        if (LJLZ3 != null) {
            LJLZ3.LL = new AObjectS150S0100000_15(this, 0);
        }
        C86332XuS.LIZ.getClass();
        if (((PreviewGuideData) C86332XuS.LIZJ.getValue()).style > 0) {
            PreviewEnterRoomGuideWidget previewEnterRoomGuideWidget = new PreviewEnterRoomGuideWidget();
            this.LJZ = previewEnterRoomGuideWidget;
            this.subWidgetManager.load(R.id.d7q, previewEnterRoomGuideWidget);
            LivePreviewGuideEnterVM LJZ = LJZ();
            if (LJZ != null && (mutableLiveData = LJZ.LJLILLLLZI) != null) {
                mutableLiveData.observe(this, new AObserverS82S0100000_14(this, 68));
            }
        }
        LFH.LIZIZ.LIZLLL().LJIILLIIL().LJI().LIZIZ(viewGroup, this);
    }
}
