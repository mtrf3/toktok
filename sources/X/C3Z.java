package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.StreamDefinitionLevelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C3Z implements InterfaceC12620eY {
    public static volatile CKO LIZJ;
    public static Context LIZLLL;
    public static Room LJ;
    public static boolean LJFF;
    public static String LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static final C3Z LIZ = new C3Z();
    public static final String LIZIZ = "LiveCoreAsyncUtil";
    public static final int[][] LJIIIZ = {new int[]{200, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, 800, 1}, new int[]{200, 800, LinkMicRtcMixBitrateSetting.DEFAULT, 3}};

    public static final void LIZLLL() {
        LIZLLL = null;
        LIZJ = null;
        LJ = null;
        LJFF = false;
        LJI = null;
        LJIIIIZZ = false;
    }

    public final synchronized CKO LIZIZ() {
        return LIZJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cd, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d0, code lost:
    
        r2.LJJII = r0;
        r2.LJJI = r9.gopSec;
        r2.LJJIFFI = r9.enableBFrame;
        r2.LJJIII = r12;
        r12 = X.EnumC31814CeA.INST;
        r13 = r12.getROIResPath();
        r2.LJJIIJ = r17;
        r2.LJJIIJZLJL = r13;
        r2.LJJIIZ = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f1, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.broadcast.LiveUseNewAudioCodecSetting.INSTANCE.enable() == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f3, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f6, code lost:
    
        r2.LJIILLIIL = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f8, code lost:
    
        if (r1 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01fa, code lost:
    
        r0 = r1.authenticationValue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01fc, code lost:
    
        if (r0 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0200, code lost:
    
        r2.LJJJI = r0;
        r2.LJIILJJIL = com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxEnterBackgroundTimeSetting.INSTANCE.getValue();
        r2.LJIJ = r16;
        r2.LJIJI = 5;
        r1 = com.bytedance.android.livesdk.livesetting.watchlive.TestEnableEffectSetting.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0218, code lost:
    
        if (r1.disable() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0220, code lost:
    
        r2.LJJIJIL = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0226, code lost:
    
        if (r1.disable() == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0228, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0230, code lost:
    
        r2.LJJIJL = r0;
        r2.LJJIL = 720;
        r2.LJJIZ = 1280;
        r2.LJJIJLIJ = com.bytedance.android.livesdk.livesetting.broadcast.LiveUseEffectAlgorithmAbSetting.INSTANCE.enable();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0248, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3FpsSetting.INSTANCE.isEnable() == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024c, code lost:
    
        if (X.C30922CBq.LIZIZ == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0251, code lost:
    
        r2.LJJJIL = r0;
        r2.LJJJJ = com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableScopeMonitorAbSetting.INSTANCE.enable();
        r2.LJJJJI = com.bytedance.android.livesdk.livesetting.broadcast.LiveLogFilterSwitchAbSetting.INSTANCE.enablePrintLog();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0269, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeFpsAnchorSetting.INSTANCE.isEnable() == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x026b, code lost:
    
        r0 = true;
        r2.LJIIIIZZ = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x026e, code lost:
    
        r2.LJJJJJ = r10;
        r2.LJJJJJL = r3;
        r2.LJJJJL = r0;
        r2.LJJJJLI = r0;
        r2.LJJIIZI = r11;
        r1 = r2.LIZ();
        r0 = r9.enableByteVC1;
        X.C29697Bl7.LJIIIZ = r4;
        X.C29697Bl7.LJIIJ = r6;
        X.C29697Bl7.LJIIJJI = r5;
        X.C29697Bl7.LJIIL = r0;
        X.C29697Bl7.LJIILIIL = r8;
        X.C29697Bl7.LJIILJJIL = r7;
        r2 = new X.CKO(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0295, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.broadcast.PushStreamSupportDnsSetting.INSTANCE.isEnable() == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0297, code lost:
    
        r0 = X.C7N.LJIJ().SN();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x029f, code lost:
    
        if (r0 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a1, code lost:
    
        r1 = r0.LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a5, code lost:
    
        if (r1 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a7, code lost:
    
        r0 = r2.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02a9, code lost:
    
        if (r0 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ab, code lost:
    
        r0.setDns(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02ae, code lost:
    
        X.C3Z.LIZJ = r2;
        r0 = X.C3Z.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02b6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b3, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0250, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x022a, code lost:
    
        r0 = r12.getResourceFinder(X.C3Z.LIZLLL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x021c, code lost:
    
        r0 = r12.getModelFilePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01fe, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01f5, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01cf, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01c9, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01cb, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0157, code lost:
    
        if (r1 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0159, code lost:
    
        r0 = r1.getStreamUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x015d, code lost:
    
        if (r0 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x015f, code lost:
    
        r11 = r0.pushSdkParams;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0161, code lost:
    
        if (r11 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0163, code lost:
    
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x013d, code lost:
    
        if (r0.intValue() != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x013f, code lost:
    
        r16 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0133, code lost:
    
        r0 = "1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0136, code lost:
    
        r0 = com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x00f9, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x008e, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0090, code lost:
    
        r8 = r9.hardwareEncode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x006a, code lost:
    
        if (r1 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0070, code lost:
    
        if (r9 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0072, code lost:
    
        r9 = new com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0077, code lost:
    
        X.C3Z.LIZ.getClass();
        r11 = LIZ(r9);
        r0 = com.bytedance.android.livesdk.livesetting.broadcast.StreamHardwareEncodeSetting.INSTANCE.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0088, code lost:
    
        if (r0 <= 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008a, code lost:
    
        if (r0 != 2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008c, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0092, code lost:
    
        r7 = r9.LIZJ();
        r15 = r9.LIZ();
        r2 = com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamSizeSetting.INSTANCE.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a1, code lost:
    
        if (r2.length != 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
    
        r7 = r2[0];
        r15 = r2[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a7, code lost:
    
        r6 = r11[0];
        r5 = r11[1];
        r4 = r11[2];
        r14 = r11[3];
        r2 = java.lang.Integer.valueOf(com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamProfileSetting.INSTANCE.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00be, code lost:
    
        if (r2.intValue() <= 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c0, code lost:
    
        r14 = r2.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c4, code lost:
    
        r2 = com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamBitrateSetting.INSTANCE.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cb, code lost:
    
        if (r2.length != 3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        r5 = r2[0];
        r6 = r2[1];
        r4 = r2[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d4, code lost:
    
        r13 = com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamBitrateAdaptSetting.INSTANCE.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00da, code lost:
    
        if (r13 >= 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dc, code lost:
    
        r13 = r9.bitrateAdaptStrategy;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00de, code lost:
    
        r12 = r9.isRoi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e6, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamHwRoiSetting.INSTANCE.enable() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e8, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e9, code lost:
    
        r17 = r9.isSwRoi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f3, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamSwRoiSetting.INSTANCE.enable() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f5, code lost:
    
        r0 = 2;
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fa, code lost:
    
        r3 = new X.OSZ[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fe, code lost:
    
        if (r8 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0100, code lost:
    
        r0 = "1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0102, code lost:
    
        r3[0] = new X.OSZ("hardware", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010e, code lost:
    
        if (r9.enableByteVC1 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0110, code lost:
    
        r0 = "2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0112, code lost:
    
        r3[1] = new X.OSZ("video_codec", r0);
        X.B4U.LIZ().LJJIFFI("stream", X.C113554cx.LJJJLZIJ(r3));
        r0 = X.InterfaceC30442Bx8.LJIIIZ.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0130, code lost:
    
        if (r0 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0142, code lost:
    
        r16 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0146, code lost:
    
        if (X.C3Z.LJFF == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0148, code lost:
    
        r16 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0150, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamEnableSdkParamsSetting.INSTANCE.enable() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0152, code lost:
    
        if (r19 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0154, code lost:
    
        r11 = X.C3Z.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0165, code lost:
    
        r2 = com.bytedance.android.livesdk.livesetting.broadcast.PauseOptSetting.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x016b, code lost:
    
        if (r2.getValue() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x016d, code lost:
    
        r10 = com.bytedance.android.livesdk.livesetting.broadcast.PauseOptPushFpsSetting.INSTANCE.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0177, code lost:
    
        if (r2.getValue() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0179, code lost:
    
        r3 = com.bytedance.android.livesdk.livesetting.broadcast.PauseOptDisableEffectSetting.INSTANCE.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017f, code lost:
    
        r2 = new X.C14080gu(X.C3Z.LIZLLL);
        r2.LIZJ = 0;
        r2.LJIIIZ = r7;
        r2.LJIIJ = r15;
        r2.LJ = r6;
        r2.LIZLLL = r5;
        r2.LJFF = r4;
        r2.LJIIL = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0197, code lost:
    
        if (r9.fps != 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0199, code lost:
    
        r9.fps = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x019d, code lost:
    
        r2.LJI = r9.fps;
        r2.LJIIJJI = r8;
        r2.LJJ = X.C7N.LJIJ().v70();
        r2.LJJIJ = new X.C30730C4g();
        r2.LJIJJLI = new X.C63078OpG();
        r2.LJJIJIIJI = new X.C5ML();
        r2.LJIL = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c6, code lost:
    
        if (r9.enableByteVC1 == false) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.CKO LIZJ() {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Z.LIZJ():X.CKO");
    }

    public static int[] LIZ(StreamUrlExtra streamUrlExtra) {
        int value = StreamDefinitionLevelSetting.INSTANCE.getValue();
        if (1 <= value && value <= LJIIIZ.length) {
            return LJIIIZ[value - 1];
        }
        int[] iArr = new int[4];
        if (streamUrlExtra.minBitrate == 0) {
            streamUrlExtra.minBitrate = 200;
        }
        iArr[0] = streamUrlExtra.minBitrate;
        if (streamUrlExtra.defaultBitrate == 0) {
            streamUrlExtra.defaultBitrate = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        }
        iArr[1] = streamUrlExtra.defaultBitrate;
        iArr[2] = streamUrlExtra.LIZIZ();
        iArr[3] = streamUrlExtra.profile;
        return iArr;
    }

    public static void LJ(Room room) {
        LiveCore liveCore;
        LiveCore.Builder builder;
        o.LJIIIZ(room, "room");
        LJ = room;
        CKO cko = LIZJ;
        if (cko == null || (liveCore = cko.LJ) == null || (builder = liveCore.getBuilder()) == null) {
            return;
        }
        builder.setLiveAuthString(room.authenticationValue);
    }
}
