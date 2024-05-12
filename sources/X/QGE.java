package X;

import Y.ARunnableS1S1200100_10;
import Y.ARunnableS7S1100100_11;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.agilelogger.ALog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class QGE extends UF5 {
    public static final ExecutorService LIZJ = C16880lQ.LLLLZI(1, new QGJ());
    public final ConcurrentHashMap<String, QGH> LIZ;
    public final QGF LIZIZ;

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LIZJ(String str, String str2, java.util.Map<String, String> map) {
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJII(String str) {
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final boolean LJIIIZ(String str) {
        return true;
    }

    public QGE() {
        QGF qgf = new QGF(this);
        this.LIZIZ = qgf;
        this.LIZ = new ConcurrentHashMap<>();
        C66699QFr.LIZIZ = qgf;
    }

    public static JSONObject LJIILL(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("headers");
            if (optJSONObject == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.put("headers", jSONObject2);
                return jSONObject2;
            }
            return optJSONObject;
        } catch (JSONException e) {
            W58.LJIIIIZZ("FrescoTraceListener", "construct headers error", e.getMessage());
            return null;
        }
    }

    public static boolean LJIIZILJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.contains("Canceled") && !str.contains("canceled")) {
            return false;
        }
        return true;
    }

    public static void LJIJJ(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = null;
            String optString = jSONObject.optString("uri", null);
            String optString2 = jSONObject.optString("biz_tag", null);
            if (!TextUtils.isEmpty(optString)) {
                android.net.Uri parse = UriProtector.parse(optString);
                if (optString2 == null) {
                    String queryParameter = UriProtector.getQueryParameter(parse, "biz_tag");
                    if (TextUtils.isEmpty(queryParameter)) {
                        queryParameter = UriProtector.getQueryParameter(parse, "from");
                    }
                    if (queryParameter != null) {
                        jSONObject.put("biz_tag", queryParameter);
                    }
                }
                String queryParameter2 = UriProtector.getQueryParameter(parse, "imagex_flight_id");
                String queryParameter3 = UriProtector.getQueryParameter(parse, "imagex_vid");
                if (!TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter3)) {
                    try {
                        JSONObject optJSONObject = jSONObject.optJSONObject("extra");
                        if (optJSONObject == null) {
                            optJSONObject = new JSONObject();
                            jSONObject.put("extra", optJSONObject);
                        }
                        jSONObject2 = optJSONObject;
                    } catch (JSONException e) {
                        W58.LJIIIIZZ("FrescoTraceListener", "construct extra error", e.getMessage());
                    }
                    jSONObject2.put("imagex_flight_id", queryParameter2);
                    jSONObject2.put("imagex_vid", queryParameter3);
                }
            }
        } catch (JSONException e2) {
            W58.LJIIIIZZ("FrescoTraceListener", "uriQueryParamToExtra error", e2.getMessage());
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJ(String str) {
        LIZJ.submit(new ARunnableS7S1100100_11(this, str, System.currentTimeMillis(), 0));
    }

    public static long LJIILJJIL(long j, Long l) {
        if (l != null) {
            return j - l.longValue();
        }
        return -1L;
    }

    public static void LJIJ(C64672PZs c64672PZs, JSONObject jSONObject) {
        if (c64672PZs != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("requestStart", c64672PZs.LJ);
                jSONObject2.put("responseBack", c64672PZs.LJFF);
                jSONObject2.put("completeReadResponse", c64672PZs.LJI);
                jSONObject2.put("requestEnd", c64672PZs.LJII);
                jSONObject2.put("recycleCount", c64672PZs.LJIIIIZZ);
                if (c64672PZs.LJIJI == 0) {
                    jSONObject2.put("timing_dns", c64672PZs.LJIIIZ);
                    jSONObject2.put("timing_connect", c64672PZs.LJIIJ);
                    jSONObject2.put("timing_ssl", c64672PZs.LJIIJJI);
                    jSONObject2.put("timing_send", c64672PZs.LJIIL);
                    jSONObject2.put("timing_wait", c64672PZs.LJIILL);
                    jSONObject2.put("timing_receive", c64672PZs.LJIILIIL);
                    jSONObject2.put("timing_total", c64672PZs.LJIILLIIL);
                    jSONObject2.put("timing_isSocketReused", c64672PZs.LJIILJJIL);
                    jSONObject2.put("timing_totalSendBytes", c64672PZs.LJIIZILJ);
                    jSONObject2.put("timing_totalReceivedBytes", c64672PZs.LJIJ);
                    jSONObject2.put("timing_remoteIP", c64672PZs.LIZ);
                    jSONObject2.put("request_log", c64672PZs.LJIL);
                }
                JSONObject jSONObject3 = c64672PZs.LJJ;
                if (jSONObject3 != null) {
                    jSONObject2.put("req_info", jSONObject3);
                }
                jSONObject2.put("download", c64672PZs.LJJI);
                jSONObject.put("net_timing_detail", jSONObject2);
                if (C64752PbA.LIZ()) {
                    jSONObject.put("netClientType", "CronetClient");
                } else {
                    jSONObject.put("netClientType", "TTOkhttp3Client");
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static void LJIJI(QGL qgl, JSONObject jSONObject) {
        String str;
        String str2;
        try {
            Object obj = qgl.LIZ;
            String str3 = "";
            if (((C64797Pbt) obj) != null) {
                EJ6 LIZ = ((C64797Pbt) obj).LIZ.LIZ("Nw-Session-Trace");
                EJ6 LIZ2 = ((C64797Pbt) qgl.LIZ).LIZ.LIZ("x-net-info.remoteaddr");
                if (LIZ == null) {
                    str2 = "";
                } else {
                    str2 = ((C64797Pbt) qgl.LIZ).LIZ.LIZ("Nw-Session-Trace").LIZIZ;
                }
                str = LIZ2 != null ? ((C64797Pbt) qgl.LIZ).LIZ.LIZ("x-net-info.remoteaddr").LIZIZ : "";
            } else {
                Object obj2 = qgl.LIZIZ;
                if (((C64598PWw) obj2) == null) {
                    str = "";
                    str2 = "";
                } else {
                    str2 = ((C64598PWw) obj2).LIZ("Nw-Session-Trace", null);
                    str = ((C64598PWw) qgl.LIZIZ).LIZ("x-snssdk.remoteaddr", null);
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("nw-session-trace", str2);
            if (str != null) {
                str3 = str;
            }
            jSONObject.put("server_ip", str3);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LIZ(String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        QGH qgh = this.LIZ.get(str);
        if (qgh == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        java.util.Map<String, Long> map = qgh.LIZIZ;
        sb.append(str2);
        ((HashMap) map).put(sb.toString(), Long.valueOf(currentTimeMillis));
        JSONObject jSONObject = qgh.LIZJ;
        if (jSONObject != null) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("image_monitor_data");
                if (optJSONObject != null) {
                    optJSONObject.put(str2, new JSONObject());
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // X.UF5, X.InterfaceC81754W6s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r38, java.lang.String r39, java.util.Map<java.lang.String, java.lang.String> r40) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QGE.LIZIZ(java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r6.equals("BitmapMemoryCacheGetProducer") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        if (r6.equals("BitmapMemoryCacheProducer") == false) goto L13;
     */
    @Override // X.UF5, X.InterfaceC81754W6s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.QGH> r0 = r4.LIZ
            java.lang.Object r0 = r0.get(r5)
            X.QGH r0 = (X.QGH) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            org.json.JSONObject r1 = r0.LIZJ
            if (r1 != 0) goto L10
            return
        L10:
            java.lang.String r0 = "image_monitor_data"
            org.json.JSONObject r2 = r1.optJSONObject(r0)     // Catch: org.json.JSONException -> L73
            if (r2 == 0) goto L77
            java.lang.String r1 = "image_origin"
            r6.getClass()     // Catch: org.json.JSONException -> L73
            int r0 = r6.hashCode()
            r3 = 5
            switch(r0) {
                case -1914072202: goto L27;
                case -1307634203: goto L30;
                case -1224383234: goto L39;
                case 656304759: goto L42;
                case 957714404: goto L4b;
                case 1023071510: goto L54;
                case 2109593398: goto L5d;
                default: goto L25;
            }
        L25:
            r3 = 7
            goto L6f
        L27:
            java.lang.String r0 = "BitmapMemoryCacheGetProducer"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L6f
            goto L25
        L30:
            java.lang.String r0 = "EncodedMemoryCacheProducer"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L66
            goto L25
        L39:
            java.lang.String r0 = "NetworkFetchProducer"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L68
            goto L25
        L42:
            java.lang.String r0 = "DiskCacheProducer"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L6a
            goto L25
        L4b:
            java.lang.String r0 = "BitmapMemoryCacheProducer"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L6f
            goto L25
        L54:
            java.lang.String r0 = "PostprocessedBitmapMemoryCacheProducer"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L6c
            goto L25
        L5d:
            java.lang.String r0 = "PartialDiskCacheProducer"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L6e
            goto L25
        L66:
            r3 = 4
            goto L6f
        L68:
            r3 = 1
            goto L6f
        L6a:
            r3 = 3
            goto L6f
        L6c:
            r3 = 6
            goto L6f
        L6e:
            r3 = 2
        L6f:
            r2.put(r1, r3)     // Catch: org.json.JSONException -> L73
            goto L77
        L73:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QGE.LIZLLL(java.lang.String, java.lang.String, boolean):void");
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJIIIIZZ(W5O w5o, String str, boolean z) {
        LIZJ.submit(new ARunnableS1S1200100_10(w5o, System.currentTimeMillis(), str, this, 1));
    }

    @Override // X.UF5
    public final void LJIIJJI(W5O w5o, String str, boolean z) {
        LIZJ.submit(new ARunnableS7S1100100_11(this, w5o, str, z, System.currentTimeMillis(), 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x062e, code lost:
    
        if (r11 >= 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x063a, code lost:
    
        if (r1 != false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x068d, code lost:
    
        if (r13.getClass() == X.C36589EXp.LIZ) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x06a6, code lost:
    
        r5 = "/CustomWindow";
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x069e, code lost:
    
        r5 = "/PopupWindow";
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x06a4, code lost:
    
        if (r1 < 2999) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x069c, code lost:
    
        if (r1 == X.C36589EXp.LIZ) goto L272;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0652 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.W5O r39, java.lang.String r40, long r41) {
        /*
            Method dump skipped, instructions count: 1833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QGE.LJIILIIL(X.W5O, java.lang.String, long):void");
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJFF(W5O w5o, String str, Throwable th, boolean z) {
        LIZJ.submit(new RunnableC61835OOp(this, w5o, str, System.currentTimeMillis(), th));
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJI(String str, String str2, Throwable th, java.util.Map<String, String> map) {
        JSONObject jSONObject;
        long j;
        long j2;
        long j3;
        java.util.Map<String, String> map2 = map;
        long currentTimeMillis = System.currentTimeMillis();
        QGH qgh = this.LIZ.get(str);
        if (qgh == null || (jSONObject = qgh.LIZJ) == null) {
            return;
        }
        java.util.Map<String, String> map3 = map2;
        if (map2 == null) {
            HashMap LIZ = C45243HpH.LIZ("image_size", "-1", "queue_time", "-1");
            LIZ.put("fetch_time", "-1");
            map3 = LIZ;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("image_monitor_data");
        if ("NetworkFetchProducer".equals(str2)) {
            try {
                jSONObject.put("fail_phase", "download");
                jSONObject.put("download_duration", -1);
                String str3 = map3.get("content_length");
                String str4 = map3.get("image_size");
                String str5 = map3.get("queue_time");
                if (!TextUtils.isEmpty(str3)) {
                    j = CastLongProtector.parseLong(str3);
                } else {
                    j = -1;
                }
                if (!TextUtils.isEmpty(str4)) {
                    j2 = CastLongProtector.parseLong(str4);
                } else {
                    j2 = -1;
                }
                if (!TextUtils.isEmpty(str5)) {
                    j3 = CastLongProtector.parseLong(str5);
                } else {
                    j3 = -1;
                }
                jSONObject.put("file_size", j2);
                jSONObject.put("content_length", j);
                jSONObject.put("queue_duration", j3);
            } catch (NumberFormatException e) {
                C16880lQ.LLLLIIL(e);
            } catch (JSONException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        } else if ("DecodeProducer".equals(str2)) {
            try {
                jSONObject.put("fail_phase", "decode");
                jSONObject.put("download_duration", CastLongProtector.parseLong(map3.get("fetch_time")));
                if (optJSONObject != null) {
                    optJSONObject.put("decode_queue_duration", CastLongProtector.parseLong(map3.get("queueTime")));
                }
                jSONObject.put("heic_sys_first", map3.get("heic_sys_first"));
                jSONObject.put("heic_custom_decoder", map3.get("heic_custom_decoder"));
            } catch (NumberFormatException e3) {
                C16880lQ.LLLLIIL(e3);
            } catch (JSONException e4) {
                C16880lQ.LLLLIIL(e4);
            }
        }
        StringBuilder sb = new StringBuilder(str);
        HashMap hashMap = (HashMap) qgh.LIZIZ;
        if (hashMap.isEmpty()) {
            return;
        }
        sb.append(str2);
        Long l = (Long) hashMap.remove(sb.toString());
        if (QGG.LJ) {
            String th2 = th.toString();
            String LLLZI = C16880lQ.LLLZI(null, "time %d: onProducerFinishWithFailure: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s, throwable: %s}", new Object[]{Long.valueOf(currentTimeMillis), str, str2, Long.valueOf(LJIILJJIL(currentTimeMillis, l)), map3, th2});
            if (LJIIZILJ(th2)) {
                if (AbstractC66014PvW.LIZ != null) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("Fresco", LLLZI);
                }
            } else {
                AbstractC66014PvW.LIZIZ("Fresco", LLLZI, th);
            }
            W58.LJII("Fresco", LLLZI, th);
        }
        if (optJSONObject != null) {
            try {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(str2);
                if (optJSONObject2 != null) {
                    optJSONObject2.put("producer_start", l.longValue() - Long.valueOf(qgh.LIZ).longValue());
                    optJSONObject2.put("producer_end", currentTimeMillis - qgh.LIZ);
                }
            } catch (JSONException e5) {
                C16880lQ.LLLLIIL(e5);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(6:38|(1:71)(2:42|(1:44))|45|46|(4:48|(1:50)|51|52)(1:68)|53)|72|45|46|(0)(0)|53) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0170, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0171, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014c A[Catch: JSONException -> 0x0170, TryCatch #3 {JSONException -> 0x0170, blocks: (B:46:0x0144, B:48:0x014c), top: B:45:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(X.W5O r27, java.lang.String r28, long r29, java.lang.Throwable r31) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QGE.LJIIL(X.W5O, java.lang.String, long, java.lang.Throwable):void");
    }

    public static boolean LJIILLIIL(W5O w5o, String str, Object obj, JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.put(next, jSONObject.opt(next));
            } catch (JSONException unused) {
            }
        }
        List<InterfaceC61844OOy> list = QGG.LIZIZ;
        synchronized (list) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Pair LIZ = ((InterfaceC61844OOy) it.next()).LIZ(w5o, obj);
                if (LIZ != null) {
                    if (!z2) {
                        z2 = ((Boolean) LIZ.first).booleanValue();
                    }
                    java.util.Map map = (java.util.Map) LIZ.second;
                    if (map != null) {
                        try {
                            for (String str2 : map.keySet()) {
                                jSONObject.put(str2, map.get(str2));
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        }
        return z2;
    }
}
