package com.bytedance.android.livesdk.chatroom.ui;

import X.AbstractC004900f;
import X.AbstractC39330Fc6;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnonymousClass028;
import X.AnonymousClass078;
import X.AnonymousClass143;
import X.AnonymousClass147;
import X.AnonymousClass159;
import X.B4U;
import X.B5G;
import X.B6O;
import X.B83;
import X.BCN;
import X.BCX;
import X.BDT;
import X.BZI;
import X.C005600m;
import X.C00F;
import X.C06460Ne;
import X.C09650Zl;
import X.C09720Zs;
import X.C0EA;
import X.C0K2;
import X.C0NB;
import X.C0RI;
import X.C0RN;
import X.C0TM;
import X.C10U;
import X.C10V;
import X.C10W;
import X.C11000bw;
import X.C12700eg;
import X.C12740ek;
import X.C12750el;
import X.C12B;
import X.C12F;
import X.C12H;
import X.C14080gu;
import X.C14090gv;
import X.C141415gn;
import X.C15380j0;
import X.C15890jp;
import X.C16880lQ;
import X.C18200nY;
import X.C18280ng;
import X.C19700py;
import X.C19710pz;
import X.C19820qA;
import X.C19840qC;
import X.C1B3;
import X.C1B6;
import X.C1DG;
import X.C1E4;
import X.C1NX;
import X.C1O1;
import X.C21040s8;
import X.C22800uy;
import X.C22850v3;
import X.C22910v9;
import X.C22940vC;
import X.C22970vF;
import X.C25620zW;
import X.C264512b;
import X.C264812e;
import X.C266012q;
import X.C266712x;
import X.C276716t;
import X.C28246B6s;
import X.C28733BPl;
import X.C28787BRn;
import X.C28A;
import X.C28B;
import X.C29039BaV;
import X.C29044Baa;
import X.C29049Baf;
import X.C29174Bcg;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29689Bkz;
import X.C29705BlF;
import X.C2EG;
import X.C2EH;
import X.C2M;
import X.C2NU;
import X.C30195Bt9;
import X.C30196BtA;
import X.C30201BtF;
import X.C30216BtU;
import X.C30381He;
import X.C30382BwA;
import X.C30385BwD;
import X.C30718C3u;
import X.C30719C3v;
import X.C30869C9p;
import X.C30922CBq;
import X.C31024CFo;
import X.C31032CFw;
import X.C31281CPl;
import X.C31285CPp;
import X.C31811Ce7;
import X.C32537Cpp;
import X.C34941Ys;
import X.C36636EZk;
import X.C37661dq;
import X.C37691dt;
import X.C37791e3;
import X.C37821e6;
import X.C38581fK;
import X.C38921fs;
import X.C3M;
import X.C3N;
import X.C3O;
import X.C3Q;
import X.C3R;
import X.C3S;
import X.C3T;
import X.C3U;
import X.C40210FqI;
import X.C40611ib;
import X.C40625Fwz;
import X.C48459J0d;
import X.C48841JEv;
import X.C54992Dv;
import X.C55542Fy;
import X.C55552Fz;
import X.C55762Gu;
import X.C5H3;
import X.C73318Sq2;
import X.C73411SrX;
import X.C73933Szx;
import X.C73943T0h;
import X.C73969T1h;
import X.C780334l;
import X.C78598Ut0;
import X.C78613UtF;
import X.C78685UuP;
import X.C78857UxB;
import X.C78862UxG;
import X.C78996UzQ;
import X.C88207Yjb;
import X.CN1;
import X.CUC;
import X.CWI;
import X.EnumC264412a;
import X.EnumC29309Ber;
import X.EnumC30551Byt;
import X.InterfaceC04500Fq;
import X.InterfaceC10980bu;
import X.InterfaceC21020s6;
import X.InterfaceC21030s7;
import X.InterfaceC21070sB;
import X.InterfaceC266512v;
import X.InterfaceC28605BKn;
import X.InterfaceC29856Bng;
import X.InterfaceC30105Brh;
import X.InterfaceC30442Bx8;
import X.InterfaceC31286CPq;
import X.InterfaceC64592gB;
import X.InterfaceC78493UrJ;
import X.InterfaceC79150V4o;
import X.InterfaceC92693kP;
import X.P34;
import X.Q0C;
import X.T16;
import X.UFE;
import X.X1D;
import X.XKQ;
import X.XKX;
import Y.ARunnableS41S0100000_5;
import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import Y.IDBReceiverS4S0100000;
import Y.IDRunnableS3S0100100;
import Y.IDaS211S0100000;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Point;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.common.setting.ShowLowPerformanceTipsSwitcher;
import com.bytedance.android.live.broadcast.BaseBroadcastFragment;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.model.GameLiveInfo;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.tns.api.TnsPiracyApi;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.publicscreen.api.GiftHistoryManagerChannel;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.api.TipMessageChannel;
import com.bytedance.android.live.publicscreen.api.WidgetReadyEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.broadcast.interaction.function.illegal.LiveIllegalPresenter;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel;
import com.bytedance.android.livesdk.comp.api.game.PrepareCountDown;
import com.bytedance.android.livesdk.dataChannel.BroadcastDisableSubOnlyTrialLiveEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastEnableSubOnlyLiveEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.BroadcastShowOrientationBeginTime;
import com.bytedance.android.livesdk.dataChannel.EndLiveWithoutEndPage;
import com.bytedance.android.livesdk.dataChannel.GameBgmChannel;
import com.bytedance.android.livesdk.dataChannel.GameLiveGamepadRevokeTips;
import com.bytedance.android.livesdk.dataChannel.GameLiveNetworkPoorToastEvent;
import com.bytedance.android.livesdk.dataChannel.GameLiveWarnTipsShowingChannel;
import com.bytedance.android.livesdk.dataChannel.GameMicChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGameExtendedScreenCloseGuide;
import com.bytedance.android.livesdk.dataChannel.LiveGameExtendedScreenShowGuide;
import com.bytedance.android.livesdk.dataChannel.MemberMessageChannel;
import com.bytedance.android.livesdk.dataChannel.MobileGameStreamInfo;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ServerTimeGapChangeEvent;
import com.bytedance.android.livesdk.dataChannel.ShowEndPageEvent;
import com.bytedance.android.livesdk.dataChannel.StartPollMessageSEIEvent;
import com.bytedance.android.livesdk.dataChannel.StreamLogUploadEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.EnableTTCaptureSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.GameDualDeviceSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameStreamProportionAdaptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamBitrateSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamEnableSdkParamsSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamProfileSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveUseNewAudioCodecSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.StreamDefinitionLevelSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.StreamHardwareEncodeSetting;
import com.bytedance.android.livesdk.livesetting.game.BitrateErrorPromptSetting;
import com.bytedance.android.livesdk.livesetting.game.DetectRisksOfReproducedGamingContentSetting;
import com.bytedance.android.livesdk.livesetting.game.EnableMobileGameBroadcastFeedbackInfoAndDiagnose;
import com.bytedance.android.livesdk.livesetting.game.ExceptionInfo;
import com.bytedance.android.livesdk.livesetting.game.GameBroadcastAudioFocusSetting;
import com.bytedance.android.livesdk.livesetting.game.GameBroadcastExceptionConfig;
import com.bytedance.android.livesdk.livesetting.game.GameBroadcastExceptionConfigSetting;
import com.bytedance.android.livesdk.livesetting.game.GameLiveBroadcastReleaseVideoGift;
import com.bytedance.android.livesdk.livesetting.game.GameLiveInterruptResumeSetting;
import com.bytedance.android.livesdk.livesetting.game.GameLiveMemoryLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.game.InterruptGuidelinesSettingV2;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.message.LiveMessageID;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.IInputVideoStream;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import defpackage.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS6S0002000_5;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.game.CreateInfoResponse;
import webcast.api.game.TnsPiracyDetail;
import webcast.api.game.TnsPiracyInfoRequest;

/* loaded from: classes6.dex */
public final class GameBroadcastFragment extends BaseBroadcastFragment implements C10W, WeakHandler.IHandler, InterfaceC21030s7, C10V {
    public static final /* synthetic */ int LLIIJLIL = 0;
    public C2M LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public C10U LJLLJ;
    public C30216BtU LJLLL;
    public C264812e LJLLLL;
    public C22940vC LJLLLLLL;
    public C11000bw LJLZ;
    public C37661dq LJZ;
    public C37691dt LJZI;
    public InterfaceC30105Brh LJZL;
    public C3R LL;
    public long LLD;
    public XKQ LLFF;
    public XKQ LLFFF;
    public boolean LLFII;
    public C22910v9 LLFZ;
    public long LLI;
    public C19820qA LLIFFJFJJ;
    public C12750el LLIIIZ;
    public final Map<Integer, View> LLIIJI = new LinkedHashMap();
    public boolean LJLLILLLL = true;
    public final C5H3 LLF = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 185));
    public final C5H3 LLII = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 183));
    public final C5H3 LLIIII = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 184));
    public final C3M LLIIIILZ = new C3M(this);
    public final C73318Sq2 LLIIIJ = new C73318Sq2();
    public final C5H3 LLIIIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 182));

    @Override // X.InterfaceC21030s7
    public final void Ec(float f) {
    }

    @Override // X.InterfaceC21030s7
    public final void Wg(double d, double d2, double d3) {
    }

    @Override // X.InterfaceC21030s7
    public final void Wk() {
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIJI).clear();
    }

    @Override // X.InterfaceC21030s7
    public final void bh() {
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void hc(LiveCore liveCore, AbstractC39330Fc6 abstractC39330Fc6) {
    }

    @Override // X.InterfaceC21030s7
    public final void m7() {
        Room room;
        C0NB.LIZIZ("LivePitayaRunTaskFrequentControlManager", "createRoomSuccess");
        C22800uy.LIZ = 0;
        Tl("onStreamStart");
        if (this.LJLLILLLL) {
            C29689Bkz.LIZ.LJIIL(new AqS171S0100000_5(this, 297));
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).reportStartPushStream((WeakHandler) this.LLF.getValue());
        }
        this.LJLLILLLL = false;
        C264812e c264812e = this.LJLLLL;
        if (c264812e != null) {
            c264812e.LIZJ = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("user_id", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
                C28246B6s c28246B6s = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
                if (c28246B6s != null && (room = c28246B6s.LIZIZ) != null) {
                    jSONObject.put("room_id", room.getId());
                    jSONObject.put("anchor_id", room.getOwnerUserId());
                    jSONObject.put("live_mode", room.liveRoomMode);
                    jSONObject.put("game_label", room.getLabels());
                }
                jSONObject.put("stream_push_room_success", c264812e.LIZ);
                jSONObject.put("stream_push_core_start", c264812e.LIZIZ);
                jSONObject.put("stream_push_accessed", c264812e.LIZJ);
            } catch (JSONException e) {
                C0K2.LIZ(String.valueOf(e), e);
            }
            C0K2.LIZLLL("livesdk_gamelive_spend", new JSONObject(), null, jSONObject);
        }
        LJIIL().rv0(GameBroadcastStateChannel.class, CWI.StateConnected);
    }

    @Override // X.InterfaceC21030s7
    public final void s2(LiveCore liveCore, Cert cert) {
        o.LJIIIZ(cert, "cert");
    }

    @Override // X.InterfaceC21030s7
    public final void t8() {
    }

    @Override // X.InterfaceC21030s7
    public final void tl() {
    }

    @Override // X.InterfaceC21030s7
    public final void x() {
    }

    @Override // X.InterfaceC21030s7
    public final /* synthetic */ void xb(C34941Ys c34941Ys) {
    }

    @Override // X.InterfaceC21030s7
    public final void z0() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bytedance.android.livesdkapi.depend.model.live.LiveMode, O] */
    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Gl() {
        Intent intent;
        Object obj;
        MediaProjectionManager mediaProjectionManager;
        Intent intent2;
        Tl("onLiveActivityCreated");
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).reportBroadcastCreated();
        ((C32537Cpp) LJIIL().gv0(BCX.class)).LIZ = LiveMode.SCREEN_RECORD;
        C40625Fwz.LIZ();
        C40625Fwz.LIZJ();
        B5G.LIZ(getRoomId(), LJIIL(), "BgBroadcastFragment_OnActivityCreated");
        this.LJLLJ = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createLiveIllegalHelper(xl(), getContext(), LJIIL(), this);
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createCloseRoomHelper(xl(), getContext(), LJIIL(), this, this);
        C30216BtU c30216BtU = (C30216BtU) ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createSyncGiftHelper(xl());
        c30216BtU.LIZ();
        this.LJLLL = c30216BtU;
        C37661dq c37661dq = this.LJZ;
        if (c37661dq != null) {
            ActivityC45651qj activityC45651qj = c37661dq.LJFF;
            if (activityC45651qj != null) {
                C16880lQ.LJJLIIIJJIZ(activityC45651qj, c37661dq.LJJL, AnonymousClass028.LIZ("android.intent.action.CONFIGURATION_CHANGED"));
            }
            ActivityC45651qj activityC45651qj2 = c37661dq.LJFF;
            Intent intent3 = null;
            if (activityC45651qj2 != null && (intent2 = activityC45651qj2.getIntent()) != null) {
                intent = (Intent) intent2.getParcelableExtra("hotsoon.intent.extra.PROJECTION_INTENT");
            } else {
                intent = null;
            }
            c37661dq.LJJIFFI = intent;
            if (EnableTTCaptureSetting.INSTANCE.enable()) {
                ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).initLiveBroadcastContext();
                if (c37661dq.LJJIFFI == null) {
                    ActivityC45651qj activityC45651qj3 = c37661dq.LJFF;
                    if (activityC45651qj3 != null) {
                        obj = C16880lQ.LLILLJJLI(activityC45651qj3, "media_projection");
                    } else {
                        obj = null;
                    }
                    if ((obj instanceof MediaProjectionManager) && (mediaProjectionManager = (MediaProjectionManager) obj) != null) {
                        try {
                            P34 p34 = C29174Bcg.LIZ;
                            C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476411393, "bpea-live_page_check_intent");
                            p34.getClass();
                            intent3 = P34.LIZIZ(mediaProjectionManager, LJJIIJ);
                        } catch (Q0C e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("live page check intent exception errorCode: ");
                            LIZ.append(e.getErrorCode());
                            LIZ.append(", msg: ");
                            LIZ.append(e.getMessage());
                            C0NB.LJ("GameUiStrategy", X1D.LIZIZ(LIZ));
                        }
                    }
                    GameBroadcastFragment gameBroadcastFragment = c37661dq.LIZIZ;
                    C78598Ut0.LJIJJ(intent3, gameBroadcastFragment);
                    gameBroadcastFragment.startActivityForResult(intent3, 1000);
                }
            }
            Iterator it = ((ArrayList) c37661dq.LJJJJL).iterator();
            while (it.hasNext()) {
                ((InterfaceC04500Fq) it.next()).LIZ();
            }
        }
        dm();
        C18200nY.LIZ("live_page_load", String.valueOf(System.currentTimeMillis()));
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && room.getOwner().getSecUid() != null) {
            ((ITreasureBoxService) CN1.LIZ(ITreasureBoxService.class)).sf0(LJIIL(), Long.valueOf(room.getId()), room.getOwner().getSecUid());
        }
    }

    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Long, O] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Il() {
        Boolean bool;
        boolean z;
        int i;
        boolean z2;
        String str;
        PunishEventInfo punishEventInfo;
        Map<Integer, ExceptionInfo> exceptionInfo;
        InterfaceC28605BKn ho;
        Boolean bool2;
        Long l;
        Long l2;
        Boolean bool3;
        Boolean bool4;
        if (GameLiveBroadcastReleaseVideoGift.INSTANCE.getValue()) {
            ((C32537Cpp) LJIIL().gv0(C3S.class)).LIZ = Boolean.FALSE;
        }
        C22800uy.LIZIZ();
        if (ShowLowPerformanceTipsSwitcher.INSTANCE.isEnable()) {
            this.LLIFFJFJJ = new C19820qA(LJIIL());
        }
        Context context = getContext();
        InterfaceC92693kP interfaceC92693kP = null;
        if (context != null) {
            bool = Boolean.valueOf(new AnonymousClass078(context).LIZIZ());
        } else {
            bool = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLiveCreate , isNoticationEnable = ");
        LIZ.append(bool);
        Tl(X1D.LIZIZ(LIZ));
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).reportEnterBroadcast();
        this.LLD = System.currentTimeMillis();
        XKQ xkq = this.LLFF;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        GameLiveInfo gameLiveInfo = (GameLiveInfo) dataChannelGlobal.mv0(C30385BwD.class);
        boolean z3 = false;
        if (gameLiveInfo != null && (bool4 = gameLiveInfo.hasGameLive2Min) != null) {
            z = bool4.booleanValue();
        } else {
            z = false;
        }
        Integer num = (Integer) dataChannelGlobal.mv0(C30382BwA.class);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        boolean z4 = true;
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean LIZJ = InterfaceC30442Bx8.LJJJJZ.LIZJ();
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZLLL = C00F.LIZLLL("tryShowWeakDeviceTips. hadGameLive=", z, ", isWeakDevice=", z2, ", hadShow=");
            LIZLLL.append(LIZJ);
            C0NB.LJIIIZ("GameBroadcastFragment", X1D.LIZIZ(LIZLLL));
        }
        if (z2 && !z && !LIZJ.booleanValue()) {
            this.LLFF = XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C2EH(null), 2);
        }
        XKQ xkq2 = this.LLFFF;
        if (xkq2 != null) {
            xkq2.LIZIZ(null);
        }
        GameLiveInfo gameLiveInfo2 = (GameLiveInfo) dataChannelGlobal.mv0(C30385BwD.class);
        if (gameLiveInfo2 != null && (bool3 = gameLiveInfo2.hasGameLive2Min) != null) {
            z3 = bool3.booleanValue();
        }
        if (C30922CBq.LIZIZ) {
            C0RN.LIZLLL("tryShowStartGameLive2MinTipsTask. hadGameLive2min=", z3, "GameBroadcastFragment");
        }
        if (!z3) {
            this.LLFFF = XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C2EG(this, null), 2);
        }
        B4U.LIZ().LJJIIZ(true);
        C37661dq c37661dq = new C37661dq(xl(), this, LJIIL());
        EnumC29309Ber.GAME.config();
        c37661dq.LIZJ.mv0(WidgetReadyEvent.class, c37661dq, new IDqS416S0100000(c37661dq, 350));
        c37661dq.LIZJ.mv0(TipMessageChannel.class, c37661dq, new IDqS416S0100000(c37661dq, 352));
        c37661dq.LIZJ.mv0(PauseLiveChannel.class, c37661dq, new IDqS416S0100000(c37661dq, 355));
        c37661dq.LIZJ.mv0(GameLiveNetworkPoorToastEvent.class, c37661dq, new IDqS416S0100000(c37661dq, 356));
        c37661dq.LIZJ.mv0(GameBroadcastStateChannel.class, c37661dq, new IDqS416S0100000(c37661dq, 357));
        DataChannel dataChannel = c37661dq.LIZJ;
        dataChannel.mv0(GameLiveWarnTipsShowingChannel.class, c37661dq, new IDqS416S0100000(c37661dq, 358));
        dataChannel.mv0(GameLiveGamepadRevokeTips.class, c37661dq, new IDqS416S0100000(c37661dq, 359));
        C31285CPp xG = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).xG(c37661dq.LIZJ);
        if (xG != null) {
            c37661dq.LIZJ.rv0(GiftHistoryManagerChannel.class, xG);
        } else {
            xG = null;
        }
        c37661dq.LJJJJJ = xG;
        C31281CPl cw = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).cw(c37661dq.LIZJ);
        c37661dq.LIZLLL = cw;
        if (cw != null) {
            cw.LJIIIIZZ(c37661dq.LJJJLL, c37661dq.LJJJLZIJ);
        }
        if (BitrateErrorPromptSetting.INSTANCE.isEnable()) {
            c37661dq.LJJJJIZL = new C38921fs(c37661dq.LIZIZ, c37661dq.LIZ, c37661dq);
        }
        ((ArrayList) c37661dq.LJJJJL).add(c37661dq.LJJJJI);
        ((ArrayList) c37661dq.LJJJJL).add(c37661dq.LJJJJ);
        C38921fs c38921fs = c37661dq.LJJJJIZL;
        if (c38921fs != null) {
            ((ArrayList) c37661dq.LJJJJL).add(c38921fs);
        }
        if (DetectRisksOfReproducedGamingContentSetting.INSTANCE.isEnable()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c37661dq.LJJJJZ);
            arrayList.add(c37661dq.LJJJJZI);
            arrayList.add(c37661dq.LJJJLIIL);
            CreateInfoResponse.ResponseData responseData = C09720Zs.LIZIZ;
            if (responseData != null) {
                l = Long.valueOf(responseData.cliTnsCollectIntervalMs);
            } else {
                l = null;
            }
            CreateInfoResponse.ResponseData responseData2 = C09720Zs.LIZIZ;
            if (responseData2 != null) {
                l2 = Long.valueOf(responseData2.tnsReportIntervalMs);
            } else {
                l2 = null;
            }
            C18280ng.LIZ = new C19840qC(c37661dq.LJIIIZ(), String.valueOf(c37661dq.LIZ.getId()), arrayList, l, l2);
            AbstractC73672Svk.LJJIJIL(Boolean.TRUE).LJJJ(T16.LIZ).LJJJJZI(new InterfaceC64592gB() { // from class: X.1X9
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    if (C30922CBq.LIZIZ) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("MobileGameTnsSignalReporter. start(). ThreadName=");
                        LIZ2.append(C18280ng.LIZ());
                        C0NB.LJIIIZ("MobileGameTnsSignalReporter", X1D.LIZIZ(LIZ2));
                    }
                    C19840qC c19840qC = C18280ng.LIZ;
                    if (c19840qC != null) {
                        Iterator<InterfaceC18260ne> it = c19840qC.LIZLLL.iterator();
                        while (it.hasNext()) {
                            it.next().start();
                        }
                        C73411SrX c73411SrX = C18280ng.LIZIZ;
                        if (c73411SrX != null) {
                            c73411SrX.dispose();
                        }
                        C73411SrX c73411SrX2 = C18280ng.LIZJ;
                        if (c73411SrX2 != null) {
                            c73411SrX2.dispose();
                        }
                        C19840qC c19840qC2 = C18280ng.LIZ;
                        if (c19840qC2 != null) {
                            long j = c19840qC2.LJ;
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            C73620Suu c73620Suu = new C73620Suu(AbstractC73672Svk.LJJLIIIJLJLI(j, timeUnit));
                            AbstractC73946T0k abstractC73946T0k = T16.LIZ;
                            C18280ng.LIZIZ = (C73411SrX) c73620Suu.LJJJ(abstractC73946T0k).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1X5
                                @Override // X.InterfaceC64592gB
                                public final void accept(Object obj2) {
                                    TnsPiracyDetail tnsPiracyDetail;
                                    LinkedList<TnsPiracyDetail> linkedList = C18280ng.LIZLLL;
                                    if (!linkedList.isEmpty()) {
                                        TnsPiracyDetail removeFirst = linkedList.removeFirst();
                                        o.LJIIIIZZ(removeFirst, "cacheDetailList.removeFirst()");
                                        tnsPiracyDetail = removeFirst;
                                    } else {
                                        tnsPiracyDetail = new TnsPiracyDetail();
                                    }
                                    tnsPiracyDetail.recordTime = System.currentTimeMillis();
                                    C19840qC c19840qC3 = C18280ng.LIZ;
                                    Integer num2 = null;
                                    if (c19840qC3 != null) {
                                        Iterator<InterfaceC18260ne> it2 = c19840qC3.LIZLLL.iterator();
                                        while (it2.hasNext()) {
                                            it2.next().LIZ(tnsPiracyDetail);
                                        }
                                        if (C18280ng.LJ == null) {
                                            C18280ng.LJ = new LinkedList<>();
                                        }
                                        LinkedList<TnsPiracyDetail> linkedList2 = C18280ng.LJ;
                                        if (linkedList2 != null) {
                                            int size = linkedList2.size();
                                            C19840qC c19840qC4 = C18280ng.LIZ;
                                            if (c19840qC4 != null) {
                                                if (size >= c19840qC4.LIZ) {
                                                    if (C30922CBq.LIZIZ) {
                                                        StringBuilder LIZ3 = X1D.LIZ();
                                                        LIZ3.append("MobileGameTnsSignalReporter. recycle when sample. realDetailList size=");
                                                        LIZ3.append(linkedList2.size());
                                                        LIZ3.append(", config.maxSize=");
                                                        C19840qC c19840qC5 = C18280ng.LIZ;
                                                        if (c19840qC5 != null) {
                                                            LIZ3.append(c19840qC5.LIZ);
                                                            LIZ3.append(", ThreadName=");
                                                            LIZ3.append(C18280ng.LIZ());
                                                            C0NB.LJIIIZ("MobileGameTnsSignalReporter", X1D.LIZIZ(LIZ3));
                                                        } else {
                                                            o.LJIJI("config");
                                                            throw null;
                                                        }
                                                    }
                                                    TnsPiracyDetail remove = linkedList2.remove(0);
                                                    o.LJIIIIZZ(remove, "it.removeAt(0)");
                                                    C18280ng.LIZJ(remove);
                                                }
                                                linkedList2.add(tnsPiracyDetail);
                                                if (C30922CBq.LIZIZ) {
                                                    StringBuilder LIZ4 = X1D.LIZ();
                                                    LIZ4.append("MobileGameTnsSignalReporter. sample(). realDetailList's size=");
                                                    LinkedList<TnsPiracyDetail> linkedList3 = C18280ng.LJ;
                                                    if (linkedList3 != null) {
                                                        num2 = Integer.valueOf(linkedList3.size());
                                                    }
                                                    LIZ4.append(num2);
                                                    LIZ4.append(";cacheList's size=");
                                                    LIZ4.append(C18280ng.LIZLLL.size());
                                                    LIZ4.append("; ThreadName=");
                                                    LIZ4.append(C18280ng.LIZ());
                                                    LIZ4.append("; samplePoint=");
                                                    StringBuilder LIZ5 = X1D.LIZ();
                                                    LIZ5.append("TnsPiracyDetail(angle=");
                                                    LIZ5.append(tnsPiracyDetail.angle);
                                                    LIZ5.append(", acceleration=");
                                                    LIZ5.append(tnsPiracyDetail.acceleration);
                                                    LIZ5.append(", frontScreenClicks=");
                                                    LIZ5.append(tnsPiracyDetail.frontScreenClicks);
                                                    LIZ5.append(", backScreenClicks=");
                                                    LIZ5.append(tnsPiracyDetail.backScreenClicks);
                                                    LIZ5.append(", microSound=");
                                                    LIZ5.append(tnsPiracyDetail.microSound);
                                                    LIZ5.append(", recordTime=");
                                                    LIZ5.append(tnsPiracyDetail.recordTime);
                                                    LIZ5.append(')');
                                                    LIZ4.append(X1D.LIZIZ(LIZ5));
                                                    C0NB.LJIIIZ("MobileGameTnsSignalReporter", X1D.LIZIZ(LIZ4));
                                                    return;
                                                }
                                                return;
                                            }
                                            o.LJIJI("config");
                                            throw null;
                                        }
                                        return;
                                    }
                                    o.LJIJI("config");
                                    throw null;
                                }
                            }, new InterfaceC64592gB() { // from class: X.1X6
                                @Override // X.InterfaceC64592gB
                                public final void accept(Object obj2) {
                                    Throwable th = (Throwable) obj2;
                                    C0NB.LJ("MobileGameTnsSignalReporter", th.getMessage());
                                    BZI LIZ3 = C28787BRn.LIZ("livesdk_tns_piracy_info_report_result");
                                    C19840qC c19840qC3 = C18280ng.LIZ;
                                    if (c19840qC3 != null) {
                                        LIZ3.LJIJJ(c19840qC3.LIZIZ, "anchor_id");
                                        LIZ3.LJIJJ(th.getMessage(), "error_message");
                                        LIZ3.LJIIZILJ();
                                        LIZ3.LJJIIJZLJL();
                                        return;
                                    }
                                    o.LJIJI("config");
                                    throw null;
                                }
                            });
                            C19840qC c19840qC3 = C18280ng.LIZ;
                            if (c19840qC3 != null) {
                                C18280ng.LIZJ = (C73411SrX) new C73620Suu(AbstractC73672Svk.LJJLIIIJLJLI(c19840qC3.LJFF, timeUnit)).LJJJ(abstractC73946T0k).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1X7
                                    @Override // X.InterfaceC64592gB
                                    public final void accept(Object obj2) {
                                        final int i2;
                                        final ArrayList arrayList2 = new ArrayList();
                                        LinkedList<TnsPiracyDetail> linkedList = C18280ng.LJ;
                                        if (linkedList != null) {
                                            arrayList2.addAll(linkedList);
                                        }
                                        C18280ng.LJ = null;
                                        if (C30922CBq.LIZIZ) {
                                            StringBuilder LIZ3 = X1D.LIZ();
                                            LIZ3.append("MobileGameTnsSignalReporter. report(). list's size=");
                                            LIZ3.append(arrayList2.size());
                                            LIZ3.append(", roomId=");
                                            C19840qC c19840qC4 = C18280ng.LIZ;
                                            if (c19840qC4 != null) {
                                                LIZ3.append(c19840qC4.LIZJ);
                                                LIZ3.append(", uid=");
                                                C19840qC c19840qC5 = C18280ng.LIZ;
                                                if (c19840qC5 != null) {
                                                    JBR.LJIIJ(LIZ3, c19840qC5.LIZIZ, LIZ3, "MobileGameTnsSignalReporter");
                                                } else {
                                                    o.LJIJI("config");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("config");
                                                throw null;
                                            }
                                        }
                                        TnsPiracyInfoRequest tnsPiracyInfoRequest = new TnsPiracyInfoRequest();
                                        C19840qC c19840qC6 = C18280ng.LIZ;
                                        if (c19840qC6 != null) {
                                            tnsPiracyInfoRequest.userId = CastLongProtector.parseLong(c19840qC6.LIZIZ);
                                            C19840qC c19840qC7 = C18280ng.LIZ;
                                            if (c19840qC7 != null) {
                                                tnsPiracyInfoRequest.roomId = CastLongProtector.parseLong(c19840qC7.LIZJ);
                                                tnsPiracyInfoRequest.details = arrayList2;
                                                final int i3 = 1;
                                                if (!arrayList2.isEmpty()) {
                                                    Iterator it2 = arrayList2.iterator();
                                                    while (it2.hasNext()) {
                                                        if (((TnsPiracyDetail) it2.next()).microSound > 0) {
                                                            i2 = 1;
                                                            break;
                                                        }
                                                    }
                                                }
                                                i2 = 0;
                                                List<TnsPiracyDetail> list = tnsPiracyInfoRequest.details;
                                                o.LJIIIIZZ(list, "request.details");
                                                if (!list.isEmpty()) {
                                                    for (TnsPiracyDetail tnsPiracyDetail : list) {
                                                        try {
                                                            o.LJIIIIZZ(tnsPiracyDetail.angle, "detail.angle");
                                                        } catch (Exception unused) {
                                                            if (C30922CBq.LIZIZ) {
                                                                C0NB.LJIIIZ("MobileGameTnsSignalReporter", "isMotionDataValid throw exception.");
                                                            }
                                                        }
                                                        if ((!r2.isEmpty()) && (!o.LIZIZ((Double) ListProtector.get(tnsPiracyDetail.angle, 0)) || !o.LIZIZ((Double) ListProtector.get(tnsPiracyDetail.angle, 1)) || !o.LIZIZ((Double) ListProtector.get(tnsPiracyDetail.angle, 2)))) {
                                                            break;
                                                        }
                                                        o.LJIIIIZZ(tnsPiracyDetail.acceleration, "detail.acceleration");
                                                        if (!r4.isEmpty()) {
                                                            if (!o.LIZIZ((Double) ListProtector.get(tnsPiracyDetail.acceleration, 0)) || !o.LIZIZ((Double) ListProtector.get(tnsPiracyDetail.acceleration, 1)) || !o.LIZIZ((Double) ListProtector.get(tnsPiracyDetail.acceleration, 2))) {
                                                                break;
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                }
                                                i3 = 0;
                                                final int size = tnsPiracyInfoRequest.details.size();
                                                ((TnsPiracyApi) Q7L.LIZIZ(TnsPiracyApi.class)).reportTnsPiracySignal(tnsPiracyInfoRequest).LJJJ(T16.LIZ).LJJJLL(new InterfaceC64592gB() { // from class: X.1X3
                                                    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
                                                    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
                                                    @Override // X.InterfaceC64592gB
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                        To view partially-correct add '--show-bad-code' argument
                                                    */
                                                    public final void accept(java.lang.Object r13) {
                                                        /*
                                                            r12 = this;
                                                            com.bytedance.android.live.network.response.BaseResponse r13 = (com.bytedance.android.live.network.response.BaseResponse) r13
                                                            if (r13 == 0) goto L32
                                                            int r6 = r13.statusCode
                                                            if (r6 != 0) goto L35
                                                            r5 = 1
                                                            r0 = 0
                                                            java.lang.String r2 = ""
                                                            int r1 = r1
                                                            int r3 = r2
                                                            int r4 = r3
                                                            X.C18280ng.LIZIZ(r0, r1, r2, r3, r4, r5)
                                                        L15:
                                                            boolean r0 = X.C30922CBq.LIZIZ
                                                            if (r0 == 0) goto L31
                                                            java.lang.String r1 = "MobileGameTnsSignalReporter. report(). onNext: statusCode="
                                                            java.lang.String r0 = ". ThreadName="
                                                            java.lang.StringBuilder r1 = X.C7MY.LJ(r1, r6, r0)
                                                            java.lang.String r0 = X.C18280ng.LIZ()
                                                            r1.append(r0)
                                                            java.lang.String r1 = X.X1D.LIZIZ(r1)
                                                            java.lang.String r0 = "MobileGameTnsSignalReporter"
                                                            X.C0NB.LJIIIZ(r0, r1)
                                                        L31:
                                                            return
                                                        L32:
                                                            r6 = -999999(0xfffffffffff0bdc1, float:NaN)
                                                        L35:
                                                            r11 = 0
                                                            java.lang.String r8 = "response status code not right."
                                                            int r7 = r1
                                                            int r9 = r2
                                                            int r10 = r3
                                                            X.C18280ng.LIZIZ(r6, r7, r8, r9, r10, r11)
                                                            goto L15
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: X.C1X3.accept(java.lang.Object):void");
                                                    }
                                                }, new InterfaceC64592gB() { // from class: X.1X4
                                                    @Override // X.InterfaceC64592gB
                                                    public final void accept(Object obj3) {
                                                        Throwable th = (Throwable) obj3;
                                                        if (th instanceof CH1) {
                                                            CH1 ch1 = (CH1) th;
                                                            int errorCode = ch1.getErrorCode();
                                                            StringBuilder LIZ4 = X1D.LIZ();
                                                            LIZ4.append("server status code error. logId: ");
                                                            LIZ4.append(ch1.getxTtLogId());
                                                            LIZ4.append(", msg: ");
                                                            LIZ4.append(ch1.getErrorMsg());
                                                            C18280ng.LIZIZ(errorCode, size, X1D.LIZIZ(LIZ4), i2, i3, false);
                                                        } else if (th instanceof C0TL) {
                                                            C0TL c0tl = (C0TL) th;
                                                            int i4 = c0tl.statusCode;
                                                            StringBuilder LIZ5 = X1D.LIZ();
                                                            LIZ5.append("msg: ");
                                                            LIZ5.append(c0tl.getLocalizedMessage());
                                                            C18280ng.LIZIZ(i4, size, X1D.LIZIZ(LIZ5), i2, i3, false);
                                                        } else {
                                                            StringBuilder LIZ6 = X1D.LIZ();
                                                            LIZ6.append("throwable=");
                                                            LIZ6.append(th.getClass().getName());
                                                            LIZ6.append(", message");
                                                            LIZ6.append(th.getMessage());
                                                            C18280ng.LIZIZ(-888888, size, X1D.LIZIZ(LIZ6), i2, i3, false);
                                                        }
                                                        StringBuilder LIZ7 = X1D.LIZ();
                                                        LIZ7.append("MobileGameTnsSignalReporter. report().  throwable, cause=");
                                                        LIZ7.append(th.getCause());
                                                        LIZ7.append(", message");
                                                        LIZ7.append(th.getMessage());
                                                        LIZ7.append(". ThreadName=");
                                                        LIZ7.append(C18280ng.LIZ());
                                                        C0NB.LJ("MobileGameTnsSignalReporter", X1D.LIZIZ(LIZ7));
                                                        Iterator<TnsPiracyDetail> it3 = arrayList2.iterator();
                                                        while (it3.hasNext()) {
                                                            C18280ng.LIZJ(it3.next());
                                                            it3.remove();
                                                        }
                                                    }
                                                }, new IDaS211S0100000(arrayList2, 4));
                                                return;
                                            }
                                            o.LJIJI("config");
                                            throw null;
                                        }
                                        o.LJIJI("config");
                                        throw null;
                                    }
                                }, new InterfaceC64592gB() { // from class: X.1X8
                                    @Override // X.InterfaceC64592gB
                                    public final void accept(Object obj2) {
                                        C0NB.LJ("MobileGameTnsSignalReporter", ((Throwable) obj2).getMessage());
                                    }
                                });
                                return;
                            } else {
                                o.LJIJI("config");
                                throw null;
                            }
                        }
                        o.LJIJI("config");
                        throw null;
                    }
                    o.LJIJI("config");
                    throw null;
                }
            });
        }
        if (GameBroadcastAudioFocusSetting.INSTANCE.isEnable()) {
            c37661dq.LJJIII = new AnonymousClass143(c37661dq.LIZIZ, c37661dq.LIZ, c37661dq);
        }
        GameLiveInfo gameLiveInfo3 = (GameLiveInfo) dataChannelGlobal.mv0(C30385BwD.class);
        if (gameLiveInfo3 != null && (bool2 = gameLiveInfo3.hasCommentInGameLive) != null) {
            z4 = bool2.booleanValue();
        }
        c37661dq.LJI = z4;
        this.LJZ = c37661dq;
        C37691dt c37691dt = new C37691dt(getContext(), xl());
        this.LJZI = c37691dt;
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setLiveStreamCallback(). this=");
            LIZ2.append(c37691dt);
            C0NB.LJIIIZ("GameServiceStrategy", X1D.LIZIZ(LIZ2));
        }
        c37691dt.LJLJJL = this;
        if (GameDualDeviceSetting.INSTANCE.isExperimentGroup()) {
            C37691dt c37691dt2 = this.LJZI;
            if (c37691dt2 != null) {
                this.LLIIIZ = new C12750el(c37691dt2, this, LJIIL());
            } else {
                o.LJIJI("mServiceStrategy");
                throw null;
            }
        }
        InterfaceC10980bu createStatusReporter = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createStatusReporter(xl());
        createStatusReporter.LIZ(new C30195Bt9(this));
        this.LJLZ = new C11000bw(createStatusReporter);
        C88207Yjb.LJIIIZ();
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).resetGameLiveStreamEndFlag();
        dataChannelGlobal.nv0(this, this, ShowEndPageEvent.class, new AqS171S0100000_5(this, 309));
        dataChannelGlobal.ov0(GameBgmChannel.class, this, new AqS171S0100000_5(this, 310));
        dataChannelGlobal.ov0(GameMicChannel.class, this, new AqS171S0100000_5(this, 311));
        dataChannelGlobal.nv0(this, this, EndLiveWithoutEndPage.class, new AqS171S0100000_5(this, 312));
        dataChannelGlobal.tv0(BroadcastShowOrientationBeginTime.class, Long.valueOf(System.currentTimeMillis()));
        IPullStreamService iPullStreamService = (IPullStreamService) CN1.LIZ(IPullStreamService.class);
        if (iPullStreamService != null && (ho = iPullStreamService.ho()) != null) {
            ho.LIZ();
        }
        DataChannel LJIIL = LJIIL();
        LJIIL.lv0(this, LiveGameExtendedScreenShowGuide.class, new AqS171S0100000_5(this, 313));
        LJIIL.lv0(this, StartPollMessageSEIEvent.class, new AqS171S0100000_5(this, 314));
        LJIIL.mv0(PauseLiveChannel.class, this, new AqS171S0100000_5(this, 315));
        LJIIL.lv0(this, BroadcastEnableSubOnlyLiveEvent.class, new AqS171S0100000_5(this, 316));
        LJIIL.lv0(this, BroadcastDisableSubOnlyTrialLiveEvent.class, new AqS171S0100000_5(this, 306));
        ((C32537Cpp) LJIIL.gv0(BCN.class)).LIZ = Long.valueOf(xl().getId());
        LJIIL.rv0(UserIsAnchorChannel.class, Boolean.TRUE);
        GameBroadcastExceptionConfig value = GameBroadcastExceptionConfigSetting.INSTANCE.getValue();
        if (C30922CBq.LIZIZ && value.getEnable() && (exceptionInfo = value.getExceptionInfo()) != null) {
            for (Map.Entry<Integer, ExceptionInfo> entry : exceptionInfo.entrySet()) {
                if (entry.getValue().isActive()) {
                    this.LLIIIJ.LIZ(AbstractC73672Svk.LJJLIIIJLJLI(entry.getValue().getDelayTime(), TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS54S0200000_5(this, entry, 13), B6O.LJLIL));
                }
            }
        }
        C22940vC c22940vC = new C22940vC();
        this.LJLLLLLL = c22940vC;
        C37661dq c37661dq2 = this.LJZ;
        if (c37661dq2 != null) {
            c37661dq2.LJJJJ.LJFF(c22940vC);
        }
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal2.mv0(C29044Baa.class);
        if (room != null) {
            WarningTag warningTag = room.warningTag;
            if (warningTag != null && (punishEventInfo = warningTag.punishInfo) != null) {
                str = punishEventInfo.punishId;
            } else {
                str = null;
            }
            this.LLI = C1E4.LJJII(str);
        }
        dataChannelGlobal2.ov0(ServerTimeGapChangeEvent.class, this, new AqS171S0100000_5(this, 307));
        dataChannelGlobal2.ov0(StreamLogUploadEvent.class, this, new AqS171S0100000_5(this, 308));
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null) {
            interfaceC92693kP = iHostAppContext.registerAppEnterForeBackgroundCallback((InterfaceC78493UrJ) this.LLIIIL.getValue());
        }
        register(interfaceC92693kP);
        Wl(C30719C3v.class);
        Wl(C30718C3u.class);
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Kl() {
        DataChannel dataChannel;
        if (GameDualDeviceSetting.INSTANCE.isExperimentGroup()) {
            C12750el c12750el = this.LLIIIZ;
            if (c12750el != null) {
                DataChannel dataChannel2 = c12750el.LIZJ;
                if (dataChannel2 != null) {
                    dataChannel2.jv0(c12750el);
                }
                C276716t.LJFF();
                Iterator<String> it = c12750el.LJIIIIZZ.keySet().iterator();
                while (it.hasNext()) {
                    C12740ek remove = c12750el.LJIIIIZZ.remove(it.next());
                    if (remove != null) {
                        SurfaceTextureHelper surfaceTextureHelper = remove.LIZ;
                        if (surfaceTextureHelper != null) {
                            surfaceTextureHelper.stopListening();
                        }
                        SurfaceTextureHelper surfaceTextureHelper2 = remove.LIZ;
                        if (surfaceTextureHelper2 != null) {
                            surfaceTextureHelper2.dispose();
                        }
                    }
                }
                C37691dt c37691dt = c12750el.LIZ;
                Iterator<String> it2 = c37691dt.LJLLI.keySet().iterator();
                while (it2.hasNext()) {
                    IInputVideoStream remove2 = c37691dt.LJLLI.remove(it2.next());
                    if (remove2 != null) {
                        try {
                            remove2.stop();
                            remove2.release();
                        } catch (Exception e) {
                            C0NB.LJ("GameServiceStrategy", Log.getStackTraceString(e));
                        }
                    }
                }
            }
            this.LLIIIZ = null;
        }
        boolean LJ = C40210FqI.LJ(C15380j0.LIZLLL());
        BZI LIZ = C28787BRn.LIZ("livesdk_live_over_ingame_overlay_permission");
        LIZ.LJIJJ(Long.valueOf(Al()), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(getRoomId()), "room_id");
        LIZ.LJIJJ("screen_share", "live_type");
        LIZ.LJIJJ(Integer.valueOf(LJ ? 1 : 0), "overlay_permission");
        LIZ.LJJIIJZLJL();
        ((IGiftService) CN1.LIZ(IGiftService.class)).destroyGiftBannedManager();
        Tl("onLiveDestroy");
        Xl(C78857UxB.LJJIIJ(1476788483, "bpea-578"));
        C37661dq c37661dq = this.LJZ;
        if (c37661dq != null && !c37661dq.LJIILJJIL()) {
            C0RI c0ri = c37661dq.LJJI;
            if (c0ri != null) {
                DataChannel dataChannel3 = c0ri.LIZ;
                dataChannel3.getClass();
                dataChannel3.jv0(c0ri);
            }
            c37661dq.LJIJ(C12F.CMD_TRANSITION_TO_DESTROY);
            ((DialogFragment) c37661dq.LJJIIJ.getValue()).dismiss();
            c37661dq.LJIILIIL.dispose();
            DataChannel dataChannel4 = c37661dq.LIZJ;
            dataChannel4.getClass();
            dataChannel4.jv0(c37661dq);
            CUC cuc = c37661dq.LJIIZILJ;
            if (cuc != null) {
                cuc.LJIIIZ();
            }
            InterfaceC266512v interfaceC266512v = c37661dq.LJJIJL;
            if (interfaceC266512v != null) {
                interfaceC266512v.onDestroy();
            }
            AnonymousClass143 anonymousClass143 = c37661dq.LJJIII;
            if (anonymousClass143 != null) {
                C38581fK c38581fK = anonymousClass143.LJIIJJI;
                if (c38581fK != null) {
                    AnonymousClass147.LJII.remove(c38581fK);
                    anonymousClass143.LJIIJJI = null;
                }
                anonymousClass143.LJ.removeCallbacksAndMessages(null);
                if (anonymousClass143.LJIIL > 0) {
                    anonymousClass143.LJIILIIL = (System.currentTimeMillis() - anonymousClass143.LJIIL) + anonymousClass143.LJIILIIL;
                    anonymousClass143.LJIIL = 0L;
                }
                BZI LIZ2 = C28787BRn.LIZ("livesdk_mic_off_duration");
                LIZ2.LJIJJ(String.valueOf(anonymousClass143.LIZIZ.getOwnerUserId()), "anchor_id");
                LIZ2.LJIJJ(anonymousClass143.LIZIZ.getIdStr(), "room_id");
                C30869C9p.LIZ(anonymousClass143.LJIILIIL, LIZ2, "duration");
            }
            C12H c12h = c37661dq.LJIJI;
            if (c12h != null && (dataChannel = c12h.LJLJJL) != null) {
                dataChannel.jv0(c12h);
            }
            if (GameLiveMemoryLeakOptSetting.INSTANCE.getValue()) {
                C37791e3 c37791e3 = c37661dq.LJIJ;
                if (c37791e3 != null) {
                    c37791e3.LJLLI.dispose();
                    DataChannel dataChannel5 = c37791e3.LJLLJ;
                    if (dataChannel5 != null) {
                        dataChannel5.jv0(c37791e3);
                    }
                }
                C55762Gu c55762Gu = c37661dq.LJIJJLI;
                if (c55762Gu != null) {
                    DataChannel dataChannel6 = c55762Gu.LJLJLLL;
                    if (dataChannel6 != null) {
                        dataChannel6.jv0(c55762Gu);
                    }
                    c55762Gu.LJLJLJ = null;
                    c55762Gu.LJLJLLL = null;
                }
            }
            ActivityC45651qj activityC45651qj = c37661dq.LJFF;
            if (activityC45651qj != null) {
                IDBReceiverS4S0100000 iDBReceiverS4S0100000 = c37661dq.LJJL;
                ReceiverRegisterLancet.loge(iDBReceiverS4S0100000, false);
                activityC45651qj.unregisterReceiver(iDBReceiverS4S0100000);
            }
            C0TM c0tm = c37661dq.LJJJI;
            C73411SrX c73411SrX = c0tm.LJFF;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            c0tm.LJFF = null;
            C73411SrX c73411SrX2 = c0tm.LJI;
            if (c73411SrX2 != null) {
                c73411SrX2.dispose();
            }
            c0tm.LJI = null;
            InterfaceC31286CPq interfaceC31286CPq = c37661dq.LJJJJJ;
            if (interfaceC31286CPq != null) {
                interfaceC31286CPq.release();
            }
            C3T c3t = c37661dq.LIZLLL;
            if (c3t != null) {
                c3t.release();
            }
            C40611ib c40611ib = c37661dq.LJJJZ;
            if (c40611ib != null) {
                C0NB.LJIIIZ("GameInteractionNoticeStrategy", "release()");
                IMessageManager iMessageManager = c40611ib.LJLILLLLZI;
                if (iMessageManager != null) {
                    iMessageManager.removeMessageListener((OnIMMessageListener) c40611ib);
                }
                c40611ib.LJLILLLLZI = null;
                Iterator<Class<? extends IMessage>> it3 = c40611ib.LJLJI.keySet().iterator();
                while (it3.hasNext()) {
                    C0EA<? extends IMessage> c0ea = c40611ib.LJLJI.get(it3.next());
                    if (c0ea != null) {
                        c0ea.onRelease();
                    }
                }
                c40611ib.LJLJI.clear();
                DataChannel dataChannel7 = c40611ib.LJLIL;
                if (dataChannel7 != null) {
                    dataChannel7.jv0(c40611ib);
                }
            }
            Iterator it4 = ((ArrayList) c37661dq.LJJJJL).iterator();
            while (it4.hasNext()) {
                ((InterfaceC04500Fq) it4.next()).LIZIZ();
            }
            Iterator<InterfaceC79150V4o> it5 = c37661dq.LJJIIJZLJL.iterator();
            while (it5.hasNext()) {
                it5.next().LIZIZ(null);
            }
            ((ArrayList) c37661dq.LJJJJL).clear();
            IMessageManager iMessageManager2 = c37661dq.LJJJJJL;
            if (iMessageManager2 != null) {
                iMessageManager2.removeMessageListener(c37661dq.LJ);
            }
            c37661dq.LJJJJJL = null;
        }
        this.LLIIIJ.dispose();
        XKQ xkq = this.LLFF;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        XKQ xkq2 = this.LLFFF;
        if (xkq2 != null) {
            xkq2.LIZIZ(null);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C29044Baa.class);
        dataChannelGlobal.jv0(this);
        LivePerformanceManager LIZ3 = B4U.LIZ();
        LIZ3.LJJII("stream");
        if (LivePerformanceManager.LJIL()) {
            if (LivePerformanceManager.LJIL() && LIZ3.LLIIL) {
                LIZ3.LLIIL = false;
                Handler handler = LIZ3.LJLLLLLL;
                if (handler == null) {
                    handler = LIZ3.LJIJI();
                }
                handler.removeCallbacks(LIZ3.LLJJI);
            }
        } else {
            LIZ3.LJJIJIIJI();
        }
        LIZ3.release();
        LIZ3.LJZL = -1.0f;
        LIZ3.LLD = -1.0f;
        LIZ3.LL = -1.0d;
        if (GameLiveMemoryLeakOptSetting.INSTANCE.getValue()) {
            ((IToolbarService) CN1.LIZ(IToolbarService.class)).d9();
        }
        C88207Yjb.LJFF();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Ll() {
        if (GameLiveMemoryLeakOptSetting.INSTANCE.getValue()) {
            ((IDebugService) CN1.LIZ(IDebugService.class)).onDestroy();
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Ml() {
        C37661dq c37661dq = this.LJZ;
        if (c37661dq != null) {
            Iterator it = ((ArrayList) c37661dq.LJJJJL).iterator();
            while (it.hasNext()) {
                ((InterfaceC04500Fq) it.next()).onPause();
            }
            if (c37661dq.LJIIJJI) {
                Iterator<InterfaceC79150V4o> it2 = c37661dq.LJJIIJZLJL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(null);
                }
                CUC cuc = c37661dq.LJIIZILJ;
                if (cuc != null) {
                    cuc.LJIIL();
                }
                InterfaceC31286CPq interfaceC31286CPq = c37661dq.LJJJJJ;
                if (interfaceC31286CPq != null) {
                    interfaceC31286CPq.LJFF();
                }
                C3T c3t = c37661dq.LIZLLL;
                if (c3t != null) {
                    c3t.LJFF();
                }
            }
        }
        C88207Yjb.LJIILLIIL();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Nl() {
        LiveDialog liveDialog;
        C37661dq c37661dq = this.LJZ;
        if (c37661dq != null) {
            Boolean LIZJ = InterfaceC30442Bx8.LJJIJ.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_GAME_QUIT_CLICKED.value");
            if (!LIZJ.booleanValue()) {
                if (C40210FqI.LIZ(c37661dq.LJFF) && (liveDialog = c37661dq.LJJIJLIJ) != null) {
                    liveDialog.dismiss();
                }
                InterfaceC31286CPq interfaceC31286CPq = c37661dq.LJJJJJ;
                if (interfaceC31286CPq != null) {
                    interfaceC31286CPq.LIZLLL();
                }
                C3T c3t = c37661dq.LIZLLL;
                if (c3t != null) {
                    c3t.LJFF();
                }
                Iterator it = ((ArrayList) c37661dq.LJJJJL).iterator();
                while (it.hasNext()) {
                    ((InterfaceC04500Fq) it.next()).onResume();
                }
                Iterator<InterfaceC79150V4o> it2 = c37661dq.LJJIIJZLJL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(null);
                }
            }
        }
        C88207Yjb.LJIIJ();
    }

    public final void Rl() {
        Intent intent;
        if (!this.LJLJLLL && !this.LJLL) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                Context context = getContext();
                if (context != null) {
                    intent = Sl(context);
                } else {
                    intent = null;
                }
                mo49getActivity.bindService(intent, this.LLIIIILZ, 1);
            }
            this.LJLL = true;
        }
    }

    public final void dm() {
        Intent intent = null;
        if (Build.VERSION.SDK_INT >= 26) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                Context context = getContext();
                if (context != null) {
                    intent = Sl(context);
                }
                mo49getActivity.startForegroundService(intent);
            }
        } else {
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null) {
                Context context2 = getContext();
                if (context2 != null) {
                    intent = Sl(context2);
                }
                mo49getActivity2.startService(intent);
            }
        }
        this.LJLJLJ = true;
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, X.InterfaceC86149XrV
    public final void finish() {
        try {
            AbstractC004900f LIZ = C005600m.LIZ("control_view");
            if (LIZ != null) {
                LIZ.LIZ();
            }
        } catch (Throwable th) {
            C0NB.LIZLLL(th.getMessage());
        }
        try {
            AbstractC004900f LIZ2 = C005600m.LIZ("msg_view");
            if (LIZ2 != null) {
                LIZ2.LIZ();
            }
        } catch (Throwable th2) {
            C0NB.LIZLLL(th2.getMessage());
        }
        try {
            AbstractC004900f LIZ3 = C005600m.LIZ("small_view");
            if (LIZ3 != null) {
                LIZ3.LIZ();
            }
        } catch (Throwable th3) {
            C0NB.LIZLLL(th3.getMessage());
        }
        Tl("finish");
    }

    public final void hm() {
        Intent intent;
        Tl("stopService");
        try {
            if (this.LJLL) {
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity != null) {
                    mo49getActivity.unbindService(this.LLIIIILZ);
                }
                this.LJLL = false;
            }
            if (this.LJLJLJ) {
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 != null) {
                    Context context = getContext();
                    if (context != null) {
                        intent = Sl(context);
                    } else {
                        intent = null;
                    }
                    mo49getActivity2.stopService(intent);
                }
                this.LJLJLJ = false;
            }
        } catch (Throwable th) {
            C0NB.LIZLLL(th.getMessage());
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment
    public final boolean isViewValid() {
        return !this.mStatusDestroyed;
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1NX c1nx = (C1NX) this.LLII.getValue();
        c1nx.getClass();
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GameBroadcastMessageStationWidget", "GameBroadcastMessageStation. unRegister");
        }
        IMessageManager iMessageManager = c1nx.LJLJJI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(c1nx);
        }
        Iterator it = ((ArrayList) C1NX.LJLJJLL).iterator();
        while (it.hasNext()) {
            C78685UuP.LJJLI(0, -1, (String) it.next(), "not receive im message before close");
        }
        super.onDestroyView();
    }

    @Override // X.InterfaceC21030s7
    public final void v3() {
        C264812e c264812e = this.LJLLLL;
        if (c264812e != null) {
            c264812e.LIZIZ = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Ol() {
        Boolean bool = (Boolean) LJIIL().kv0(BDT.class);
        if (bool == null || !bool.booleanValue()) {
            Rl();
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void wl() {
        View view = getView();
        if (view != null) {
            view.post(new ARunnableS41S0100000_5(this, 119));
        }
    }

    @Override // X.C10W
    public final void Lc(int i) {
        int i2;
        C12700eg c12700eg;
        Integer num;
        IBroadcastService iBroadcastService = (IBroadcastService) CN1.LIZ(IBroadcastService.class);
        long Al = Al();
        long roomId = getRoomId();
        boolean z = this.LJLLILLLL;
        Creator creator = xl().creator;
        if (creator != null && (num = creator.roomContinue) != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        iBroadcastService.reportStreamEnd(i, Al, roomId, z, i2);
        if (GameDualDeviceSetting.INSTANCE.isExperimentGroup() && (c12700eg = (C12700eg) LJIIL().kv0(e0.class)) != null) {
            c12700eg.LIZIZ(i);
            C12750el c12750el = this.LLIIIZ;
            if (c12750el != null) {
                c12750el.LJFF(i);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x010f, code lost:
    
        if (r5 == null) goto L36;
     */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.ss.ugc.live.sdk.message.interfaces.IMessageManager, O] */
    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ql(android.view.View r8) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.GameBroadcastFragment.Ql(android.view.View):void");
    }

    public final Intent Sl(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ((IHostAction) CN1.LIZ(IHostAction.class)).getBgBroadcastServiceName()));
        return intent;
    }

    public final void Tl(String str) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("GameBroadcastFragment , ", str, " ，hasReleaseSource = ");
        LIZIZ.append(this.LJLLI);
        LIZIZ.append(" , hasStartService = ");
        LIZIZ.append(this.LJLJLJ);
        LIZIZ.append(" , hasBindService = ");
        LIZIZ.append(this.LJLL);
        C0NB.LJIIIIZZ(X1D.LIZIZ(LIZIZ));
    }

    public final <T> void Wl(Class<T> cls) {
        if (!C30922CBq.LIZIZ) {
            C0NB.LIZIZ("dump", "registerRxBus -> the channel isn't local_test");
        } else {
            ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(cls).LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LIZLLL(this))).LIZJ(new AfS57S0100000_5(this, 65), C3Q.LJLIL);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, O] */
    public final void Xl(Cert cert) {
        boolean z;
        float longProperty;
        C73411SrX c73411SrX;
        LiveIllegalPresenter liveIllegalPresenter;
        Tl("releaseSource");
        if (!this.LJLLI) {
            boolean z2 = true;
            this.LJLLI = true;
            LiveMessageSEI liveMessageSEI = new LiveMessageSEI();
            liveMessageSEI.timestamp = System.currentTimeMillis();
            LiveMessageID liveMessageID = new LiveMessageID();
            liveMessageID.primaryID = String.valueOf(getRoomId());
            liveMessageID.messageScene = "end_room";
            liveMessageSEI.uniqueID = liveMessageID;
            C37691dt c37691dt = this.LJZI;
            Boolean bool = null;
            if (c37691dt != null) {
                InterfaceC21020s6 interfaceC21020s6 = c37691dt.LJLJI;
                if (interfaceC21020s6 != null) {
                    interfaceC21020s6.LIZ("live_message_sei", new JSONObject(GsonProtectorUtils.toJson(C09650Zl.LIZIZ, liveMessageSEI)), false);
                }
                C40625Fwz.LIZIZ();
                hm();
                C37691dt c37691dt2 = this.LJZI;
                if (c37691dt2 != null) {
                    c37691dt2.LIZLLL(cert);
                    C10U c10u = this.LJLLJ;
                    if (c10u != null && (liveIllegalPresenter = ((C30196BtA) c10u).LJLJJL) != null) {
                        liveIllegalPresenter.resetStatusToNormal();
                    }
                    C10U c10u2 = this.LJLLJ;
                    if (c10u2 != null) {
                        C30196BtA c30196BtA = (C30196BtA) c10u2;
                        c30196BtA.LJLJL = true;
                        LiveIllegalPresenter liveIllegalPresenter2 = c30196BtA.LJLJJL;
                        if (liveIllegalPresenter2 != null) {
                            liveIllegalPresenter2.detachView();
                        }
                    }
                    C30216BtU c30216BtU = this.LJLLL;
                    if (c30216BtU != null && (c73411SrX = c30216BtU.LIZIZ) != null) {
                        c73411SrX.dispose();
                    }
                    C37691dt c37691dt3 = this.LJZI;
                    if (c37691dt3 != null) {
                        c37691dt3.LIZIZ();
                        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).rE();
                        ((IMessageService) CN1.LIZ(IMessageService.class)).release(xl().getId());
                        ((IMessageService) CN1.LIZ(IMessageService.class)).retryReleaseAll();
                        B5G.LIZJ(xl().getId(), "BgBroadcastFragment_OnDestroy");
                        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).logLiveOver(xl(), LJIIL());
                        C22940vC c22940vC = this.LJLLLLLL;
                        if (c22940vC != null && (c22940vC.LIZJ || InterfaceC30442Bx8.T0.LIZJ().booleanValue())) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j = currentTimeMillis - c22940vC.LIZ;
                            long j2 = c22940vC.LIZLLL;
                            long j3 = 0;
                            if (j2 > 0) {
                                j3 = currentTimeMillis - j2;
                                c22940vC.LIZ(currentTimeMillis);
                                c22940vC.LIZLLL = -1L;
                            }
                            BZI LIZ = C28787BRn.LIZ("livesdk_live_unexcepted_interruption_end_event");
                            try {
                                C31024CFo c31024CFo = C31032CFw.LIZ;
                                c31024CFo.LIZIZ();
                                LIZ.LJIJJ(Integer.valueOf(c31024CFo.LJ), "battery_level");
                                LIZ.LJIL("temperature", Float.valueOf(c31024CFo.LIZLLL));
                                LIZ.LJIJJ(Integer.valueOf(c31024CFo.LJIIIZ), "voltage");
                                LIZ.LJIJJ(Integer.valueOf(c31024CFo.LJFF), "battery_scale");
                                LIZ.LJIJJ(Integer.valueOf(c31024CFo.LJI), "charge_status");
                                Context LIZLLL = C15380j0.LIZLLL();
                                if (LIZLLL != null && C3O.LIZ(LIZLLL) != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                float f = -1.0f;
                                if (!z) {
                                    longProperty = -1.0f;
                                } else {
                                    longProperty = ((float) C3O.LIZ(LIZLLL).getLongProperty(2)) / 1000.0f;
                                }
                                LIZ.LJIL("battery_current", Float.valueOf(longProperty));
                                Context LIZLLL2 = C15380j0.LIZLLL();
                                if (LIZLLL2 != null && C3O.LIZ(LIZLLL2) != null) {
                                    f = ((float) C3O.LIZ(LIZLLL2).getLongProperty(3)) / 1000.0f;
                                }
                                LIZ.LJIL("battery_average", Float.valueOf(f));
                                LIZ.LJIJJLI("battery_energy", Double.valueOf(C3O.LIZIZ(C15380j0.LIZLLL())));
                            } catch (Exception e) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("get battery info failed ");
                                LIZ2.append(e.getMessage());
                                C0NB.LJ("LiveGameInterruptionResumeMonitor", X1D.LIZIZ(LIZ2));
                            }
                            LIZ.LJIJJ(c22940vC.LIZIZ(), "anchor_id");
                            LIZ.LJIJJ("screen_share", "live_type");
                            LIZ.LJIJJ(Long.valueOf(c22940vC.LIZJ()), "room_id");
                            LIZ.LJIJJ(Integer.valueOf(c22940vC.LIZIZ), "error_times");
                            LIZ.LJIJJ(Integer.valueOf(c22940vC.LJ), "exceed_three_minutes");
                            LIZ.LJIJJ(Integer.valueOf(c22940vC.LJFF), "exceed_five_minutes");
                            LIZ.LJIJJ(Long.valueOf(j), "time_from_restart");
                            LIZ.LJIJJ(Long.valueOf(j3), "time_in_backGround");
                            LIZ.LJIJJ(Long.valueOf(c22940vC.LJI), "max_time_in_backGround");
                            LIZ.LJIJJ(Boolean.valueOf(C1O1.LJIIIZ()), "is_ignore_battery_opt");
                            LIZ.LJIJJ(Boolean.valueOf(C1O1.LJIIJJI()), "is_power_save_mode");
                            LIZ.LJIJJ(Boolean.valueOf(C1O1.LJIIIIZZ()), "is_backGround_restricted");
                            LIZ.LJIJJ(Integer.valueOf(c22940vC.LJII), "last_liveCore_error_code");
                            LIZ.LJIJJ(Boolean.valueOf(InterruptGuidelinesSettingV2.INSTANCE.isEnable()), "guide_switch");
                            LIZ.LJIJJ(Integer.valueOf(c22940vC.LJIIJ), "error_times_complete_guide");
                            C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.T0;
                            LIZ.LJIJJ(c48459J0d.LIZJ(), "has_complete_guide_last_live");
                            LIZ.LJIJJ(Boolean.valueOf(c22940vC.LIZJ), "has_receive_error");
                            LIZ.LJJIIJZLJL();
                            c48459J0d.LIZ(Boolean.valueOf(c22940vC.LJIIIZ));
                        }
                        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                        C3N c3n = (C3N) dataChannelGlobal.mv0(C3U.class);
                        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C3U.class);
                        if (c3n != null) {
                            C22940vC c22940vC2 = this.LJLLLLLL;
                            if (c22940vC2 != null) {
                                if (c22940vC2.LJI < 60000) {
                                    z2 = false;
                                }
                                bool = Boolean.valueOf(z2);
                            }
                            if (C29306Beo.LJJIFFI(bool) && C21040s8.LIZIZ(c3n.LJLIL, Integer.valueOf(c3n.LJLILLLLZI))) {
                                c3n.LJLIL = 9;
                            }
                            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).reportStreamEndForLiveCore(c3n.LJLIL, c3n.LJLILLLLZI, c3n.LJLJI, c3n.LJLJJI, c3n.LJLJJL, this.LJLLILLLL, c3n.LJLJL);
                            if (GameDualDeviceSetting.INSTANCE.isExperimentGroup()) {
                                C12700eg c12700eg = (C12700eg) LJIIL().kv0(e0.class);
                                if (c12700eg != null) {
                                    c12700eg.LIZIZ(c3n.LJLIL);
                                }
                                C12750el c12750el = this.LLIIIZ;
                                if (c12750el != null) {
                                    c12750el.LJFF(c3n.LJLIL);
                                }
                            }
                            Tl("releaseSource , remove interruptedData and report");
                        }
                        if (GameLiveBroadcastReleaseVideoGift.INSTANCE.getValue()) {
                            ((C32537Cpp) LJIIL().gv0(C3S.class)).LIZ = Boolean.FALSE;
                            return;
                        }
                        return;
                    }
                    o.LJIJI("mServiceStrategy");
                    throw null;
                }
                o.LJIJI("mServiceStrategy");
                throw null;
            }
            o.LJIJI("mServiceStrategy");
            throw null;
        }
    }

    @Override // X.C10V
    public final void c6(boolean z) {
        int i;
        if (z) {
            i = 10001;
        } else {
            i = 4;
        }
        Lc(i);
        Zl(1, -1);
    }

    public final void cm(InterfaceC30105Brh interfaceC30105Brh) {
        Bundle bundle;
        if (!isAdded() || this.mStatusDestroyed || getChildFragmentManager().LJJJIL("AbsInteractionFragment") != null) {
            return;
        }
        LJIIL().rv0(RoomChannel.class, xl());
        this.LJZL = interfaceC30105Brh;
        GameBroadcastInteractionFragment gameBroadcastInteractionFragment = (GameBroadcastInteractionFragment) interfaceC30105Brh;
        Bundle arguments = getArguments();
        if (arguments != null) {
            bundle = arguments.getBundle("extra");
        } else {
            bundle = null;
        }
        gameBroadcastInteractionFragment.setArguments(bundle);
        gameBroadcastInteractionFragment.wl(LJIIL(), new C30201BtF(this));
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        c1b3.LJIIIIZZ(R.id.eq3, 1, gameBroadcastInteractionFragment, "AbsInteractionFragment");
        c1b3.LJI();
        gameBroadcastInteractionFragment.postOnViewModulePrepared(new ARunnableS41S0100000_5(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
        LJIIL().lv0(this, LiveGameExtendedScreenCloseGuide.class, new AqS171S0100000_5(this, 298));
        LJIIL().lv0(this, MemberMessageChannel.class, new AqS171S0100000_5(this, 299));
    }

    @Override // X.InterfaceC21030s7
    public final void ha(boolean z) {
        C37661dq c37661dq = this.LJZ;
        if (c37661dq != null) {
            C30381He c30381He = c37661dq.LJJJJI;
            if (z) {
                if (c30381He.LJI) {
                    c30381He.LJIIIZ();
                    return;
                }
                return;
            }
            c30381He.getClass();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onConfigurationChanged , orientation = ");
        LIZ.append(newConfig.orientation);
        Tl(X1D.LIZIZ(LIZ));
    }

    public final void onEvent(C30719C3v c30719C3v) {
        if (c30719C3v == null) {
            return;
        }
        if (!C30922CBq.LIZIZ) {
            C0NB.LIZIZ("dump", "onEvent -> the channel isn't local_test");
            return;
        }
        C0NB.LIZIZ("dump", "onEvent -> receive GameVideoDumpEvent");
        C22910v9 c22910v9 = this.LLFZ;
        if (c22910v9 != null) {
            C37691dt c37691dt = this.LJZI;
            if (c37691dt != null) {
                boolean z = c37691dt.LJLJLLL;
                if (c22910v9.LIZLLL) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("autoTestStart: ");
                    LIZ.append(c22910v9.LIZLLL);
                    LIZ.append(", so return");
                    C0NB.LIZIZ("DumpVideoHelper", X1D.LIZIZ(LIZ));
                    return;
                }
                Bundle LIZ2 = C141415gn.LIZ("mode", 0);
                LIZ2.putString("outputPathOrigin", (String) c22910v9.LIZIZ.getValue());
                LIZ2.putFloat("duration", 0.0f);
                LIZ2.putBoolean("hardwareEncode", z);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("effect video path: ");
                C31811Ce7.LJ(LIZ3, (String) c22910v9.LIZIZ.getValue(), LIZ3, "DumpVideoHelper");
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C55552Fz(c22910v9, LIZ2, null), 3);
                return;
            }
            o.LJIJI("mServiceStrategy");
            throw null;
        }
    }

    @Override // X.InterfaceC21030s7
    public final void u4(long j) {
        C38921fs c38921fs;
        C37661dq c37661dq = this.LJZ;
        if (c37661dq != null && (c38921fs = c37661dq.LJJJJIZL) != null) {
            if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
                c38921fs.LJIIIZ(j);
            } else {
                c38921fs.LJIILJJIL.post(new IDRunnableS3S0100100(c38921fs, j, 3));
            }
        }
    }

    @Override // X.InterfaceC21030s7
    public final void xj(int i) {
        InterfaceC30105Brh interfaceC30105Brh = this.LJZL;
        if (interfaceC30105Brh != null) {
            interfaceC30105Brh.c8(i);
        }
    }

    public final void onEvent(C30718C3u c30718C3u) {
        if (c30718C3u == null) {
            return;
        }
        if (!C30922CBq.LIZIZ) {
            C0NB.LIZIZ("dump", "onEvent -> the channel isn't local_test");
            return;
        }
        C0NB.LIZIZ("dump", "onEvent -> receive GameImageDumpEvent");
        C22910v9 c22910v9 = this.LLFZ;
        if (c22910v9 != null) {
            if (c22910v9.LIZLLL) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("autoTestStart: ");
                LIZ.append(c22910v9.LIZLLL);
                LIZ.append(", so return");
                C0NB.LIZIZ("DumpVideoHelper", X1D.LIZIZ(LIZ));
                return;
            }
            Bundle LIZLLL = C1DG.LIZLLL("width", 0, "height", 0);
            LIZLLL.putString("outputPathOrigin", (String) c22910v9.LIZJ.getValue());
            LIZLLL.putInt("duration", 0);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("effect image path: ");
            C31811Ce7.LJ(LIZ2, (String) c22910v9.LIZJ.getValue(), LIZ2, "DumpVideoHelper");
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C55542Fy(c22910v9, LIZLLL, null), 3);
        }
    }

    @Override // X.C10V
    public final void Ba(Boolean bool, boolean z) {
        boolean z2;
        String str;
        String str2;
        Boolean bool2;
        Cert cert;
        C3R c3r;
        C3R c3r2;
        Object kv0 = LJIIL().kv0(PrepareCountDown.class);
        if (z && (c3r2 = this.LL) != null) {
            c3r2.Fb();
        }
        getContext();
        try {
            z2 = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z2 = false;
        }
        if (z2) {
            C37661dq c37661dq = this.LJZ;
            if (c37661dq != null) {
                C12B.LIZ(c37661dq, false, EnumC264412a.LIVE_TIP_GO_LIVE_ERROR_TIP.ordinal(), "", 8);
            }
            C37661dq c37661dq2 = this.LJZ;
            if (c37661dq2 != null) {
                bool2 = Boolean.valueOf(c37661dq2.LJJIJIL);
            } else {
                bool2 = null;
            }
            boolean LJJIFFI = C29306Beo.LJJIFFI(bool2);
            C37661dq c37661dq3 = this.LJZ;
            if (c37661dq3 != null) {
                cert = c37661dq3.LJJIJIIJIL;
            } else {
                cert = null;
            }
            em(cert, LJJIFFI);
            if (isAdded() && !this.mStatusDestroyed && getChildFragmentManager().LJJJIL("AbsPreparationFragment") != null && (c3r = this.LL) != null) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
                LIZ.LJJI(c3r.getFragment());
                LIZ.LJI();
            }
            cm(new GameBroadcastInteractionFragment());
            this.LLD = System.currentTimeMillis();
            str = "success";
        } else {
            C37661dq c37661dq4 = this.LJZ;
            if (c37661dq4 != null) {
                int ordinal = EnumC264412a.LIVE_TIP_GO_LIVE_ERROR_TIP.ordinal();
                String string = getString(R.string.mbm);
                o.LJIIIIZZ(string, "getString(R.string.pm_li…me_floatingWindow_toast1)");
                C12B.LIZ(c37661dq4, true, ordinal, string, 8);
            }
            C3R c3r3 = this.LL;
            if (c3r3 != null) {
                c3r3.Pb();
            }
            str = "fail";
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_start_stream");
        LIZ2.LJIJJ(Long.valueOf(Al()), "anchor_id");
        LIZ2.LJIJJ(Long.valueOf(getRoomId()), "room_id");
        LIZ2.LJIJJ("screen_share", "live_type");
        if (z) {
            str2 = "click";
        } else {
            str2 = "auto";
        }
        LIZ2.LJIJJ(str2, "start_type");
        if (bool == null) {
            C37661dq c37661dq5 = this.LJZ;
            if (c37661dq5 != null) {
                bool = Boolean.valueOf(c37661dq5.LJIILIIL());
            } else {
                bool = null;
            }
        }
        LIZ2.LJIJJ(Integer.valueOf(o.LJ(bool, Boolean.TRUE) ? 1 : 0), "is_floating");
        LIZ2.LJIJJ(kv0, "time_remain");
        LIZ2.LJIJJ(str, "status");
        LIZ2.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final View Jl(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        return C16880lQ.LLLLIILL(inflater, R.layout.cu7, viewGroup, false);
    }

    @Override // X.C10W
    public final void Ta(int i, Cert cert) {
        int i2;
        o.LJIIIZ(cert, "cert");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopLive , stopReason = ");
        LIZ.append(i);
        C0NB.LJIIIIZZ(X1D.LIZIZ(LIZ));
        if (i == 32) {
            i2 = 10003;
        } else {
            i2 = -1;
        }
        fm(i, cert, i2);
        LJIIL().rv0(GameBroadcastStateChannel.class, CWI.StateEnd);
    }

    public final void Zl(int i, int i2) {
        C19820qA c19820qA;
        C266012q c266012q;
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).reportBroadcastEnd();
        C37661dq c37661dq = this.LJZ;
        if (c37661dq != null) {
            c37661dq.LJJJJLI = i;
        }
        if (this.mStatusDestroyed && i != 64) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopLive: reason=");
        LIZ.append(i);
        Tl(X1D.LIZIZ(LIZ));
        C11000bw c11000bw = this.LJLZ;
        if (c11000bw != null) {
            c11000bw.LJFF(i);
        }
        this.LJLJLLL = true;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.setRequestedOrientation(1);
        }
        C37661dq c37661dq2 = this.LJZ;
        if (c37661dq2 != null && c37661dq2.LJIILJJIL()) {
            this.LLFII = true;
            return;
        }
        Bundle bundle = new Bundle();
        this.LLFII = false;
        if (i2 == 10003 || i2 == 30003 || i2 == 30003001) {
            bundle.putInt("live_end_error_code", i2);
        }
        C37661dq c37661dq3 = this.LJZ;
        if (c37661dq3 != null) {
            Iterator it = ((ArrayList) c37661dq3.LJJJJL).iterator();
            while (it.hasNext()) {
                ((InterfaceC04500Fq) it.next()).LJI();
            }
            try {
                AbstractC004900f LIZ2 = C005600m.LIZ("control_view");
                if (LIZ2 != null) {
                    LIZ2.LIZ();
                }
            } catch (Throwable th) {
                C0NB.LIZLLL(th.getMessage());
            }
            try {
                AbstractC004900f LIZ3 = C005600m.LIZ("msg_view");
                if (LIZ3 != null) {
                    LIZ3.LIZ();
                }
            } catch (Throwable th2) {
                C0NB.LIZLLL(th2.getMessage());
            }
            try {
                AbstractC004900f LIZ4 = C005600m.LIZ("small_view");
                if (LIZ4 != null) {
                    LIZ4.LIZ();
                }
            } catch (Throwable th3) {
                C0NB.LIZLLL(th3.getMessage());
            }
            C37821e6 c37821e6 = c37661dq3.LJIL;
            if (c37821e6 != null && (c266012q = c37821e6.LIZLLL) != null) {
                bundle.putLong("live_end_ui_float_time", c266012q.LIZLLL);
                bundle.putFloat("live_end_ui_float_time_percent", c266012q.LJ);
                bundle.putLong("live_end_ui_snapped_time", c266012q.LIZIZ);
                bundle.putFloat("live_end_ui_snapped_time_percent", c266012q.LIZJ);
            }
        }
        C2M c2m = this.LJLJL;
        if (c2m != null) {
            c2m.LIZ(bundle);
        }
        if (EnableMobileGameBroadcastFeedbackInfoAndDiagnose.INSTANCE.isEnable()) {
            C19700py c19700py = C19700py.LIZ;
            DataChannel LJIIL = LJIIL();
            synchronized (c19700py) {
                C19700py.LIZJ.set(false);
                if (C30922CBq.LIZIZ) {
                    C0NB.LJIIIZ("GameBroadcastFeedbackDiagnose", "onGameLiveEnd()");
                }
                c19700py.LJIIIIZZ(LJIIL);
                c19700py.LJIIIZ();
            }
        }
        Iterator it2 = ((LinkedHashMap) C19710pz.LIZ).entrySet().iterator();
        while (it2.hasNext()) {
            InterfaceC21070sB interfaceC21070sB = (InterfaceC21070sB) ((Map.Entry) it2.next()).getValue();
            if (interfaceC21070sB != null) {
                interfaceC21070sB.LIZ();
            }
        }
        C19710pz.LIZIZ.set(false);
        if (ShowLowPerformanceTipsSwitcher.INSTANCE.isEnable() && (c19820qA = this.LLIFFJFJJ) != null) {
            if (C30922CBq.LIZIZ) {
                C0NB.LJIIIZ("LowDevicesPerformanceTipsManager", "onGameLiveEnd()");
            }
            c19820qA.LIZJ.set(0L);
            c19820qA.LIZLLL.set(0);
        }
        DataChannelGlobal.LJLJJI.tv0(MobileGameStreamInfo.class, null);
        finish();
        C37661dq c37661dq4 = this.LJZ;
        if (c37661dq4 == null) {
            return;
        }
        c37661dq4.LJIJ(C12F.CMD_TRANSITION_TO_DESTROY);
        c37661dq4.LJIIL = true;
        Iterator it3 = ((ArrayList) c37661dq4.LJJJJL).iterator();
        while (it3.hasNext()) {
            ((InterfaceC04500Fq) it3.next()).LJII();
        }
        if (!DetectRisksOfReproducedGamingContentSetting.INSTANCE.isEnable()) {
            return;
        }
        AbstractC73672Svk.LJJIJIL(Boolean.TRUE).LJJJ(T16.LIZ).LJJJJZI(new InterfaceC64592gB() { // from class: X.1XA
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("MobileGameTnsSignalReporter. stop(). ThreadName=");
                    LIZ5.append(C18280ng.LIZ());
                    C0NB.LJIIIZ("MobileGameTnsSignalReporter", X1D.LIZIZ(LIZ5));
                }
                C19840qC c19840qC = C18280ng.LIZ;
                if (c19840qC != null) {
                    Iterator<InterfaceC18260ne> it4 = c19840qC.LIZLLL.iterator();
                    while (it4.hasNext()) {
                        it4.next().stop();
                    }
                    C73411SrX c73411SrX = C18280ng.LIZJ;
                    if (c73411SrX != null) {
                        c73411SrX.dispose();
                    }
                    C73411SrX c73411SrX2 = C18280ng.LIZIZ;
                    if (c73411SrX2 != null) {
                        c73411SrX2.dispose();
                        return;
                    }
                    return;
                }
                o.LJIJI("config");
                throw null;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01bd, code lost:
    
        if (r1.length() == 0) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean em(com.bytedance.bpea.basics.Cert r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.GameBroadcastFragment.em(com.bytedance.bpea.basics.Cert, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [X.C3N, O] */
    /* JADX WARN: Type inference failed for: r1v82, types: [java.lang.Boolean, O] */
    @Override // X.InterfaceC21030s7
    public final void G(int i, int i2, String str) {
        int i3;
        Integer num;
        boolean z;
        C22940vC c22940vC;
        long j;
        int i4;
        Integer num2;
        StringBuilder LIZJ = C06460Ne.LIZJ("onStreamEnd , code1: ", i, ", code2: ", i2, ", errorMsg: ");
        LIZJ.append(str);
        Tl(X1D.LIZIZ(LIZJ));
        LJIIL().rv0(GameBroadcastStateChannel.class, CWI.StateEnd);
        String str2 = "";
        if (C21040s8.LIZIZ(i, Integer.valueOf(i2)) && GameLiveInterruptResumeSetting.INSTANCE.getValue()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            if (dataChannelGlobal.mv0(C3U.class) == null) {
                if (str != null) {
                    str2 = str;
                }
                long Al = Al();
                long roomId = getRoomId();
                boolean z2 = this.LJLLILLLL;
                Creator creator = xl().creator;
                if (creator != null && (num2 = creator.roomContinue) != null) {
                    i4 = num2.intValue();
                } else {
                    i4 = 0;
                }
                ((C32537Cpp) dataChannelGlobal.gv0(C3U.class)).LIZ = new C3N(i, i2, str2, Al, roomId, z2, i4);
                Tl("onStreamEnd , set InterceptReportEndChannel");
            }
            C0K2.LIZ("game broadcast live stream end interrupted", new Throwable());
            Boolean bool = (Boolean) LJIIL().kv0(BDT.class);
            if ((bool == null || !bool.booleanValue()) && (c22940vC = this.LJLLLLLL) != null) {
                c22940vC.LIZJ = true;
                if (c22940vC.LJIIIZ) {
                    c22940vC.LJIIJ++;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = c22940vC.LIZ;
                long j3 = 0;
                if (j2 > 0) {
                    j = currentTimeMillis - j2;
                } else {
                    j = 0;
                }
                long j4 = c22940vC.LIZLLL;
                if (j4 > 0) {
                    j3 = currentTimeMillis - j4;
                    c22940vC.LIZ(currentTimeMillis);
                    c22940vC.LIZLLL = -1L;
                }
                c22940vC.LIZIZ++;
                BZI LIZ = C28787BRn.LIZ("livesdk_live_unexcepted_interruption_error_receive");
                LIZ.LJIJJ(c22940vC.LIZIZ(), "anchor_id");
                LIZ.LJIJJ("screen_share", "live_type");
                LIZ.LJIJJ(Long.valueOf(c22940vC.LIZJ()), "room_id");
                LIZ.LJIJJ(Integer.valueOf(i), "error_code");
                LIZ.LJIJJ(Integer.valueOf(i2), "liveCore_error_code");
                LIZ.LJIJJ(Integer.valueOf(c22940vC.LIZIZ), "error_times");
                LIZ.LJIJJ(Long.valueOf(j), "error_interval");
                LIZ.LJIJJ(Boolean.valueOf(C1O1.LJIIIIZZ()), "is_backGround_restricted");
                LIZ.LJIJJ(Boolean.valueOf(C1O1.LJIIIZ()), "is_ignore_battery_opt");
                LIZ.LJIJJ(Boolean.valueOf(C1O1.LJIIJJI()), "is_power_save_mode");
                LIZ.LJIJJ(Integer.valueOf(c22940vC.LJII), "last_liveCore_error_code");
                LIZ.LJIJJ(Long.valueOf(j3), "time_in_backGround");
                LIZ.LJIJJ(Boolean.valueOf(InterruptGuidelinesSettingV2.INSTANCE.isEnable()), "guide_switch");
                UFE.LIZIZ(c22940vC.LJIIJ, LIZ, "error_times_complete_guide");
                c22940vC.LJII = i2;
            }
            C29689Bkz.LIZ.LJIIL(new AqS6S0002000_5(i, i2, 0));
            C37661dq c37661dq = this.LJZ;
            if (c37661dq != null) {
                boolean z3 = !this.mStatusActive;
                if (C29306Beo.LJJIFFI((Boolean) c37661dq.LIZJ.kv0(BDT.class))) {
                    return;
                }
                ((C32537Cpp) c37661dq.LIZJ.gv0(BDT.class)).LIZ = Boolean.TRUE;
                CUC cuc = c37661dq.LJIIZILJ;
                if (cuc != null) {
                    cuc.LJIIJ(true);
                }
                c37661dq.LIZIZ.hm();
                c37661dq.LIZIZ.Vl(c37661dq.LJJIFFI, c37661dq.LJIIJ, true, c37661dq.LIZJ);
                Iterator it = ((ArrayList) c37661dq.LJJJJL).iterator();
                while (it.hasNext()) {
                    ((InterfaceC04500Fq) it.next()).LJIIIIZZ(z3);
                }
                return;
            }
            return;
        }
        C37661dq c37661dq2 = this.LJZ;
        Boolean bool2 = null;
        if (c37661dq2 != null) {
            C38921fs c38921fs = c37661dq2.LJJJJIZL;
            if (c38921fs != null) {
                if (c38921fs.LJI || (i != 4 && i != 107)) {
                    z = false;
                } else {
                    if (c38921fs.LJIIJJI == null || c38921fs.LJIIL) {
                        c38921fs.LJIIJJI = new AnonymousClass159(i, i2, str, "live_core_error");
                        c38921fs.LJIIL = false;
                    }
                    c38921fs.LJIIL();
                    z = true;
                }
                bool2 = Boolean.valueOf(z);
            }
            bool2 = Boolean.valueOf(C29306Beo.LJJIFFI(bool2));
        }
        if (C29306Beo.LJJIFFI(bool2)) {
            return;
        }
        IBroadcastService iBroadcastService = (IBroadcastService) CN1.LIZ(IBroadcastService.class);
        if (str != null) {
            str2 = str;
        }
        long Al2 = Al();
        long roomId2 = getRoomId();
        boolean z4 = this.LJLLILLLL;
        Creator creator2 = xl().creator;
        if (creator2 != null && (num = creator2.roomContinue) != null) {
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        iBroadcastService.reportStreamEndForLiveCore(i, i2, str2, Al2, roomId2, z4, i3);
        if (GameDualDeviceSetting.INSTANCE.isExperimentGroup()) {
            C12700eg c12700eg = (C12700eg) LJIIL().kv0(e0.class);
            if (c12700eg != null) {
                c12700eg.LIZIZ(i);
            }
            C12750el c12750el = this.LLIIIZ;
            if (c12750el != null) {
                c12750el.LJFF(i);
            }
        }
        Tl("onStreamEnd , reportStreamEndForLiveCore");
        Boolean bool3 = (Boolean) LJIIL().kv0(BDT.class);
        if (bool3 != null && bool3.booleanValue()) {
            C29689Bkz.LIZ.LJIIL(new AqS6S0002000_5(i, i2, 1));
        } else {
            C29689Bkz.LIZ.LJIIL(new AqS6S0002000_5(i, i2, 2));
            Ta(1, C78857UxB.LJJIIJ(1476788483, "bpea-414"));
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Hl(int i, int i2, Intent intent) {
        C37661dq c37661dq = this.LJZ;
        if (c37661dq != null) {
            if (i == 1000) {
                if (i2 == -1) {
                    if (intent != null) {
                        c37661dq.LJIILL(intent, C78857UxB.LJJIIJ(1476788233, "bpea-576"));
                        return;
                    }
                    return;
                } else {
                    C29689Bkz.LIZ.LJIIL(C28A.LJLIL);
                    c37661dq.LIZIZ.Ta(1, C78857UxB.LJJIIJ(1476788483, "bpea-1871"));
                    return;
                }
            }
            if (i != 1001) {
                return;
            }
            if (i2 == -1) {
                GameBroadcastFragment gameBroadcastFragment = c37661dq.LIZIZ;
                if (!gameBroadcastFragment.LJLJLJ) {
                    gameBroadcastFragment.dm();
                }
                gameBroadcastFragment.Rl();
                if (intent != null) {
                    c37661dq.LJJIFFI = intent;
                }
                BZI LIZ = C28787BRn.LIZ("livesdk_live_unexcepted_interruption_allow_screenshare_click");
                LIZ.LJIJJ(c37661dq.LJIIIZ(), "anchor_id");
                LIZ.LJIJJ("screen_share", "live_type");
                LIZ.LJIJJ(Long.valueOf(c37661dq.LJIIJJI()), "room_id");
                LIZ.LJIJJ("allow", "click_type");
                LIZ.LJJIIJZLJL();
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_live_unexcepted_interruption_allow_screenshare_click");
            LIZ2.LJIJJ(c37661dq.LJIIIZ(), "anchor_id");
            LIZ2.LJIJJ("screen_share", "live_type");
            LIZ2.LJIJJ(Long.valueOf(c37661dq.LJIIJJI()), "room_id");
            LIZ2.LJIJJ("cancel", "click_type");
            LIZ2.LJJIIJZLJL();
            C29689Bkz.LIZ.LJIIL(C28B.LJLIL);
            c37661dq.LIZIZ.Ta(1, C78857UxB.LJJIIJ(1476788483, "bpea-interrupt_access_denied"));
        }
    }

    @Override // X.C10W
    public final void Q3(String floatContext, PunishEventInfo punishEventInfo, int i) {
        o.LJIIIZ(floatContext, "floatContext");
        C37661dq c37661dq = this.LJZ;
        if (c37661dq == null) {
            return;
        }
        c37661dq.LJJIIZI = floatContext;
        c37661dq.LJJIJ = i;
        c37661dq.LJJIJIIJI = punishEventInfo;
    }

    /* JADX WARN: Type inference failed for: r1v51, types: [X.0s6, O] */
    public final void Yl(Intent intent, boolean z, DataChannel dataChannel) {
        LiveCore liveCore;
        PushStreamInfo.Quality quality;
        int[] iArr;
        String str;
        int min;
        int max;
        String str2;
        int i;
        boolean z2;
        float LIZ;
        int LIZIZ;
        String str3;
        PushStreamInfo pushStreamInfo;
        C37691dt c37691dt = this.LJZI;
        if (c37691dt != null) {
            if (c37691dt.LJLJI == null && c37691dt.LJLJJI != null) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannelGlobal.mv0(C29039BaV.class);
                PushStreamInfo.Quality quality2 = (PushStreamInfo.Quality) dataChannelGlobal.mv0(BroadcastShareScreenDefinition.class);
                boolean z3 = true;
                if (roomCreateInfo != null && quality2 != null && (pushStreamInfo = roomCreateInfo.pushStreamInfoMap.get(4L)) != null) {
                    Iterator<PushStreamInfo.Quality> it = pushStreamInfo.qualityList.iterator();
                    while (it.hasNext()) {
                        quality = it.next();
                        String str4 = quality.sdkKey;
                        if (str4 != null && str4.length() != 0 && o.LJ(quality.sdkKey, quality2.sdkKey)) {
                            break;
                        }
                    }
                }
                quality = null;
                if (quality != null) {
                    StreamUrlExtra streamUrlExtraSafely = c37691dt.LJLJJI.getStreamUrlExtraSafely();
                    streamUrlExtraSafely.fps = (int) quality.fps;
                    streamUrlExtraSafely.minBitrate = (int) (quality.min_bitrate / 1000);
                    streamUrlExtraSafely.maxBitrate = (int) (quality.max_bitrate / 1000);
                    streamUrlExtraSafely.defaultBitrate = (int) (quality.default_bitrate / 1000);
                    Room room = c37691dt.LJLJJI;
                    if (room != null && room.getStreamUrl() != null && c37691dt.LJLJJI.getStreamUrl().pushSdkParams != null && (str3 = c37691dt.LJLJJI.getStreamUrl().pushSdkParams) != null && !str3.isEmpty()) {
                        try {
                            JSONObject jSONObject = new JSONObject(str3);
                            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "PushBase");
                            jSONObject2.put("width", (int) quality.width);
                            jSONObject2.put("height", (int) quality.height);
                            jSONObject2.put("fps", (int) quality.fps);
                            jSONObject2.put("defaultBitrate", (int) quality.default_bitrate);
                            jSONObject2.put("maxBitrate", (int) quality.max_bitrate);
                            jSONObject2.put("minBitrate", (int) quality.min_bitrate);
                            c37691dt.LJLJJI.getStreamUrl().pushSdkParams = jSONObject.toString();
                        } catch (JSONException e) {
                            if (!C30922CBq.LIZIZ) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("setData(). replace json exception. e=");
                                LIZ2.append(e.getMessage());
                                C0NB.LJ("GameServiceStrategy", X1D.LIZIZ(LIZ2));
                            } else {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
                StreamUrlExtra streamUrlExtraSafely2 = c37691dt.LJLJJI.getStreamUrlExtraSafely();
                int value = StreamDefinitionLevelSetting.INSTANCE.getValue();
                if (value > 0 && value <= 2) {
                    iArr = C37691dt.LJLLILLLL[value - 1];
                } else {
                    iArr = new int[4];
                    if (streamUrlExtraSafely2.minBitrate == 0) {
                        streamUrlExtraSafely2.minBitrate = 200;
                    }
                    iArr[0] = streamUrlExtraSafely2.minBitrate;
                    if (streamUrlExtraSafely2.defaultBitrate == 0) {
                        streamUrlExtraSafely2.defaultBitrate = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
                    }
                    iArr[1] = streamUrlExtraSafely2.defaultBitrate;
                    iArr[2] = streamUrlExtraSafely2.LIZIZ();
                    iArr[3] = streamUrlExtraSafely2.profile;
                }
                int value2 = StreamHardwareEncodeSetting.INSTANCE.getValue();
                if (value2 > 0) {
                    if (value2 != 2) {
                        z3 = false;
                    }
                } else {
                    z3 = streamUrlExtraSafely2.hardwareEncode;
                }
                c37691dt.LJLJLLL = z3;
                Boolean valueOf = Boolean.valueOf(z);
                StreamUrlExtra streamUrlExtraSafely3 = c37691dt.LJLJJI.getStreamUrlExtraSafely();
                int LIZJ = streamUrlExtraSafely3.LIZJ();
                int LIZ3 = streamUrlExtraSafely3.LIZ();
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("1 getWH form extra width******:");
                    LIZ4.append(LIZJ);
                    LIZ4.append(" height*******: ");
                    LIZ4.append(LIZ3);
                    C0NB.LJIIIZ("GameServiceStrategy", X1D.LIZIZ(LIZ4));
                }
                String str5 = "";
                if (!LiveStreamEnableSdkParamsSetting.INSTANCE.enable()) {
                    str = "";
                } else {
                    str = c37691dt.LJLJJI.getStreamUrl().pushSdkParams;
                }
                try {
                    JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "PushBase");
                    int intValue = ((Integer) jSONObject3.get("width")).intValue();
                    int intValue2 = ((Integer) jSONObject3.get("height")).intValue();
                    if (intValue > 0 && intValue2 > 0) {
                        Point point = new Point();
                        point.x = intValue;
                        point.y = intValue2;
                        int i2 = point.x;
                        int i3 = point.y;
                        if (i2 * i3 > LIZJ * LIZ3) {
                            LIZJ = i2;
                            LIZ3 = i3;
                        }
                    }
                } catch (Exception e2) {
                    C0NB.LJI("GameServiceStrategy", e2);
                }
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("step1.5 use server push sdk params WH insteadof extra WH width******:");
                    LIZ5.append(LIZJ);
                    LIZ5.append(" height*******: ");
                    LIZ5.append(LIZ3);
                    C0NB.LJIIIZ("GameServiceStrategy", X1D.LIZIZ(LIZ5));
                }
                int[] value3 = LiveStreamSizeSetting.INSTANCE.getValue();
                if (value3.length == 2) {
                    LIZJ = value3[0];
                    LIZ3 = value3[1];
                }
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("step2: if Stream Setting defined, use setting width******:");
                    LIZ6.append(LIZJ);
                    LIZ6.append(" height*******: ");
                    LIZ6.append(LIZ3);
                    C0NB.LJIIIZ("GameServiceStrategy", X1D.LIZIZ(LIZ6));
                }
                if (LiveGameStreamProportionAdaptSetting.INSTANCE.enable()) {
                    float LIZ7 = streamUrlExtraSafely3.LIZ() / streamUrlExtraSafely3.LIZJ();
                    if (C22970vF.LIZIZ() > C22970vF.LIZ()) {
                        LIZ = C22970vF.LIZIZ();
                        LIZIZ = C22970vF.LIZ();
                    } else {
                        LIZ = C22970vF.LIZ();
                        LIZIZ = C22970vF.LIZIZ();
                    }
                    float f = LIZ / LIZIZ;
                    if (LIZ7 > f) {
                        LIZ3 = (int) (LIZJ * f);
                    } else if (LIZ7 < f) {
                        LIZJ = (int) (LIZ3 / f);
                    }
                    if (C30922CBq.LIZIZ) {
                        StringBuilder LIZJ2 = C06460Ne.LIZJ("step3: if Aspect Ratio is needed, reset width and height width******:", LIZJ, " height*******: ", LIZ3, "****screenProportion:");
                        LIZJ2.append(f);
                        C0NB.LJIIIZ("GameServiceStrategy", X1D.LIZIZ(LIZJ2));
                    }
                }
                boolean booleanValue = valueOf.booleanValue();
                if (booleanValue) {
                    min = Math.max(LIZJ, LIZ3);
                    max = Math.min(LIZJ, LIZ3);
                } else {
                    min = Math.min(LIZJ, LIZ3);
                    max = Math.max(LIZJ, LIZ3);
                }
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ8 = X1D.LIZ();
                    LIZ8.append("step4:  if is landscape, use max value as width, and min value as height******:");
                    LIZ8.append(min);
                    LIZ8.append(" height*******: ");
                    LIZ8.append(max);
                    C0NB.LJIIIZ("GameServiceStrategy", X1D.LIZIZ(LIZ8));
                }
                try {
                    ActivityC45651qj LIZIZ2 = C29306Beo.LIZIZ(c37691dt.LJLILLLLZI);
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    if (LIZIZ2 != null) {
                        LIZIZ2.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                    }
                    int i4 = displayMetrics.widthPixels;
                    int i5 = displayMetrics.heightPixels;
                    if (i5 <= i4) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (booleanValue & z2) {
                        i5 = i4;
                        i4 = i5;
                    }
                    Point LIZIZ3 = C22850v3.LIZIZ(i4, i5, min, max);
                    min = LIZIZ3.x;
                    max = LIZIZ3.y;
                    if (C30922CBq.LIZIZ) {
                        StringBuilder LIZ9 = X1D.LIZ();
                        LIZ9.append("step5: according to screen size to convert width and height in 16 divisible height******:");
                        LIZ9.append(min);
                        LIZ9.append(" height*******: ");
                        LIZ9.append(max);
                        LIZ9.append(" displayWidth:");
                        LIZ9.append(i4);
                        LIZ9.append(" displayHeight:");
                        LIZ9.append(i5);
                        C0NB.LJIIIZ("GameServiceStrategy", X1D.LIZIZ(LIZ9));
                    }
                } catch (Exception e3) {
                    C0NB.LJI("GameServiceStrategy", e3);
                    C16880lQ.LLLLIIL(e3);
                }
                Point point2 = new Point(min, max);
                Pair pair = new Pair(Integer.valueOf(point2.x), Integer.valueOf(point2.y));
                int intValue3 = ((Integer) pair.first).intValue();
                int intValue4 = ((Integer) pair.second).intValue();
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ10 = X1D.LIZ();
                    LIZ10.append("set data final stream width:");
                    LIZ10.append(intValue3);
                    LIZ10.append(" final stream height*: ");
                    LIZ10.append(intValue4);
                    C0NB.LJIIIZ("GameServiceStrategy", X1D.LIZIZ(LIZ10));
                }
                int i6 = iArr[0];
                int i7 = iArr[1];
                int i8 = iArr[2];
                int i9 = iArr[3];
                int value4 = LiveStreamProfileSetting.INSTANCE.getValue();
                if (value4 >= 0) {
                    i9 = value4;
                }
                int[] value5 = LiveStreamBitrateSetting.INSTANCE.getValue();
                if (value5.length == 3) {
                    i7 = value5[0];
                    i6 = value5[1];
                    i8 = value5[2];
                }
                C14080gu c14080gu = new C14080gu(c37691dt.LJLILLLLZI);
                final C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
                final String str6 = EnumC30551Byt.PushStream.info;
                AVLog.setupLogIODevice(new AVLog.ILogFilter() { // from class: X.1ab
                    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
                    
                        r4.put("throwable", r9);
                     */
                    @Override // com.ss.ttlivestreamer.core.utils.AVLog.ILogFilter
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void print(int r6, java.lang.String r7, java.lang.String r8, java.lang.Throwable r9) {
                        /*
                            r5 = this;
                            org.json.JSONObject r4 = new org.json.JSONObject
                            r4.<init>()
                            r3 = 0
                            if (r7 == 0) goto L14
                            int r0 = r7.length()     // Catch: org.json.JSONException -> L2a
                            if (r0 != 0) goto Lf
                            goto L14
                        Lf:
                            java.lang.String r0 = "sdktag"
                            r4.put(r0, r7)     // Catch: org.json.JSONException -> L2a
                        L14:
                            if (r8 == 0) goto L22
                            int r0 = r8.length()     // Catch: org.json.JSONException -> L2a
                            if (r0 != 0) goto L1d
                            goto L22
                        L1d:
                            java.lang.String r0 = "sdkmsg"
                            r4.put(r0, r8)     // Catch: org.json.JSONException -> L2a
                        L22:
                            if (r9 == 0) goto L4a
                            java.lang.String r0 = "throwable"
                            r4.put(r0, r9)     // Catch: org.json.JSONException -> L2a
                            goto L4a
                        L2a:
                            r3 = move-exception
                            java.util.HashMap r2 = new java.util.HashMap
                            r2.<init>()
                            java.lang.Class r1 = r3.getClass()
                            java.lang.String r0 = "errtag"
                            r2.put(r0, r1)
                            java.lang.String r1 = "AVLog.ILogFilter"
                            java.lang.String r0 = r3.getMessage()
                            r2.put(r1, r0)
                            X.BPl r1 = X.C28733BPl.this
                            java.lang.String r0 = "GameLiveCoreAsyncUtil"
                            r1.LJ(r0, r2)
                            return
                        L4a:
                            switch(r6) {
                                case 2: goto L4e;
                                case 3: goto L4e;
                                case 4: goto L56;
                                case 5: goto L5e;
                                case 6: goto L76;
                                case 7: goto L76;
                                default: goto L4d;
                            }
                        L4d:
                            return
                        L4e:
                            X.BPl r1 = X.C28733BPl.this
                            java.lang.String r0 = r2
                            r1.LIZJ(r0, r4)
                            goto L4d
                        L56:
                            X.BPl r1 = X.C28733BPl.this
                            java.lang.String r0 = r2
                            r1.LJIIIZ(r0, r4)
                            goto L4d
                        L5e:
                            X.BPl r3 = X.C28733BPl.this
                            java.lang.String r2 = r2
                            r3.getClass()
                            boolean r0 = android.text.TextUtils.isEmpty(r2)
                            if (r0 != 0) goto L4d
                            Y.IDRunnableS0S1200000 r1 = new Y.IDRunnableS0S1200000
                            r0 = 8
                            r1.<init>(r4, r2, r3, r0)
                            X.C0NE.LJIIJ(r1)
                            goto L4d
                        L76:
                            X.BPl r2 = X.C28733BPl.this
                            java.lang.String r1 = r2
                            r2.getClass()
                            boolean r0 = android.text.TextUtils.isEmpty(r1)
                            if (r0 != 0) goto L4d
                            X.0NC r0 = new X.0NC
                            r0.<init>(r3, r2, r1, r4)
                            X.C0NE.LJIIJ(r0)
                            goto L4d
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C35651ab.print(int, java.lang.String, java.lang.String, java.lang.Throwable):void");
                    }

                    @Override // com.ss.ttlivestreamer.core.utils.AVLog.ILogFilter
                    public final void print(int i10, String str7, String str8, String str9, Throwable th) {
                        StringBuilder sb = new StringBuilder("");
                        if (str8 != null && str8.length() != 0) {
                            sb.append(str8);
                        }
                        sb.append(" ");
                        if (str9 != null && str9.length() != 0) {
                            sb.append(str9);
                        }
                        print(i10, str7, sb.toString(), th);
                    }
                });
                c14080gu.LJJIL = intValue3;
                c14080gu.LJJIZ = intValue4;
                c14080gu.LJIIIZ = intValue3;
                c14080gu.LJIIJ = intValue4;
                c14080gu.LJ = i6;
                c14080gu.LIZLLL = i7;
                c14080gu.LJFF = i8;
                c14080gu.LJIIL = i9;
                if (streamUrlExtraSafely2.fps == 0) {
                    streamUrlExtraSafely2.fps = 15;
                }
                c14080gu.LJI = streamUrlExtraSafely2.fps;
                c14080gu.LJIJI = 1;
                c14080gu.LJIIJJI = z3;
                if (LiveStreamEnableSdkParamsSetting.INSTANCE.enable()) {
                    str5 = c37691dt.LJLJJI.getStreamUrl().pushSdkParams;
                }
                c14080gu.LJJIIZI = str5;
                c14080gu.LIZJ = 2;
                if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
                    str2 = "musically_live";
                } else {
                    str2 = "tiktok_live";
                }
                c14080gu.LJJ = str2;
                c14080gu.LJIJJLI = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createStreamLogger();
                c14080gu.LJJIJ = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createStreamUploader("screen");
                c14080gu.LJJIJIIJI = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createMonitorReport();
                c14080gu.LJJJ = 3;
                c14080gu.LJIIZILJ = intent;
                c14080gu.LJJJI = c37691dt.LJLJJI.authenticationValue;
                c14080gu.LJIJ = 3;
                if (LiveUseNewAudioCodecSetting.INSTANCE.enable()) {
                    i = 2;
                } else {
                    i = 1;
                }
                c14080gu.LJIILLIIL = i;
                c14080gu.LJIILJJIL = 600000L;
                C14090gv LIZ11 = c14080gu.LIZ();
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ12 = X1D.LIZ();
                    LIZ12.append("setData(). after create LiveStreamConfig, hardware: ");
                    LIZ12.append(z3);
                    LIZ12.append(", width: ");
                    LIZ12.append(intValue3);
                    LIZ12.append(", height: ");
                    C15890jp.LIZIZ(LIZ12, intValue4, ", minBitRate: ", i6, ", defaultBitRate: ");
                    C15890jp.LIZIZ(LIZ12, i7, ", maxBitRate: ", i8, ", fps: ");
                    if (streamUrlExtraSafely2.fps == 0) {
                        streamUrlExtraSafely2.fps = 15;
                    }
                    LIZ12.append(streamUrlExtraSafely2.fps);
                    LIZ12.append(", profile: ");
                    LIZ12.append(i9);
                    C0NB.LJIIIZ("GameServiceStrategy", X1D.LIZIZ(LIZ12));
                }
                InterfaceC21020s6 createLiveStream = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createLiveStream(LIZ11);
                c37691dt.LJLJI = createLiveStream;
                createLiveStream.setStreamCallback(c37691dt);
                c37691dt.LJLJI.setErrorListener(c37691dt);
                ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C54992Dv.class)).LIZ = c37691dt.LJLJI;
                final C266712x c266712x = c37691dt.LJLL;
                LiveCore liveCore2 = c37691dt.LJLJI.getLiveCore();
                c266712x.getClass();
                if (liveCore2 != null) {
                    liveCore2.setDataListener(new ILiveStream.ILiveStreamDataListener() { // from class: X.1e7
                        @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamDataListener
                        public final void onData(int i10, int i11, int i12) {
                            if (i11 >= 0 && i11 < 10) {
                                C266712x.this.LIZIZ.getClass();
                                C0TN.LJ = i11;
                            }
                        }
                    });
                }
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                IDBReceiverS4S0100000 iDBReceiverS4S0100000 = new IDBReceiverS4S0100000(c37691dt, 4);
                c37691dt.LJLJLJ = iDBReceiverS4S0100000;
                C16880lQ.LJJLIIIJILLIZJL(iDBReceiverS4S0100000, c37691dt.LJLILLLLZI, intentFilter);
            }
            C11000bw c11000bw = this.LJLZ;
            if (c11000bw != null) {
                IBroadcastService iBroadcastService = (IBroadcastService) CN1.LIZ(IBroadcastService.class);
                C37691dt c37691dt2 = this.LJZI;
                if (c37691dt2 != null) {
                    iBroadcastService.createPauseLiveHelper(dataChannel, c37691dt2.LJLJI, c11000bw);
                } else {
                    o.LJIJI("mServiceStrategy");
                    throw null;
                }
            }
            if (!C30922CBq.LIZIZ) {
                C0NB.LIZIZ("dump", "onEvent -> the channel isn't local_test");
                return;
            }
            C37691dt c37691dt3 = this.LJZI;
            if (c37691dt3 != null) {
                InterfaceC21020s6 interfaceC21020s6 = c37691dt3.LJLJI;
                if (interfaceC21020s6 != null) {
                    liveCore = interfaceC21020s6.getLiveCore();
                } else {
                    liveCore = null;
                }
                this.LLFZ = new C22910v9(liveCore);
                return;
            }
            o.LJIJI("mServiceStrategy");
            throw null;
        }
        o.LJIJI("mServiceStrategy");
        throw null;
    }

    public final void fm(int i, Cert cert, int i2) {
        int LIZ;
        String content;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("stopLiveInternal , stopReason = ");
        LIZ2.append(i);
        C0NB.LJIIIIZZ(X1D.LIZIZ(LIZ2));
        C37661dq c37661dq = this.LJZ;
        if (c37661dq != null) {
            c37661dq.LJJJJLI = i;
            if (c37661dq.LJIILJJIL() && (LIZ = C264512b.LIZ(c37661dq.LJJIJ, EnumC264412a.LIVE_TIP_CONTROL_MESSAGE_SUSPENDED_TIP.ordinal())) != -1) {
                if (o.LJ(c37661dq.LJJIIZI, "")) {
                    content = C15380j0.LJIILJJIL(R.string.mei);
                } else {
                    content = c37661dq.LJJIIZI;
                }
                o.LJIIIIZZ(content, "content");
                c37661dq.LJFF(true, LIZ, content, c37661dq.LJJIJIIJI);
                c37661dq.LJIIL = true;
                Iterator it = ((ArrayList) c37661dq.LJJJJL).iterator();
                while (it.hasNext()) {
                    ((InterfaceC04500Fq) it.next()).LJII();
                }
            }
        }
        Xl(cert);
        Zl(i, i2);
        if (GameDualDeviceSetting.INSTANCE.isExperimentGroup()) {
            C12700eg c12700eg = (C12700eg) LJIIL().kv0(e0.class);
            if (c12700eg != null) {
                c12700eg.LIZIZ(i2);
            }
            C12750el c12750el = this.LLIIIZ;
            if (c12750el != null) {
                c12750el.LJFF(i2);
            }
        }
    }

    public final void Vl(Intent intent, boolean z, boolean z2, DataChannel dataChannel) {
        if (z2) {
            C11000bw c11000bw = this.LJLZ;
            if (c11000bw != null) {
                c11000bw.LIZ(2);
            }
            C37691dt c37691dt = this.LJZI;
            if (c37691dt != null) {
                c37691dt.LIZLLL(C78857UxB.LJJIIJ(1476788483, "bpea-interrupt_exception_stop_stream"));
                C37691dt c37691dt2 = this.LJZI;
                if (c37691dt2 != null) {
                    c37691dt2.LIZIZ();
                    c37691dt2.LJLJI = null;
                    return;
                } else {
                    o.LJIJI("mServiceStrategy");
                    throw null;
                }
            }
            o.LJIJI("mServiceStrategy");
            throw null;
        }
        Yl(intent, z, dataChannel);
        C37691dt c37691dt3 = this.LJZI;
        if (c37691dt3 != null) {
            if (C29306Beo.LJJIFFI(Boolean.valueOf(c37691dt3.LIZJ(C78857UxB.LJJIIJ(1476788233, "bpea-interrupt_exception_start_stream"), z)))) {
                C22940vC c22940vC = this.LJLLLLLL;
                if (c22940vC != null) {
                    c22940vC.LJIIIZ("succeeded");
                }
                C11000bw c11000bw2 = this.LJLZ;
                if (c11000bw2 != null) {
                    c11000bw2.LIZIZ(2);
                    return;
                }
                return;
            }
            C22940vC c22940vC2 = this.LJLLLLLL;
            if (c22940vC2 != null) {
                c22940vC2.LJIIIZ("failed");
            }
            C29689Bkz.LIZ.LJIIL(C29705BlF.LJLIL);
            Zl(1, -1);
            return;
        }
        o.LJIJI("mServiceStrategy");
        throw null;
    }
}
