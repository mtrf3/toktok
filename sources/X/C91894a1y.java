package X;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.applog.AppLog;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.bnpl.network.model.BNPLEntryData;
import com.ss.android.ugc.aweme.bnpl.network.model.Institution;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a1y, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91894a1y {
    public static JSONObject LIZ;

    public static String LIZIZ(ContentResolver contentResolver) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {contentResolver, "android_id"};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", "-5077386032264789615");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102004, "android/provider/Settings$Secure", "getString", Settings.Secure.class, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", null, objArr, Settings.Secure.class, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String string = Settings.Secure.getString(contentResolver, "android_id");
        c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", string, objArr, Settings.Secure.class, c65300Pk0, true);
        return string;
    }

    public static String LIZJ() {
        String optString;
        String optString2;
        String str;
        User user;
        String str2;
        Institution institutionInfo;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = LIZ;
            String str3 = null;
            if (jSONObject2 == null) {
                optString = null;
            } else {
                optString = jSONObject2.optString("device_fingerprint_id");
            }
            JSONObject jSONObject3 = LIZ;
            if (jSONObject3 == null) {
                optString2 = null;
            } else {
                optString2 = jSONObject3.optString("gp_device_fingerprint_id");
            }
            BNPLEntryData bNPLEntryData = C92006a3m.LIZ;
            if (bNPLEntryData != null && (institutionInfo = bNPLEntryData.getInstitutionInfo()) != null) {
                str = institutionInfo.getInstitution();
            } else {
                str = null;
            }
            jSONObject.put("fi", str);
            jSONObject.put("device_platform", "android");
            jSONObject.put("device_fingerprint_id", optString);
            jSONObject.put("app_version", EF7.LJII());
            jSONObject.put("gp_device_fingerprint_id", optString2);
            jSONObject.put("app_id", String.valueOf(EF7.LJIIIZ));
            jSONObject.put("app_name", EF7.LIZ());
            jSONObject.put("app_region", C85990Xow.LIZIZ());
            String LIZJ = FVR.LIZJ();
            if (TextUtils.isEmpty(LIZJ)) {
                LIZJ = "-1";
            }
            jSONObject.put("did", LIZJ);
            jSONObject.put("current_region", C85990Xow.LIZ());
            jSONObject.put("user_agent", System.getProperty("http.agent"));
            jSONObject.put("ip_address", C91926a2U.LIZIZ());
            String str4 = Build.MODEL;
            jSONObject.put("device_type", str4);
            jSONObject.put("timezone_name", TimeZone.getDefault().getID());
            IAccountService LJIJ = AccountService.LJIJ();
            o.LJIIIIZZ(LJIJ, "get().getService(IAccountService::class.java)");
            RBY LJFF = LJIJ.LJFF();
            if (LJFF != null) {
                user = LJFF.getCurUser();
            } else {
                user = null;
            }
            if (user != null) {
                str3 = user.getUid();
            }
            jSONObject.put("uid", str3);
            jSONObject.put("channel", EF7.LJIILIIL);
            jSONObject.put("iid", AppLog.LIZJ());
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("android");
            LIZ2.append(Build.VERSION.RELEASE);
            jSONObject.put("os_version", X1D.LIZIZ(LIZ2));
            jSONObject.put("screen_height", KL2.LJIIIZ(EF7.LIZIZ()));
            jSONObject.put("screen_width", KL2.LJIIJJI(EF7.LIZIZ()));
            jSONObject.put("app_language", SettingServiceImpl.LIZ().getAppLanguage());
            jSONObject.put("sys_language", Locale.getDefault().getLanguage());
            jSONObject.put("sys_region", C85990Xow.LJFF());
            jSONObject.put("terminal_country", C85990Xow.LIZIZ());
            jSONObject.put("version_name", EF7.LJII());
            jSONObject.put("locale", Locale.getDefault().getLanguage());
            jSONObject.put("platform", "android");
            jSONObject.put("carrier_region", C85990Xow.LJ());
            jSONObject.put("build_board", Build.BOARD);
            jSONObject.put("build_brand", Build.BRAND);
            jSONObject.put("build_cpu_abi", Build.CPU_ABI);
            jSONObject.put("build_device", Build.DEVICE);
            jSONObject.put("build_manufacturer", Build.MANUFACTURER);
            jSONObject.put("build_model", str4);
            jSONObject.put("build_product", Build.PRODUCT);
            jSONObject.put("is_root", C39687Fhr.LJIJ());
            jSONObject.put("uuid", UUID.randomUUID());
            try {
                str2 = LIZ(EF7.LIZIZ().getContentResolver());
            } catch (Exception unused) {
                str2 = "";
            }
            jSONObject.put("android_id", str2);
            jSONObject.put("eth_ip", String.valueOf(C91926a2U.LIZ()));
            jSONObject.put("true_ip", String.valueOf(C91926a2U.LIZIZ()));
            String jSONObject4 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject4, "jsonObject.toString()");
            return jSONObject4;
        } catch (Throwable unused2) {
            return "{}";
        }
    }

    public static String LIZ(ContentResolver contentResolver) {
        if (TextUtils.equals("android_id", "android_id")) {
            if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(102004)) {
                return "";
            }
            if (TextUtils.isEmpty(E77.LIZ)) {
                E77.LIZ = LIZIZ(contentResolver);
            }
            return E77.LIZ;
        }
        return LIZIZ(contentResolver);
    }
}
