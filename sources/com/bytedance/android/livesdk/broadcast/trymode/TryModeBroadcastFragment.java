package com.bytedance.android.livesdk.broadcast.trymode;

import X.A9Z;
import X.AbstractC39330Fc6;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.B4U;
import X.B73;
import X.B83;
import X.BDR;
import X.BMP;
import X.BU2;
import X.C04510Fr;
import X.C0NB;
import X.C0WI;
import X.C15380j0;
import X.C15610jN;
import X.C18200nY;
import X.C18230nb;
import X.C1B3;
import X.C1Q2;
import X.C20910rv;
import X.C22;
import X.C221108m2;
import X.C22800uy;
import X.C24;
import X.C25;
import X.C276516r;
import X.C28268B7o;
import X.C29044Baa;
import X.C29263Be7;
import X.C29306Beo;
import X.C29308Beq;
import X.C29374Bfu;
import X.C29401Dk;
import X.C29494Bhq;
import X.C29697Bl7;
import X.C29702BlC;
import X.C29824BnA;
import X.C29829BnF;
import X.C2B;
import X.C2G;
import X.C2M;
import X.C2O;
import X.C2R;
import X.C2S;
import X.C2T;
import X.C30293Buj;
import X.C30326BvG;
import X.C30355Bvj;
import X.C30423Bwp;
import X.C30460BxQ;
import X.C30537Byf;
import X.C30655C1j;
import X.C30656C1k;
import X.C30684C2m;
import X.C30686C2o;
import X.C30731C4h;
import X.C30770C5u;
import X.C30833C8f;
import X.C30868C9o;
import X.C30922CBq;
import X.C31014CFe;
import X.C31023CFn;
import X.C32019ChT;
import X.C32021Nm;
import X.C32041No;
import X.C32101Nu;
import X.C32141Ny;
import X.C32537Cpp;
import X.C34941Ys;
import X.C37;
import X.C38;
import X.C38354F3m;
import X.C38995FSd;
import X.C39202Fa2;
import X.C3Z;
import X.C40625Fwz;
import X.C47061t0;
import X.C51029K0z;
import X.C54962Ds;
import X.C54992Dv;
import X.C55012Dx;
import X.C5H3;
import X.C62822Ol8;
import X.C64;
import X.C67;
import X.C73318Sq2;
import X.C73411SrX;
import X.C73933Szx;
import X.C73943T0h;
import X.C73969T1h;
import X.C78857UxB;
import X.C78862UxG;
import X.C78920UyC;
import X.C78996UzQ;
import X.C7N;
import X.C88207Yjb;
import X.CKO;
import X.CN1;
import X.EnumC30836C8i;
import X.EnumC32020ChU;
import X.InterfaceC08070Tj;
import X.InterfaceC10990bv;
import X.InterfaceC12680ee;
import X.InterfaceC21030s7;
import X.InterfaceC27469AqH;
import X.InterfaceC28605BKn;
import X.InterfaceC29856Bng;
import X.InterfaceC30302Bus;
import X.InterfaceC36571c5;
import X.InterfaceC92693kP;
import X.OJY;
import X.RunnableC30666C1u;
import X.X1D;
import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.BaseBroadcastFragment;
import com.bytedance.android.live.broadcast.api.LiveStreamGlobalChannel;
import com.bytedance.android.live.broadcast.api.StartPushStreamChannel;
import com.bytedance.android.live.effect.api.FetchGreenScreenLiveGoalInterfaceEvent;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.VideoGiftStartEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.AnchorBroadcastResolutionChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.OnPostLayoutSwitchEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.OnPreLayoutSwitchEvent;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.broadcast.TryModeGoLiveChannel;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.dataChannel.BroadcastShowOrientationBeginTime;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEffectCommandChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.dataChannel.VideoBelowBackgroundUpdateEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.FluencyNegativeTestExperiment;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveOverdrawOptimizeSettings2;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.NegativeTestExperiment;
import com.bytedance.android.livesdk.livesetting.broadcast.PauseOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3FpsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.GoLiveMemoryLeakOptSetting;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.player.IAVPlayer;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TryModeBroadcastFragment extends BaseBroadcastFragment implements InterfaceC30302Bus, WeakHandler.IHandler, InterfaceC10990bv, InterfaceC21030s7, C2T, Handler.Callback {
    public static final /* synthetic */ int LLIIJI = 0;
    public C2M LJLLILLLL;
    public C30656C1k LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public long LJZI;
    public CKO LL;
    public VideoWidget LLD;
    public TryModeBroadcastInteractionFragment LLF;
    public C73411SrX LLFF;
    public InterfaceC12680ee LLFFF;
    public ArrayList<String> LLIFFJFJJ;
    public final Map<Integer, View> LLIIIZ = new LinkedHashMap();
    public final C73318Sq2 LJLJL = new C73318Sq2();
    public final C5H3 LJLJLJ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 156));
    public final C5H3 LJLJLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 155));
    public final C5H3 LJLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 153));
    public final boolean LJLLI = true;
    public boolean LJZ = true;
    public final List<InterfaceC92693kP> LJZL = new ArrayList();
    public final C62822Ol8 LLFII = C221108m2.LIZIZ(C30460BxQ.LJLIL);
    public final long LLFZ = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
    public final C30537Byf LLI = new C30537Byf();
    public final C5H3 LLII = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 154));
    public final C2B LLIIII = new C2B(this);
    public final C25 LLIIIILZ = new C25(this);
    public final C30655C1j LLIIIJ = new C30655C1j(this);
    public final C30423Bwp LLIIIL = new C30423Bwp(this);

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void Ec(float f) {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void G(int i, int i2, String str) {
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Pl() {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void Wg(double d, double d2, double d3) {
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIZ).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void bh() {
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, X.InterfaceC86149XrV
    public final void finish() {
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, X.InterfaceC86149XrV
    public final Fragment getFragment() {
        return this;
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void ha(boolean z) {
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        return true;
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void hc(LiveCore liveCore, AbstractC39330Fc6 abstractC39330Fc6) {
    }

    @Override // X.InterfaceC21030s7
    public final void m7() {
        C0NB.LIZIZ("LivePitayaRunTaskFrequentControlManager", "createRoomSuccess");
        C22800uy.LIZ = 0;
        C1Q2.LIZ.LJFF(this.LJZ);
        this.LJZ = false;
        TryModeBroadcastInteractionFragment tryModeBroadcastInteractionFragment = this.LLF;
        if (tryModeBroadcastInteractionFragment != null) {
            tryModeBroadcastInteractionFragment.xl();
        }
        if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
            C38995FSd.LIZIZ().submit(new ARunnableS41S0100000_5(this, 82));
        } else {
            C29697Bl7.LJIILJJIL((WeakHandler) this.LJLJLLL.getValue());
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC10990bv
    public final void p8(int i) {
    }

    @Override // X.InterfaceC21030s7
    public final void s2(LiveCore liveCore, Cert cert) {
        o.LJIIIZ(liveCore, "liveCore");
        o.LJIIIZ(cert, "cert");
    }

    @Override // X.InterfaceC21030s7
    public final void t8() {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void u4(long j) {
    }

    @Override // X.InterfaceC21030s7
    public final void v3() {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void x() {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void xj(int i) {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void z0() {
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Kl() {
        LiveCore liveCore;
        AudioDeviceModule adm;
        if (this.LJLZ) {
            return;
        }
        this.LJLZ = true;
        ((IGiftService) CN1.LIZ(IGiftService.class)).destroyGiftBannedManager();
        C38.LIZ(false, C37.BROADCAST);
        if (FluencyNegativeTestExperiment.INSTANCE.isBroadcastPeriodSceneEnable()) {
            RunnableC30666C1u runnableC30666C1u = C2S.LIZ;
            if (runnableC30666C1u != null) {
                C15610jN.LIZ().removeCallbacks(runnableC30666C1u);
            }
            C2S.LIZ = null;
            C15610jN.LIZJ(C22.LJLIL, 0L);
        }
        C7N.LJII().onEndBroadcast();
        C1Q2.LIZ.LIZJ();
        C38995FSd.LIZIZ().submit(new ARunnableS41S0100000_5(this, 81));
        LJIIL().jv0(this);
        C15610jN.LIZLLL(null);
        B73.LIZJ(null);
        LiveMonitorSampleSetting.INSTANCE.release();
        C31023CFn.LIZJ(true);
        if (!this.LJLLLL) {
            C3Z.LIZLLL();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C29044Baa.class);
            ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C54992Dv.class);
        }
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LJLJJI;
        dataChannelGlobal2.getClass();
        dataChannelGlobal2.jv0(this);
        C7N.LJIJ().h0().LJFF();
        try {
            C7N.LJIIIIZZ().clearAssets("effects");
        } catch (IllegalStateException e) {
            C0NB.LIZLLL(e.toString());
        }
        C64.LIZJ("ttlive_page_destroy", "broadcast");
        LivePerformanceManager LIZ = B4U.LIZ();
        LIZ.LJJII("stream");
        LIZ.LJJIJIIJI();
        LIZ.release();
        LIZ.LJZL = -1.0f;
        LIZ.LLD = -1.0f;
        LIZ.LL = -1.0d;
        ((ArrayList) C04510Fr.LIZIZ).clear();
        ((LinkedHashMap) C04510Fr.LIZ).clear();
        C04510Fr.LIZJ = false;
        B4U.LIZ().LLF = null;
        C88207Yjb.LJFF();
        ((InterfaceC08070Tj) this.LLFII.getValue()).LJ(this.LLIIIL);
        ((InterfaceC08070Tj) this.LLFII.getValue()).release();
        C20910rv.LJIILLIIL(null);
        C7N.LJJ().d9();
        DataChannelGlobal dataChannelGlobal3 = DataChannelGlobal.LJLJJI;
        ((ConcurrentHashMap) dataChannelGlobal3.LJLIL).remove(C29263Be7.class);
        ((ConcurrentHashMap) dataChannelGlobal3.LJLIL).remove(C29824BnA.class);
        Iterator it = ((ArrayList) this.LJZL).iterator();
        while (it.hasNext()) {
            ((InterfaceC92693kP) it.next()).dispose();
        }
        C73411SrX c73411SrX = this.LLFF;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C7N.LJII().releaseAccompanimentResources();
        C7N.LJII().releaseBGMPlayerManager();
        DataChannelGlobal dataChannelGlobal4 = DataChannelGlobal.LJLJJI;
        ((C32537Cpp) dataChannelGlobal4.gv0(C54962Ds.class)).LIZ = Boolean.TRUE;
        ((LinkedHashMap) C31014CFe.LIZLLL).clear();
        BU2.LIZ();
        C29829BnF.LIZIZ(LJIIL());
        CKO cko = this.LL;
        if (cko != null && (liveCore = cko.LJ) != null && (adm = liveCore.getADM()) != null) {
            adm.setAudioCaptureMute(false);
        }
        C7N.LJII().releaseNaviAvatarResources();
        C2R c2r = C2R.LIZ;
        dataChannelGlobal4.getClass();
        dataChannelGlobal4.jv0(c2r);
        IAVPlayer iAVPlayer = C2R.LIZIZ;
        if (iAVPlayer != null) {
            iAVPlayer.release();
        }
        C67 value = C67.LIZIZ.getValue();
        value.getClass();
        if (NegativeTestExperiment.INSTANCE.isEnable()) {
            C0NB.LJIIIZ("negative_test", "endNegativeTest--------!!!!!!");
            ExecutorService executorService = value.LIZ;
            if (executorService != null) {
                executorService.shutdownNow();
            }
            value.LIZ = null;
        }
        C30731C4h.LIZLLL();
        C31014CFe.LJJI = null;
        C31014CFe.LJJIFFI = null;
        C31014CFe.LJJII = null;
        C31014CFe.LJJIII = null;
        if (GoLiveMemoryLeakOptSetting.INSTANCE.enable()) {
            C30770C5u.LJI = null;
            ((IHostPerformanceOpt) CN1.LIZ(IHostPerformanceOpt.class)).Gl0();
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Ll() {
        ViewGroup LJLJJL;
        TryModeBroadcastInteractionFragment tryModeBroadcastInteractionFragment;
        if (this.LJLLLLLL) {
            return;
        }
        this.LJLLLLLL = true;
        C0WI LIZLLL = C30355Bvj.LIZLLL();
        LIZLLL.LIZLLL(true);
        LIZLLL.LIZJ(LJIIL());
        LIZLLL.LIZIZ(LJIIL());
        LIZLLL.LJ();
        LIZLLL.release();
        ((C32021Nm) C30355Bvj.LJIIIIZZ()).LIZJ("LiveBroadcastFragment#onLiveDestroyView", true);
        C32021Nm.LJIIIIZZ(LJIIL(), "LiveBroadcastFragment#onLiveDestroyView");
        C32021Nm.LJII(LJIIL());
        C32021Nm.LIZ("LiveBroadcastFragment#onLiveDestroyView");
        C32021Nm.LIZLLL(true);
        C30355Bvj.LJIIJ();
        C32041No.LJIIIIZZ(true);
        C32041No.LJIJI(LJIIL());
        C32041No.LJIJ(LJIIL());
        C32041No.LIZLLL();
        C32041No.LJIIIZ(false);
        C30355Bvj.LJIIL();
        C32101Nu.LIZIZ.clear();
        C32101Nu.LIZJ = 0L;
        C32101Nu.LIZLLL = null;
        C40625Fwz.LIZIZ();
        try {
            tryModeBroadcastInteractionFragment = this.LLF;
        } catch (Exception unused) {
        }
        if (tryModeBroadcastInteractionFragment != null) {
            tryModeBroadcastInteractionFragment.hideFloatFragment();
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(childFragmentManager);
            c1b3.LJJI(tryModeBroadcastInteractionFragment);
            c1b3.LJII();
            this.LLF = null;
            VideoWidget videoWidget = this.LLD;
            if (videoWidget != null) {
                videoWidget.liveStreamStop();
            }
        }
        if (!this.LJLLLL) {
            InterfaceC12680ee interfaceC12680ee = this.LLFFF;
            if (interfaceC12680ee != null) {
                interfaceC12680ee.LJJIZ();
            }
            InterfaceC12680ee interfaceC12680ee2 = this.LLFFF;
            if (interfaceC12680ee2 != null && (LJLJJL = interfaceC12680ee2.LJLJJL()) != null) {
                LJLJJL.setBackground(null);
            }
            CKO cko = this.LL;
            if (cko != null) {
                cko.LJIJJLI(C78857UxB.LJJIIJ(1476788483, "bpea-487"));
            }
            ARunnableS41S0100000_5 aRunnableS41S0100000_5 = new ARunnableS41S0100000_5(new C30293Buj(), 0);
            if (HandlerThreadOptSetting.INSTANCE.enable()) {
                C39202Fa2.LIZJ().submit(aRunnableS41S0100000_5);
            } else {
                aRunnableS41S0100000_5.run();
            }
        }
        this.LJLJL.LIZLLL();
        C7N.LJIILL().release(getRoomId());
        C7N.LJIILL().retryReleaseAll();
        C30686C2o.LJLILLLLZI.clear();
        ((IGiftService) CN1.LIZ(IGiftService.class)).onLiveBroadcastActivityDestroyed();
        ((IDebugService) CN1.LIZ(IDebugService.class)).onDestroy();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Ml() {
        if (((BroadcastTunnelVM) this.LJLL.getValue()).LJLIL.getValue() != A9Z.STREAM_ON) {
            C2M c2m = this.LJLLILLLL;
            if (c2m != null) {
                C30656C1k c30656C1k = this.LJLLJ;
                if (c30656C1k != null) {
                    c2m.LIZLLL(c30656C1k);
                    C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476788484, "bpea-386");
                    CKO cko = this.LL;
                    if (cko != null) {
                        cko.LIZJ(LJJIIJ);
                    }
                    C7N.LJII().pauseAccompanimentPlay(Boolean.FALSE);
                    C7N.LJII().pauseBGM(Boolean.TRUE);
                } else {
                    o.LJIJI("mPhoneStateReceiver");
                    throw null;
                }
            } else {
                o.LJIJI("liveBroadcastCallback");
                throw null;
            }
        }
        C29702BlC LIZ = C18230nb.LIZ("ttlive_page_pause");
        LIZ.LJ("broadcast");
        LIZ.LJIIIZ();
        C88207Yjb.LJIILLIIL();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Ol() {
        C64.LIZJ("ttlive_page_start", "broadcast");
    }

    public final C47061t0 Rl() {
        InterfaceC12680ee interfaceC12680ee = this.LLFFF;
        if (interfaceC12680ee != null) {
            return interfaceC12680ee.LJLIL();
        }
        return null;
    }

    public final void Sl() {
        C30326BvG c30326BvG = C30326BvG.LIZ;
        c30326BvG.post(new ARunnableS41S0100000_5(this, 77), LJIIL());
        c30326BvG.post(new ARunnableS41S0100000_5(this, 78), LJIIL());
        c30326BvG.post(new ARunnableS41S0100000_5(this, 79), LJIIL());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.CKO, O] */
    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Gl() {
        CKO cko;
        C18200nY.LIZ("live_page_load", String.valueOf(System.currentTimeMillis()));
        C29697Bl7.LJII();
        C30833C8f.LIZIZ().LIZ();
        ?? LIZIZ = C3Z.LIZ.LIZIZ();
        if (LIZIZ != 0) {
            LIZIZ.setStreamCallback(this);
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            ((C32537Cpp) dataChannelGlobal.gv0(C54992Dv.class)).LIZ = LIZIZ;
            dataChannelGlobal.tv0(LiveStreamGlobalChannel.class, LIZIZ);
            C31014CFe.LJJIFFI = new AqS155S0100000_5((CKO) LIZIZ, 297);
            C31014CFe.LJJII = new AqS155S0100000_5((CKO) LIZIZ, 298);
            C31014CFe.LJJIII = new AqS155S0100000_5((CKO) LIZIZ, 299);
            cko = LIZIZ;
        } else {
            cko = null;
        }
        this.LL = cko;
        C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476788233, "bpea-460");
        CKO cko2 = this.LL;
        if (cko2 != null) {
            cko2.LIZLLL(LJJIIJ);
        }
        LJIIL().rv0(StartPushStreamChannel.class, Boolean.TRUE);
        this.LLD = new VideoWidget(this.LLIIII, new StreamUrlExtra(), this.LL, this.LLIIIILZ);
        ((WidgetManager) this.LJLJLJ.getValue()).load(this.LLD);
        View view = getView();
        if (view != null) {
            view.post(new ARunnableS41S0100000_5(this, 207));
        }
        C7N.LJIIIIZZ().preloadRoomEffects();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && room.getOwner().getSecUid() != null) {
            ((ITreasureBoxService) CN1.LIZ(ITreasureBoxService.class)).sf0(LJIIL(), Long.valueOf(room.getId()), room.getOwner().getSecUid());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.fragment.app.FragmentManager, O] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Boolean, java.lang.Object, O] */
    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Il() {
        O o;
        O o2;
        InterfaceC28605BKn ho;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        DataChannel LJIIL = LJIIL();
        ?? r8 = Boolean.TRUE;
        ((C32537Cpp) LJIIL.gv0(BDR.class)).LIZ = r8;
        DataChannel LJIIL2 = LJIIL();
        Bundle arguments = getArguments();
        ArrayList<String> arrayList = null;
        if (arguments != null && (bundle3 = arguments.getBundle("extra")) != null) {
            o = Long.valueOf(bundle3.getLong("room_mock_id"));
        } else {
            o = 0;
        }
        ((C32537Cpp) LJIIL2.gv0(C29308Beq.class)).LIZ = o;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (bundle2 = arguments2.getBundle("extra")) != null) {
            o2 = Long.valueOf(bundle2.getLong("room_mock_id"));
        } else {
            o2 = 0;
        }
        ((C32537Cpp) dataChannelGlobal.gv0(C29263Be7.class)).LIZ = o2;
        LJIIL().rv0(RoomChannel.class, xl());
        C30731C4h.LIZJ();
        C22800uy.LIZIZ();
        C38.LIZ(true, C37.BROADCAST);
        FluencyNegativeTestExperiment fluencyNegativeTestExperiment = FluencyNegativeTestExperiment.INSTANCE;
        if (fluencyNegativeTestExperiment.isBroadcastEnterSceneEnable()) {
            if (C2S.LIZ == null) {
                C2S.LIZ = new RunnableC30666C1u();
            }
            RunnableC30666C1u runnableC30666C1u = C2S.LIZ;
            if (runnableC30666C1u != null) {
                C15610jN.LIZJ(runnableC30666C1u, 0L);
            }
            C15610jN.LIZJ(C22.LJLIL, 2000L);
        }
        if (fluencyNegativeTestExperiment.isBroadcastPeriodSceneEnable()) {
            if (C2S.LIZ == null) {
                C2S.LIZ = new RunnableC30666C1u();
            }
            RunnableC30666C1u runnableC30666C1u2 = C2S.LIZ;
            if (runnableC30666C1u2 != null) {
                C15610jN.LIZJ(runnableC30666C1u2, 2000L);
            }
        }
        C67.LIZIZ.getValue().LIZ();
        C31014CFe.LJIIJ();
        OJY.LJLJI = false;
        C32019ChT.LIZIZ(EnumC32020ChU.ENTER_BROADCAST_ROOM);
        dataChannelGlobal.nv0(this, this, FetchGreenScreenLiveGoalInterfaceEvent.class, new AqS171S0100000_5(this, 542));
        dataChannelGlobal.nv0(this, this, VideoBelowBackgroundUpdateEvent.class, new AqS171S0100000_5(this, 544));
        if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
            C38995FSd.LIZIZ().submit(C2O.LJLIL);
        } else {
            C29697Bl7.LJIILIIL();
        }
        System.currentTimeMillis();
        C1Q2.LIZ.LJII(this, LJIIL());
        C7N.LJIJI().D(LJIIL());
        C7N.LJI().D(LJIIL());
        C88207Yjb.LJIIIZ();
        C20910rv.LJIIL(getContext());
        C7N.LJIILJJIL().wN(getContext(), false);
        C7N.LJIILJJIL().Pb(getContext());
        C7N.LJIIZILJ().CO(getContext());
        EnumC30836C8i.LiveResource.preload();
        C7N.LJIJ().h0().LJJJ();
        ((C32537Cpp) LJIIL().gv0(C29494Bhq.class)).LIZ = getChildFragmentManager();
        DataChannel LJIIL3 = LJIIL();
        LJIIL3.ov0(this, VideoGiftStartEvent.class, new AqS171S0100000_5(this, 547));
        LJIIL3.lv0(this, LiveEffectCommandChannel.class, new AqS171S0100000_5(this, 548));
        LJIIL3.lv0(this, AnchorBroadcastResolutionChangeEvent.class, new AqS171S0100000_5(this, 549));
        LJIIL3.ov0(this, LiveCenterStatusChannel.class, new AqS171S0100000_5(this, 551));
        LJIIL3.lv0(this, TryModeGoLiveChannel.class, new AqS171S0100000_5(this, 553));
        LJIIL3.lv0(this, OnPreLayoutSwitchEvent.class, new AqS171S0100000_5(this, 555));
        LJIIL3.lv0(this, OnPostLayoutSwitchEvent.class, new AqS171S0100000_5(this, 538));
        LJIIL3.rv0(UserIsAnchorChannel.class, r8);
        if (C38354F3m.LIZJ("referral_task", (String) dataChannelGlobal.mv0(C55012Dx.class))) {
            List<BMP> liveActivityTasksSetting = C7N.LJIIJJI().getLiveActivityTasksSetting();
            if (liveActivityTasksSetting != null && liveActivityTasksSetting.size() > 0) {
                for (BMP bmp : liveActivityTasksSetting) {
                    Integer num = bmp.LIZ;
                    if (num != null && num.intValue() == 4) {
                        Long l = bmp.LIZIZ;
                        o.LJIIIIZZ(l, "task.time");
                        ((ArrayList) this.LJZL).add(AbstractC73672Svk.LJJLIIIJLLLLLLLZ(l.longValue(), TimeUnit.SECONDS, C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(bmp, 189)));
                    }
                }
            }
            this.LLI.LIZ();
        }
        Vl(C30684C2m.class);
        Vl(C28268B7o.class);
        register(C7N.LJIIL().registerAppEnterForeBackgroundCallback(this.LLIIIJ));
        C04510Fr.LIZJ = true;
        B4U.LIZ().LLF = C04510Fr.LIZ;
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (bundle = arguments3.getBundle("extra")) != null) {
            arrayList = bundle.getStringArrayList("guide_videos");
        }
        this.LLIFFJFJJ = arrayList;
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LJLJJI;
        dataChannelGlobal2.tv0(BroadcastShowOrientationBeginTime.class, Long.valueOf(System.currentTimeMillis()));
        IPullStreamService iPullStreamService = (IPullStreamService) CN1.LIZ(IPullStreamService.class);
        if (iPullStreamService != null && (ho = iPullStreamService.ho()) != null) {
            ho.LIZ();
        }
        dataChannelGlobal2.pv0(LiveStreamGlobalChannel.class, C2R.LIZ, C24.LJLIL);
        IHostUser iHostUser = (IHostUser) CN1.LIZ(IHostUser.class);
        if (iHostUser != null) {
            iHostUser.reportData("broadcast");
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Nl() {
        C88207Yjb.LJIIJ();
        ((BroadcastTunnelVM) this.LJLL.getValue()).LJLIL.setValue(A9Z.STREAM_PAUSE);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
        C2M c2m = this.LJLLILLLL;
        Boolean bool = null;
        if (c2m != null) {
            C30656C1k c30656C1k = this.LJLLJ;
            if (c30656C1k != null) {
                c2m.LIZJ(c30656C1k, intentFilter);
                C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476788233, "bpea-365");
                CKO cko = this.LL;
                if (cko != null) {
                    cko.LJIIJJI(LJJIIJ);
                }
                C29702BlC LIZ = C18230nb.LIZ("ttlive_page_resume");
                LIZ.LJ("broadcast");
                LIZ.LJIIIZ();
                DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
                if (LJIILIIL != null) {
                    bool = (Boolean) LJIILIIL.kv0(ECLiveStatusChangeChannel.class);
                }
                if (C29306Beo.LJIILLIIL(bool)) {
                    C30355Bvj.LJIIJJI();
                    if (!C32141Ny.LIZIZ()) {
                        C7N.LJII().resumeAccompanimentPlay();
                        if (C30355Bvj.LJIILIIL()) {
                            C7N.LJII().resumeBGM();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("mPhoneStateReceiver");
            throw null;
        }
        o.LJIJI("liveBroadcastCallback");
        throw null;
    }

    @Override // X.InterfaceC21030s7
    public final void Wk() {
        if (C29306Beo.LJJIFFI((Boolean) LJIIL().kv0(PauseLiveChannel.class)) && PauseOptSetting.INSTANCE.getValue()) {
            C30868C9o.LIZLLL(R.string.sw6, getContext());
            C78920UyC.LJI("livesdk_anchor_network_error", "1", "error_type");
            C18230nb.LIZ("ttlive_reconnect_stream").LJIIIZ();
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, X.InterfaceC86149XrV
    public final boolean onBackPressed() {
        InterfaceC27469AqH interfaceC27469AqH;
        FragmentManager supportFragmentManager;
        List<Fragment> LJJJJLI;
        InterfaceC27469AqH interfaceC27469AqH2;
        if (!isAdded()) {
            return true;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null && (LJJJJLI = supportFragmentManager.LJJJJLI()) != null) {
            for (InterfaceC36571c5 interfaceC36571c5 : LJJJJLI) {
                if ((interfaceC36571c5 instanceof InterfaceC27469AqH) && (interfaceC27469AqH2 = (InterfaceC27469AqH) interfaceC36571c5) != null && interfaceC27469AqH2.onBackPressed()) {
                    return true;
                }
            }
        }
        List<Fragment> LJJJJLI2 = getChildFragmentManager().LJJJJLI();
        o.LJIIIIZZ(LJJJJLI2, "childFragmentManager.fragments");
        for (InterfaceC36571c5 interfaceC36571c52 : LJJJJLI2) {
            if ((interfaceC36571c52 instanceof InterfaceC27469AqH) && (interfaceC27469AqH = (InterfaceC27469AqH) interfaceC36571c52) != null && interfaceC27469AqH.onBackPressed()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, X.InterfaceC28236B6i
    public final DataChannel provideDataChannel() {
        return LJIIL();
    }

    @Override // X.InterfaceC21030s7
    public final void tl() {
        C30868C9o.LIZLLL(R.string.sx2, getContext());
        C78920UyC.LJI("livesdk_anchor_network_error", "2", "error_type");
        C18230nb.LIZ("ttlive_reconnect_stream_success").LJIIIZ();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final boolean Dl() {
        return this.LJLLI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        if (X.C1XY.LJJIFFI(r1) == false) goto L15;
     */
    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ql(android.view.View r6) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment.Ql(android.view.View):void");
    }

    @Override // X.C2T
    public final void T6(String state) {
        CKO cko;
        o.LJIIIZ(state, "state");
        if (o.LJ(TelephonyManager.EXTRA_STATE_IDLE, state)) {
            CKO cko2 = this.LL;
            if (cko2 != null) {
                cko2.LJIIJJI(C78857UxB.LJJIIJ(1476788233, "bpea-366"));
                return;
            }
            return;
        }
        if (!o.LJ(TelephonyManager.EXTRA_STATE_OFFHOOK, state) || (cko = this.LL) == null) {
            return;
        }
        cko.LIZJ(C78857UxB.LJJIIJ(1476788481, "bpea-387"));
    }

    public final void Tl(boolean z) {
        VideoWidget videoWidget;
        if (!this.LJLLL) {
            this.LJLLL = true;
            if (z && (videoWidget = this.LLD) != null) {
                videoWidget.removeFrameListener();
            }
            C1Q2.LIZ.LIZIZ();
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.runOnUiThread(new ARunnableS41S0100000_5(this, 80));
            }
        }
    }

    public final <T> void Vl(Class<T> cls) {
        ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(cls).LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LIZLLL(this))).LIZJ(new AfS57S0100000_5(this, 51), C2G.LJLIL);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message msg) {
        C276516r c276516r;
        o.LJIIIZ(msg, "msg");
        if (msg.what == 3) {
            Object obj = msg.obj;
            if ((obj instanceof C29401Dk) && (c276516r = (C276516r) obj) != null) {
                c276516r.getErrorCode();
            }
        }
    }

    public final void onEvent(C28268B7o event) {
        o.LJIIIZ(event, "event");
        int i = event.LIZ;
        if (i != 6 && i != 8) {
            return;
        }
        ((IHostAction) CN1.LIZ(IHostAction.class)).handleSchema(null, "sslocal://openRecord?enter_from=direct_shoot&tab=live", new Bundle());
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        mo49getActivity.finish();
    }

    @Override // X.InterfaceC21030s7
    public final void xb(C34941Ys c34941Ys) {
        if (MultiGuestV3FpsSetting.INSTANCE.isEnable() && ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("on report: ");
            LIZ.append(c34941Ys);
            C0NB.LIZIZ("LiveBroadcastFragment", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final View Jl(LayoutInflater inflater, ViewGroup viewGroup) {
        InterfaceC12680ee interfaceC12680ee;
        ViewGroup LJLJJL;
        o.LJIIIZ(inflater, "inflater");
        if (mo49getActivity() instanceof InterfaceC12680ee) {
            InterfaceC36571c5 mo49getActivity = mo49getActivity();
            o.LJII(mo49getActivity, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.api.IVideoLiveBroadcastRoomBottomUILayerProvider");
            this.LLFFF = (InterfaceC12680ee) mo49getActivity;
        } else if (C30922CBq.LIZIZ) {
            throw new Exception("Error! Current activity doest not implement IVideoLiveBroadcastRoomBottomUILayerProvider");
        }
        View LJI = C20910rv.LJI(R.layout.d4k, viewGroup, false, 12);
        if (!LiveOverdrawOptimizeSettings2.INSTANCE.enable() && (interfaceC12680ee = this.LLFFF) != null && (LJLJJL = interfaceC12680ee.LJLJJL()) != null) {
            LJLJJL.setBackgroundColor(C15380j0.LIZIZ(R.color.a94));
        }
        return LJI;
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Hl(int i, int i2, Intent intent) {
        TryModeBroadcastInteractionFragment tryModeBroadcastInteractionFragment = this.LLF;
        if (tryModeBroadcastInteractionFragment != null) {
            tryModeBroadcastInteractionFragment.onActivityResult(i, i2, intent);
        }
    }
}
