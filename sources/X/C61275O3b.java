package X;

import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import java.io.File;
import java.util.HashMap;
import ujb.o;

/* renamed from: X.O3b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61275O3b {
    public static volatile boolean LIZ;
    public static volatile String LIZIZ;

    public static OSZ LIZIZ() {
        String tag = C76612zZ.LIZ().getString("tt_ug_shoptab_new", "");
        if (tag == null || o.LJJJJJL(tag)) {
            try {
                UgCommonServiceImpl.LJIJ().LJII();
                if (C39284FbM.LIZJ().LJLILLLLZI) {
                    LIZLLL(true);
                    tag = "1";
                }
            } catch (Throwable unused) {
            }
            if (!C38987FRv.LJ().booleanValue()) {
                LIZLLL(false);
            }
            tag = CardStruct.IStatusCode.DEFAULT;
        }
        kotlin.jvm.internal.o.LJIIIIZZ(tag, "tag");
        return new OSZ("tt_ug_shoptab_new", tag);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
    public static void LIZJ(String str) {
        String str2;
        try {
            str2 = ED3.LJ(UriProtector.parse(str), "gecko_channel");
        } catch (Throwable unused) {
            str2 = "";
        }
        if (o.LJJJJJL(str2)) {
            return;
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = "";
        C68322mC c68322mC3 = new C68322mC();
        c68322mC3.element = "";
        C38595FCt c38595FCt = new C38595FCt(str2, c68322mC, c68322mC2, c68322mC3, SystemClock.elapsedRealtime());
        try {
            c68322mC.element = ED2.LIZ(C38943FQd.LIZ());
            c68322mC2.element = ED2.LIZ(C38943FQd.LIZIZ());
            File LIZLLL = C38943FQd.LIZLLL();
            c68322mC3.element = ED2.LIZ(LIZLLL.getPath());
            if (o.LJJJJJL((CharSequence) c68322mC.element) || o.LJJJJJL((CharSequence) c68322mC2.element) || o.LJJJJJL((CharSequence) c68322mC3.element)) {
                c38595FCt.invoke("onInit", Boolean.FALSE, "config argument empty");
                return;
            }
            O2T o2t = new O2T(EF7.LIZIZ());
            o2t.LJIIIZ = (String) c68322mC2.element;
            o2t.LIZJ(EF7.LJIIIZ);
            o2t.LJII = EF7.LIZLLL();
            EF7.LIZIZ();
            o2t.LIZ = new GeckoXNetImpl();
            o2t.LJ = C38738FIg.LIZ;
            boolean z = true;
            o2t.LIZIZ((String) c68322mC.element);
            o2t.LIZ((String) c68322mC.element);
            o2t.LJIIJJI = C85990Xow.LIZIZ();
            String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            if (com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId != null && !o.LJJJJJL(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId)) {
                z = false;
            }
            if (z || com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null) {
                com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = CardStruct.IStatusCode.DEFAULT;
            }
            o2t.LJIIIIZZ = com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId;
            o2t.LJIIJ = LIZLLL;
            C61276O3c c61276O3c = new C61276O3c(o2t);
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setChannelUpdatePriority(3);
            optionCheckUpdateParams.setEnableThrottle(false);
            optionCheckUpdateParams.setListener(new FDI(c38595FCt));
            C61520OCm.LIZLLL(c61276O3c).LIZ(null, C51029K0z.LJJIIZI(new OSZ(c68322mC.element, C47261Igj.LJJIJ(new CheckRequestBodyModel.TargetChannel(str2)))), optionCheckUpdateParams);
        } catch (Throwable th) {
            c38595FCt.invoke("onInitException", Boolean.FALSE, th.getMessage());
        }
    }

    public static void LIZLLL(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C76612zZ.LIZ().storeString("tt_ug_shoptab_new", str);
    }

    public static void LIZ(ActivityC45651qj activityC45651qj, String str) {
        String str2;
        String str3;
        String str4;
        HomeTabAbility LJIL;
        String str5;
        MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(activityC45651qj);
        String str6 = CardStruct.IStatusCode.DEFAULT;
        String str7 = null;
        if (LJJLIIIJJI != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) != null) {
            try {
                if (!LJIL.jc()) {
                    LJIL.iy();
                }
            } catch (Throwable th) {
                th = th;
                str4 = null;
            }
            if (LJIL.jc()) {
                activityC45651qj.getIntent().putExtra("extra_route_schema", str);
                try {
                    android.net.Uri parse = UriProtector.parse(str);
                    str5 = ED3.LJ(parse, "previous_page");
                    try {
                        str4 = ED3.LJ(parse, "deeplink_type");
                        try {
                            str7 = ED3.LJ(parse, "diversion_params");
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        str4 = null;
                    }
                } catch (Throwable unused3) {
                    str5 = null;
                    str4 = null;
                }
                try {
                    activityC45651qj.getIntent().putExtra("extra_non_click_open_from", LUT.LIZ(str5, str4));
                    if (str7 != null) {
                        activityC45651qj.getIntent().putExtra("diversion_params", str7);
                    }
                    LJIL.lZ(new Bundle(), "SHOP_MALL");
                    str3 = "1";
                    str2 = "";
                    str7 = str5;
                } catch (Throwable th2) {
                    th = th2;
                    str7 = str5;
                    str2 = ED2.LIZ(th.getMessage());
                    str3 = CardStruct.IStatusCode.DEFAULT;
                    str6 = "-1";
                    HashMap hashMap = new HashMap();
                    hashMap.put("previous_page", ED2.LIZ(str7));
                    hashMap.put("deeplink_type", ED2.LIZ(str4));
                    hashMap.put("position_type", ED2.LIZ(str6));
                    hashMap.put("top_product_id", ED2.LIZ(""));
                    hashMap.put("creative_id", ED2.LIZ(""));
                    hashMap.put("campaign_id", ED2.LIZ(""));
                    hashMap.put("schema", ED2.LIZ(str));
                    hashMap.put("has_landing_deeplink", 0);
                    hashMap.put("is_success", str3);
                    hashMap.put("error_info", ED2.LIZ(str2));
                    C76542zS.LIZ("rd_tiktokec_mall_home_route", hashMap);
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("previous_page", ED2.LIZ(str7));
                hashMap2.put("deeplink_type", ED2.LIZ(str4));
                hashMap2.put("position_type", ED2.LIZ(str6));
                hashMap2.put("top_product_id", ED2.LIZ(""));
                hashMap2.put("creative_id", ED2.LIZ(""));
                hashMap2.put("campaign_id", ED2.LIZ(""));
                hashMap2.put("schema", ED2.LIZ(str));
                hashMap2.put("has_landing_deeplink", 0);
                hashMap2.put("is_success", str3);
                hashMap2.put("error_info", ED2.LIZ(str2));
                C76542zS.LIZ("rd_tiktokec_mall_home_route", hashMap2);
            }
            str2 = "no mall tab";
        } else {
            str2 = "activity is not main";
        }
        str3 = CardStruct.IStatusCode.DEFAULT;
        str6 = "-1";
        str4 = null;
        HashMap hashMap22 = new HashMap();
        hashMap22.put("previous_page", ED2.LIZ(str7));
        hashMap22.put("deeplink_type", ED2.LIZ(str4));
        hashMap22.put("position_type", ED2.LIZ(str6));
        hashMap22.put("top_product_id", ED2.LIZ(""));
        hashMap22.put("creative_id", ED2.LIZ(""));
        hashMap22.put("campaign_id", ED2.LIZ(""));
        hashMap22.put("schema", ED2.LIZ(str));
        hashMap22.put("has_landing_deeplink", 0);
        hashMap22.put("is_success", str3);
        hashMap22.put("error_info", ED2.LIZ(str2));
        C76542zS.LIZ("rd_tiktokec_mall_home_route", hashMap22);
    }
}
