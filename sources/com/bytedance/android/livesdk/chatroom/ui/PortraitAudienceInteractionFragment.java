package com.bytedance.android.livesdk.chatroom.ui;

import X.ActivityC45651qj;
import X.AnonymousClass064;
import X.B4J;
import X.B53;
import X.B73;
import X.B83;
import X.BCN;
import X.BJM;
import X.BT7;
import X.BZI;
import X.BZM;
import X.C0GA;
import X.C0GB;
import X.C0GC;
import X.C0H1;
import X.C0JU;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C14490hZ;
import X.C15380j0;
import X.C15490jB;
import X.C16880lQ;
import X.C1AF;
import X.C1DH;
import X.C20810rl;
import X.C20830rn;
import X.C20890rt;
import X.C20910rv;
import X.C28154B3e;
import X.C28268B7o;
import X.C28329B9x;
import X.C28406BCw;
import X.C28429BDt;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29717BlR;
import X.C29726Bla;
import X.C29S;
import X.C2QZ;
import X.C30024BqO;
import X.C30054Bqs;
import X.C30055Bqt;
import X.C30057Bqv;
import X.C30061Bqz;
import X.C30062Br0;
import X.C30063Br1;
import X.C30064Br2;
import X.C30067Br5;
import X.C30068Br6;
import X.C30071Br9;
import X.C30073BrB;
import X.C30074BrC;
import X.C30076BrE;
import X.C30151BsR;
import X.C30326BvG;
import X.C30627C0h;
import X.C30922CBq;
import X.C31665Cbl;
import X.C32251Oj;
import X.C3C5;
import X.C46571sD;
import X.C46581sE;
import X.C46591sF;
import X.C47061t0;
import X.C51217K8f;
import X.C54973Lhp;
import X.C58521Mxx;
import X.C60903NvH;
import X.C73318Sq2;
import X.C73943T0h;
import X.C76800UCe;
import X.C78949Uyf;
import X.C79004UzY;
import X.C90903hW;
import X.CCJ;
import X.CFX;
import X.CN1;
import X.EnumC30204BtI;
import X.EnumC31509CYf;
import X.EnumC78722Uv0;
import X.HZE;
import X.InterfaceC08170Tt;
import X.InterfaceC28296B8q;
import X.InterfaceC29980Bpg;
import X.InterfaceC30069Br7;
import X.InterfaceC30442Bx8;
import X.KL2;
import X.LDB;
import X.RunnableC51615KNn;
import X.UKC;
import Y.AObjectS134S0100000_5;
import Y.AObjectS21S0001000_5;
import Y.AObjectS22S0001000_6;
import Y.AObjectS39S0201000_5;
import Y.AObjectS42S0101000_5;
import Y.AObjectS43S0101000_7;
import Y.ARunnableS10S0101000_6;
import Y.ARunnableS8S0201000_5;
import Y.AfS36S0101000_5;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.decoration.IDecorationService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.effect.KaraokeRecyclableWidget;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessExitGameEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundEndEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundStartEvent;
import com.bytedance.android.live.liveevent.ILiveEventService;
import com.bytedance.android.live.liveinteract.api.AdjustVideoInteractStreamBottomEvent;
import com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatControlWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.VoiceChatControlWidget;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.live.qa.LoadCustomPollWidget;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.userinfowidget.IUserInfoWidgetService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.chatroom.ui.portrait.PortraitLayeredElementManager;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdk.comp.api.game.linkmic.AbsGameLinkControlWidget;
import com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkControlWidget;
import com.bytedance.android.livesdk.dataChannel.AudienceShowSwitchDefinitionEvent;
import com.bytedance.android.livesdk.dataChannel.ChangeLoadingViewPosition;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenLongClickEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.ScreenClearEvent;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveGiftPollEffectWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveNormalPollEffectWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostRoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveAudienceBottomToolsRtlSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveClearScreenBackOptSetting;
import com.bytedance.android.livesdk.livesetting.other.TtliveGameOtherMaskLayerOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveClearScreenDrawOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadOptimizationV1Setting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetDecorSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2Setting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV3Setting;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchLiveInteractionReuseSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchScrollFpsOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.BadPhonesWatchLiveCommonUIOptSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCustomPollMigrateShortTouchSetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubGoalPinCardAudienceSetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubscriptionPinCardAudienceSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCaptionRecordSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCheckContentViewAttachedSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameLiveStudioSupportCohostSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.quiz.ActQuizWidget;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdk.watch.StartClearScreenEvent;
import com.bytedance.android.livesdk.widget.LiveDebugInfoView;
import com.bytedance.android.livesdk.widget.LiveDetectInfoView;
import com.bytedance.android.livesdk.widget.LiveSubscribeMaskWidget;
import com.bytedance.android.livesdkapi.depend.model.live.CaptionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetProviderProxy;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class PortraitAudienceInteractionFragment extends AbsAudienceInteractionFragment {
    public static final /* synthetic */ int LLF = 0;
    public BaseLinkControlWidget LJLIL;
    public AbsVoiceChatControlWidget LJLILLLLZI;
    public AbsGameLinkControlWidget LJLJI;
    public LiveWidget LJLJJI;
    public LiveWidget LJLJJL;
    public C47061t0 LJLJJLL;
    public C47061t0 LJLJL;
    public boolean LJLJLJ;
    public long LJLL;
    public LiveDebugInfoView LJLLI;
    public LiveDetectInfoView LJLLILLLL;
    public LiveSubscribeMaskWidget LJLLJ;
    public View LJLLL;
    public C2QZ LJLLLLLL;
    public C30055Bqt LJZ;
    public LiveRecyclableWidget LJZI;
    public InterfaceC08170Tt LL;
    public KaraokeRecyclableWidget LLD;
    public boolean LJLJLLL = true;
    public final C73318Sq2 LJLLLL = new C73318Sq2();
    public ActQuizWidget LJLZ = null;
    public C14490hZ LJZL = null;

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final boolean isScreenPortrait() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void changeTextMessageViewHeight() {
        C28429BDt c28429BDt;
        int pn;
        C28429BDt c28429BDt2 = (C28429BDt) this.mDataChannel.kv0(VideoOrientationChangeChannel.class);
        if ((c28429BDt2 != null && !c28429BDt2.LIZ()) || (c28429BDt = (C28429BDt) this.mDataChannel.kv0(VideoOrientationChangeChannel.class)) == null || c28429BDt.LIZIZ <= 0 || !isViewValid() || ((Boolean) this.mDataChannel.kv0(KeyboardStatusChannel.class)).booleanValue() || (pn = pn()) == -1) {
            return;
        }
        this.mDataChannel.qv0(ChangeLoadingViewPosition.class, Integer.valueOf(pn));
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final boolean isScreenCleared() {
        if (this.rootView.findViewById(UKC.LIZ).getTranslationX() != 0.0f) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, X.InterfaceC27469AqH
    public final boolean onBackPressed() {
        if (this.LJLJLJ && LiveClearScreenBackOptSetting.INSTANCE.getValue()) {
            yn(false);
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final RecyclableWidgetManager onCreateWidgetManager() {
        PortraitLayeredElementManager portraitLayeredElementManager = new PortraitLayeredElementManager(getContext(), this, (LayeredConstraintLayout) this.rootView, this.mDataChannel);
        portraitLayeredElementManager.setDrawOptimization(LiveClearScreenDrawOptSetting.INSTANCE.getValue());
        LayeredWidgetManager of = LayeredWidgetManager.Companion.of(WatchMemoryLeakOpt.INSTANCE.settingValue(), this, this.rootView, LiveWidgetProviderProxy.getInstance(), C30326BvG.LIZ, portraitLayeredElementManager, C28329B9x.LIZJ(getContext()), LiveLayoutPreloadOptimizationV1Setting.threadOptimize(true), LiveLayoutPreloadThreadPriority.INSTANCE.getPriority());
        of.setCheckContentViewAttached(LiveCheckContentViewAttachedSetting.INSTANCE.getValue());
        return of;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void onLoadAnchorInfo() {
        if (!((IProgrammedLiveService) CN1.LIZ(IProgrammedLiveService.class)).lj()) {
            this.mWidgetManager.load(R.id.mz0, ((IUserInfoWidgetService) CN1.LIZ(IUserInfoWidgetService.class)).ma0(), !LivePreloadInteractionLayerSetting.INSTANCE.isEnablePreload(this.mDataChannel), new Object[]{new C29726Bla(SystemClock.elapsedRealtime())});
        } else {
            super.onLoadAnchorInfo();
        }
    }

    public final View qn() {
        LiveWidget liveWidget = this.LJLJJI;
        if (liveWidget == null || !liveWidget.isViewValid || getView() != null) {
            View view = getView();
            if (view != null) {
                return view.findViewById(R.id.dpg);
            }
            return null;
        }
        return this.LJLJJI.getView();
    }

    public final void un() {
        View findViewById;
        if (this.mRoom == null || this.LJLLL == null) {
            return;
        }
        if ((!((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() && !((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLiveInhouse()) || (findViewById = this.LJLLL.findViewById(R.id.c3x)) == null) {
            return;
        }
        findViewById.setVisibility(8);
        Boolean bool = C28154B3e.LIZ;
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        findViewById.setVisibility(0);
        if (this.LJLLI == null) {
            this.LJLLI = new LiveDebugInfoView();
        }
        LiveDebugInfoView liveDebugInfoView = this.LJLLI;
        liveDebugInfoView.args = new Object[]{this.mRoom};
        this.mWidgetManager.load(R.id.c3x, liveDebugInfoView);
    }

    public final void vn() {
        View findViewById;
        if (this.mRoom == null || this.LJLLL == null) {
            return;
        }
        if ((!((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() && !((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLiveInhouse()) || (findViewById = this.LJLLL.findViewById(R.id.fvx)) == null) {
            return;
        }
        findViewById.setVisibility(8);
        Boolean bool = B53.LIZ;
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        findViewById.setVisibility(0);
        if (this.LJLLILLLL == null) {
            LiveDetectInfoView liveDetectInfoView = new LiveDetectInfoView();
            this.LJLLILLLL = liveDetectInfoView;
            this.mWidgetManager.load(R.id.fvx, liveDetectInfoView);
        }
        this.LJLLILLLL.args = new Object[]{this.mRoom};
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void actionPause() {
        super.actionPause();
        InterfaceC08170Tt interfaceC08170Tt = this.LL;
        if (interfaceC08170Tt != null) {
            C32251Oj c32251Oj = (C32251Oj) interfaceC08170Tt;
            c32251Oj.LJIIIIZZ = true;
            c32251Oj.LJIIJ.run();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void actionResume() {
        super.actionResume();
        InterfaceC08170Tt interfaceC08170Tt = this.LL;
        if (interfaceC08170Tt != null) {
            ((C32251Oj) interfaceC08170Tt).LJIIIIZZ = false;
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void loadInitWidgetsP0() {
        super.loadInitWidgetsP0();
        B73.LIZIZ(new ARunnableS10S0101000_6(1, this, 8), this.mDataChannel);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void loadWidgetWithFirstFrameP2() {
        super.loadWidgetWithFirstFrameP2();
        B73.LIZIZ(new RunnableC51615KNn(1, this), this.mDataChannel);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void loadWidgetWithRoomP1() {
        super.loadWidgetWithRoomP1();
        B73.LIZIZ(new HZE(1, this), this.mDataChannel);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        View view;
        Room room;
        BZM LIZLLL = B4J.LIZLLL(B4J.LIZ(mo49getActivity()));
        if (LIZLLL != null) {
            LIZLLL.setDragInterceptor(null);
        }
        if (this.LJLJLJ) {
            this.LJLJLJ = false;
            xn("reset", false);
        }
        this.LJLLLL.LIZLLL();
        An("draw");
        C0GB c0gb = C0GB.LIZ;
        DataChannel dataChannel = this.mDataChannel;
        if (dataChannel != null) {
            dataChannel.jv0(c0gb);
            DataChannel dataChannel2 = C0GB.LJ;
            if (dataChannel2 == null || o.LJ(dataChannel, dataChannel2)) {
                C0GC c0gc = C0GB.LIZJ;
                if (c0gc != null) {
                    c0gc.cancel();
                }
                C0GB.LIZJ = null;
                C0GB.LJ = null;
            }
        }
        ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).Lk();
        if (this.LJZ != null && (room = this.mRoom) != null) {
            C30627C0h.LJIJ(room.getId(), this.LJZ);
        }
        super.onDestroy();
        if (WatchMemoryLeakOpt.INSTANCE.removeFragmentTag() && (view = this.rootView) != null) {
            view.setTag(R.id.bq7, null);
        }
        if (this.rootView != null && LiveWatchLiveInteractionReuseSetting.INSTANCE.getEnabled()) {
            if (this.rootView.getParent() instanceof ViewGroup) {
                C16880lQ.LJLLL(this.rootView, (ViewGroup) this.rootView.getParent());
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) this.rootView;
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    if (viewGroup.getChildCount() > 0) {
                        viewGroup.removeAllViews();
                    }
                }
            }
            C20910rv c20910rv = C20910rv.LIZ;
            AnonymousClass064 anonymousClass064 = C20910rv.LJIILJJIL;
            if (anonymousClass064 != null) {
                anonymousClass064.LIZIZ(constraintLayout);
                View view2 = this.rootView;
                o.LJIIIZ(view2, "view");
                C20810rl c20810rl = new C20810rl(R.layout.d55, (ViewGroup) null, (C20830rn) null, (C20890rt) null, false, 56);
                c20810rl.LJI = view2;
                c20910rv.LIZ(c20810rl);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C0GA.LIZLLL(this.mDataChannel, true);
        C14490hZ c14490hZ = this.LJZL;
        if (c14490hZ != null) {
            getView();
            c14490hZ.LIZIZ();
        }
    }

    public final int pn() {
        DataChannel dataChannel;
        int i;
        if (qn() != null && (dataChannel = this.mDataChannel) != null) {
            C28429BDt c28429BDt = (C28429BDt) dataChannel.kv0(VideoOrientationChangeChannel.class);
            if (c28429BDt == null) {
                i = 0;
            } else {
                i = c28429BDt.LIZIZ;
            }
            int LJFF = C15380j0.LJFF(R.dimen.aed);
            int i2 = i - LJFF;
            if (i2 > 0 && i2 < (C15380j0.LJIIJJI() - C15380j0.LJIILIIL()) / 2) {
                return ((i2 - C15380j0.LJFF(R.dimen.ae6)) / 2) + LJFF;
            }
            return (int) KL2.LIZJ(getContext(), 210.0f);
        }
        return -1;
    }

    public static /* synthetic */ C76800UCe on(PortraitAudienceInteractionFragment portraitAudienceInteractionFragment) {
        if (portraitAudienceInteractionFragment.mDataChannel.kv0(RoomChannel.class) == null) {
            return C76800UCe.LIZ;
        }
        C73943T0h.LIZ().LIZIZ(new C28268B7o());
        portraitAudienceInteractionFragment.onInteractionLongPress();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r1.isScreenshot == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r0.isEnableLandscape() == false) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d0  */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.BTF] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Boolean, O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void rn(com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment r9) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment.rn(com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment):void");
    }

    public static void sn(PortraitAudienceInteractionFragment portraitAudienceInteractionFragment) {
        boolean z;
        InterfaceC28296B8q interfaceC28296B8q;
        LiveWidget yG;
        LiveWidget Qz;
        boolean z2;
        boolean z3;
        boolean z4;
        Room room;
        Room room2;
        RoomAuthStatus roomAuthStatus;
        View qn;
        portraitAudienceInteractionFragment.getClass();
        if (LivePreloadInteractionLayerSetting.INSTANCE.isEnablePreload(portraitAudienceInteractionFragment.mDataChannel) && (room2 = portraitAudienceInteractionFragment.mRoom) != null && (roomAuthStatus = room2.mRoomAuthStatus) != null && !roomAuthStatus.isEnableLandscape() && (qn = portraitAudienceInteractionFragment.qn()) != null) {
            qn.setVisibility(8);
        }
        if (portraitAudienceInteractionFragment.mRoom != null) {
            ((IInteractService) CN1.LIZ(IInteractService.class)).fR(portraitAudienceInteractionFragment.mRoom);
        }
        IDecorationService iDecorationService = (IDecorationService) CN1.LIZ(IDecorationService.class);
        LiveRecycleWidgetDecorSetting.INSTANCE.getValue();
        DecorationWrapperWidget Sp0 = iDecorationService.Sp0(portraitAudienceInteractionFragment.mWidgetManager);
        if (!C79004UzY.LJJIFFI(portraitAudienceInteractionFragment.mRoom.getRoomStickerList()) || !C79004UzY.LJJIFFI(portraitAudienceInteractionFragment.mRoom.getDecorationList())) {
            z = true;
        } else {
            z = false;
        }
        portraitAudienceInteractionFragment.mLazyLoadWidgetManager.LIZJ(z, new C51217K8f(0, portraitAudienceInteractionFragment), R.id.fvv, Sp0);
        portraitAudienceInteractionFragment.mWidgetManager.load(R.id.fzm, ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).s80());
        LiveMode liveMode = portraitAudienceInteractionFragment.mLiveMode;
        LiveMode liveMode2 = LiveMode.VIDEO;
        if ((liveMode == liveMode2 || liveMode == LiveMode.LIVE_VOICE) && C1DH.LJJIIJ(portraitAudienceInteractionFragment.mDataChannel)) {
            portraitAudienceInteractionFragment.mWidgetManager.load(R.id.ijo, ((IQAService) CN1.LIZ(IQAService.class)).ck());
        }
        portraitAudienceInteractionFragment.mWidgetManager.load(R.id.fwp, ((ILiveEventService) CN1.LIZ(ILiveEventService.class)).Uh());
        if (C60903NvH.LJJIII(portraitAudienceInteractionFragment.mRoom) && !((IHostCommerce) CN1.LIZ(IHostCommerce.class)).C9()) {
            portraitAudienceInteractionFragment.mWidgetManager.load(R.id.dn0, ((ISlotService) CN1.LIZ(ISlotService.class)).getFrameL2SlotWidget());
        }
        Room room3 = portraitAudienceInteractionFragment.mRoom;
        if (room3 != null && room3.getCommerceStruct() != null && portraitAudienceInteractionFragment.mRoom.getCommerceStruct().commercePermission == 1) {
            portraitAudienceInteractionFragment.mWidgetManager.load(R.id.ckm, ((ISlotService) CN1.LIZ(ISlotService.class)).getFrameEcBarrageSlotWidget());
        }
        IMicRoomService iMicRoomService = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
        if (iMicRoomService != null && (room = portraitAudienceInteractionFragment.mRoom) != null && room.officialChannelInfo != null && room.getId() == portraitAudienceInteractionFragment.mRoom.officialChannelInfo.backupRoomId) {
            portraitAudienceInteractionFragment.mWidgetManager.load(R.id.afk, iMicRoomService.Rn0());
        }
        LiveMode liveMode3 = portraitAudienceInteractionFragment.mLiveMode;
        if (liveMode3 == liveMode2 || liveMode3 == LiveMode.AUDIO) {
            InterfaceC30069Br7 lS = ((IInteractService) CN1.LIZ(IInteractService.class)).lS();
            portraitAudienceInteractionFragment.LJLIL = lS.LJFF(new C30068Br6(portraitAudienceInteractionFragment, lS));
            DataChannel dataChannel = portraitAudienceInteractionFragment.mDataChannel;
            if (dataChannel != null && (interfaceC28296B8q = (InterfaceC28296B8q) dataChannel.kv0(C28406BCw.class)) != null) {
                interfaceC28296B8q.LJIIJJI();
            }
            portraitAudienceInteractionFragment.mWidgetManager.load(R.id.epp, portraitAudienceInteractionFragment.LJLIL);
            BaseLinkControlWidget baseLinkControlWidget = portraitAudienceInteractionFragment.LJLIL;
            if (baseLinkControlWidget != null) {
                ListProtector.add(portraitAudienceInteractionFragment.closeRoomInterceptorList, 0, baseLinkControlWidget);
            }
        } else if (liveMode3 == LiveMode.LIVE_STUDIO || liveMode3 == LiveMode.THIRD_PARTY) {
            if (LiveGameLiveStudioSupportCohostSetting.INSTANCE.isExperimentGroup()) {
                InterfaceC30069Br7 lS2 = ((IInteractService) CN1.LIZ(IInteractService.class)).lS();
                LinkControlWidget LJFF = lS2.LJFF(new C30054Bqs(portraitAudienceInteractionFragment, lS2));
                portraitAudienceInteractionFragment.LJLIL = LJFF;
                portraitAudienceInteractionFragment.mWidgetManager.load(R.id.epp, LJFF);
                BaseLinkControlWidget baseLinkControlWidget2 = portraitAudienceInteractionFragment.LJLIL;
                if (baseLinkControlWidget2 != null) {
                    ListProtector.add(portraitAudienceInteractionFragment.closeRoomInterceptorList, 0, baseLinkControlWidget2);
                }
            }
            GameLinkControlWidget hE = ((IGameLinkMicService) CN1.LIZ(IGameLinkMicService.class)).hE(new C30057Bqv(portraitAudienceInteractionFragment));
            portraitAudienceInteractionFragment.LJLJI = hE;
            if (hE != null) {
                portraitAudienceInteractionFragment.mWidgetManager.load(R.id.dqm, hE);
                ListProtector.add(portraitAudienceInteractionFragment.closeRoomInterceptorList, 0, portraitAudienceInteractionFragment.LJLJI);
            }
        } else if (liveMode3 == LiveMode.LIVE_VOICE) {
            InterfaceC30069Br7 lS3 = ((IInteractService) CN1.LIZ(IInteractService.class)).lS();
            VoiceChatControlWidget LJIIJJI = lS3.LJIIJJI(new C30071Br9(portraitAudienceInteractionFragment, lS3));
            portraitAudienceInteractionFragment.LJLILLLLZI = LJIIJJI;
            portraitAudienceInteractionFragment.mWidgetManager.load(R.id.epp, LJIIJJI);
            AbsVoiceChatControlWidget absVoiceChatControlWidget = portraitAudienceInteractionFragment.LJLILLLLZI;
            if (absVoiceChatControlWidget != null) {
                ListProtector.add(portraitAudienceInteractionFragment.closeRoomInterceptorList, 0, absVoiceChatControlWidget);
            }
        }
        if (!LiveRecycleWidgetV3Setting.INSTANCE.getValue()) {
            portraitAudienceInteractionFragment.mWidgetManager.load(((IShareService) CN1.LIZ(IShareService.class)).lB());
        }
        if (portraitAudienceInteractionFragment.mRoom != null && ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Rb(Long.valueOf(portraitAudienceInteractionFragment.mRoom.getId()))) {
            ActQuizWidget actQuizWidget = new ActQuizWidget();
            portraitAudienceInteractionFragment.LJLZ = actQuizWidget;
            portraitAudienceInteractionFragment.mWidgetManager.load(actQuizWidget);
        }
        portraitAudienceInteractionFragment.un();
        portraitAudienceInteractionFragment.vn();
        if (LiveRecycleWidgetV2Setting.INSTANCE.getValue()) {
            yG = portraitAudienceInteractionFragment.mWidgetManager.getRecyclableWidgetFromCacheOrNew(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).Br(), null, new AObjectS21S0001000_5(0, 1));
            Qz = portraitAudienceInteractionFragment.mWidgetManager.getRecyclableWidgetFromCacheOrNew(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).vN(), null, new AObjectS22S0001000_6(0, 1));
        } else {
            yG = ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).yG();
            Qz = ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).Qz();
        }
        Room room4 = portraitAudienceInteractionFragment.mRoom;
        if (room4 != null && room4.getPictionaryFullInfo() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C30076BrE c30076BrE = portraitAudienceInteractionFragment.mLazyLoadWidgetManager;
        if (yG != null) {
            c30076BrE.getClass();
            if (C58521Mxx.LIZ(C16880lQ.LJLLJ(yG.getClass())) && !z2) {
                portraitAudienceInteractionFragment.messageManager.addMessageListener(EnumC31509CYf.DRAW_GUESS_START_MESSAGE.getIntType(), new C30064Br2(new C30074BrC(yG, c30076BrE, R.id.ch8)));
            } else {
                c30076BrE.LIZ.load(R.id.ch8, yG);
            }
        } else {
            c30076BrE.LIZ.load(R.id.ch8, yG);
        }
        C30076BrE c30076BrE2 = portraitAudienceInteractionFragment.mLazyLoadWidgetManager;
        if (Qz != null) {
            c30076BrE2.getClass();
            if (C58521Mxx.LIZ(C16880lQ.LJLLJ(Qz.getClass())) && !z2) {
                portraitAudienceInteractionFragment.messageManager.addMessageListener(EnumC31509CYf.DRAW_GUESS_START_MESSAGE.getIntType(), new C30062Br0(new C30074BrC(Qz, c30076BrE2, R.id.ch5)));
            } else {
                c30076BrE2.LIZ.load(R.id.ch5, Qz);
            }
        } else {
            c30076BrE2.LIZ.load(R.id.ch5, Qz);
        }
        C0GB c0gb = C0GB.LIZ;
        DataChannel dataChannel2 = portraitAudienceInteractionFragment.mDataChannel;
        if (!C29306Beo.LJIIJ(dataChannel2)) {
            DataChannel dataChannel3 = C0GB.LJ;
            if (dataChannel3 != null) {
                dataChannel3.jv0(c0gb);
            }
            if (C0GB.LIZLLL) {
                C0GC c0gc = C0GB.LIZJ;
                if (c0gc != null) {
                    c0gc.cancel();
                }
                C0GB.LIZLLL = false;
            }
            if (dataChannel2 != null) {
                C0GB.LJ = dataChannel2;
                dataChannel2.mv0(DrawGuessRoundEndEvent.class, c0gb, C46571sD.LJLIL);
                dataChannel2.mv0(DrawGuessRoundStartEvent.class, c0gb, C46581sE.LJLIL);
                dataChannel2.mv0(DrawGuessExitGameEvent.class, c0gb, C46591sF.LJLIL);
            }
        }
        LiveGiftPollEffectWidget bv0 = ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).bv0();
        LiveNormalPollEffectWidget E10 = ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).E10(portraitAudienceInteractionFragment.mWidgetManager);
        if (portraitAudienceInteractionFragment.mRoom.advancedPollInfo != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bv0 != null) {
            C30076BrE c30076BrE3 = portraitAudienceInteractionFragment.mLazyLoadWidgetManager;
            c30076BrE3.getClass();
            if (C58521Mxx.LIZ(C16880lQ.LJLLJ(bv0.getClass())) && !z3) {
                final C30074BrC c30074BrC = new C30074BrC(bv0, c30076BrE3, R.id.fwx);
                portraitAudienceInteractionFragment.messageManager.addMessageListener(EnumC31509CYf.LIVE_POLL_MESSAGE.getIntType(), new OnMessageListener() { // from class: X.Br3
                    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
                    public final void onMessage(IMessage iMessage) {
                        InterfaceC29879Bo3.this.invoke(iMessage);
                    }
                });
            } else {
                c30076BrE3.LIZ.load(R.id.fwx, bv0);
            }
        }
        if (E10 != null) {
            C30076BrE c30076BrE4 = portraitAudienceInteractionFragment.mLazyLoadWidgetManager;
            c30076BrE4.getClass();
            if (C58521Mxx.LIZ(C16880lQ.LJLLJ(E10.getClass())) && !z3) {
                portraitAudienceInteractionFragment.messageManager.addMessageListener(EnumC31509CYf.LIVE_POLL_MESSAGE.getIntType(), new C30063Br1(new C30074BrC(E10, c30076BrE4, R.id.fxi)));
            } else {
                c30076BrE4.LIZ.load(R.id.fxi, E10);
            }
        }
        if (portraitAudienceInteractionFragment.mRoom.advancedPollInfo != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        C30076BrE c30076BrE5 = portraitAudienceInteractionFragment.mLazyLoadWidgetManager;
        Class<? extends LiveRecyclableWidget> pf0 = ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).pf0();
        if (pf0 != null) {
            c30076BrE5.getClass();
            if (C58521Mxx.LIZ(C16880lQ.LJLLJ(pf0)) && !z4) {
                portraitAudienceInteractionFragment.messageManager.addMessageListener(EnumC31509CYf.LIVE_POLL_MESSAGE.getIntType(), new C30061Bqz(new C30073BrB(c30076BrE5, R.id.jm1, pf0), 1));
            } else {
                c30076BrE5.LIZ.load(R.id.jm1, pf0);
            }
        } else {
            c30076BrE5.LIZ.load(R.id.jm1, pf0);
        }
        C30076BrE c30076BrE6 = portraitAudienceInteractionFragment.mLazyLoadWidgetManager;
        Class<? extends LiveRecyclableWidget> z10 = ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).z10();
        if (z10 != null) {
            c30076BrE6.getClass();
            if (C58521Mxx.LIZ(C16880lQ.LJLLJ(z10)) && !z4) {
                final C30073BrB c30073BrB = new C30073BrB(c30076BrE6, R.id.jl9, z10);
                portraitAudienceInteractionFragment.messageManager.addMessageListener(EnumC31509CYf.LIVE_POLL_MESSAGE.getIntType(), new OnMessageListener() { // from class: X.Br4
                    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
                    public final void onMessage(IMessage iMessage) {
                        InterfaceC29879Bo3.this.invoke(iMessage);
                    }
                });
            } else {
                c30076BrE6.LIZ.load(R.id.jl9, z10);
            }
        } else {
            c30076BrE6.LIZ.load(R.id.jl9, z10);
        }
        if (!LiveCustomPollMigrateShortTouchSetting.enableMigrate()) {
            ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).Lk();
            C30627C0h c30627C0h = C30627C0h.LJLIL;
            portraitAudienceInteractionFragment.LJZ = new C30055Bqt(portraitAudienceInteractionFragment);
            Room room5 = portraitAudienceInteractionFragment.mRoom;
            if (room5 != null) {
                C30627C0h.LJIILLIIL(room5.getId(), portraitAudienceInteractionFragment.LJZ);
            }
            boolean LJIIZILJ = C30627C0h.LJIIZILJ(portraitAudienceInteractionFragment.mRoom.getId());
            if (portraitAudienceInteractionFragment.mWidgetManager != null) {
                C30076BrE c30076BrE7 = portraitAudienceInteractionFragment.mLazyLoadWidgetManager;
                Class<? extends LiveRecyclableWidget> z50 = ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).z50();
                if (z50 != null) {
                    c30076BrE7.getClass();
                    if (C58521Mxx.LIZ(C16880lQ.LJLLJ(z50)) && !LJIIZILJ) {
                        portraitAudienceInteractionFragment.mDataChannel.lv0(portraitAudienceInteractionFragment, LoadCustomPollWidget.class, new AObjectS43S0101000_7(1, new C30073BrB(c30076BrE7, R.id.c22, z50), 1));
                    } else {
                        c30076BrE7.LIZ.load(R.id.c22, z50);
                    }
                } else {
                    c30076BrE7.LIZ.load(R.id.c22, z50);
                }
            }
            Room room6 = portraitAudienceInteractionFragment.mRoom;
            if (room6 != null && C30627C0h.LJ(room6.getId())) {
                EnumC30204BtI enumC30204BtI = EnumC30204BtI.CUSTOM_POLL;
                if (!enumC30204BtI.isShowing(portraitAudienceInteractionFragment.mDataChannel) && !enumC30204BtI.isShowingInInteractionDialog(portraitAudienceInteractionFragment.mDataChannel)) {
                    ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).nj0(portraitAudienceInteractionFragment.mDataChannel);
                }
            } else {
                DataChannel dataChannel4 = portraitAudienceInteractionFragment.mDataChannel;
                if (dataChannel4 != null) {
                    dataChannel4.ov0(portraitAudienceInteractionFragment, RoomUserChannel.class, new AObjectS39S0201000_5(portraitAudienceInteractionFragment, c30627C0h, 1));
                }
            }
        }
        if (SubscriptionPinCardAudienceSetting.INSTANCE.isEnable()) {
            portraitAudienceInteractionFragment.mWidgetManager.load(R.id.c2q, ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).dV());
        }
        if (SubGoalPinCardAudienceSetting.INSTANCE.isEnable()) {
            portraitAudienceInteractionFragment.mWidgetManager.load(R.id.knz, ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).dl0());
        }
        if (((Boolean) portraitAudienceInteractionFragment.widgetLoadConditions.LJIIJ.getValue()).booleanValue()) {
            portraitAudienceInteractionFragment.mWidgetManager.load(R.id.bjy, ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Gh());
        }
        Room room7 = portraitAudienceInteractionFragment.mRoom;
        CaptionInfo captionInfo = room7.captionInfo;
        if (captionInfo != null && captionInfo.open && room7.getOwner().getSecret() == 0 && (portraitAudienceInteractionFragment.getContext() == null || portraitAudienceInteractionFragment.getResources().getDisplayMetrics().widthPixels > 360)) {
            portraitAudienceInteractionFragment.mWidgetManager.load(R.id.b5c, ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Ub0());
            portraitAudienceInteractionFragment.mWidgetManager.load(R.id.b4n, ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Rn());
            if (!LiveCaptionRecordSetting.getValue() && portraitAudienceInteractionFragment.mo49getActivity() != null && portraitAudienceInteractionFragment.mo49getActivity().getWindow() != null) {
                portraitAudienceInteractionFragment.mo49getActivity().getWindow().setFlags(FileUtils.BUFFER_SIZE, FileUtils.BUFFER_SIZE);
            }
        } else {
            CaptionInfo captionInfo2 = portraitAudienceInteractionFragment.mRoom.captionInfo;
            if (captionInfo2 != null) {
                captionInfo2.open = false;
            }
            if (!LiveCaptionRecordSetting.getValue() && portraitAudienceInteractionFragment.mo49getActivity() != null && portraitAudienceInteractionFragment.mo49getActivity().getWindow() != null) {
                portraitAudienceInteractionFragment.mo49getActivity().getWindow().clearFlags(FileUtils.BUFFER_SIZE);
            }
        }
        LiveWidget pinCardWidget = ((IGiftService) CN1.LIZ(IGiftService.class)).getPinCardWidget();
        LiveMode liveMode4 = portraitAudienceInteractionFragment.mLiveMode;
        if (liveMode4 == liveMode2 || liveMode4 == LiveMode.LIVE_VOICE) {
            portraitAudienceInteractionFragment.mLazyLoadWidgetManager.LIZ(new LDB(1, portraitAudienceInteractionFragment), R.id.hpi, pinCardWidget, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0179, code lost:
    
        if (X.C29137Bc5.LIZIZ(r6.mRoom) != false) goto L106;
     */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Boolean, O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void tn(com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment r6) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment.tn(com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment):void");
    }

    public final void An(String str) {
        if (this.LJLJLJ && this.LJLL > 0) {
            BZI LIZIZ = C0JU.LIZIZ("livesdk_screen_clear_cancel", str, "clear_type", str, "leave_clear_type");
            LIZIZ.LJIILLIIL(this.mDataChannel);
            LIZIZ.LJJIIJZLJL();
            BZI LIZ = C28787BRn.LIZ("livesdk_clear_screen_play_time");
            LIZ.LJIJJ(Long.valueOf(System.currentTimeMillis() - this.LJLL), "duration");
            LIZ.LJIJJ(str, "clear_type");
            LIZ.LJIILLIIL(this.mDataChannel);
            LIZ.LJJIIJZLJL();
        }
        this.LJLJLJ = false;
        this.LJLL = 0L;
    }

    public final void Cn(String str) {
        if (!this.LJLJLJ) {
            BZI LIZ = C28787BRn.LIZ("livesdk_screen_clear");
            LIZ.LJIJJ(str, "clear_type");
            LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
            LIZ.LJIILLIIL(this.mDataChannel);
            LIZ.LJJIIJZLJL();
        }
        this.LJLJLJ = true;
        this.LJLL = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (MultiCohostRoomLoadingOptSetting.INSTANCE.isEnable()) {
            this.mDataChannel.nv0(LinkCrossRoomStateChangeEvent.class, this, new AObjectS42S0101000_5(3, this, 32));
        } else {
            this.mDataChannel.mv0(LinkCrossRoomStateChangeEvent.class, this, new AObjectS42S0101000_5(3, this, 32));
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int pn = pn();
        if (pn != -1) {
            this.mDataChannel.qv0(ChangeLoadingViewPosition.class, Integer.valueOf(pn));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannel = this.mDataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, AudienceShowSwitchDefinitionEvent.class, new AObjectS42S0101000_5(0, this, 18));
            dataChannel.lv0(this, PublicScreenLongClickEvent.class, new AObjectS42S0101000_5(3, this, 22));
        }
        this.LJLLLL.LIZ(C73943T0h.LIZ().LJ(C30067Br5.class).LJJJJZI(new C54973Lhp(1, this)));
        this.LJLLLL.LIZ(C73943T0h.LIZ().LJ(C30151BsR.class).LJJJJZI(new AfS36S0101000_5(1, this, 23)));
        this.LJLLLL.LIZ(C73943T0h.LIZ().LJ(BT7.class).LJJJJZI(new AfS36S0101000_5(1, this, 24)));
    }

    public final void yn(boolean z) {
        if (z) {
            Cn("draw");
            xn("draw", true);
        } else {
            An("draw");
            xn("draw", false);
            if (!this.mRoom.isOfficial() && !isScreenCleared() && ((C29374Bfu) B83.LIZ().LIZIZ()).isLogin() && ((Boolean) this.widgetLoadConditions.LJI.getValue()).booleanValue()) {
                C0H1.LIZ("pull_type", "draw").putLong("room_id", ((Long) this.mDataChannel.kv0(BCN.class)).longValue());
                B4J.LJ(mo49getActivity(), true);
            }
        }
        DataChannelGlobal.LJLJJI.sv0(ScreenClearEvent.class, Boolean.valueOf(z));
    }

    public final void Dn(C47061t0 c47061t0, EnumC78722Uv0 enumC78722Uv0) {
        if (c47061t0 == null) {
            return;
        }
        if (this.mRoom.background != null) {
            if (MultiCohostRoomLoadingOptSetting.INSTANCE.isEnable()) {
                if (!this.mRoom.background.equals(c47061t0.getTag(c47061t0.getId()))) {
                    C31665Cbl.LJII(c47061t0, this.mRoom.background, enumC78722Uv0);
                }
                c47061t0.setTag(c47061t0.getId(), this.mRoom.background);
            } else {
                C31665Cbl.LJII(c47061t0, this.mRoom.background, enumC78722Uv0);
            }
        } else if (MultiCohostRoomLoadingOptSetting.INSTANCE.isEnable()) {
            if (!"ttlive_bg_anchor_linkmic.png".equals(c47061t0.getTag(c47061t0.getId()))) {
                C15490jB.LIZLLL(c47061t0, CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1"), enumC78722Uv0);
            }
            c47061t0.setTag(c47061t0.getId(), "ttlive_bg_anchor_linkmic.png");
        } else {
            C15490jB.LIZLLL(c47061t0, CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1"), enumC78722Uv0);
        }
        KL2.LJIILLIIL(0, c47061t0);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Room room;
        View findViewById;
        LiveMode liveMode;
        super.onViewCreated(view, bundle);
        this.LJLLL = view;
        view.post(new ARunnableS8S0201000_5(0, this, view, 2));
        this.LJLJJLL = (C47061t0) view.findViewById(R.id.aiy);
        this.LJLJL = (C47061t0) view.findViewById(R.id.aiw);
        DataChannel dataChannel = this.mDataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && ((room.getStreamType() == LiveMode.VIDEO || room.getStreamType() == LiveMode.THIRD_PARTY || room.getStreamType() == LiveMode.SCREEN_RECORD) && (findViewById = view.findViewById(R.id.eq5)) != null)) {
            if (BadPhonesWatchLiveCommonUIOptSetting.INSTANCE.getRemoveTopShadow()) {
                findViewById.setVisibility(8);
            } else {
                findViewById.setBackgroundResource(R.drawable.cfr);
                findViewById.setVisibility(0);
            }
        }
        if (!TtliveGameOtherMaskLayerOptimizeSetting.INSTANCE.showMaskLayer() && ((liveMode = this.mEnterRoomConfig.mRoomsData.streamType) == LiveMode.LIVE_STUDIO || liveMode == LiveMode.THIRD_PARTY || liveMode == LiveMode.SCREEN_RECORD)) {
            this.mDataChannel.ov0(this, VideoOrientationChangeChannel.class, new AObjectS42S0101000_5(2, this, 38));
        }
        C0NB.LIZIZ("1VNExperienceV1", "AbsInteractionFragment_onViewCreated");
        if (this.mDataChannel != null) {
            if (MultiCohostRoomLoadingOptSetting.INSTANCE.isEnable()) {
                this.mDataChannel.ov0(this, AdjustVideoInteractStreamBottomEvent.class, new AObjectS42S0101000_5(1, this, 2));
            } else {
                this.mDataChannel.lv0(this, AdjustVideoInteractStreamBottomEvent.class, new AObjectS42S0101000_5(1, this, 2));
            }
            this.mDataChannel.lv0(this, SubOnlyLiveAudienceStatusChannel.class, new AObjectS39S0201000_5(0, this, view, 2));
        }
        this.LJLLLLLL = (C2QZ) view.findViewById(R.id.if5);
        this.LL = ((IEffectService) CN1.LIZ(IEffectService.class)).createMagicGestureEffectAudienceHelper((ViewGroup) view, new AObjectS134S0100000_5(this, 2));
    }

    public final void xn(String str, boolean z) {
        String str2;
        this.mDataChannel.qv0(StartClearScreenEvent.class, new C29717BlR(z, str));
        InterfaceC29980Bpg hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(this.mRoom.getId());
        if (hq0 != null) {
            hq0.LJIIL(z);
            Room room = this.mRoom;
            o.LJIIIZ(room, "room");
            if (hq0.isEnabled()) {
                String str3 = "disabled_due_to_landscape_mode";
                String str4 = "enabled";
                if (hq0.isPaused()) {
                    str2 = "disabled_due_to_clear_screen";
                } else if (!hq0.LIZIZ()) {
                    str2 = "disabled_due_to_landscape_mode";
                } else {
                    str2 = "enabled";
                }
                if (hq0.LJIIIZ()) {
                    str3 = "enabled";
                }
                if (!hq0.LJIILL()) {
                    str4 = "disabled_due_to_being_audience_and_mic_room";
                }
                C30024BqO.LIZ(room.getId(), ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), room.getOwnerUserId(), "enabled", str2, str3, str4);
            }
        }
        if (z) {
            InterfaceC30442Bx8.LLLI.LIZ(Boolean.TRUE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LJII;
        o.LJIIIZ(inflater, "inflater");
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("DebugFullVideoButton", "PortraitAudienceInteractionFragment. load R.layout.ttlive_fragment_portrait_interaction_constraint");
        }
        boolean enabled = LiveWatchLiveInteractionReuseSetting.INSTANCE.getEnabled();
        C29S c29s = null;
        if (LiveWatchScrollFpsOptSetting.INSTANCE.enable("interaction") || enabled) {
            LJII = C20910rv.LIZ.LJII(R.layout.d55);
        } else {
            LJII = null;
        }
        if (LJII == null) {
            LJII = C16880lQ.LLLLIILL(inflater, R.layout.d55, viewGroup, false);
        }
        if (enabled && C20910rv.LJIILJJIL == null) {
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            anonymousClass064.LJII((ConstraintLayout) LJII);
            C20910rv.LJIILJJIL = anonymousClass064;
        }
        if (LiveAudienceBottomToolsRtlSetting.getValue() == 1) {
            ((C1AF) LJII.findViewById(R.id.aqb)).setType(6);
        }
        this.LJZL = new C14490hZ(this.mDataChannel);
        if (mo49getActivity() != null && mo49getActivity().getWindow() != null) {
            this.LJZL.LIZ(LJII, mo49getActivity());
        }
        C78949Uyf.LJJJJ(LJII, this);
        if (!(LJII instanceof View)) {
            LJII = null;
        }
        if (LJII != null) {
            try {
                ViewTreeLifecycleOwner.set(LJII, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LJII, this);
                C10A.LIZIZ(LJII, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LJII;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final boolean onInteractionFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z = false;
        if (motionEvent != null && motionEvent2 != null) {
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) > 200.0f && Math.abs(f) > 100.0f) {
                if (!CCJ.LIZ(getContext()) ? x > 0.0f : x < 0.0f) {
                    z = true;
                }
                yn(z);
                return true;
            }
        }
        return false;
    }
}
