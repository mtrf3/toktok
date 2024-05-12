package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.wallet.model.recharge.RecommendStrategyParam;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.StrArray;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PictureCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifySegmentInfo;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifyUsedInfo;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.now.interaction.api.Interaction;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.V4k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C79146V4k implements InterfaceC83246Wlm {
    public static volatile boolean LIZ = false;
    public static volatile long LIZIZ = 0;
    public static Gson LIZJ = null;
    public static String LIZLLL = "";
    public static String LJ = "";

    public static final float LJJJJLI(float f, float f2, float f3) {
        return (f3 * f2) + ((1 - f3) * f);
    }

    @Override // X.InterfaceC83246Wlm
    public void LIZ(ComposerBeauty composerBeauty, String selectedCategoryName) {
        o.LJIIIZ(selectedCategoryName, "selectedCategoryName");
    }

    @Override // X.InterfaceC83246Wlm
    public void LIZIZ(String enableBy) {
        o.LJIIIZ(enableBy, "enableBy");
    }

    @Override // X.InterfaceC83246Wlm
    public void LIZJ(String selectedCategoryName) {
        o.LJIIIZ(selectedCategoryName, "selectedCategoryName");
    }

    @Override // X.InterfaceC83246Wlm
    public void LIZLLL(ComposerBeauty composerBeauty) {
    }

    @Override // X.InterfaceC83246Wlm
    public void LJ(ComposerBeauty composerBeauty, String selectedCategoryName) {
        o.LJIIIZ(selectedCategoryName, "selectedCategoryName");
    }

    @Override // X.InterfaceC83246Wlm
    public void LJFF(BeautyCategory beautyCategory) {
    }

    @Override // X.InterfaceC83246Wlm
    public void LJI(BeautifyUsedInfo beautifyUsedInfo) {
    }

    @Override // X.InterfaceC83246Wlm
    public void LJII(boolean z) {
    }

    @Override // X.InterfaceC83246Wlm
    public void LJIIIIZZ(String str) {
    }

    @Override // X.InterfaceC83246Wlm
    public void LJIIIZ(ComposerBeauty composerBeauty) {
    }

    @Override // X.InterfaceC83246Wlm
    public void LJIIJ(BeautifySegmentInfo beautifySegmentInfo) {
    }

    @Override // X.InterfaceC83246Wlm
    public void LJIIJJI(String str, String selectedCategoryName) {
        o.LJIIIZ(selectedCategoryName, "selectedCategoryName");
    }

    public void LJIIZILJ() {
    }

    public static C84673XKz LJIILIIL() {
        return new C84673XKz(null);
    }

    public static Gson LJJIIZ() {
        if (LIZJ == null) {
            LIZJ = new Gson();
        }
        return LIZJ;
    }

    public static String LJJIJ() {
        ConnectivityManager connectivityManager;
        try {
            Context context = C09590Zf.LJIILLIIL.LIZ;
            if (context == null || (connectivityManager = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity")) == null) {
                return "unknown";
            }
            NetworkInfo LJJLI = C16880lQ.LJJLI(connectivityManager);
            if (LJJLI != null && LJJLI.getType() == 1) {
                return "wifi";
            }
            TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone");
            if (telephonyManager == null) {
                return "unknown";
            }
            try {
                String str = new String(Base64.decode("YW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=", 0));
                C47261Igj.LJIILJJIL("hasBase64Permission");
                if (C04330Ez.LIZ(context, str) == 0) {
                    switch (LJIIL(telephonyManager)) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            return "2G";
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return "3G";
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                            return "4G";
                        default:
                            return "unknown";
                    }
                }
            } catch (Exception unused) {
            }
            return "unknown";
        } catch (Exception unused2) {
            return "unknown";
        }
    }

    public static List LJJIJIIJIL() {
        SensorManager sensorManager;
        Context context = C09590Zf.LJIILLIIL.LIZ;
        if (context == null || (sensorManager = (SensorManager) C16880lQ.LLILL(context, "sensor")) == null) {
            return null;
        }
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {-1};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Ljava/util/List;", "8316560003693130983");
        C39519Ff9 LIZJ2 = c03880Dg.LIZJ(100702, "android/hardware/SensorManager", "getSensorList", sensorManager, objArr, "java.util.List", c65300Pk0);
        if (LIZJ2.LIZ) {
            c03880Dg.LIZIZ(100702, "android/hardware/SensorManager", "getSensorList", null, objArr, sensorManager, c65300Pk0, false);
            return (List) LIZJ2.LIZIZ;
        }
        List<Sensor> sensorList = sensorManager.getSensorList(-1);
        c03880Dg.LIZIZ(100702, "android/hardware/SensorManager", "getSensorList", sensorList, objArr, sensorManager, c65300Pk0, true);
        return sensorList;
    }

    public static boolean LJJJJIZL() {
        if (C46982IcE.LIZIZ() == null) {
            return false;
        }
        return C46982IcE.LIZIZ().isDebug();
    }

    public /* synthetic */ C79146V4k() {
    }

    public static int LJIIL(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (!C48001Isf.LIZ.getAndSet(true)) {
                C48001Isf.LIZ().LIZIZ();
            }
            int LIZ2 = C48001Isf.LIZ().LIZ();
            if (!C48001Isf.LIZJ && LIZ2 == -1) {
                return 0;
            }
            return LIZ2;
        }
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()I", "8316560003693130983");
        C39519Ff9 LIZJ2 = c03880Dg.LIZJ(102013, "android/telephony/TelephonyManager", "getNetworkType", telephonyManager, objArr, "int", c65300Pk0);
        if (LIZJ2.LIZ) {
            c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", null, objArr, telephonyManager, c65300Pk0, false);
            return ((Integer) LIZJ2.LIZIZ).intValue();
        }
        int networkType = telephonyManager.getNetworkType();
        c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", Integer.valueOf(networkType), objArr, telephonyManager, c65300Pk0, true);
        return networkType;
    }

    public static void LJIJJ(MBA mba) {
        InterfaceC79150V4o interfaceC79150V4o = (InterfaceC79150V4o) mba.get(InterfaceC79150V4o.LJJJJJ);
        if (interfaceC79150V4o == null) {
            return;
        }
        Iterator<InterfaceC79150V4o> it = interfaceC79150V4o.LIZ().iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(null);
        }
    }

    public static final void LJJIIJ(MBA mba) {
        InterfaceC79150V4o interfaceC79150V4o = (InterfaceC79150V4o) mba.get(InterfaceC79150V4o.LJJJJJ);
        if (interfaceC79150V4o == null || interfaceC79150V4o.isActive()) {
        } else {
            throw interfaceC79150V4o.LJJIIJ();
        }
    }

    public static final String LJJIIZI(ModelInfo getMD5) {
        o.LJIIJ(getMD5, "$this$getMD5");
        ExtendedUrlModel file_url = getMD5.getFile_url();
        if (file_url != null) {
            return file_url.getUri();
        }
        return null;
    }

    public static final String LJJIJIIJI(VESize vESize) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(vESize.width);
        LIZ2.append('x');
        LIZ2.append(vESize.height);
        return X1D.LIZIZ(LIZ2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0028, code lost:
    
        if (r1.getTotal() > 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJJIJIL(com.ss.android.ugc.aweme.profile.model.User r4) {
        /*
            r3 = 1
            if (r4 == 0) goto L40
            java.lang.String r0 = r4.getRelationShip()
            if (r0 == 0) goto L10
            int r1 = r0.length()
            if (r1 <= 0) goto L10
        Lf:
            return r0
        L10:
            com.ss.android.ugc.aweme.friends.model.MutualStruct r1 = r4.getMutualStruct()
            if (r1 == 0) goto L40
            java.util.List r0 = r1.getUserList()
            if (r0 == 0) goto L22
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2d
        L22:
            if (r1 == 0) goto L40
            int r0 = r1.getTotal()
            if (r0 <= 0) goto L2d
        L2a:
            java.lang.String r0 = "Mutual connections"
            goto Lf
        L2d:
            if (r1 == 0) goto L40
            int r0 = r1.isMutualTagHidden()
            if (r0 != r3) goto L36
            goto L2a
        L36:
            int r0 = r1.getMutualType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 != 0) goto L43
        L40:
            java.lang.String r0 = ""
            goto Lf
        L43:
            int r0 = r2.intValue()
            if (r0 != r3) goto L4c
            java.lang.String r0 = "Friends with"
            goto Lf
        L4c:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L56
            java.lang.String r0 = "Followed by"
            goto Lf
        L56:
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L40
            java.lang.String r0 = "Follows"
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79146V4k.LJJIJIL(com.ss.android.ugc.aweme.profile.model.User):java.lang.String");
    }

    public static final void LJJIJLIJ(View view) {
        if (view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }

    public static final float[] LJJIL(float[] m) {
        o.LJIIIZ(m, "m");
        float f = m[0];
        float f2 = m[3];
        float f3 = m[6];
        float f4 = m[1];
        float f5 = m[4];
        float f6 = m[7];
        float f7 = m[2];
        float f8 = m[5];
        float f9 = m[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = f3 * f12;
        float f14 = f13 + (f2 * f11) + (f * f10);
        float[] fArr = new float[m.length];
        fArr[0] = f10 / f14;
        fArr[1] = f11 / f14;
        fArr[2] = f12 / f14;
        fArr[3] = ((f3 * f8) - (f2 * f9)) / f14;
        fArr[4] = ((f9 * f) - (f3 * f7)) / f14;
        fArr[5] = ((f7 * f2) - (f8 * f)) / f14;
        fArr[6] = ((f2 * f6) - (f3 * f5)) / f14;
        fArr[7] = ((f3 * f4) - (f6 * f)) / f14;
        fArr[8] = ((f * f5) - (f2 * f4)) / f14;
        return fArr;
    }

    public static final boolean LJJJ(MBA mba) {
        InterfaceC79150V4o interfaceC79150V4o = (InterfaceC79150V4o) mba.get(InterfaceC79150V4o.LJJJJJ);
        if (interfaceC79150V4o == null || !interfaceC79150V4o.isActive()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJI(DataChannel dataChannel) {
        Boolean bool;
        UserAttr userAttr;
        User user;
        UserAttr userAttr2;
        if (dataChannel != null && (user = (User) dataChannel.kv0(RoomUserChannel.class)) != null && (userAttr2 = user.getUserAttr()) != null) {
            return userAttr2.isAdmin;
        }
        User LIZIZ2 = C05200Ii.LIZIZ();
        if (LIZIZ2 != null && (userAttr = LIZIZ2.getUserAttr()) != null) {
            bool = Boolean.valueOf(userAttr.isAdmin);
        } else {
            bool = null;
        }
        return C29306Beo.LJJIFFI(bool);
    }

    public static final boolean LJJJIL(Diamond diamond) {
        o.LJIIIZ(diamond, "<this>");
        if (diamond.iapId == null && diamond.count == 0) {
            return true;
        }
        return false;
    }

    public static boolean LJJJJ(String str) {
        if ("homepage_hot".equalsIgnoreCase(str) || "homepage_follow".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJI(Aweme aweme) {
        boolean z;
        List<String> geofencingRegions = aweme.getGeofencingRegions();
        if (geofencingRegions == null || geofencingRegions.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final boolean LJJJJJ(Aweme aweme) {
        if (aweme.isPhotoMode()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJJL(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo != null) {
            return commerceVideoAuthInfo.isPreventSelfSee();
        }
        return false;
    }

    public static final void LJJJJLL(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("downgrade_sticker_preview_resolution_tag ");
        LIZ2.append(str);
        H7B.LJ(X1D.LIZIZ(LIZ2));
    }

    public static final VEPreviewSettings LJJLIIIIJ(InterfaceC83927Wwl recorderContext) {
        VEDisplaySettings LJIJJ;
        o.LJIIIZ(recorderContext, "recorderContext");
        VEPreviewSettings.Builder builder = new VEPreviewSettings.Builder();
        builder.enableAudioRecord(recorderContext.F());
        builder.optFirstFrame(true);
        if (recorderContext.LLLIZZ() && recorderContext.LLLI() != 0) {
            builder.enablePreloadEffectRes(true);
            builder.disableEffectInternalSetting(false);
            builder.setEffectAlgorithmRequirement(recorderContext.LLLI());
        } else {
            builder.disableEffectInternalSetting(true);
        }
        builder.blockRenderExit(true);
        builder.setAsyncDetection(recorderContext.LLLZL());
        int[] LJIILIIL = recorderContext.LJJJJJL().LJIILIIL();
        if (LJIILIIL.length == 2) {
            builder.setRenderSize(new VESize(LJIILIIL[0], LJIILIIL[1]));
        }
        if (recorderContext.LLJJJJJIL() && (LJIJJ = recorderContext.LJJJJJL().LJIJJ()) != null) {
            builder.setDisplaySettings(LJIJJ);
        }
        builder.enable3buffer(recorderContext.LLL());
        builder.optFirstFrame(!recorderContext.LLLLZI().LIZIZ());
        builder.enableCheckStatusWhenStopPreview(true);
        if (recorderContext.LLJL().invoke().booleanValue()) {
            builder.enableDestroyEffectInStopPreview(true);
            builder.enableEffectAmazingEngine(false);
            builder.enable2DEngineEffect(false);
        }
        if (recorderContext.LJJL()) {
            builder.setGraphMode(EnumC46477ILx.QR_CODE_GRAPH);
        }
        builder.firstNFrameIntervalsAverageCnt(recorderContext.LLJLILLLLZIIL());
        builder.setDisEnableEffectWhenNoUsed(recorderContext.LLZILL().invoke().booleanValue());
        VEPreviewSettings build = builder.build();
        o.LJIIIIZZ(build, "VEPreviewSettings\n      …tUse())\n        }.build()");
        return build;
    }

    public static final VEVideoEncodeSettings LJJLIIIJ(InterfaceC83927Wwl recorderContext) {
        VEVideoEncodeSettings.ENCODE_PROFILE encode_profile;
        o.LJIIIZ(recorderContext, "recorderContext");
        C87278YNe c87278YNe = new C87278YNe(1);
        String LIZ2 = recorderContext.LLLLZI().LIZ();
        String LJIIIIZZ = recorderContext.LLLLZI().LJIIIIZZ();
        if (LIZ2.length() > 0) {
            LJIIIIZZ.length();
        }
        c87278YNe.LIZIZ.isSupportHWEncoder = recorderContext.LJJJJIZL().LIZJ();
        c87278YNe.LIZIZ.rotate = recorderContext.LJIJ();
        OSZ<Integer, Integer> h = recorderContext.h();
        float f = 1024;
        int LIZIZ2 = (int) (recorderContext.LJJJJIZL().LIZIZ() * f * f);
        VEVideoEncodeSettings vEVideoEncodeSettings = c87278YNe.LIZIZ;
        vEVideoEncodeSettings.bitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        vEVideoEncodeSettings.bps = LIZIZ2;
        C83964WxM c83964WxM = C83964WxM.LIZ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("downgrade_sticker_preview_resolution_tag -> setBps: bitrate = ");
        LIZ3.append(recorderContext.LJJJJIZL().LIZIZ());
        c83964WxM.LIZJ(X1D.LIZIZ(LIZ3));
        EnumC83605WrZ toVEEncodeProfile = recorderContext.LJJJJIZL().LJI();
        o.LJIIIZ(toVEEncodeProfile, "$this$toVEEncodeProfile");
        int i = C83604WrY.LIZ[toVEEncodeProfile.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        encode_profile = VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_HIGH;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    encode_profile = VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_MAIN;
                }
            } else {
                encode_profile = VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE;
            }
        } else {
            encode_profile = VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN;
        }
        c87278YNe.LJI(encode_profile);
        int LIZLLL2 = recorderContext.LJJJJIZL().LIZLLL();
        VEVideoEncodeSettings vEVideoEncodeSettings2 = c87278YNe.LIZIZ;
        vEVideoEncodeSettings2.bitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP;
        vEVideoEncodeSettings2.swQP = LIZLLL2;
        int intValue = h.getFirst().intValue();
        int intValue2 = h.getSecond().intValue();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("setVideoRes:  width = ");
        LIZ4.append(intValue);
        LIZ4.append("  height = ");
        LIZ4.append(intValue2);
        LIZ4.append(' ');
        c83964WxM.LIZJ(X1D.LIZIZ(LIZ4));
        c87278YNe.LJIIJ(intValue, intValue2);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(intValue);
        LIZ5.append('x');
        LIZ5.append(intValue2);
        String content = X1D.LIZIZ(LIZ5);
        o.LJIIIZ(content, "content");
        c87278YNe.LIZIZ.mOptRemuxWithCopy = recorderContext.LJJJJIZL().LJ();
        c87278YNe.LIZIZ.mDescription = recorderContext.LJJJJIZL().LJFF();
        c87278YNe.LIZIZ.mRecordingMp4 = recorderContext.LJLIIL();
        VEVideoEncodeSettings LIZ6 = c87278YNe.LIZ();
        o.LJIIIIZZ(LIZ6, "VEVideoEncodeSettings\n  …ingMp4)\n        }.build()");
        return LIZ6;
    }

    public static String LJJLIIIJILLIZJL(String str) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            String hexString = Integer.toHexString((((((fileInputStream.read() << 8) ^ fileInputStream.read()) << 8) ^ fileInputStream.read()) << 8) ^ fileInputStream.read());
            try {
                fileInputStream.close();
            } catch (IOException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            return hexString;
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            C16880lQ.LLLLIIL(e);
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                    return "";
                } catch (IOException e4) {
                    C16880lQ.LLLLIIL(e4);
                    return "";
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e5) {
                    C16880lQ.LLLLIIL(e5);
                }
            }
            throw th;
        }
    }

    public static void LJJLIIIJJI(String str) {
        File[] listFiles;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                LJJLIIIJJI(file2.getPath());
            } else {
                C16880lQ.LLLZZIL(file2);
            }
        }
        C16880lQ.LLLZZIL(file);
    }

    public static final PictureCardTemplate LJJLIIIJL(V41 v41) {
        ImageComponent LIZ2;
        ImageComponent LIZ3;
        PictureCardFallbackInfoComponent pictureCardFallbackInfoComponent;
        ActionLinkComponent LIZ4;
        PreviewHintComponent LIZ5;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        ImageComponent LIZ6;
        TextComponent LIZ7;
        ActionLinkComponent LIZ8;
        C79135V3z c79135V3z = v41.image;
        if (c79135V3z != null) {
            LIZ2 = C79081V1x.LJJIZ(c79135V3z);
        } else {
            ImageComponent.Companion.getClass();
            LIZ2 = C79095V2l.LIZ();
        }
        C79135V3z c79135V3z2 = v41.thumbnail;
        if (c79135V3z2 != null) {
            LIZ3 = C79081V1x.LJJIZ(c79135V3z2);
        } else {
            ImageComponent.Companion.getClass();
            LIZ3 = C79095V2l.LIZ();
        }
        V4V v4v = v41.fallback;
        if (v4v != null) {
            C79135V3z c79135V3z3 = v4v.image;
            if (c79135V3z3 != null) {
                LIZ6 = C79081V1x.LJJIZ(c79135V3z3);
            } else {
                ImageComponent.Companion.getClass();
                LIZ6 = C79095V2l.LIZ();
            }
            RUF ruf = v4v.text;
            if (ruf == null || (LIZ7 = C17N.LJJL(ruf)) == null) {
                TextComponent.Companion.getClass();
                LIZ7 = C79109V2z.LIZ();
            }
            C63714OzW c63714OzW = v4v.link_info;
            if (c63714OzW != null) {
                LIZ8 = C62814Ol0.LJJIIZI(c63714OzW);
            } else {
                ActionLinkComponent.Companion.getClass();
                LIZ8 = C63715OzX.LIZ();
            }
            pictureCardFallbackInfoComponent = new PictureCardFallbackInfoComponent(LIZ8, LIZ6, LIZ7);
        } else {
            PictureCardFallbackInfoComponent.Companion.getClass();
            pictureCardFallbackInfoComponent = PictureCardFallbackInfoComponent.EMPTY_FALLBACK;
        }
        C63714OzW c63714OzW2 = v41.link_info;
        if (c63714OzW2 != null) {
            LIZ4 = C62814Ol0.LJJIIZI(c63714OzW2);
        } else {
            ActionLinkComponent.Companion.getClass();
            LIZ4 = C63715OzX.LIZ();
        }
        V4L v4l = v41.preview_hint;
        if (v4l != null) {
            LIZ5 = V2B.LJIIZILJ(v4l);
        } else {
            PreviewHintComponent.Companion.getClass();
            LIZ5 = C79087V2d.LIZ();
        }
        RU2 ru2 = v41.req_base;
        if (ru2 != null) {
            baseRequestComponent = C62819Ol5.LJJIIJZLJL(ru2);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        RUB rub = v41.resp_base;
        if (rub != null) {
            baseResponseComponent = C69648RVc.LIZJ(rub);
        } else {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        }
        return new PictureCardTemplate(LIZ2, LIZ3, pictureCardFallbackInfoComponent, LIZ4, LIZ5, baseRequestComponent, baseResponseComponent);
    }

    public static final void LJJLIIIJLJLI(View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    public static final void LJIILJJIL(int i, List list) {
        int size = list.size();
        if (i >= 0 && i < size) {
        } else {
            throw new IndexOutOfBoundsException(C48690J9a.LJIIJJI("Index ", i, " is out of bounds. The list has ", size, " elements."));
        }
    }

    public static AbstractC13230fX LJIILLIIL(AbstractC13230fX abstractC13230fX, C1RW whitePoint) {
        C1RN c1rn = AbstractC13190fT.LIZIZ;
        o.LJIIIZ(abstractC13230fX, "<this>");
        o.LJIIIZ(whitePoint, "whitePoint");
        if (!C13210fV.LIZ(abstractC13230fX.LIZIZ, C13210fV.LIZ)) {
            return abstractC13230fX;
        }
        C1RU c1ru = (C1RU) abstractC13230fX;
        if (LJJI(c1ru.LIZLLL, whitePoint)) {
            return abstractC13230fX;
        }
        return new C1RU(c1ru.LIZ, c1ru.LJII, whitePoint, LJJJJZ(LJJ(c1rn.LIZ, c1ru.LIZLLL.L(), whitePoint.L()), c1ru.LJIIIIZZ), c1ru.LJIIJ, c1ru.LJIIL, c1ru.LJ, c1ru.LJFF, c1ru.LJI, -1);
    }

    public static final void LJIJ(MBA mba, CancellationException cancellationException) {
        InterfaceC79150V4o interfaceC79150V4o = (InterfaceC79150V4o) mba.get(InterfaceC79150V4o.LJJJJJ);
        if (interfaceC79150V4o == null) {
            return;
        }
        interfaceC79150V4o.LIZIZ(cancellationException);
    }

    public static final Object LJIJI(InterfaceC79150V4o interfaceC79150V4o, InterfaceC67352kd interfaceC67352kd) {
        interfaceC79150V4o.LIZIZ(null);
        Object LJJJJ = interfaceC79150V4o.LJJJJ(interfaceC67352kd);
        if (LJJJJ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJJJJ;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (com.ss.android.vesdk.VEUtils.getAudioFileInfo(r0) != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIL(com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam r5, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6) {
        /*
            java.lang.String r0 = "model"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r4 = 0
            com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService r0 = com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService.LIZIZ(r4)
            boolean r0 = r0.U40()
            if (r0 != 0) goto L18
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r0 = r6.canvasVideoData
            boolean r0 = X.C79004UzY.LJJIJL(r0)
            if (r0 == 0) goto L19
        L18:
            return r4
        L19:
            boolean r0 = r5.getSupportOriginEnhance()
            r2 = 1
            if (r0 != 0) goto L26
            boolean r0 = r5.getSupportMusicEnhance()
            if (r0 == 0) goto L70
        L26:
            r3 = 1
        L27:
            int r0 = X.C5WW.LIZIZ()
            if (r0 == r2) goto L34
            int r1 = X.C5WW.LIZIZ()
            r0 = 3
            if (r1 != r0) goto L18
        L34:
            boolean r0 = r6.mIsFromDraft
            if (r0 == 0) goto L3c
            int r0 = r6.mDraftToEditFrom
            if (r0 == 0) goto Lb1
        L3c:
            boolean r0 = r6.realHasOriginalSound()
            if (r0 == 0) goto L44
        L42:
            r4 = 1
            goto L18
        L44:
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r0 = r6.canvasVideoData
            boolean r0 = X.C79004UzY.LJJJI(r0)
            if (r0 == 0) goto L72
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r0 = r6.canvasVideoData
            boolean r0 = X.C79004UzY.LJIJJLI(r0)
            if (r0 == 0) goto L55
            goto L42
        L55:
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r0 = r6.canvasVideoData
            if (r0 == 0) goto L67
            java.util.List r0 = r0.getSourceInfo()
            if (r0 == 0) goto L67
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L69
        L67:
            java.lang.String r0 = ""
        L69:
            com.ss.android.vesdk.VEUtils$VEAudioFileInfo r0 = com.ss.android.vesdk.VEUtils.getAudioFileInfo(r0)
            if (r0 == 0) goto Lb1
            goto L42
        L70:
            r3 = 0
            goto L27
        L72:
            boolean r0 = r6.isCutSameVideoType()
            if (r0 == 0) goto L79
            goto L18
        L79:
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r0 = r6.getPreviewInfo()
            if (r0 == 0) goto Lb1
            java.util.List r0 = r0.getVideoList()
            if (r0 == 0) goto Lb1
            java.util.Iterator r1 = r0.iterator()
            r4 = r3
        L8a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r0 = (com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r0
            java.lang.String r0 = r0.getVideoPath()
            com.ss.android.vesdk.VEUtils$VEAudioFileInfo r0 = com.ss.android.vesdk.VEUtils.getAudioFileInfo(r0)
            if (r0 == 0) goto L8a
            X.Ol8 r0 = X.C52830KoM.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Laf
            return r2
        Laf:
            r4 = 1
            goto L8a
        Lb1:
            r4 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79146V4k.LJIL(com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static final boolean LJJI(C1RW a, C1RW b) {
        o.LJIIIZ(a, "a");
        o.LJIIIZ(b, "b");
        if (a == b) {
            return true;
        }
        if (Math.abs(a.LJLIL - b.LJLIL) < 0.001f && Math.abs(a.LJLILLLLZI - b.LJLILLLLZI) < 0.001f) {
            return true;
        }
        return false;
    }

    public static final boolean LJJII(int i, Aweme aweme) {
        Video video = aweme.getVideo();
        if (video != null) {
            return AVExternalServiceImpl.LIZ().publishService().shouldDisableDuetOrStitch(video.getVideoLength(), i);
        }
        return false;
    }

    public static final void LJJIII(C8VL c8vl, InterfaceC88472Yns f) {
        o.LJIIIZ(c8vl, "<this>");
        o.LJIIIZ(f, "f");
        C185787Qw c185787Qw = new C185787Qw();
        f.invoke(c185787Qw);
        if (c185787Qw.LJIIJ.length() > 0) {
            c8vl.LJIIIZ.put(c185787Qw.LJIIJ, c185787Qw);
        } else {
            "vSlot should not be empty".toString();
            throw new IllegalStateException("vSlot should not be empty");
        }
    }

    public static final boolean LJJIZ(float[] invertTo, float[] other) {
        boolean z;
        o.LJIIIZ(invertTo, "$this$invertTo");
        o.LJIIIZ(other, "other");
        float f = invertTo[0];
        float f2 = invertTo[1];
        float f3 = invertTo[2];
        float f4 = invertTo[3];
        float f5 = invertTo[4];
        float f6 = invertTo[5];
        float f7 = invertTo[6];
        float f8 = invertTo[7];
        float f9 = invertTo[8];
        float f10 = invertTo[9];
        float f11 = invertTo[10];
        float f12 = invertTo[11];
        float f13 = invertTo[12];
        float f14 = invertTo[13];
        float f15 = invertTo[14];
        float f16 = invertTo[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = f22 * f23;
        float f30 = f29 + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f30 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        float f31 = 1.0f / f30;
        other[0] = C1I1.LIZ(f8, f26, (f6 * f28) - (f7 * f27), f31);
        other[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f31;
        other[2] = C1I1.LIZ(f16, f20, (f14 * f22) - (f15 * f21), f31);
        other[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f31;
        float f32 = -f5;
        other[4] = (((f7 * f25) + (f32 * f28)) - (f8 * f24)) * f31;
        other[5] = C1I1.LIZ(f4, f24, (f28 * f) - (f3 * f25), f31);
        float f33 = -f13;
        other[6] = (((f15 * f19) + (f33 * f22)) - (f16 * f18)) * f31;
        other[7] = C1I1.LIZ(f12, f18, (f22 * f9) - (f11 * f19), f31);
        other[8] = C1I1.LIZ(f8, f23, (f5 * f27) - (f6 * f25), f31);
        other[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f31;
        other[10] = C1I1.LIZ(f16, f17, (f13 * f21) - (f14 * f19), f31);
        other[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f31;
        other[12] = (((f6 * f24) + (f32 * f26)) - (f7 * f23)) * f31;
        other[13] = C1I1.LIZ(f3, f23, (f * f26) - (f2 * f24), f31);
        other[14] = (((f14 * f18) + (f33 * f20)) - (f15 * f17)) * f31;
        other[15] = C1I1.LIZ(f11, f17, (f9 * f20) - (f10 * f18), f31);
        return true;
    }

    public static final float[] LJJJJZ(float[] lhs, float[] rhs) {
        o.LJIIIZ(lhs, "lhs");
        o.LJIIIZ(rhs, "rhs");
        float f = lhs[0] * rhs[0];
        float f2 = lhs[3];
        float f3 = rhs[1];
        float f4 = lhs[6];
        float f5 = rhs[2];
        float f6 = f4 * f5;
        float f7 = lhs[1];
        float f8 = rhs[0];
        float f9 = lhs[4];
        float f10 = (f3 * f9) + (f7 * f8);
        float f11 = lhs[7];
        float f12 = lhs[2] * f8;
        float f13 = lhs[5];
        float f14 = (rhs[1] * f13) + f12;
        float f15 = lhs[8];
        float f16 = lhs[0];
        float f17 = rhs[3] * f16;
        float f18 = rhs[4];
        float f19 = (f2 * f18) + f17;
        float f20 = rhs[5];
        float f21 = lhs[1];
        float f22 = rhs[3];
        float f23 = (f9 * f18) + (f21 * f22);
        float f24 = lhs[2];
        float f25 = f13 * rhs[4];
        float f26 = f20 * f15;
        float f27 = f16 * rhs[6];
        float f28 = lhs[3];
        float f29 = rhs[7];
        float f30 = rhs[8];
        float f31 = rhs[6];
        return new float[]{f6 + (f2 * f3) + f, (f11 * f5) + f10, (f5 * f15) + f14, (f4 * f20) + f19, (f11 * f20) + f23, f26 + f25 + (f22 * f24), (f4 * f30) + (f28 * f29) + f27, (f11 * f30) + (lhs[4] * f29) + (f21 * f31), (f15 * f30) + (lhs[5] * rhs[7]) + (f24 * f31)};
    }

    public static final float[] LJJJJZI(float[] fArr, float[] rhs) {
        o.LJIIIZ(rhs, "rhs");
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        return new float[]{fArr[0] * rhs[0], fArr[1] * rhs[1], fArr[2] * rhs[2], rhs[3] * f, rhs[4] * f2, rhs[5] * f3, f * rhs[6], f2 * rhs[7], f3 * rhs[8]};
    }

    public static final void LJJJLIIL(float[] lhs, float[] rhs) {
        o.LJIIIZ(lhs, "lhs");
        o.LJIIIZ(rhs, "rhs");
        float f = rhs[0];
        float f2 = rhs[1];
        float f3 = rhs[2];
        rhs[0] = (lhs[6] * f3) + (lhs[3] * f2) + (lhs[0] * f);
        rhs[1] = (lhs[7] * f3) + (lhs[4] * f2) + (lhs[1] * f);
        rhs[2] = (lhs[8] * f3) + (lhs[5] * f2) + (lhs[2] * f);
    }

    public static void LJJJZ(String str, JSONObject jSONObject) {
        C66960QPs.LIZ().getClass();
        if (jSONObject != null) {
            try {
                if (!jSONObject.has("passport-sdk-version")) {
                    jSONObject.put("passport-sdk-version", 19);
                }
                jSONObject.put("params_for_special", "uc_login");
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        FMX.LJIILJJIL(str, jSONObject);
    }

    public static void LJJLI(String str, JSONObject jSONObject) {
        try {
            jSONObject.put("passport-sdk-version", 19);
            jSONObject.put("result", 0);
            LJJJZ(str, jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final void LJIILL(int i, int i2, List list) {
        int size = list.size();
        if (i <= i2) {
            if (i >= 0) {
                if (i2 <= size) {
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("toIndex (");
                LIZ2.append(i2);
                LIZ2.append(") is more than than the list size (");
                LIZ2.append(size);
                LIZ2.append(')');
                throw new IndexOutOfBoundsException(X1D.LIZIZ(LIZ2));
            }
            throw new IndexOutOfBoundsException(C0NY.LIZIZ("fromIndex (", i, ") is less than 0."));
        }
        throw new IllegalArgumentException(C48690J9a.LJIIJJI("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", i2, ")."));
    }

    public static final void LJIJJLI(Interaction interaction, String str, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(interaction, "<this>");
        if (o.LJ(interaction.getAwemeId(), str)) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final float[] LJJ(float[] matrix, float[] fArr, float[] fArr2) {
        o.LJIIIZ(matrix, "matrix");
        LJJJLIIL(matrix, fArr);
        LJJJLIIL(matrix, fArr2);
        return LJJJJZ(LJJIL(matrix), LJJJJZI(new float[]{fArr2[0] / fArr[0], fArr2[1] / fArr[1], fArr2[2] / fArr[2]}, matrix));
    }

    public static C13260fa LJJIFFI(final AbstractC13230fX connect, AbstractC13230fX destination, int i) {
        if ((i & 1) != 0) {
            destination = C13240fY.LIZJ;
        }
        int i2 = i & 2;
        o.LJIIIZ(connect, "$this$connect");
        o.LJIIIZ(destination, "destination");
        if (connect == destination) {
            return new C13260fa(connect) { // from class: X.1RQ
                @Override // X.C13260fa
                public final void LIZ(float[] fArr) {
                }

                {
                    super(connect, connect, 1);
                }
            };
        }
        long j = connect.LIZIZ;
        long j2 = C13210fV.LIZ;
        final int i3 = 0;
        if (C13210fV.LIZ(j, j2) && C13210fV.LIZ(destination.LIZIZ, j2)) {
            final C1RU c1ru = (C1RU) connect;
            final C1RU c1ru2 = (C1RU) destination;
            return new C13260fa(c1ru, c1ru2, i3) { // from class: X.1RR
                public final C1RU LJ;
                public final C1RU LJFF;
                public final float[] LJI;

                @Override // X.C13260fa
                public final void LIZ(float[] fArr) {
                    fArr[0] = (float) ((Number) this.LJ.LJIILIIL.invoke(Double.valueOf(fArr[0]))).doubleValue();
                    fArr[1] = (float) ((Number) this.LJ.LJIILIIL.invoke(Double.valueOf(fArr[1]))).doubleValue();
                    fArr[2] = (float) ((Number) this.LJ.LJIILIIL.invoke(Double.valueOf(fArr[2]))).doubleValue();
                    C79146V4k.LJJJLIIL(this.LJI, fArr);
                    fArr[0] = (float) ((Number) this.LJFF.LJIIJJI.invoke(Double.valueOf(fArr[0]))).doubleValue();
                    fArr[1] = (float) ((Number) this.LJFF.LJIIJJI.invoke(Double.valueOf(fArr[1]))).doubleValue();
                    fArr[2] = (float) ((Number) this.LJFF.LJIIJJI.invoke(Double.valueOf(fArr[2]))).doubleValue();
                }

                {
                    super(c1ru, c1ru2, (float[]) null);
                    float[] LJJJJZ;
                    this.LJ = c1ru;
                    this.LJFF = c1ru2;
                    if (C79146V4k.LJJI(c1ru.LIZLLL, c1ru2.LIZLLL)) {
                        LJJJJZ = C79146V4k.LJJJJZ(c1ru2.LJIIIZ, c1ru.LJIIIIZZ);
                    } else {
                        float[] fArr = c1ru.LJIIIIZZ;
                        float[] fArr2 = c1ru2.LJIIIZ;
                        float[] L = c1ru.LIZLLL.L();
                        float[] L2 = c1ru2.LIZLLL.L();
                        C1RW c1rw = c1ru.LIZLLL;
                        C1RW c1rw2 = C13270fb.LIZIZ;
                        if (!C79146V4k.LJJI(c1rw, c1rw2)) {
                            float[] fArr3 = AbstractC13190fT.LIZIZ.LIZ;
                            float[] fArr4 = C13270fb.LJ;
                            float[] copyOf = Arrays.copyOf(fArr4, fArr4.length);
                            o.LJIIIIZZ(copyOf, "copyOf(this, size)");
                            fArr = C79146V4k.LJJJJZ(C79146V4k.LJJ(fArr3, L, copyOf), c1ru.LJIIIIZZ);
                        }
                        if (!C79146V4k.LJJI(c1ru2.LIZLLL, c1rw2)) {
                            float[] fArr5 = AbstractC13190fT.LIZIZ.LIZ;
                            float[] fArr6 = C13270fb.LJ;
                            float[] copyOf2 = Arrays.copyOf(fArr6, fArr6.length);
                            o.LJIIIIZZ(copyOf2, "copyOf(this, size)");
                            fArr2 = C79146V4k.LJJIL(C79146V4k.LJJJJZ(C79146V4k.LJJ(fArr5, L2, copyOf2), c1ru2.LJIIIIZZ));
                        }
                        LJJJJZ = C79146V4k.LJJJJZ(fArr2, i3 == 3 ? C79146V4k.LJJJJZI(new float[]{L[0] / L2[0], L[1] / L2[1], L[2] / L2[2]}, fArr) : fArr);
                    }
                    this.LJI = LJJJJZ;
                }
            };
        }
        return new C13260fa(connect, destination, 0);
    }

    public static final boolean LJJJJL(long j, long j2, TimeZone timeZone) {
        long j3 = j - j2;
        if (j3 < 86400000 && j3 > -86400000) {
            long offset = timeZone.getOffset(j) + j;
            long j4 = 86400000;
            if (offset / j4 == (timeZone.getOffset(j2) + j2) / j4) {
                return true;
            }
        }
        return false;
    }

    public static final void LJJLIIIJJIZ(WPD wpd, StrArray filterIds, FilterBean filterBean) {
        String str;
        InterfaceC82284WRc interfaceC82284WRc;
        o.LJIIIZ(filterIds, "filterIds");
        if (wpd != null && (interfaceC82284WRc = wpd.LJLJJI) != null && interfaceC82284WRc.LIZ()) {
            str = "";
        } else if (filterBean != null) {
            str = String.valueOf(filterBean.getId());
        } else {
            str = null;
        }
        filterIds.add(str);
    }

    public static void LJJJLL(int i, String str, String str2, Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("urlpath", new java.net.URI(str).getPath().toLowerCase());
            if (th == null) {
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("exception_msg", str2);
                }
            } else {
                jSONObject.put("exception_stack_trace", android.util.Log.getStackTraceString(th));
                jSONObject.put("exception_msg", th.getMessage());
            }
            jSONObject.put("errorCode", i);
            jSONObject.put("passport-sdk-version", 19);
            jSONObject.put("sdkVersion", 2);
            LJJJZ("passport_net_err", jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJJL(String str, String str2, String str3, boolean z) {
        String str4;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("logid", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("urlpath", str);
            }
            jSONObject.put("sdkVersion", 2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("extra", str3);
            }
            jSONObject.put("passport-sdk-version", 19);
            if (z) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("user_was_login", str4);
            jSONObject.put("result", 0);
            LJJJZ("tt_token_logout", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final C0Q9 LJJIJL(C0QF c0qf, long j, C0Q9 start, C0Q9 end, C0Q9 startVelocity) {
        o.LJIIIZ(c0qf, "<this>");
        o.LJIIIZ(start, "start");
        o.LJIIIZ(end, "end");
        o.LJIIIZ(startVelocity, "startVelocity");
        return c0qf.LIZLLL(j * 1000000, start, end, startVelocity);
    }

    public static void LJJJLZIJ(String str, String str2, String str3, QQI qqi, QQE qqe) {
        JSONObject jSONObject;
        if (qqe != null) {
            jSONObject = qqe.onSendEvent(str);
        } else {
            jSONObject = null;
        }
        if (qqi != null) {
            String str4 = qqi.LJFF;
            if (TextUtils.isEmpty(str4)) {
                str4 = qqi.LJI;
            }
            if (jSONObject == null) {
                try {
                    jSONObject = new JSONObject();
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            jSONObject.put("logid", qqi.LIZ);
            if (qqi instanceof QQJ) {
                String str5 = ((QQJ) qqi).LJIIIZ;
                if (!TextUtils.isEmpty(str5)) {
                    jSONObject.put("logout_from", str5);
                }
            }
            LJJIIJZLJL(str, qqi.LIZJ, str2, str3, qqi.LIZIZ, qqi.LJ, str4, jSONObject);
            return;
        }
        LJJIIJZLJL(str, null, str2, str3, false, -1, null, jSONObject);
    }

    public /* synthetic */ C79146V4k(String str, int i, long j, long j2, boolean z, RecommendStrategyParam recommendStrategyParam) {
    }

    public static void LJJIIJZLJL(String str, String str2, String str3, String str4, boolean z, int i, String str5, JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        jSONObject.put("platform", str3);
        jSONObject.put(WM7.SCENE_SERVICE, str4);
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("urlpath", str2);
        }
        if (!z) {
            jSONObject.put("result", 0);
            jSONObject.put("errorCode", i);
            if (str5 != null) {
                jSONObject.put("errDesc", str5);
            }
        } else {
            jSONObject.put("result", 1);
        }
        jSONObject.put("passport-sdk-version", 19);
        jSONObject.put("sdkVersion", 2);
        LJJJZ(str, jSONObject);
    }
}
