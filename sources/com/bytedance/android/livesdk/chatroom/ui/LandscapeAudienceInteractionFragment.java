package com.bytedance.android.livesdk.chatroom.ui;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnonymousClass064;
import X.B3N;
import X.B9E;
import X.BNM;
import X.BZI;
import X.C03660Ck;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15490jB;
import X.C16880lQ;
import X.C17M;
import X.C1K5;
import X.C1PM;
import X.C20810rl;
import X.C20830rn;
import X.C20890rt;
import X.C20910rv;
import X.C28297B8r;
import X.C28329B9x;
import X.C28787BRn;
import X.C29306Beo;
import X.C29927Bop;
import X.C29S;
import X.C30050Bqo;
import X.C30051Bqp;
import X.C30317Bv7;
import X.C30326BvG;
import X.C30744C4u;
import X.C32014ChO;
import X.C3C5;
import X.C73411SrX;
import X.C73849Syb;
import X.C73933Szx;
import X.C73943T0h;
import X.C73969T1h;
import X.C76800UCe;
import X.C77800Ug8;
import X.C78949Uyf;
import X.C7MY;
import X.C90903hW;
import X.CCJ;
import X.CFX;
import X.CN1;
import X.EnumC30108Brk;
import X.EnumC31509CYf;
import X.InterfaceC29856Bng;
import X.InterfaceC29980Bpg;
import X.InterfaceC29986Bpm;
import X.InterfaceC30442Bx8;
import X.T16;
import X.U44;
import X.X1D;
import Y.AObjectS144S0100000_5;
import Y.AObjectS42S0101000_5;
import Y.AObjectS5S0010000_5;
import Y.AfS36S0101000_5;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.livesdk.BlockMessageEvent;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.chatroom.ui.landscape.LandscapeLayeredElementManager;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveDrawerEntranceWidget;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidgetLandV2;
import com.bytedance.android.livesdk.comp.api.game.linkmic.AbsGameLinkControlWidget;
import com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkControlWidget;
import com.bytedance.android.livesdk.dataChannel.HourlyRankRewardVisibilityChangedChannel;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadOptimizationV1Setting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV3Setting;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchLiveInteractionReuseSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameLandscapeDesignOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveEntranceOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveGestureOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCheckContentViewAttachedSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameLiveStudioSupportCohostSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetProviderProxy;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class LandscapeAudienceInteractionFragment extends AbsAudienceInteractionFragment implements InterfaceC29986Bpm {
    public static final /* synthetic */ int LJLLL = 0;
    public View LJLIL;
    public boolean LJLILLLLZI;
    public long LJLJI;
    public C73411SrX LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJL;
    public LiveWidget LJLJLJ;
    public LiveDrawerEntranceWidget LJLJLLL;
    public AbsGameLinkControlWidget LJLL;
    public C28297B8r LJLLI;
    public boolean LJLJJLL = InterfaceC30442Bx8.LLLI.LIZJ().booleanValue();
    public final C73849Syb<Boolean> LJLLILLLL = C73849Syb.LJJZZI(Boolean.FALSE);
    public C73411SrX LJLLJ = null;

    @Override // X.InterfaceC29986Bpm
    public final String A4() {
        return "LandscapeAudienceInteractionFragment";
    }

    @Override // X.InterfaceC29986Bpm
    public final /* synthetic */ void dc(LikeHelper likeHelper, String str) {
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final boolean isScreenPortrait() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final RecyclableWidgetManager onCreateWidgetManager() {
        LayeredWidgetManager of = LayeredWidgetManager.Companion.of(WatchMemoryLeakOpt.INSTANCE.settingValue(), this, this.rootView, LiveWidgetProviderProxy.getInstance(), C30326BvG.LIZ, new LandscapeLayeredElementManager(getContext(), this, (LayeredConstraintLayout) getView().findViewById(R.id.hif), this.mDataChannel), C28329B9x.LIZJ(getContext()), LiveLayoutPreloadOptimizationV1Setting.threadOptimize(true));
        of.setCheckContentViewAttached(LiveCheckContentViewAttachedSetting.INSTANCE.getValue());
        return of;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String LIZ;
        IMessageManager iMessageManager;
        View view;
        InterfaceC29980Bpg hq0;
        C28297B8r c28297B8r = this.LJLLI;
        if (c28297B8r != null) {
            try {
                DataChannel dataChannel = c28297B8r.LJLIL;
                if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
                    iMessageManager.removeMessageListener(c28297B8r);
                }
            } catch (Exception e) {
                if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
                    StackTraceElement LJ = C32014ChO.LJ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ = C77800Ug8.LIZLLL(U44.BIZ, LIZ2, "_GameCohostSeiListener_", LJ, LIZ2);
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ = C17M.LIZ(U44.BIZ, LIZ3, "_GameCohostSeiListener_", 66, LIZ3);
                }
                C32014ChO.LIZJ(LIZ, "removeMessageListener failed", e.getMessage());
            }
            DataChannel dataChannel2 = c28297B8r.LJLIL;
            if (dataChannel2 != null) {
                dataChannel2.jv0(c28297B8r);
            }
        }
        DataChannel dataChannel3 = this.mDataChannel;
        dataChannel3.getClass();
        dataChannel3.jv0(this);
        if (this.mRoom != null && (hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(this.mRoom.getId())) != null) {
            hq0.LJIILJJIL(this);
        }
        C73411SrX c73411SrX = this.LJLLJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
            this.LJLLJ = null;
        }
        tn();
        super.onDestroy();
        HashMap LIZJ = C03660Ck.LIZJ("room_orientation", "landscape");
        C7MY.LJFF(System.currentTimeMillis(), this.LJLJI, LIZJ, "duration");
        BZI LIZ4 = C28787BRn.LIZ("livesdk_transverse_screen_duration");
        LIZ4.LJJIFFI(LIZJ);
        LIZ4.LJIIIZ("live");
        LIZ4.LJIIL("click");
        LIZ4.LJIIJJI("live_landscape");
        LIZ4.LJIILLIIL(this.mDataChannel);
        LIZ4.LJJIIJZLJL();
        C30317Bv7.LJFF(1);
        if (WatchMemoryLeakOpt.INSTANCE.removeFragmentTag() && (view = this.rootView) != null) {
            view.setTag(R.id.bq7, null);
        }
        if (this.LJLIL != null && LiveWatchLiveInteractionReuseSetting.INSTANCE.getEnabled()) {
            if (this.LJLIL.getParent() instanceof ViewGroup) {
                C16880lQ.LJLLL(this.LJLIL, (ViewGroup) this.LJLIL.getParent());
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) this.LJLIL;
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
            AnonymousClass064 anonymousClass064 = C20910rv.LJIILL;
            if (anonymousClass064 != null) {
                anonymousClass064.LIZIZ(constraintLayout);
                View view2 = this.LJLIL;
                o.LJIIIZ(view2, "view");
                C20810rl c20810rl = new C20810rl(R.layout.d4i, (ViewGroup) null, (C20830rn) null, (C20890rt) null, false, 56);
                c20810rl.LJI = view2;
                c20910rv.LIZ(c20810rl);
            }
        }
    }

    public final void tn() {
        C73411SrX c73411SrX = this.LJLJJI;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            this.LJLJJI.dispose();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void continueAfterWidgetLoaded() {
        super.continueAfterWidgetLoaded();
        ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(BNM.class).LIZJ(C73933Szx.LIZLLL(this))).LIZIZ(new AfS36S0101000_5(0, this, 9));
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void loadWidgetWithRoomP1() {
        IMessageManager iMessageManager;
        InterfaceC29980Bpg hq0;
        super.loadWidgetWithRoomP1();
        if (this.mRoom != null && (hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(this.mRoom.getId())) != null && hq0.isEnabled() && hq0.LIZIZ()) {
            hq0.LJ(this);
            this.LJLLJ = (C73411SrX) this.LJLLILLLL.LJIILIIL().LJJL(C73969T1h.LIZIZ()).LJJJJZI(new AfS36S0101000_5(1, this, 56));
        }
        LiveMode liveMode = this.mLiveMode;
        if (liveMode == LiveMode.LIVE_STUDIO || liveMode == LiveMode.THIRD_PARTY) {
            if (LiveGameLiveStudioSupportCohostSetting.INSTANCE.isExperimentGroup()) {
                DataChannel dataChannel = this.mDataChannel;
                C28297B8r c28297B8r = new C28297B8r(dataChannel);
                this.LJLLI = c28297B8r;
                if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
                    iMessageManager.addMessageListener(EnumC31509CYf.BASE_LINK_LAYER_MESSAGE.getIntType(), c28297B8r);
                }
            }
            GameLinkControlWidget hE = ((IGameLinkMicService) CN1.LIZ(IGameLinkMicService.class)).hE(new C30050Bqo(this));
            this.LJLL = hE;
            if (hE != null) {
                this.mWidgetManager.load(R.id.dqm, hE);
                ListProtector.add(this.closeRoomInterceptorList, 0, this.LJLL);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        tn();
        super.onPause();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        sn();
        qn(1);
        View view = this.LJLIL;
        if (view != null) {
            view.postDelayed(new IDRunnableS6S0101000(1, this, 14), 300L);
        }
        super.onResume();
    }

    public final void sn() {
        tn();
        this.LJLJJI = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(5000L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(0, this, 10), new C1PM(1));
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final boolean isLocked() {
        return this.LJLJL;
    }

    public static C76800UCe pn(LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment) {
        String str;
        landscapeAudienceInteractionFragment.LJLJL = !landscapeAudienceInteractionFragment.LJLJL;
        landscapeAudienceInteractionFragment.sn();
        landscapeAudienceInteractionFragment.qn(2);
        InterfaceC29980Bpg hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(landscapeAudienceInteractionFragment.mRoom.getId());
        if (hq0 != null && hq0.isEnabled()) {
            hq0.LJIIL(landscapeAudienceInteractionFragment.LJLJL);
        }
        DataChannel dataChannel = landscapeAudienceInteractionFragment.mDataChannel;
        boolean z = landscapeAudienceInteractionFragment.LJLJL;
        BZI LIZ = C28787BRn.LIZ("livesdk_lock_screen_click");
        LIZ.LJIILLIIL(dataChannel);
        if (z) {
            str = "lock";
        } else {
            str = "unlock";
        }
        LIZ.LJIJJ(str, "purpose");
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final Boolean enableChangeOrientation(int i) {
        boolean z = false;
        if ((i == 1 || C29306Beo.LJIIZILJ(i)) && !this.LJLJL) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        sn();
        this.LJLJI = System.currentTimeMillis();
        ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(B3N.class).LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LIZLLL(this))).LIZIZ(new AfS36S0101000_5(0, this, 11));
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.LJLLILLLL.LJJZZIII().booleanValue()) {
            return false;
        }
        rn(false);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f3, code lost:
    
        if (r5 == com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_STUDIO) goto L62;
     */
    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void prepareChildWidgets(android.view.View r10) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.LandscapeAudienceInteractionFragment.prepareChildWidgets(android.view.View):void");
    }

    public final void qn(int i) {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(3);
        boolean z = false;
        sparseBooleanArray.put(0, this.LJLJJL);
        sparseBooleanArray.put(1, this.LJLJJLL);
        sparseBooleanArray.put(2, this.LJLJL);
        BNM bnm = new BNM();
        bnm.LIZ = sparseBooleanArray;
        bnm.LIZIZ = i;
        if (i == 1 && this.LJLJJLL) {
            z = true;
        }
        bnm.LIZJ = z;
        C73943T0h.LIZ().LIZIZ(bnm);
    }

    public final void rn(boolean z) {
        if (!z && Boolean.TRUE.equals(Boolean.valueOf(((C30744C4u) this.mDataChannel.kv0(ProgrammedLiveMenuVisibilityChannel.class)).LIZ))) {
            this.mDataChannel.rv0(ProgrammedLiveMenuVisibilityChannel.class, new C30744C4u(false, EnumC30108Brk.BLANK_SPACE));
            return;
        }
        boolean z2 = !this.LJLJJL;
        this.LJLJJL = z2;
        if (!z2) {
            sn();
        } else {
            tn();
        }
        qn(0);
    }

    public static C76800UCe on(LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment, Boolean bool) {
        landscapeAudienceInteractionFragment.getClass();
        boolean booleanValue = bool.booleanValue();
        if (landscapeAudienceInteractionFragment.LJLJLJ == null || booleanValue) {
            if (LiveRecycleWidgetV3Setting.INSTANCE.getValue()) {
                landscapeAudienceInteractionFragment.LJLJLJ = landscapeAudienceInteractionFragment.mWidgetManager.getRecyclableWidgetFromCacheOrNew(SwitchDefinitionTipsWidgetLandV2.class, new Object[]{Boolean.valueOf(booleanValue)}, new AObjectS5S0010000_5(booleanValue, 1));
            } else {
                landscapeAudienceInteractionFragment.LJLJLJ = new SwitchDefinitionTipsWidget(booleanValue);
            }
            landscapeAudienceInteractionFragment.mWidgetManager.load(R.id.kxd, (Widget) landscapeAudienceInteractionFragment.LJLJLJ, false);
        }
        landscapeAudienceInteractionFragment.LJLJLJ.show();
        return C76800UCe.LIZ;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1K5 c1k5 = (C1K5) view.findViewById(R.id.gbg);
        if (!TtliveGameLandscapeDesignOptimizeSetting.INSTANCE.shouldAddIconBackground()) {
            C15490jB.LJFF(c1k5, CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1"), "landscape_small_zone_shadow.png", ImageView.ScaleType.CENTER_CROP, null);
        }
        ViewGroup.LayoutParams layoutParams = c1k5.getLayoutParams();
        int LIZ = C15380j0.LIZ(65.0f);
        layoutParams.height = LIZ;
        layoutParams.width = (int) (LIZ * 4.6f);
        c1k5.setLayoutParams(layoutParams);
    }

    @Override // X.InterfaceC29986Bpm
    public final void t3(LikeHelper likeHelper, int i) {
        this.LJLLILLLL.onNext(Boolean.FALSE);
        sn();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        if (LiveWatchLiveInteractionReuseSetting.INSTANCE.getEnabled()) {
            View LJII = C20910rv.LIZ.LJII(R.layout.d4i);
            this.LJLIL = LJII;
            if (LJII == null) {
                this.LJLIL = C16880lQ.LLLLIILL(inflater, R.layout.d4i, viewGroup, false);
                if (C20910rv.LJIILL == null) {
                    AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                    anonymousClass064.LJII((ConstraintLayout) this.LJLIL);
                    C20910rv.LJIILL = anonymousClass064;
                }
            }
        } else {
            this.LJLIL = C16880lQ.LLLLIILL(inflater, R.layout.d4i, viewGroup, false);
        }
        DataChannel dataChannel = this.mDataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, KeyboardStatusChannel.class, new AObjectS144S0100000_5(this, 2));
            dataChannel.lv0(this, HourlyRankRewardVisibilityChangedChannel.class, new AObjectS42S0101000_5(2, this, 55));
        }
        if (LandscapeWatchLiveEntranceOpt.INSTANCE.enableLandscapeBackButton() && (view = this.LJLIL) != null) {
            View findViewById = view.findViewById(R.id.aep);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = this.LJLIL.findViewById(R.id.b97);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
        }
        View view2 = this.LJLIL;
        C78949Uyf.LJJJJ(view2, this);
        C29S c29s = null;
        if (!(view2 instanceof View)) {
            view2 = null;
        }
        if (view2 != null) {
            try {
                ViewTreeLifecycleOwner.set(view2, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view2, this);
                C10A.LIZIZ(view2, this);
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
        return view2;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final boolean onInteractionFling(MotionEvent downEvent, MotionEvent event, float f, float f2) {
        int i;
        if (this.LJLJL) {
            return false;
        }
        DataChannel dataChannel = this.mDataChannel;
        View viewContainer = this.LJLIL;
        boolean z = !this.LJLJJLL;
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(viewContainer, "viewContainer");
        o.LJIIIZ(downEvent, "downEvent");
        o.LJIIIZ(event, "event");
        if (Math.abs(f) <= Math.abs(f2)) {
            return false;
        }
        LandscapeWatchLiveGestureOpt landscapeWatchLiveGestureOpt = LandscapeWatchLiveGestureOpt.INSTANCE;
        if (!landscapeWatchLiveGestureOpt.getEnableHorOpt()) {
            if (CCJ.LIZ(viewContainer.getContext())) {
                if (downEvent.getX() >= viewContainer.getWidth() / 2) {
                    return false;
                }
            } else if (downEvent.getX() <= viewContainer.getWidth() / 2) {
                return false;
            }
        } else {
            if (z) {
                i = ((Number) C30051Bqp.LIZ.getValue()).intValue();
            } else {
                i = 0;
            }
            if (CCJ.LIZ(viewContainer.getContext())) {
                if (downEvent.getX() >= (viewContainer.getWidth() + i) / 2) {
                    return false;
                }
            } else if (downEvent.getX() <= (viewContainer.getWidth() - i) / 2) {
                return false;
            }
        }
        if (z) {
            Context context = viewContainer.getContext();
            o.LJIIIIZZ(context, "viewContainer.context");
            if (CCJ.LIZ(context)) {
                if (f >= 0.0f) {
                    return false;
                }
            } else if (f <= 0.0f) {
                return false;
            }
            dataChannel.pv0(BlockMessageEvent.class);
            if (!landscapeWatchLiveGestureOpt.getEnable()) {
                dataChannel.pv0(ResetSilentTimerEvent.class);
            }
            B9E.LIZ(dataChannel, false);
        } else {
            Context context2 = viewContainer.getContext();
            o.LJIIIIZZ(context2, "viewContainer.context");
            if (CCJ.LIZ(context2)) {
                if (f <= 0.0f) {
                    return false;
                }
            } else if (f >= 0.0f) {
                return false;
            }
            dataChannel.pv0(BlockMessageEvent.class);
            if (!landscapeWatchLiveGestureOpt.getEnable()) {
                dataChannel.pv0(ResetSilentTimerEvent.class);
            }
            B9E.LIZ(dataChannel, false);
        }
        return true;
    }

    @Override // X.InterfaceC29986Bpm
    public final void g4(LikeHelper likeHelper, int i, int i2, float f, float f2, float f3, float f4) {
        this.LJLLILLLL.onNext(Boolean.TRUE);
        tn();
    }
}
