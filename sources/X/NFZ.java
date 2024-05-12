package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageSurveyModel;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NFZ {
    public static LandingPageSurveyModel LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static long LJFF;
    public static boolean LJI;
    public static InterfaceC65784Pro<C76800UCe> LJII;

    public static void LIZ() {
        LIZIZ = null;
        LIZJ = null;
        LIZLLL = null;
        LJ = null;
        LIZ = null;
        LJII = null;
        LJI = false;
    }

    public static void LIZIZ(Activity activity, String str, InterfaceC65784Pro interfaceC65784Pro, EnumC46492IMm enumC46492IMm) {
        Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
        buildUpon.appendQueryParameter("use_spark", "1");
        Bundle LIZ2 = C01R.LIZ("ad_landing_show_landing_page_survey", true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aid", LIZIZ);
        jSONObject.put("cid", LIZJ);
        jSONObject.put("req_id", LIZLLL);
        jSONObject.put("logExtra", LJ);
        jSONObject.put("triggerSource", enumC46492IMm.getValue());
        LIZ2.putString("initialData", jSONObject.toString());
        NVO nvo = new NVO(0);
        C59421NTt c59421NTt = new C59421NTt(EnumC59053NFp.ONLY_RENDER, "", 0, false, new NIA("feed_land_page_survey", buildUpon.toString(), LIZ2, C59055NFr.LIZ("feed_land_page_survey"), new NLX(nvo), false, null, false, 992), null, false, 220);
        AbstractC59064NGa LIZJ2 = AdHybridContainerManager.LIZLLL().LIZJ(new C59066NGc("feed_land_page_survey", EnumC59241NMv.SPARK, activity, new NGY(LIZ2.getString("aweme_creative_id"), LIZ2.getString("bundle_download_app_log_extra"), LIZ2.getString("aweme_group_id"), Integer.valueOf(LIZ2.getInt("charge_type")), Integer.valueOf(LIZ2.getInt("ad_system_origin")), 32)), c59421NTt);
        LIZJ2.LJIILJJIL(new NVV(nvo));
        LIZJ2.LJIIZILJ(new NVR(nvo));
        LIZJ2.LJIILL(new NVQ(nvo));
        LIZJ2.LJIL(c59421NTt, new NAC(interfaceC65784Pro));
    }
}
