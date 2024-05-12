package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.common.util.NetworkUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PcF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64819PcF {
    public static void LIZJ(C64672PZs c64672PZs, JSONObject jSONObject) {
        if (c64672PZs != null) {
            try {
                jSONObject.put("nt_band_width", C48398Iz4.LIZ.LIZIZ());
                jSONObject.put("cdn_nt_band_width", C64823PcJ.LIZ.LIZIZ());
                jSONObject.put("cronet_open", C64734Pas.LJIIIZ(EF7.LIZIZ()).LJ());
                jSONObject.put("cronet_plugin_install", false);
                jSONObject.put("cronet_plugin_version", -1);
            } catch (Throwable unused) {
            }
            try {
                jSONObject.put("requestStart", c64672PZs.LJ);
                jSONObject.put("responseBack", c64672PZs.LJFF);
                jSONObject.put("completeReadResponse", c64672PZs.LJI);
                jSONObject.put("appLevelRequestStart", c64672PZs.LIZJ);
                jSONObject.put("beforeAllInterceptors", c64672PZs.LIZLLL);
                jSONObject.put("requestEnd", c64672PZs.LJII);
                jSONObject.put("recycleCount", c64672PZs.LJIIIIZZ);
                if (C64752PbA.LIZ()) {
                    jSONObject.put("netClientType", "CronetClient");
                } else {
                    jSONObject.put("netClientType", "TTOkhttp3Client");
                }
                if (c64672PZs.LJIJI == 0) {
                    jSONObject.put("timing_dns", c64672PZs.LJIIIZ);
                    jSONObject.put("timing_connect", c64672PZs.LJIIJ);
                    jSONObject.put("timing_ssl", c64672PZs.LJIIJJI);
                    jSONObject.put("timing_send", c64672PZs.LJIIL);
                    jSONObject.put("timing_waiting", c64672PZs.LJIILL);
                    jSONObject.put("timing_receive", c64672PZs.LJIILIIL);
                    jSONObject.put("timing_total", c64672PZs.LJIILLIIL);
                    jSONObject.put("timing_isSocketReused", c64672PZs.LJIILJJIL);
                    jSONObject.put("timing_totalSendBytes", c64672PZs.LJIIZILJ);
                    jSONObject.put("timing_totalReceivedBytes", c64672PZs.LJIJ);
                    jSONObject.put("timing_remoteIP", c64672PZs.LIZ);
                    jSONObject.put("request_log", c64672PZs.LJIL);
                }
                JSONObject jSONObject2 = c64672PZs.LJJ;
                if (jSONObject2 != null) {
                    jSONObject.put("req_info", jSONObject2);
                }
                jSONObject.put("download", c64672PZs.LJJI);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final void LIZ(long j, long j2, String str, C64672PZs c64672PZs, JSONObject jSONObject) {
        FUA.LIZIZ("aweme_image_api", "", LIZIZ(true, j, j2, str, c64672PZs, null));
        try {
            C38354F3m.LJ(new String[1][0]);
            LIZJ(c64672PZs, jSONObject);
            if (C09970aH.LJII()) {
                throw new RuntimeException("ImageMonitor has not worked, please use ByteFresco or ByteGlide");
            }
        } catch (Throwable unused) {
        }
    }

    public static JSONObject LIZIZ(boolean z, long j, long j2, String str, C64672PZs c64672PZs, Throwable th) {
        double d;
        int i;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                if (str.contains("&config_retry=b")) {
                    jSONObject.put("log_config_retry", 1);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        String[] strArr = new String[1];
        if (TextUtils.isEmpty(strArr[0]) && c64672PZs != null) {
            strArr[0] = c64672PZs.LIZ;
            T t = c64672PZs.LIZIZ;
            if (t != 0) {
                ((C48153Iv7) t).getClass();
            }
        }
        if (c64672PZs != null) {
            jSONObject.put("requestStart", c64672PZs.LJ);
            jSONObject.put("responseBack", c64672PZs.LJFF);
            jSONObject.put("completeReadResponse", c64672PZs.LJI);
            jSONObject.put("requestEnd", c64672PZs.LJII);
            jSONObject.put("recycleCount", c64672PZs.LJIIIIZZ);
            if (c64672PZs.LJIJI == 0) {
                jSONObject.put("timing_dns", c64672PZs.LJIIIZ);
                jSONObject.put("timing_connect", c64672PZs.LJIIJ);
                jSONObject.put("timing_ssl", c64672PZs.LJIIJJI);
                jSONObject.put("timing_send", c64672PZs.LJIIL);
                jSONObject.put("timing_waiting", c64672PZs.LJIILL);
                jSONObject.put("timing_receive", c64672PZs.LJIILIIL);
                jSONObject.put("timing_total", c64672PZs.LJIILLIIL);
                jSONObject.put("timing_isSocketReused", c64672PZs.LJIILJJIL);
                jSONObject.put("timing_totalSendBytes", c64672PZs.LJIIZILJ);
                jSONObject.put("timing_totalReceivedBytes", c64672PZs.LJIJ);
                jSONObject.put("timing_remoteIP", c64672PZs.LIZ);
                jSONObject.put("request_log", c64672PZs.LJIL);
            }
            jSONObject.put("download", c64672PZs.LJJI);
        }
        if (C64752PbA.LIZ()) {
            jSONObject.put("netClientType", "CronetClient");
        } else {
            jSONObject.put("netClientType", "TTOkhttp3Client");
        }
        C48395Iz1 c48395Iz1 = C48398Iz4.LIZ;
        jSONObject.put("networkQuality", c48395Iz1.LIZIZ().toString());
        synchronized (c48395Iz1) {
            C48396Iz2 c48396Iz2 = c48395Iz1.LIZ;
            if (c48396Iz2 == null) {
                d = -1.0d;
            } else {
                d = c48396Iz2.LIZIZ;
            }
        }
        jSONObject.put("downloadSpeed", (int) d);
        if (!z && th != null) {
            jSONObject.put("errorDesc", android.util.Log.getStackTraceString(th));
        }
        jSONObject.put("duration", j);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("uri", UriProtector.parse(str));
        }
        if (j2 > 0) {
            jSONObject.put("timestamp", j2);
        }
        if (z) {
            i = 200;
        } else {
            i = C64920Pds.LIZIZ(th, strArr);
        }
        jSONObject.put("status", i);
        if (!TextUtils.isEmpty(strArr[0])) {
            jSONObject.put(C63832P3k.LIZ, strArr[0]);
        }
        jSONObject.put("network_type", NetworkUtils.getNetworkType(C16880lQ.LLLLL(EF7.LIZIZ())).getValue());
        return jSONObject;
    }
}
