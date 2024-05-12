package X;

import android.app.Activity;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.GIk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41290GIk {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C41292GIm.LJLIL);

    public static IComplianceSettingsService LIZLLL() {
        return (IComplianceSettingsService) LIZ.getValue();
    }

    public static int LIZ() {
        Integer mode;
        AdPersonalitySettings LIZIZ = LIZIZ();
        if (LIZIZ != null && (mode = LIZIZ.getMode()) != null) {
            return mode.intValue();
        }
        return 0;
    }

    public static AdPersonalitySettings LIZIZ() {
        return LIZLLL().LJII();
    }

    public static int LIZJ() {
        Integer unifiedMode;
        AdPersonalitySettings LIZIZ = LIZIZ();
        if (LIZIZ != null && (unifiedMode = LIZIZ.getUnifiedMode()) != null) {
            return unifiedMode.intValue();
        }
        return 0;
    }

    public static AdFreeSubscription LJ() {
        AdPersonalitySettings LJII = LIZLLL().LJII();
        if (LJII != null) {
            return LJII.getSubscription();
        }
        return null;
    }

    public static Integer LJFF() {
        AdPersonalitySettings LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            return LIZIZ.getContentType();
        }
        return null;
    }

    public static Integer LJI() {
        AdPersonalitySettings LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            return LIZIZ.getPopUpStyle();
        }
        return null;
    }

    public static int LJII() {
        Integer isTeenagerMode;
        AdPersonalitySettings LIZIZ = LIZIZ();
        if (LIZIZ != null && (isTeenagerMode = LIZIZ.isTeenagerMode()) != null) {
            return isTeenagerMode.intValue();
        }
        return 1;
    }

    public static boolean LJIIIIZZ() {
        AdPersonalitySettings LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            return o.LJ(LIZIZ.getPARevisingSwitch(), Boolean.FALSE);
        }
        return false;
    }

    public static boolean LJIIIZ() {
        Boolean isUseBalancePrompt;
        AdPersonalitySettings LIZIZ = LIZIZ();
        if (LIZIZ != null && (isUseBalancePrompt = LIZIZ.isUseBalancePrompt()) != null) {
            return isUseBalancePrompt.booleanValue();
        }
        return false;
    }

    public static void LJIIJ(Activity context, boolean z) {
        int i;
        o.LJIIIZ(context, "context");
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONObject().put("field", "pers_ad_unified_mode").put("value", String.valueOf(i)));
        IComplianceSettingsService LIZLLL = LIZLLL();
        String jSONArray2 = jSONArray.toString();
        o.LJIIIIZZ(jSONArray2, "json.toString()");
        LIZLLL.LJIILL(jSONArray2, new C41282GIc(context, i));
    }

    public static void LJIIJJI(String str, boolean z) {
        int i;
        String str2;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONObject().put("field", "pers_ad_main_mode").put("value", String.valueOf(i)));
        C188727au c188727au = new C188727au();
        String str3 = "on";
        if (!z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c188727au.LJIIIZ("initial_status", str2);
        if (!z) {
            str3 = "off";
        }
        c188727au.LJIIIZ("final_status", str3);
        FMX.LJIIL("change_personalization_status", c188727au.LIZ);
        if (!o.LJ("", "")) {
            jSONArray.put(new JSONObject().put("field", "").put("value", str));
        }
        IComplianceSettingsService LIZLLL = LIZLLL();
        String jSONArray2 = jSONArray.toString();
        o.LJIIIIZZ(jSONArray2, "json.toString()");
        LIZLLL.LJIILL(jSONArray2, new C41283GId(i));
    }
}
