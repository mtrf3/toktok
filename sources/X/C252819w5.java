package X;

import com.bytedance.keva.Keva;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.9w5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252819w5 {
    public static boolean LIZ(String str) {
        if (C00F.LIZ(31744, 1, "enable_frequency_switch", true) == 0) {
            return true;
        }
        List<String> LJJIJIIJI = C47261Igj.LJJIJIIJI("profile_page", "manage_account_page");
        int i = Keva.getRepo("email_consent_keva").getInt("email_consent_show_times", 0);
        if (i == 0) {
            return true;
        }
        C2YJ c2yj = C2YJ.LIZIZ;
        Integer edmEmailConsentSettingByKey = c2yj.LIZ.getEdmEmailConsentSettingByKey("edm_collect_consent_page_show_maximum", 5);
        o.LJIIIIZZ(edmEmailConsentSettingByKey, "get().getEdmEmailConsent…L_CONSENT_MAX_SHOW_TIMES)");
        if (i >= edmEmailConsentSettingByKey.intValue()) {
            return false;
        }
        Integer edmEmailConsentSettingByKey2 = c2yj.LIZ.getEdmEmailConsentSettingByKey("edm_consent_same_entry_interval", 30);
        Integer edmEmailConsentSettingByKey3 = c2yj.LIZ.getEdmEmailConsentSettingByKey("edm_consent_global_entry_interval", 7);
        long j = Keva.getRepo("email_consent_keva").getLong(str, 0L);
        if (j != 0 && System.currentTimeMillis() - j < TimeUnit.DAYS.toMillis(edmEmailConsentSettingByKey2.intValue())) {
            return false;
        }
        for (String str2 : LJJIJIIJI) {
            if (!o.LJ(str2, str)) {
                long j2 = Keva.getRepo("email_consent_keva").getLong(str2, 0L);
                if (j2 != 0 && System.currentTimeMillis() - j2 < TimeUnit.DAYS.toMillis(edmEmailConsentSettingByKey3.intValue())) {
                    return false;
                }
            }
        }
        return true;
    }
}
