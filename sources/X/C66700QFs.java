package X;

import Y.IDRunnableS6S0101000;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.ttnet.INetworkApi;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: X.QFs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66700QFs extends AbstractC66705QFx {
    public volatile InterfaceC37276Ek4<TypedInput> LJ;
    public QG1 LJFF;

    @Override // X.AbstractC66705QFx
    public final void LIZIZ() {
        if (this.LJ != null) {
            if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
                this.LJ.cancel();
            } else {
                this.LIZ.execute(new IDRunnableS6S0101000(5, this, 35));
            }
        }
    }

    public static Throwable LJ(Throwable th) {
        if (th instanceof C64799Pbv) {
            C64799Pbv c64799Pbv = (C64799Pbv) th;
            return new C64799Pbv(new C64802Pby(c64799Pbv.getStatusCode(), C16880lQ.LLLZ("statusCode: %d  %s, traceCode: %s, url: %s, requestHeaders: %s, responseHeaders: %s, requestLog: %s, extraInfo: %s", new Object[]{Integer.valueOf(c64799Pbv.getStatusCode()), c64799Pbv.getMessage(), c64799Pbv.getTraceCode(), c64799Pbv.url, c64799Pbv.getRequestInfo().LJJIFFI, c64799Pbv.getRequestInfo().LJJII, c64799Pbv.getRequestInfo().LJIL, c64799Pbv.getRequestInfo().LJJ.toString()})), c64799Pbv.getRequestInfo(), c64799Pbv.traceCode, c64799Pbv.getCronetInternalErrorCode());
        }
        return th;
    }

    public static String LJFF(C64797Pbt c64797Pbt) {
        String str;
        Pattern compile = PatternProtector.compile("max-age=\\d+");
        String str2 = null;
        try {
            List<EJ6> list = c64797Pbt.LIZ.LIZLLL;
            if (list != null && list.size() > 0) {
                for (EJ6 ej6 : list) {
                    if ("Cache-Control".equals(ej6.LIZ)) {
                        str = ej6.LIZIZ;
                        break;
                    }
                }
            }
            str = null;
            if (str == null) {
                return null;
            }
            try {
                Matcher matcher = compile.matcher(str);
                if (!matcher.find()) {
                    return null;
                }
                return matcher.group();
            } catch (Exception e) {
                e = e;
                str2 = str;
                C16880lQ.LLLLIIL(e);
                return str2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static String LJI(String str, List list) {
        String str2 = null;
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EJ6 ej6 = (EJ6) it.next();
                if (str.equalsIgnoreCase(ej6.LIZ)) {
                    str2 = ej6.LIZIZ;
                }
            }
        }
        return str2;
    }

    public static void LJIIIZ(C64797Pbt c64797Pbt, C66706QFy c66706QFy) {
        String[] split;
        String str;
        String LJI = LJI("ImageX-Demotion", c64797Pbt.LIZ.LIZLLL);
        if (LJI == null) {
            LJI = "undefined";
        }
        c66706QFy.LJIIJ = LJI;
        String LJI2 = LJI("ImageX-Fmt", c64797Pbt.LIZ.LIZLLL);
        if (LJI2 == null || (split = LJI2.split("2")) == null || split.length <= 0) {
            c66706QFy.LJIIJJI = "undefined";
            c66706QFy.LJIIL = "undefined";
        } else {
            c66706QFy.LJIIJJI = split[0];
            if (split.length > 1) {
                c66706QFy.LJIIL = split[1];
            } else {
                c66706QFy.LJIIL = "undefined";
            }
        }
        if (!"undefined".equals(c66706QFy.LJIIJJI) && !"undefined".equals(c66706QFy.LJIIL)) {
            if (c66706QFy.LJIIJJI.equalsIgnoreCase(c66706QFy.LJIIL)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c66706QFy.LJIILIIL = str;
            return;
        }
        c66706QFy.LJIILIIL = "-1";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[Catch: JSONException -> 0x0048, TRY_ENTER, TryCatch #0 {JSONException -> 0x0048, blocks: (B:2:0x0000, B:5:0x000c, B:7:0x0018, B:8:0x0015, B:11:0x0023, B:13:0x002f, B:14:0x002c, B:17:0x003a, B:19:0x0044, B:22:0x0040, B:24:0x0029, B:25:0x0012), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[Catch: JSONException -> 0x0048, TRY_ENTER, TryCatch #0 {JSONException -> 0x0048, blocks: (B:2:0x0000, B:5:0x000c, B:7:0x0018, B:8:0x0015, B:11:0x0023, B:13:0x002f, B:14:0x002c, B:17:0x003a, B:19:0x0044, B:22:0x0040, B:24:0x0029, B:25:0x0012), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIL(org.json.JSONObject r10, X.C66706QFy r11) {
        /*
            long r1 = r11.LIZIZ     // Catch: org.json.JSONException -> L48
            java.lang.String r7 = "queue_time"
            r3 = -1
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L12
            long r5 = r11.LIZ     // Catch: org.json.JSONException -> L48
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 != 0) goto L18
        L12:
            r10.put(r7, r3)     // Catch: org.json.JSONException -> L48
        L15:
            long r1 = r11.LIZJ     // Catch: org.json.JSONException -> L48
            goto L1d
        L18:
            long r1 = r1 - r5
            r10.put(r7, r1)     // Catch: org.json.JSONException -> L48
            goto L15
        L1d:
            java.lang.String r7 = "fetch_time"
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L29
            long r5 = r11.LIZIZ     // Catch: org.json.JSONException -> L48
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 != 0) goto L2f
        L29:
            r10.put(r7, r3)     // Catch: org.json.JSONException -> L48
        L2c:
            long r1 = r11.LIZJ     // Catch: org.json.JSONException -> L48
            goto L34
        L2f:
            long r1 = r1 - r5
            r10.put(r7, r1)     // Catch: org.json.JSONException -> L48
            goto L2c
        L34:
            java.lang.String r7 = "total_time"
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L40
            long r5 = r11.LIZ     // Catch: org.json.JSONException -> L48
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 != 0) goto L44
        L40:
            r10.put(r7, r3)     // Catch: org.json.JSONException -> L48
            goto L48
        L44:
            long r1 = r1 - r5
            r10.put(r7, r1)     // Catch: org.json.JSONException -> L48
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66700QFs.LJIIL(org.json.JSONObject, X.QFy):void");
    }

    @Override // X.AbstractC66705QFx
    public final void LIZ(C66706QFy c66706QFy, QG6 qg6) {
        if (this.LJ != null && c66706QFy != null) {
            this.LJ.enqueue(new C66701QFt(this, c66706QFy, qg6));
        }
    }

    @Override // X.AbstractC66705QFx
    public final void LIZJ(C66706QFy c66706QFy, QG6 qg6) {
        boolean z;
        c66706QFy.LIZ = System.currentTimeMillis();
        QGF qgf = c66706QFy.LJII;
        if (qgf instanceof QG3) {
            this.LIZJ = qgf;
        }
        android.net.Uri uri = c66706QFy.LJFF;
        if (uri == null) {
            return;
        }
        String LIZIZ = this.LIZLLL.LIZIZ(uri.toString());
        if (C38354F3m.LJ(LIZIZ)) {
            return;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> LIZJ = EZX.LIZJ(LIZIZ, linkedHashMap);
            String str = (String) LIZJ.first;
            String str2 = (String) LIZJ.second;
            synchronized (QG8.LIZ()) {
            }
            INetworkApi iNetworkApi = (INetworkApi) C65083PgV.LJIIIIZZ(INetworkApi.class, str);
            this.LJFF = new QG1(null);
            java.util.Map<String, String> map = c66706QFy.LJIIIIZZ;
            if (map != null && ((HashMap) map).remove("__NO_COOKIE") != null) {
                z = true;
            } else {
                z = false;
            }
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("tt_image_remove_cookie_enable", false) && z) {
                this.LJFF.LJIIZILJ = true;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(new EJ6("x-tt-dataflow-id", "671089153"));
            C79083V1z.LIZ(0, "TTNetImageFetcher", "fetchData", "request image url = " + LIZIZ);
            if (iNetworkApi != null) {
                this.LJ = iNetworkApi.downloadFile(false, -1, str2, linkedHashMap, linkedList, this.LJFF);
            }
        } catch (Exception e) {
            LJIIJ(null, c66706QFy, e, 0L, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000e, code lost:
    
        if ("request canceled".equals(r4.getMessage()) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.QGD r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L33
            if (r4 == 0) goto L10
            java.lang.String r1 = "request canceled"
            java.lang.String r0 = r4.getMessage()     // Catch: java.lang.Throwable -> L33
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L1c
        L10:
            X.Ek4<com.bytedance.retrofit2.mime.TypedInput> r0 = r2.LJ     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L26
            X.Ek4<com.bytedance.retrofit2.mime.TypedInput> r0 = r2.LJ     // Catch: java.lang.Throwable -> L33
            boolean r0 = r0.isCanceled()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L26
        L1c:
            X.QG6 r3 = (X.QG6) r3     // Catch: java.lang.Throwable -> L33
            X.QGR r0 = r3.LIZ     // Catch: java.lang.Throwable -> L33
            X.W7U r0 = (X.W7U) r0     // Catch: java.lang.Throwable -> L33
            r0.LIZ()     // Catch: java.lang.Throwable -> L33
            goto L33
        L26:
            X.QG6 r3 = (X.QG6) r3     // Catch: java.lang.Throwable -> L33
            X.QGR r0 = r3.LIZ     // Catch: java.lang.Throwable -> L33
            X.W7U r0 = (X.W7U) r0     // Catch: java.lang.Throwable -> L33
            X.W7V r1 = r0.LIZIZ     // Catch: java.lang.Throwable -> L33
            X.QGS r0 = r0.LIZ     // Catch: java.lang.Throwable -> L33
            r1.LJFF(r0, r4)     // Catch: java.lang.Throwable -> L33
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66700QFs.LJIIIIZZ(X.QGD, java.lang.Throwable):void");
    }

    public static void LJII(C64672PZs c64672PZs, List list, QG1 qg1, Exception exc) {
        if (c64672PZs == null) {
            return;
        }
        try {
            if (!C38354F3m.LJ(c64672PZs.LIZ)) {
                return;
            }
            String str = null;
            if (list != null && list.size() > 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    EJ6 ej6 = (EJ6) it.next();
                    if ("x-net-info.remoteaddr".equalsIgnoreCase(ej6.LIZ)) {
                        str = ej6.LIZIZ;
                    }
                }
            }
            if (C38354F3m.LJ(str) && qg1 != null) {
                str = qg1.LIZ;
            }
            if (C38354F3m.LJ(str)) {
                str = AbstractC66705QFx.LIZLLL(exc);
            }
            if (C38354F3m.LJ(str)) {
                return;
            }
            c64672PZs.LIZ = str;
            T t = c64672PZs.LIZIZ;
            if (t != 0) {
                t.LIZ = str;
            }
        } catch (Throwable unused) {
        }
    }

    public final void LJIIJ(C64797Pbt c64797Pbt, C66706QFy c66706QFy, Throwable th, long j, long j2) {
        C64672PZs c64672PZs;
        List<EJ6> list;
        long j3 = j2;
        if (c66706QFy != null) {
            try {
                String[] strArr = new String[1];
                if (c64797Pbt != null && (list = c64797Pbt.LIZ.LIZLLL) != null) {
                    try {
                        if (list.size() > 0) {
                            for (EJ6 ej6 : list) {
                                if ("x-net-info.remoteaddr".equals(ej6.LIZ)) {
                                    strArr[0] = ej6.LIZIZ;
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (C38354F3m.LJ(strArr[0])) {
                    strArr[0] = AbstractC66705QFx.LIZLLL(th);
                }
                long j4 = c66706QFy.LIZ;
                if (j > 0) {
                    j3 = j;
                }
                String str = null;
                if (C38354F3m.LJ(null)) {
                    if (c64797Pbt != null) {
                        str = c64797Pbt.LIZ.LIZ;
                    } else {
                        str = c66706QFy.LJFF.toString();
                    }
                }
                if (th != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("exception for ttnet response url = ");
                    LIZ.append(str);
                    LIZ.append(" exception = ");
                    LIZ.append(th.toString());
                    C79083V1z.LIZIZ(0, "TTNetImageFetcher", "handleException$0", X1D.LIZIZ(LIZ));
                }
                if (th instanceof C64799Pbv) {
                    C64668PZo requestInfo = ((C64799Pbv) th).getRequestInfo();
                    if (requestInfo instanceof C64672PZs) {
                        c64672PZs = (C64672PZs) requestInfo;
                    } else {
                        c64672PZs = new C64672PZs();
                        c64672PZs.LJIJI = 0;
                        c64672PZs.LJIL = ((C64799Pbv) th).getRequestLog();
                    }
                } else {
                    c64672PZs = new C64672PZs();
                }
                c64672PZs.LIZ = strArr[0];
                C64819PcF c64819PcF = this.LIZIZ;
                if (c64819PcF != null) {
                    C10K.LIZJ(new CallableC64820PcG(c64819PcF, j3, j4, str, c64672PZs, LJ(th)));
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public final void LJIIJJI(C64797Pbt c64797Pbt, C66706QFy c66706QFy, Throwable th, C64672PZs c64672PZs, int i, long j, long j2) {
        long j3 = j2;
        if (c66706QFy != null) {
            try {
                long j4 = c66706QFy.LIZ;
                if (j > 0) {
                    j3 = j;
                }
                String str = null;
                if (C38354F3m.LJ(null)) {
                    if (c64797Pbt != null) {
                        str = c64797Pbt.LIZ.LIZ;
                    } else {
                        str = c66706QFy.LJFF.toString();
                    }
                }
                if (th != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("exception for ttnet response url = ");
                    LIZ.append(str);
                    LIZ.append(" exception = ");
                    LIZ.append(th.toString());
                    C79083V1z.LIZIZ(0, "TTNetImageFetcher", "handleException$1", X1D.LIZIZ(LIZ));
                }
                QGL qgl = new QGL(0);
                qgl.LIZ = c64797Pbt;
                qgl.LIZJ = str;
                if (this.LIZJ != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestId", c66706QFy.LIZLLL);
                    jSONObject.put("retryCount", i);
                    this.LIZJ.LIZ(j3, j4, qgl, c64672PZs, LJ(th), jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
