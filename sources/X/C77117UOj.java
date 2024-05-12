package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy;
import com.ss.android.ugc.aweme.creative.model.AutoCutTitle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.UOj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77117UOj implements InterfaceC37947Eut, InterfaceC75706TnS {
    public static int LJLIL = 1;
    public static boolean LJLILLLLZI;

    public static boolean LJIJI(long j, long j2) {
        return (j & j2) != 0;
    }

    public static boolean LJIJJ(int i) {
        return i == 2;
    }

    public static final String LJJIFFI(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "" : "inbox" : "profile_page" : "fyp_page";
    }

    public static int LJIILIIL() {
        boolean booleanValue;
        try {
            boolean booleanValue2 = ((Boolean) Class.forName("com.ss.android.ugc.aweme.utils.PrivacyPolicyAgreementUtils").getMethod("isUserAgreePrivacyPolicy", new Class[0]).invoke(null, new Object[0])).booleanValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isUserAgreePrivacyPolicy:");
            LIZ.append(booleanValue2);
            TTVideoEngineLog.d("TTVideoEngineUtils", X1D.LIZIZ(LIZ));
            if (!booleanValue2) {
                return 1;
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("get PrivacyPolicy failed:");
            LIZ2.append(e.toString());
            C78253UnR.LIZLLL("TTVideoEngineUtils", X1D.LIZIZ(LIZ2));
        }
        try {
            Class<?> cls = Class.forName("yq4.a");
            try {
                Class<?> cls2 = Class.forName("com.ss.android.ugc.aweme.compliance.api.services.teenmode.ITeenModeService");
                boolean booleanValue3 = ((Boolean) cls2.getMethod("isTeenModeON", new Class[0]).invoke(cls.getMethod("teenModeService", new Class[0]).invoke(null, new Object[0]), new Object[0])).booleanValue();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("isTeenModeOn:");
                LIZ3.append(booleanValue3);
                TTVideoEngineLog.d("TTVideoEngineUtils", X1D.LIZIZ(LIZ3));
                if (booleanValue3) {
                    return 2;
                }
            } catch (Exception e2) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("get teenModeService failed:");
                LIZ4.append(e2.toString());
                C78253UnR.LIZLLL("TTVideoEngineUtils", X1D.LIZIZ(LIZ4));
            }
            try {
                Class<?> cls3 = Class.forName("com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService");
                booleanValue = ((Boolean) cls3.getMethod("isGuestMode", new Class[0]).invoke(cls.getMethod("businessService", new Class[0]).invoke(null, new Object[0]), new Object[0])).booleanValue();
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("isGuestMode:");
                LIZ5.append(booleanValue);
                TTVideoEngineLog.d("TTVideoEngineUtils", X1D.LIZIZ(LIZ5));
            } catch (Exception e3) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("get businessService failed:");
                LIZ6.append(e3.toString());
                C78253UnR.LIZLLL("TTVideoEngineUtils", X1D.LIZIZ(LIZ6));
            }
            if (!booleanValue) {
                return -1;
            }
            return 3;
        } catch (Exception e4) {
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("get ComplianceServiceProvider failed:");
            LIZ7.append(e4.toString());
            C78253UnR.LIZLLL("TTVideoEngineUtils", X1D.LIZIZ(LIZ7));
            return -1;
        }
    }

    public static final void LJJIIJ() {
        BZI LIZ = C28787BRn.LIZ("livesdk_feature_abnormal_toast");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZ.LJIJJ("gifting", "scenario");
        LIZ.LJJIIJZLJL();
    }

    public static String LIZ(String str) {
        if (LJLIL == 1 && !TextUtils.isEmpty(str) && str.startsWith("http://")) {
            C78253UnR.LJI("TTVideoEngineUtils", "fetch api need replace https");
            return str.replaceFirst("http://", "https://");
        }
        return str;
    }

    public static final C73424Srk LJIIJ(AbstractC73672Svk receiver) {
        o.LJIIJ(receiver, "$receiver");
        return new C73424Srk(receiver, C78253UnR.LJLJJI);
    }

    public static String LJIIJJI(String str) {
        char[] charArray = str.toCharArray();
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            j = (j * 31) + charArray[i];
        }
        return String.valueOf(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJIIL(com.bytedance.android.livesdk.model.FeedBanner r5) {
        /*
            java.lang.String r4 = "activityId"
            java.lang.String r3 = ""
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = r5.schemaUrl     // Catch: java.lang.Exception -> L37
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r4)     // Catch: java.lang.Exception -> L37
            if (r2 != 0) goto L16
            r2 = r3
        L16:
            java.lang.String r0 = "url"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L37
            if (r0 != 0) goto L1f
            return r2
        L1f:
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r0, r4)     // Catch: java.lang.Exception -> L37
            if (r1 == 0) goto L32
            int r0 = r1.length()     // Catch: java.lang.Exception -> L37
            if (r0 != 0) goto L30
            goto L32
        L30:
            r0 = 0
            goto L33
        L32:
            r0 = 1
        L33:
            if (r0 == 0) goto L36
            return r2
        L36:
            return r1
        L37:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77117UOj.LJIIL(com.bytedance.android.livesdk.model.FeedBanner):java.lang.String");
    }

    public static int LJIILJJIL(Effect effect) {
        if (effect.getTags().contains("weather")) {
            return 2;
        }
        if (effect.getTags().contains("time")) {
            return 3;
        }
        if (effect.getTags().contains("date")) {
            return 4;
        }
        if (LJIJ(effect)) {
            return 5;
        }
        return 1;
    }

    public static void LJIIZILJ(Throwable th) {
        LJIILLIIL("default_handle", th);
    }

    public static boolean LJIJ(Effect effect) {
        return effect.getTags().contains("UploadImageSticker");
    }

    public static boolean LJIJJLI(Effect effect) {
        return effect.getTags().contains("qa");
    }

    public static final HeaderBannerDaInfo LJJII(ProductPackStruct productPackStruct) {
        int i;
        String str = "";
        int i2 = 0;
        if (productPackStruct == null) {
            C78983UzD.LJIILL("the user right da info is null");
            return new HeaderBannerDaInfo(0, "");
        }
        List<ProductBannerLabel> list = productPackStruct.productBannerLabel;
        if (list != null) {
            i = list.size();
            for (ProductBannerLabel productBannerLabel : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append(productBannerLabel.eventTrackingName);
                    str = X1D.LIZIZ(LIZ);
                    if (i2 < i - 1) {
                        str = C42398GkU.LIZIZ(str, ',');
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        return new HeaderBannerDaInfo(i, str);
    }

    public static final EnumC75338ThW LJJIII(int i) {
        MultiGuestV3GuestMonitoringTipsSetting multiGuestV3GuestMonitoringTipsSetting = MultiGuestV3GuestMonitoringTipsSetting.INSTANCE;
        List<Integer> badLevelList = multiGuestV3GuestMonitoringTipsSetting.getBadLevelList();
        List<Integer> veryBadLevelList = multiGuestV3GuestMonitoringTipsSetting.getVeryBadLevelList();
        List<Integer> hiddenLevelList = multiGuestV3GuestMonitoringTipsSetting.getHiddenLevelList();
        if (badLevelList.contains(Integer.valueOf(i))) {
            return EnumC75338ThW.BAD;
        }
        if (veryBadLevelList.contains(Integer.valueOf(i))) {
            return EnumC75338ThW.VERY_BAD;
        }
        if (hiddenLevelList.contains(Integer.valueOf(i))) {
            return EnumC75338ThW.GOOD;
        }
        return EnumC75338ThW.UNKNOWN;
    }

    @Override // X.InterfaceC37947Eut
    public void LIZIZ(InterfaceC60761Nsz interfaceC60761Nsz) {
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("invoke_bridge_unregister", 1) == 1) {
            String containerID = interfaceC60761Nsz.getHybridContext().containerId;
            F2O.LIZ.getClass();
            o.LJIIIZ(containerID, "containerID");
            ((ConcurrentHashMap) F2O.LIZJ.getValue()).remove(containerID);
        }
    }

    @Override // X.InterfaceC75706TnS
    public void LJFF(OFV ofv) {
        B5G.LIZIZ().LJJJ = new C75648TmW("connection_list");
        C75650TmY.LJII(EnumC75673Tmv.LINKING);
    }

    public static void LIZJ(Object obj, ArrayList arrayList) {
        if (arrayList != null && arrayList.size() < 100) {
            arrayList.add(obj);
        }
    }

    public static final void LJIIIIZZ(C145995oB c145995oB, Integer num) {
        o.LJIIIZ(c145995oB, "<this>");
        if (num != null) {
            num.intValue();
            c145995oB.LIZ(num.intValue(), "autocut_speed_variation_type");
        }
    }

    public static final void LJIIIZ(C8VL c8vl, String str) {
        java.util.Map<String, C8VL> map;
        o.LJIIIZ(c8vl, "<this>");
        C8VL c8vl2 = c8vl.LJIIIZ.get(str);
        if (c8vl2 == null || (map = c8vl2.LJIIIZ) == null || map.isEmpty()) {
            c8vl.LJIIIZ.remove(str);
        }
    }

    public static DateFormat LJIILL(int i, int i2) {
        String str;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = "M/d/yy";
                    } else {
                        throw new IllegalArgumentException(KMP.LJ("Unknown DateFormat style: ", i));
                    }
                } else {
                    str = "MMM d, yyyy";
                }
            } else {
                str = "MMMM d, yyyy";
            }
        } else {
            str = "EEEE, MMMM d, yyyy";
        }
        LIZ.append(str);
        LIZ.append(" ");
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    str2 = "h:mm a";
                } else {
                    throw new IllegalArgumentException(KMP.LJ("Unknown DateFormat style: ", i2));
                }
            } else {
                str2 = "h:mm:ss a";
            }
        } else {
            str2 = "h:mm:ss a z";
        }
        LIZ.append(str2);
        return new SimpleDateFormat(X1D.LIZIZ(LIZ), Locale.US);
    }

    public static void LJIILLIIL(String str, Throwable th) {
        HashMap hashMap = new HashMap();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        hashMap.put("error_error_msg", stringWriter.toString());
        hashMap.put("error_desc", str);
        C40048Fng.LIZIZ(null, "internal_error", hashMap, null);
        HybridMultiMonitor.getInstance().getExceptionHandler();
    }

    public static String LJJ(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                if (str2.length() > i) {
                    sb.append(str2.charAt(i));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    @Override // X.InterfaceC75706TnS
    public void LIZLLL(C76003TsF c76003TsF, Throwable th) {
        C75650TmY.LJII(EnumC75673Tmv.WAITING);
        C75877TqD.LJIILLIIL = "normal";
        if (th != null) {
            BPP.LJ(C15380j0.LIZLLL(), th);
            C75516TkO.LIZ.LIZIZ(702, "reply multi_cohost invitation failed", th, null);
        }
    }

    @Override // X.InterfaceC37947Eut
    public void LJ(Context context, InterfaceC60761Nsz kitView) {
        IBulletHostProxy iBulletHostProxy;
        List<InterfaceC38186Eyk> LJIIJ;
        HashMap<Class<?>, HashMap<String, Class<?>>> LJIIIIZZ;
        HashMap<Class<?>, HashMap<String, Class<?>>> LJI;
        o.LJIIIZ(kitView, "kitView");
        C37942Euo c37942Euo = (C37942Euo) kitView.getHybridContext().LIZIZ(C37942Euo.class);
        if (c37942Euo != null && kitView.LIZJ() != null) {
            boolean z = kitView.getHybridContext().jsbOptimizeV2;
            F2O.LIZ.getClass();
            String str = kitView.getHybridContext().containerId;
            F3T LJIJJ = F0G.LJIJJ(kitView, c37942Euo);
            ((ConcurrentHashMap) F2O.LIZJ.getValue()).put(str, LJIJJ);
            kitView.getHybridContext().LJII(F3T.class, LJIJJ);
            F2N.LIZIZ();
            if (C37905EuD.LJIIIIZZ == null) {
                Boolean bool = Boolean.TRUE;
                if (bool != null) {
                    C37936Eui.LJII.put("jsb_tt_bridge_factory_manager_null", bool);
                }
                F2N.LIZ();
            }
            C70657RoD c70657RoD = C37905EuD.LJIIIIZZ;
            if (c70657RoD != null) {
                C37936Eui.LJII.put("jsb_tt_register_ibridge", c70657RoD);
            }
            C70657RoD c70657RoD2 = C37905EuD.LJIIIIZZ;
            if (c70657RoD2 != null) {
                AtomicBoolean atomicBoolean = F2E.LIZ;
                Boolean valueOf = Boolean.valueOf(atomicBoolean.get());
                if (valueOf != null) {
                    C37936Eui.LJII.put("jsb_tt_xbridge_classes", valueOf);
                }
                boolean LJ = C19N.LJ("jsb_spark_init_optimize", false);
                if (LJ && (C86291Xtn.LJIIL == null || !atomicBoolean.get())) {
                    C86290Xtm.LIZ();
                    F2E.LIZ();
                    Boolean bool2 = Boolean.TRUE;
                    if (bool2 != null) {
                        C37936Eui.LJII.put("jsb_tt_init_optimize_settings_2", bool2);
                    }
                }
                Integer num = null;
                if (LJ) {
                    IBulletHostProxy iBulletHostProxy2 = F2O.LIZIZ;
                    if (iBulletHostProxy2 != null && (LJI = iBulletHostProxy2.LJI()) != null) {
                        HashMap<String, Class<?>> hashMap = LJI.get(InterfaceC37774Es6.class);
                        if (hashMap != null) {
                            num = Integer.valueOf(hashMap.size());
                        }
                        C37936Eui.LJII.put("jsb_tt_init_only_xbridge_classes_size", String.valueOf(num));
                        ((F0V) c70657RoD2).LJJIIZ(LJI);
                    }
                } else {
                    IBulletHostProxy iBulletHostProxy3 = F2O.LIZIZ;
                    if (iBulletHostProxy3 != null && (LJIIIIZZ = iBulletHostProxy3.LJIIIIZZ()) != null) {
                        HashMap<String, Class<?>> hashMap2 = LJIIIIZZ.get(InterfaceC37774Es6.class);
                        if (hashMap2 != null) {
                            num = Integer.valueOf(hashMap2.size());
                        }
                        C37936Eui.LJII.put("jsb_tt_init_xbridge_classes_size", String.valueOf(num));
                        ((F0V) c70657RoD2).LJJIIZ(LJIIIIZZ);
                    }
                }
                Boolean bool3 = Boolean.TRUE;
                if (bool3 != null) {
                    C37936Eui.LJII.put("jsb_tt_init_xbridge_classes", bool3);
                }
            }
            if (!z && (iBulletHostProxy = F2O.LIZIZ) != null && (LJIIJ = iBulletHostProxy.LJIIJ(LJIJJ)) != null) {
                Integer valueOf2 = Integer.valueOf(LJIIJ.size());
                if (valueOf2 != null) {
                    C37936Eui.LJII.put("jsb_tt_init_unique_constructor_method_size", valueOf2);
                }
                for (InterfaceC38186Eyk bridge : LJIIJ) {
                    o.LJIIIZ(bridge, "bridge");
                    C38236EzY LJIJJLI = F0G.LJIJJLI(bridge, kitView);
                    C37942Euo c37942Euo2 = (C37942Euo) kitView.getHybridContext().LIZIZ(C37942Euo.class);
                    if (c37942Euo2 != null) {
                        c37942Euo2.LJIILJJIL(LJIJJLI);
                    }
                }
            }
            Boolean bool4 = Boolean.TRUE;
            if (bool4 != null) {
                C37936Eui.LJII.put("init_unique_constructor_method", bool4);
            }
        }
    }

    public static void LJI(ArrayList arrayList, Object obj, int i) {
        if (arrayList == null || i < 0 || arrayList.size() >= i) {
            return;
        }
        arrayList.add(obj);
    }

    public static final void LJII(C145995oB c145995oB, List list, String str) {
        int hashCode;
        String str2;
        String str3;
        o.LJIIIZ(c145995oB, "<this>");
        int i = 0;
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (Object obj : list) {
            int i2 = i + 1;
            String str4 = null;
            if (i >= 0) {
                AutoCutTitle autoCutTitle = (AutoCutTitle) obj;
                if (autoCutTitle != null) {
                    str2 = autoCutTitle.caption;
                } else {
                    str2 = null;
                }
                sb.append(str2);
                if (autoCutTitle != null) {
                    str3 = autoCutTitle.captionFontId;
                } else {
                    str3 = null;
                }
                sb2.append(str3);
                if (autoCutTitle != null) {
                    str4 = autoCutTitle.originCaptionLocation;
                }
                sb3.append(str4);
                if (i != list.size() - 1) {
                    sb.append("^");
                    sb2.append(",");
                    sb3.append(";");
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (str == null || ((hashCode = str.hashCode()) == -795442013 ? !str.equals("enter_video_post_page") : !(hashCode == -369458823 ? str.equals("enter_video_edit_page") : hashCode == -235365105 && str.equals("publish")))) {
            c145995oB.LIZLLL("caption", sb.toString());
            c145995oB.LIZLLL("caption_font_id", sb2.toString());
            c145995oB.LIZLLL("caption_location", sb3.toString());
        } else {
            c145995oB.LIZLLL("autocut_caption", sb.toString());
            c145995oB.LIZLLL("autocut_caption_font_id", sb2.toString());
            c145995oB.LIZLLL("autocut_caption_location", sb3.toString());
        }
    }

    public static final void LJIL(C26227ARb c26227ARb, String str, InterfaceC88472Yns interfaceC88472Yns) {
        C242989gE c242989gE = new C242989gE(c26227ARb.LIZ);
        if (str == null) {
            str = "";
        }
        c242989gE.LIZLLL(str);
        interfaceC88472Yns.invoke(c242989gE);
        c26227ARb.LJIIJJI = c242989gE;
    }

    public static final C73985T1x LJJIIJZLJL(InterfaceC68907R2p withCache, AbstractC68899R2h cache, InterfaceC88472Yns block) {
        o.LJIIJ(withCache, "$this$withCache");
        o.LJIIJ(cache, "cache");
        o.LJIIJ(block, "block");
        InterfaceC68914R2w cache2 = UC0.LJ(cache);
        o.LJIIJ(cache2, "cache");
        T20 t20 = new T20();
        block.invoke(t20);
        return new C73985T1x(withCache, cache2, t20);
    }

    public static String LJJI(EnumC198137q5 eventType, String str, String suffix, boolean z, int i) {
        boolean z2;
        String str2;
        if ((i & 4) != 0) {
            suffix = ".png";
        }
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(suffix, "suffix");
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("now_2023_new_year");
            LIZ.append(File.separator);
            LIZ.append(str);
            LIZ.append('_');
            LIZ.append(eventType.getPath());
            return JBR.LJFF(LIZ, "_large", suffix, LIZ);
        }
        if (z2) {
            if (C90193gN.LIZ()) {
                str2 = "rtl";
            } else {
                str2 = "ltr";
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("now_2023_new_year");
            LIZ2.append(File.separator);
            LIZ2.append(str);
            LIZ2.append('_');
            LIZ2.append(eventType.getPath());
            LIZ2.append('_');
            LIZ2.append(str2);
            LIZ2.append(suffix);
            return X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("now_2023_new_year");
        LIZ3.append(File.separator);
        LIZ3.append(str);
        LIZ3.append('_');
        LIZ3.append(eventType.getPath());
        LIZ3.append(suffix);
        return X1D.LIZIZ(LIZ3);
    }
}
