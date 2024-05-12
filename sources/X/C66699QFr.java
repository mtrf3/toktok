package X;

import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.ttnet.TTNetInit;
import com.facebook.net.IDownloadImage;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: X.QFr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66699QFr extends QGP<C66704QFw> {
    public static QG3 LIZIZ;
    public static QGC LIZJ;
    public final Executor LIZ = new ExecutorC64806Pc2();

    public C66699QFr() {
        W58.LJI("FrescoTTNetFetcher", "init FrescoTTNetFetcher");
    }

    public static int LJII(Throwable th) {
        if (th instanceof C64698PaI) {
            return 1003;
        }
        if (th instanceof C64799Pbv) {
            String requestLog = ((C64799Pbv) th).getRequestLog();
            if (!TextUtils.isEmpty(requestLog)) {
                try {
                    JSONObject optJSONObject = new JSONObject(requestLog).optJSONObject("response");
                    if (optJSONObject != null) {
                        return optJSONObject.optInt("code");
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            return -1;
        }
        if (th instanceof C64802Pby) {
            return ((C64802Pby) th).getStatusCode();
        }
        if (th instanceof C38299F1j) {
            return 1001;
        }
        if (th instanceof C64801Pbx) {
            return 1002;
        }
        if (th instanceof C63723Ozf) {
            return 1004;
        }
        if (th instanceof C64772PbU) {
            return 1005;
        }
        if (th instanceof C38308F1s) {
            return 1006;
        }
        return 1000;
    }

    public static int LJIIIZ(C66704QFw c66704QFw) {
        InterfaceC81770W7i interfaceC81770W7i;
        android.net.Uri LIZJ2;
        if (c66704QFw != null && (interfaceC81770W7i = c66704QFw.LIZIZ) != null && interfaceC81770W7i.LIZIZ() != null) {
            Object LIZIZ2 = c66704QFw.LIZIZ.LIZIZ();
            if ((LIZIZ2 instanceof C2307193r) && (LIZJ2 = c66704QFw.LIZJ()) != null) {
                C2307193r c2307193r = (C2307193r) LIZIZ2;
                String uri = LIZJ2.toString();
                if (C38354F3m.LJ(uri)) {
                    c2307193r.getClass();
                } else if (c2307193r.LIZ.containsKey(uri)) {
                    return c2307193r.LIZ.get(uri).intValue();
                }
            }
        }
        return -1;
    }

    public static InputStream LJIILL(C64797Pbt c64797Pbt) {
        if (c64797Pbt.LIZIZ()) {
            return ((TypedInput) c64797Pbt.LIZIZ).in();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Unexpected HTTP code ");
        LIZ.append(c64797Pbt.LIZ.LIZIZ);
        throw new IOException(X1D.LIZIZ(LIZ));
    }

    @Override // X.QGP, X.QGQ
    public final void LIZJ(QGS qgs) {
        ((C66704QFw) qgs).LJIIJ.run();
    }

    public static String LJIIIIZZ(String str, List list) {
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[Catch: JSONException -> 0x0048, TRY_ENTER, TryCatch #0 {JSONException -> 0x0048, blocks: (B:2:0x0000, B:5:0x000c, B:7:0x0018, B:8:0x0015, B:11:0x0023, B:13:0x002f, B:14:0x002c, B:17:0x003a, B:19:0x0044, B:22:0x0040, B:24:0x0029, B:25:0x0012), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[Catch: JSONException -> 0x0048, TRY_ENTER, TryCatch #0 {JSONException -> 0x0048, blocks: (B:2:0x0000, B:5:0x000c, B:7:0x0018, B:8:0x0015, B:11:0x0023, B:13:0x002f, B:14:0x002c, B:17:0x003a, B:19:0x0044, B:22:0x0040, B:24:0x0029, B:25:0x0012), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(org.json.JSONObject r10, X.C66704QFw r11) {
        /*
            long r1 = r11.LJII     // Catch: org.json.JSONException -> L48
            java.lang.String r7 = "queue_time"
            r3 = -1
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L12
            long r5 = r11.LJI     // Catch: org.json.JSONException -> L48
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 != 0) goto L18
        L12:
            r10.put(r7, r3)     // Catch: org.json.JSONException -> L48
        L15:
            long r1 = r11.LJIIIIZZ     // Catch: org.json.JSONException -> L48
            goto L1d
        L18:
            long r1 = r1 - r5
            r10.put(r7, r1)     // Catch: org.json.JSONException -> L48
            goto L15
        L1d:
            java.lang.String r7 = "fetch_time"
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L29
            long r5 = r11.LJII     // Catch: org.json.JSONException -> L48
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 != 0) goto L2f
        L29:
            r10.put(r7, r3)     // Catch: org.json.JSONException -> L48
        L2c:
            long r1 = r11.LJIIIIZZ     // Catch: org.json.JSONException -> L48
            goto L34
        L2f:
            long r1 = r1 - r5
            r10.put(r7, r1)     // Catch: org.json.JSONException -> L48
            goto L2c
        L34:
            java.lang.String r7 = "total_time"
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L40
            long r5 = r11.LJI     // Catch: org.json.JSONException -> L48
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
        throw new UnsupportedOperationException("Method not decompiled: X.C66699QFr.LJIILJJIL(org.json.JSONObject, X.QFw):void");
    }

    @Override // X.QGP, X.QGQ
    public final java.util.Map LIZ(QGS qgs, int i) {
        C66704QFw c66704QFw = (C66704QFw) qgs;
        HashMap hashMap = new HashMap(1);
        hashMap.put("image_size", Integer.toString(i));
        hashMap.put("hit_cdn_cache", c66704QFw.LJIIIZ);
        hashMap.put("x_response_cache", c66704QFw.LJIIL);
        hashMap.put("imagex_demotion", c66704QFw.LJIILIIL);
        hashMap.put("imagex_want_fmt", c66704QFw.LJIILJJIL);
        hashMap.put("imagex_true_fmt", c66704QFw.LJIILL);
        hashMap.put("imagex_consistency", c66704QFw.LJIILLIIL);
        hashMap.put("x-imagex-extra", c66704QFw.LJIIZILJ);
        return hashMap;
    }

    @Override // X.QGQ
    public final void LIZIZ(QGS qgs, W7U w7u) {
        C66704QFw c66704QFw = (C66704QFw) qgs;
        if (c66704QFw == null) {
            return;
        }
        LJI(c66704QFw, w7u, false);
    }

    @Override // X.QGQ
    public final QGS LJ(W7F w7f, InterfaceC81770W7i interfaceC81770W7i) {
        return new C66704QFw(w7f, interfaceC81770W7i);
    }

    public static void LJIIL(C64797Pbt c64797Pbt, String str, C66704QFw c66704QFw) {
        List<EJ6> list;
        String[] split;
        String str2;
        String replace;
        Rect unflattenFromString;
        c66704QFw.LJIIIZ = CardStruct.IStatusCode.DEFAULT;
        String[] strArr = {"X-Cache", "X-Cache-new", "X-Cache-Status", "via", "X-Via-Ucdn"};
        int i = 0;
        while (true) {
            list = null;
            if (i >= 5) {
                break;
            }
            list = c64797Pbt.LIZ.LIZIZ(strArr[i]);
            if (list != null && list.size() > 0) {
                break;
            } else {
                i++;
            }
        }
        if (!C79004UzY.LJJIFFI(list)) {
            for (EJ6 ej6 : list) {
                if (ej6 != null) {
                    String str3 = ej6.LIZIZ;
                    if (!TextUtils.isEmpty(str3) && str3.toLowerCase().contains("hit")) {
                        c66704QFw.LJIIIZ = "1";
                        break;
                    }
                }
            }
        } else {
            c66704QFw.LJIIIZ = "-1";
        }
        try {
            EJ6 LIZ = c64797Pbt.LIZ.LIZ("x-response-cache");
            if (LIZ != null) {
                c66704QFw.LJIIL = LIZ.LIZIZ;
            } else {
                c66704QFw.LJIIL = "undefined";
            }
            String LJIIIIZZ = LJIIIIZZ("X-Crop-Rs", c64797Pbt.LIZ.LIZLLL);
            if (!TextUtils.isEmpty(LJIIIIZZ) && (unflattenFromString = Rect.unflattenFromString((replace = LJIIIIZZ.replace("(", "").replace(")", "").replace("-", ",").replace(",", " ")))) != null && !unflattenFromString.isEmpty() && unflattenFromString.left >= 0 && unflattenFromString.top >= 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("regionToDecode", replace);
                c66704QFw.LJFF = hashMap;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (!TextUtils.isEmpty(str)) {
            synchronized (QG8.LIZ()) {
            }
        }
        c66704QFw.LJ = false;
        String LJIIIIZZ2 = LJIIIIZZ("ImageX-Demotion", c64797Pbt.LIZ.LIZLLL);
        if (LJIIIIZZ2 == null) {
            LJIIIIZZ2 = "undefined";
        }
        c66704QFw.LJIILIIL = LJIIIIZZ2;
        String LJIIIIZZ3 = LJIIIIZZ("ImageX-Fmt", c64797Pbt.LIZ.LIZLLL);
        if (LJIIIIZZ3 == null || (split = LJIIIIZZ3.split("2")) == null || split.length <= 0) {
            c66704QFw.LJIILJJIL = "undefined";
            c66704QFw.LJIILL = "undefined";
        } else {
            c66704QFw.LJIILJJIL = split[0];
            if (split.length > 1) {
                c66704QFw.LJIILL = split[1];
            } else {
                c66704QFw.LJIILL = "undefined";
            }
        }
        if (!"undefined".equals(c66704QFw.LJIILJJIL) && !"undefined".equals(c66704QFw.LJIILL)) {
            if (c66704QFw.LJIILJJIL.equalsIgnoreCase(c66704QFw.LJIILL)) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c66704QFw.LJIILLIIL = str2;
        } else {
            c66704QFw.LJIILLIIL = "-1";
        }
        String LJIIIIZZ4 = LJIIIIZZ("x-imagex-extra", c64797Pbt.LIZ.LIZLLL);
        if (LJIIIIZZ4 == null) {
            LJIIIIZZ4 = "";
        }
        c66704QFw.LJIIZILJ = LJIIIIZZ4;
    }

    public static void LJIILIIL(C66704QFw c66704QFw, boolean z, long j) {
        if (LJIIIZ(c66704QFw) == 1) {
            if (C65246Pj8.LJFF == null) {
                synchronized (C65246Pj8.LJ) {
                    if (C65246Pj8.LJFF == null) {
                        C65246Pj8.LJFF = new C65246Pj8();
                    }
                }
            }
            C65246Pj8.LJFF.LIZIZ(j, z, true, c66704QFw.LIZJ().toString());
            return;
        }
        if (LJIIIZ(c66704QFw) == 0) {
            C65246Pj8.LIZ().LIZIZ(j, z, false, c66704QFw.LIZJ().toString());
        }
    }

    public final void LJI(C66704QFw c66704QFw, QGR qgr, boolean z) {
        QG7 qg7;
        c66704QFw.LJI = System.currentTimeMillis();
        android.net.Uri LIZJ2 = c66704QFw.LIZJ();
        if (LIZJ2 == null) {
            return;
        }
        if (LIZJ != null) {
            qg7 = new QG7();
        } else {
            qg7 = null;
        }
        String uri = LIZJ2.toString();
        if (qg7 != null) {
            uri = qg7.LIZ.LIZIZ(uri);
        }
        if (C38354F3m.LJ(uri)) {
            return;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> LIZJ3 = EZX.LIZJ(uri, linkedHashMap);
            String str = (String) LIZJ3.first;
            if (z) {
                str = str.replace("http://", "https://");
            }
            String str2 = (String) LIZJ3.second;
            synchronized (QG8.LIZ()) {
            }
            IDownloadImage iDownloadImage = (IDownloadImage) C65083PgV.LJIIIIZZ(IDownloadImage.class, str);
            c66704QFw.LIZIZ.LJ().getClass();
            QG1 qg1 = new QG1();
            LinkedList linkedList = new LinkedList();
            java.util.Map<String, String> map = c66704QFw.LIZIZ.LJ().LJIL;
            if (map != null) {
                for (Map.Entry entry : ((HashMap) map).entrySet()) {
                    linkedList.add(new EJ6((String) entry.getKey(), (String) entry.getValue()));
                }
            }
            if (iDownloadImage != null) {
                InterfaceC37276Ek4<TypedInput> downloadFileForNormal = iDownloadImage.downloadFileForNormal(false, -1, str2, linkedHashMap, linkedList, qg1);
                try {
                    c66704QFw.LIZIZ.LIZLLL(new C66707QFz(this, downloadFileForNormal));
                    InterfaceC64783Pbf interfaceC64783Pbf = C64735Pat.LIZLLL;
                    if (interfaceC64783Pbf != null) {
                        C64734Pas c64734Pas = (C64734Pas) interfaceC64783Pbf;
                        if (!C38354F3m.LJ(uri) && c64734Pas.LJLZ > 0) {
                            try {
                                java.net.URI LIZJ4 = EZY.LIZJ(uri);
                                if (LIZJ4 != null && !C38354F3m.LJ(LIZJ4.getHost())) {
                                    TTNetInit.getTTNetDepend().LJIIIZ();
                                    throw new IllegalArgumentException("cdnHostSuffix is not init !!!");
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    downloadFileForNormal.enqueue(new C66698QFq(this, c66704QFw, qg7, z, qg1, qgr, false, downloadFileForNormal));
                } catch (Exception e) {
                    e = e;
                    C16880lQ.LLLLIIL(e);
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static void LJIIJ(C64672PZs c64672PZs, List list, C48153Iv7 c48153Iv7, Exception exc) {
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
                    if ("x-snssdk.remoteaddr".equalsIgnoreCase(ej6.LIZ)) {
                        str = ej6.LIZIZ;
                    }
                }
            }
            if (C38354F3m.LJ(str) && c48153Iv7 != null) {
                str = c48153Iv7.LIZ;
            }
            if (C38354F3m.LJ(str)) {
                str = "";
                if (exc != null) {
                    try {
                        String[] split = exc.getMessage().split("\\|");
                        if (split != null && split.length >= 2) {
                            Logger.debug();
                            str = split[0];
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            if (C38354F3m.LJ(str)) {
                return;
            }
            c64672PZs.LIZ = str;
            T t = c64672PZs.LIZIZ;
            if (t != 0) {
                t.LIZ = str;
            }
        } catch (Throwable unused2) {
        }
    }

    public static void LJIIJJI(C64797Pbt c64797Pbt, C66704QFw c66704QFw, Throwable th, C64672PZs c64672PZs) {
        if (c66704QFw != null) {
            try {
                long j = c66704QFw.LJI;
                long j2 = c66704QFw.LJIIIIZZ - j;
                if (j2 <= 0) {
                    j2 = System.currentTimeMillis() - c66704QFw.LJI;
                }
                String str = null;
                if (C38354F3m.LJ(null)) {
                    if (c64797Pbt != null) {
                        str = c64797Pbt.LIZ.LIZ;
                    } else {
                        str = c66704QFw.LIZJ().toString();
                    }
                }
                Logger.debug();
                LJIILIIL(c66704QFw, false, j2);
                QGL qgl = new QGL(0);
                qgl.LIZ = c64797Pbt;
                qgl.LIZJ = str;
                if (LIZIZ != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestId", c66704QFw.LIZ());
                    jSONObject.put("retryCount", c66704QFw.LJIIJJI);
                    jSONObject.put("http_status", LJII(th));
                    LIZIZ.LIZ(j2, j, qgl, c64672PZs, th, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void LJFF(C66704QFw c66704QFw, String str, boolean z, List list, long j) {
        if (z) {
            return;
        }
        try {
            long parseLong = Long.parseLong(LJIIIIZZ("X-Length", list));
            if (parseLong != -1 && j != -1 && parseLong != j) {
                QG8.LIZ().LIZIZ();
            }
        } catch (Exception unused) {
        }
        String LJIIIIZZ = LJIIIIZZ("Content-Type", list);
        if (TextUtils.isEmpty(LJIIIIZZ) || !LJIIIIZZ.contains("image")) {
            synchronized (QG8.LIZ()) {
            }
        }
        String str2 = c66704QFw.LIZLLL;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.equals(str2)) {
        } else {
            throw new P9F("MD5 does not match！！");
        }
    }
}
