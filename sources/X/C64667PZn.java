package X;

import android.app.Application;
import android.content.Context;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.client.Request;
import ee1.l;
import java.io.InputStream;
import java.net.Proxy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PZn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64667PZn implements InterfaceC64790Pbm {
    public static volatile C64667PZn LIZ = null;
    public static volatile int LIZIZ = -1;
    public static volatile String LIZJ = "";
    public static volatile Proxy LIZLLL;
    public static final Object LJ = new Object();
    public static int LJFF = 0;
    public static volatile String LJI = "";
    public static String LJII = "tt-ok/3.10.0.2";
    public static volatile int LJIIIIZZ = 0;
    public static volatile String LJIIIZ = null;
    public static volatile String[] LJIIJ = null;
    public static volatile String[] LJIIJJI = null;
    public static Context LJIIL;
    public static PX1 LJIILIIL;
    public static InterfaceC64615PXn LJIILJJIL;

    public static InterfaceC64615PXn LJ() {
        return LJIILJJIL;
    }

    public static String LJFF() {
        return LJII;
    }

    public C64667PZn(Context context) {
        Application application;
        if (!TextUtils.isEmpty("okhttp/3.12.13.4-tiktok")) {
            LJII = "okhttp/3.12.13.4-tiktok".replaceFirst("okhttp/", "tt-ok/");
        }
        LJIIL = C16880lQ.LLLLL(context);
        LJIILIIL = new PX1();
        l LJ2 = l.LJ();
        Context context2 = LJIIL;
        LJ2.getClass();
        l.LJFF(context2);
        C64811Pc7 LJ3 = C64811Pc7.LJ();
        C64669PZp c64669PZp = new C64669PZp();
        if (LJ3.LJLLLLLL) {
            Logger.debug();
            return;
        }
        if (LJIIL != null && !TextUtils.isEmpty(LJIIIZ) && String.valueOf(LJIIIIZZ) != null) {
            LJ3.LJLLLL = c64669PZp;
            if (TextUtils.isEmpty(LJ3.LJLJI)) {
                LJ3.LJLJI = LJIIIZ;
            }
            LJ3.LJLLLLLL = true;
            try {
                C64811Pc7.LJZ.submit(new CallableC64617PXp());
            } catch (RejectedExecutionException e) {
                C16880lQ.LLLLIIL(e);
            }
            C48180IvY c48180IvY = LJ3.LJLLL;
            Context context3 = LJIIL;
            c48180IvY.getClass();
            if (context3 != null) {
                C16880lQ.LJJLIIIJILLIZJL(c48180IvY.LIZIZ, context3, AnonymousClass028.LIZ("android.net.conn.CONNECTIVITY_CHANGE"));
                Logger.debug();
            }
            Logger.debug();
            if ((context3 instanceof Application) && (application = (Application) context3) != null) {
                C48179IvX c48179IvX = c48180IvY.LIZ;
                c48179IvX.LJLIL = c48180IvY;
                application.registerActivityLifecycleCallbacks(c48179IvX);
            }
            if (LJ3.LJLJJLL.size() < 1) {
                LJ3.LJLLLL.getClass();
                if (LJIIJ != null) {
                    LJ3.LJLLLL.getClass();
                    if (LJIIJ.length > 0) {
                        LJ3.LJLLLL.getClass();
                        if (LJIIJ.length <= 10) {
                            ConcurrentSkipListSet<String> concurrentSkipListSet = LJ3.LJLJJLL;
                            LJ3.LJLLLL.getClass();
                            concurrentSkipListSet.addAll(Arrays.asList(LJIIJ));
                            LJ3.LIZIZ(EnumC64814PcA.PRELOAD_BATCH);
                        }
                    }
                }
                Logger.debug();
            } else {
                LJ3.LIZIZ(EnumC64814PcA.PRELOAD_BATCH);
            }
            Message obtain = Message.obtain();
            obtain.what = 5;
            obtain.obj = LJ3;
            C64811Pc7.LLD.sendMessage(obtain);
            return;
        }
        LJ3.LJLLLL = null;
        throw new IllegalArgumentException("you must set correct httpdns depend");
    }

    public static String LIZJ(C64606PXe c64606PXe) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((TreeMap) c64606PXe.LJIIIZ()).entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jSONObject.put(str, (String) it.next());
                    }
                }
            }
            return jSONObject.toString();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return "";
        }
    }

    public static String LIZLLL(C64598PWw c64598PWw) {
        List<String> LJIIJJI2;
        if (c64598PWw == null) {
            return "";
        }
        try {
            C64606PXe c64606PXe = c64598PWw.LJLJJLL;
            if (c64606PXe == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            for (String str : c64606PXe.LJFF()) {
                if (!C38354F3m.LJ(str) && (LJIIJJI2 = c64606PXe.LJIIJJI(str)) != null && !LJIIJJI2.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    int i = 0;
                    for (String str2 : LJIIJJI2) {
                        if (!C38354F3m.LJ(str2)) {
                            if (i == 0) {
                                sb.append(str2);
                            } else {
                                sb.append("; ");
                                sb.append(str2);
                            }
                            i++;
                        }
                    }
                    jSONObject.put(str, sb.toString());
                }
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static C64667PZn LJII(Context context) {
        if (LIZ == null) {
            synchronized (C64667PZn.class) {
                if (LIZ == null) {
                    LIZ = new C64667PZn(context);
                }
            }
        }
        return LIZ;
    }

    @Override // X.InterfaceC64777PbZ
    public final InterfaceC64803Pbz LIZ(Request request) {
        try {
            Request LIZ2 = C64704PaO.LJFF().LIZ(request);
            if (LIZ2 != null) {
                request = LIZ2;
            }
        } catch (Throwable unused) {
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Request LIZJ2 = C38092ExE.LIZLLL().LIZJ(request);
        if (request.getMetrics() != null) {
            request.getMetrics().LJJIZ = SystemClock.uptimeMillis() - uptimeMillis;
        }
        if (LIZJ2 != null) {
            request = LIZJ2;
        }
        return new C64661PZh(request);
    }

    public static JSONObject LIZIZ(okhttp3.Request request, C64668PZo c64668PZo) {
        JSONObject jSONObject = new JSONObject();
        if (request == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("hc", "SsOkHttp3Client");
            jSONObject.put("hcv", LJII);
            jSONObject.put("ua", request.header("User-Agent"));
            if (c64668PZo.LJJIII) {
                jSONObject.put("turing_callback", c64668PZo.LJJIIJ);
            }
            if (c64668PZo.LJJIIJZLJL) {
                jSONObject.put("turing_retry", "1");
            }
            long j = c64668PZo.LJJIIZI;
            if (j >= 0) {
                jSONObject.put("turing_callback", j);
            }
            String str = c64668PZo.LJJIIZ;
            if (str != null) {
                jSONObject.put("retry_by_header", str);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public static String LJIIIIZZ(C64598PWw c64598PWw, C64668PZo c64668PZo) {
        T t;
        if (c64598PWw == null) {
            return null;
        }
        String LIZ2 = c64598PWw.LIZ("x-net-info.remoteaddr", null);
        if (!C38354F3m.LJ(LIZ2) && c64668PZo != null) {
            try {
                Logger.debug();
                c64668PZo.LIZ = LIZ2;
                T t2 = c64668PZo.LIZIZ;
                if (t2 != 0) {
                    t2.LIZ = LIZ2;
                }
            } catch (Throwable unused) {
            }
        }
        if (c64668PZo != null && (t = c64668PZo.LIZIZ) != 0) {
            t.LIZIZ = c64598PWw.LJLJI;
        }
        return c64598PWw.LIZ("X-TT-LOGID", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r3 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static okhttp3.Request LJIIIZ(X.C64618PXq r6, java.util.List<X.EJ6> r7) {
        /*
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = "gzip"
            r6.LIZ(r1, r0)
            r5 = 0
            if (r7 == 0) goto L41
            java.util.Iterator r4 = r7.iterator()
            r3 = 0
        Lf:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r2 = r4.next()
            X.EJ6 r2 = (X.EJ6) r2
            java.lang.String r0 = r2.LIZ
            boolean r0 = X.C38354F3m.LJ(r0)
            if (r0 != 0) goto Lf
            java.lang.String r0 = r2.LIZIZ
            boolean r0 = X.C38354F3m.LJ(r0)
            if (r0 == 0) goto L2c
            goto Lf
        L2c:
            java.lang.String r1 = "User-Agent"
            java.lang.String r0 = r2.LIZ
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L37
            r3 = 1
        L37:
            java.lang.String r1 = r2.LIZ
            java.lang.String r0 = r2.LIZIZ
            r6.LIZLLL(r1, r0)
            goto Lf
        L3f:
            if (r3 != 0) goto L5d
        L41:
            java.lang.String r1 = X.C64735Pat.LJFF
            boolean r0 = X.C38354F3m.LJ(r1)
            if (r0 != 0) goto L62
            java.lang.String r0 = " "
            java.lang.StringBuilder r1 = defpackage.b1.LIZJ(r1, r0)
            java.lang.String r0 = X.C64667PZn.LJII
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "User-Agent"
            r6.LIZLLL(r0, r1)
        L5d:
            okhttp3.Request r0 = r6.LIZIZ()
            return r0
        L62:
            java.lang.String r0 = X.C64667PZn.LJI
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r0 = X.C64667PZn.LJIIL
            java.lang.String r0 = r0.getPackageName()
            r2.append(r0)
            r0 = 47
            r2.append(r0)
            android.content.Context r4 = X.C64667PZn.LJIIL
            java.lang.Object r3 = X.C64667PZn.LJ
            monitor-enter(r3)
            int r0 = X.C64667PZn.LJFF     // Catch: java.lang.Throwable -> Lf4
            if (r0 != 0) goto L96
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r0 = r4.getPackageName()     // Catch: java.lang.Throwable -> Lf4
            android.content.pm.PackageInfo r0 = X.C16880lQ.LLLLLLZ(r1, r0, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L96 java.lang.Throwable -> Lf4
            int r0 = r0.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L96 java.lang.Throwable -> Lf4
            X.C64667PZn.LJFF = r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L96 java.lang.Throwable -> Lf4
        L96:
            int r0 = X.C64667PZn.LJFF     // Catch: java.lang.Throwable -> Lf4
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lf4
            r2.append(r0)
            java.lang.String r0 = " (Linux; U; Android "
            r2.append(r0)
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r2.append(r0)
            java.lang.String r0 = "; "
            r2.append(r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r1 = android.os.Build.MODEL
            int r0 = r1.length()
            if (r0 <= 0) goto Lc6
            java.lang.String r0 = "; "
            r2.append(r0)
            r2.append(r1)
        Lc6:
            java.lang.String r1 = android.os.Build.ID
            int r0 = r1.length()
            if (r0 <= 0) goto Ld6
            java.lang.String r0 = "; Build/"
            r2.append(r0)
            r2.append(r1)
        Ld6:
            java.lang.String r0 = ";"
            r2.append(r0)
            java.lang.String r1 = X.C64667PZn.LJII
            r0 = 41
            java.lang.String r0 = X.C07670Rv.LIZIZ(r2, r1, r0)
            X.C64667PZn.LJI = r0
        Le5:
            java.lang.String r1 = X.C64667PZn.LJI
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "User-Agent"
            r6.LIZLLL(r0, r1)
            goto L5d
        Lf4:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lf4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64667PZn.LJIIIZ(X.PXq, java.util.List):okhttp3.Request");
    }

    public static void LJI(C64668PZo c64668PZo, C64738Paw c64738Paw, C64608PXg c64608PXg) {
        boolean z;
        if (c64668PZo == null || c64738Paw == null) {
            return;
        }
        c64668PZo.LJJIJIIJIL = c64738Paw;
        c64738Paw.LIZIZ = c64668PZo.LJIJJ;
        c64738Paw.LIZJ = c64668PZo.LJIJJLI;
        c64738Paw.LJIJJLI = SystemClock.uptimeMillis();
        c64738Paw.LJIIJJI = System.currentTimeMillis();
        c64738Paw.LJJJIL = "4.2.152.11-tiktok";
        try {
            c64668PZo.LJJ.put("retrofit", c64738Paw.LIZLLL());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (c64608PXg == null) {
            return;
        }
        Context context = LJIIL;
        c64668PZo.LIZ = c64608PXg.LJJIIJZLJL;
        c64668PZo.LJIIIZ = C64608PXg.LJIIIZ(c64608PXg.LIZJ, c64608PXg.LIZIZ);
        c64668PZo.LJIIJ = C64608PXg.LJIIIZ(c64608PXg.LJ, c64608PXg.LIZLLL);
        c64668PZo.LJIIJJI = C64608PXg.LJIIIZ(c64608PXg.LJFF, c64608PXg.LJ);
        c64668PZo.LJIIL = C64608PXg.LJIIIZ(c64608PXg.LJIIIZ, c64608PXg.LJIIIIZZ) + C64608PXg.LJIIIZ(c64608PXg.LJII, c64608PXg.LJI);
        c64668PZo.LJIILIIL = C64608PXg.LJIIIZ(c64608PXg.LJIIJJI, c64608PXg.LJII);
        if (c64608PXg.LIZLLL == -1 && c64608PXg.LJIILL != -1) {
            z = true;
        } else {
            z = false;
        }
        c64668PZo.LJIILJJIL = z;
        c64668PZo.LJIILL = -1L;
        c64668PZo.LJIILLIIL = C64608PXg.LJIIIZ(c64608PXg.LJIILJJIL.get(), c64608PXg.LIZ);
        c64668PZo.LJIIZILJ = c64608PXg.LJIL;
        c64668PZo.LJIJ = c64608PXg.LJJIFFI;
        c64668PZo.LJIL = c64608PXg.LIZIZ(context);
        C64606PXe c64606PXe = c64608PXg.LJJ;
        if (c64606PXe != null) {
            c64668PZo.LJJIFFI = c64606PXe.toString();
            c64668PZo.LJIIZILJ = c64608PXg.LJJ.LIZ() + c64668PZo.LJIIZILJ;
        }
        C64606PXe c64606PXe2 = c64608PXg.LJJIIZI;
        if (c64606PXe2 != null) {
            c64668PZo.LJJII = c64606PXe2.toString();
            c64668PZo.LJIJ = c64608PXg.LJJIIZI.LIZ() + c64668PZo.LJIJ;
        }
        c64668PZo.LJJIJIIJI = c64608PXg.LJJIJ;
    }

    public static void LJIIJJI(boolean z, java.util.Map map, int i, InputStream inputStream, String str, C64738Paw c64738Paw) {
        if (inputStream == null) {
            return;
        }
        int[] iArr = new int[1];
        try {
            iArr[0] = 0;
            byte[] LIZJ2 = C64718Pac.LIZJ(z, map, i, inputStream, iArr, c64738Paw);
            C64718Pac.LJ(inputStream);
            int i2 = iArr[0];
            byte[] bArr = new byte[i2];
            if (LIZJ2 != null) {
                if (i2 > 0) {
                    System.arraycopy(LIZJ2, 0, bArr, 0, i2);
                } else {
                    return;
                }
            } else if (i2 <= 0) {
                return;
            }
            if (!C38354F3m.LJ(str) && Logger.debug()) {
                try {
                    C61696OJg c61696OJg = new C61696OJg(str);
                    if ("text".equalsIgnoreCase(c61696OJg.getPrimaryType()) || "application/json".equalsIgnoreCase(c61696OJg.getBaseType())) {
                        c61696OJg.getParameter("charset");
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            C64718Pac.LJ(inputStream);
            throw th;
        }
    }

    public static byte[] LJIIL(String str, int i, C64598PWw c64598PWw, C64668PZo c64668PZo, String str2, C64738Paw c64738Paw, C64608PXg c64608PXg) {
        boolean z;
        if (c64598PWw == null) {
            return new byte[0];
        }
        int i2 = c64598PWw.LJLJI;
        PVM pvm = c64598PWw.LJLJL;
        java.util.Map<String, List<String>> LJIIIZ2 = c64598PWw.LJLJJLL.LJIIIZ();
        boolean equals = "gzip".equals(c64598PWw.LIZ("Content-Encoding", null));
        String LIZ2 = c64598PWw.LIZ("Content-Type", null);
        c64668PZo.LJIJJ = LIZIZ;
        c64668PZo.LJIJJLI = LIZJ;
        if (i2 != 200) {
            T t = c64668PZo.LIZIZ;
            if (t == 0 || !t.LJIIIZ) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (i2 == 304) {
                    c64668PZo.LJI = System.currentTimeMillis();
                    System.currentTimeMillis();
                    c64668PZo.LJII = System.currentTimeMillis();
                    LJI(c64668PZo, c64738Paw, c64608PXg);
                }
                String str3 = c64598PWw.LJLJJI;
                if (pvm != null) {
                    LJIIJJI(equals, LJIIIZ2, i, pvm.byteStream(), LIZ2, c64738Paw);
                    C64718Pac.LJ(pvm);
                }
                C64802Pby c64802Pby = new C64802Pby(i2, str3);
                if (i2 == 304) {
                    c64802Pby.setInfo(true, true, false, str, str2, c64668PZo);
                }
                throw new C64802Pby(i2, str3);
            }
        }
        if (pvm != null) {
            c64668PZo.LJI = System.currentTimeMillis();
            InputStream byteStream = pvm.byteStream();
            int[] iArr = new int[1];
            try {
                iArr[0] = 0;
                byte[] LIZJ2 = C64718Pac.LIZJ(equals, LJIIIZ2, i, byteStream, iArr, c64738Paw);
                C64718Pac.LJ(byteStream);
                int i3 = iArr[0];
                byte[] bArr = new byte[i3];
                if (LIZJ2 != null && i3 > 0) {
                    System.arraycopy(LIZJ2, 0, bArr, 0, i3);
                }
                if (C64718Pac.LJFF(LIZ2)) {
                    C64718Pac.LIZ(i3, bArr);
                }
                System.currentTimeMillis();
                c64668PZo.LJII = System.currentTimeMillis();
                LJI(c64668PZo, c64738Paw, c64608PXg);
                try {
                    C64704PaO.LJFF().LJIIIZ(c64598PWw, str, bArr);
                } catch (Throwable unused) {
                }
                return bArr;
            } catch (Throwable th) {
                C64718Pac.LJ(byteStream);
                throw th;
            }
        }
        return new byte[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r4 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(okhttp3.Request r2, java.lang.String r3, X.C64668PZo r4, java.lang.Exception r5, X.InterfaceC48133Iun r6, X.C64598PWw r7, X.C64738Paw r8, X.C64608PXg r9) {
        /*
            if (r3 == 0) goto Lb1
            if (r4 == 0) goto Le
            org.json.JSONObject r0 = r4.LJJ     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto Le
            org.json.JSONObject r0 = LIZIZ(r2, r4)     // Catch: java.lang.Throwable -> L58
            r4.LJJ = r0     // Catch: java.lang.Throwable -> L58
        Le:
            java.lang.String r3 = r5.getMessage()     // Catch: java.lang.Throwable -> L58
            java.lang.Throwable r2 = r5.getCause()     // Catch: java.lang.Throwable -> L58
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L3f
            if (r2 == 0) goto L3f
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L58
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L3f
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L58
            r1.append(r3)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = ", cause = "
            r1.append(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L58
            r1.append(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L58
        L3f:
            org.json.JSONObject r1 = r4.LJJ     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "ex"
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = LIZLLL(r7)     // Catch: java.lang.Throwable -> L58
            boolean r0 = X.C38354F3m.LJ(r2)     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L5a
            org.json.JSONObject r1 = r4.LJJ     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "response-headers"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            if (r4 == 0) goto L97
        L5a:
            java.lang.String r0 = r4.LIZ
            boolean r0 = X.C38354F3m.LJ(r0)
            if (r0 == 0) goto L97
            java.lang.String r0 = r5.getMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L75
        L6c:
            java.lang.String r1 = ""
        L6e:
            boolean r0 = X.C38354F3m.LJ(r1)
            if (r0 != 0) goto L97
            goto L8c
        L75:
            java.lang.String r1 = r5.getMessage()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "\\|"
            java.lang.String[] r2 = r1.split(r0)     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto L6c
            int r1 = r2.length     // Catch: java.lang.Throwable -> L6c
            r0 = 2
            if (r1 < r0) goto L6c
            com.bytedance.common.utility.Logger.debug()     // Catch: java.lang.Throwable -> L6c
            r0 = 0
            r1 = r2[r0]     // Catch: java.lang.Throwable -> L6c
            goto L6e
        L8c:
            com.bytedance.common.utility.Logger.debug()     // Catch: java.lang.Throwable -> L97
            r4.LIZ = r1     // Catch: java.lang.Throwable -> L97
            T extends X.PaH r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L97
            r0.LIZ = r1     // Catch: java.lang.Throwable -> L97
        L97:
            java.lang.System.currentTimeMillis()
            long r0 = java.lang.System.currentTimeMillis()
            r4.LJII = r0
            int r0 = X.C64667PZn.LIZIZ
            r4.LJIJJ = r0
            java.lang.String r0 = X.C64667PZn.LIZJ
            r4.LJIJJLI = r0
            LJI(r4, r8, r9)
            if (r6 == 0) goto Lb1
            r6.cancel()
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64667PZn.LJIIJ(okhttp3.Request, java.lang.String, X.PZo, java.lang.Exception, X.Iun, X.PWw, X.Paw, X.PXg):void");
    }
}
