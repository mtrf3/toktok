package com.bytedance.android.livesdk.broadcast;

import X.AbstractBinderC30512ByG;
import X.AbstractC12520eO;
import X.AbstractC73672Svk;
import X.B4U;
import X.B83;
import X.BBC;
import X.BCD;
import X.BEF;
import X.BHJ;
import X.BUR;
import X.BUT;
import X.BXB;
import X.BZI;
import X.C03090Af;
import X.C03880Dg;
import X.C04510Fr;
import X.C0K2;
import X.C0N3;
import X.C0NB;
import X.C0WF;
import X.C10U;
import X.C10W;
import X.C10X;
import X.C11000bw;
import X.C14090gv;
import X.C15380j0;
import X.C15650jR;
import X.C17N;
import X.C1EW;
import X.C1P;
import X.C1Q2;
import X.C1VE;
import X.C20780ri;
import X.C20880rs;
import X.C20910rv;
import X.C24130x7;
import X.C259710f;
import X.C259810g;
import X.C28467BFf;
import X.C28718BOw;
import X.C28787BRn;
import X.C29037BaT;
import X.C29040BaW;
import X.C29044Baa;
import X.C29052Bai;
import X.C29053Baj;
import X.C29084BbE;
import X.C29108Bbc;
import X.C29112Bbg;
import X.C29165BcX;
import X.C29180Bcm;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29697Bl7;
import X.C29824BnA;
import X.C29839BnP;
import X.C29935Box;
import X.C2M;
import X.C2R;
import X.C30087BrP;
import X.C30196BtA;
import X.C30197BtB;
import X.C30216BtU;
import X.C30222Bta;
import X.C30355Bvj;
import X.C30378Bw6;
import X.C30386BwE;
import X.C30421Hi;
import X.C30471Bxb;
import X.C30495Bxz;
import X.C30501By5;
import X.C30504By8;
import X.C30506ByA;
import X.C30507ByB;
import X.C30511ByF;
import X.C30514ByI;
import X.C30517ByL;
import X.C30527ByV;
import X.C30553Byv;
import X.C30561Bz3;
import X.C30659C1n;
import X.C30698C3a;
import X.C30700C3c;
import X.C30701C3d;
import X.C30702C3e;
import X.C30730C4g;
import X.C30833C8f;
import X.C30922CBq;
import X.C31014CFe;
import X.C32537Cpp;
import X.C38995FSd;
import X.C3G;
import X.C3Y;
import X.C3Z;
import X.C42061kw;
import X.C45;
import X.C48189Ivh;
import X.C54992Dv;
import X.C5ML;
import X.C62705OjF;
import X.C63078OpG;
import X.C65300Pk0;
import X.C65814PsI;
import X.C73082SmE;
import X.C73969T1h;
import X.C76800UCe;
import X.C7N;
import X.C86793Y4n;
import X.CKO;
import X.CN1;
import X.DialogC30901CAv;
import X.EnumC12540eQ;
import X.EnumC29309Ber;
import X.EnumC30204BtI;
import X.EnumC31814CeA;
import X.EnumC38440F6u;
import X.HandlerC29100BbU;
import X.InterfaceC05190Ih;
import X.InterfaceC05250In;
import X.InterfaceC10980bu;
import X.InterfaceC12560eS;
import X.InterfaceC12570eT;
import X.InterfaceC12590eV;
import X.InterfaceC12610eX;
import X.InterfaceC12620eY;
import X.InterfaceC12630eZ;
import X.InterfaceC12640ea;
import X.InterfaceC12650eb;
import X.InterfaceC12670ed;
import X.InterfaceC12690ef;
import X.InterfaceC15310it;
import X.InterfaceC15320iu;
import X.InterfaceC15330iv;
import X.InterfaceC15340iw;
import X.InterfaceC17140lq;
import X.InterfaceC17150lr;
import X.InterfaceC17160ls;
import X.InterfaceC18250nd;
import X.InterfaceC21020s6;
import X.InterfaceC28921BWr;
import X.InterfaceC29074Bb4;
import X.InterfaceC29405BgP;
import X.InterfaceC30043Bqh;
import X.InterfaceC30045Bqj;
import X.InterfaceC30046Bqk;
import X.InterfaceC30105Brh;
import X.InterfaceC30152BsS;
import X.InterfaceC30302Bus;
import X.InterfaceC30359Bvn;
import X.InterfaceC30442Bx8;
import X.InterfaceC30519ByN;
import X.InterfaceC64592gB;
import X.InterfaceC74605TPt;
import X.InterfaceC86149XrV;
import X.InterfaceC88472Yns;
import X.OJY;
import X.ORZ;
import X.OSZ;
import X.Q7L;
import X.RunnableC30437Bx3;
import X.RunnableC30505By9;
import X.T16;
import X.UB9;
import X.UEJ;
import X.X1D;
import Y.AObjectS42S0101000_5;
import Y.ARunnableS0S0001000_5;
import Y.ARunnableS41S0100000_5;
import Y.AfS54S0200000_5;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.SurfaceView;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.LiveEcoEventApi;
import com.bytedance.android.live.broadcast.api.LiveGetGoalInfoApi;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.LiveReplyVideoPlayerApi;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.GameLiveNetSpeedMonitorWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.pause.PauseLiveWidget;
import com.bytedance.android.livesdk.broadcast.obs.ObsBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.android.livesdk.broadcast.preview.LiveCoverCameraFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.CppUnlockGuideDialog;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.CppUnlockGuideDialogV2;
import com.bytedance.android.livesdk.broadcast.setting.BroadcastGamePreloadCover;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeEducationDialogFragment;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayDeleteResponse;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoResponse;
import com.bytedance.android.livesdk.comp.api.image.IImageService;
import com.bytedance.android.livesdk.dataChannel.BroadcastPageChannel;
import com.bytedance.android.livesdk.dataChannel.ShowEndPageEvent;
import com.bytedance.android.livesdk.goal.model.GetResponse;
import com.bytedance.android.livesdk.linkmic.MultiGuestV3OriginFrameReviewManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLSPreInitSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPerformanceReportOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveOneTapGoliveEntranceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestTextureViewSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3SkipAllowSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceLiveCoreAsyncSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDevicePreloadRetrofitSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.Widget;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.avframework.livestreamv2.core.interact.livertc.RTCEngineWrapper;
import com.ss.ttlivestreamer.core.utils.TTLSPreInitBusinessHelper;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import tikcast.api.anchor.AnchorLiveFragmentEditResponse;
import tikcast.api.anchor.AnchorLiveFragmentInfoResponse;
import tikcast.api.anchor.AnchorLiveReplayFrameResponse;
import tikcast.api.anchor.CancelAutoDownloadResponse;
import tikcast.api.anchor.ScheduleAutoDownloadResponse;
import tikcast.api.eco.EventDetail;
import tikcast.api.eco.EventRequest;

/* loaded from: classes6.dex */
public class BroadcastService implements IBroadcastService {
    public static Activity LJLJJLL;
    public C29165BcX LJLIL;
    public volatile boolean LJLILLLLZI;
    public final List<InterfaceC15320iu> LJLJI;
    public final List<InterfaceC15320iu> LJLJJI;
    public final LongSparseArray<InterfaceC18250nd> LJLJJL;

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final AbstractBinderC30512ByG createBgBroadcastBinder() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final String getLiveCoreVersion() {
        return "15.0.1_1";
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void resetGameLiveStreamEndFlag() {
        OJY.LJLJJI = false;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final LiveWidget createLiveCenterEntranceWidget() {
        return new LiveCenterEntranceWidget();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC30045Bqj createLiveCoverCameraFragment() {
        return new LiveCoverCameraFragment();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC17160ls createMonitorReport() {
        return new C5ML();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC15340iw createStreamLogger() {
        return new C63078OpG();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC15330iv createStreamUploader() {
        return new C30730C4g();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final UB9 createVoiceChatVideoClientFactory() {
        return new C30504By8();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC12570eT getBroadcastPreviewService() {
        return C30421Hi.LIZ.getValue();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final String getBroadcastScene() {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        EnumC29309Ber enumC29309Ber = (EnumC29309Ber) dataChannelGlobal.mv0(BroadcastPageChannel.class);
        if (enumC29309Ber == null || enumC29309Ber.isPreviewPage()) {
            return "";
        }
        if (room != null && room.roomLayout == 2) {
            return "video_anchor_order";
        }
        if (iInteractService.mT()) {
            return "video_anchor_pk";
        }
        if (iInteractService.OB()) {
            return "video_anchor_connect";
        }
        if (iInteractService.ta0()) {
            return "video_anchor_guest_connect";
        }
        return "normal_video_live";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final Map<String, String> getBroadcastTag() {
        String str;
        InterfaceC21020s6 interfaceC21020s6 = (InterfaceC21020s6) DataChannelGlobal.LJLJJI.mv0(C54992Dv.class);
        HashMap hashMap = new HashMap();
        if (interfaceC21020s6 != null && interfaceC21020s6.getLiveCore() != null && interfaceC21020s6.getLiveCore().getBuilder() != null) {
            LiveCore.Builder builder = interfaceC21020s6.getLiveCore().getBuilder();
            int captureAdaptedWidth = builder.getCaptureAdaptedWidth();
            int videoCaptureHeight = builder.getVideoCaptureHeight();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(captureAdaptedWidth);
            LIZ.append("*");
            LIZ.append(videoCaptureHeight);
            hashMap.put("stream_resolution", X1D.LIZIZ(LIZ));
            hashMap.put("stream_fps", String.valueOf(builder.getVideoFps()));
            Map<String, String> map = C31014CFe.LIZLLL;
            Object obj = ((LinkedHashMap) map).get("effect_effect_id");
            String str2 = "";
            if (obj == null) {
                obj = "";
            }
            hashMap.put("live_last_effect_id", obj);
            if (LinkMicPerformanceReportOptSetting.INSTANCE.useOpt()) {
                str = "effect_resource_id";
            } else {
                str = "effect_id";
            }
            Object obj2 = ((LinkedHashMap) map).get(str);
            if (obj2 != 0) {
                str2 = obj2;
            }
            hashMap.put("live_last_resource_id", str2);
        }
        long j = 0;
        if (C29697Bl7.LJIIIIZZ > 0) {
            j = System.currentTimeMillis() - C29697Bl7.LJIIIIZZ;
        }
        hashMap.put("live_broadcast_duration", C17N.LJIJ(j));
        return hashMap;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final String getConnectionType() {
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        if (iInteractService != null) {
            if (iInteractService.Qe0()) {
                return "manual_pk";
            }
            if (iInteractService.ta0()) {
                return "guest";
            }
            if (iInteractService.OB()) {
                return "anchor";
            }
            return "normal";
        }
        return "";
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final String getLiveComposerFilePath() {
        return EnumC31814CeA.INST.getLiveComposerFilePath();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final String getModelFilePath() {
        return EnumC31814CeA.INST.getModelFilePath();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final Map<String, String> getRoomInfo() {
        return (Map) DataChannelGlobal.LJLJJI.mv0(C29824BnA.class);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final String getRtcDeviceID() {
        if (!LiveAppBundleUtils.isPluginAvailable(EnumC38440F6u.LINK_MIC) && !C30922CBq.LIZIZ) {
            return "Unknown(plugin not found)";
        }
        try {
            return RTCEngineWrapper.getRTCDeviceId(GlobalContext.getApplicationContext());
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            return C03090Af.LIZJ(LIZ, "Unknown-msg:", th, LIZ);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final String getRtcVersion() {
        if (!LiveAppBundleUtils.isPluginAvailable(EnumC38440F6u.LINK_MIC) && !C30922CBq.LIZIZ) {
            return "Unknown(plugin not found)";
        }
        try {
            return RTCEngineWrapper.getRTCSDKVersion();
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            return C03090Af.LIZJ(LIZ, "Unknown-msg:", th, LIZ);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void initPublicScreenConfiguration() {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLILLLLZI = true;
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Dv(20, new C29839BnP());
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void preLoadGameLiveCover() {
        Boolean bool;
        Boolean bool2;
        B83 LIZ;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        ImageModel avatarLarge;
        boolean z;
        if (!BroadcastGamePreloadCover.INSTANCE.isEnable()) {
            return;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        C29180Bcm c29180Bcm = (C29180Bcm) dataChannelGlobal.mv0(C29053Baj.class);
        boolean z2 = false;
        String str = null;
        if (c29180Bcm != null) {
            if (c29180Bcm.LJLJJI || c29180Bcm.LJLJJL || c29180Bcm.LJLJI || c29180Bcm.LJLILLLLZI) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        BUT but = (BUT) dataChannelGlobal.mv0(C29052Bai.class);
        if (but != null) {
            if (but.LJLJI || but.LJLILLLLZI) {
                z2 = true;
            }
            bool2 = Boolean.valueOf(z2);
        } else {
            bool2 = null;
        }
        Boolean bool3 = Boolean.TRUE;
        if ((!o.LJ(bool, bool3) && !o.LJ(bool2, bool3)) || (LIZ = B83.LIZ()) == null || (LIZIZ = LIZ.LIZIZ()) == null || (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) == null || (avatarLarge = interfaceC05190Ih.getAvatarLarge()) == null) {
            return;
        }
        List<String> urls = avatarLarge.getUrls();
        if (urls != null) {
            str = (String) ORZ.LJLLLL(urls);
        }
        AqS171S0100000_5 aqS171S0100000_5 = new AqS171S0100000_5(avatarLarge, 40);
        Object value = C15650jR.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-service>(...)");
        ((IImageService) value).Ag(str, aqS171S0100000_5);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void releaseVoiceChatLiveStream() {
        C3Y.LIZ.getClass();
        C0NB.LJ("VoiceChatLiveCoreAsyncUtil", "liveCoreAsyncUtil release");
        C3Y.LIZLLL = null;
        C3Y.LIZJ = null;
        C3Y.LJ = null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void showEndPageForPaidEvent() {
        DataChannelGlobal.LJLJJI.rv0(ShowEndPageEvent.class);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC28921BWr startLiveManager() {
        if (this.LJLIL == null) {
            this.LJLIL = new C29165BcX();
        }
        return this.LJLIL;
    }

    public BroadcastService() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.LJLJI = copyOnWriteArrayList;
        this.LJLJJI = Collections.unmodifiableList(copyOnWriteArrayList);
        this.LJLJJL = new LongSparseArray<>();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void clearPreviewImageInfo() {
        C0WF LIZJ = C30355Bvj.LIZJ();
        LIZJ.LJIJJLI(null);
        LIZJ.LIZJ(null);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void init() {
        C30833C8f.LIZIZ().LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void initLiveBroadcastContext() {
        C30833C8f.LIZIZ().LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final AbstractC73672Svk<Integer> loadShortVideoRes() {
        C30833C8f.LIZIZ().getClass();
        return AbstractC73672Svk.LJJIJIL(1);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService, X.InterfaceC06390Mx
    public final void onInit() {
        if (LiveServiceManagerOptSetting.enable()) {
            return;
        }
        C259810g c259810g = C259710f.LIZ;
        C42061kw c42061kw = new C42061kw();
        c259810g.getClass();
        C259810g.LJIIIIZZ(R.drawable.czb, c42061kw);
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Dv(20, new C29839BnP());
        this.LJLILLLLZI = true;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void reportCameraFirstShow() {
        C29697Bl7.LJIIIZ(System.currentTimeMillis());
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final Activity getBroadcastActivity() {
        return LJLJJLL;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC12590eV getEchoHelper() {
        return C30501By5.LIZ;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC15310it getLiveCameraResManager() {
        return EnumC31814CeA.INST;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC12620eY getLiveCoreInitUtil() {
        return C3Z.LIZ;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC12630eZ getLiveStreamSoundPlayer() {
        return C2R.LIZ;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final List<InterfaceC15320iu> getOnExtendedScreenRegistryReadyListeners() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC12690ef getVideoSizeManager() {
        return C30471Bxb.LIZ;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void releaseLiveStream() {
        C3Z.LIZLLL();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void reportBroadcastCreated() {
        C29697Bl7.LJII();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void reportBroadcastEnd() {
        C29697Bl7.LJIIIIZZ();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void reportEnterBroadcast() {
        C29697Bl7.LJIILIIL();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void addBroadcastLifecycle(InterfaceC12670ed lifecycle) {
        o.LJIIIZ(lifecycle, "lifecycle");
        C1Q2.LIZIZ.add(lifecycle);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void addOnExtendedScreenRegistryReadyListener(InterfaceC15320iu interfaceC15320iu) {
        if (interfaceC15320iu != null) {
            ((CopyOnWriteArrayList) this.LJLJI).add(interfaceC15320iu);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final AbstractC73672Svk<CancelAutoDownloadResponse> cancelLiveReplayAutoDownload(long j) {
        return C1EW.LIZ(((LiveReplyVideoPlayerApi) Q7L.LIZIZ(LiveReplyVideoPlayerApi.class)).cancelAutoDownload(j));
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC30043Bqh createLiveBroadcastEndFragment(Bundle bundle) {
        LiveBroadcastEndFragment liveBroadcastEndFragment = new LiveBroadcastEndFragment();
        liveBroadcastEndFragment.setArguments(bundle);
        return liveBroadcastEndFragment;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final BBC createLiveBroadcastEndSafetyToolsFragment(Bundle bundle) {
        LiveBroadcastEndSafetyToolsFragment liveBroadcastEndSafetyToolsFragment = new LiveBroadcastEndSafetyToolsFragment();
        liveBroadcastEndSafetyToolsFragment.setArguments(bundle);
        return liveBroadcastEndSafetyToolsFragment;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC21020s6 createLiveStream(C14090gv c14090gv) {
        return new CKO(c14090gv);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final LiveRecyclableWidget createNetSpeedMonitorWidget(boolean z) {
        if (z) {
            return new GameLiveNetSpeedMonitorWidget();
        }
        return new NetSpeedMonitorWidget();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final Widget createPauseLiveWidget(View view) {
        return new PauseLiveWidget(view);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC30046Bqk createStartLiveFragment(InterfaceC29074Bb4 interfaceC29074Bb4) {
        C86793Y4n.LJLIL = interfaceC29074Bb4;
        return new LiveBroadcastPreviewFragment();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC10980bu createStatusReporter(Room room) {
        return new C30197BtB(room);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC15330iv createStreamUploader(String str) {
        return new C30730C4g(str);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final C10X createSyncGiftHelper(Room room) {
        return new C30216BtU(room);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final AbstractC73672Svk<AnchorReplayDeleteResponse> deleteLiveReplayAutoDownload(long j) {
        return C1EW.LIZ(((LiveReplyVideoPlayerApi) Q7L.LIZIZ(LiveReplyVideoPlayerApi.class)).deleteLiveReplayAutoDownload(j));
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final AbstractC12520eO getBroadcastGestureDetector(DataChannel dataChannel) {
        return new C30561Bz3(dataChannel);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final LiveMode getLastBroadcastLiveMode(Context context) {
        try {
            return LiveMode.valueOf(BUR.LIZ(context, ((User) ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ).getIdStr()));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final View getLiveCenterNativeView(Context context) {
        o.LJIIIZ(context, "context");
        return new UEJ(context, null, 6);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC30359Bvn getLiveParamsListener(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (InterfaceC30359Bvn) dataChannel.kv0(C30378Bw6.class);
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final AbstractC73672Svk<AnchorLiveFragmentInfoResponse> getLiveReplayFragment(long j) {
        return C1EW.LIZ(((LiveReplyVideoPlayerApi) Q7L.LIZIZ(LiveReplyVideoPlayerApi.class)).getLiveReplayFragment(j));
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final C1VE getMultiGuestV3OriginFrameReviewManager(long j) {
        return new MultiGuestV3OriginFrameReviewManager(j);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC12560eS getMuteMicView(Context context) {
        o.LJIIIZ(context, "context");
        return new C30659C1n(context, null, 6);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final Object getResourceFinder(Context context) {
        return EnumC31814CeA.INST.getResourceFinder(context);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final boolean isCommerce(DataChannel dataChannel) {
        BroadcastSettingResponse broadcastSettingResponse;
        if (dataChannel == null || (broadcastSettingResponse = (BroadcastSettingResponse) dataChannel.kv0(BroadcastSettingResponseChannel.class)) == null || !broadcastSettingResponse.liveCommercial) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void loadPauseLiveButton(DataChannel dataChannel) {
        EnumC30204BtI.PAUSE_LIVE.load(dataChannel, new C45());
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void onLiveTabShow(Context context) {
        o.LJIIIZ(context, "context");
        C20910rv c20910rv = C20910rv.LIZ;
        C20910rv.LJIIL(context);
        C38995FSd.LIZIZ().submit(RunnableC30437Bx3.LJLIL);
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            C20780ri.LIZLLL(R.layout.d4l, context);
            C20780ri.LIZLLL(R.layout.dgn, context);
            C20780ri.LIZLLL(R.layout.dq6, context);
        } else {
            C20910rv.LJIILIIL(c20910rv, R.layout.d4l, C20880rs.LIZ("ttlive_fragment_live_broadcast_preview"), null, false, 24);
            C20910rv.LJIILIIL(c20910rv, R.layout.dgn, C20880rs.LIZ("ttlive_preview_video_mode_container"), null, false, 24);
            C20910rv.LJIILIIL(c20910rv, R.layout.dq6, C20880rs.LIZ("ttlive_widget_preview_title"), null, false, 24);
        }
        if (!LiveBroadcastPoorDevicePreloadRetrofitSetting.INSTANCE.enable()) {
            return;
        }
        C38995FSd.LIZIZ().submit(new ARunnableS0S0001000_5(0, 0));
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void onLocaleChanged(Locale locale) {
        C259810g c259810g = C259710f.LIZ;
        C42061kw c42061kw = new C42061kw();
        c259810g.getClass();
        C259810g.LJIIIIZZ(R.drawable.czb, c42061kw);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void preloadVoiceChatLiveStream(Context context) {
        C3Y c3y = C3Y.LIZ;
        c3y.getClass();
        o.LJIIIZ(context, "context");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preloadLiveStream init context, context:");
        LIZ.append(context);
        C0NB.LIZIZ("VoiceChatLiveCoreAsyncUtil", X1D.LIZIZ(LIZ));
        C3Y.LIZLLL = context;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            return;
        }
        C3Y.LJ = room;
        if (!LiveBroadcastPoorDeviceLiveCoreAsyncSetting.INSTANCE.preloadAtBroadcast()) {
            return;
        }
        C38995FSd.LIZIZ().submit(new ARunnableS41S0100000_5(c3y, 275));
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void removeBroadcastLifecycle(InterfaceC12670ed lifecycle) {
        o.LJIIIZ(lifecycle, "lifecycle");
        C1Q2.LIZIZ.remove(lifecycle);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void reportStartPushStream(WeakHandler weakHandler) {
        C29697Bl7.LJIILJJIL(weakHandler);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void requestCreateInfoFromTools(InterfaceC30519ByN interfaceC30519ByN) {
        C28718BOw.LIZ().LIZ().getPreviewRoomCreateInfo(0L).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS54S0200000_5(this, interfaceC30519ByN, 0), new AfS54S0200000_5(this, interfaceC30519ByN, 1));
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final AbstractC73672Svk<ScheduleAutoDownloadResponse> scheduledLiveReplayAutoDownload(long j) {
        return C1EW.LIZ(((LiveReplyVideoPlayerApi) Q7L.LIZIZ(LiveReplyVideoPlayerApi.class)).scheduleAutoDownload(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void setAnchorLevelPermissionInPreview(BHJ bhj) {
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29037BaT.class)).LIZ = bhj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void setApplyLivePermission(BUT but) {
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29052Bai.class)).LIZ = but;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void setBroadcastActivity(Activity activity) {
        LJLJJLL = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void setDetailLivePermission(C29180Bcm c29180Bcm) {
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29053Baj.class)).LIZ = c29180Bcm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void setLiveBanCapability(BEF bef) {
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29040BaW.class)).LIZ = bef;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void setResumeLiveParams(int i) {
        C29697Bl7.LJIILL(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void setTryModeExperiment(C30553Byv c30553Byv) {
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C30386BwE.class)).LIZ = c30553Byv;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void updateEffectAddTime(String path) {
        LiveEffect first;
        o.LJIIIZ(path, "path");
        HashMap<String, OSZ<LiveEffect, Long>> hashMap = C30527ByV.LIZ;
        OSZ<LiveEffect, Long> osz = hashMap.get(path);
        if (osz != null && (first = osz.getFirst()) != null) {
            hashMap.put(path, new OSZ<>(first, Long.valueOf(System.currentTimeMillis())));
        }
    }

    public static void LIZ(int i, String str) {
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_broadcast_path_get_room_create_info_from_tools", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
            return;
        }
        BZI LIZIZ = C0N3.LIZIZ("livesdk_broadcast_path_get_room_create_info_from_tools", "normal", "enter_from");
        LIZIZ.LJIJJ(Integer.valueOf(i), "is_success");
        LIZIZ.LJIJJ(str, "error");
        LIZIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void addDisplaySourceOption(long j, InterfaceC17150lr interfaceC17150lr) {
        InterfaceC18250nd interfaceC18250nd = this.LJLJJL.get(j);
        if (interfaceC18250nd != null) {
            interfaceC18250nd.LJJLIIIJJI(interfaceC17150lr);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final AbstractC73672Svk<AnchorReplayInfoResponse> checkScheduledLiveReplayVideoTask(boolean z, Long l) {
        String l2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("send getLiveReplayVideoInfo:");
        LIZ.append(l);
        LIZ.append(", startDownload:");
        LIZ.append(z);
        C0NB.LIZIZ("LiveReplyVideoPlayer", X1D.LIZIZ(LIZ));
        if (C29306Beo.LJJIFFI(Boolean.valueOf(z))) {
            for (String str : InterfaceC30442Bx8.f64J.LIZJ().keySet()) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_live_replay_short_connection");
                LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
                str.toString();
                LIZ2.LJIJJ(str, "room_id");
                LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C48189Ivh.LJI(C15380j0.LIZLLL()))) ? 1 : 0), "is_wifi");
                LIZ2.LJJIIJZLJL();
                BZI LIZ3 = C28787BRn.LIZ("livesdk_live_replay_download_start");
                LIZ3.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
                LIZ3.LJIJJ(str, "room_id");
                LIZ3.LJJIIJZLJL();
            }
        }
        if (l == null) {
            Set<String> keySet = InterfaceC30442Bx8.f64J.LIZJ().keySet();
            if (keySet.isEmpty()) {
                C0NB.LIZIZ("LiveReplyVideoPlayer", "send getLiveReplayVideoInfo: scheduledList is empty");
                return null;
            }
            l2 = ORZ.LLD(keySet, ",", null, null, null, 62);
        } else {
            l2 = l.toString();
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("send getLiveReplayVideoInfo: ");
        LIZ4.append(l2);
        C0NB.LIZIZ("LiveReplyVideoPlayer", X1D.LIZIZ(LIZ4));
        C65814PsI.LIZ().getClass();
        AbstractC73672Svk<AnchorReplayInfoResponse> LIZ5 = C1EW.LIZ(((LiveReplyVideoPlayerApi) C65814PsI.LIZJ(LiveReplyVideoPlayerApi.class)).getLiveReplayVideoInfo(l2));
        if (!z) {
            return LIZ5;
        }
        C0NB.LIZIZ("LiveReplyVideoPlayer", "startDownload background");
        LIZ5.LJJJLIIL(C73082SmE.LJLIL, C30507ByB.LJLIL);
        return LIZ5;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC30302Bus createLiveBroadcastFragment(C2M callback, Bundle bundle) {
        boolean z;
        Boolean bool;
        boolean z2 = true;
        if (bundle != null && bundle.getBoolean("is_try_mode", false)) {
            o.LJIIIZ(callback, "callback");
            LivePerformanceManager LIZ = B4U.LIZ();
            LIZ.LJLILLLLZI = LiveMode.VIDEO;
            LIZ.LJJI("create_live");
            LIZ.LJJIIZ(true);
            LIZ.LJJIJ();
            bundle.putLong("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME", System.currentTimeMillis());
            TryModeBroadcastFragment tryModeBroadcastFragment = new TryModeBroadcastFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("extra", bundle);
            tryModeBroadcastFragment.setArguments(bundle2);
            tryModeBroadcastFragment.LJLLILLLL = callback;
            return tryModeBroadcastFragment;
        }
        o.LJIIIZ(callback, "callback");
        LivePerformanceManager LIZ2 = B4U.LIZ();
        LIZ2.LJLILLLLZI = LiveMode.VIDEO;
        LIZ2.LJJI("create_live");
        LIZ2.LJJIIZ(true);
        LIZ2.LJJIJ();
        if (bundle != null) {
            bundle.putLong("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME", System.currentTimeMillis());
            z = bundle.getBoolean("is_one_tap_go_live", false);
        } else {
            z = false;
        }
        LiveBroadcastFragment.LLJJIJIIJIL = z;
        if (bundle == null || !bundle.getBoolean("live.intent.extra.IS_CONTINUE_LIVE", false)) {
            z2 = false;
        }
        LiveBroadcastFragment.LLJJIJIL = z2;
        LiveBroadcastFragment liveBroadcastFragment = new LiveBroadcastFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putBundle("extra", bundle);
        liveBroadcastFragment.setArguments(bundle3);
        liveBroadcastFragment.LJLLLLLL = callback;
        liveBroadcastFragment.LJLJJI = LiveBroadcastFragment.LLJJIJIIJIL;
        if (bundle != null) {
            bool = Boolean.valueOf(bundle.getBoolean("is_from_try_mode", false));
        } else {
            bool = null;
        }
        liveBroadcastFragment.LLIIIILZ = C29306Beo.LJJIFFI(bool);
        return liveBroadcastFragment;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC86149XrV createObsBroadcastFragment(C2M c2m, Bundle bundle) {
        LivePerformanceManager LIZ = B4U.LIZ();
        LIZ.LJLILLLLZI = LiveMode.THIRD_PARTY;
        LIZ.LJJIIZ(true);
        LIZ.LJJI("create_live");
        LIZ.LJJIJ();
        ObsBroadcastFragment obsBroadcastFragment = new ObsBroadcastFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra", bundle);
        obsBroadcastFragment.setArguments(bundle2);
        obsBroadcastFragment.LJLJLLL = c2m;
        return obsBroadcastFragment;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final LiveDialogFragment createTryModeEducationDialogFragment(String str, View.OnClickListener onClickListener) {
        TryModeEducationDialogFragment tryModeEducationDialogFragment = new TryModeEducationDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("WebpFileName", str);
        tryModeEducationDialogFragment.setArguments(bundle);
        o.LJIIIZ(onClickListener, "onClickListener");
        tryModeEducationDialogFragment.LJLJI = onClickListener;
        return tryModeEducationDialogFragment;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC86149XrV createVoiceChatBroadcastFragment(C2M c2m, Bundle bundle) {
        LivePerformanceManager LIZ = B4U.LIZ();
        LIZ.LJLILLLLZI = LiveMode.LIVE_VOICE;
        boolean z = true;
        LIZ.LJJIIZ(true);
        LIZ.LJJI("create_live");
        LIZ.LJJIJ();
        if (bundle == null || !bundle.getBoolean("live.intent.extra.IS_CONTINUE_LIVE", false)) {
            z = false;
        }
        VoiceChatBroadcastFragment.LLIZ = z;
        VoiceChatBroadcastFragment voiceChatBroadcastFragment = new VoiceChatBroadcastFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra", bundle);
        voiceChatBroadcastFragment.setArguments(bundle2);
        voiceChatBroadcastFragment.LJLL = c2m;
        return voiceChatBroadcastFragment;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void logLiveOver(Room room, DataChannel dataChannel) {
        C30222Bta.LIZ(room, dataChannel);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final boolean oneTapGoLive(Context context, Uri uri) {
        int i;
        boolean z;
        if (!TTliveOneTapGoliveEntranceSetting.INSTANCE.getValue()) {
            return false;
        }
        HandlerC29100BbU handlerC29100BbU = new HandlerC29100BbU(C7N.LJIIL().context());
        o.LJIIIZ(uri, "uri");
        try {
            if (!handlerC29100BbU.LJIILLIIL.LJIIIZ()) {
                if (C04510Fr.LIZJ) {
                    i = 1;
                } else if (!C7N.LJIILJJIL().mr0()) {
                    i = 2;
                } else {
                    i = 0;
                }
                handlerC29100BbU.LJIILL = i;
                Activity topActivity = C7N.LJIIJJI().getTopActivity();
                if (topActivity != null) {
                    String queryParameter = UriProtector.getQueryParameter(uri, "skip");
                    if (queryParameter != null) {
                        z = Boolean.parseBoolean(queryParameter);
                    } else {
                        z = false;
                    }
                    if (MultiGuestV3SkipAllowSetting.INSTANCE.getValue() && z) {
                        handlerC29100BbU.LJIIIIZZ(uri, 0);
                    } else {
                        DialogC30901CAv dialogC30901CAv = new DialogC30901CAv(topActivity, uri, i, new C29112Bbg(handlerC29100BbU));
                        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/broadcast/preview/one_tap_golive/OneTapGoLiveDialog", "show", dialogC30901CAv, new Object[0], "void", new C65300Pk0(false, "()V", "-8200677160114792418")).LIZ) {
                            dialogC30901CAv.show();
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            handlerC29100BbU.LJII();
        }
        return true;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void removeDisplaySourceOption(long j, InterfaceC17150lr interfaceC17150lr) {
        InterfaceC18250nd interfaceC18250nd = this.LJLJJL.get(j);
        if (interfaceC18250nd != null) {
            interfaceC18250nd.LJLJL(interfaceC17150lr);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void upLoadLiveEcoEvent(long j, int i) {
        synchronized (C30511ByF.LIZ) {
            if (System.currentTimeMillis() - C30511ByF.LIZIZ >= 60000) {
                EventDetail eventDetail = new EventDetail();
                eventDetail.eventType = i;
                eventDetail.timestamp = System.currentTimeMillis() / 1000;
                ArrayList arrayList = new ArrayList();
                arrayList.add(eventDetail);
                EventRequest eventRequest = new EventRequest();
                eventRequest.roomId = j;
                eventRequest.events = arrayList;
                C65814PsI.LIZ().getClass();
                ((LiveEcoEventApi) C65814PsI.LIZJ(LiveEcoEventApi.class)).uploadEcoEvent(eventRequest).LJJL(T16.LIZ()).LJII(new C62705OjF()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9Co
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                }, new InterfaceC64592gB() { // from class: X.9Cp
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                });
                C30511ByF.LIZIZ = System.currentTimeMillis();
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void createPauseLiveHelper(DataChannel dataChannel, InterfaceC21020s6 interfaceC21020s6, C11000bw c11000bw) {
        new C3G(dataChannel, interfaceC21020s6, c11000bw);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void greenScreenUploadCurrentStickerImage(long j, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C30517ByL c30517ByL = new C30517ByL(j, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), str2);
            c30517ByL.LIZIZ = true;
            C30495Bxz.LIZ.LIZ(c30517ByL);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void preloadLiveStream(Context context, boolean z, boolean z2) {
        GenericDeclaration genericDeclaration;
        C3Z c3z = C3Z.LIZ;
        c3z.getClass();
        o.LJIIIZ(context, "context");
        C3Z.LIZLLL = context;
        C3Z.LJFF = z;
        if (z2) {
            C3Z.LJ = null;
        } else {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            if (z) {
                genericDeclaration = C29108Bbc.class;
            } else {
                genericDeclaration = C29044Baa.class;
            }
            Room room = (Room) dataChannelGlobal.mv0(genericDeclaration);
            if (room == null) {
                return;
            } else {
                C3Z.LJ = room;
            }
        }
        if (TTLSPreInitSettings.INSTANCE.enablePreLoad()) {
            TTLSPreInitBusinessHelper.preInitLiveCore(RunnableC30505By9.LJLIL);
            return;
        }
        if (!LiveBroadcastPoorDeviceLiveCoreAsyncSetting.INSTANCE.preloadAtBroadcast()) {
            return;
        }
        if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
            ARunnableS41S0100000_5 aRunnableS41S0100000_5 = new ARunnableS41S0100000_5(c3z, 103);
            if (!C30506ByA.LIZIZ.isAlive()) {
                C0K2.LIZ("thread not alive", new Throwable());
            }
            Handler handler = C30506ByA.LIZ;
            if (handler != null) {
                handler.post(aRunnableS41S0100000_5);
                return;
            } else {
                o.LJIJI("liveCoreHandler");
                throw null;
            }
        }
        C38995FSd.LIZIZ().submit(new ARunnableS41S0100000_5(c3z, 104));
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void uploadStickerImage(String str, String str2, long j) {
        C30495Bxz.LIZ.LIZ(new C30517ByL(j, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), str2));
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final AbstractC73672Svk<AnchorLiveFragmentEditResponse> clipOrSaveLiveReplayFragment(long j, long j2, long j3, int i) {
        return C1EW.LIZ(((LiveReplyVideoPlayerApi) Q7L.LIZIZ(LiveReplyVideoPlayerApi.class)).clipOrSaveLiveReplayFragment(j, j2, j3, i));
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC74605TPt createLinkMicPreviewView(Context context, C24130x7 c24130x7, DataChannel dataChannel, Object obj) {
        return new C30702C3e(context, c24130x7, obj);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC74605TPt createLinkMicPreviewViewV2(Context context, C24130x7 c24130x7, DataChannel dataChannel, Object obj) {
        if (MultiGuestTextureViewSetting.getValue() == 1) {
            return new C30701C3d(context, c24130x7, obj);
        }
        return new C30702C3e(context, c24130x7, obj);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC74605TPt createLinkVideoView(Context context, C24130x7 c24130x7, InterfaceC17140lq interfaceC17140lq, DataChannel dataChannel) {
        C30698C3a c30698C3a = new C30698C3a(context, c24130x7);
        c30698C3a.setLinkMicLiveEffectCallback(interfaceC17140lq);
        if (dataChannel != null) {
            c30698C3a.setDataChannel(dataChannel);
        }
        return c30698C3a;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final C10U createLiveIllegalHelper(Room room, Context context, DataChannel dataChannel, C10W c10w) {
        return new C30196BtA(room, context, dataChannel, c10w);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC74605TPt createVirtualVideoView(Context context, C24130x7 c24130x7, String str, String str2) {
        return new C30700C3c(context, c24130x7, str, str2);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final AbstractC73672Svk<C28467BFf<GetResponse.Data>> getGoalGiftInfo(String str, Long l, int i, int i2) {
        C65814PsI.LIZ().getClass();
        return ((LiveGetGoalInfoApi) C65814PsI.LIZIZ(LiveGetGoalInfoApi.class)).getGoalInfo(str, l.longValue(), i, Integer.valueOf(i2));
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final AbstractC73672Svk<AnchorLiveReplayFrameResponse> getLiveReplayFrame(long j, long j2, long j3, boolean z) {
        return C1EW.LIZ(((LiveReplyVideoPlayerApi) Q7L.LIZIZ(LiveReplyVideoPlayerApi.class)).getLiveReplayFrame(j, j2, j3, z));
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void showCppUnlockGuideDialog(String str, String str2, Boolean bool, FragmentManager fragmentManager) {
        AObjectS42S0101000_5 aObjectS42S0101000_5 = new AObjectS42S0101000_5(1, str2, 60);
        CppUnlockGuideDialog cppUnlockGuideDialog = new CppUnlockGuideDialog();
        if (str != null) {
            cppUnlockGuideDialog.LJLIL = str;
        }
        if (bool != null) {
            cppUnlockGuideDialog.LJLJI = bool.booleanValue();
        }
        cppUnlockGuideDialog.LJLILLLLZI = aObjectS42S0101000_5;
        cppUnlockGuideDialog.show(fragmentManager, "");
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void showCppUnlockGuideDialogV2(String str, String str2, Boolean bool, FragmentManager fragmentManager) {
        AObjectS42S0101000_5 aObjectS42S0101000_5 = new AObjectS42S0101000_5(1, str2, 61);
        CppUnlockGuideDialogV2 cppUnlockGuideDialogV2 = new CppUnlockGuideDialogV2();
        if (str != null) {
            cppUnlockGuideDialogV2.LJLIL = str;
        }
        if (bool != null) {
            cppUnlockGuideDialogV2.LJLJI = bool.booleanValue();
        }
        cppUnlockGuideDialogV2.LJLILLLLZI = aObjectS42S0101000_5;
        cppUnlockGuideDialogV2.show(fragmentManager, "");
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void showDialog(Context context, PerceptionMessage perceptionMessage, DataChannel dataChannel, InterfaceC12650eb interfaceC12650eb) {
        if (context == null) {
            return;
        }
        if (dataChannel == null) {
            C1P c1p = new C1P(context);
            c1p.LJLJLJ = interfaceC12650eb;
            c1p.LJI(perceptionMessage);
        } else {
            C1P c1p2 = new C1P(context, null, dataChannel);
            c1p2.LJLJLJ = interfaceC12650eb;
            c1p2.LIZIZ(perceptionMessage);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void showGuideBirthdayEditDialog(Activity activity, String str, String str2, InterfaceC05250In interfaceC05250In) {
        BXB.LIZJ(activity, str, str2, interfaceC05250In);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void createCloseRoomHelper(Room room, Context context, DataChannel dataChannel, Fragment fragment, C10W c10w) {
        new C29084BbE(room, context, dataChannel, fragment, c10w);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC30152BsS createCommonInteractionFunctionHelper(Context context, BaseFragment baseFragment, InterfaceC30105Brh interfaceC30105Brh, View view, RecyclableWidgetManager recyclableWidgetManager) {
        return new C30087BrP(context, baseFragment, interfaceC30105Brh, view, recyclableWidgetManager);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC12640ea createLongPressHelper(Room room, Fragment fragment, View view, Context context, DataChannel dataChannel) {
        return new C29935Box(room, fragment, view, context, dataChannel);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final InterfaceC12610eX getLiveCameraCapture(SurfaceView surfaceView, InterfaceC21020s6 interfaceC21020s6, boolean z, boolean z2, boolean z3) {
        return new C30514ByI(surfaceView, interfaceC21020s6, z, z2, z3);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void reportStreamEnd(int i, long j, long j2, boolean z, int i2) {
        OJY.LJIIL(i, j, j2, z, i2);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void reportStreamEndForApi(int i, long j, long j2, boolean z, int i2) {
        OJY.LJIILJJIL(i, j, j2, z, i2);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final EnumC12540eQ disableFunctionAccordingLevel(DataChannel dataChannel, InterfaceC88472Yns<AnchorLevelPermission, EnumC12540eQ> interfaceC88472Yns, InterfaceC88472Yns<EnumC12540eQ, C76800UCe> interfaceC88472Yns2, InterfaceC88472Yns<BZI, BZI> interfaceC88472Yns3, String str, Boolean bool) {
        return BCD.LIZ(dataChannel, interfaceC88472Yns, interfaceC88472Yns2, interfaceC88472Yns3, str, bool);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public final void reportStreamEndForLiveCore(int i, int i2, String str, long j, long j2, boolean z, int i3) {
        OJY.LJIILL(i, i2, str, j, j2, z, i3);
    }
}
