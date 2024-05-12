package com.bytedance.android.livesdk.broadcast.voicechat;

import X.A9Z;
import X.AbstractC39330Fc6;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.B4U;
import X.B5G;
import X.B73;
import X.B83;
import X.BCN;
import X.BH7;
import X.BP4;
import X.BTJ;
import X.BYU;
import X.BZI;
import X.C012403c;
import X.C03880Dg;
import X.C09650Zl;
import X.C0F0;
import X.C0K2;
import X.C0NB;
import X.C0TY;
import X.C11000bw;
import X.C12800eq;
import X.C15380j0;
import X.C15490jB;
import X.C15540jG;
import X.C15610jN;
import X.C16880lQ;
import X.C18200nY;
import X.C18230nb;
import X.C199097rd;
import X.C1B3;
import X.C1EW;
import X.C1JI;
import X.C1KR;
import X.C1KS;
import X.C1Q2;
import X.C20;
import X.C20910rv;
import X.C21;
import X.C22;
import X.C22800uy;
import X.C22920vA;
import X.C24;
import X.C265112h;
import X.C276516r;
import X.C279017q;
import X.C28;
import X.C28268B7o;
import X.C28401BCr;
import X.C28509BGv;
import X.C28718BOw;
import X.C28787BRn;
import X.C28871BUt;
import X.C28959BYd;
import X.C29044Baa;
import X.C29065Bav;
import X.C29094BbO;
import X.C29095BbP;
import X.C29097BbR;
import X.C29219BdP;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29401Dk;
import X.C29697Bl7;
import X.C29702BlC;
import X.C29829BnF;
import X.C2D;
import X.C2F;
import X.C2K;
import X.C2L;
import X.C2M;
import X.C2R;
import X.C2S;
import X.C2T;
import X.C30197BtB;
import X.C30222Bta;
import X.C30326BvG;
import X.C30355Bvj;
import X.C30468BxY;
import X.C30544Bym;
import X.C30567Bz9;
import X.C30652C1g;
import X.C30656C1k;
import X.C30661C1p;
import X.C30665C1t;
import X.C30668C1w;
import X.C30686C2o;
import X.C30868C9o;
import X.C30882CAc;
import X.C31014CFe;
import X.C31023CFn;
import X.C31811Ce7;
import X.C32141Ny;
import X.C32537Cpp;
import X.C34941Ys;
import X.C37;
import X.C38;
import X.C38354F3m;
import X.C3G;
import X.C3Y;
import X.C3Z;
import X.C40625Fwz;
import X.C44878HjO;
import X.C47061t0;
import X.C47071t1;
import X.C47121t6;
import X.C48459J0d;
import X.C51029K0z;
import X.C54992Dv;
import X.C5H3;
import X.C64;
import X.C65300Pk0;
import X.C72818Shy;
import X.C73318Sq2;
import X.C73933Szx;
import X.C73943T0h;
import X.C73969T1h;
import X.C76732zl;
import X.C78920UyC;
import X.C78996UzQ;
import X.C7N;
import X.C83281WmL;
import X.C88207Yjb;
import X.CFX;
import X.CKO;
import X.CN1;
import X.CXJ;
import X.DialogC30679C2h;
import X.EnumC12790ep;
import X.EnumC29309Ber;
import X.EnumC30213BtR;
import X.EnumC30836C8i;
import X.InterfaceC06390Mx;
import X.InterfaceC10990bv;
import X.InterfaceC21020s6;
import X.InterfaceC21030s7;
import X.InterfaceC29856Bng;
import X.InterfaceC30442Bx8;
import X.InterfaceC64592gB;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.OJY;
import X.OSZ;
import X.RunnableC30666C1u;
import X.UYK;
import X.WM7;
import X.X1D;
import Y.ACListenerS31S0300000_5;
import Y.ACListenerS40S0200000_5;
import Y.ACListenerS44S1100000_5;
import Y.ARunnableS41S0100000_5;
import Y.AfS20S1100000_5;
import Y.AfS3S1100100_5;
import Y.AfS57S0100000_5;
import Y.IDCListenerS281S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.BaseBroadcastFragment;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.LiveStreamGlobalChannel;
import com.bytedance.android.live.broadcast.api.StartPushStreamChannel;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.api.EffectRedDotStatusChangeEvent;
import com.bytedance.android.live.effect.api.FetchGreenScreenLiveGoalInterfaceEvent;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiCoHostFeedbackSubmitEvent;
import com.bytedance.android.livesdk.api.StatusApi;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.broadcast.interaction.function.illegal.IllegalReviewDialog;
import com.bytedance.android.livesdk.broadcast.interaction.function.illegal.LiveIllegalPresenter;
import com.bytedance.android.livesdk.broadcast.voicechat.layer.VoiceChatWidget;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.dataChannel.BlockCloseLiveReasonChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastDisableSubOnlyTrialLiveEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastEnableSubOnlyLiveEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastNetworkStatus;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.EndLiveWithoutEndPage;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEventCardStartTimeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenCloseGuide;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenShowGuide;
import com.bytedance.android.livesdk.dataChannel.LiveNotShowGuideAgain;
import com.bytedance.android.livesdk.dataChannel.MemberMessageChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.PerceptionDialogChannel;
import com.bytedance.android.livesdk.dataChannel.PunishInfoChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ServerTimeGapChangeEvent;
import com.bytedance.android.livesdk.dataChannel.ShowEndPageEvent;
import com.bytedance.android.livesdk.dataChannel.StartPollMessageSEIEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.dataChannel.VoiceChatStartFailedEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.FluencyNegativeTestExperiment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcaseAudioDetectionHitSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAnchorMicOccupiedSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableFixLiveEndSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveExtendedScreenFilterTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamEnableUrlListSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOnlyPushRtcWhenResumeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDelayDurationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCaptionAnchorSetting;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.message.LiveMessageID;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VoiceChatBroadcastFragment extends BaseBroadcastFragment implements InterfaceC10990bv, InterfaceC21030s7, ILiveStream.ILiveStreamErrorListener, WeakHandler.IHandler, Handler.Callback, C2T, BYU, InterfaceC72822Si2 {
    public static boolean LLIZ;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public C2M LJLL;
    public LiveIllegalPresenter LJLLI;
    public IllegalReviewDialog LJLLILLLL;
    public C30656C1k LJLLL;
    public CKO LJLLLL;
    public C11000bw LJLLLLLL;
    public long LJLZ;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public boolean LLF;
    public VoiceChatBroadcastInteractionFragment LLFF;
    public boolean LLFFF;
    public VoiceChatWidget LLFII;
    public Handler LLFZ;
    public ARunnableS41S0100000_5 LLI;
    public int LLIFFJFJJ;
    public volatile boolean LLII;
    public String LLIIIJ;
    public CharSequence LLIIIL;
    public CharSequence LLIIIZ;
    public CharSequence LLIIJI;
    public C3G LLIIL;
    public StreamUrlExtra LLILLL;
    public final Map<Integer, View> LLILZLL = new LinkedHashMap();
    public final C73318Sq2 LJLJLLL = new C73318Sq2();
    public final C5H3 LJLLJ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 178));
    public boolean LJZ = true;
    public boolean LJZI = true;
    public boolean LLIIII = true;
    public final C5H3 LLIIIILZ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 177));
    public final C5H3 LLIIJLIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 173));
    public final C5H3 LLIILII = C78996UzQ.LJJIJIIJI(C2F.LJLIL);
    public final String LLIILZL = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale().getLanguage();
    public final C5H3 LLIIZ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 175));
    public final ARunnableS41S0100000_5 LLIL = new ARunnableS41S0100000_5(this, 114);
    public final C5H3 LLILII = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 179));
    public final C5H3 LLILIL = C78996UzQ.LJJIJIIJI(new C30567Bz9(this));
    public final C5H3 LLILL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 176));
    public final C5H3 LLILLIZIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 174));
    public final C2D LLILLJJLI = new C2D(this);
    public final C30652C1g LLILZ = new C30652C1g(this);
    public final ARunnableS41S0100000_5 LLILZIL = new ARunnableS41S0100000_5(this, 115);

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void Ec(float f) {
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Ml() {
        this.LJLJL = true;
        Yl(LJIIL(), true);
        if (((BroadcastTunnelVM) this.LLIIZ.getValue()).LJLIL.getValue() != A9Z.STREAM_ON) {
            C2M c2m = this.LJLL;
            if (c2m != null) {
                C30656C1k c30656C1k = this.LJLLL;
                if (c30656C1k != null) {
                    c2m.LIZLLL(c30656C1k);
                } else {
                    o.LJIJI("phoneStateReceiver");
                    throw null;
                }
            }
            PrivacyCert.Builder LIZ = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-voice-onLivePause-386", "", "Switch to background during live broadcast");
            LIZ.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
            PrivacyCert build = LIZ.build();
            C3G c3g = this.LLIIL;
            if (c3g != null) {
                c3g.LIZIZ(build, false, new AqS155S0100000_5(this, 348));
            }
            C7N.LJII().pauseAccompanimentPlay(Boolean.FALSE);
        }
        C29702BlC LIZ2 = C18230nb.LIZ("ttlive_page_pause");
        LIZ2.LJ("broadcast");
        LIZ2.LJIIIZ();
        C88207Yjb.LJIILLIIL();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Nl() {
        C11000bw c11000bw;
        this.LJLJL = false;
        if (this.LLD && o.LJ(LJIIL().kv0(PauseLiveChannel.class), Boolean.FALSE)) {
            Rl(5000L);
        }
        Yl(LJIIL(), false);
        C88207Yjb.LJIIJ();
        ((BroadcastTunnelVM) this.LLIIZ.getValue()).LJLIL.setValue(A9Z.STREAM_PAUSE);
        Boolean bool = null;
        if (this.LL) {
            Vl().removeCallbacksAndMessages(null);
            return;
        }
        PrivacyCert.Builder LIZ = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-voice-onLiveResume-365", "", "Switch from background to foreground during live broadcast");
        LIZ.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
        PrivacyCert build = LIZ.build();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
        C2M c2m = this.LJLL;
        if (c2m != null) {
            C30656C1k c30656C1k = this.LJLLL;
            if (c30656C1k != null) {
                c2m.LIZJ(c30656C1k, intentFilter);
            } else {
                o.LJIJI("phoneStateReceiver");
                throw null;
            }
        }
        if (C29306Beo.LJIILLIIL((Boolean) LJIIL().kv0(PauseLiveChannel.class))) {
            CKO cko = this.LJLLLL;
            if (cko != null) {
                cko.LJJIIJ(build);
            }
            if (LLIZ) {
                if (C29306Beo.LJJIFFI((Boolean) DataChannelGlobal.LJLJJI.mv0(C29065Bav.class)) && (c11000bw = this.LJLLLLLL) != null) {
                    c11000bw.LJLJJLL = true;
                }
                C11000bw c11000bw2 = this.LJLLLLLL;
                if (c11000bw2 != null) {
                    c11000bw2.LIZIZ(3);
                }
            } else {
                C11000bw c11000bw3 = this.LJLLLLLL;
                if (c11000bw3 != null) {
                    c11000bw3.LIZIZ(2);
                }
            }
        } else {
            C11000bw c11000bw4 = this.LJLLLLLL;
            if (c11000bw4 != null && c11000bw4.LJLILLLLZI) {
                c11000bw4.LIZLLL(3, 0, 1);
            }
        }
        C29702BlC LIZ2 = C18230nb.LIZ("ttlive_page_resume");
        LIZ2.LJ("broadcast");
        LIZ2.LJIIIZ();
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            bool = (Boolean) LJIILIIL.kv0(ECLiveStatusChangeChannel.class);
        }
        if (C29306Beo.LJIILLIIL(bool)) {
            C30355Bvj.LJIIJJI();
            if (!C32141Ny.LIZIZ()) {
                C7N.LJII().resumeAccompanimentPlay();
            }
        }
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void Wg(double d, double d2, double d3) {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void Wk() {
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILZLL).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILZLL;
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

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, X.InterfaceC86149XrV
    public final Fragment getFragment() {
        return this;
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void ha(boolean z) {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void hc(LiveCore liveCore, AbstractC39330Fc6 abstractC39330Fc6) {
    }

    @Override // X.InterfaceC21030s7
    public final void m7() {
        this.LJZ = false;
        C11000bw c11000bw = this.LJLLLLLL;
        if (c11000bw != null) {
            c11000bw.LJ();
        }
        lm(1);
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void s2(LiveCore liveCore, Cert cert) {
    }

    @Override // X.InterfaceC21030s7
    public final void t8() {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void u4(long j) {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void v3() {
    }

    @Override // X.InterfaceC21030s7
    public final void x() {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void xb(C34941Ys c34941Ys) {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void z0() {
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Kl() {
        DataChannel dataChannel;
        C3G c3g = this.LLIIL;
        if (c3g != null && (dataChannel = c3g.LIZ) != null) {
            dataChannel.jv0(c3g);
        }
        ((IGiftService) CN1.LIZ(IGiftService.class)).destroyGiftBannedManager();
        if (xl().roomLayout == 2) {
            C38.LIZ(false, C37.ORDER);
        } else {
            C38.LIZ(false, C37.BROADCAST);
        }
        if (FluencyNegativeTestExperiment.INSTANCE.isBroadcastPeriodSceneEnable()) {
            RunnableC30666C1u runnableC30666C1u = C2S.LIZ;
            if (runnableC30666C1u != null) {
                C15610jN.LIZ().removeCallbacks(runnableC30666C1u);
            }
            C2S.LIZ = null;
            C15610jN.LIZJ(C22.LJLIL, 0L);
        }
        C1Q2.LIZ.LIZJ();
        C3Z.LIZLLL();
        if (!this.LLFFF) {
            lm(3);
            this.LLFFF = true;
        }
        C20910rv.LJIILLIIL(null);
        LJIIL().jv0(this);
        C15610jN.LIZLLL(null);
        B73.LIZJ(null);
        Vl().removeCallbacksAndMessages(null);
        B4U.LIZ().LJJIIJ();
        LiveMonitorSampleSetting.INSTANCE.release();
        C31023CFn.LIZJ(true);
        xm();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C29044Baa.class);
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C54992Dv.class);
        dataChannelGlobal.jv0(this);
        C7N.LJIJ().h0().LJFF();
        try {
            C7N.LJIIIIZZ().clearAssets("effects");
        } catch (IllegalStateException e) {
            C0NB.LIZLLL(e.toString());
        }
        ((LinkedHashMap) C31014CFe.LIZLLL).clear();
        if (this.LLF) {
            C72818Shy.LJII("ttlive_report_success", this);
            C72818Shy.LJII("anchor_sub_gift_balance_changed", this);
            C72818Shy.LJII("ttlive_anchor_feedback_submit", this);
            this.LLF = false;
        }
        C29829BnF.LIZIZ(LJIIL());
        LivePerformanceManager LIZ = B4U.LIZ();
        LIZ.LJJII("stream");
        LIZ.LJJIJIIJI();
        LIZ.release();
        LIZ.LJZL = -1.0f;
        LIZ.LLD = -1.0f;
        LIZ.LL = -1.0d;
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Ol() {
        long j;
        boolean z;
        Object obj;
        C64.LIZJ("ttlive_page_start", "broadcast");
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_caption_status");
        LIZ.LJIIZILJ();
        HashMap hashMap = new HashMap();
        User owner = xl().getOwner();
        if (owner != null) {
            j = owner.getId();
        } else {
            j = 0;
        }
        hashMap.put("anchor_id", String.valueOf(j));
        hashMap.put("room_id", String.valueOf(xl().getId()));
        hashMap.put("live_type", "live_take_detail");
        hashMap.put("event_page", "live_take_detail");
        if (LiveCaptionAnchorSetting.getValue().length == 0) {
            z = true;
        } else {
            z = false;
        }
        String str = "1";
        if (!z) {
            for (String str2 : LiveCaptionAnchorSetting.getValue()) {
                if (o.LJ(str2, this.LLIILZL)) {
                    obj = "1";
                    break;
                }
            }
        }
        obj = CardStruct.IStatusCode.DEFAULT;
        hashMap.put("caption_authority", obj);
        Boolean LIZJ = InterfaceC30442Bx8.k1.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_ANCHOR_SWITCH.value");
        if (!LIZJ.booleanValue()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("caption_anchor_setting", str);
        LIZ.LJJIFFI(hashMap);
        LIZ.LIZJ("show");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Pl() {
        C11000bw c11000bw;
        if (this.LL) {
            return;
        }
        if (((BroadcastTunnelVM) this.LLIIZ.getValue()).LJLIL.getValue() != A9Z.STREAM_ON && (c11000bw = this.LJLLLLLL) != null) {
            c11000bw.LIZ(2);
        }
        Handler handler = this.LLFZ;
        if (handler != null) {
            ARunnableS41S0100000_5 aRunnableS41S0100000_5 = this.LLI;
            if (aRunnableS41S0100000_5 != null) {
                handler.removeCallbacks(aRunnableS41S0100000_5);
            } else {
                o.LJIJI("micCheckTimerRunnable");
                throw null;
            }
        }
    }

    public final LinkedList<Runnable> Sl() {
        return (LinkedList) this.LLIILII.getValue();
    }

    public final DialogC30679C2h Tl() {
        return (DialogC30679C2h) this.LJLLJ.getValue();
    }

    public final WeakHandler Vl() {
        return (WeakHandler) this.LLILL.getValue();
    }

    public final void Wl() {
        VoiceChatBroadcastInteractionFragment voiceChatBroadcastInteractionFragment;
        try {
            voiceChatBroadcastInteractionFragment = this.LLFF;
        } catch (Exception unused) {
        }
        if (voiceChatBroadcastInteractionFragment != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(childFragmentManager);
            c1b3.LJJI(voiceChatBroadcastInteractionFragment);
            c1b3.LJII();
            this.LLFF = null;
        }
    }

    @Override // X.InterfaceC21030s7
    public final void bh() {
        C18230nb.LIZ("ttlive_low_network").LJIIIZ();
    }

    public final void vm() {
        Handler handler = this.LLFZ;
        if (handler != null) {
            ARunnableS41S0100000_5 aRunnableS41S0100000_5 = this.LLI;
            if (aRunnableS41S0100000_5 != null) {
                handler.post(aRunnableS41S0100000_5);
            } else {
                o.LJIJI("micCheckTimerRunnable");
                throw null;
            }
        }
    }

    public final void xm() {
        if (!this.LJZL) {
            this.LJZL = true;
            LiveMessageSEI liveMessageSEI = new LiveMessageSEI();
            liveMessageSEI.timestamp = System.currentTimeMillis();
            LiveMessageID liveMessageID = new LiveMessageID();
            liveMessageID.primaryID = String.valueOf(getRoomId());
            liveMessageID.messageScene = "end_room";
            liveMessageSEI.uniqueID = liveMessageID;
            CKO cko = this.LJLLLL;
            if (cko != null) {
                cko.LIZ("live_message_sei", new JSONObject(GsonProtectorUtils.toJson(C09650Zl.LIZIZ, liveMessageSEI)), false);
            }
        }
        Vl().removeCallbacksAndMessages(null);
        LiveIllegalPresenter liveIllegalPresenter = this.LJLLI;
        if (liveIllegalPresenter != null) {
            liveIllegalPresenter.resetStatusToNormal();
        }
        this.LL = true;
        C12800eq.LIZLLL(EnumC12790ep.CreateLive);
        B4U.LIZ().getClass();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.CKO, O] */
    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Gl() {
        ?? LIZIZ;
        CKO cko;
        C7N.LJIJ().s40().LIZIZ(mo49getActivity(), getView(), C30544Bym.LIZ);
        C18200nY.LIZ("live_page_load", String.valueOf(System.currentTimeMillis()));
        C29697Bl7.LJII();
        synchronized (C3Y.LIZ) {
            LIZIZ = C3Y.LIZIZ();
        }
        if (LIZIZ != 0) {
            LIZIZ.setStreamCallback(this);
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            ((C32537Cpp) dataChannelGlobal.gv0(C54992Dv.class)).LIZ = LIZIZ;
            dataChannelGlobal.tv0(LiveStreamGlobalChannel.class, LIZIZ);
            cko = LIZIZ;
        } else {
            cko = null;
        }
        this.LJLLLL = cko;
        StreamUrlExtra streamUrlExtraSafely = xl().getStreamUrlExtraSafely();
        o.LJIIIIZZ(streamUrlExtraSafely, "mRoom.streamUrlExtraSafely");
        this.LLILLL = streamUrlExtraSafely;
        if (LiveStreamEnableUrlListSetting.INSTANCE.enable()) {
            CKO cko2 = this.LJLLLL;
            if (cko2 != null) {
                cko2.start(xl().getStreamUrl().pushUrlList);
            }
        } else {
            CKO cko3 = this.LJLLLL;
            if (cko3 != null) {
                cko3.start(xl().getStreamUrl().LIZIZ);
            }
        }
        LJIIL().rv0(StartPushStreamChannel.class, Boolean.TRUE);
        C2D frameListener = this.LLILLJJLI;
        CKO cko4 = this.LJLLLL;
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.LJIIIZ(frameListener, "frameListener");
        this.LLFII = new VoiceChatWidget(frameListener, cko4, childFragmentManager);
        ((WidgetManager) this.LLIIIILZ.getValue()).load(this.LLFII);
        View view = getView();
        if (view != null) {
            view.post(new ARunnableS41S0100000_5(this, 272));
        }
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal2.mv0(C29044Baa.class);
        if (room != null && room.getOwner().getSecUid() != null) {
            ((ITreasureBoxService) CN1.LIZ(ITreasureBoxService.class)).sf0(LJIIL(), Long.valueOf(room.getId()), room.getOwner().getSecUid());
        }
        dataChannelGlobal2.ov0(ServerTimeGapChangeEvent.class, this, new AqS171S0100000_5(this, 710));
    }

    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Long, O] */
    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Il() {
        C22800uy.LIZIZ();
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).reportEnterBroadcast();
        B4U.LIZ().LJJIIZ(true);
        C88207Yjb.LJIIIZ();
        C20910rv.LJIIL(getContext());
        DataChannel LJIIL = LJIIL();
        Boolean bool = Boolean.TRUE;
        LJIIL.rv0(UserIsAnchorChannel.class, bool);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.nv0(this, this, ShowEndPageEvent.class, new AqS171S0100000_5(this, 716));
        dataChannelGlobal.nv0(this, this, EndLiveWithoutEndPage.class, new AqS171S0100000_5(this, 717));
        dataChannelGlobal.nv0(this, this, FetchGreenScreenLiveGoalInterfaceEvent.class, new AqS171S0100000_5(this, 718));
        C29697Bl7.LJIILIIL();
        this.LJLZ = System.currentTimeMillis();
        C1Q2.LIZ.LJII(this, LJIIL());
        C30355Bvj.LJFF();
        final DataChannel LJIIL2 = LJIIL();
        LJIIL2.pv0(EffectRedDotStatusChangeEvent.class);
        EffectManager effectManager = C1KS.LIZIZ;
        String str = C0TY.LIZLLL;
        effectManager.fetchPanelInfoFromCache(str, false, "", 0, 0, new IFetchPanelInfoListener() { // from class: X.1kG
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
            public final void onFail(ExceptionResult exceptionResult) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(PanelInfoModel panelInfoModel) {
                List<EffectCategoryModel> categoryList;
                PanelInfoModel panelInfoModel2 = panelInfoModel;
                if (panelInfoModel2 != null && (categoryList = panelInfoModel2.getCategoryList()) != null) {
                    DataChannel dataChannel = DataChannel.this;
                    ArrayList arrayList = new ArrayList();
                    for (EffectCategoryModel effectCategoryModel : categoryList) {
                        if (C78880UxY.LJJJJLL(effectCategoryModel.getExtra(), C29306Beo.LJIIJ(dataChannel))) {
                            arrayList.add(effectCategoryModel);
                        }
                    }
                    final DataChannel dataChannel2 = DataChannel.this;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        final EffectCategoryModel effectCategoryModel2 = (EffectCategoryModel) it.next();
                        C1KS.LIZIZ.checkCategoryIsUpdate(C0TY.LIZLLL, effectCategoryModel2.getKey(), new C1KR() { // from class: X.1kE
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                            public final void checkChannelSuccess(boolean z) {
                                if (z) {
                                    InterfaceC30442Bx8.z.LIZJ().add(EffectCategoryModel.this.getKey());
                                    InterfaceC30442Bx8.A.LIZ(Boolean.TRUE);
                                    dataChannel2.pv0(EffectRedDotStatusChangeEvent.class);
                                    C1KS.LIZIZ.fetchCategoryEffect(C0TY.LIZLLL, EffectCategoryModel.this.getKey(), 0, 0, 0, CardStruct.IStatusCode.DEFAULT, null);
                                }
                            }
                        });
                    }
                }
            }
        });
        effectManager.fetchPanelInfo(str, false, "", 0, 0, null);
        effectManager.checkedEffectListUpdate(C0TY.LIZ(), new C1KR() { // from class: X.1kI
            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelSuccess(boolean z) {
                if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue() && z) {
                    InterfaceC30442Bx8.e.LIZ(Boolean.TRUE);
                    DataChannel.this.pv0(EffectRedDotStatusChangeEvent.class);
                }
            }
        });
        effectManager.fetchPanelInfoFromCache(C0TY.LIZIZ, false, "", 0, 0, new IFetchPanelInfoListener() { // from class: X.1kK
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
            public final void onFail(ExceptionResult exceptionResult) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(PanelInfoModel panelInfoModel) {
                List<EffectCategoryModel> categoryList;
                PanelInfoModel panelInfoModel2 = panelInfoModel;
                if (panelInfoModel2 != null && (categoryList = panelInfoModel2.getCategoryList()) != null) {
                    final DataChannel dataChannel = DataChannel.this;
                    for (final EffectCategoryModel effectCategoryModel : categoryList) {
                        C1KS.LIZIZ.checkCategoryIsUpdate(C0TY.LIZIZ, effectCategoryModel.getKey(), new C1KR() { // from class: X.1kJ
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                            public final void checkChannelSuccess(boolean z) {
                                if (z) {
                                    Boolean LIZJ = InterfaceC30442Bx8.s.LIZJ();
                                    o.LJIIIIZZ(LIZJ, "HAS_EVER_OPEN_STICKER_PANEL.value");
                                    if (LIZJ.booleanValue()) {
                                        InterfaceC30442Bx8.x.LIZJ().add(EffectCategoryModel.this.getName());
                                        InterfaceC30442Bx8.y.LIZ(Boolean.TRUE);
                                        dataChannel.pv0(EffectRedDotStatusChangeEvent.class);
                                    }
                                }
                            }
                        });
                    }
                }
            }
        });
        effectManager.checkedEffectListUpdate("livesoundeffect", new C1KR() { // from class: X.1kL
            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelSuccess(boolean z) {
                if (z) {
                    InterfaceC30442Bx8.LLLLIIL.LIZ(Boolean.TRUE);
                    DataChannel.this.pv0(EffectRedDotStatusChangeEvent.class);
                }
            }
        });
        C88207Yjb.LJIIIZ();
        C20910rv.LJIIL(getContext());
        C7N.LJIILJJIL().wN(getContext(), false);
        C7N.LJIILJJIL().Pb(getContext());
        C7N.LJIIZILJ().CO(getContext());
        EnumC30836C8i.LiveResource.preload();
        DataChannel LJIIL3 = LJIIL();
        LJIIL3.ov0(this, InteractStateChangeEvent.class, new AqS171S0100000_5(this, 720));
        LJIIL3.lv0(this, MemberMessageChannel.class, new AqS171S0100000_5(this, 721));
        LJIIL3.lv0(this, LiveExtendedScreenShowGuide.class, new AqS171S0100000_5(this, 723));
        LJIIL3.lv0(this, LiveExtendedScreenCloseGuide.class, new AqS171S0100000_5(this, 725));
        LJIIL3.lv0(this, LiveNotShowGuideAgain.class, new AqS171S0100000_5(this, 727));
        LJIIL3.ov0(this, LiveCenterStatusChannel.class, new AqS171S0100000_5(this, 728));
        LJIIL3.lv0(this, StartPollMessageSEIEvent.class, new AqS171S0100000_5(this, 711));
        LJIIL3.lv0(this, PauseLiveChannel.class, new AqS171S0100000_5(this, 712));
        LJIIL3.lv0(this, VoiceChatStartFailedEvent.class, new AqS171S0100000_5(this, 713));
        LJIIL3.lv0(this, BroadcastEnableSubOnlyLiveEvent.class, new AqS171S0100000_5(this, 714));
        LJIIL3.lv0(this, BroadcastDisableSubOnlyTrialLiveEvent.class, new AqS171S0100000_5(this, 715));
        ((C32537Cpp) LJIIL3.gv0(BCN.class)).LIZ = Long.valueOf(getRoomId());
        LJIIL3.rv0(UserIsAnchorChannel.class, bool);
        ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(C28268B7o.class).LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LIZLLL(this))).LIZJ(new AfS57S0100000_5(this, 281), new InterfaceC64592gB() { // from class: X.9Cx
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
        register(C7N.LJIIL().registerAppEnterForeBackgroundCallback(this.LLILZ));
        if (!this.LLF) {
            C72818Shy.LIZLLL("ttlive_report_success", this);
            C72818Shy.LIZLLL("anchor_sub_gift_balance_changed", this);
            C72818Shy.LIZLLL("ttlive_anchor_feedback_submit", this);
            this.LLF = true;
        }
        this.LLFZ = new Handler(C16880lQ.LLJJJJ(), this);
        this.LLI = new ARunnableS41S0100000_5(this, 271);
        dataChannelGlobal.pv0(LiveStreamGlobalChannel.class, C2R.LIZ, C24.LJLIL);
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Ll() {
        C40625Fwz.LIZIZ();
        Wl();
        C11000bw c11000bw = this.LJLLLLLL;
        if (c11000bw != null) {
            c11000bw.LJLIL.removeCallbacksAndMessages(null);
        }
        CKO cko = this.LJLLLL;
        if (cko != null) {
            PrivacyCert.Builder LIZ = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-voice-onLiveDestroyView-487", "", "release when live ends");
            LIZ.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
            cko.LJIJJLI(LIZ.build());
        }
        this.LJLJLLL.LIZLLL();
        LiveIllegalPresenter liveIllegalPresenter = this.LJLLI;
        if (liveIllegalPresenter != null) {
            liveIllegalPresenter.detachView();
            C29306Beo.LJJJJ(Tl());
            C7N.LJIILL().release(getRoomId());
            C7N.LJIILL().retryReleaseAll();
            B5G.LIZJ(getRoomId(), "LiveBroadcastFragment_OnDestroy");
            C30686C2o.LJLILLLLZI.clear();
            ((IGiftService) CN1.LIZ(IGiftService.class)).onLiveBroadcastActivityDestroyed();
            ((IDebugService) CN1.LIZ(IDebugService.class)).onDestroy();
            return;
        }
        o.LJIJI("liveIllegalPresenter");
        throw null;
    }

    @Override // X.BYU
    public final void Xe() {
        C30868C9o.LIZLLL(R.string.sx4, getContext());
    }

    public final void Xl() {
        if (xl().getRoomAuthStatus() != null && xl().getRoomAuthStatus().enableGift) {
            C30326BvG c30326BvG = C30326BvG.LIZ;
            c30326BvG.post(new ARunnableS41S0100000_5(this, 110), LJIIL());
            c30326BvG.post(new ARunnableS41S0100000_5(this, 111), LJIIL());
            c30326BvG.post(new ARunnableS41S0100000_5(this, 112), LJIIL());
        }
    }

    @Override // X.BYU
    public final void aa() {
        IllegalReviewDialog illegalReviewDialog;
        if (isViewValid()) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_illegal_review_dialog", Boolean.TRUE);
            C0K2.LJII(0, "ttlive_broadcast_action_all", hashMap);
            if (this.LJLLILLLL == null) {
                Context context = getContext();
                LiveIllegalPresenter liveIllegalPresenter = this.LJLLI;
                if (liveIllegalPresenter != null) {
                    IllegalReviewDialog illegalReviewDialog2 = new IllegalReviewDialog();
                    illegalReviewDialog2.LJLIL = context;
                    illegalReviewDialog2.LJLLILLLL = liveIllegalPresenter;
                    this.LJLLILLLL = illegalReviewDialog2;
                    LiveIllegalPresenter liveIllegalPresenter2 = this.LJLLI;
                    if (liveIllegalPresenter2 != null) {
                        liveIllegalPresenter2.setIllegalDialogFragment(illegalReviewDialog2);
                    } else {
                        o.LJIJI("liveIllegalPresenter");
                        throw null;
                    }
                } else {
                    o.LJIJI("liveIllegalPresenter");
                    throw null;
                }
            }
            if (mo49getActivity() != null && (illegalReviewDialog = this.LJLLILLLL) != null) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
                illegalReviewDialog.show(childFragmentManager, "IllegalReviewDialog");
            }
        }
    }

    @Override // X.BYU
    public final void jd() {
        Integer num;
        xm();
        Zl(8);
        Creator creator = xl().creator;
        if (creator != null && (num = creator.roomContinue) != null) {
            OJY.LJIIL(10004, Al(), getRoomId(), this.LJZ, num.intValue());
        }
        C0NB.LIZIZ("VoiceChatBroadcastFragment", "room close forceEndLive");
        PrivacyCert.Builder LIZ = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-voice-anchor-force-end-live", "", "stop video/audio capture when live ends");
        LIZ.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
        om(LIZ.build());
    }

    @Override // X.BYU
    public final void n0() {
        if (isViewValid()) {
            Tl().LJJIIJZLJL(new ACListenerS44S1100000_5(this, 5));
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, X.InterfaceC86149XrV
    public final boolean onBackPressed() {
        if (!isAdded()) {
            return true;
        }
        return super.onBackPressed();
    }

    public final void sm() {
        Runnable poll;
        if (Sl().size() > 0) {
            Sl().poll();
            if (Sl().size() > 0 && (poll = Sl().poll()) != null) {
                poll.run();
            }
        }
    }

    @Override // X.InterfaceC21030s7
    public final void tl() {
        C30868C9o.LIZLLL(R.string.sx2, getContext());
        C78920UyC.LJI("livesdk_anchor_network_error", "2", "error_type");
        C18230nb.LIZ("ttlive_reconnect_stream_success").LJIIIZ();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Ql(View view) {
        Integer num;
        VoiceChatWidget voiceChatWidget;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        View view3;
        o.LJIIIZ(view, "view");
        view.setBackgroundColor(ColorProtector.parseColor("#151723"));
        ((IDebugService) CN1.LIZ(IDebugService.class)).IC(getContext(), LJIIL(), EnumC30213BtR.BROADCAST);
        String str = null;
        if (LiveEnableFixLiveEndSetting.INSTANCE.enable() && (voiceChatWidget = this.LLFII) != null && (view2 = voiceChatWidget.getView()) != null) {
            VoiceChatWidget voiceChatWidget2 = this.LLFII;
            if (voiceChatWidget2 != null && (view3 = voiceChatWidget2.getView()) != null) {
                layoutParams = view3.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
                layoutParams2.leftMargin = 1;
                layoutParams2.rightMargin = 1;
            } else {
                layoutParams2 = null;
            }
            view2.setLayoutParams(layoutParams2);
        }
        EnumC29309Ber.LIVE_VOICE.config();
        C40625Fwz.LIZ();
        C40625Fwz.LIZJ();
        C7N.LJIIZILJ().Dq0(xl().getId());
        C22920vA.LIZIZ(xl().getId());
        LJIIL().rv0(RoomChannel.class, xl());
        LJIIL().rv0(LiveEventCardStartTimeChannel.class, Long.valueOf(this.LJLZ / 1000));
        B5G.LIZ(getRoomId(), LJIIL(), "LiveBroadcastFragment_OnViewCreated");
        StreamUrlExtra streamUrlExtraSafely = xl().getStreamUrlExtraSafely();
        o.LJIIIIZZ(streamUrlExtraSafely, "mRoom.streamUrlExtraSafely");
        this.LLILLL = streamUrlExtraSafely;
        LiveIllegalPresenter liveIllegalPresenter = new LiveIllegalPresenter(getRoomId(), getContext());
        this.LJLLI = liveIllegalPresenter;
        liveIllegalPresenter.attachView(this);
        ((C30197BtB) this.LLIIJLIL.getValue()).LIZIZ = this;
        this.LJLLLLLL = new C11000bw((C30197BtB) this.LLIIJLIL.getValue());
        B73.LIZIZ(new ARunnableS41S0100000_5(this, 273), LJIIL());
        this.LJLLL = new C30656C1k(this);
        C7N.LJIIIIZZ().resetRoomStatus();
        if (LiveBroadcastPoorDeviceDowngradeSetting.INSTANCE.enable()) {
            B73.LIZ().postDelayed(new ARunnableS41S0100000_5(this, 274), LiveBroadcastPoorDeviceDelayDurationSetting.INSTANCE.value());
        } else {
            Xl();
        }
        Creator creator = xl().creator;
        if (creator != null && (num = creator.roomContinue) != null) {
            int intValue = num.intValue();
            Integer num2 = xl().creator.roomContinue;
            if (num2 != null && num2.intValue() == 2) {
                BZI LIZ = C28787BRn.LIZ("livesdk_back_to_live");
                LIZ.LJIILLIIL(LJIIL());
                LIZ.LJJIIJ(xl().getIdStr());
                LIZ.LJFF(String.valueOf(xl().getOwnerUserId()));
                LiveMode streamType = xl().getStreamType();
                if (streamType != null) {
                    str = C28509BGv.LIZ(streamType);
                }
                LIZ.LJIJ(str);
                LIZ.LIZJ("exempt");
                LIZ.LJJIIJZLJL();
            }
            C29697Bl7.LJIILL(intValue);
        }
    }

    public final void Rl(long j) {
        Handler handler;
        if (LiveBroadcastAnchorMicOccupiedSetting.INSTANCE.shouldShowToast() && (handler = this.LLFZ) != null) {
            handler.sendEmptyMessageDelayed(100, j);
        }
    }

    @Override // X.BYU
    public final void S8(boolean z) {
        if (!isViewValid()) {
            return;
        }
        if (z) {
            DialogC30679C2h Tl = Tl();
            Tl.setCancelable(false);
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/chatroom/ui/RoomCenterDialog", "show", Tl, new Object[0], "void", new C65300Pk0(false, "()V", "-6220233475122874963")).LIZ) {
                Tl.show();
            }
            C16880lQ.LJIJI(Tl.LJLJJLL, new ACListenerS40S0200000_5(Tl, this, 11));
            Tl.LJLLI = new C20(Tl);
            Tl.LJLLILLLL = new C21(Tl);
            return;
        }
        C29306Beo.LJJJJ(Tl());
    }

    @Override // X.C2T
    public final void T6(String str) {
        CKO cko;
        if (o.LJ(TelephonyManager.EXTRA_STATE_IDLE, str)) {
            CKO cko2 = this.LJLLLL;
            if (cko2 != null) {
                PrivacyCert.Builder LIZ = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-voice-onPhoneStateChangeListener-366", "", "Switch to the foreground after making a phone call during the live broadcast");
                LIZ.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
                cko2.LJIIJJI(LIZ.build());
                return;
            }
            return;
        }
        if (!o.LJ(TelephonyManager.EXTRA_STATE_OFFHOOK, str) || (cko = this.LJLLLL) == null) {
            return;
        }
        PrivacyCert.Builder LIZ2 = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-voice-onPhoneStateChangeListener-387", "", "Switch to the background when making a phone call during the live broadcast");
        LIZ2.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
        cko.LIZJ(LIZ2.build());
    }

    public final void Zl(int i) {
        C012403c.LJ("stopLive: reason=", i, "VoiceChatBroadcastFragment");
        C11000bw c11000bw = this.LJLLLLLL;
        if (c11000bw != null) {
            c11000bw.LJFF(i);
        }
    }

    public final void dm(Cert cert) {
        Integer num;
        BZI LIZ = C28787BRn.LIZ("anchor_close_live_confirm");
        LIZ.LJIILLIIL(LJIIL());
        LIZ.LJIJJ("video_live", "live_type");
        LIZ.LJJIIJZLJL();
        xm();
        Zl(1);
        PrivacyCert.Builder LIZ2 = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-anchor-finish-broadcast", "", "stop video/audio capture when live ends");
        LIZ2.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
        om(LIZ2.build());
        Creator creator = xl().creator;
        if (creator != null && (num = creator.roomContinue) != null) {
            OJY.LJIIL(10001, Al(), getRoomId(), this.LJZ, num.intValue());
        }
    }

    public final void fm(boolean z) {
        VoiceChatWidget voiceChatWidget;
        if (!this.LLD) {
            this.LLD = true;
            System.currentTimeMillis();
            if (z && (voiceChatWidget = this.LLFII) != null) {
                voiceChatWidget.LJLIL = null;
                InterfaceC21020s6 interfaceC21020s6 = voiceChatWidget.LJLILLLLZI;
                if (interfaceC21020s6 != null) {
                    interfaceC21020s6.setTextureFrameAvailableListener(null);
                }
            }
            if (LiveBroadcaseAudioDetectionHitSetting.INSTANCE.showHitDialog()) {
                Vl().postDelayed(new ARunnableS41S0100000_5(this, 270), 10000L);
                BZI LIZ = C28787BRn.LIZ("livesdk_microphone_occupied_toast_show");
                LIZ.LJIILLIIL(LJIIL());
                LIZ.LJJIIJZLJL();
                return;
            }
            this.LLII = false;
            Rl(10000L);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        boolean z;
        o.LJIIIZ(msg, "msg");
        if (msg.what == 100) {
            if (C29219BdP.LIZ(getContext(), this.LJLLLL)) {
                C30868C9o.LJI(getString(R.string.n0i));
                BZI LIZ = C28787BRn.LIZ("livesdk_anchor_microphone_occupied_toast_show");
                LIZ.LJIILLIIL(LJIIL());
                LIZ.LJIJJ("voice_chat", WM7.SCENE_SERVICE);
                LIZ.LJJIIJZLJL();
                z = true;
            } else {
                z = false;
            }
            this.LLII = z;
            this.LLIFFJFJJ = 0;
            vm();
        }
        return true;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message msg) {
        C276516r c276516r;
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        int i2 = 0;
        if (i == 3) {
            Object obj = msg.obj;
            if ((obj instanceof C29401Dk) && (c276516r = (C276516r) obj) != null) {
                i2 = c276516r.getErrorCode();
            }
            p8(i2);
            return;
        }
        Object obj2 = msg.obj;
        if (obj2 instanceof Exception) {
            if (i != 13) {
                return;
            }
            C0NB.LJ("VoiceChatBroadcastFragment", "fetch ngb rtmp url failed");
            PrivacyCert.Builder LIZ = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-voice-readyStartingLive-459", "", "start audio capture when live starts");
            LIZ.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
            km(LIZ.build());
            return;
        }
        if (i != 13) {
            return;
        }
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        StreamUrl streamUrl = xl().getStreamUrl();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        StreamUrlExtra streamUrlExtra = this.LLILLL;
        if (streamUrlExtra != null) {
            LIZ2.append(streamUrlExtra.ngbPushUrlPrefix);
            streamUrl.LIZ = X1D.LIZIZ(LIZ2);
            C279017q.LJ("fetch ngb RTMP url, url = ", str, "VoiceChatBroadcastFragment");
            PrivacyCert.Builder LIZ3 = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-voice-readyStartingLive-460", "", "start audio capture when live starts");
            LIZ3.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
            km(LIZ3.build());
            return;
        }
        o.LJIJI("streamUrlExtra");
        throw null;
    }

    @Override // X.BYU
    public final void kg(CharSequence charSequence) {
        if (isViewValid()) {
            Tl().LJLJJI.setText(charSequence);
        }
    }

    public final void km(Cert cert) {
        LiveCore liveCore;
        C0NB.LIZIZ("wws_test", "readyStartingLive");
        if (!this.mStatusActive || this.LL || this.LJLJLJ) {
            return;
        }
        String str = xl().getStreamUrl().LIZIZ;
        if (str == null || str.length() == 0) {
            xl().getStreamUrl().LIZIZ = xl().getStreamUrl().LIZ();
        }
        CKO cko = this.LJLLLL;
        if (cko != null) {
            cko.LIZLLL(cert);
        }
        C1JI.LJJIIJZLJL("capture_audio");
        CKO cko2 = this.LJLLLL;
        LiveCore liveCore2 = null;
        if (cko2 != null) {
            liveCore = cko2.LJ;
        } else {
            liveCore = null;
        }
        C22920vA.LIZJ(liveCore);
        if (!MultiGuestOnlyPushRtcWhenResumeSetting.INSTANCE.isEnable() || !((Boolean) this.LLILIL.getValue()).booleanValue() || ((Number) this.LLILII.getValue()).intValue() != 4) {
            C29702BlC LIZ = C18230nb.LIZ("ttlive_stream_url");
            if (LiveStreamEnableUrlListSetting.INSTANCE.enable()) {
                CKO cko3 = this.LJLLLL;
                if (cko3 != null) {
                    cko3.start(xl().getStreamUrl().pushUrlList);
                }
                LIZ.LIZLLL("url_list", xl().getStreamUrl().pushUrlList.toString());
            } else {
                CKO cko4 = this.LJLLLL;
                if (cko4 != null) {
                    cko4.start(xl().getStreamUrl().LIZIZ);
                }
                LIZ.LIZLLL("url", xl().getStreamUrl().LIZIZ);
            }
            LIZ.LJIIIZ();
        }
        CKO cko5 = this.LJLLLL;
        if (cko5 != null) {
            liveCore2 = cko5.LJ;
        }
        C22920vA.LIZLLL(liveCore2);
        LJIIL().rv0(StartPushStreamChannel.class, Boolean.TRUE);
    }

    public final void lm(int i) {
        BP4 LIZ = C28718BOw.LIZ();
        LIZ.getClass();
        ((StatusApi) LIZ.LIZIZ(StatusApi.class)).sendStreamStatus(xl().getId(), i, xl().getStreamId(), System.currentTimeMillis()).LJII(BTJ.LIZJ(StatusApi.class)).LJJJJL(new UYK(1, 500L)).LJJJLIIL(C2K.LJLIL, C2L.LJLIL);
    }

    public final void mm(String str) {
        ((IInteractService) CN1.LIZ(IInteractService.class)).rd(str, C51029K0z.LJJIIZI(new OSZ(str, "1")));
        this.LJLJLLL.LIZ(C265112h.LIZ(AbstractC73672Svk.LJJIJIIJI(5L, TimeUnit.SECONDS)).LJJJJZI(new AfS20S1100000_5(this, str, 1)));
    }

    public final void om(Cert cert) {
        boolean z;
        C30222Bta.LIZ(xl(), LJIIL());
        CKO cko = this.LJLLLL;
        if (cko != null) {
            cko.stop();
        }
        CKO cko2 = this.LJLLLL;
        if (cko2 != null) {
            cko2.LJIJI(cert);
        }
        C1JI.LJJIIJZLJL("release_audio");
        CKO cko3 = this.LJLLLL;
        if (cko3 != null) {
            cko3.LJJIIZI(cert);
        }
        C1JI.LJJIIJZLJL("release_video");
        if (!isViewValid()) {
            return;
        }
        Vl().post(new ARunnableS41S0100000_5(this, 113));
        if (xl().getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        ((IGiftService) CN1.LIZ(IGiftService.class)).showBroadCaseEndPage(z);
        C29697Bl7.LJIIIIZZ();
    }

    public final void onEvent(C28268B7o c28268B7o) {
        String string;
        int intValue;
        Integer num;
        Integer num2;
        Integer num3;
        int i = c28268B7o.LIZ;
        if (i != 6) {
            if (i != 7) {
                if (i != 8) {
                    if (i != 11) {
                        if (i != 17) {
                            return;
                        }
                        PrivacyCert.Builder LIZ = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-voice-onFinishBroadcastConfirmClick-776", "", "close live immediately");
                        LIZ.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
                        dm(LIZ.build());
                        return;
                    }
                    PrivacyCert.Builder LIZ2 = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-voice-anchor-kick-out", "", "stop audio capture when live ends");
                    LIZ2.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
                    PrivacyCert build = LIZ2.build();
                    Creator creator = xl().creator;
                    if (creator != null && (num3 = creator.roomContinue) != null) {
                        OJY.LJIIL(10002, Al(), getRoomId(), this.LJZ, num3.intValue());
                    }
                    xm();
                    Zl(1);
                    CKO cko = this.LJLLLL;
                    if (cko != null) {
                        cko.stop();
                    }
                    CKO cko2 = this.LJLLLL;
                    if (cko2 != null) {
                        cko2.LJIJI(build);
                    }
                    C1JI.LJJIIJZLJL("release_audio");
                    CKO cko3 = this.LJLLLL;
                    if (cko3 != null) {
                        cko3.LJJIIZI(build);
                    }
                    C1JI.LJJIIJZLJL("release_video");
                    C30868C9o.LIZLLL(R.string.sy3, getContext());
                    ActivityC45651qj mo49getActivity = mo49getActivity();
                    if (mo49getActivity == null) {
                        return;
                    }
                    mo49getActivity.finish();
                    return;
                }
            } else {
                ControlMessage controlMessage = c28268B7o.LIZJ;
                if ((controlMessage instanceof ControlMessage) && controlMessage.action == 4) {
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                    dataChannelGlobal.tv0(BlockCloseLiveReasonChannel.class, Boolean.TRUE);
                    PerceptionDialogInfo perceptionDialogInfo = controlMessage.perceptionDialogInfo;
                    if (perceptionDialogInfo != null) {
                        dataChannelGlobal.tv0(PerceptionDialogChannel.class, perceptionDialogInfo);
                    }
                    PunishEventInfo punishEventInfo = controlMessage.punishInfo;
                    if (punishEventInfo != null) {
                        dataChannelGlobal.tv0(PunishInfoChannel.class, punishEventInfo);
                    }
                    ControlMessage.Extra extra = controlMessage.extraInfo;
                    if (extra != null) {
                        this.LLIIIJ = UriProtector.parse(extra.banInfoUrl).buildUpon().appendQueryParameter("source", "inapp").appendQueryParameter("enter_from", "live").build().toString();
                        this.LLIIIL = CXJ.LJFF(extra.title, "");
                        this.LLIIIZ = CXJ.LJFF(extra.violationReason, "");
                        this.LLIIJI = CXJ.LJFF(extra.illegalText, "");
                    }
                    PrivacyCert.Builder LIZ3 = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-voice-onLiveEnd-424", "", "stop video/audio capture when live ends");
                    LIZ3.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
                    hm(LIZ3.build(), true);
                    Creator creator2 = xl().creator;
                    if (creator2 == null || (num2 = creator2.roomContinue) == null) {
                        return;
                    }
                    OJY.LJIIL(10003, Al(), getRoomId(), this.LJZ, num2.intValue());
                    return;
                }
                PrivacyCert.Builder LIZ4 = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-voice-live-end-425", "", "stop video/audio capture when live ends");
                LIZ4.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
                hm(LIZ4.build(), false);
                Creator creator3 = xl().creator;
                if (creator3 == null || (num = creator3.roomContinue) == null) {
                    return;
                }
                OJY.LJIIL(c28268B7o.LIZIZ, Al(), getRoomId(), this.LJZ, num.intValue());
                return;
            }
        }
        Context context = getContext();
        if (context == null || BH7.LIZLLL(context, LJIIL(), new C29095BbP(this), new C29094BbO(this), new C83281WmL(this))) {
            return;
        }
        Integer num4 = (Integer) LJIIL().kv0(C28401BCr.class);
        if (num4 == null || (intValue = num4.intValue()) <= 0) {
            string = getResources().getString(R.string.ka0);
        } else {
            string = getResources().getQuantityString(R.plurals.kf, intValue, Integer.valueOf(intValue));
        }
        o.LJIIIIZZ(string, "if (userCount <= 0) reso…rCount,\n                )");
        View _$_findCachedViewById = _$_findCachedViewById(R.id.fvb);
        if (_$_findCachedViewById != null) {
            C29306Beo.LJJLIIIJJI(_$_findCachedViewById, true);
        }
        long currentTimeMillis = System.currentTimeMillis();
        C1EW.LIZ(C28718BOw.LIZ().LIZ().getAnchorPreFinish(getRoomId()).LJII(BTJ.LIZIZ(this))).LJJJLIIL(new AfS3S1100100_5(currentTimeMillis, this, string, 5), new AfS3S1100100_5(currentTimeMillis, this, string, 6));
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        String LJJIJIL;
        String str;
        String str2 = c199097rd.LJLIL;
        int hashCode = str2.hashCode();
        boolean z = false;
        if (hashCode != -871885125) {
            String str3 = "";
            Object obj = null;
            if (hashCode != 1140027691) {
                if (hashCode != 1501615659 || !str2.equals("anchor_sub_gift_balance_changed")) {
                    return;
                }
                long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
                String LIZJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(currentUserId);
                InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns2 != null) {
                    str = u.LJJIJIL(interfaceC78280Uns2, "anchorUid", "");
                } else {
                    str = null;
                }
                InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns3 != null) {
                    obj = Integer.valueOf(u.LJJIJIIJI(interfaceC78280Uns3, "count", 0));
                }
                if (!o.LJ(LIZJ, str) || LIZJ == null) {
                    return;
                }
                Map LIZJ2 = InterfaceC30442Bx8.K0.LIZJ();
                o.LJIIIIZZ(LIZJ2, "LIVE_SUB_GIFT_COUNT.value");
                LIZJ2.put(Long.valueOf(currentUserId), obj);
                return;
            }
            if (!str2.equals("ttlive_report_success") || (interfaceC78280Uns = c199097rd.LJLILLLLZI) == null) {
                return;
            }
            String LJJIJIL2 = u.LJJIJIL(interfaceC78280Uns, "source", "");
            InterfaceC78280Uns interfaceC78280Uns4 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns4 != null) {
                obj = u.LJJIJIL(interfaceC78280Uns4, "action", "");
            }
            if (!o.LJ(LJJIJIL2, "message") || !o.LJ(obj, "")) {
                return;
            }
            InterfaceC78280Uns interfaceC78280Uns5 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns5 != null && (LJJIJIL = u.LJJIJIL(interfaceC78280Uns5, "content", "")) != null) {
                str3 = LJJIJIL;
            }
            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager == null) {
                return;
            }
            ((IAdminSettingService) CN1.LIZ(IAdminSettingService.class)).jE(xl().getId(), str3, fragmentManager, 3);
            return;
        }
        if (!str2.equals("ttlive_anchor_feedback_submit")) {
            return;
        }
        C0NB.LIZIZ("InteractALogUtil", "submit feedback, upload Alog");
        InterfaceC78280Uns interfaceC78280Uns6 = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns6 != null) {
            z = u.LJJIIZI(interfaceC78280Uns6, "is_submit", false);
        }
        LJIIL().qv0(MultiCoHostFeedbackSubmitEvent.class, Boolean.valueOf(z));
    }

    @Override // X.InterfaceC10990bv
    public final void p8(int i) {
        Integer num;
        if (i != 30001) {
            if (i != 30003) {
                if (i != 50002) {
                    if (i != 4003150) {
                        if (i != 30003001) {
                            return;
                        }
                    } else {
                        C11000bw c11000bw = this.LJLLLLLL;
                        if (c11000bw == null) {
                            return;
                        }
                        c11000bw.LJ();
                        return;
                    }
                }
            }
            C2M c2m = this.LJLL;
            if (c2m != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("live_end_error_code", i);
                c2m.LIZ(bundle);
            }
        }
        PrivacyCert.Builder LIZ = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-voice-stop-audio-live-ends", "", "stop video/audio capture when live ends");
        LIZ.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
        hm(LIZ.build(), false);
        Creator creator = xl().creator;
        if (creator == null || (num = creator.roomContinue) == null) {
            return;
        }
        OJY.LJIILJJIL(i, Al(), getRoomId(), this.LJZ, num.intValue());
    }

    public final void pm(boolean z) {
        String str;
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LLLLLJLJLL;
        Integer guideNumber = c48459J0d.LIZJ();
        o.LJIIIIZZ(guideNumber, "guideNumber");
        if (guideNumber.intValue() >= 5) {
            this.LLIIII = false;
            return;
        }
        if (this.LLIIII) {
            if (Sl().size() == 0 || z) {
                this.LLIIII = false;
                _$_findCachedViewById(R.id.epj).setClickable(true);
                _$_findCachedViewById(R.id.epj).setVisibility(0);
                C15540jG c15540jG = new C15540jG();
                C15540jG c15540jG2 = new C15540jG();
                C76732zl c76732zl = new C76732zl();
                c76732zl.element = 2;
                C47061t0 guide_hand = (C47061t0) _$_findCachedViewById(R.id.e0u);
                o.LJIIIIZZ(guide_hand, "guide_hand");
                c15540jG.LIZ = guide_hand;
                c15540jG.LIZIZ = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_2");
                c15540jG.LJFF = false;
                c15540jG.LJI = 3;
                c15540jG.LJIIL = true;
                c15540jG.LJ = new C30661C1p(c15540jG2, c15540jG, this, c76732zl);
                C47061t0 start_black_line = (C47061t0) _$_findCachedViewById(R.id.kco);
                o.LJIIIIZZ(start_black_line, "start_black_line");
                c15540jG2.LIZ = start_black_line;
                c15540jG2.LIZIZ = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1");
                c15540jG2.LJFF = false;
                c15540jG2.LJI = 3;
                c15540jG2.LJIIL = true;
                c15540jG2.LJ = new C30668C1w(c15540jG, c15540jG2, this, c76732zl);
                if (C15380j0.LJIIZILJ()) {
                    c15540jG.LIZJ = "ttlive_livecenter_guide_hand.webp";
                    c15540jG2.LIZJ = "ttlive_livecenter_guide_black_line.webp";
                    C15490jB.LJI(c15540jG);
                    C15490jB.LJI(c15540jG2);
                } else {
                    c15540jG.LIZJ = "ttlive_livecenter_guide_hand_rtl.webp";
                    c15540jG2.LIZJ = "ttlive_livecenter_guide_black_line_rtl.webp";
                    C15490jB.LJI(c15540jG);
                    C15490jB.LJI(c15540jG2);
                }
                ((C47121t6) _$_findCachedViewById(R.id.e1a)).LJJIJIL(R.style.a3v);
                if (LiveExtendedScreenFilterTypeSetting.INSTANCE.getEnable()) {
                    ((TextView) _$_findCachedViewById(R.id.e1a)).setText(C15380j0.LJIILJJIL(R.string.mzj));
                } else {
                    ((TextView) _$_findCachedViewById(R.id.e1a)).setText(C15380j0.LJIILJJIL(R.string.knj));
                }
                ObjectAnimator LIZ = C0F0.LIZ((C47121t6) _$_findCachedViewById(R.id.e1a), View.ALPHA, new float[]{0.0f, 1.0f}, 180L, "ofFloat(guide_text, View…ME_DURATION_180.toLong())");
                ObjectAnimator duration = ObjectAnimator.ofFloat(_$_findCachedViewById(R.id.e1a), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(180L);
                o.LJIIIIZZ(duration, "ofFloat(guide_text, View…ME_DURATION_180.toLong())");
                duration.setStartDelay(2808L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(LIZ, duration);
                animatorSet.start();
                _$_findCachedViewById(R.id.epj).setClickable(true);
                C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.epj), new ACListenerS31S0300000_5(this, animatorSet, c15540jG, 12));
                BZI LIZ2 = C28787BRn.LIZ("livesdk_extended_comment_filed_guidence");
                LIZ2.LJFF(String.valueOf(xl().getOwnerUserId()));
                LIZ2.LJJIIJ(String.valueOf(getRoomId()));
                LiveMode streamType = xl().getStreamType();
                if (streamType != null) {
                    str = C28509BGv.LIZ(streamType);
                } else {
                    str = null;
                }
                LIZ2.LJIJ(str);
                LIZ2.LJJIIJZLJL();
                c48459J0d.LIZ(Integer.valueOf(guideNumber.intValue() + 1));
            }
            if (!Sl().contains(this.LLIL) && !z) {
                Sl().add(this.LLIL);
            }
        }
    }

    public final void qm(boolean z) {
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLLLIL;
        Boolean LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_CENTER_HAND_GUIDE_ANIMATION.value");
        if (LIZJ.booleanValue()) {
            if (Sl().size() == 0 || z) {
                c48459J0d.LIZ(Boolean.FALSE);
                _$_findCachedViewById(R.id.epj).setVisibility(0);
                _$_findCachedViewById(R.id.epj).setClickable(true);
                C15540jG c15540jG = new C15540jG();
                C15540jG c15540jG2 = new C15540jG();
                C47061t0 guide_hand = (C47061t0) _$_findCachedViewById(R.id.e0u);
                o.LJIIIIZZ(guide_hand, "guide_hand");
                c15540jG.LIZ = guide_hand;
                c15540jG.LIZIZ = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_2");
                c15540jG.LJFF = true;
                c15540jG.LJ = new C30665C1t(this, c15540jG2);
                C47061t0 black_line = (C47061t0) _$_findCachedViewById(R.id.aly);
                o.LJIIIIZZ(black_line, "black_line");
                c15540jG2.LIZ = black_line;
                c15540jG2.LIZIZ = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1");
                c15540jG2.LJFF = true;
                c15540jG2.LJ = new C28(this);
                if (C15380j0.LJIIZILJ()) {
                    c15540jG.LIZJ = "ttlive_livecenter_guide_hand_rtl.webp";
                    c15540jG2.LIZJ = "ttlive_livecenter_guide_black_line_rtl.webp";
                    C15490jB.LJI(c15540jG);
                    C15490jB.LJI(c15540jG2);
                } else {
                    c15540jG.LIZJ = "ttlive_livecenter_guide_hand.webp";
                    c15540jG2.LIZJ = "ttlive_livecenter_guide_black_line.webp";
                    C15490jB.LJI(c15540jG);
                    C15490jB.LJI(c15540jG2);
                }
                ((C47121t6) _$_findCachedViewById(R.id.e1a)).LJJIJIL(R.style.a3v);
                ((TextView) _$_findCachedViewById(R.id.e1a)).setText(C15380j0.LJIILJJIL(R.string.mfq));
                ObjectAnimator LIZ = C0F0.LIZ((C47121t6) _$_findCachedViewById(R.id.e1a), View.ALPHA, new float[]{0.0f, 1.0f}, 180L, "ofFloat(guide_text, View…Long(),\n                )");
                ObjectAnimator duration = ObjectAnimator.ofFloat(_$_findCachedViewById(R.id.e1a), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(180L);
                o.LJIIIIZZ(duration, "ofFloat(guide_text, View…(),\n                    )");
                duration.setStartDelay(2808L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(LIZ, duration);
                animatorSet.start();
                _$_findCachedViewById(R.id.epj).setClickable(true);
                C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.epj), new ACListenerS31S0300000_5(this, animatorSet, c15540jG, 13));
            }
            if (!Sl().contains(this.LLILZIL) && !z) {
                Sl().add(this.LLILZIL);
            }
        }
    }

    @Override // X.BYU
    public final void s5(CharSequence message) {
        o.LJIIIZ(message, "message");
        if (isViewValid()) {
            Tl().LJLJJL.setText(message);
        }
    }

    @Override // X.InterfaceC21030s7
    public final void xj(int i) {
        if (isViewValid()) {
            LJIIL().qv0(BroadcastNetworkStatus.class, Integer.valueOf(i));
            VoiceChatBroadcastInteractionFragment voiceChatBroadcastInteractionFragment = this.LLFF;
            if (voiceChatBroadcastInteractionFragment != null) {
                voiceChatBroadcastInteractionFragment.xj(i);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final View Jl(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        return C20910rv.LJI(R.layout.d4k, viewGroup, false, 12);
    }

    @Override // X.BYU
    public final void Sd(String message, boolean z) {
        o.LJIIIZ(message, "message");
        if (isViewValid()) {
            DialogC30679C2h Tl = Tl();
            Tl.LJLJJLL.setEnabled(z);
            Tl.LJLJJLL.setText(message);
        }
    }

    public final void Yl(DataChannel dataChannel, boolean z) {
        String str;
        String str2;
        if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_switch_to_background")) {
            return;
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        if (room != null && room.getOwnerUserId() == currentUserId) {
            BZI LIZ = C28787BRn.LIZ("livesdk_switch_to_background");
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJJIIJ(room.getIdStr());
            LIZ.LJFF(String.valueOf(room.getOwnerUserId()));
            LiveMode streamType = room.getStreamType();
            if (streamType != null) {
                str = C28509BGv.LIZ(streamType);
            } else {
                str = null;
            }
            LIZ.LJIJ(str);
            if (z) {
                str2 = "anchor_leave";
            } else {
                str2 = "anchor_back";
            }
            LIZ.LIZJ(str2);
            LIZ.LJJIIJZLJL();
        }
    }

    public final void cm(int i, boolean z) {
        BZI LIZ = C28787BRn.LIZ("anchor_close_live_cancel");
        LIZ.LJIILLIIL(LJIIL());
        LIZ.LJIJJ("video_live", "live_type");
        if (z) {
            if (i != 5) {
                if (i == 6) {
                    LIZ.LJIJJ("high_subscribers", "sub_only_live_strategy");
                }
            } else {
                LIZ.LJIJJ("high_acu", "sub_only_live_strategy");
            }
        }
        LIZ.LJJIIJZLJL();
    }

    public final void em(int i, boolean z) {
        BZI LIZ = C28787BRn.LIZ("anchor_close_live_popup");
        LIZ.LJIILLIIL(LJIIL());
        LiveMode streamType = xl().getStreamType();
        o.LJIIIIZZ(streamType, "mRoom.streamType");
        LIZ.LJIJJ(C28509BGv.LIZ(streamType), "live_type");
        if (z) {
            if (i != 5) {
                if (i == 6) {
                    LIZ.LJIJJ("high_subscribers", "sub_only_live_strategy");
                }
            } else {
                LIZ.LJIJJ("high_acu", "sub_only_live_strategy");
            }
        }
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "has_sub_only_live");
        LIZ.LJJIIJZLJL();
    }

    public final void hm(Cert cert, boolean z) {
        String str;
        if (!this.LL) {
            xm();
            Zl(1);
        }
        if (z && !C38354F3m.LJ(this.LLIIIJ)) {
            C7N.LJFF().Lu();
            Context context = getContext();
            C28871BUt c28871BUt = new C28871BUt(this.LLIIIJ);
            c28871BUt.LIZJ = true;
            c28871BUt.LIZIZ = C15380j0.LJIILJJIL(R.string.snt);
            C30882CAc.LJII(context, c28871BUt);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("room close onLiveEnd endByBanned:");
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        LIZ.append(str);
        C0NB.LIZIZ("VoiceChatBroadcastFragment", X1D.LIZIZ(LIZ));
        om(cert);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00aa, code lost:
    
        if (r5 > 0) goto L14;
     */
    @Override // X.InterfaceC21030s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(int r19, int r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment.G(int, int, java.lang.String):void");
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Hl(int i, int i2, Intent intent) {
        VoiceChatBroadcastInteractionFragment voiceChatBroadcastInteractionFragment = this.LLFF;
        if (voiceChatBroadcastInteractionFragment != null) {
            voiceChatBroadcastInteractionFragment.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamErrorListener
    public final void onError(int i, int i2, Exception exc) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append(' ');
        LIZ.append(i2);
        LIZ.append(' ');
        if (exc != null) {
            str = exc.getMessage();
        } else {
            str = null;
        }
        C31811Ce7.LJ(LIZ, str, LIZ, "VoiceChatBroadcastFragment");
    }

    public final void nm(String str, long j, boolean z, Integer num, long j2) {
        int i;
        int i2;
        if (getContext() == null) {
            return;
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.fvb);
        int i3 = 0;
        if (_$_findCachedViewById != null) {
            C29306Beo.LJJLIIIJJI(_$_findCachedViewById, false);
        }
        InterfaceC06390Mx LIZ = CN1.LIZ(ISubscribeService.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        ((ISubscribeService) LIZ).Rv();
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        boolean LIZJ = C28959BYd.LIZJ(i);
        C47071t1 c47071t1 = new C47071t1(getContext());
        c47071t1.LJII(str);
        c47071t1.LJIIL(R.string.ka2, new C30468BxY(this, num, LIZJ));
        c47071t1.LJIIIZ(R.string.ka1, new C29097BbR(this, num, LIZJ));
        c47071t1.LJIJ = new IDCListenerS281S0100000_5(num, 1);
        if (LIZJ) {
            InterfaceC06390Mx LIZ2 = CN1.LIZ(ISubscribeService.class);
            o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
            ((ISubscribeService) LIZ2).Rv();
            int i4 = (int) j2;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            C28959BYd.LIZLLL(c47071t1, i4, i2, LJIIL());
        }
        LiveDialog LIZ3 = c47071t1.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ3, new Object[0], "void", new C65300Pk0(false, "()V", "-6220233475122874963")).LIZ) {
            LIZ3.show();
        }
        if (num != null) {
            i3 = num.intValue();
        }
        em(i3, LIZJ);
        int currentTimeMillis = (int) (System.currentTimeMillis() - j);
        BZI LIZ4 = C28787BRn.LIZ("livesdk_close_live_duration");
        LIZ4.LJIILLIIL(LJIIL());
        LIZ4.LJIJJ(Integer.valueOf(currentTimeMillis), "duration");
        LIZ4.LJIJJ(Integer.valueOf(z ? 1 : 0), "request_succeed");
        LIZ4.LJJIIJZLJL();
    }
}
