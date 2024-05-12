package X;

import com.ss.android.ugc.aweme.app.SharePrefCache;
import defpackage.e1;
import defpackage.m0;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.IkJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47483IkJ {
    public static boolean LIZJ() {
        if (C44432HcC.LJLJI) {
            return ((Boolean) C35704Dzo.LIZ.getValue()).booleanValue();
        }
        return e1.LIZ(31744, "is_break_resume_check_enabled", true, true);
    }

    public static boolean LIZLLL() {
        if (C44432HcC.LJLJI) {
            return ((Boolean) C35704Dzo.LIZIZ.getValue()).booleanValue();
        }
        return e1.LIZ(31744, "is_force_request_validation", true, false);
    }

    public static boolean LJ() {
        if (C44432HcC.LJLJI) {
            if (FRG.LIZ == null) {
                FRG.LIZ = m0.LIZIZ(31744, "enable_ies_route", true, true);
            }
            Boolean bool = FRG.LIZ;
            o.LJI(bool);
            return bool.booleanValue();
        }
        return e1.LIZ(31744, "enable_ies_route", true, true);
    }

    public static boolean LJFF() {
        if (SharePrefCache.inst().getVideoPreload().LIZ().booleanValue() && (C48207Ivz.LIZ(EF7.LIZIZ()) || SharePrefCache.inst().getWeakNetPreLoadSwitch().LIZ().intValue() == 1)) {
            return true;
        }
        return false;
    }

    public static C198517qh LIZ(C198517qh c198517qh) {
        c198517qh.LIZLLL("playerType", IWF.LJJLIIIIJ().getPlayerType().toString());
        c198517qh.LIZLLL("from", "PlayerCommonParamManager");
        c198517qh.LIZ(Boolean.valueOf(LIZJ()), "is_break_resume_check_enabled");
        c198517qh.LIZ(Boolean.valueOf(LIZLLL()), "is_force_request_validation");
        c198517qh.LIZ(Boolean.valueOf(LJ()), "is_play_link_select_enabled");
        c198517qh.LIZ(Boolean.valueOf(LJFF()), "is_preload_enabled");
        c198517qh.LIZ(SharePrefCache.inst().getVideoPreload().LIZ(), "need_pre_load_in_settings");
        c198517qh.LIZIZ(SharePrefCache.inst().getWeakNetPreLoadSwitch().LIZ(), "weak_net_pre_load_switch_in_settings");
        FFL.LJIIIZ().getClass();
        boolean z = false;
        c198517qh.LIZ(Boolean.valueOf(FFL.LJ(31744, "use_video_cache_http_dns", true, false)), "use_video_cache_http_dns");
        if (!C47485IkL.LIZ()) {
            z = C47455Ijr.LJIIIZ;
        }
        c198517qh.LIZ(Boolean.valueOf(z), "video_cache_use_ttnet");
        return c198517qh;
    }

    public static JSONObject LIZIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("playerType", IWF.LJJLIIIIJ().getPlayerType().toString());
        jSONObject.put("from", "PlayerCommonParamManager");
        jSONObject.put("is_break_resume_check_enabled", LIZJ());
        jSONObject.put("is_force_request_validation", LIZLLL());
        jSONObject.put("is_play_link_select_enabled", LJ());
        jSONObject.put("is_preload_enabled", LJFF());
        jSONObject.put("need_pre_load_in_settings", SharePrefCache.inst().getVideoPreload().LIZ());
        jSONObject.put("weak_net_pre_load_switch_in_settings", SharePrefCache.inst().getWeakNetPreLoadSwitch().LIZ());
        FFL.LJIIIZ().getClass();
        boolean z = true;
        if (FFL.LJIIJ(31744, 1, "use_ttnet", true) != 1) {
            z = false;
        }
        jSONObject.put("video_cache_use_ttnet", z);
        return jSONObject;
    }
}
