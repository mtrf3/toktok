package X;

import android.app.Application;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.BaLeadsGenInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.PaidContentInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PartnershipInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import kotlin.jvm.internal.o;

/* renamed from: X.NvH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60903NvH implements InterfaceC83282WmM, InterfaceC64046PBq {
    public static Properties LIZLLL;
    public static volatile Application LJ;
    public static final int[] LIZ = new int[0];
    public static final long[] LIZIZ = new long[0];
    public static final Object[] LIZJ = new Object[0];
    public static final int[] LJFF = {1, 5, -1, 6, -3};

    public static String LJFF(TelephonyManager telephonyManager) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(100921, "android/telephony/TelephonyManager", "getNetworkCountryIso", telephonyManager, new Object[0], "java.lang.String", new C65300Pk0(false, "()Ljava/lang/String;", "1044463400545493411"));
        return LIZJ2.LIZ ? (String) LIZJ2.LIZIZ : telephonyManager.getNetworkCountryIso();
    }

    public static long LJIIIIZZ(long j) {
        if (j == -2147483648L) {
            return j;
        }
        return (j << 60) | (j >>> 4);
    }

    public static InterfaceC43728HEe LJIIJJI() {
        return (InterfaceC43728HEe) C82908WgK.LIZIZ.getValue();
    }

    public static String LJIJ() {
        InputStream inputStream;
        Context context = C09970aH.LIZ;
        Object obj = null;
        if (LIZLLL == null) {
            LIZLLL = new Properties();
            try {
                inputStream = C16880lQ.LLLLL(context).getAssets().open("slardar.properties");
                try {
                    LIZLLL.load(inputStream);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                inputStream = null;
            }
            C78685UuP.LJIIIIZZ(inputStream);
        }
        try {
            if (LIZLLL.containsKey("release_build")) {
                obj = LIZLLL.get("release_build");
            }
        } catch (Exception unused3) {
        }
        return String.valueOf(obj);
    }

    public static Application LJIILIIL() {
        return LJ;
    }

    public static final C47182IfS LIZIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "<this>");
        return new C47182IfS(aweme);
    }

    public static C60930Nvi LIZJ(InterfaceC61500OBs asPrefetcher) {
        o.LJIIJ(asPrefetcher, "$this$asPrefetcher");
        return new C60930Nvi(new C60927Nvf(asPrefetcher).LIZ, true, 10);
    }

    public static final C81582W0c LJI(Effect convertToTextViewGuideModel) {
        o.LJIIIZ(convertToTextViewGuideModel, "$this$convertToTextViewGuideModel");
        return new C81582W0c(convertToTextViewGuideModel.getHint(), convertToTextViewGuideModel.getHintIcon());
    }

    public static String LJIIIZ(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = "";
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            int i3 = LJFF[i2 % 5];
            if (charAt >= 'a') {
                if (charAt <= 'z') {
                    charAt = (char) (charAt + i3);
                    if (charAt < 'a') {
                        charAt = (char) (charAt + 26);
                    }
                    if (charAt <= 'z') {
                    }
                    i = charAt - 26;
                }
                str2 = C42398GkU.LIZIZ(str2, charAt);
            } else {
                if (charAt >= 'A') {
                    if (charAt <= 'Z') {
                        charAt = (char) (charAt + i3);
                        if (charAt < 'A') {
                            charAt = (char) (charAt + 26);
                        }
                        if (charAt <= 'Z') {
                        }
                        i = charAt - 26;
                    }
                } else if (charAt >= '0' && charAt <= '9') {
                    charAt = (char) (charAt + i3);
                    if (charAt < '0') {
                        charAt = (char) (charAt + '\n');
                    }
                    if (charAt > '9') {
                        i = charAt - '\n';
                    }
                }
                str2 = C42398GkU.LIZIZ(str2, charAt);
            }
            charAt = (char) i;
            str2 = C42398GkU.LIZIZ(str2, charAt);
        }
        return str2;
    }

    public static final C145995oB LJIILJJIL(ShortVideoContext context) {
        o.LJIIIZ(context, "context");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("shoot_way", context.shootWay);
        c145995oB.LJI("creation_id", context.LJI());
        c145995oB.LJI("content_source", "shoot");
        c145995oB.LJI("content_type", "video");
        return c145995oB;
    }

    public static final String LJIILL(ShortVideoContext shortVideoContext) {
        if (o.LJ(shortVideoContext.shootWay, "duet")) {
            return "duet";
        }
        if (o.LJ(shortVideoContext.shootWay, "stitch")) {
            return "stitch";
        }
        if (shortVideoContext.shootMode == 15) {
            return "quick";
        }
        return "camera";
    }

    public static final int LJIILLIIL(InterfaceC60987Nwd interfaceC60987Nwd) {
        o.LJIIIZ(interfaceC60987Nwd, "<this>");
        return interfaceC60987Nwd.LIZ().size() - 1;
    }

    public static boolean LJIJI(String str) {
        if (str != null && str.toLowerCase().equals("gif")) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJJ(InterfaceC60987Nwd interfaceC60987Nwd) {
        o.LJIIIZ(interfaceC60987Nwd, "<this>");
        Iterator it = interfaceC60987Nwd.LIZ().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            User user = ((LinkListUser) next).user;
            if (user != null && user.getId() == C025908h.LIZ()) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJIJJLI(String str) {
        if (str != null && str.toLowerCase().equals("webp")) {
            return true;
        }
        return false;
    }

    public static final C60900NvE LJIL(InterfaceC65784Pro initializer) {
        o.LJIIIZ(initializer, "initializer");
        return new C60900NvE(initializer);
    }

    public static final void LJJIFFI(ShortVideoContext context) {
        o.LJIIIZ(context, "context");
        C145995oB LJIILJJIL = LJIILJJIL(context);
        LJIILJJIL.LJI("enter_method_popup", LJIILL(context));
        LJIILJJIL.LIZ(context.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        LJIILJJIL.LIZ(0, "is_from_external");
        FMX.LJIIL("show_exit_shoot_popup", LJIILJJIL.LIZ);
    }

    public static final boolean LJJII(Room room) {
        boolean z;
        PartnershipInfo partnershipInfo;
        if (room == null) {
            return false;
        }
        PartnershipInfo partnershipInfo2 = room.partnershipInfo;
        if (partnershipInfo2 != null) {
            z = o.LJ(partnershipInfo2.partnershipRoom, Boolean.TRUE);
        } else {
            z = false;
        }
        if (!z && (room == null || (partnershipInfo = room.partnershipInfo) == null || !partnershipInfo.promotingRoom)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIII(Room room) {
        if (!C58521Mxx.LIZ("LazyLoadSlotWidget")) {
            return true;
        }
        if (room != null) {
            CommerceStruct commerceStruct = room.getCommerceStruct();
            if (commerceStruct != null && commerceStruct.commercePermission == 1) {
                return true;
            }
            BALinkStruct bALinkStruct = room.getBALinkStruct();
            if (bALinkStruct != null && bALinkStruct.baLinkPermission == 1) {
                return true;
            }
            BaLeadsGenInfo baLeadsGenInfo = room.baLeadsGenInfo;
            if (baLeadsGenInfo != null && baLeadsGenInfo.leadsGenPermission) {
                return true;
            }
            PaidContentInfo paidContentInfo = room.paidContentInfo;
            if (paidContentInfo != null && paidContentInfo.paidContentPermission) {
                return true;
            }
        }
        return false;
    }

    public static java.util.Map LJJIIJZLJL(String str) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        String[] split = str.split(";|:");
        if (split != null && split.length != 0) {
            for (int i = 0; i < split.length - 1; i += 2) {
                try {
                    hashMap.put(split[i], Long.valueOf(CastLongProtector.parseLong(split[i + 1])));
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        return hashMap;
    }

    public static Object LJII(Object obj, InvocationHandler invocationHandler) {
        Class[] clsArr;
        Class<?> cls = obj.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LJIIL(cls, linkedHashSet);
        ArrayList arrayList = new ArrayList(linkedHashSet);
        if (arrayList.size() > 0) {
            clsArr = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
        } else {
            clsArr = new Class[0];
        }
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), clsArr, invocationHandler);
    }

    public static void LJIIL(Class cls, HashSet hashSet) {
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (hashSet.add(cls2)) {
                    LJIIL(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }

    public static final LinkListUser LJIIZILJ(InterfaceC60987Nwd interfaceC60987Nwd, long j) {
        Object obj;
        Iterator it = interfaceC60987Nwd.LIZ().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                User user = ((LinkListUser) obj).user;
                if (user != null && user.getId() == j) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (LinkListUser) obj;
    }

    public static final void LJJI(ShortVideoContext context, String str) {
        o.LJIIIZ(context, "context");
        C145995oB LJIILJJIL = LJIILJJIL(context);
        LJIILJJIL.LJI("enter_method_popup", LJIILL(context));
        LJIILJJIL.LJI("to_status", str);
        LJIILJJIL.LIZ(context.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        LJIILJJIL.LIZ(0, "is_from_external");
        FMX.LJIIL("exit_shoot_popup_result", LJIILJJIL.LIZ);
    }

    public static final void LJJIJIL(String str, java.util.Map params) {
        o.LJIIIZ(params, "params");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : params.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C51029K0z.LJJIIZ(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
        }
        FMX.LJIIL(str, new HashMap(linkedHashMap2));
    }

    public static void LJJIJL(Effect effect, long j) {
        if (effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!C77413UZt.LJIILL(effect.getRequirements())) {
                Iterator<String> it = effect.getRequirements().iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(",");
                }
            }
            StringBuilder sb2 = new StringBuilder("effect id:");
            sb2.append(effect.getEffectId());
            sb2.append("; effect url:");
            sb2.append(effect.getFileUrl());
            sb2.append("; effect req:");
            sb2.append(sb.toString());
            sb2.append("; total size:");
            sb2.append(j / 1024);
            sb2.append("k");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("report start download effect alog: ");
            LIZ2.append((Object) sb2);
            H78.LIZ(X1D.LIZIZ(LIZ2));
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("extra_info", sb2.toString());
            GXR.LIZ("start_download_effect", c145995oB.LIZ);
        }
    }

    @Override // X.InterfaceC83282WmM
    public void LIZ(Context context, String str) {
        C82890Wg2.LJFF.getClass();
        new C82890Wg2(context, str, 0, 2).LIZ();
    }

    @Override // X.InterfaceC64046PBq
    public void e(String str, String str2) {
        if (o.LJ("APM-TrafficInfo", str)) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(str, str2);
        }
    }

    @Override // X.InterfaceC64046PBq
    public void i(String str, String str2) {
        if (o.LJ("APM-TrafficInfo", str)) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(str, str2);
        }
    }

    public static int LIZLLL(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 > i2) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }

    public static int LJ(long j, int i, long[] jArr) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else if (j2 > j) {
                i2 = i4 - 1;
            } else {
                return i4;
            }
        }
        return ~i3;
    }

    public static List LJJ(File file, FTZ ftz, boolean z) {
        if (file != null && file.exists() && file.isDirectory()) {
            ArrayList arrayList = new ArrayList();
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file2 : listFiles) {
                    arrayList.add(file2);
                    if (z && file2.isDirectory()) {
                        arrayList.addAll(LJJ(file2, ftz, true));
                    }
                }
            }
            return arrayList;
        }
        return null;
    }

    public static final void LJJIIJ(SparkPopupSchemaParam sparkPopupSchemaParam, java.util.Map map, android.net.Uri uri) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        String str = (String) linkedHashMap.get("__use_ttnet");
        if (str != null) {
            sparkPopupSchemaParam.set_useTtnet(C60906NvK.LIZIZ("__use_ttnet", str, map, uri, false));
        }
        String str2 = (String) linkedHashMap.get("accessKey");
        if (str2 != null) {
            sparkPopupSchemaParam.setAccessKey(str2);
        }
        String str3 = (String) linkedHashMap.get("access_key");
        if (str3 != null) {
            sparkPopupSchemaParam.setAccessKeyBp(str3);
        }
        Object obj = linkedHashMap.get("append_common_params");
        if (obj != null) {
            sparkPopupSchemaParam.setAppendCommonParams(o.LJ(obj, "1"));
        }
        String str4 = (String) linkedHashMap.get("auto_play_bgm");
        if (str4 != null) {
            sparkPopupSchemaParam.setAutoPlayBgm(C60906NvK.LIZIZ("auto_play_bgm", str4, map, uri, false));
        }
        String str5 = (String) linkedHashMap.get("bid");
        if (str5 != null) {
            sparkPopupSchemaParam.setBid(str5);
        }
        Object obj2 = linkedHashMap.get("block_back_press");
        if (obj2 != null) {
            sparkPopupSchemaParam.setBlockBackPress(o.LJ(obj2, "1"));
        }
        String str6 = (String) linkedHashMap.get("bundle");
        if (str6 != null) {
            sparkPopupSchemaParam.setBundle(str6);
        }
        Object obj3 = linkedHashMap.get("redirect_cdn_by_region");
        if (obj3 != null) {
            sparkPopupSchemaParam.setCdnRegionRedirect(o.LJ(obj3, "1"));
        }
        String str7 = (String) linkedHashMap.get("channel");
        if (str7 != null) {
            sparkPopupSchemaParam.setChannel(str7);
        }
        String str8 = (String) linkedHashMap.get("click_time");
        if (str8 != null) {
            sparkPopupSchemaParam.setClickTime(str8);
        }
        String str9 = (String) linkedHashMap.get("container_bg_color");
        Object obj4 = linkedHashMap.get("container_bg_color_dark");
        Object obj5 = linkedHashMap.get("container_bg_color_light");
        if (str9 != null || obj4 != null || obj5 != null) {
            sparkPopupSchemaParam.setContainerBgColor(C60906NvK.LIZJ("container_bg_color", str9, map, uri));
        }
        Object obj6 = linkedHashMap.get("disable_auto_remove_loading");
        if (obj6 != null) {
            sparkPopupSchemaParam.setDisableAutoRemoveLoading(o.LJ(obj6, "1"));
        }
        Object obj7 = linkedHashMap.get("disable_back_press");
        if (obj7 != null) {
            sparkPopupSchemaParam.setDisableBackPress(o.LJ(obj7, "1"));
        }
        Object obj8 = linkedHashMap.get("disable_builtin");
        if (obj8 != null) {
            sparkPopupSchemaParam.setDisableBuiltin(Boolean.valueOf(o.LJ(obj8, "1")));
        }
        Object obj9 = linkedHashMap.get("disable_cdn");
        if (obj9 != null) {
            sparkPopupSchemaParam.setDisableCDN(Boolean.valueOf(o.LJ(obj9, "1")));
        }
        Object obj10 = linkedHashMap.get("disable_event_cache");
        if (obj10 != null) {
            sparkPopupSchemaParam.setDisableEventCache(o.LJ(obj10, "1"));
        }
        Object obj11 = linkedHashMap.get("disable_gecko");
        if (obj11 != null) {
            sparkPopupSchemaParam.setDisableGecko(Boolean.valueOf(o.LJ(obj11, "1")));
        }
        Object obj12 = linkedHashMap.get("disable_gecko_update");
        if (obj12 != null) {
            sparkPopupSchemaParam.setDisableGeckoUpdate(Boolean.valueOf(o.LJ(obj12, "1")));
        }
        Object obj13 = linkedHashMap.get("disable_hardware_accelerate");
        if (obj13 != null) {
            sparkPopupSchemaParam.setDisableHardwareAccelerate(o.LJ(obj13, "1"));
        }
        Object obj14 = linkedHashMap.get("disable_offline");
        if (obj14 != null) {
            sparkPopupSchemaParam.setDisableOffline(Boolean.valueOf(o.LJ(obj14, "1")));
        }
        Object obj15 = linkedHashMap.get("disable_outside_click_close");
        if (obj15 != null) {
            sparkPopupSchemaParam.setDisableOutsideClickClose(o.LJ(obj15, "1"));
        }
        Object obj16 = linkedHashMap.get("disable_save_image");
        if (obj16 != null) {
            sparkPopupSchemaParam.setDisableSaveImage(o.LJ(obj16, "1"));
        }
        Object obj17 = linkedHashMap.get("drag_back");
        if (obj17 != null) {
            sparkPopupSchemaParam.setDragBack(o.LJ(obj17, "1"));
        }
        Object obj18 = linkedHashMap.get("drag_by_gesture");
        if (obj18 != null) {
            sparkPopupSchemaParam.setDragByGesture(o.LJ(obj18, "1"));
        }
        String str10 = (String) linkedHashMap.get("drag_down_close_threshold");
        if (str10 != null) {
            sparkPopupSchemaParam.setDragDownCloseThreshold(C60906NvK.LIZIZ("drag_down_close_threshold", str10, map, uri, true));
        }
        String str11 = (String) linkedHashMap.get("drag_down_threshold");
        if (str11 != null) {
            sparkPopupSchemaParam.setDragDownThreshold(C60906NvK.LIZIZ("drag_down_threshold", str11, map, uri, true));
        }
        Object obj19 = linkedHashMap.get("drag_handle_force_flat");
        if (obj19 != null) {
            sparkPopupSchemaParam.setDragHandleForceFlat(o.LJ(obj19, "1"));
        }
        String str12 = (String) linkedHashMap.get("drag_height");
        if (str12 != null) {
            sparkPopupSchemaParam.setDragHeight(C60906NvK.LIZIZ("drag_height", str12, map, uri, true));
        }
        String str13 = (String) linkedHashMap.get("drag_min_margin_top");
        if (str13 != null) {
            sparkPopupSchemaParam.setDragMinMarginTop(C60906NvK.LIZIZ("drag_min_margin_top", str13, map, uri, true));
        }
        String str14 = (String) linkedHashMap.get("drag_up_threshold");
        if (str14 != null) {
            sparkPopupSchemaParam.setDragUpThreshold(C60906NvK.LIZIZ("drag_up_threshold", str14, map, uri, true));
        }
        String str15 = (String) linkedHashMap.get("dynamic");
        if (str15 != null) {
            sparkPopupSchemaParam.setDynamic(C60906NvK.LIZIZ("dynamic", str15, map, uri, false));
        }
        Object obj20 = linkedHashMap.get("enable_canvas");
        if (obj20 != null) {
            sparkPopupSchemaParam.setEnableCanvas(o.LJ(obj20, "1"));
        }
        Object obj21 = linkedHashMap.get("enable_canvas_optimize");
        if (obj21 != null) {
            sparkPopupSchemaParam.setEnableCanvasOptimization(Boolean.valueOf(o.LJ(obj21, "1")));
        }
        String str16 = (String) linkedHashMap.get("enable_code_cache");
        if (str16 != null) {
            sparkPopupSchemaParam.setEnableCodeCache(C60906NvK.LIZIZ("enable_code_cache", str16, map, uri, false));
        }
        Object obj22 = linkedHashMap.get("enable_dynamic_v8");
        if (obj22 != null) {
            sparkPopupSchemaParam.setEnableDynamicV8(o.LJ(obj22, "1"));
        }
        String str17 = (String) linkedHashMap.get("enable_extra_info");
        if (str17 != null) {
            sparkPopupSchemaParam.setEnableExtraInfo(C60906NvK.LIZIZ("enable_extra_info", str17, map, uri, false));
        }
        Object obj23 = linkedHashMap.get("enable_js_runtime");
        if (obj23 != null) {
            sparkPopupSchemaParam.setEnableJSRuntime(o.LJ(obj23, "1"));
        }
        Object obj24 = linkedHashMap.get("enable_memory_cache");
        if (obj24 != null) {
            sparkPopupSchemaParam.setEnableMemoryCache(Boolean.valueOf(o.LJ(obj24, "1")));
        }
        Object obj25 = linkedHashMap.get("enable_pending_js_task");
        if (obj25 != null) {
            sparkPopupSchemaParam.setEnablePendingJsTask(o.LJ(obj25, "1"));
        }
        String str18 = (String) linkedHashMap.get("enable_pre_code_cache");
        if (str18 != null) {
            sparkPopupSchemaParam.setEnablePreCodeCache(C60906NvK.LIZIZ("enable_pre_code_cache", str18, map, uri, false));
        }
        String str19 = (String) linkedHashMap.get("enable_prefetch");
        if (str19 != null) {
            sparkPopupSchemaParam.setEnablePrefetch(C60906NvK.LIZIZ("enable_prefetch", str19, map, uri, false));
        }
        Object obj26 = linkedHashMap.get("enable_pull_down_close");
        if (obj26 != null) {
            sparkPopupSchemaParam.setEnablePullDownClose(o.LJ(obj26, "1"));
        }
        Object obj27 = linkedHashMap.get("enable_relative_calculation");
        if (obj27 != null) {
            sparkPopupSchemaParam.setEnableRelativeCalculation(o.LJ(obj27, "1"));
        }
        Object obj28 = linkedHashMap.get("enable_scroll_web_view");
        if (obj28 != null) {
            sparkPopupSchemaParam.setEnableScrollWebView(o.LJ(obj28, "1"));
        }
        Object obj29 = linkedHashMap.get("enable_spark_live_opt");
        if (obj29 != null) {
            sparkPopupSchemaParam.setEnableSparkLiveOpt(o.LJ(obj29, "1"));
        }
        Object obj30 = linkedHashMap.get("enable_sheet_handle_opt");
        if (obj30 != null) {
            sparkPopupSchemaParam.setEnableSparkPopupSheetHandleOpt(o.LJ(obj30, "1"));
        }
        String str20 = (String) linkedHashMap.get("fallback_url");
        if (str20 != null) {
            sparkPopupSchemaParam.setFallbackUrl(str20);
        }
        Object obj31 = linkedHashMap.get("forbidden_anim");
        if (obj31 != null) {
            sparkPopupSchemaParam.setForbiddenAnim(o.LJ(obj31, "1"));
        }
        Object obj32 = linkedHashMap.get("force_dialog_non_cancelable");
        if (obj32 != null) {
            sparkPopupSchemaParam.setForceDialogNonCancelable(o.LJ(obj32, "1"));
        }
        Object obj33 = linkedHashMap.get("force_h5");
        if (obj33 != null) {
            sparkPopupSchemaParam.setForceH5(o.LJ(obj33, "1"));
        }
        String str21 = (String) linkedHashMap.get("force_theme_style");
        if (str21 != null) {
            sparkPopupSchemaParam.setForceThemeStyle(str21);
        }
        Object obj34 = linkedHashMap.get("gecko_url_redirection");
        if (obj34 != null) {
            sparkPopupSchemaParam.setGeckoUrlRedirection(o.LJ(obj34, "1"));
        }
        String str22 = (String) linkedHashMap.get("gravity");
        if (str22 != null) {
            sparkPopupSchemaParam.setGravity(str22);
        }
        String str23 = (String) linkedHashMap.get("gravity");
        if (str23 != null) {
            sparkPopupSchemaParam.setGravityWithoutDefault(str23);
        }
        String str24 = (String) linkedHashMap.get("group");
        if (str24 != null) {
            sparkPopupSchemaParam.setGroup(str24);
        }
        String str25 = (String) linkedHashMap.get("height");
        if (str25 != null) {
            sparkPopupSchemaParam.setHeight(C60906NvK.LIZIZ("height", str25, map, uri, true));
        }
        Object obj35 = linkedHashMap.get("hide_error");
        if (obj35 != null) {
            sparkPopupSchemaParam.setHideError(o.LJ(obj35, "1"));
        }
        Object obj36 = linkedHashMap.get("hide_loading");
        if (obj36 != null) {
            sparkPopupSchemaParam.setHideLoading(o.LJ(obj36, "1"));
        }
        Object obj37 = linkedHashMap.get("hide_system_video_poster");
        if (obj37 != null) {
            sparkPopupSchemaParam.setHideSystemVideoPoster(o.LJ(obj37, "1"));
        }
        String str26 = (String) linkedHashMap.get("ignore_cache_policy");
        if (str26 != null) {
            sparkPopupSchemaParam.setIgnoreCachePolicy(C60906NvK.LIZIZ("ignore_cache_policy", str26, map, uri, false));
        }
        Object obj38 = linkedHashMap.get("ignore_cached_theme");
        if (obj38 != null) {
            sparkPopupSchemaParam.setIgnoreCachedTheme(o.LJ(obj38, "1"));
        }
        Object obj39 = linkedHashMap.get("ignore_keyboard_status_change");
        if (obj39 != null) {
            sparkPopupSchemaParam.setIgnoreKeyboardStatusChange(o.LJ(obj39, "1"));
        }
        String str27 = (String) linkedHashMap.get("initial_data");
        if (str27 != null) {
            sparkPopupSchemaParam.setInitialData(str27);
        }
        String str28 = (String) linkedHashMap.get("keyboard_adjust");
        if (str28 != null) {
            sparkPopupSchemaParam.setKeyboardAdjust(C60906NvK.LIZIZ("keyboard_adjust", str28, map, uri, false));
        }
        Object obj40 = linkedHashMap.get("keyboard_compat");
        if (obj40 != null) {
            sparkPopupSchemaParam.setKeyboardCompat(o.LJ(obj40, "1"));
        }
        String str29 = (String) linkedHashMap.get("landscape_gravity");
        if (str29 != null) {
            sparkPopupSchemaParam.setLandscapeGravity(str29);
        }
        String str30 = (String) linkedHashMap.get("landscape_height");
        if (str30 != null) {
            sparkPopupSchemaParam.setLandscapeHeight(C60906NvK.LIZIZ("landscape_height", str30, map, uri, true));
        }
        Object obj41 = linkedHashMap.get("landscape_screen_size_as_portrait");
        if (obj41 != null) {
            sparkPopupSchemaParam.setLandscapeScreenSizeAsPortrait(o.LJ(obj41, "1"));
        }
        String str31 = (String) linkedHashMap.get("landscape_transition_animation");
        if (str31 != null) {
            sparkPopupSchemaParam.setLandscapeTransitionAnimation(str31);
        }
        String str32 = (String) linkedHashMap.get("landscape_width");
        if (str32 != null) {
            sparkPopupSchemaParam.setLandscapeWidth(C60906NvK.LIZIZ("landscape_width", str32, map, uri, true));
        }
        String str33 = (String) linkedHashMap.get("loading_bg_color");
        Object obj42 = linkedHashMap.get("loading_bg_color_dark");
        Object obj43 = linkedHashMap.get("loading_bg_color_light");
        if (str33 != null || obj42 != null || obj43 != null) {
            sparkPopupSchemaParam.setLoadingBgColor(C60906NvK.LIZJ("loading_bg_color", str33, map, uri));
        }
        String str34 = (String) linkedHashMap.get("loading_height_in_adaptive_mode");
        if (str34 != null) {
            sparkPopupSchemaParam.setLoadingHeightInAdaptiveMode(C60906NvK.LIZIZ("loading_height_in_adaptive_mode", str34, map, uri, true));
        }
        Object obj44 = linkedHashMap.get("lock_resource");
        if (obj44 != null) {
            sparkPopupSchemaParam.setLockResource(o.LJ(obj44, "1"));
        }
        Object obj45 = linkedHashMap.get("lock_variable_height_expanded");
        if (obj45 != null) {
            sparkPopupSchemaParam.setLockVariableHeightExpanded(o.LJ(obj45, "1"));
        }
        String str35 = (String) linkedHashMap.get("lynxview_height");
        if (str35 != null) {
            sparkPopupSchemaParam.setLynxviewHeight(Integer.valueOf(C60906NvK.LIZIZ("lynxview_height", str35, map, uri, true)));
        }
        String str36 = (String) linkedHashMap.get("lynxview_width");
        if (str36 != null) {
            sparkPopupSchemaParam.setLynxviewWidth(Integer.valueOf(C60906NvK.LIZIZ("lynxview_width", str36, map, uri, true)));
        }
        String str37 = (String) linkedHashMap.get("margin_bottom");
        if (str37 != null) {
            sparkPopupSchemaParam.setMarginBottom(C60906NvK.LIZIZ("margin_bottom", str37, map, uri, true));
        }
        String str38 = (String) linkedHashMap.get("margin_end");
        if (str38 != null) {
            sparkPopupSchemaParam.setMarginEnd(C60906NvK.LIZIZ("margin_end", str38, map, uri, true));
        }
        String str39 = (String) linkedHashMap.get("margin_left");
        if (str39 != null) {
            sparkPopupSchemaParam.setMarginLeft(C60906NvK.LIZIZ("margin_left", str39, map, uri, true));
        }
        String str40 = (String) linkedHashMap.get("margin_right");
        if (str40 != null) {
            sparkPopupSchemaParam.setMarginRight(C60906NvK.LIZIZ("margin_right", str40, map, uri, true));
        }
        String str41 = (String) linkedHashMap.get("margin_start");
        if (str41 != null) {
            sparkPopupSchemaParam.setMarginStart(C60906NvK.LIZIZ("margin_start", str41, map, uri, true));
        }
        String str42 = (String) linkedHashMap.get("margin_top");
        if (str42 != null) {
            sparkPopupSchemaParam.setMarginTop(C60906NvK.LIZIZ("margin_top", str42, map, uri, true));
        }
        String str43 = (String) linkedHashMap.get("mask_bg_color");
        Object obj46 = linkedHashMap.get("mask_bg_color_dark");
        Object obj47 = linkedHashMap.get("mask_bg_color_light");
        if (str43 != null || obj46 != null || obj47 != null) {
            sparkPopupSchemaParam.setMaskBgColor(C60906NvK.LIZJ("mask_bg_color", str43, map, uri));
        }
        Object obj48 = linkedHashMap.get("mask_close_until_loaded");
        if (obj48 != null) {
            sparkPopupSchemaParam.setMaskCloseUntilLoaded(o.LJ(obj48, "1"));
        }
        String str44 = (String) linkedHashMap.get("min_margin_top");
        if (str44 != null) {
            sparkPopupSchemaParam.setMinMarginTop(C60906NvK.LIZIZ("min_margin_top", str44, map, uri, true));
        }
        String str45 = (String) linkedHashMap.get("navigation_bar_bg_color");
        Object obj49 = linkedHashMap.get("navigation_bar_bg_color_dark");
        Object obj50 = linkedHashMap.get("navigation_bar_bg_color_light");
        if (str45 != null || obj49 != null || obj50 != null) {
            sparkPopupSchemaParam.setNavigationBarBgColor(C60906NvK.LIZJ("navigation_bar_bg_color", str45, map, uri));
        }
        String str46 = (String) linkedHashMap.get("navigation_font_mode");
        if (str46 != null) {
            sparkPopupSchemaParam.setNavigationFontMode(str46);
        }
        Object obj51 = linkedHashMap.get("need_sec_link");
        if (obj51 != null) {
            sparkPopupSchemaParam.setNeedSecLink(o.LJ(obj51, "1"));
        }
        String str47 = (String) linkedHashMap.get("net_worker");
        if (str47 != null) {
            sparkPopupSchemaParam.setNetWorker(Integer.valueOf(C60906NvK.LIZIZ("net_worker", str47, map, uri, false)));
        }
        Object obj52 = linkedHashMap.get("only_local");
        if (obj52 != null) {
            sparkPopupSchemaParam.setOnlyLocal(Boolean.valueOf(o.LJ(obj52, "1")));
        }
        Object obj53 = linkedHashMap.get("parallel_fetch_resource");
        if (obj53 != null) {
            sparkPopupSchemaParam.setParallelFetchResource(o.LJ(obj53, "1"));
        }
        String str48 = (String) linkedHashMap.get("peek_down_close_threshold");
        if (str48 != null) {
            sparkPopupSchemaParam.setPeekDownCloseThreshold(C60906NvK.LIZIZ("peek_down_close_threshold", str48, map, uri, true));
        }
        Object obj54 = linkedHashMap.get("popup_compat_show_event");
        if (obj54 != null) {
            sparkPopupSchemaParam.setPopupCompatShowEvent(o.LJ(obj54, "1"));
        }
        Object obj55 = linkedHashMap.get("popup_follow_activity_ui");
        if (obj55 != null) {
            sparkPopupSchemaParam.setPopupFollowActivityUi(o.LJ(obj55, "1"));
        }
        String str49 = (String) linkedHashMap.get("preloadFonts");
        if (str49 != null) {
            sparkPopupSchemaParam.setPreloadFonts(str49);
        }
        String str50 = (String) linkedHashMap.get("preload_setting_keys");
        if (str50 != null) {
            sparkPopupSchemaParam.setPreloadSettingsKeys(str50);
        }
        String str51 = (String) linkedHashMap.get("preload_storage_keys");
        if (str51 != null) {
            sparkPopupSchemaParam.setPreloadStorageKeys(str51);
        }
        String str52 = (String) linkedHashMap.get("preset_height");
        if (str52 != null) {
            sparkPopupSchemaParam.setPresetHeight(C60906NvK.LIZIZ("preset_height", str52, map, uri, true));
        }
        Object obj56 = linkedHashMap.get("preset_safe_point");
        if (obj56 != null) {
            sparkPopupSchemaParam.setPresetSafePoint(o.LJ(obj56, "1"));
        }
        String str53 = (String) linkedHashMap.get("preset_width");
        if (str53 != null) {
            sparkPopupSchemaParam.setPresetWidth(C60906NvK.LIZIZ("preset_width", str53, map, uri, true));
        }
        Object obj57 = linkedHashMap.get("proxy_enabled_runtime_type");
        if (obj57 != null) {
            sparkPopupSchemaParam.setProxyEnabledRuntimeType(o.LJ(obj57, "1"));
        }
        String str54 = (String) linkedHashMap.get("radius");
        if (str54 != null) {
            sparkPopupSchemaParam.setRadius(C60906NvK.LIZIZ("radius", str54, map, uri, true));
        }
        String str55 = (String) linkedHashMap.get("redirect_regions");
        if (str55 != null) {
            sparkPopupSchemaParam.setRedirectRegions(str55);
        }
        String str56 = (String) linkedHashMap.get("resize_duration");
        if (str56 != null) {
            sparkPopupSchemaParam.setResizeDuration(str56);
        }
        Object obj58 = linkedHashMap.get("resource_dynamic");
        if (obj58 != null) {
            sparkPopupSchemaParam.setResourceDynamic(Boolean.valueOf(o.LJ(obj58, "1")));
        }
        String str57 = (String) linkedHashMap.get("sec_link_scene");
        if (str57 != null) {
            sparkPopupSchemaParam.setSecLinkScene(str57);
        }
        Object obj59 = linkedHashMap.get("self_adaptive_height");
        if (obj59 != null) {
            sparkPopupSchemaParam.setSelfAdaptiveHeight(o.LJ(obj59, "1"));
        }
        String str58 = (String) linkedHashMap.get("session_id");
        if (str58 != null) {
            sparkPopupSchemaParam.setSessionId(str58);
        }
        Object obj60 = linkedHashMap.get("share_group");
        if (obj60 != null) {
            sparkPopupSchemaParam.setShareGroup(o.LJ(obj60, "1"));
        }
        Object obj61 = linkedHashMap.get("show_mask");
        if (obj61 != null) {
            sparkPopupSchemaParam.setShowMask(o.LJ(obj61, "1"));
        }
        Object obj62 = linkedHashMap.get("show_progress_bar_in_all_page");
        if (obj62 != null) {
            sparkPopupSchemaParam.setShowProgressBarInAllPage(o.LJ(obj62, "1"));
        }
        String str59 = (String) linkedHashMap.get("silent_load_type");
        if (str59 != null) {
            sparkPopupSchemaParam.setSilentLoadType(C60906NvK.LIZIZ("silent_load_type", str59, map, uri, false));
        }
        String str60 = (String) linkedHashMap.get("skeleton_duration");
        if (str60 != null) {
            sparkPopupSchemaParam.setSkeletonDuration(Integer.valueOf(C60906NvK.LIZIZ("skeleton_duration", str60, map, uri, true)));
        }
        String str61 = (String) linkedHashMap.get("skeleton_from_alpha");
        if (str61 != null) {
            sparkPopupSchemaParam.setSkeletonFromAlpha(str61);
        }
        String str62 = (String) linkedHashMap.get("skeleton_path");
        if (str62 != null) {
            sparkPopupSchemaParam.setSkeletonPath(str62);
        }
        String str63 = (String) linkedHashMap.get("skeleton_to_alpha");
        if (str63 != null) {
            sparkPopupSchemaParam.setSkeletonToAlpha(str63);
        }
        Object obj63 = linkedHashMap.get("skeleton_with_animation");
        if (obj63 != null) {
            sparkPopupSchemaParam.setSkeletonWithAnimation(o.LJ(obj63, "1"));
        }
        String str64 = (String) linkedHashMap.get("spark_perf_bid");
        if (str64 != null) {
            sparkPopupSchemaParam.setSparkPerfBid(str64);
        }
        String str65 = (String) linkedHashMap.get("spark_perf_biz");
        if (str65 != null) {
            sparkPopupSchemaParam.setSparkPerfBiz(str65);
        }
        String str66 = (String) linkedHashMap.get("ssp_config");
        if (str66 != null) {
            sparkPopupSchemaParam.setSspConfig(C60906NvK.LIZIZ("ssp_config", str66, map, uri, false));
        }
        String str67 = (String) linkedHashMap.get("starling_channel");
        if (str67 != null) {
            sparkPopupSchemaParam.setStarlingChannel(str67);
        }
        Object obj64 = linkedHashMap.get("starling_fallback");
        if (obj64 != null) {
            sparkPopupSchemaParam.setStarlingFallback(o.LJ(obj64, "1"));
        }
        String str68 = (String) linkedHashMap.get("status_bar_bg_color");
        Object obj65 = linkedHashMap.get("status_bar_bg_color_dark");
        Object obj66 = linkedHashMap.get("status_bar_bg_color_light");
        if (str68 != null || obj65 != null || obj66 != null) {
            sparkPopupSchemaParam.setStatusBarBgColor(C60906NvK.LIZJ("status_bar_bg_color", str68, map, uri));
        }
        String str69 = (String) linkedHashMap.get("status_font_mode");
        if (str69 != null) {
            sparkPopupSchemaParam.setStatusFontMode(str69);
        }
        Object obj67 = linkedHashMap.get("subscribe_network_level");
        if (obj67 != null) {
            sparkPopupSchemaParam.setSubscribeNetworkLevel(o.LJ(obj67, "1"));
        }
        String str70 = (String) linkedHashMap.get("surl");
        if (str70 != null) {
            sparkPopupSchemaParam.setSurl(str70);
        }
        String str71 = (String) linkedHashMap.get("thread_strategy");
        if (str71 != null) {
            sparkPopupSchemaParam.setThreadStrategy(C60906NvK.LIZIZ("thread_strategy", str71, map, uri, false));
        }
        String str72 = (String) linkedHashMap.get("trans_navigation_bar");
        if (str72 != null) {
            sparkPopupSchemaParam.setTransNavigationBar(C60906NvK.LIZ("trans_navigation_bar", str72, map, uri));
        }
        String str73 = (String) linkedHashMap.get("trans_status_bar");
        if (str73 != null) {
            sparkPopupSchemaParam.setTransStatusBar(C60906NvK.LIZ("trans_status_bar", str73, map, uri));
        }
        String str74 = (String) linkedHashMap.get("transition_animation");
        if (str74 != null) {
            sparkPopupSchemaParam.setTransitionAnimation(str74);
        }
        String str75 = (String) linkedHashMap.get("ui_running_mode");
        if (str75 != null) {
            sparkPopupSchemaParam.setUiRunningMode(C60906NvK.LIZ("ui_running_mode", str75, map, uri));
        }
        String str76 = (String) linkedHashMap.get("url");
        if (str76 != null) {
            sparkPopupSchemaParam.setUrl(str76);
        }
        String str77 = (String) linkedHashMap.get("use_forest");
        if (str77 != null) {
            sparkPopupSchemaParam.setUseForest(C60906NvK.LIZ("use_forest", str77, map, uri));
        }
        String str78 = (String) linkedHashMap.get("use_mutable_context");
        if (str78 != null) {
            sparkPopupSchemaParam.setUseMutableContext(C60906NvK.LIZ("use_mutable_context", str78, map, uri));
        }
        String str79 = (String) linkedHashMap.get("use_preload");
        if (str79 != null) {
            sparkPopupSchemaParam.setUsePreload(C60906NvK.LIZ("use_preload", str79, map, uri));
        }
        String str80 = (String) linkedHashMap.get("use_preload_resource_h5");
        if (str80 != null) {
            sparkPopupSchemaParam.setUsePreloadResourceH5(C60906NvK.LIZ("use_preload_resource_h5", str80, map, uri));
        }
        String str81 = (String) linkedHashMap.get("variable_height");
        if (str81 != null) {
            sparkPopupSchemaParam.setVariableHeight(C60906NvK.LIZIZ("variable_height", str81, map, uri, true));
        }
        String str82 = (String) linkedHashMap.get("wait_gecko_update");
        if (str82 != null) {
            sparkPopupSchemaParam.setWaitGeckoUpdate(Boolean.valueOf(C60906NvK.LIZ("wait_gecko_update", str82, map, uri)));
        }
        String str83 = (String) linkedHashMap.get("wait_low_storage_update");
        if (str83 != null) {
            sparkPopupSchemaParam.setWaitLowStorageUpdate(C60906NvK.LIZ("wait_low_storage_update", str83, map, uri));
        }
        String str84 = (String) linkedHashMap.get("webview_progress_bar");
        if (str84 != null) {
            sparkPopupSchemaParam.setWebviewProgressBar(C60906NvK.LIZ("webview_progress_bar", str84, map, uri));
        }
        String str85 = (String) linkedHashMap.get("width");
        if (str85 != null) {
            sparkPopupSchemaParam.setWidth(C60906NvK.LIZIZ("width", str85, map, uri, true));
        }
    }

    public static void LJJIIZ(float f, String str, java.util.Map map) {
        if (f != Float.MIN_VALUE && f != Float.NaN) {
            ((HashMap) map).put(str, Float.valueOf(f));
        }
    }

    public static void LJJIIZI(int i, String str, java.util.Map map) {
        if (i != Integer.MIN_VALUE) {
            ((HashMap) map).put(str, Integer.valueOf(i));
        }
    }

    public static void LJJIJ(long j, String str, java.util.Map map) {
        if (j != -2147483648L) {
            ((HashMap) map).put(str, Long.valueOf(j));
        }
    }

    public static void LJJIJIIJI(String str, String str2, java.util.Map map) {
        if (!TextUtils.isEmpty(str2)) {
            ((HashMap) map).put(str, str2);
        }
    }

    public static void LJJIJIIJIL(java.util.Map map, String str, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            ((HashMap) map).put(str, arrayList);
        }
    }

    public static void LJIIJ(Effect effect, long j, long j2, int i, ExceptionResult exceptionResult) {
        if (effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!C77413UZt.LJIILL(effect.getRequirements())) {
                Iterator<String> it = effect.getRequirements().iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(",");
                }
            }
            StringBuilder sb2 = new StringBuilder("effect id:");
            sb2.append(effect.getEffectId());
            sb2.append("; effect url:");
            sb2.append(effect.getFileUrl());
            sb2.append("; effect req:");
            sb2.append(sb.toString());
            sb2.append("; total size:");
            sb2.append(j / 1024);
            sb2.append("k; duration:");
            sb2.append(j2);
            sb2.append("ms");
            if (i == 0) {
                sb2.append("; errorcode: 0");
            } else if (exceptionResult != null) {
                sb2.append("; errorcode:");
                sb2.append(exceptionResult.getErrorCode());
                sb2.append("; errormsg:");
                sb2.append(exceptionResult.getMsg());
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("report effect download alog: ");
            LIZ2.append((Object) sb2);
            H78.LIZ(X1D.LIZIZ(LIZ2));
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("extra_info", sb2.toString());
            GXR.LIZ("end_download_effect", c145995oB.LIZ);
        }
    }
}
