package X;

import org.json.JSONObject;

/* renamed from: X.0U3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0U3 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, JSONObject jSONObject) {
        BZI LIZIZ = C0JU.LIZIZ("livesdk_kyc_form_camera_cancel", str, "shoot_type", str2, "page_name");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        LIZIZ.LJJ(jSONObject);
        LIZIZ.LJJIIJZLJL();
    }

    public static void LIZJ(String str, String str2, JSONObject jSONObject) {
        BZI LIZIZ = C0JU.LIZIZ("livesdk_kyc_form_camera_page_show", str, "shoot_type", str2, "page_name");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        LIZIZ.LJJ(jSONObject);
        LIZIZ.LJJIIJZLJL();
    }

    public static void LJ(String str, String str2, JSONObject jSONObject) {
        BZI LIZIZ = C0JU.LIZIZ("livesdk_kyc_form_popup_show", str, "shoot_type", str2, "popup_type");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        LIZIZ.LJJ(jSONObject);
        LIZIZ.LJJIIJZLJL();
    }

    public static void LIZIZ(String str, String str2, String str3, JSONObject jSONObject) {
        BZI LIZIZ = C0JU.LIZIZ("livesdk_kyc_form_camera_process_complete", str, "shoot_type", str2, "page_name");
        LIZIZ.LJIJJ(str3, "status");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        LIZIZ.LJJ(jSONObject);
        LIZIZ.LJJIIJZLJL();
    }

    public static void LIZLLL(String str, String str2, String str3, JSONObject jSONObject) {
        BZI LIZIZ = C0JU.LIZIZ("livesdk_kyc_form_popup_click", str, "shoot_type", str2, "popup_type");
        LIZIZ.LJIJJ(str3, "click_type");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        LIZIZ.LJJ(jSONObject);
        LIZIZ.LJJIIJZLJL();
    }
}
