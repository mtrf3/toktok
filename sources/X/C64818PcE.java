package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.ttnet.TTNetInit;
import com.google.gson.s;
import com.ss.android.ugc.aweme.services.TrafficStatisticsServiceImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PcE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64818PcE extends PP1 {
    public C64818PcE(Context context) {
        super(context);
    }

    @Override // X.PP1
    public final void LJ(C64672PZs c64672PZs, JSONObject jSONObject) {
        if (c64672PZs != null) {
            try {
                jSONObject.put("nt_band_width", C48398Iz4.LIZ.LIZIZ());
                jSONObject.put("cdn_nt_band_width", C64823PcJ.LIZ.LIZIZ());
                jSONObject.put("cronet_open", C64734Pas.LJIIIZ(TTNetInit.getTTNetDepend().getContext()).LJ());
                TTNetInit.getTTNetDepend().LIZIZ();
                jSONObject.put("cronet_plugin_install", true);
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
                JSONObject jSONObject2 = c64672PZs.LJJ;
                if (jSONObject2 != null) {
                    jSONObject.put("req_info", jSONObject2);
                }
                String str = c64672PZs.LJJIFFI;
                if (str != null && str.contains("x-tt-web-proxy")) {
                    jSONObject.put("webview_url", "webview://ttnet");
                }
                jSONObject.put("download", c64672PZs.LJJI);
                if ((c64672PZs instanceof C48112IuS) && !C47485IkL.LIZ()) {
                    jSONObject.put("player_id", ((C48112IuS) c64672PZs).LJJIL);
                    jSONObject.put("video_cache_use_ttnet", ((C48112IuS) c64672PZs).LJJIZ);
                    jSONObject.put("video_cache_retry_count", ((C48112IuS) c64672PZs).LJJJ);
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static void LJI(JSONObject jSONObject, C64672PZs c64672PZs, Throwable th, int i) {
        long j;
        int i2;
        int cronetInternalErrorCode;
        int i3;
        T t = c64672PZs.LIZIZ;
        long j2 = 0;
        if (t != 0) {
            long j3 = t.LJIIIIZZ;
            if (j3 > 0) {
                jSONObject.put("protect_timeout", j3);
                jSONObject.put("connect_timeout", c64672PZs.LIZIZ.LJFF);
                jSONObject.put("read_timeout", c64672PZs.LIZIZ.LJII);
                jSONObject.put("write_timeout", c64672PZs.LIZIZ.LJI);
            } else {
                jSONObject.put("connect_timeout", t.LIZJ);
                jSONObject.put("read_timeout", c64672PZs.LIZIZ.LIZLLL);
                jSONObject.put("write_timeout", c64672PZs.LIZIZ.LJ);
            }
        }
        if (((Boolean) C52730Kmk.LIZ.getValue()).booleanValue()) {
            jSONObject.put("priority_region", C85990Xow.LIZIZ());
        }
        C64738Paw c64738Paw = c64672PZs.LJJIJIIJIL;
        if (c64738Paw == null) {
            return;
        }
        jSONObject.put("resp_comp", c64738Paw.LJJJJZ);
        jSONObject.put("req_comp", c64738Paw.LJJJJZI);
        Long l = (Long) ((ConcurrentHashMap) c64738Paw.LJJII).get("CallServerInterceptor");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        jSONObject.put("parse_time", j);
        jSONObject.put("priority_level", c64738Paw.LJJJJLI);
        jSONObject.put("req_priority_level", c64738Paw.LJJJJLL);
        jSONObject.put("thread_priority", C16880lQ.LLLLIIIILLL().getPriority());
        long j4 = c64738Paw.LJJJJJL;
        if (j4 > 0) {
            jSONObject.put("cb_time", j4 - c64738Paw.LJJJJJ);
            jSONObject.put("biz_total_time", c64738Paw.LJJJJJL - c64738Paw.LJJJJI);
        } else {
            long j5 = c64738Paw.LJJJJL;
            if (j5 > 0) {
                jSONObject.put("biz_total_time", j5 - c64738Paw.LJJJJI);
            }
        }
        long j6 = c64738Paw.LJIIZILJ;
        if (j6 > 0) {
            long j7 = c64738Paw.LJIILJJIL;
            if (j7 > 0) {
                jSONObject.put("queue_time", j6 - j7);
            }
        }
        long j8 = c64738Paw.LJIILJJIL;
        if (j8 > 0) {
            jSONObject.put("biz_before_time", j8 - c64738Paw.LJJJJI);
        }
        if (((ArrayList) c64738Paw.LJJJLZIJ).size() > 0) {
            HashMap hashMap = new HashMap();
            long j9 = 0;
            for (int i4 = 0; i4 < ((ArrayList) c64738Paw.LJJJLZIJ).size(); i4++) {
                C37825Esv c37825Esv = (C37825Esv) ListProtector.get(c64738Paw.LJJJLZIJ, i4);
                long j10 = c37825Esv.LIZJ - c37825Esv.LIZIZ;
                j9 += j10;
                Long l2 = (Long) hashMap.get(c37825Esv.LIZ);
                if (l2 == null) {
                    hashMap.put(c37825Esv.LIZ, Long.valueOf(j10));
                } else {
                    hashMap.put(c37825Esv.LIZ, Long.valueOf(l2.longValue() + j10));
                }
            }
            JSONObject LIZLLL = Q7K.LIZLLL("total", j9);
            JSONArray jSONArray = new JSONArray();
            for (String str : hashMap.keySet()) {
                JSONObject LIZJ = C65232Piu.LIZJ("name", str);
                LIZJ.put("time", hashMap.get(str));
                jSONArray.put(LIZJ);
            }
            LIZLLL.put("value", jSONArray);
            jSONObject.put("request_interceptors_time", LIZLLL);
            HashMap hashMap2 = new HashMap();
            for (int i5 = 0; i5 < ((ArrayList) c64738Paw.LJJJZ).size(); i5++) {
                C37825Esv c37825Esv2 = (C37825Esv) ListProtector.get(c64738Paw.LJJJZ, i5);
                long j11 = c37825Esv2.LIZJ - c37825Esv2.LIZIZ;
                j2 += j11;
                Long l3 = (Long) hashMap2.get(c37825Esv2.LIZ);
                if (l3 == null) {
                    hashMap2.put(c37825Esv2.LIZ, Long.valueOf(j11));
                } else {
                    hashMap2.put(c37825Esv2.LIZ, Long.valueOf(l3.longValue() + j11));
                }
            }
            JSONObject LIZLLL2 = Q7K.LIZLLL("total", j2);
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : hashMap2.keySet()) {
                JSONObject LIZJ2 = C65232Piu.LIZJ("name", str2);
                LIZJ2.put("time", hashMap2.get(str2));
                jSONArray2.put(LIZJ2);
            }
            LIZLLL2.put("value", jSONArray2);
            jSONObject.put("response_interceptors_time", LIZLLL2);
        }
        Object obj = ((HashMap) c64738Paw.LJJJLL).get("biz_cache_enable");
        if (obj != null) {
            jSONObject.put("cache_enable", obj);
            Object obj2 = ((HashMap) c64738Paw.LJJJLL).get("biz_cache_type");
            if (obj2 == null) {
                obj2 = 0;
            }
            jSONObject.put("cache_type", obj2);
        }
        Object obj3 = ((HashMap) c64738Paw.LJJJLL).get("pns_network");
        if (obj3 != null) {
            jSONObject.put("pns_network", obj3);
        }
        java.util.Map map = (java.util.Map) ((HashMap) c64738Paw.LJJJLL).get("pns_hybrid");
        if (map != null) {
            for (String str3 : map.keySet()) {
                jSONObject.put(str3, map.get(str3));
            }
        }
        Object obj4 = ((HashMap) c64738Paw.LJJJLL).get("last");
        if (obj4 != null) {
            jSONObject.put("last", obj4);
        }
        Object obj5 = ((HashMap) c64738Paw.LJJJLL).get("retry");
        if (obj5 != null) {
            jSONObject.put("retry", obj5);
        }
        if (th == null) {
            jSONObject.put("biz_err_code", 0);
            return;
        }
        if (th instanceof C38333F2r) {
            cronetInternalErrorCode = ((C38306F1q) th).getErrorCode();
            i3 = 90000000;
        } else {
            if (!c64738Paw.LJJJJIZL || (th instanceof C37067Egh) || (th.getCause() instanceof C37067Egh) || (th instanceof s) || (th.getCause() instanceof s)) {
                i2 = 80000000;
            } else if (th instanceof IllegalArgumentException) {
                i2 = 70000000;
            } else if (th instanceof C64799Pbv) {
                C64799Pbv c64799Pbv = (C64799Pbv) th;
                int statusCode = c64799Pbv.getStatusCode();
                if (statusCode > 0) {
                    i2 = statusCode + 60000000;
                } else {
                    cronetInternalErrorCode = c64799Pbv.getCronetInternalErrorCode();
                    if (cronetInternalErrorCode < 0) {
                        cronetInternalErrorCode = -cronetInternalErrorCode;
                    }
                    i3 = 50000000;
                }
            } else if (th instanceof C64802Pby) {
                int statusCode2 = ((C64802Pby) th).getStatusCode();
                if (statusCode2 > 0) {
                    i2 = statusCode2 + 60000000;
                } else {
                    i2 = 0;
                }
            } else if (th instanceof IOException) {
                i2 = i + 10000000;
            } else {
                i2 = 10000000;
            }
            jSONObject.put("biz_err_code", i2);
        }
        i2 = cronetInternalErrorCode + i3;
        jSONObject.put("biz_err_code", i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [long] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    @Override // X.PP1
    public final void LIZLLL(long j, long j2, String str, String str2, String str3, C64672PZs c64672PZs, JSONObject jSONObject) {
        long j3;
        double d;
        String str4 = "image";
        if (c64672PZs == null) {
            return;
        }
        try {
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
            jSONObject.put("cronet_plugin_install", C64841Pcb.LIZ().getConfig().LJIIJ.LIZ.LJIIJ.invoke());
            jSONObject.put("cronet_plugin_version", C64841Pcb.LIZ().getConfig().LJIIJJI.LIZ.LJIIJJI.invoke());
            jSONObject.put("addExecutorToAllInterceptors", c64672PZs.LIZLLL - c64672PZs.LIZJ);
            jSONObject.put("addExecutorTime", c64672PZs.LIZJ);
            j3 = "allInterceptorsTime";
            jSONObject.put("allInterceptorsTime", c64672PZs.LJ - c64672PZs.LIZLLL);
            jSONObject.put("fallback", c64672PZs.LJIJJ);
            jSONObject.put("requestHeader", c64672PZs.LJJIFFI);
            jSONObject.put("responseHeader", c64672PZs.LJJII);
            LJI(jSONObject, c64672PZs, null, 0);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        try {
            j3 = j;
            if (!c64672PZs.LJJIJIIJI.contains("image")) {
                str4 = "api";
            }
            long j4 = 0;
            if (jSONObject.has("timing_totalSendBytes")) {
                j4 = 0 + CastLongProtector.parseLong(jSONObject.get("timing_totalSendBytes").toString());
            }
            if (jSONObject.has("timing_totalReceivedBytes")) {
                j4 += CastLongProtector.parseLong(jSONObject.get("timing_totalReceivedBytes").toString());
            }
            TrafficStatisticsServiceImpl.createITrafficStatisticsbyMonsterPlugin(false).addRecord(j4, C12460eI.LJFF(), str4, j3);
        } catch (Throwable unused) {
        }
        C09900aA.LJIIIIZZ(j3, j2, str, str3, str2, 200, jSONObject);
    }

    @Override // X.PP1
    public final void LIZJ(long j, long j2, String str, String str2, String str3, C64672PZs c64672PZs, Throwable th, JSONObject jSONObject) {
        double d;
        String str4 = "image";
        if (c64672PZs == null) {
            return;
        }
        int LIZIZ = C64920Pds.LIZIZ(th, new String[]{str3});
        int LIZJ = C64920Pds.LIZJ(th);
        if (th != null) {
            try {
                jSONObject.put("errorDesc", th.toString());
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
                jSONObject.put("cronet_plugin_install", C64841Pcb.LIZ().getConfig().LJIIJ.LIZ.LJIIJ.invoke());
                jSONObject.put("cronet_plugin_version", C64841Pcb.LIZ().getConfig().LJIIJJI.LIZ.LJIIJJI.invoke());
                jSONObject.put("substatus", LIZJ);
                if (C64752PbA.LIZ()) {
                    jSONObject.put("netClientType", "CronetClient");
                } else {
                    jSONObject.put("netClientType", "TTOkhttp3Client");
                }
                jSONObject.put("addExecutorToAllInterceptors", c64672PZs.LIZLLL - c64672PZs.LIZJ);
                jSONObject.put("addExecutorTime", c64672PZs.LIZJ);
                jSONObject.put("allInterceptorsTime", c64672PZs.LJ - c64672PZs.LIZLLL);
                jSONObject.put("fallback", c64672PZs.LJIJJ);
                jSONObject.put("requestHeader", c64672PZs.LJJIFFI);
                jSONObject.put("responseHeader", c64672PZs.LJJII);
                LJI(jSONObject, c64672PZs, th, LIZJ);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        try {
            if (!c64672PZs.LJJIJIIJI.contains("image")) {
                str4 = "api";
            }
            long j3 = 0;
            if (jSONObject.has("timing_totalSendBytes")) {
                j3 = 0 + CastLongProtector.parseLong(jSONObject.get("timing_totalSendBytes").toString());
            }
            if (jSONObject.has("timing_totalReceivedBytes")) {
                j3 += CastLongProtector.parseLong(jSONObject.get("timing_totalReceivedBytes").toString());
            }
            TrafficStatisticsServiceImpl.createITrafficStatisticsbyMonsterPlugin(false).addRecord(j3, C12460eI.LJFF(), str4, j);
        } catch (Throwable unused) {
        }
        C09900aA.LIZLLL(j, j2, str, str3, str2, LIZIZ, jSONObject);
        C09900aA.LJIIIIZZ(j, j2, str, str3, str2, LIZIZ, jSONObject);
    }
}
