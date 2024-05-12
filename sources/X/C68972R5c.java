package X;

import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import defpackage.i0;
import defpackage.s1;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;

/* renamed from: X.R5c */
/* loaded from: classes12.dex */
public final class C68972R5c {
    public static final HashMap<String, Long> LIZ = new HashMap<>();

    public static final void LIZ(C35936E8m eventMapBuilder) {
        int i;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        Integer LIZIZ = HybridABInfoService.LIZJ().LIZIZ();
        if (LIZIZ != null) {
            i = LIZIZ.intValue();
        } else {
            i = 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - C56662Kg.LIZ().LJIIJJI;
        boolean LIZLLL = s1.LIZLLL("isFirstInstallAndFirstLaunch()");
        int i2 = !TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) ? 1 : 0;
        eventMapBuilder.LIZIZ(elapsedRealtime, "from_start_to_current_duration");
        eventMapBuilder.LIZ(i, "is_hybrid_ab_recv");
        eventMapBuilder.LIZ(LIZLLL ? 1 : 0, "is_cold_start_first_launch");
        eventMapBuilder.LIZ(i2, "is_did_ready");
        eventMapBuilder.LIZ(E6T.LJIIIIZZ ? 1 : 0, "is_hybrid_ab_api_rev");
        eventMapBuilder.LIZ(C38985FRt.LIZIZ.LJI(), "is_in_nuj_process");
    }

    public static java.util.Map LIZJ(Bundle bundle) {
        Serializable serializable;
        if (bundle != null) {
            serializable = bundle.getSerializable("extra_param");
        } else {
            serializable = null;
        }
        if (!C65777Prh.LJII(serializable)) {
            return null;
        }
        return (java.util.Map) serializable;
    }

    public static int LIZLLL(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        Long l = LIZ.get(str);
        if (l == null) {
            l = Long.valueOf(currentTimeMillis);
        }
        return (int) ((currentTimeMillis - l.longValue()) / 1000);
    }

    public static void LIZIZ(C35936E8m c35936E8m, java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                c35936E8m.LIZ(((Number) value).intValue(), str);
            } else if (value instanceof String) {
                c35936E8m.LIZJ(str, (String) value);
            } else if (value instanceof Long) {
                c35936E8m.LIZIZ(((Number) value).longValue(), str);
            } else {
                c35936E8m.LIZJ(str, "");
            }
        }
    }

    public static void LJ(boolean z, InterfaceC69056R8i accountCallback) {
        int i;
        o.LJIIIZ(accountCallback, "accountCallback");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", accountCallback.q9().LJJLIIIJJI());
        c35936E8m.LIZLLL("enter_method", accountCallback.q9().LJJLIIIJLLLLLLLZ());
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        c35936E8m.LIZ(i, "status");
        FMX.LJIIL("verify_sms_code", c35936E8m.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJI(Bundle bundle, java.util.Map map, List list) {
        String str;
        int i;
        String str2;
        String str3;
        String string;
        HashSet hashSet = new HashSet();
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    hashSet.add(R5D.LIZIZ((BaseLoginMethod) ListProtector.get(list, i2)));
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        C35936E8m c35936E8m = new C35936E8m();
        String str4 = "";
        if (bundle == null || (str = bundle.getString("enter_method", "")) == null) {
            str = "";
        }
        for (EnumC85993Xoz enumC85993Xoz : EnumC85993Xoz.values()) {
            String name = enumC85993Xoz.name();
            Locale locale = Locale.ENGLISH;
            String LIZIZ = C141415gn.LIZIZ(locale, "ENGLISH", name, locale, "this as java.lang.String).toLowerCase(locale)");
            c35936E8m.LIZ(hashSet.contains(LIZIZ) ? 1 : 0, i0.LJFF(LIZIZ, "_is_show"));
        }
        if (hashSet.contains("email") || hashSet.contains("sms_verification") || hashSet.contains("sms_verification") || hashSet.contains("phone") || hashSet.contains("handle")) {
            i = 1;
        } else {
            i = 0;
        }
        c35936E8m.LIZ(i, "phone_email_show");
        c35936E8m.LIZJ("enter_method", str);
        if (bundle == null || (str2 = bundle.getString("enter_from", "")) == null) {
            str2 = "";
        }
        c35936E8m.LIZJ("enter_from", str2);
        c35936E8m.LIZJ("enter_type", "click_login");
        if (bundle == null || (str3 = bundle.getString("login_panel_type", "")) == null) {
            str3 = "";
        }
        c35936E8m.LIZJ("login_panel_type", str3);
        if (bundle != null && (string = bundle.getString("channel", "")) != null) {
            str4 = string;
        }
        c35936E8m.LIZJ("channel", str4);
        c35936E8m.LIZ(-1, "is_from_express_login");
        c35936E8m.LIZ(0, "is_express_login");
        c35936E8m.LIZJ("prev_login_platform", (String) PrevLoginPlatformService.LJIIL().getPlatform().getValue());
        c35936E8m.LIZ(PrevLoginPlatformService.LJIIL().LJIIIZ(), "encouraged_platform");
        if (PrevLoginPlatformService.LJIIL().LIZ()) {
            c35936E8m.LIZ(PrevLoginPlatformService.LJIIL().LJII(), "is_plugin_did_ab_recv");
        }
        c35936E8m.LIZ(C38985FRt.LIZIZ.LJIIL().LJII(str) ? 1 : 0, "is_forced_login_copywrite_show");
        LIZIZ(c35936E8m, map);
        LIZ(c35936E8m);
        FMX.LJIIL("login_notify", c35936E8m.LIZ);
    }

    public static void LJIILIIL(boolean z, String platform, String enterFrom, String enterMethod) {
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("platform", platform);
        c35936E8m.LIZLLL("enter_from", enterFrom);
        c35936E8m.LIZLLL("enter_method", enterMethod);
        c35936E8m.LIZ(z ? 1 : 0, "is_success");
        c35936E8m.LIZ(0, "error_code");
        FMX.LJIIL("verify_password_response", c35936E8m.LIZ);
    }

    public static void LJFF(boolean z, int i, String platform, InterfaceC68974R5e provider, java.util.Map map) {
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        String str5;
        String str6;
        String string;
        Bundle extras;
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(provider, "provider");
        C35936E8m c35936E8m = new C35936E8m();
        java.util.Map LIZJ = LIZJ(provider.getExtras());
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (LIZJ != null) {
            hashMap.putAll(LIZJ);
        }
        String Xg = provider.Xg();
        int i3 = 0;
        if (Xg == null || Xg.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str7 = "";
        if (z2 && ((extras = provider.getExtras()) == null || (Xg = extras.getString("enter_type")) == null)) {
            Xg = "";
        }
        LIZIZ(c35936E8m, hashMap);
        c35936E8m.LIZLLL("enter_method", provider.LJJLIIIJLLLLLLLZ());
        c35936E8m.LIZLLL("enter_from", provider.LJJLIIIJJI());
        c35936E8m.LIZLLL("channel", provider.channel());
        c35936E8m.LIZ(z ? 1 : 0, "is_register");
        c35936E8m.LIZLLL("login_panel_type", provider.LLZZ());
        c35936E8m.LIZLLL("carrier", C85579XiJ.LIZ());
        c35936E8m.LIZ(i, "error_code");
        c35936E8m.LIZ(LIZLLL("login_submit"), "stay_time");
        c35936E8m.LIZJ("enter_type", Xg);
        c35936E8m.LIZJ("platform", platform);
        Integer LIZIZ = HybridABInfoService.LIZJ().LIZIZ();
        if (LIZIZ != null) {
            c35936E8m.LIZ(LIZIZ.intValue(), "is_ab_backend_resp_received");
        }
        c35936E8m.LIZ(E6T.LJIIIIZZ ? 1 : 0, "is_hybrid_ab_api_rev");
        Bundle extras2 = provider.getExtras();
        if (extras2 == null || (str = extras2.getString("group_id")) == null) {
            str = "";
        }
        c35936E8m.LIZJ("group_id", str);
        Bundle extras3 = provider.getExtras();
        if (extras3 == null || (str2 = extras3.getString("author_id")) == null) {
            str2 = "";
        }
        c35936E8m.LIZJ("author_id", str2);
        Bundle extras4 = provider.getExtras();
        if (extras4 == null || (str3 = extras4.getString("previous_login_method")) == null) {
            str3 = "";
        }
        c35936E8m.LIZJ("previous_login_method", str3);
        Bundle extras5 = provider.getExtras();
        if (extras5 == null || (str4 = extras5.getString("prev_login_platform")) == null) {
            str4 = "";
        }
        c35936E8m.LIZJ("prev_login_platform", str4);
        Bundle extras6 = provider.getExtras();
        if (extras6 != null) {
            i2 = extras6.getInt("encouraged_platform");
        } else {
            i2 = 0;
        }
        c35936E8m.LIZ(i2, "encouraged_platform");
        Bundle extras7 = provider.getExtras();
        if (extras7 == null || (str5 = extras7.getString("login_panel_type")) == null) {
            str5 = "";
        }
        c35936E8m.LIZJ("login_panel_type", str5);
        Bundle extras8 = provider.getExtras();
        if (extras8 != null) {
            i3 = extras8.getInt("login_last_time");
        }
        c35936E8m.LIZ(i3, "login_last_time");
        c35936E8m.LIZ(EOO.LIZIZ(), "is_in_personalized_nuj");
        Bundle extras9 = provider.getExtras();
        if (extras9 == null || (str6 = extras9.getString("sdk_name", "")) == null) {
            str6 = "";
        }
        c35936E8m.LIZJ("sdk_name", str6);
        Bundle extras10 = provider.getExtras();
        if (extras10 != null && (string = extras10.getString("sdk_version", "")) != null) {
            str7 = string;
        }
        c35936E8m.LIZJ("sdk_version", str7);
        c35936E8m.LIZ(C38985FRt.LIZIZ.LJIIL().LJII(provider.LJJLIIIJLLLLLLLZ()) ? 1 : 0, "is_forced_login_copywrite_show");
        FMX.LJIIL("login_failure", c35936E8m.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x018d, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) != false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(java.lang.Boolean r10, java.lang.String r11, X.InterfaceC68974R5e r12, boolean r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68972R5c.LJII(java.lang.Boolean, java.lang.String, X.R5e, boolean, java.util.Map):void");
    }

    public static void LJIIIZ(boolean z, String platform, InterfaceC68974R5e provider, QTZ qtz, java.util.Map map) {
        boolean z2;
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        int i2;
        String str6;
        long j2;
        long j3;
        String string;
        Bundle extras;
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(provider, "provider");
        C35936E8m c35936E8m = new C35936E8m();
        java.util.Map LIZJ = LIZJ(provider.getExtras());
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (LIZJ != null) {
            hashMap.putAll(LIZJ);
        }
        String Xg = provider.Xg();
        if (Xg == null || Xg.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str7 = "";
        if (z2 && ((extras = provider.getExtras()) == null || (Xg = extras.getString("enter_type")) == null)) {
            Xg = "";
        }
        LIZIZ(c35936E8m, hashMap);
        c35936E8m.LIZLLL("enter_method", provider.LJJLIIIJLLLLLLLZ());
        c35936E8m.LIZLLL("enter_from", provider.LJJLIIIJJI());
        c35936E8m.LIZLLL("channel", provider.channel());
        c35936E8m.LIZ(z ? 1 : 0, "is_register");
        c35936E8m.LIZ(0, "error_code");
        if (qtz != null) {
            j = qtz.LIZ;
        } else {
            j = -1;
        }
        c35936E8m.LIZIZ(j, "user_id");
        c35936E8m.LIZLLL("carrier", C85579XiJ.LIZ());
        c35936E8m.LIZ(LIZLLL("login_submit"), "stay_time");
        c35936E8m.LIZJ("enter_type", Xg);
        c35936E8m.LIZJ("platform", platform);
        Bundle extras2 = provider.getExtras();
        if (extras2 == null || (str = extras2.getString("group_id")) == null) {
            str = "";
        }
        c35936E8m.LIZJ("group_id", str);
        Bundle extras3 = provider.getExtras();
        if (extras3 == null || (str2 = extras3.getString("author_id")) == null) {
            str2 = "";
        }
        c35936E8m.LIZJ("author_id", str2);
        Bundle extras4 = provider.getExtras();
        if (extras4 == null || (str3 = extras4.getString("previous_login_method")) == null) {
            str3 = "";
        }
        c35936E8m.LIZJ("previous_login_method", str3);
        Bundle extras5 = provider.getExtras();
        if (extras5 == null || (str4 = extras5.getString("prev_login_platform")) == null) {
            str4 = "";
        }
        c35936E8m.LIZJ("prev_login_platform", str4);
        Bundle extras6 = provider.getExtras();
        if (extras6 != null) {
            i = extras6.getInt("encouraged_platform");
        } else {
            i = 0;
        }
        c35936E8m.LIZ(i, "encouraged_platform");
        Bundle extras7 = provider.getExtras();
        if (extras7 == null || (str5 = extras7.getString("login_panel_type")) == null) {
            str5 = "";
        }
        c35936E8m.LIZJ("login_panel_type", str5);
        Bundle extras8 = provider.getExtras();
        if (extras8 != null) {
            i2 = extras8.getInt("login_last_time");
        } else {
            i2 = 0;
        }
        c35936E8m.LIZ(i2, "login_last_time");
        Integer LIZIZ = HybridABInfoService.LIZJ().LIZIZ();
        if (LIZIZ != null) {
            c35936E8m.LIZ(LIZIZ.intValue(), "is_ab_backend_resp_received");
        }
        c35936E8m.LIZ(E6T.LJIIIIZZ ? 1 : 0, "is_hybrid_ab_api_rev");
        LIZ(c35936E8m);
        c35936E8m.LIZ(EOO.LIZIZ(), "is_in_personalized_nuj");
        Bundle extras9 = provider.getExtras();
        if (extras9 == null || (str6 = extras9.getString("sdk_name", "")) == null) {
            str6 = "";
        }
        c35936E8m.LIZJ("sdk_name", str6);
        Bundle extras10 = provider.getExtras();
        if (extras10 != null && (string = extras10.getString("sdk_version", "")) != null) {
            str7 = string;
        }
        c35936E8m.LIZJ("sdk_version", str7);
        c35936E8m.LIZ(C38985FRt.LIZIZ.LJIIL().LJII(provider.LJJLIIIJLLLLLLLZ()) ? 1 : 0, "is_forced_login_copywrite_show");
        FMX.LJIIL("login_success", c35936E8m.LIZ);
        String LJJLIIIJJI = provider.LJJLIIIJJI();
        String LJJLIIIJLLLLLLLZ = provider.LJJLIIIJLLLLLLLZ();
        String Xg2 = provider.Xg();
        if (qtz != null) {
            j2 = qtz.LIZ;
        } else {
            j2 = -1;
        }
        HH1.LIZ(LJJLIIIJJI, "enterFrom", LJJLIIIJLLLLLLLZ, "enterMethod", Xg2, "enterType");
        Keva keva = G23.LIZ;
        if (!keva.contains("mandatory_login_shown_millis")) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (keva.contains("mandatory_login_shown_millis")) {
            j3 = currentTimeMillis - keva.getLong("mandatory_login_shown_millis", currentTimeMillis);
        } else {
            j3 = -1;
        }
        keva.erase("mandatory_login_shown_millis");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", LJJLIIIJLLLLLLLZ);
        c188727au.LJIIIZ("enter_from", LJJLIIIJJI);
        c188727au.LJIIIZ("enter_type", Xg2);
        c188727au.LIZLLL(z ? 1 : 0, "is_register");
        c188727au.LIZLLL(0, "error_code");
        c188727au.LJ(j2, "user_id");
        c188727au.LJIIIZ("platform", platform);
        if (j3 != -1) {
            c188727au.LJ(j3, "duration");
        }
        FMX.LJIIL("onboarding_forced_login_success", c188727au.LIZ);
    }

    public static void LJIIL(int i, String enterFrom, String enterMethod, String str, Integer num) {
        int i2;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", enterFrom);
        c35936E8m.LIZLLL("enter_method", enterMethod);
        if (i == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c35936E8m.LIZ(i2, "is_success");
        c35936E8m.LIZ(i, "error_code");
        if (num != null) {
            c35936E8m.LIZ(num.intValue(), "send_reason");
        }
        if (str != null) {
            c35936E8m.LIZJ("page", str);
        }
        FMX.LJIIL("email_code_verification_result", c35936E8m.LIZ);
        C1JD.LJJI("email_bind_status", enterFrom, enterMethod, str, "verified_old_email");
    }

    public static /* synthetic */ void LJIIIIZZ(Boolean bool, String str, InterfaceC68974R5e interfaceC68974R5e, boolean z, java.util.Map map, int i) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            map = null;
        }
        LJII(bool, str, interfaceC68974R5e, z, map);
    }

    public static void LJIIJJI(boolean z, String platform, String enterFrom, String enterMethod, String loginPanelType, int i, InterfaceC68974R5e interfaceC68974R5e, String str) {
        String str2;
        Bundle bundle;
        String str3;
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(loginPanelType, "loginPanelType");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("platform", platform);
        c35936E8m.LIZLLL("enter_from", enterFrom);
        c35936E8m.LIZLLL("enter_method", enterMethod);
        c35936E8m.LIZLLL("login_panel_type", loginPanelType);
        c35936E8m.LIZ(z ? 1 : 0, "is_success");
        if (z) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        c35936E8m.LIZLLL("status", str2);
        c35936E8m.LIZ(i, "error_code");
        Object obj = null;
        if (interfaceC68974R5e != null) {
            bundle = interfaceC68974R5e.getExtras();
        } else {
            bundle = null;
        }
        java.util.Map LIZJ = LIZJ(bundle);
        if (LIZJ != null) {
            obj = LIZJ.get("page");
        }
        if (!(obj instanceof String) || (str3 = (String) obj) == null) {
            str3 = "";
        }
        c35936E8m.LIZLLL("page", str3);
        if (str != null) {
            c35936E8m.LIZJ("pw_strength", str);
        }
        FMX.LJIIL("set_password_response", c35936E8m.LIZ);
    }

    public static void LJIIJ(String enterFrom, String enterMethod, String loginPanelType, int i, String sendMethod, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i3, int i4) {
        String str8;
        String str9;
        String str10 = str4;
        String str11 = str3;
        String str12 = str6;
        String str13 = str5;
        String str14 = str7;
        int i5 = i3;
        if ((i4 & 256) != 0) {
            str11 = null;
        }
        if ((i4 & 512) != 0) {
            str10 = null;
        }
        if ((i4 & 1024) != 0) {
            str13 = null;
        }
        if ((i4 & 2048) != 0) {
            str12 = null;
        }
        if ((i4 & 4096) != 0) {
            str14 = null;
        }
        if ((i4 & 16384) != 0) {
            i5 = -1;
        }
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(loginPanelType, "loginPanelType");
        o.LJIIIZ(sendMethod, "sendMethod");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("send_method", sendMethod);
        c35936E8m.LIZ(i2, "send_reason");
        c35936E8m.LIZLLL("send_type", str);
        if (i == 0) {
            str8 = "success";
        } else {
            str8 = "fail";
        }
        c35936E8m.LIZLLL("status", str8);
        c35936E8m.LIZ(i, "error_code");
        c35936E8m.LIZLLL("fail_info", str2);
        c35936E8m.LIZLLL("params_for_special", "uc_login");
        try {
            Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "phone");
            o.LJII(LLILL, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            C39405FdJ.LJFF.getClass();
            str9 = C39571Ffz.LJIIIIZZ((TelephonyManager) LLILL);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            str9 = "";
        }
        c35936E8m.LIZLLL("carrier", str9);
        c35936E8m.LIZLLL("enter_type", null);
        c35936E8m.LIZ(i5, WM7.SCENE_SERVICE);
        c35936E8m.LIZLLL("profile_bind_from", str10);
        c35936E8m.LIZLLL("enter_from", enterFrom);
        c35936E8m.LIZLLL("enter_method", enterMethod);
        c35936E8m.LIZLLL("login_panel_type", loginPanelType);
        c35936E8m.LIZLLL("bind_type", str13);
        c35936E8m.LIZLLL("platform", str12);
        c35936E8m.LIZLLL("page", str14);
        if (!TextUtils.isEmpty(str11)) {
            try {
                C66516Q8q LJIIL = C66513Q8n.LIZJ().LJIIL(str11, null);
                c35936E8m.LIZ(LJIIL.getCountryCode(), "phone_country");
                c35936E8m.LIZ(String.valueOf(LJIIL.getNationalNumber()).length(), "phone_number_cnt");
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        FMX.LJIIL("send_sms", c35936E8m.LIZ);
    }
}
