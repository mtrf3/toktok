package X;

import android.text.TextUtils;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.statistic.model.EventMessageModel;
import com.bytedance.geckox.statistic.model.SyncEventModel;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OD6 {
    public static String LIZ = "";

    public static InterfaceC61465OAj LIZJ() {
        C61532OCy c61532OCy = EBC.LIZ;
        c61532OCy.LIZIZ();
        return c61532OCy.LJ.getStatisticMonitor();
    }

    public static void LIZ(JSONObject jSONObject) {
        Common LIZLLL = EBC.LIZ.LIZLLL();
        jSONObject.put("params_for_special", "gecko");
        jSONObject.put("os", 0);
        jSONObject.put("region", LIZLLL.region);
        jSONObject.put("sdk_version", LIZLLL.sdkVersion);
        jSONObject.put("aid", LIZLLL.aid);
    }

    public static JSONObject LIZIZ(C61543ODj c61543ODj) {
        JSONObject jSONObject = new JSONObject();
        LIZ(jSONObject);
        jSONObject.put("api_version", c61543ODj.LJI);
        jSONObject.put("http_status", c61543ODj.LIZJ);
        jSONObject.put("err_msg", c61543ODj.LIZ);
        jSONObject.put("req_type", c61543ODj.LIZLLL);
        jSONObject.put("is_intercept", c61543ODj.LJ);
        jSONObject.put("err_code", c61543ODj.LJFF);
        if (!TextUtils.isEmpty(c61543ODj.LIZIZ)) {
            jSONObject.put("x_tt_logid", c61543ODj.LIZIZ);
        }
        if (!TextUtils.isEmpty(LIZ) && TextUtils.isEmpty(c61543ODj.LIZIZ)) {
            jSONObject.put("x_tt_logid_latest", LIZ);
        }
        return jSONObject;
    }

    public static void LIZLLL(ODI odi) {
        InterfaceC61465OAj LIZJ = LIZJ();
        if (LIZJ == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            LIZ(jSONObject);
            if (!TextUtils.isEmpty(odi.LJLIL)) {
                jSONObject.put("tt_trace_tag_id", odi.LJLIL);
            }
            if (!TextUtils.isEmpty(odi.LJLILLLLZI)) {
                jSONObject.put("x_response_cache", odi.LJLILLLLZI);
            }
            if (!TextUtils.isEmpty(odi.LJLJI)) {
                jSONObject.put("client_ip", odi.LJLJI);
            }
            if (!TextUtils.isEmpty(odi.LJLJJI)) {
                jSONObject.put("client_ip_version", odi.LJLJJI);
            }
            if (!TextUtils.isEmpty(odi.LJLJJL)) {
                jSONObject.put("server_ip", odi.LJLJJL);
            }
            jSONObject.put("http_status", odi.LJLJJLL);
            if (odi.LJLJJLL != 200) {
                jSONObject.put("error_code", odi.LJLJL);
            }
            jSONObject.put("timing_dns", odi.LJLJLJ);
            jSONObject.put("timing_connect", odi.LJLJLLL);
            jSONObject.put("timing_send", odi.LJLL);
            jSONObject.put("timing_ssl", odi.LJLLI);
            jSONObject.put("timing_wait", odi.LJLLILLLL);
            jSONObject.put("timing_proxy", 0L);
            jSONObject.put("timing_receive", odi.LJLLJ);
            if (!TextUtils.isEmpty(odi.LJLLL)) {
                jSONObject.put("timing_isSocketReused", odi.LJLLL);
            }
            jSONObject.put("timing_total", odi.LJLLLL);
            if (!TextUtils.isEmpty(odi.LJLLLLLL)) {
                jSONObject.put("access", odi.LJLLLLLL);
            }
            jSONObject.put("download_duration", odi.LJLZ);
            jSONObject.put("cdn_domain", odi.LJZI);
            jSONObject.put("package_size", odi.LJZL);
            jSONObject.put("url", odi.LJZ);
            LIZJ.LIZ("geckosdk_cdn_stats", jSONObject);
        } catch (JSONException e) {
            OC6.LJ("gecko-debug-tag", "UploadStatistic.uploadCDNDownload", e);
        }
    }

    public static void LJ(C61543ODj c61543ODj) {
        InterfaceC61465OAj LIZJ = LIZJ();
        if (LIZJ != null) {
            try {
                LIZJ.LIZ("geckosdk_query_pkgs", LIZIZ(c61543ODj));
            } catch (Throwable th) {
                OC6.LJ("gecko-debug-tag", "UploadStatistic.query.pkgs:", th);
            }
        }
    }

    public static void LJFF(O08 o08) {
        InterfaceC61465OAj LIZJ = LIZJ();
        if (LIZJ == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            LIZ(jSONObject);
            o08.LIZ(jSONObject);
            LIZJ.LIZ("geckosdk_clean_stats", jSONObject);
        } catch (Exception e) {
            OC6.LJ("gecko-debug-tag", "UploadStatistic.uploadCleanChannel", e);
        }
    }

    public static void LJIIJ(OET oet) {
        InterfaceC61465OAj LIZJ = LIZJ();
        if (LIZJ != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                LIZ(jSONObject);
                jSONObject.put("api_version", oet.LIZ);
                jSONObject.put("http_status", oet.LIZJ);
                jSONObject.put("err_msg", oet.LJ);
                jSONObject.put("req_type", oet.LJFF);
                jSONObject.put("err_code", oet.LIZLLL);
                if (!TextUtils.isEmpty(oet.LIZIZ)) {
                    jSONObject.put("x_tt_logid", oet.LIZIZ);
                }
                LIZJ.LIZ("geckosdk_query_settings", jSONObject);
            } catch (Throwable th) {
                OC6.LJ("gecko-debug-tag", "UploadStatistic.query.settings:", th);
            }
        }
    }

    public static void LJIIJJI(SyncEventModel syncEventModel) {
        InterfaceC61465OAj LIZJ = LIZJ();
        if (LIZJ != null) {
            try {
                LIZJ.LIZ("geckosdk_bytesync_stats", new JSONObject(OXZ.LIZIZ.LIZ.LJIILL(syncEventModel)));
            } catch (Throwable th) {
                OC6.LJ("gecko-debug-tag", "UploadStatistic.uploadSyncEvent:", th);
            }
        }
    }

    public static void LJIIL(UpdatePackage updatePackage) {
        InterfaceC61465OAj LIZJ = LIZJ();
        if (LIZJ == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            LIZ(jSONObject);
            updatePackage.putStatisticModelToJson(jSONObject);
            C61532OCy c61532OCy = EBC.LIZ;
            c61532OCy.LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig = c61532OCy.LJ;
            if (geckoGlobalConfig != null) {
                jSONObject.put("root_directory", geckoGlobalConfig.getRootDirectory().getName());
            }
            if (!TextUtils.isEmpty(LIZ)) {
                if (jSONObject.has("x_tt_logid")) {
                    if (!LIZ.equals((String) jSONObject.get("x_tt_logid"))) {
                        jSONObject.put("x_tt_logid_latest", LIZ);
                    }
                } else {
                    jSONObject.put("x_tt_logid_latest", LIZ);
                }
            }
            LIZJ.LIZ("geckosdk_update_aggr_stats", jSONObject);
        } catch (Exception e) {
            OC6.LJ("gecko-debug-tag", "UploadStatistic.uploadUpdateAggr", e);
        }
    }

    public static void LJIIIZ(String str, String str2, String str3) {
        try {
            InterfaceC61465OAj LIZJ = LIZJ();
            if (LIZJ == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            LIZ(jSONObject);
            jSONObject.put("access_key", str);
            jSONObject.put("channel", str2);
            jSONObject.put("method", str3);
            LIZJ.LIZ("geckosdk_resource_access_method", jSONObject);
        } catch (Exception e) {
            OC6.LJ("gecko-debug-tag", "UploadStatistic.uploadResourceInfoToTea", e);
        }
    }

    public static void LJI(int i, String str, int i2, String str2) {
        LJII(i, str, str2, "", "", i2);
    }

    public static void LJII(int i, String str, String str2, String str3, String str4, int i2) {
        InterfaceC61465OAj LIZJ = LIZJ();
        if (LIZJ != null) {
            try {
                EventMessageModel eventMessageModel = new EventMessageModel(i, i2);
                eventMessageModel.setErrMsg(str);
                eventMessageModel.setExtra(str2);
                eventMessageModel.setDuration(0L);
                eventMessageModel.setAccessKey(str3);
                eventMessageModel.setChannels(str4);
                JSONObject jSONObject = new JSONObject(OXZ.LIZIZ.LIZ.LJIILL(eventMessageModel));
                LIZ(jSONObject);
                LIZJ.LIZ("geckosdk_event_message", jSONObject);
            } catch (Throwable th) {
                OC6.LJ("gecko-debug-tag", "UploadStatistic.uploadSyncEvent", th);
            }
        }
    }

    public static void LJIIIIZZ(String str, String str2, String str3, String str4, String str5, String str6) {
        if (!C61318O4s.LIZ.LIZIZ.get()) {
            return;
        }
        OAR.LIZ.LIZ().execute(new O5K(str, str2, str3, str4, str5, str6));
    }
}
