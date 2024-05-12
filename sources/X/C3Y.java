package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableScopeMonitorAbSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLogFilterSwitchAbSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxEnterBackgroundTimeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamBitrateAdaptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamBitrateSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamEnableSdkParamsSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamHwRoiSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamProfileSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamSwRoiSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveUseEffectAlgorithmAbSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveUseNewAudioCodecSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.PushStreamSupportDnsSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.StreamDefinitionLevelSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.StreamHardwareEncodeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeFpsAnchorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3FpsSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestEnableEffectSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestEnableLiveCoreSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C3Y {
    public static final C3Y LIZ = new C3Y();
    public static final int[][] LIZIZ = {new int[]{200, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, 800, 1}, new int[]{200, 800, LinkMicRtcMixBitrateSetting.DEFAULT, 3}};
    public static volatile CKO LIZJ;
    public static Context LIZLLL;
    public static Room LJ;

    public final synchronized CKO LIZ() {
        return LIZIZ();
    }

    public static CKO LIZIZ() {
        boolean z;
        int[] iArr;
        boolean z2;
        String str;
        String str2;
        int i;
        int i2;
        String modelFilePath;
        Object resourceFinder;
        boolean z3;
        InterfaceC30713C3p SN;
        VDR LIZJ2;
        LiveCore liveCore;
        StreamUrl streamUrl;
        if (TestEnableLiveCoreSetting.INSTANCE.disable()) {
            C0NB.LJ("VoiceChatLiveCoreAsyncUtil", "TestEnableLiveCoreSetting is disable just return null liveStream");
            return null;
        }
        if (LIZJ != null) {
            return LIZJ;
        }
        if (LIZLLL == null) {
            C0NB.LJ("VoiceChatLiveCoreAsyncUtil", "context is null, just return null liveStream");
            return null;
        }
        Room room = LJ;
        if (room == null) {
            C0NB.LJ("VoiceChatLiveCoreAsyncUtil", "room is null, just return null liveStream");
            return null;
        }
        StreamUrlExtra streamUrlExtraSafely = room.getStreamUrlExtraSafely();
        o.LJIIIIZZ(streamUrlExtraSafely, "room.streamUrlExtraSafely");
        int value = StreamDefinitionLevelSetting.INSTANCE.getValue();
        if (1 <= value && value <= LIZIZ.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iArr = LIZIZ[value - 1];
        } else {
            iArr = new int[4];
            if (streamUrlExtraSafely.minBitrate == 0) {
                streamUrlExtraSafely.minBitrate = 200;
            }
            iArr[0] = streamUrlExtraSafely.minBitrate;
            if (streamUrlExtraSafely.defaultBitrate == 0) {
                streamUrlExtraSafely.defaultBitrate = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
            }
            iArr[1] = streamUrlExtraSafely.defaultBitrate;
            iArr[2] = streamUrlExtraSafely.LIZIZ();
            iArr[3] = streamUrlExtraSafely.profile;
        }
        int value2 = StreamHardwareEncodeSetting.INSTANCE.getValue();
        if (value2 > 0) {
            if (value2 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = streamUrlExtraSafely.hardwareEncode;
        }
        int LIZJ3 = streamUrlExtraSafely.LIZJ();
        int LIZ2 = streamUrlExtraSafely.LIZ();
        int[] value3 = LiveStreamSizeSetting.INSTANCE.getValue();
        if (value3.length == 2) {
            LIZJ3 = value3[0];
            LIZ2 = value3[1];
        }
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        Integer valueOf = Integer.valueOf(LiveStreamProfileSetting.INSTANCE.getValue());
        if (valueOf.intValue() > 0) {
            i6 = valueOf.intValue();
        }
        int[] value4 = LiveStreamBitrateSetting.INSTANCE.getValue();
        if (value4.length == 3) {
            i4 = value4[0];
            i3 = value4[1];
            i5 = value4[2];
        }
        int value5 = LiveStreamBitrateAdaptSetting.INSTANCE.getValue();
        if (value5 < 0) {
            value5 = streamUrlExtraSafely.bitrateAdaptStrategy;
        }
        boolean z4 = streamUrlExtraSafely.isRoi;
        if (LiveStreamHwRoiSetting.INSTANCE.enable()) {
            z4 = true;
        }
        boolean z5 = streamUrlExtraSafely.isSwRoi;
        if (LiveStreamSwRoiSetting.INSTANCE.enable()) {
            z5 = true;
        }
        OSZ[] oszArr = new OSZ[2];
        String str3 = "1";
        if (z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[0] = new OSZ("hardware", str);
        if (streamUrlExtraSafely.enableByteVC1) {
            str3 = "2";
        }
        oszArr[1] = new OSZ("video_codec", str3);
        B4U.LIZ().LJJIFFI("stream", C113554cx.LJJJLZIJ(oszArr));
        String str4 = "";
        if (!LiveStreamEnableSdkParamsSetting.INSTANCE.enable() || (streamUrl = room.getStreamUrl()) == null || (str2 = streamUrl.pushSdkParams) == null) {
            str2 = "";
        }
        C14080gu c14080gu = new C14080gu(LIZLLL);
        c14080gu.LIZJ = 0;
        c14080gu.LJIIIZ = LIZJ3;
        c14080gu.LJIIJ = LIZ2;
        c14080gu.LJ = i3;
        c14080gu.LIZLLL = i4;
        c14080gu.LJFF = i5;
        c14080gu.LJIIL = i6;
        if (streamUrlExtraSafely.fps == 0) {
            streamUrlExtraSafely.fps = 15;
        }
        c14080gu.LJI = streamUrlExtraSafely.fps;
        c14080gu.LJIIJJI = z2;
        c14080gu.LJJ = C7N.LJIJ().v70();
        c14080gu.LJJIJ = new C30730C4g();
        c14080gu.LJIJJLI = new C63078OpG();
        c14080gu.LJJIJIIJI = new C5ML();
        c14080gu.LJIL = value5;
        if (streamUrlExtraSafely.enableByteVC1) {
            i = 2;
        } else {
            i = 1;
        }
        c14080gu.LJJII = i;
        c14080gu.LJJI = streamUrlExtraSafely.gopSec;
        c14080gu.LJJIFFI = streamUrlExtraSafely.enableBFrame;
        c14080gu.LJJIII = z4;
        EnumC31814CeA enumC31814CeA = EnumC31814CeA.INST;
        String rOIResPath = enumC31814CeA.getROIResPath();
        c14080gu.LJJIIJ = z5;
        c14080gu.LJJIIJZLJL = rOIResPath;
        c14080gu.LJJIIZ = true;
        if (LiveUseNewAudioCodecSetting.INSTANCE.enable()) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        c14080gu.LJIILLIIL = i2;
        String str5 = room.authenticationValue;
        if (str5 != null) {
            str4 = str5;
        }
        c14080gu.LJJJI = str4;
        c14080gu.LJIILJJIL = LiveMaxEnterBackgroundTimeSetting.INSTANCE.getValue();
        c14080gu.LJIJ = 5;
        c14080gu.LJIJI = 5;
        TestEnableEffectSetting testEnableEffectSetting = TestEnableEffectSetting.INSTANCE;
        if (testEnableEffectSetting.disable()) {
            modelFilePath = null;
        } else {
            modelFilePath = enumC31814CeA.getModelFilePath();
        }
        c14080gu.LJJIJIL = modelFilePath;
        if (testEnableEffectSetting.disable()) {
            resourceFinder = null;
        } else {
            resourceFinder = enumC31814CeA.getResourceFinder(LIZLLL);
        }
        c14080gu.LJJIJL = resourceFinder;
        c14080gu.LJJIL = 720;
        c14080gu.LJJIZ = 1280;
        c14080gu.LJJIJLIJ = LiveUseEffectAlgorithmAbSetting.INSTANCE.enable();
        if (MultiGuestV3FpsSetting.INSTANCE.isEnable() && C30922CBq.LIZIZ) {
            z3 = true;
        } else {
            z3 = false;
        }
        c14080gu.LJJJIL = z3;
        c14080gu.LJJJJ = LiveEnableScopeMonitorAbSetting.INSTANCE.enable();
        c14080gu.LJJJJI = LiveLogFilterSwitchAbSetting.INSTANCE.enablePrintLog();
        if (MultiGuestV3ChangeFpsAnchorSetting.INSTANCE.isEnable()) {
            c14080gu.LJIIIIZZ = 1;
        }
        c14080gu.LJJIIZI = str2;
        C14090gv LIZ3 = c14080gu.LIZ();
        boolean z6 = streamUrlExtraSafely.enableByteVC1;
        C29697Bl7.LJIIIZ = i5;
        C29697Bl7.LJIIJ = i3;
        C29697Bl7.LJIIJJI = i4;
        C29697Bl7.LJIIL = z6;
        C29697Bl7.LJIILIIL = z2;
        C29697Bl7.LJIILJJIL = LIZJ3;
        CKO cko = new CKO(LIZ3);
        if (PushStreamSupportDnsSetting.INSTANCE.isEnable() && (SN = C7N.LJIJ().SN()) != null && (LIZJ2 = SN.LIZJ()) != null && (liveCore = cko.LJ) != null) {
            liveCore.setDns(LIZJ2);
        }
        LIZJ = cko;
        C0NB.LIZIZ("VoiceChatLiveCoreAsyncUtil", "return not null liveStream");
        return LIZJ;
    }
}
