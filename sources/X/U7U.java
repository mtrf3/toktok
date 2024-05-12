package X;

import Y.ARunnableS12S0210000_13;
import Y.ARunnableS12S1200000_13;
import Y.ARunnableS24S0300000_13;
import Y.ARunnableS2S1210000_13;
import Y.ARunnableS32S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.ARunnableS4S1110000_13;
import Y.ARunnableS4S1201000_13;
import Y.AfS0S2340000_13;
import Y.AfS65S0100000_13;
import Y.IDhS106S0100000_13;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcLiveVideoParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcResolution;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostEffectDowngradingSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostMinCapSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostRtcAllowedSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAudioModeOptGuestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAudioModeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixStreamIndependentAndroidSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixStreamLayoutParam;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixStreamLayoutParamSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicWaterMarkResumeFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicAudioModeOptAnchorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkMockChannelAbTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkRtcRoomManagerFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRtcManagerTurnOffSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMonitorConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAndroidGaussBlurOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEffectDowngradingSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRtcAbSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3AnchorMinCapSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMinCapSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.RtcManagerFixThreadSwitch;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeCapResGuestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeCapResSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeFpsAnchorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeFpsGuestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3VideoSeiEndSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.livertc.RTCEngineWrapper;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.utils.MixerUtils;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.capture.CameraUtils;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS158S0200000_11;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS66S1100000_13;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import tikcast.linkmic.controller.MGetABInfosReq;

/* loaded from: classes14.dex */
public final class U7U {
    public static boolean LJJJJ;
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public boolean LJ;
    public U9F LJFF;
    public boolean LJI;
    public Client LJII;
    public U66 LJIIIZ;
    public Room LJIIJ;
    public C76683U7r LJIIJJI;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public String LJIILLIIL;
    public RtcLiveVideoParam LJIIZILJ;
    public UB9 LJIJ;
    public volatile boolean LJIJJ;
    public volatile OSZ<Integer, Integer> LJJIFFI;
    public volatile OSZ<Integer, Integer> LJJII;
    public volatile OSZ<Integer, Integer> LJJIII;
    public volatile OSZ<Integer, Integer> LJJIIJ;
    public OSZ<? extends ImageModel, Boolean> LJJIIJZLJL;
    public volatile boolean LJJIJIIJI;
    public volatile boolean LJJIJIIJIL;
    public volatile boolean LJJIJL;
    public C76671U7f LJJIJLIJ;
    public volatile int LJJIL;
    public final U9S LJIIIIZZ = new U9S();
    public final CopyOnWriteArrayList<InterfaceC76734U9q> LJIIL = new CopyOnWriteArrayList<>();
    public boolean LJIILIIL = true;
    public final C73318Sq2 LJIJI = new C73318Sq2();
    public final java.util.Map<String, Boolean> LJIJJLI = new LinkedHashMap();
    public final java.util.Map<String, Boolean> LJIL = new LinkedHashMap();
    public final CopyOnWriteArrayList<String> LJJ = new CopyOnWriteArrayList<>();
    public final List<OSZ<Integer, Integer>> LJJI = C47261Igj.LJJIJIIJI(new OSZ(480, Integer.valueOf(LiveBroadcastUploadVideoImageHeightSetting.DEFAULT)), new OSZ(540, 960), new OSZ(720, 1280));
    public String LJJIIZ = "";
    public String LJJIIZI = "";
    public volatile long LJJIJ = C31012CFc.LIZIZ();
    public volatile List<? extends Client.ForwardRoomInfo> LJJIJIL = C61878OQg.INSTANCE;
    public final C62822Ol8 LJJIZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 763));
    public final C62822Ol8 LJJJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 764));
    public final C62822Ol8 LJJJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 760));
    public final C62822Ol8 LJJJIL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 759));

    public final void LJJL() {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startPushStreamAsync start scene=");
        U66 u66 = this.LJIIIZ;
        if (u66 != null) {
            num = Integer.valueOf(u66.getScene());
        } else {
            num = null;
        }
        LIZ.append(num);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        if (this.LJJIJIIJI) {
            LJJJZ(C78857UxB.LJJIIJ(1476788233, "bpea-start-push-stream-when-available-for-rtcmanager"));
        } else {
            this.LJJIJIIJIL = true;
        }
    }

    public static final String LJIILL() {
        try {
            String rTCSDKVersion = RTCEngineWrapper.getRTCSDKVersion();
            return rTCSDKVersion == null ? "" : rTCSDKVersion;
        } catch (Throwable unused) {
            return "";
        }
    }

    public final boolean LJ() {
        InterfaceC75973Trl LLZZ;
        List<LinkUser> LJJIIZI;
        long j;
        String appVersion;
        U66 u66 = this.LJIIIZ;
        if (u66 == null || (LLZZ = u66.LLZZ()) == null || (LJJIIZI = LLZZ.LJJIIZI()) == null) {
            return false;
        }
        Iterator<LinkUser> it = LJJIIZI.iterator();
        do {
            boolean z = true;
            if (!it.hasNext()) {
                return true;
            }
            LinkUser next = it.next();
            String appVersion2 = next.getAppVersion();
            if (appVersion2 != null && appVersion2.length() != 0) {
                z = false;
            }
            j = 0;
            if (!z && (appVersion = next.getAppVersion()) != null) {
                j = CastLongProtector.parseLong(appVersion);
            }
        } while (j >= LinkMicAudioModeSetting.INSTANCE.getValue().pushStreamCompatibleVersion);
        return false;
    }

    public final void LJFF() {
        Client client = this.LJII;
        if (client != null) {
            client.composeCurrentWaterMarks();
        }
    }

    public final UBN LJIIL() {
        LiveCore liveCore;
        LiveCore.Builder builder;
        UBN ubn = new UBN();
        UB9 ub9 = this.LJIJ;
        ILiveStream iLiveStream = null;
        if (ub9 != null) {
            iLiveStream = ub9.getLiveCore();
        }
        if (!(iLiveStream instanceof LiveCore) || (liveCore = (LiveCore) iLiveStream) == null || (builder = liveCore.getBuilder()) == null) {
            return ubn;
        }
        ubn.LIZ = builder.getVideoWidth();
        ubn.LIZIZ = builder.getVideoHeight();
        return ubn;
    }

    public final ILayerControl.ILayer LJIILJJIL() {
        ILiveStream liveCore;
        ILayerControl layerControl;
        UB9 ub9 = this.LJIJ;
        if (ub9 == null || (liveCore = ub9.getLiveCore()) == null || !(liveCore instanceof LiveCore) || (layerControl = ((LiveCore) liveCore).getLayerControl()) == null) {
            return null;
        }
        return layerControl.getLocalOriginLayer();
    }

    public final boolean LJIL() {
        Integer num;
        U66 u66 = this.LJIIIZ;
        if (u66 != null) {
            num = Integer.valueOf(u66.getScene());
        } else {
            num = null;
        }
        if (num == null || num.intValue() != 4) {
            return false;
        }
        if ((!MultiGuestV3ChangeCapResSetting.INSTANCE.isEnable() || !LJJIIJ()) && (!MultiGuestV3ChangeCapResGuestSetting.INSTANCE.isEnable() || LJJIIJ())) {
            return false;
        }
        return true;
    }

    public final boolean LJJ() {
        Integer valueOf;
        U66 u66 = this.LJIIIZ;
        if (u66 != null && (valueOf = Integer.valueOf(u66.getScene())) != null) {
            if (valueOf.intValue() == 4) {
                return MultiGuestEffectDowngradingSetting.INSTANCE.isEnable();
            }
            if (valueOf.intValue() == 2) {
                return CoHostEffectDowngradingSetting.INSTANCE.isEnable();
            }
        }
        return false;
    }

    public final boolean LJJI() {
        Integer num;
        U66 u66 = this.LJIIIZ;
        if (u66 != null) {
            num = Integer.valueOf(u66.getScene());
        } else {
            num = null;
        }
        if (num == null) {
            return false;
        }
        if (num.intValue() == 4) {
            if ((!MultiGuestV3ChangeFpsGuestSetting.INSTANCE.isEnable() || LJJIIJ()) && (!MultiGuestV3ChangeFpsAnchorSetting.INSTANCE.isEnable() || !LJJIIJ())) {
                return false;
            }
            return true;
        }
        if (num.intValue() != 2) {
            return false;
        }
        return CoHostRtcAllowedSetting.INSTANCE.isEnable();
    }

    public final boolean LJJIII() {
        Boolean bool;
        Client client = this.LJII;
        if (client != null) {
            bool = Boolean.valueOf(client.isNeedPublishFrame());
        } else {
            bool = null;
        }
        return C29306Beo.LJJIFFI(bool);
    }

    public final boolean LJJIIJ() {
        Long l;
        RtcUserInfo LLZL;
        U66 u66 = this.LJIIIZ;
        Long l2 = null;
        if (u66 != null && (LLZL = u66.LLZL()) != null) {
            l = Long.valueOf(LLZL.getUserId());
        } else {
            l = null;
        }
        Room room = this.LJIIJ;
        if (room != null) {
            l2 = Long.valueOf(room.getOwnerUserId());
        }
        return o.LJ(l, l2);
    }

    public final boolean LJJIIJZLJL() {
        return ((Boolean) this.LJJIZ.getValue()).booleanValue();
    }

    public final boolean LJJIIZ() {
        return ((Boolean) this.LJJJ.getValue()).booleanValue();
    }

    public final void LJJJJ() {
        Client client = this.LJII;
        if (client != null) {
            client.pause();
        }
        U66 u66 = this.LJIIIZ;
        if (u66 != null) {
            C76762UAs LIZJ = UA9.LIZJ();
            LIZJ.getClass();
            UC0.LJJLIIIIJ(new ARunnableS32S0200000_13(u66, LIZJ, 138));
        }
        C32014ChO.LJIIJ(LJJIJIIJI(548), "rtc pause");
    }

    public final void LJJJJJ() {
        Client client = this.LJII;
        if (client != null) {
            client.removeAllWaterMarks();
        }
    }

    public final void LJJJJLL() {
        Client client = this.LJII;
        if (client != null) {
            client.resume();
        }
        U66 u66 = this.LJIIIZ;
        if (u66 != null) {
            C76762UAs LIZJ = UA9.LIZJ();
            LIZJ.getClass();
            UC0.LJJLIIIIJ(new ARunnableS32S0200000_13(u66, LIZJ, 139));
        }
        C32014ChO.LJIIJ(LJJIJIIJI(539), "rtc resume");
    }

    public final void LJJLIIIJLJLI() {
        Client client;
        Config config;
        Config.MixStreamConfig mixStreamConfig;
        if (LJII(this.LJIJ) && (client = this.LJII) != null && (config = client.getConfig()) != null && (mixStreamConfig = config.getMixStreamConfig()) != null) {
            LJIILLIIL("updateIndependentNonGenericMixStreamParams");
            LJJLIIIJL(mixStreamConfig);
            LJJJLZIJ(mixStreamConfig);
            LIZ(mixStreamConfig);
        }
    }

    public final boolean LJJII() {
        U66 u66;
        Integer valueOf;
        if (!LJJI() || (u66 = this.LJIIIZ) == null || (valueOf = Integer.valueOf(u66.getScene())) == null) {
            return false;
        }
        if (valueOf.intValue() == 4) {
            if ((!MultiGuestV3GuestMinCapSetting.INSTANCE.isEnable() || LJJIIJ()) && (!MultiGuestV3AnchorMinCapSetting.INSTANCE.isEnable() || !LJJIIJ())) {
                return false;
            }
            return true;
        }
        if (valueOf.intValue() != 2) {
            return false;
        }
        return CoHostMinCapSetting.INSTANCE.isEnable();
    }

    public static void LIZ(Config.MixStreamConfig mixStreamConfig) {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder("videoWidth=");
        sb.append(mixStreamConfig.getVideoWidth());
        sb.append(",\nvideoHeight=");
        sb.append(mixStreamConfig.getVideoHeight());
        sb.append(",\nvideoBitrate=");
        sb.append(mixStreamConfig.getVideoBitrate());
        sb.append(",\nvideoFrameRate=");
        sb.append(mixStreamConfig.getVideoFrameRate());
        sb.append(",\nvideoGop=");
        sb.append(mixStreamConfig.getVideoGop());
        sb.append(",\nvideoCodec=");
        Config.VideoCodec videoCodec = mixStreamConfig.getVideoCodec();
        String str4 = null;
        if (videoCodec != null) {
            str = videoCodec.name();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",\nvideoProfile=");
        Config.VideoProfile videoProfile = mixStreamConfig.getVideoProfile();
        if (videoProfile != null) {
            str2 = videoProfile.name();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(",\nvideoSupportBFrame=");
        sb.append(mixStreamConfig.getVideoSupportBFrame());
        sb.append(",\nbackgroundColor=");
        sb.append(mixStreamConfig.getBackgroundColor());
        sb.append(",\naudioSampleRate=");
        Config.AudioSampleRate audioSampleRate = mixStreamConfig.getAudioSampleRate();
        if (audioSampleRate != null) {
            str3 = audioSampleRate.name();
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(",\naudioChannels=");
        sb.append(mixStreamConfig.getAudioChannels());
        sb.append(",\naudioBitrate=");
        sb.append(mixStreamConfig.getAudioBitrate());
        sb.append(",\naudioProfile=");
        Config.AudioProfile audioProfile = mixStreamConfig.getAudioProfile();
        if (audioProfile != null) {
            str4 = audioProfile.name();
        }
        sb.append(str4);
        sb.append(",\nstreamUrl=");
        sb.append(mixStreamConfig.getStreamUrl());
        sb.append(",\nstreamName=");
        sb.append(mixStreamConfig.getStreamName());
        sb.append(",\nstreamUuid=");
        sb.append(mixStreamConfig.getStreamUniqueId());
        sb.append(",\ntaskId=");
        sb.append(mixStreamConfig.getTaskId());
        sb.append(",\n");
        String sb2 = sb.toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aLogMixStreamConfig:\n  ");
        LIZ.append(sb2);
        U4R.LIZ("RtcManager", X1D.LIZIZ(LIZ));
    }

    public static void LJIILLIIL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("independentMixStreamParams  ");
        LIZ.append(str);
        U4R.LIZ("RtcManager", X1D.LIZIZ(LIZ));
    }

    public static String LJJIJIIJI(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.COMMON, LIZ, "_RtcManager_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.COMMON, LIZ2, "_RtcManager_", i, LIZ2);
    }

    public static String LJJJJL(String str) {
        j LJJIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeRtcMixParam, ");
        LIZ.append(str);
        LJIILLIIL(X1D.LIZIZ(LIZ));
        if (str == null) {
            return str;
        }
        m LJIIZILJ = GsonProtectorUtils.parse(new com.google.gson.o(), str).LJIIZILJ();
        if (LJIIZILJ.LJJIJLIJ("live_rtc_video_param") && (LJJIJ = LJIIZILJ.LJJIJ("live_rtc_video_param")) != null && (LJJIJ instanceof m)) {
            m mVar = (m) LJJIJ;
            if (mVar.LJJIJLIJ("rtc_mix_param")) {
                mVar.LJJJ("rtc_mix_param");
            }
        }
        return GsonProtectorUtils.toJson(C09650Zl.LIZIZ, (j) LJIIZILJ);
    }

    public final void LIZLLL(boolean z) {
        if (LJJIIJ()) {
            C76129TuH.LIZ(this.LJIIIZ, z);
            return;
        }
        U66 u66 = this.LJIIIZ;
        if (u66 == null) {
            return;
        }
        C76129TuH.LJFF(0, u66, null, z, 5);
    }

    public final void LJI(String source) {
        ILiveStream liveCore;
        o.LJIIIZ(source, "source");
        UC7.LJ("detach start:", source, "RtcManager");
        LJJJJ = false;
        C76671U7f c76671U7f = this.LJJIJLIJ;
        if (c76671U7f != null) {
            c76671U7f.LIZIZ(new ARunnableS49S0100000_13(c76671U7f, 268));
        }
        this.LJJIJLIJ = null;
        this.LJFF = null;
        this.LJJIIJZLJL = null;
        this.LJIIL.clear();
        Client client = this.LJII;
        if (client != null) {
            client.setListener(null);
        }
        Client client2 = this.LJII;
        if (client2 != null) {
            client2.stop();
        }
        Client client3 = this.LJII;
        if (client3 != null) {
            client3.dispose();
        }
        if (this.LJII != null) {
            LIZLLL(true);
            C76129TuH.LIZJ = 4;
            U66 u66 = this.LJIIIZ;
            if (u66 != null) {
                UA9.LJJIZ(u66, source);
                u66.LLLZIIL().LJIJ(u66, source);
            }
            if (LinkmicSdkRtcRoomManagerFixSetting.INSTANCE.isOpt()) {
                U84.LIZ(2);
                U84.LIZJ = null;
            }
        }
        this.LJII = null;
        U9S u9s = this.LJIIIIZZ;
        if (!u9s.LIZIZ.LJLILLLLZI) {
            u9s.LIZIZ.dispose();
        }
        this.LJIJI.LIZLLL();
        UB9 ub9 = this.LJIJ;
        if (ub9 != null && (liveCore = ub9.getLiveCore()) != null) {
            C29306Beo.LJJJ(new AqS158S0200000_11(this, liveCore, 22));
        }
        this.LJIJ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJJ.clear();
        this.LJIILLIIL = null;
        this.LJIIZILJ = null;
        this.LJJIJ = 0L;
        this.LJJIJIIJI = false;
        this.LJJIJIIJIL = false;
        this.LJJIJL = false;
        this.LJJIJIL = C61878OQg.INSTANCE;
        String scene = this.LJJIIZI;
        o.LJIIIZ(scene, "scene");
        ((UBG) UB5.LIZ.getValue()).LIZ(scene);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("perf stop, scene=");
        LIZ.append(this.LJJIIZI);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        try {
            ((LinkedHashMap) this.LJIL).clear();
            ((LinkedHashMap) this.LJIJJLI).clear();
        } catch (NullPointerException unused) {
        }
    }

    public final boolean LJII(UB9 ub9) {
        ILiveStream iLiveStream;
        LiveCore liveCore = null;
        if (ub9 != null) {
            iLiveStream = ub9.getLiveCore();
        } else {
            iLiveStream = null;
        }
        if (iLiveStream instanceof LiveCore) {
            liveCore = (LiveCore) iLiveStream;
        }
        if (LJJIIJ() && this.LJIILL && liveCore != null && !MixerUtils.isConfigMixOnClient(liveCore) && LinkMicMixStreamIndependentAndroidSwitchSetting.INSTANCE.getValue()) {
            return true;
        }
        return false;
    }

    public final void LJIIIZ(String source) {
        Integer num;
        o.LJIIIZ(source, "source");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("exitInteractInNormalWay start scene=");
        U66 u66 = this.LJIIIZ;
        if (u66 != null) {
            num = Integer.valueOf(u66.getScene());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(" source=");
        LIZ.append(source);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        LJJLIIIJILLIZJL(C78857UxB.LJJIIJ(1476788483, "bpea-linkmic_rtcmanager_exitinteractinnormalway"), source);
    }

    public final void LJIIJ(boolean z) {
        String str;
        this.LJIJJ = z;
        String LJJIJIIJI = LJJIJIIJI(1113);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enter ");
        if (z) {
            str = "background";
        } else {
            str = "foreground";
        }
        LIZ.append(str);
        C32014ChO.LJIIJ(LJJIJIIJI, X1D.LIZIZ(LIZ));
    }

    public final ILayerControl.ILayer LJIILIIL(String str) {
        ILiveStream liveCore;
        ILayerControl layerControl;
        UB9 ub9 = this.LJIJ;
        if (ub9 != null && (liveCore = ub9.getLiveCore()) != null && (liveCore instanceof LiveCore) && (layerControl = ((LiveCore) liveCore).getLayerControl()) != null) {
            return layerControl.getLayer(str);
        }
        return null;
    }

    public final void LJIJJ(String str) {
        UC7.LJ("invalidateSei start, source: ", str, "RtcManager");
        Client client = this.LJII;
        if (client != null) {
            client.invalidateSei();
        }
    }

    public final boolean LJIJJLI(String linkMicId) {
        Long l;
        o.LJIIIZ(linkMicId, "linkMicId");
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        Room room = this.LJIIJ;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        if (iInteractService.gt(String.valueOf(l))) {
            return true;
        }
        Boolean bool = (Boolean) ((LinkedHashMap) this.LJIL).get(linkMicId);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean LJJIIZI(String str) {
        Boolean bool = (Boolean) ((LinkedHashMap) this.LJIJJLI).get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void LJJIJ(String source) {
        boolean z;
        o.LJIIIZ(source, "source");
        C76683U7r c76683U7r = this.LJIIJJI;
        if (c76683U7r != null) {
            z = c76683U7r.LIZIZ(3);
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("joinRtcEngineChannel start joinRtcEngineChannel transit:");
        LIZ.append(z);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        if (!z) {
            return;
        }
        if (!LJJIIJ()) {
            C74838TYs.LJ().LJJIII = true;
        }
        this.LJJIJ = C31012CFc.LIZIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("joinRtcEngineChannel, ");
        LIZ2.append(source);
        LJJLIIIJJIZ(X1D.LIZIZ(LIZ2));
        if (1 == U84.LIZ) {
            LinkmicSdkRtcRoomManagerFixSetting linkmicSdkRtcRoomManagerFixSetting = LinkmicSdkRtcRoomManagerFixSetting.INSTANCE;
            if (linkmicSdkRtcRoomManagerFixSetting.isOpt()) {
                if (linkmicSdkRtcRoomManagerFixSetting.isOpt()) {
                    Client client = U84.LIZJ;
                    if (client != null) {
                        client.stop();
                        client.dispose();
                        U84.LIZ(2);
                        C0NB.LIZIZ("RtcStateMachine", "leave last rtc channel");
                    }
                    Client client2 = this.LJII;
                    if (client2 != null) {
                        client2.joinChannel();
                    }
                }
                C29306Beo.LJJJ(new AqS163S0100000_13(this, 761));
            }
        }
        Client client3 = this.LJII;
        if (client3 != null) {
            client3.joinChannel();
        }
        if (this.LJII != null) {
            U66 u66 = this.LJIIIZ;
            if (u66 != null) {
                C76762UAs LIZJ = UA9.LIZJ();
                LIZJ.getClass();
                UC0.LJJLIIIIJ(new ARunnableS12S1200000_13(u66, LIZJ, source, 4));
                u66.LLLZIIL().LJIILLIIL(u66, source);
            }
            if (LinkmicSdkRtcRoomManagerFixSetting.INSTANCE.isOpt()) {
                U84.LIZ(1);
            }
        }
        C29306Beo.LJJJ(new AqS163S0100000_13(this, 761));
    }

    public final void LJJIJIL(String str) {
        StringBuilder LIZLLL = C06540Nm.LIZLLL("monitorVideoApiCall apiName:", "LiveStream.setBackGroundPhotoPath", " source:", str, " mute:");
        LIZLLL.append((Object) null);
        LIZLLL.append(" extMsg:");
        LIZLLL.append((String) null);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZLLL));
        U66 u66 = this.LJIIIZ;
        if (u66 != null) {
            UA9.LJJJ(u66, "LiveStream.setBackGroundPhotoPath", str, null, null);
        }
    }

    public final void LJJJIL(LinkCoreError linkCoreError) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInitError start scene=");
        U66 u66 = this.LJIIIZ;
        if (u66 != null) {
            num = Integer.valueOf(u66.getScene());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(" error=");
        LIZ.append(linkCoreError);
        U4R.LIZIZ("RtcManager", X1D.LIZIZ(LIZ));
        U66 u662 = this.LJIIIZ;
        if (u662 != null) {
            int errorCode = linkCoreError.getErrorCode();
            String desc = linkCoreError.getErrorMsg();
            o.LJIIIZ(desc, "desc");
            C76762UAs LIZJ = UA9.LIZJ();
            LIZJ.getClass();
            UC0.LJJLIIIIJ(new ARunnableS4S1201000_13(errorCode, u662, LIZJ, desc, 5));
        }
        Iterator<InterfaceC76734U9q> it = this.LJIIL.iterator();
        while (it.hasNext()) {
            it.next().LJJI(linkCoreError);
        }
        C15610jN.LIZIZ(new ARunnableS32S0200000_13(this, linkCoreError, 144));
        C75516TkO.LIZ.LIZ(20003, linkCoreError.toString(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJJI(Cert cert) {
        String str;
        Object obj;
        Object obj2;
        Long l;
        long j;
        Client client = this.LJII;
        if (client == null) {
            return;
        }
        if (this.LIZLLL) {
            U4R.LIZLLL("RtcManager", "startPushStream mHasPushStream == true");
            return;
        }
        client.startPushData();
        Integer num = null;
        if (MultiGuestRtcAbSwitcherSetting.INSTANCE.isEnable()) {
            if (LinkmicSdkMockChannelAbTestSetting.INSTANCE.isEnable()) {
                U66 u66 = this.LJIIIZ;
                if (u66 != null) {
                    j = u66.LJJLI();
                } else {
                    j = 0;
                }
                obj = Long.valueOf(j % 3);
            } else {
                U66 u662 = this.LJIIIZ;
                if (u662 != null) {
                    str = Long.valueOf(u662.LJJLI()).toString();
                } else {
                    str = null;
                }
                try {
                    java.util.Map<String, Object> map = C76680U7o.LIZ.get(str);
                    if (map != null) {
                        obj2 = map.get("linkmic_sdk_enable_b_frame");
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof Integer) {
                        obj = (Integer) obj2;
                    }
                } catch (Throwable th) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("getIntValue error ");
                    LIZ.append("linkmic_sdk_enable_b_frame");
                    LIZ.append(':');
                    C0NB.LJFF("RtcAbUtil", X1D.LIZIZ(LIZ), th);
                }
                obj = null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("enableBFrameOnMixStream, sInteractSeq: ");
            U66 u663 = this.LJIIIZ;
            if (u663 != null) {
                l = Long.valueOf(u663.LJJLI());
            } else {
                l = null;
            }
            LIZ2.append(l);
            LIZ2.append(", enableBFrame: ");
            LIZ2.append(obj);
            C0NB.LIZIZ("gbj_debug", X1D.LIZIZ(LIZ2));
            if (!o.LJ(obj, 0)) {
                if (o.LJ(obj, 1)) {
                    client.enableVideoBFrameOnMixStream(true);
                } else if (o.LJ(obj, 2)) {
                    client.enableVideoBFrameOnMixStream(false);
                }
            }
        }
        U66 u664 = this.LJIIIZ;
        if (u664 != null) {
            C76762UAs LIZJ = UA9.LIZJ();
            LIZJ.getClass();
            UC0.LJJLIIIIJ(new ARunnableS32S0200000_13(u664, LIZJ, 141));
            u664.LLLZIIL().LJIJI(u664);
        }
        if (cert != null) {
            client.startInteract(cert);
        } else {
            client.startInteract();
        }
        if (LinkMicWaterMarkResumeFixSetting.isEnable()) {
            LJFF();
        }
        this.LIZLLL = true;
        RtcLiveVideoParam rtcLiveVideoParam = this.LJIIZILJ;
        if (rtcLiveVideoParam != null) {
            LJJLIIJ(rtcLiveVideoParam);
            LJJLIIIJLJLI();
        }
        C29306Beo.LJJJ(new AqS163S0100000_13(this, 762));
        if (MtCoHostCrossRoomPushSDKSetting.isEnable() && !this.LJJIJL && (!this.LJJIJIL.isEmpty())) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("startForwardStreamToRoomsWhenPushed start scene=");
            U66 u665 = this.LJIIIZ;
            if (u665 != null) {
                num = Integer.valueOf(u665.getScene());
            }
            LIZ3.append(num);
            U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ3));
            this.LJJIJL = true;
            U66 u666 = this.LJIIIZ;
            if (u666 != null) {
                UA9.LJJIL(u666, this.LJJIJIL, C31012CFc.LIZIZ(), System.currentTimeMillis());
            }
            Client client2 = this.LJII;
            if (client2 != 0) {
                client2.startForwardStreamToRooms(this.LJJIJIL);
            }
        }
    }

    public final void LJJJJIZL(InterfaceC76734U9q listener) {
        o.LJIIIZ(listener, "listener");
        this.LJIIL.add(listener);
    }

    public final void LJJJJJL(InterfaceC76734U9q listener) {
        o.LJIIIZ(listener, "listener");
        this.LJIIL.remove(listener);
    }

    public final void LJJJJLI(LiveCore liveCore) {
        if (LJJIIZ()) {
            if (LJJII()) {
                CameraUtils.clearRecords();
            }
            if (!LJJIIJ()) {
                return;
            }
            C29306Beo.LJJJ(new AqS160S0200000_13(this, liveCore, 111));
        }
    }

    public final void LJJJJZ(String str) {
        U66 u66;
        UC7.LJ("sendRoomMessage start msg=", str, "RtcManager");
        U66 u662 = this.LJIIIZ;
        if ((u662 != null && u662.LIZIZ() == 4) || ((u66 = this.LJIIIZ) != null && u66.LIZIZ() == 5)) {
            C76671U7f c76671U7f = this.LJJIJLIJ;
            if (c76671U7f != null) {
                UC7.LJ("insertSuccessRateFieldToMsg msg=", str, "RtcRoomMsgSuccessRateMonitor");
                try {
                    if (c76671U7f.LJFF) {
                        U4R.LIZLLL("RtcRoomMsgSuccessRateMonitor", "RtcRoomMsgSuccessRateMonitor isDestroy, you need to create a new RtcRoomMsgSuccessRateMonitor to use");
                    } else if (c76671U7f.LIZ == Long.MAX_VALUE) {
                        U4R.LIZIZ("RtcRoomMsgSuccessRateMonitor", "msgSendIndex == Long.MAX_VALUE, direct return");
                    } else {
                        LinkLayerRTCMessage linkLayerRTCMessage = (LinkLayerRTCMessage) U7V.LJIILLIIL(LinkLayerRTCMessage.class, str);
                        if (linkLayerRTCMessage != null && c76671U7f.LJIIIIZZ.contains(linkLayerRTCMessage.getMethod())) {
                            linkLayerRTCMessage.setUid(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
                            long j = c76671U7f.LIZ + 1;
                            c76671U7f.LIZ = j;
                            linkLayerRTCMessage.setIndex(j);
                            String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, linkLayerRTCMessage);
                            if (json != null) {
                                str = json;
                            }
                        }
                    }
                } catch (Throwable th) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("insertSuccessRateFieldToMsg error: ");
                    LIZ.append(V0N.LJJIJL(th));
                    U4R.LIZIZ("RtcRoomMsgSuccessRateMonitor", X1D.LIZIZ(LIZ));
                }
            }
            UC7.LJ("sendRoomMessage insertSuccessRateFieldMsg=", str, "RtcManager");
            Client client = this.LJII;
            if (client != null) {
                client.sendRoomMessage(str);
            }
            U9F u9f = this.LJFF;
            if (u9f != null) {
                u9f.LLILLL(str);
            }
        }
    }

    public final void LJJJLL(Bitmap bitmap) {
        ILiveStream iLiveStream = null;
        if (bitmap != null && !bitmap.isRecycled()) {
            UB9 ub9 = this.LJIJ;
            if (ub9 != null) {
                iLiveStream = ub9.getLiveCore();
            }
            if ((iLiveStream instanceof LiveCore) && iLiveStream != null) {
                iLiveStream.setBackgroundImageBitmap(bitmap);
                return;
            }
            return;
        }
        UB9 ub92 = this.LJIJ;
        if (ub92 != null) {
            iLiveStream = ub92.getLiveCore();
        }
        if (!(iLiveStream instanceof LiveCore) || iLiveStream == null) {
            return;
        }
        iLiveStream.releaseBackgroundImage();
    }

    public final void LJJJLZIJ(Config.MixStreamConfig mixStreamConfig) {
        mixStreamConfig.setTaskId(U7V.LJ(this.LJIIIZ));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setTaskId:");
        LIZ.append(mixStreamConfig.getTaskId());
        LJIILLIIL(X1D.LIZIZ(LIZ));
    }

    public final void LJJJZ(Cert cert) {
        UB9 ub9;
        ILiveStream liveCore;
        Integer num = null;
        if (MultiGuestV3VideoSeiEndSetting.INSTANCE.enableVideoSei() && (ub9 = this.LJIJ) != null && (liveCore = ub9.getLiveCore()) != null) {
            liveCore.addSeiField("ttls_live_scene", null, -1, true, false);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startPushStream start scene=");
        U66 u66 = this.LJIIIZ;
        if (u66 != null) {
            num = Integer.valueOf(u66.getScene());
        }
        LIZ.append(num);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        if (RtcManagerFixThreadSwitch.getValue() && this.LJII == null) {
            U4R.LIZLLL("RtcManager", "rtcClient is null, run on background thread");
            C76766UAw.LIZJ.LIZ(new AqS160S0200000_13(this, cert, 112));
        } else {
            LJJJJI(cert);
        }
    }

    public final void LJJLI(RtcResolution rtcResolution) {
        this.LJJIFFI = new OSZ<>(Integer.valueOf(rtcResolution.getResolution().getWidth()), Integer.valueOf(rtcResolution.getResolution().getHeight()));
        new OSZ(Integer.valueOf(rtcResolution.getResolution().getEffectWidth()), Integer.valueOf(rtcResolution.getResolution().getEffectHeight()));
    }

    public final void LJJLIIIIJ(boolean z) {
        U66 u66;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switchAudio start audioEnable=");
        LIZ.append(z);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        if (!LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().enable && (u66 = this.LJIIIZ) != null) {
            C76762UAs LIZJ = UA9.LIZJ();
            LIZJ.getClass();
            UC0.LJJLIIIIJ(new ARunnableS12S0210000_13(u66, LIZJ, z, 4));
        }
        Client client = this.LJII;
        if (client != null) {
            client.switchAudio(z);
        }
    }

    public final void LJJLIIIJ(boolean z) {
        ILiveStream liveCore;
        ILiveStream liveCore2;
        if (z) {
            UB9 ub9 = this.LJIJ;
            if (ub9 != null && (liveCore2 = ub9.getLiveCore()) != null) {
                liveCore2.stopVideoCapture();
                return;
            }
            return;
        }
        UB9 ub92 = this.LJIJ;
        if (ub92 == null || (liveCore = ub92.getLiveCore()) == null) {
            return;
        }
        liveCore.startVideoCapture();
    }

    public final void LJJLIIIJJIZ(String str) {
        String str2;
        LayoutInfo LLLZI;
        U66 u66 = this.LJIIIZ;
        if (u66 != null && (LLLZI = u66.LLLZI()) != null) {
            str2 = LLLZI.getBusinessId();
        } else {
            str2 = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateBusinessId businessId: ");
        LIZ.append(str2);
        LIZ.append(", source: ");
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        U4R.LIZ("RtcManager", LIZIZ);
        if (str2 == null || str2.length() == 0) {
            C75516TkO.LIZ.LIZ(20006, LIZIZ, null);
            return;
        }
        Client client = this.LJII;
        if (client == null) {
            return;
        }
        client.setBusinessId(str2);
    }

    public final void LJJLIIIJL(Config.MixStreamConfig mixStreamConfig) {
        LayoutInfo LLLZI;
        String businessId;
        LJIILLIIL("updateIndependentLayoutMixStreamParams");
        U66 u66 = this.LJIIIZ;
        if (u66 == null || (LLLZI = u66.LLLZI()) == null || (businessId = LLLZI.getBusinessId()) == null || businessId.length() == 0) {
            return;
        }
        LinkMicMixStreamLayoutParam linkMicMixStreamLayoutParam = LinkMicMixStreamLayoutParamSetting.INSTANCE.getLinkMicMixStreamLayoutParam(businessId);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("businessId=");
        LIZ.append(businessId);
        LIZ.append(", mixStreamLayoutParam=");
        LIZ.append(linkMicMixStreamLayoutParam);
        LJIILLIIL(X1D.LIZIZ(LIZ));
        if (linkMicMixStreamLayoutParam != null) {
            if (linkMicMixStreamLayoutParam.width > 0 && linkMicMixStreamLayoutParam.height > 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("setVideoSize mixStreamLayoutParam: w=");
                LIZ2.append(linkMicMixStreamLayoutParam.width);
                LIZ2.append(", h=");
                LIZ2.append(linkMicMixStreamLayoutParam.height);
                LJIILLIIL(X1D.LIZIZ(LIZ2));
                mixStreamConfig.setVideoSize(linkMicMixStreamLayoutParam.width, linkMicMixStreamLayoutParam.height);
            } else {
                UBN LJIIL = LJIIL();
                if (LJIIL.LIZ > 0 && LJIIL.LIZIZ > 0) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("setVideoSize defaultVideoSize: w=");
                    LIZ3.append(LJIIL.LIZ);
                    LIZ3.append(", h=");
                    LIZ3.append(LJIIL.LIZIZ);
                    LJIILLIIL(X1D.LIZIZ(LIZ3));
                    mixStreamConfig.setVideoSize(LJIIL.LIZ, LJIIL.LIZIZ);
                }
            }
            int i = linkMicMixStreamLayoutParam.bitRate;
            if (i <= 0) {
                i = LinkMicRtcMixBitrateSetting.INSTANCE.getValue();
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("setVideoBitrate:");
            LIZ4.append(i);
            LJIILLIIL(X1D.LIZIZ(LIZ4));
            mixStreamConfig.setVideoBitrate(i);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        UBN LJIIL2 = LJIIL();
        if (LJIIL2.LIZ > 0 && LJIIL2.LIZIZ > 0) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("setVideoSize defaultVideoSize: w=");
            LIZ5.append(LJIIL2.LIZ);
            LIZ5.append(", h=");
            LIZ5.append(LJIIL2.LIZIZ);
            LJIILLIIL(X1D.LIZIZ(LIZ5));
            mixStreamConfig.setVideoSize(LJIIL2.LIZ, LJIIL2.LIZIZ);
        }
        int value = LinkMicRtcMixBitrateSetting.INSTANCE.getValue();
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("setVideoBitrate:");
        LIZ6.append(value);
        LJIILLIIL(X1D.LIZIZ(LIZ6));
        mixStreamConfig.setVideoBitrate(value);
    }

    public final void LJJLIIIJLLLLLLLZ(m mVar) {
        m mVar2 = new m();
        U66 u66 = this.LJIIIZ;
        m mVar3 = new m();
        if (C1XY.LJIJJ(u66) && u66 != null && u66.getScene() == 4) {
            mVar3.LJJIIZ("task_id", U7V.LJ(u66));
        }
        mVar2.LJJII("rtc_mix_param", mVar3);
        mVar.LJJII("live_rtc_video_param", mVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[Catch: Exception -> 0x00df, TryCatch #0 {Exception -> 0x00df, blocks: (B:19:0x0087, B:21:0x008e, B:22:0x0092, B:24:0x0096, B:27:0x00a0, B:29:0x00aa, B:30:0x00b3, B:32:0x00c1, B:33:0x00c9), top: B:18:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[Catch: Exception -> 0x00df, TryCatch #0 {Exception -> 0x00df, blocks: (B:19:0x0087, B:21:0x008e, B:22:0x0092, B:24:0x0096, B:27:0x00a0, B:29:0x00aa, B:30:0x00b3, B:32:0x00c1, B:33:0x00c9), top: B:18:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b A[Catch: Exception -> 0x0127, TryCatch #1 {Exception -> 0x0127, blocks: (B:36:0x00f8, B:38:0x010b, B:40:0x0111, B:64:0x0117, B:65:0x011e, B:66:0x011f, B:67:0x0126), top: B:35:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011f A[Catch: Exception -> 0x0127, TryCatch #1 {Exception -> 0x0127, blocks: (B:36:0x00f8, B:38:0x010b, B:40:0x0111, B:64:0x0117, B:65:0x011e, B:66:0x011f, B:67:0x0126), top: B:35:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIJ(com.bytedance.android.livesdk.comp.api.linkcore.model.RtcLiveVideoParam r14) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7U.LJJLIIJ(com.bytedance.android.livesdk.comp.api.linkcore.model.RtcLiveVideoParam):void");
    }

    public final void LIZIZ(String waterMarkId, Client.RTCWaterMarkRegion rTCWaterMarkRegion) {
        o.LJIIIZ(waterMarkId, "waterMarkId");
        Client client = this.LJII;
        if (client != null) {
            client.addWaterMarkWithId(waterMarkId, rTCWaterMarkRegion, System.currentTimeMillis() * 1000);
        }
    }

    public final void LIZJ(U66 linker, Room room) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("attach start linker=");
        LIZ.append(linker);
        LIZ.append(" room=");
        LIZ.append(room);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        U9S u9s = this.LJIIIIZZ;
        C76678U7m callback = (C76678U7m) this.LJJJIL.getValue();
        u9s.getClass();
        o.LJIIIZ(callback, "callback");
        u9s.LIZ = callback;
        this.LJIIIZ = linker;
        this.LJIIJ = room;
        C76683U7r k = linker.k();
        C76671U7f c76671U7f = null;
        if (!(k instanceof C76683U7r)) {
            k = null;
        }
        this.LJIIJJI = k;
        if (linker.LLZLLIL() && LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().enable) {
            c76671U7f = new C76671U7f();
            c76671U7f.LIZIZ(new ARunnableS24S0300000_13(c76671U7f, linker, this, 39));
        }
        this.LJJIJLIJ = c76671U7f;
        this.LJJIJ = 0L;
        this.LJJIJIIJI = false;
        this.LJJIJIIJIL = false;
        this.LJJIJL = false;
        this.LJJIJIL = C61878OQg.INSTANCE;
    }

    public final void LJIIIIZZ(String source, boolean z) {
        RTCVideo rtcEngine;
        RTCVideo rtcEngine2;
        U66 u66;
        o.LJIIIZ(source, "source");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableLocalAudio start audioEnable=");
        LIZ.append(z);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        if (!LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().enable && (u66 = this.LJIIIZ) != null) {
            C76762UAs LIZJ = UA9.LIZJ();
            LIZJ.getClass();
            UC0.LJJLIIIIJ(new ARunnableS12S0210000_13(u66, LIZJ, z, 3));
        }
        if (z) {
            LJJIJIIJIL(Boolean.valueOf(!z), "RTC.startAudioCapture", source);
            Client client = this.LJII;
            if (client != null && (rtcEngine2 = client.getRtcEngine()) != null) {
                rtcEngine2.startAudioCapture();
                return;
            }
            return;
        }
        LJJIJIIJIL(true, "RTC.stopAudioCapture", source);
        Client client2 = this.LJII;
        if (client2 == null || (rtcEngine = client2.getRtcEngine()) == null) {
            return;
        }
        rtcEngine.stopAudioCapture();
    }

    public final void LJIIJJI(C78862UxG c78862UxG, String str) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("externalTurnOff start scene=");
        U66 u66 = this.LJIIIZ;
        if (u66 != null) {
            num = Integer.valueOf(u66.getScene());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(" cert=");
        LIZ.append(c78862UxG);
        LIZ.append(", source=");
        LIZ.append(str);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        LJJLIIIJILLIZJL(c78862UxG, str);
    }

    public final boolean LJJIFFI(U66 u66, String str) {
        Long l;
        if (!LJJIIJ()) {
            if (!LJJIIJ()) {
                LinkUser LJJJJL = u66.LLZZ().LJJJJL(str);
                Long l2 = null;
                if (LJJJJL != null) {
                    l = LJJJJL.getUserId();
                } else {
                    l = null;
                }
                Room room = this.LJIIJ;
                if (room != null) {
                    l2 = Long.valueOf(room.getOwnerUserId());
                }
                if (o.LJ(l, l2)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void LJJIJL(String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("muteAllRemoteAudioStreams start mute=");
        LIZ.append(z);
        LIZ.append(" source=");
        LIZ.append(str);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        U66 u66 = this.LJIIIZ;
        if (u66 != null) {
            String selfLinkMicId = u66.LLZL().getLinkMicId();
            o.LJIIIZ(selfLinkMicId, "selfLinkMicId");
            UC0.LJJLIIIIJ(new ARunnableS4S1110000_13(u66, selfLinkMicId, z, 0));
        }
        LJJIJIIJIL(Boolean.valueOf(z), "LiveCore.muteAllRemoteAudioStreams", str);
        Client client = this.LJII;
        if (client != null) {
            client.muteAllRemoteAudioStreams(z);
        }
    }

    public final void LJJIJLIJ(String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("muteAllRemoteVideoStreams start mute=");
        LIZ.append(z);
        LIZ.append(" source=");
        LIZ.append(str);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        LJJIJIIJIL(Boolean.valueOf(z), "LiveCore.muteAllRemoteVideoStreams", str);
        Client client = this.LJII;
        if (client != null) {
            client.muteAllRemoteVideoStreams(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIL(String source, boolean z) {
        U66 u66;
        String str;
        o.LJIIIZ(source, "source");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("muteLocalAudio start, source = ");
        LIZ.append(source);
        LIZ.append(" audioMute=");
        LIZ.append(z);
        LIZ.append(" source=");
        LIZ.append(source);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        U66 u662 = this.LJIIIZ;
        if (u662 != null) {
            C76762UAs LIZJ = UA9.LIZJ();
            LIZJ.getClass();
            UC0.LJJLIIIIJ(new ARunnableS2S1210000_13(u662, LIZJ, z, source, 1));
        }
        LJJIJIIJIL(Boolean.valueOf(z), "LiveCore.muteLocalAudio", source);
        Client client = this.LJII;
        if (client != null) {
            client.muteLocalAudio(z);
        }
        if (!LinkMicStateSetting.INSTANCE.enableRTCSend()) {
            return;
        }
        U66 u663 = this.LJIIIZ;
        if ((u663 != null && u663.getScene() == 2) || (u66 = this.LJIIIZ) == null) {
            return;
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        LinkLayerRTCMessage linkLayerRTCMessage = new LinkLayerRTCMessage(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
        linkLayerRTCMessage.generateId();
        linkLayerRTCMessage.setMethod("linkMicSDKAudioMute");
        int i = 0;
        LinkLayerRTCMessageParam linkLayerRTCMessageParam = new LinkLayerRTCMessageParam(null, i, i, 0 == true ? 1 : 0, 0 == true ? 1 : 0, true, 31, 0 == true ? 1 : 0);
        LinkUser LJIJI = u66.LLZZ().LJIJI(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        if (LJIJI == null || (str = LJIJI.getLinkMicId()) == null) {
            str = "";
        }
        int i2 = 0;
        linkLayerRTCMessageParam.getUsers().add(new LinkLayerRTCMessageUser(str, i2, z ? 1 : 0, i2, 10, defaultConstructorMarker));
        linkLayerRTCMessage.setParam(linkLayerRTCMessageParam);
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, linkLayerRTCMessage);
        o.LJIIIIZZ(json, "get().toJson(cmd)");
        LJJJJZ(json);
    }

    public final void LJJJI(boolean z, boolean z2) {
        if (z2) {
            U66 u66 = this.LJIIIZ;
            if (u66 != null) {
                UA9.LJJIIJZLJL(u66, z);
            }
            if (LinkMicAudioModeOptGuestSetting.INSTANCE.isEnable()) {
                LJJLIIIJ(z);
            }
            Client client = this.LJII;
            if (client != null) {
                client.muteLocalVideo(z);
                return;
            }
            return;
        }
        int audioStrategy = LinkmicAudioModeOptAnchorSetting.INSTANCE.getAudioStrategy();
        if (audioStrategy != 1) {
            if (audioStrategy != 2) {
                return;
            }
            U66 u662 = this.LJIIIZ;
            if (u662 != null) {
                UA9.LJJIIJZLJL(u662, z);
            }
            LJJLIIIJ(z);
            Client client2 = this.LJII;
            if (client2 == null) {
                return;
            }
            client2.muteLocalVideo(z);
            return;
        }
        U66 u663 = this.LJIIIZ;
        if (u663 != null) {
            UA9.LJJIIJZLJL(u663, z);
        }
        LJJLIIIJ(z);
    }

    public final void LJJJJZI(String linkMicId, String str) {
        U66 u66;
        o.LJIIIZ(linkMicId, "linkMicId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendUserMessage start linkMicId=");
        LIZ.append(linkMicId);
        LIZ.append(" msg=");
        LIZ.append(str);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        U66 u662 = this.LJIIIZ;
        if ((u662 != null && u662.LIZIZ() == 4) || ((u66 = this.LJIIIZ) != null && u66.LIZIZ() == 5)) {
            U78.LIZ(this.LJIIIZ, linkMicId, str, "send");
            Client client = this.LJII;
            if (client != null) {
                client.sendUserMessage(linkMicId, str);
                return;
            }
            return;
        }
        U4R.LIZLLL("RtcManager", "sendUserMessage mLinker?.getLinkMicState() != LinkMicState.JOINED_CHANNEL &&\n            mLinker?.getLinkMicState() != LinkMicState.FRAME_LINKED");
    }

    public final void LJJJLIIL(String str, ImageModel imageModel) {
        float f;
        UC7.LJ("setGaussBlurForMuteBg source=", str, "RtcManager");
        if (imageModel == null) {
            return;
        }
        OSZ<Integer, Integer> osz = this.LJJIFFI;
        float f2 = 0.0f;
        if (osz != null) {
            f = osz.getFirst().intValue();
        } else {
            f = 0.0f;
        }
        OSZ<Integer, Integer> osz2 = this.LJJIFFI;
        if (osz2 != null) {
            f2 = osz2.getSecond().intValue();
        }
        ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).EM(imageModel, new C31609Car(f, f2, new AqS168S0100000_2(new AqS66S1100000_13(this, str, 5), 31)));
    }

    public final void LJJLIIIJILLIZJL(C78862UxG c78862UxG, String source) {
        ILiveStream iLiveStream;
        ILiveStream liveCore;
        LiveCore liveCore2;
        o.LJIIIZ(source, "source");
        this.LJJIIZ = source;
        this.LJIILL = false;
        UB9 ub9 = this.LJIJ;
        if (ub9 != null) {
            iLiveStream = ub9.getLiveCore();
        } else {
            iLiveStream = null;
        }
        if ((iLiveStream instanceof LiveCore) && (liveCore2 = (LiveCore) iLiveStream) != null) {
            LJJJJLI(liveCore2);
        }
        UB9 ub92 = this.LJIJ;
        if (ub92 != null && (liveCore = ub92.getLiveCore()) != null) {
            C29306Beo.LJJJ(new AqS158S0200000_11(this, liveCore, 22));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("turnOffEngine start cert=");
        LIZ.append(c78862UxG);
        LIZ.append(" source=");
        LIZ.append(source);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        if (this.LJ) {
            U4R.LIZLLL("RtcManager", "turnOffEngine mIsTurningOffEngine == true");
            return;
        }
        this.LJ = true;
        Client client = this.LJII;
        if (client != null) {
            client.stop(c78862UxG);
            C76671U7f c76671U7f = this.LJJIJLIJ;
            if (c76671U7f != null) {
                c76671U7f.LIZIZ(new ARunnableS49S0100000_13(c76671U7f, 269));
            }
            Client client2 = this.LJII;
            if (client2 != null) {
                client2.dispose();
            }
            LIZLLL(true);
            C76129TuH.LIZJ = 4;
            U66 u66 = this.LJIIIZ;
            if (u66 != null) {
                UA9.LJJIZ(u66, source);
                u66.LLLZIIL().LJIJ(u66, source);
            }
            if (LinkmicSdkRtcRoomManagerFixSetting.INSTANCE.isOpt()) {
                U84.LIZ(2);
                U84.LIZJ = null;
            }
            this.LJII = null;
            if (LiveRtcManagerTurnOffSetting.INSTANCE.getValue()) {
                LJJJJ = false;
            }
        } else {
            this.LJ = false;
            LJJJJ = false;
            this.LIZIZ = false;
        }
        this.LIZJ = false;
        this.LJJIJ = 0L;
        this.LJJIJIIJI = false;
        this.LJJIJIIJIL = false;
        this.LJJIJL = false;
        this.LJJIJIL = C61878OQg.INSTANCE;
    }

    public final void LJJLIIIJJI(String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateAudioState:");
        LIZ.append(str);
        LIZ.append(" mute:");
        LIZ.append(z);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        this.LJIL.put(str, Boolean.valueOf(z));
    }

    public final void LJJIJIIJIL(Boolean bool, String str, String str2) {
        StringBuilder LIZLLL = C06540Nm.LIZLLL("monitorAudioApiCall apiName:", str, " source:", str2, " mute:");
        LIZLLL.append(bool);
        LIZLLL.append(" extMsg:");
        LIZLLL.append((String) null);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZLLL));
        U66 u66 = this.LJIIIZ;
        if (u66 != null) {
            UA9.LJIIJ(u66, str, str2, bool, null);
        }
    }

    public final void LJJJ(String linkMicId, String str, boolean z) {
        o.LJIIIZ(linkMicId, "linkMicId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("muteRemoteAudioStream start interactId=");
        LIZ.append(linkMicId);
        LIZ.append(" mute=");
        LIZ.append(z);
        LIZ.append(" source=");
        LIZ.append(str);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        LJJIJIIJIL(Boolean.valueOf(z), "LiveCore.muteRemoteAudioStream", str);
        Client client = this.LJII;
        if (client != null) {
            client.muteRemoteAudioStream(linkMicId, z);
        }
        this.LJIL.put(linkMicId, Boolean.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x032b, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(X.U66 r12, java.lang.String r13, com.bytedance.android.livesdk.comp.api.linkcore.model.RTCClientData r14, boolean r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 1735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7U.LJIJ(X.U66, java.lang.String, com.bytedance.android.livesdk.comp.api.linkcore.model.RTCClientData, boolean, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIZ(boolean z, ImageModel imageModel, String source, boolean z2, boolean z3) {
        U66 u66;
        String str;
        RtcUserInfo LLZL;
        String linkMicId;
        o.LJIIIZ(source, "source");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("muteLocal Video start videoMute=");
        LIZ.append(z);
        LIZ.append(" source=");
        LIZ.append(source);
        LIZ.append("  isGuest = ");
        LIZ.append(z2);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        U66 u662 = this.LJIIIZ;
        if (u662 != null) {
            C76762UAs LIZJ = UA9.LIZJ();
            LIZJ.getClass();
            UC0.LJJLIIIIJ(new ARunnableS2S1210000_13(u662, LIZJ, z, source, 2));
        }
        U66 u663 = this.LJIIIZ;
        if (u663 != null && (LLZL = u663.LLZL()) != null && (linkMicId = LLZL.getLinkMicId()) != null) {
            this.LJIJJLI.put(linkMicId, Boolean.valueOf(z));
        }
        if (LinkMicAudioModeSetting.INSTANCE.getValue().pushStreamCompatibleEnable) {
            if (LJ()) {
                LJJJI(z, z2);
            } else {
                LJJJI(false, z2);
            }
        }
        if (z3 && LinkMicStateSetting.INSTANCE.enableRTCSend() && (u66 = this.LJIIIZ) != null) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            LinkLayerRTCMessage linkLayerRTCMessage = new LinkLayerRTCMessage(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
            linkLayerRTCMessage.generateId();
            linkLayerRTCMessage.setMethod("linkMicSDKVideoMute");
            int i = 0;
            int i2 = 0;
            LinkLayerRTCMessageParam linkLayerRTCMessageParam = new LinkLayerRTCMessageParam(0 == true ? 1 : 0, i, i, 0 == true ? 1 : 0, 0 == true ? 1 : 0, true, 31, 0 == true ? 1 : 0);
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            ArrayList<LinkLayerRTCMessageUser> users = linkLayerRTCMessageParam.getUsers();
            LinkUser LJIJI = u66.LLZZ().LJIJI(currentUserId);
            if (LJIJI == null || (str = LJIJI.getLinkMicId()) == null) {
                str = "";
            }
            users.add(new LinkLayerRTCMessageUser(str, i2, i2, z ? 1 : 0, 6, defaultConstructorMarker));
            linkLayerRTCMessage.setParam(linkLayerRTCMessageParam);
            String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, linkLayerRTCMessage);
            o.LJIIIIZZ(json, "get().toJson(cmd)");
            LJJJJZ(json);
        }
        this.LJJIIJZLJL = new OSZ<>(imageModel, Boolean.valueOf(z));
        if (MultiGuestAndroidGaussBlurOptSetting.INSTANCE.isOptGaussBlur() && z) {
            LJJJLIIL(source, imageModel);
        }
    }

    public final void LJIJI(U66 u66, String str, String str2, InterfaceC88472Yns interfaceC88472Yns, boolean z, boolean z2, boolean z3, boolean z4) {
        InterfaceC92693kP LJJJLIIL = AbstractC73672Svk.LJJIJIL(1).LJJJ(C73969T1h.LIZIZ()).LJJIJL(new IDhS106S0100000_13(this, 18)).LJJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJJJLIIL(new AfS0S2340000_13(this, u66, interfaceC88472Yns, str, z, str2, z2, z3, z4, 2), new AfS65S0100000_13(this, 262));
        C73318Sq2 compositeDisposable = this.LJIJI;
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        compositeDisposable.LIZ(LJJJLIIL);
    }

    public static void LJIIZILJ(U7U u7u, U66 linker, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, InterfaceC88472Yns interfaceC88472Yns, int i) {
        C73643SvH rtcAbInfo;
        String l;
        boolean z5 = z;
        boolean z6 = z3;
        boolean z7 = z4;
        boolean z8 = z2;
        InterfaceC88472Yns interfaceC88472Yns2 = interfaceC88472Yns;
        if ((i & 4) != 0) {
            z5 = true;
        }
        if ((i & 8) != 0) {
            z8 = true;
        }
        if ((i & 16) != 0) {
            z6 = false;
        }
        if ((i & 32) != 0) {
            z7 = false;
        }
        Long l2 = null;
        if ((i & 128) != 0) {
            interfaceC88472Yns2 = null;
        }
        u7u.getClass();
        o.LJIIIZ(linker, "linker");
        int LIZIZ = linker.LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initRtc start scene = ");
        LIZ.append(linker.getScene());
        LIZ.append(" isRtcLocked: ");
        C1FL.LJFF(LIZ, LJJJJ, ", state: ", LIZIZ, ", mIsInitialized: ");
        LIZ.append(u7u.LIZIZ);
        LIZ.append(", background: ");
        LIZ.append(u7u.LJIJJ);
        LIZ.append(",rtcInfo: ");
        LIZ.append(str);
        LIZ.append(", autoJoinRtc:");
        C76965UIn.LIZJ(LIZ, z5, ", pushStreamAdvance:", z8, ", muteAllRemote: ");
        C76965UIn.LIZJ(LIZ, z6, ",muteLocalAudio:", z7, ", source:");
        LIZ.append(str2);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        if (u7u.LJIJJ && !u7u.LJIILJJIL) {
            u7u.LJJJIL(LinkCoreError.Companion.getRTC_INIT_BACKGROUND());
            U4R.LIZLLL("RtcManager", "initRtc inBackground && !initInBackground");
            if (interfaceC88472Yns2 != null) {
                interfaceC88472Yns2.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (u7u.LIZIZ || LIZIZ == 3 || LIZIZ == 4 || LIZIZ == 5) {
            U4R.LIZLLL("RtcManager", "initRtc mIsInitialized || state == LinkMicState.JOINING_CHANNEL || state == LinkMicState.JOINED_CHANNEL ||\n            state == LinkMicState.FRAME_LINKED");
            if (interfaceC88472Yns2 == null) {
                return;
            }
            interfaceC88472Yns2.invoke(Boolean.FALSE);
            return;
        }
        if (LJJJJ) {
            U4R.LIZLLL("RtcManager", "initRtc isRtcLocked");
            u7u.LJJJIL(LinkCoreError.Companion.getRTC_INITIALIZED_BY_ONE_CHANNEL());
            if (interfaceC88472Yns2 == null) {
                return;
            }
            interfaceC88472Yns2.invoke(Boolean.FALSE);
            return;
        }
        u7u.LIZJ = true;
        if (MultiGuestRtcAbSwitcherSetting.INSTANCE.isEnable() && !LinkmicSdkMockChannelAbTestSetting.INSTANCE.isEnable()) {
            U66 u66 = u7u.LJIIIZ;
            if (u66 != null && (l = Long.valueOf(u66.LJJLI()).toString()) != null && C76680U7o.LIZ.get(l) != null) {
                u7u.LJIJI(linker, str, str2, interfaceC88472Yns2, z8, z5, z7, z6);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("already has rtc params for channelId:");
                U66 u662 = u7u.LJIIIZ;
                if (u662 != null) {
                    l2 = Long.valueOf(u662.LJJLI());
                }
                LIZ2.append(l2);
                LIZ2.append(", so do not request");
                C0NB.LJ("RtcManager", X1D.LIZIZ(LIZ2));
                return;
            }
            MGetABInfosReq mGetABInfosReq = new MGetABInfosReq();
            List<String> list = mGetABInfosReq.cdidList;
            U66 u663 = u7u.LJIIIZ;
            if (u663 != null) {
                l2 = Long.valueOf(u663.LJJLI());
            }
            list.add(String.valueOf(l2));
            U66 u664 = u7u.LJIIIZ;
            if (u664 == null || (rtcAbInfo = u664.getRtcAbInfo(mGetABInfosReq)) == null) {
                return;
            }
            InterfaceC92693kP LJJII = rtcAbInfo.LJFF(new C62705OjF()).LJJII(new AfS0S2340000_13(u7u, linker, interfaceC88472Yns2, str, z8, str2, z5, z7, z6, 0), new AfS0S2340000_13(u7u, linker, interfaceC88472Yns2, str, z8, str2, z5, z7, z6, 1));
            C73318Sq2 compositeDisposable = u7u.LJIJI;
            o.LJIIIZ(compositeDisposable, "compositeDisposable");
            compositeDisposable.LIZ(LJJII);
            return;
        }
        u7u.LJIJI(linker, str, str2, interfaceC88472Yns2, z8, z5, z7, z6);
    }
}
