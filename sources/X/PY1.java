package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.ss.android.ugc.aweme.net.settings.PayLoadControl;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public final class PY1 extends PY5 {
    public static final Charset LJ;
    public final Random LIZ = new Random();
    public final BlockingQueue<Long> LIZIZ;
    public final java.util.Map<String, String> LIZJ;
    public final PW6 LIZLLL;

    static {
        Charset forName = Charset.forName("utf-8");
        o.LJIIIIZZ(forName, "forName(\"utf-8\")");
        LJ = forName;
    }

    public PY1() {
        PayLoadControl LIZ = PXY.LIZ();
        this.LIZIZ = new LinkedBlockingQueue(LIZ.flowControl);
        this.LIZLLL = new PW6(LIZ.maxSize);
        this.LIZJ = new ConcurrentHashMap(8);
    }

    public static boolean LJIL() {
        if (PXY.LIZ().enable && (!r1.checkList.isEmpty())) {
            return true;
        }
        return false;
    }

    public static void LIZJ(PVP pvp) {
        Field[] declaredFields = pvp.getClass().getDeclaredFields();
        o.LJIIIIZZ(declaredFields, "body.javaClass.declaredFields");
        for (Field field : declaredFields) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            field.get(pvp);
        }
    }

    public static boolean LJIJJLI(C39745Fin c39745Fin) {
        String str = c39745Fin.LIZIZ;
        if (!TextUtils.equals(str, "application") && !TextUtils.equals(str, "text")) {
            return true;
        }
        return false;
    }

    public static boolean LJJ(C64533PUj c64533PUj) {
        try {
            C64533PUj c64533PUj2 = new C64533PUj();
            long j = c64533PUj.LJLILLLLZI;
            if (j >= 64) {
                j = 64;
            }
            c64533PUj.LIZLLL(c64533PUj2, 0L, j);
            int i = 0;
            while (!c64533PUj2.LLJ()) {
                int LJIJ = c64533PUj2.LJIJ();
                if (Character.isISOControl(LJIJ) && !Character.isWhitespace(LJIJ)) {
                    return false;
                }
                i++;
                if (i >= 16) {
                    break;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean LJJI(String str) {
        if (TextUtils.equals(str, "/service/2/app_log/") || TextUtils.equals(str, "/monitor/collect/batch/") || TextUtils.equals(str, "/monitor/collect/c/logcollect") || TextUtils.equals(str, "/monitor/collect/c/exception") || TextUtils.equals(str, "/monitor/collect/c/code_coverage")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r9v18, types: [X.Pbt, R] */
    @Override // X.PY9
    public final PPC<Request, C64797Pbt<?>> LIZ(PPC<Request, C64797Pbt<?>> ppc) {
        String str;
        TypedOutput body;
        String mimeType;
        C39745Fin LIZJ;
        Charset LIZ;
        if (!PXY.LIZ().enable) {
            return ppc;
        }
        Request request = ppc.LIZ;
        if (request != null) {
            str = request.getUrl();
        } else {
            str = null;
        }
        C58730N3e c58730N3e = new C58730N3e(false, str, 502);
        long uptimeMillis = SystemClock.uptimeMillis();
        long LIZ2 = PY3.LIZ();
        try {
            try {
                try {
                    Request request2 = ppc.LIZ;
                    if (request2 != null && request2.getUrl() != null) {
                        java.net.URI uri = new java.net.URI(request2.getUrl());
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(uri.getScheme());
                        LIZ3.append("://");
                        LIZ3.append(uri.getHost());
                        LIZ3.append(uri.getPath());
                        String LIZIZ = X1D.LIZIZ(LIZ3);
                        String path = uri.getPath();
                        o.LJIIIIZZ(path, "uri.path");
                        if (!LJJI(path) && (body = request2.getBody()) != null && LJJII(PXY.LIZ().ttNetSampling, LIZ2) && (mimeType = body.mimeType()) != null && (LIZJ = C39745Fin.LIZJ(mimeType)) != null && !LJIJJLI(LIZJ) && (LIZ = LIZJ.LIZ(LJ)) != null) {
                            PW5 pw5 = new PW5(this.LIZLLL);
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(pw5, FileUtils.BUFFER_SIZE);
                            body.writeTo(bufferedOutputStream);
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            if (pw5.LIZ()) {
                                String data = pw5.toString(LIZ.name());
                                o.LJIIIIZZ(data, "data");
                                LJIIZILJ(data, PXY.LIZ().checkList, c58730N3e);
                            }
                            if (c58730N3e.LIZ) {
                                if (PXY.LIZ().intercept && PXY.LIZ().interceptApi.contains(LIZIZ)) {
                                    ppc.LIZ(PPD.INTERCEPT);
                                    String url = request2.getUrl();
                                    List<EJ6> headers = request2.getHeaders();
                                    if (headers == null) {
                                        headers = C61878OQg.INSTANCE;
                                    }
                                    byte[] bytes = "{\"status_code\": 1001}".getBytes(PVC.LIZ);
                                    o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
                                    C36910EeA c36910EeA = new C36910EeA(url, 1001, "", headers, new TypedByteArray("application/json; charset=utf-8", bytes, new String[0]));
                                    ppc.LIZIZ = C64797Pbt.LIZ(c36910EeA.LJ, c36910EeA);
                                }
                                LJJIFFI(request2.getUrl(), "2", c58730N3e, LIZ2, SystemClock.uptimeMillis() - uptimeMillis);
                            }
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("handleTTNet id: ");
                            LIZ4.append(LIZ2);
                            LIZ4.append(", api: ");
                            LIZ4.append(LIZIZ);
                            LIZ4.append(", cost: ");
                            LIZ4.append(SystemClock.uptimeMillis() - uptimeMillis);
                            LIZ4.append("ms, method: ");
                            LIZ4.append(request2.getMethod());
                            LIZ4.append(", type: ");
                            LIZ4.append(mimeType);
                            LIZ4.append(", size: ");
                            LIZ4.append(body.length());
                            LIZ4.append("-byte");
                            X1D.LIZIZ(LIZ4);
                        }
                    }
                } catch (URISyntaxException e) {
                    C16880lQ.LLLLIIL(e);
                }
            } catch (IOException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            return ppc;
        } finally {
            ((LinkedBlockingQueue) this.LIZIZ).remove(Long.valueOf(LIZ2));
        }
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, Integer> LJ(PPC<HttpURLConnection, Integer> ppc) {
        String str;
        java.net.URL url;
        if (!PXY.LIZ().enable) {
            return ppc;
        }
        HttpURLConnection httpURLConnection = ppc.LIZ;
        if (httpURLConnection != null && (url = httpURLConnection.getURL()) != null) {
            str = url.toString();
        } else {
            str = null;
        }
        if (LJIL()) {
            LJIJJ(null, ppc, new C58730N3e(false, str, 502));
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJI(PPC<HttpURLConnection, InputStream> ppc) {
        String str;
        java.net.URL url;
        if (!PXY.LIZ().enable) {
            return ppc;
        }
        HttpURLConnection httpURLConnection = ppc.LIZ;
        if (httpURLConnection != null && (url = httpURLConnection.getURL()) != null) {
            str = url.toString();
        } else {
            str = null;
        }
        if (LJIL()) {
            LJIJJ(ppc, null, new C58730N3e(false, str, 502));
        }
        return ppc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        r5 = r7.LIZJ.toString();
        kotlin.jvm.internal.o.LJIIIIZZ(r5, "request.log.toString()");
        r4 = r3.LIZLLL;
        kotlin.jvm.internal.o.LJIIIIZZ(r5.getBytes(X.PY1.LJ), "this as java.lang.String).getBytes(charset)");
        r0 = r4.LIZIZ(r1.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r0 > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        r3.LIZLLL.LIZ(r0);
        r3.LJIIZILJ(r5, X.PXY.LIZ().checkList, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r12.LIZ == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        if (X.PXY.LIZ().intercept == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (X.PXY.LIZ().interceptApi.contains(r10) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        r18.LIZ(X.PPD.INTERCEPT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        LJJIFFI(r10, "7", r12, r13, android.os.SystemClock.uptimeMillis() - r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.PY1] */
    @Override // X.PYB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.PPC<X.C64322PMg, java.lang.Boolean> LJIIIIZZ(X.PPC<X.C64322PMg, java.lang.Boolean> r18) {
        /*
            r17 = this;
            long r8 = android.os.SystemClock.uptimeMillis()
            r2 = r18
            Q r7 = r2.LIZ
            X.PMg r7 = (X.C64322PMg) r7
            if (r7 != 0) goto Ld
            return r2
        Ld:
            long r13 = X.PY3.LIZ()
            org.json.JSONObject r1 = r7.LIZJ
            java.lang.String r0 = "log_type"
            java.lang.String r6 = r1.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L27
            org.json.JSONObject r1 = r7.LIZJ
            java.lang.String r0 = "type"
            java.lang.String r6 = r1.optString(r0)
        L27:
            java.lang.StringBuilder r3 = X.X1D.LIZ()
            java.lang.String r1 = r7.LIZ
            r0 = 47
            java.lang.String r10 = X.C0MT.LIZ(r3, r1, r0, r6, r3)
            r3 = r17
            com.ss.android.ugc.aweme.net.settings.PayLoadControl r0 = X.PXY.LIZ()     // Catch: java.lang.Throwable -> Lc7
            int r0 = r0.commonLogSampling     // Catch: java.lang.Throwable -> Lc7
            boolean r0 = r3.LJJII(r0, r13)     // Catch: java.lang.Throwable -> Lc7
            if (r0 != 0) goto L42
            goto Lbb
        L42:
            X.N3e r12 = new X.N3e     // Catch: java.lang.Throwable -> Lc7
            r0 = 502(0x1f6, float:7.03E-43)
            r5 = 0
            r12.<init>(r5, r10, r0)     // Catch: java.lang.Throwable -> Lc7
            X.N3f[] r4 = X.EnumC58731N3f.values()     // Catch: java.lang.Throwable -> Lc7
            int r1 = r4.length     // Catch: java.lang.Throwable -> Lc7
        L4f:
            if (r5 >= r1) goto L61
            r0 = r4[r5]     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = r0.getLogType()     // Catch: java.lang.Throwable -> Lc7
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto L5e
            goto Lbb
        L5e:
            int r5 = r5 + 1
            goto L4f
        L61:
            org.json.JSONObject r0 = r7.LIZJ     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = "request.log.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)     // Catch: java.lang.Throwable -> Lc7
            X.PW6 r4 = r3.LIZLLL     // Catch: java.lang.Throwable -> Lc7
            java.nio.charset.Charset r0 = X.PY1.LJ     // Catch: java.lang.Throwable -> Lc7
            byte[] r1 = r5.getBytes(r0)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> Lc7
            int r0 = r1.length     // Catch: java.lang.Throwable -> Lc7
            long r0 = (long) r0     // Catch: java.lang.Throwable -> Lc7
            long r0 = r4.LIZIZ(r0)     // Catch: java.lang.Throwable -> Lc7
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 > 0) goto L86
            goto Lbb
        L86:
            X.PW6 r4 = r3.LIZLLL     // Catch: java.lang.Throwable -> Lc7
            r4.LIZ(r0)     // Catch: java.lang.Throwable -> Lc7
            com.ss.android.ugc.aweme.net.settings.PayLoadControl r0 = X.PXY.LIZ()     // Catch: java.lang.Throwable -> Lc7
            java.util.Set<java.lang.String> r0 = r0.checkList     // Catch: java.lang.Throwable -> Lc7
            r3.LJIIZILJ(r5, r0, r12)     // Catch: java.lang.Throwable -> Lc7
            boolean r0 = r12.LIZ     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto Lbb
            com.ss.android.ugc.aweme.net.settings.PayLoadControl r0 = X.PXY.LIZ()     // Catch: java.lang.Throwable -> Lc7
            boolean r0 = r0.intercept     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto Lb1
            com.ss.android.ugc.aweme.net.settings.PayLoadControl r0 = X.PXY.LIZ()     // Catch: java.lang.Throwable -> Lc7
            java.util.Set<java.lang.String> r0 = r0.interceptApi     // Catch: java.lang.Throwable -> Lc7
            boolean r0 = r0.contains(r10)     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto Lb1
            X.PPD r0 = X.PPD.INTERCEPT     // Catch: java.lang.Throwable -> Lc7
            r2.LIZ(r0)     // Catch: java.lang.Throwable -> Lc7
        Lb1:
            java.lang.String r11 = "7"
            long r15 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> Lc7
            long r15 = r15 - r8
            LJJIFFI(r10, r11, r12, r13, r15)     // Catch: java.lang.Throwable -> Lc7
        Lbb:
            java.util.concurrent.BlockingQueue<java.lang.Long> r1 = r3.LIZIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            java.util.concurrent.LinkedBlockingQueue r1 = (java.util.concurrent.LinkedBlockingQueue) r1
            r1.remove(r0)
            return r2
        Lc7:
            r2 = move-exception
            java.util.concurrent.BlockingQueue<java.lang.Long> r1 = r3.LIZIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            java.util.concurrent.LinkedBlockingQueue r1 = (java.util.concurrent.LinkedBlockingQueue) r1
            r1.remove(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PY1.LJIIIIZZ(X.PPC):X.PPC");
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIIJJI(PPC<HttpURLConnection, InputStream> ppc) {
        String str;
        java.net.URL url;
        if (!PXY.LIZ().enable) {
            return ppc;
        }
        HttpURLConnection httpURLConnection = ppc.LIZ;
        if (httpURLConnection != null && (url = httpURLConnection.getURL()) != null) {
            str = url.toString();
        } else {
            str = null;
        }
        if (LJIL()) {
            LJIJJ(ppc, null, new C58730N3e(false, str, 502));
        }
        return ppc;
    }

    @Override // X.PY6
    public final PPC<POA, Boolean> LJIILJJIL(PPC<POA, Boolean> ppc) {
        long uptimeMillis = SystemClock.uptimeMillis();
        POA poa = ppc.LIZ;
        if (poa == null) {
            return ppc;
        }
        long LIZ = PY3.LIZ();
        try {
            if (LJJII(PXY.LIZ().appLogSampling, LIZ)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(poa.LIZ);
                LIZ2.append('/');
                LIZ2.append(poa.LIZIZ);
                LIZ2.append('/');
                String str = poa.LIZJ;
                if (str == null) {
                    str = "";
                }
                LIZ2.append(str);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                C58730N3e c58730N3e = new C58730N3e(false, LIZIZ, 502);
                String jSONObject = poa.LIZLLL.toString();
                o.LJIIIIZZ(jSONObject, "request.extJson.toString()");
                PW6 pw6 = this.LIZLLL;
                o.LJIIIIZZ(jSONObject.getBytes(LJ), "this as java.lang.String).getBytes(charset)");
                long LIZIZ2 = pw6.LIZIZ(r1.length);
                if (LIZIZ2 > 0) {
                    this.LIZLLL.LIZ(LIZIZ2);
                    LJIIZILJ(jSONObject, PXY.LIZ().checkList, c58730N3e);
                    if (c58730N3e.LIZ) {
                        if (PXY.LIZ().intercept && PXY.LIZ().interceptApi.contains(LIZIZ)) {
                            ppc.LIZ(PPD.INTERCEPT);
                        }
                        LJJIFFI(LIZIZ, "6", c58730N3e, LIZ, SystemClock.uptimeMillis() - uptimeMillis);
                    }
                }
            }
            return ppc;
        } finally {
            ((LinkedBlockingQueue) this.LIZIZ).remove(Long.valueOf(LIZ));
        }
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [R, X.PWw] */
    @Override // X.PYA
    public final PPC<okhttp3.Request, C64598PWw> LJIILLIIL(PPC<okhttp3.Request, C64598PWw> ppc) {
        String str;
        C39745Fin LIZIZ;
        Charset LIZ;
        C64626PXy url;
        if (!PXY.LIZ().enable) {
            return ppc;
        }
        okhttp3.Request request = ppc.LIZ;
        if (request != null && (url = request.url()) != null) {
            str = url.LJIIIIZZ;
        } else {
            str = null;
        }
        if (LJIL()) {
            C58730N3e c58730N3e = new C58730N3e(false, str, 502);
            long uptimeMillis = SystemClock.uptimeMillis();
            long LIZ2 = PY3.LIZ();
            try {
                try {
                    okhttp3.Request request2 = ppc.LIZ;
                    if (request2 != null) {
                        C64626PXy url2 = request2.url();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(url2.LIZ);
                        LIZ3.append("://");
                        LIZ3.append(url2.LIZLLL);
                        LIZ3.append(url2.LJFF());
                        String LIZIZ2 = X1D.LIZIZ(LIZ3);
                        String LJFF = url2.LJFF();
                        o.LJIIIIZZ(LJFF, "url.encodedPath()");
                        if (!LJJI(LJFF)) {
                            PayLoadControl LIZ4 = PXY.LIZ();
                            PVP body = request2.body();
                            if (body != null && LJJII(LIZ4.okHttpSampling, LIZ2) && (LIZIZ = body.LIZIZ()) != null && !LJIJJLI(LIZIZ) && (LIZ = LIZIZ.LIZ(LJ)) != null) {
                                LIZJ(body);
                                if (o.LJ("x-www-form-urlencoded", LIZIZ.LIZJ)) {
                                    LJIJ(body, LIZ, c58730N3e);
                                } else {
                                    LJIJI(body, LIZ, c58730N3e);
                                }
                                if (c58730N3e.LIZ) {
                                    if (LIZ4.intercept && LIZ4.interceptApi.contains(LIZIZ2)) {
                                        ppc.LIZ(PPD.INTERCEPT);
                                        C64597PWv c64597PWv = new C64597PWv();
                                        c64597PWv.LIZJ = 1001;
                                        c64597PWv.LIZIZ = EnumC64572PVw.HTTP_2;
                                        c64597PWv.LIZLLL = "";
                                        c64597PWv.LIZ = ppc.LIZ;
                                        c64597PWv.LJI = PVM.create(C39745Fin.LIZJ("application/json; charset=utf-8"), "{\"status_code\": 1001}");
                                        ppc.LIZIZ = c64597PWv.LIZ();
                                    }
                                    LJJIFFI(url2.LJIIIIZZ, "4", c58730N3e, LIZ2, SystemClock.uptimeMillis() - uptimeMillis);
                                }
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append("handleOkHttp id: ");
                                LIZ5.append(LIZ2);
                                LIZ5.append(", api: ");
                                LIZ5.append(LIZIZ2);
                                LIZ5.append(", cost: ");
                                LIZ5.append(SystemClock.uptimeMillis() - uptimeMillis);
                                LIZ5.append("ms, method: ");
                                LIZ5.append(request2.method());
                                LIZ5.append(", type: ");
                                LIZ5.append(LIZIZ);
                                LIZ5.append(", size: ");
                                LIZ5.append(body.LIZ());
                                LIZ5.append("-byte");
                                X1D.LIZIZ(LIZ5);
                            }
                        }
                    }
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
            } finally {
                ((LinkedBlockingQueue) this.LIZIZ).remove(Long.valueOf(LIZ2));
            }
        }
        return ppc;
    }

    public final boolean LJJII(int i, long j) {
        if (this.LIZ.nextInt(10001) > i) {
            return false;
        }
        return ((LinkedBlockingQueue) this.LIZIZ).offer(Long.valueOf(j));
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v2 */
    public final void LJIIZILJ(String str, java.util.Set<String> set, C58730N3e c58730N3e) {
        int LJJLIIIJL;
        int LIZ;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        String LIZJ = AnonymousClass028.LIZJ("getDefault()", str, "this as java.lang.String).toLowerCase(locale)");
        Iterator<String> it = set.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            String lowerCase = next.toLowerCase();
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
            ?? r12 = 0;
            if (s.LJJJLZIJ(LIZJ, lowerCase, false)) {
                int i = PXY.LIZ().count;
                int i2 = 0;
                do {
                    LJJLIIIJL = s.LJJLIIIJL(LIZJ, lowerCase, i2, r12, 4);
                    int i3 = LJJLIIIJL - i;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    if (C1FL.LIZ(lowerCase, LJJLIIIJL, i) > LIZJ.length()) {
                        LIZ = LIZJ.length();
                    } else {
                        LIZ = C1FL.LIZ(lowerCase, LJJLIIIJL, i);
                    }
                    String substring = LIZJ.substring(i3, LIZ);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    String str2 = (String) ((ConcurrentHashMap) this.LIZJ).get(lowerCase);
                    if (str2 == null || ujb.o.LJJJJJL(str2)) {
                        String str3 = PXY.LIZ().ruleRegex;
                        if (TextUtils.isEmpty(str3)) {
                            str3 = "^(.*)([^a-z0-9]+)([^\\/])%s([^a-z0-9]+)(.*)$";
                        }
                        java.util.Map<String, String> map = this.LIZJ;
                        Object[] objArr = new Object[1];
                        objArr[r12] = lowerCase;
                        ((ConcurrentHashMap) map).put(lowerCase, Q8U.LIZIZ(objArr, 1, str3, "format(format, *args)"));
                    }
                    if (PatternProtector.compile((String) ((ConcurrentHashMap) this.LIZJ).get(lowerCase)).matcher(substring).find()) {
                        linkedHashSet2.add(substring);
                        linkedHashSet.add(next);
                        break loop0;
                    } else {
                        i2 = lowerCase.length() + LJJLIIIJL;
                        r12 = 0;
                    }
                } while (LJJLIIIJL != -1);
            }
        }
        if (!linkedHashSet.isEmpty()) {
            c58730N3e.LIZ = true;
            c58730N3e.LJI = linkedHashSet2;
            c58730N3e.LJIIIIZZ = linkedHashSet;
        }
    }

    public final void LJIJ(PVP pvp, Charset charset, C58730N3e c58730N3e) {
        boolean z;
        if (pvp.LIZ() == -1) {
            return;
        }
        PW6 pw6 = this.LIZLLL;
        long LIZ = pvp.LIZ();
        synchronized (pw6) {
            if (pw6.LIZ >= LIZ) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            C64533PUj c64533PUj = new C64533PUj();
            pvp.LJ(c64533PUj);
            this.LIZLLL.LIZ(c64533PUj.LJLILLLLZI);
            if (LJJ(c64533PUj)) {
                LJIIZILJ(c64533PUj.LLLLL(charset), PXY.LIZ().checkList, c58730N3e);
            } else {
                c64533PUj.LIZ();
            }
        }
    }

    public final void LJIJI(PVP pvp, Charset charset, C58730N3e c58730N3e) {
        C64534PUk c64534PUk = new C64534PUk(PU7.LIZLLL(new ByteArrayOutputStream()), this.LIZLLL);
        pvp.LJ(c64534PUk);
        if (LJJ(c64534PUk.LJLIL)) {
            LJIIZILJ(c64534PUk.LJLIL.LLLLL(charset), PXY.LIZ().checkList, c58730N3e);
        } else {
            c64534PUk.LJLIL.LIZ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v55, types: [R, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v3, types: [R, java.io.ByteArrayInputStream] */
    public final void LJIJJ(PPC<HttpURLConnection, InputStream> ppc, PPC<HttpURLConnection, Integer> ppc2, C58730N3e c58730N3e) {
        HttpURLConnection httpURLConnection;
        long LIZ;
        boolean LIZIZ;
        String requestProperty;
        C39745Fin LIZJ;
        Charset LIZ2;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (ppc != null) {
            httpURLConnection = ppc.LIZ;
        } else if (ppc2 != null) {
            httpURLConnection = ppc2.LIZ;
        } else {
            httpURLConnection = null;
        }
        if (httpURLConnection instanceof PYT) {
            LIZ = ((PYT) httpURLConnection).LJ;
        } else if (httpURLConnection instanceof PYU) {
            LIZ = ((PYU) httpURLConnection).LJ;
        } else {
            LIZ = PY3.LIZ();
        }
        if (httpURLConnection == null) {
            return;
        }
        java.net.URL url = httpURLConnection.getURL();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(url.getProtocol());
        LIZ3.append("://");
        LIZ3.append(url.getHost());
        LIZ3.append(url.getPath());
        String LIZIZ2 = X1D.LIZIZ(LIZ3);
        String path = url.getPath();
        o.LJIIIIZZ(path, "url.path");
        if (LJJI(path) || !httpURLConnection.getDoOutput()) {
            return;
        }
        try {
            if (httpURLConnection instanceof PYT) {
                LIZIZ = ((PYT) httpURLConnection).LIZIZ();
            } else {
                if (httpURLConnection instanceof PYU) {
                    LIZIZ = ((PYU) httpURLConnection).LIZIZ();
                }
            }
            if (!LIZIZ && LJJII(PXY.LIZ().urlConnectionSampling, LIZ) && (LIZJ = C39745Fin.LIZJ((requestProperty = httpURLConnection.getRequestProperty("Content-Type")))) != null && !LJIJJLI(LIZJ) && (LIZ2 = LIZJ.LIZ(LJ)) != null) {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                o.LJIIIIZZ(outputStream, "connection.outputStream");
                C64533PUj c64533PUj = new C64535PUl(PU7.LIZLLL(outputStream)).LJLIL;
                long LIZIZ3 = this.LIZLLL.LIZIZ(c64533PUj.LJLILLLLZI);
                if (LIZIZ3 > 0) {
                    this.LIZLLL.LIZ(LIZIZ3);
                    if (LJJ(c64533PUj)) {
                        LJIIZILJ(c64533PUj.LLLLL(LIZ2), PXY.LIZ().checkList, c58730N3e);
                    }
                    if (c58730N3e.LIZ) {
                        if (PXY.LIZ().intercept && PXY.LIZ().interceptApi.contains(LIZIZ2)) {
                            if (ppc == null) {
                                if (ppc2 != null) {
                                    ppc2.LIZ(PPD.INTERCEPT);
                                    ppc2.LIZIZ = 1001;
                                }
                            } else {
                                ppc.LIZ(PPD.INTERCEPT);
                                byte[] bytes = "{\"status_code\": 1001}".getBytes(PVC.LIZ);
                                o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
                                ppc.LIZIZ = new ByteArrayInputStream(bytes);
                            }
                            if (httpURLConnection instanceof PYU) {
                                PYU pyu = (PYU) httpURLConnection;
                                pyu.LIZJ = 1001;
                                pyu.LIZLLL = "{\"status_code\": 1001}";
                            } else if (httpURLConnection instanceof PYT) {
                                PYT pyt = (PYT) httpURLConnection;
                                pyt.LIZJ = 1001;
                                pyt.LIZLLL = "{\"status_code\": 1001}";
                            }
                        }
                        LJJIFFI(httpURLConnection.getURL().toString(), "3", c58730N3e, LIZ, SystemClock.uptimeMillis() - uptimeMillis);
                    }
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("handleURLConnection id: ");
                    LIZ4.append(LIZ);
                    LIZ4.append(", url: ");
                    LIZ4.append(LIZIZ2);
                    LIZ4.append(" cost: ");
                    LIZ4.append(SystemClock.uptimeMillis() - uptimeMillis);
                    LIZ4.append("ms, method: ");
                    LIZ4.append(httpURLConnection.getRequestMethod());
                    LIZ4.append(", type: ");
                    LIZ4.append(requestProperty);
                    X1D.LIZIZ(LIZ4);
                }
            }
        } finally {
            ((LinkedBlockingQueue) this.LIZIZ).remove(Long.valueOf(LIZ));
        }
    }

    public static void LJJIFFI(String str, String str2, C58730N3e c58730N3e, long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        String str3 = c58730N3e.LIZLLL;
        if ((str3 != null && !ujb.o.LJJJJJL(str3)) || (str != null && !ujb.o.LJJJJJL(str))) {
            String str4 = c58730N3e.LIZLLL;
            if (str4 != null) {
                str = str4;
            }
            c58730N3e.LIZLLL = str;
            jSONObject.put("url", str);
        }
        java.util.Set<String> set = c58730N3e.LJI;
        if (set != null && !set.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = c58730N3e.LJI.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("payload_segment", jSONArray);
        }
        java.util.Set<String> set2 = c58730N3e.LJIIIIZZ;
        if (set2 != null && !set2.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it2 = c58730N3e.LJIIIIZZ.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next());
            }
            jSONObject.put("config_rules", jSONArray2);
        }
        jSONObject.put("net_type", str2);
        jSONObject.put("cost", j2);
        C09900aA.LJ(EnumC58731N3f.COMPLIANCE_PAYLOAD_MONITOR_LOG.getLogType(), jSONObject);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reportMonitor id: ");
        LIZ.append(j);
        LIZ.append(", netType: ");
        LIZ.append(str2);
        LIZ.append(", data: ");
        LIZ.append(jSONObject);
        X1D.LIZIZ(LIZ);
    }
}
