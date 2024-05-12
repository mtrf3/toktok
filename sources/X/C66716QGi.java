package X;

import Y.ARunnableS17S0110000_11;
import Y.ARunnableS9S0101000_5;
import android.net.TrafficStats;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QGi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66716QGi implements QYQ {
    public static final Object LJIIL = new Object();
    public static final ThreadFactoryC47518Iks LJIILIIL = new ThreadFactoryC47518Iks();
    public final C67195QYt LIZ;
    public final QGU LIZIZ;
    public final C66717QGj LIZJ;
    public final C66723QGp LIZLLL;
    public final C66718QGk LJ;
    public final C64083PDb LJFF;
    public final Object LJI;
    public final ExecutorService LJII;
    public final PThreadPoolExecutor LJIIIIZZ;
    public String LJIIIZ;
    public final java.util.Set<QH1> LJIIJ;
    public final List<InterfaceC66732QGy> LJIIJJI;

    public final void LJFF() {
        C67195QYt c67195QYt = this.LIZ;
        c67195QYt.LIZ();
        QH7.LJFF("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", c67195QYt.LIZJ.LIZIZ);
        C67195QYt c67195QYt2 = this.LIZ;
        c67195QYt2.LIZ();
        QH7.LJFF("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", c67195QYt2.LIZJ.LJI);
        C67195QYt c67195QYt3 = this.LIZ;
        c67195QYt3.LIZ();
        QH7.LJFF("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", c67195QYt3.LIZJ.LIZ);
        C67195QYt c67195QYt4 = this.LIZ;
        c67195QYt4.LIZ();
        QH7.LIZ("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", c67195QYt4.LIZJ.LIZIZ.contains(":"));
        C67195QYt c67195QYt5 = this.LIZ;
        c67195QYt5.LIZ();
        QH7.LIZ("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", C66723QGp.LIZJ.matcher(c67195QYt5.LIZJ.LIZ).matches());
    }

    @Override // X.QYQ
    public final C67646Qgk getId() {
        String str;
        LJFF();
        synchronized (this) {
            str = this.LJIIIZ;
        }
        if (str != null) {
            return C67637Qgb.LJ(str);
        }
        C67649Qgn c67649Qgn = new C67649Qgn();
        LIZIZ(new C66726QGs(c67649Qgn));
        C67646Qgk<TResult> c67646Qgk = c67649Qgn.LIZ;
        this.LJII.execute(new ARunnableS9S0101000_5(4, this, 12));
        return c67646Qgk;
    }

    @Override // X.QYQ
    public final C67646Qgk getToken() {
        LJFF();
        C67649Qgn c67649Qgn = new C67649Qgn();
        LIZIZ(new C66719QGl(this.LIZLLL, c67649Qgn));
        C67646Qgk<TResult> c67646Qgk = c67649Qgn.LIZ;
        this.LJII.execute(new ARunnableS17S0110000_11(this, 1));
        return c67646Qgk;
    }

    public final void LIZIZ(InterfaceC66732QGy interfaceC66732QGy) {
        synchronized (this.LJI) {
            ((ArrayList) this.LJIIJJI).add(interfaceC66732QGy);
        }
    }

    public final void LIZJ(boolean z) {
        C66720QGm LIZJ;
        synchronized (LJIIL) {
            C67195QYt c67195QYt = this.LIZ;
            c67195QYt.LIZ();
            QM7 LIZ = QM7.LIZ(c67195QYt.LIZ);
            try {
                LIZJ = this.LIZJ.LIZJ();
                EnumC66725QGr enumC66725QGr = LIZJ.LIZJ;
                if (enumC66725QGr == EnumC66725QGr.NOT_GENERATED || enumC66725QGr == EnumC66725QGr.ATTEMPT_MIGRATION) {
                    String LJI = LJI(LIZJ);
                    C66717QGj c66717QGj = this.LIZJ;
                    C66721QGn c66721QGn = new C66721QGn(LIZJ);
                    c66721QGn.LIZ = LJI;
                    c66721QGn.LIZIZ(EnumC66725QGr.UNREGISTERED);
                    LIZJ = c66721QGn.LIZ();
                    c66717QGj.LIZIZ(LIZJ);
                }
            } finally {
                if (LIZ != null) {
                    LIZ.LJ();
                }
            }
        }
        if (z) {
            C66721QGn c66721QGn2 = new C66721QGn(LIZJ);
            c66721QGn2.LIZJ = null;
            LIZJ = c66721QGn2.LIZ();
        }
        LJIIIIZZ(LIZJ);
        this.LJIIIIZZ.execute(new ARunnableS17S0110000_11(this, z, 0));
    }

    public final C66720QGm LIZLLL(C66720QGm c66720QGm) {
        int responseCode;
        C66708QGa LIZ;
        QGU qgu = this.LIZIZ;
        C67195QYt c67195QYt = this.LIZ;
        c67195QYt.LIZ();
        String str = c67195QYt.LIZJ.LIZ;
        String str2 = c66720QGm.LIZIZ;
        C67195QYt c67195QYt2 = this.LIZ;
        c67195QYt2.LIZ();
        String str3 = c67195QYt2.LIZJ.LJI;
        String str4 = c66720QGm.LJ;
        if (qgu.LIZJ.LIZIZ()) {
            java.net.URL LIZJ = QGU.LIZJ(C16880lQ.LLLZ("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
            int i = 0;
            do {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection LJ = qgu.LJ(LIZJ, str);
                try {
                    try {
                        LJ.setRequestMethod("POST");
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("FIS_v2 ");
                        LIZ2.append(str4);
                        LJ.addRequestProperty("Authorization", X1D.LIZIZ(LIZ2));
                        LJ.setDoOutput(true);
                        QGU.LJIIIZ(LJ);
                        responseCode = LJ.getResponseCode();
                        qgu.LIZJ.LIZLLL(responseCode);
                    } catch (IOException | AssertionError unused) {
                    }
                    if (responseCode >= 200 && responseCode < 300) {
                        LIZ = QGU.LJII(LJ);
                    } else {
                        QGU.LIZLLL(LJ);
                        if (responseCode == 401 || responseCode == 404) {
                            QGV qgv = new QGV();
                            qgv.LIZIZ = 0L;
                            qgv.LIZJ = EnumC66714QGg.AUTH_ERROR;
                            LIZ = qgv.LIZ();
                        } else if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                QGV qgv2 = new QGV();
                                qgv2.LIZIZ = 0L;
                                qgv2.LIZJ = EnumC66714QGg.BAD_CONFIG;
                                LIZ = qgv2.LIZ();
                            }
                            LJ.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        } else {
                            throw new C66730QGw("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", EnumC66715QGh.TOO_MANY_REQUESTS);
                        }
                    }
                    LJ.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int i2 = C66713QGf.LIZIZ[LIZ.LIZJ.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                LJIIIZ(null);
                                C66721QGn c66721QGn = new C66721QGn(c66720QGm);
                                c66721QGn.LIZIZ(EnumC66725QGr.NOT_GENERATED);
                                return c66721QGn.LIZ();
                            }
                            throw new C66730QGw("Firebase Installations Service is unavailable. Please try again later.", EnumC66715QGh.UNAVAILABLE);
                        }
                        return c66720QGm.LJIIIIZZ();
                    }
                    String str5 = LIZ.LIZ;
                    long j = LIZ.LIZIZ;
                    C66723QGp c66723QGp = this.LIZLLL;
                    c66723QGp.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    c66723QGp.LIZ.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    C66721QGn c66721QGn2 = new C66721QGn(c66720QGm);
                    c66721QGn2.LIZJ = str5;
                    c66721QGn2.LJ = Long.valueOf(j);
                    c66721QGn2.LJFF = Long.valueOf(seconds);
                    return c66721QGn2.LIZ();
                } catch (Throwable th) {
                    LJ.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } while (i <= 1);
            throw new C66730QGw("Firebase Installations Service is unavailable. Please try again later.", EnumC66715QGh.UNAVAILABLE);
        }
        throw new C66730QGw("Firebase Installations Service is unavailable. Please try again later.", EnumC66715QGh.UNAVAILABLE);
    }

    public final void LJ(C66720QGm c66720QGm) {
        synchronized (LJIIL) {
            C67195QYt c67195QYt = this.LIZ;
            c67195QYt.LIZ();
            QM7 LIZ = QM7.LIZ(c67195QYt.LIZ);
            try {
                this.LIZJ.LIZIZ(c66720QGm);
            } finally {
                if (LIZ != null) {
                    LIZ.LJ();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.LIZIZ) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJI(X.C66720QGm r4) {
        /*
            r3 = this;
            X.QYt r0 = r3.LIZ
            r0.LIZ()
            java.lang.String r1 = r0.LIZIZ
            java.lang.String r0 = "CHIME_ANDROID_SDK"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1e
            X.QYt r0 = r3.LIZ
            r0.LIZ()
            java.lang.String r1 = r0.LIZIZ
            java.lang.String r0 = "[DEFAULT]"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L27
        L1e:
            X.QGr r1 = r4.LIZJ
            X.QGr r0 = X.EnumC66725QGr.ATTEMPT_MIGRATION
            if (r1 != r0) goto L31
            r0 = 1
        L25:
            if (r0 != 0) goto L33
        L27:
            X.PDb r0 = r3.LJFF
            r0.getClass()
            java.lang.String r0 = X.C64083PDb.LIZ()
            return r0
        L31:
            r0 = 0
            goto L25
        L33:
            X.QGk r0 = r3.LJ
            android.content.SharedPreferences r2 = r0.LIZ
            monitor-enter(r2)
            java.lang.String r1 = r0.LIZ()     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L40
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            goto L45
        L40:
            java.lang.String r1 = r0.LIZIZ()     // Catch: java.lang.Throwable -> L55
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
        L45:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L54
            X.PDb r0 = r3.LJFF
            r0.getClass()
            java.lang.String r1 = X.C64083PDb.LIZ()
        L54:
            return r1
        L55:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66716QGi.LJI(X.QGm):java.lang.String");
    }

    public final void LJII(Exception exc) {
        synchronized (this.LJI) {
            Iterator it = ((ArrayList) this.LJIIJJI).iterator();
            while (it.hasNext()) {
                if (((InterfaceC66732QGy) it.next()).LIZ(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void LJIIIIZZ(C66720QGm c66720QGm) {
        synchronized (this.LJI) {
            Iterator it = ((ArrayList) this.LJIIJJI).iterator();
            while (it.hasNext()) {
                if (((InterfaceC66732QGy) it.next()).LIZIZ(c66720QGm)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void LJIIIZ(String str) {
        this.LJIIIZ = str;
    }

    public C66716QGi(C67195QYt c67195QYt, C6Y7<QGY> c6y7) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactoryC47518Iks threadFactoryC47518Iks = LJIILIIL;
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactoryC47518Iks);
        c67195QYt.LIZ();
        QGU qgu = new QGU(c67195QYt.LIZ, c6y7);
        C66717QGj c66717QGj = new C66717QGj(c67195QYt);
        if (C72083SQt.LJLJI == null) {
            C72083SQt.LJLJI = new C72083SQt();
        }
        C72083SQt c72083SQt = C72083SQt.LJLJI;
        if (C66723QGp.LIZLLL == null) {
            C66723QGp.LIZLLL = new C66723QGp(c72083SQt);
        }
        C66723QGp c66723QGp = C66723QGp.LIZLLL;
        C66718QGk c66718QGk = new C66718QGk(c67195QYt);
        C64083PDb c64083PDb = new C64083PDb();
        this.LJI = new Object();
        this.LJIIJ = new HashSet();
        this.LJIIJJI = new ArrayList();
        this.LIZ = c67195QYt;
        this.LIZIZ = qgu;
        this.LIZJ = c66717QGj;
        this.LIZLLL = c66723QGp;
        this.LJ = c66718QGk;
        this.LJFF = c64083PDb;
        this.LJII = pThreadPoolExecutor;
        this.LJIIIIZZ = new PThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), threadFactoryC47518Iks);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static C66720QGm LIZ(C66716QGi c66716QGi, C66720QGm c66720QGm) {
        int responseCode;
        C66710QGc c66710QGc;
        String str = c66720QGm.LIZIZ;
        String str2 = null;
        if (str != null && str.length() == 11) {
            C66718QGk c66718QGk = c66716QGi.LJ;
            synchronized (c66718QGk.LIZ) {
                String[] strArr = C66718QGk.LIZJ;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String str3 = strArr[i];
                    String str4 = c66718QGk.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("|T|");
                    LIZ.append(str4);
                    LIZ.append("|");
                    LIZ.append(str3);
                    String string = c66718QGk.LIZ.getString(X1D.LIZIZ(LIZ), null);
                    if (string == null || string.isEmpty()) {
                        i++;
                    } else if (string.startsWith("{")) {
                        try {
                            str2 = JSONObjectProtectorUtils.getString(new JSONObject(string), "token");
                        } catch (JSONException unused) {
                        }
                    } else {
                        str2 = string;
                    }
                }
            }
        }
        QGU qgu = c66716QGi.LIZIZ;
        C67195QYt c67195QYt = c66716QGi.LIZ;
        c67195QYt.LIZ();
        String str5 = c67195QYt.LIZJ.LIZ;
        String str6 = c66720QGm.LIZIZ;
        C67195QYt c67195QYt2 = c66716QGi.LIZ;
        c67195QYt2.LIZ();
        String str7 = c67195QYt2.LIZJ.LJI;
        C67195QYt c67195QYt3 = c66716QGi.LIZ;
        c67195QYt3.LIZ();
        String str8 = c67195QYt3.LIZJ.LIZIZ;
        if (qgu.LIZJ.LIZIZ()) {
            ?? r12 = 1;
            java.net.URL LIZJ = QGU.LIZJ(C16880lQ.LLLZ("projects/%s/installations", new Object[]{str7}));
            int i2 = 0;
            do {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection LJ = qgu.LJ(LIZJ, str5);
                try {
                    try {
                        LJ.setRequestMethod("POST");
                        LJ.setDoOutput(r12);
                        if (str2 != null) {
                            LJ.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        QGU.LJIIIIZZ(LJ, str6, str8);
                        responseCode = LJ.getResponseCode();
                        qgu.LIZJ.LIZLLL(responseCode);
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (responseCode >= 200 && responseCode < 300) {
                        c66710QGc = QGU.LJI(LJ);
                    } else {
                        QGU.LIZLLL(LJ);
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                QGW qgw = new QGW();
                                try {
                                    c66710QGc = new C66710QGc(qgw.LIZ, qgw.LIZIZ, qgw.LIZJ, qgw.LIZLLL, EnumC66712QGe.BAD_CONFIG);
                                } catch (IOException | AssertionError unused3) {
                                    r12 = 1;
                                }
                            }
                            LJ.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2++;
                        } else {
                            throw new C66730QGw("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", EnumC66715QGh.TOO_MANY_REQUESTS);
                        }
                    }
                    LJ.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int i3 = C66713QGf.LIZ[c66710QGc.LJ.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            return c66720QGm.LJIIIIZZ();
                        }
                        throw new C66730QGw("Firebase Installations Service is unavailable. Please try again later.", EnumC66715QGh.UNAVAILABLE);
                    }
                    String str9 = c66710QGc.LIZIZ;
                    String str10 = c66710QGc.LIZJ;
                    C66723QGp c66723QGp = c66716QGi.LIZLLL;
                    c66723QGp.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    c66723QGp.LIZ.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    String LIZIZ = c66710QGc.LIZLLL.LIZIZ();
                    long LIZJ2 = c66710QGc.LIZLLL.LIZJ();
                    C66721QGn c66721QGn = new C66721QGn(c66720QGm);
                    c66721QGn.LIZ = str9;
                    c66721QGn.LIZIZ(EnumC66725QGr.REGISTERED);
                    c66721QGn.LIZJ = LIZIZ;
                    c66721QGn.LIZLLL = str10;
                    c66721QGn.LJ = Long.valueOf(LIZJ2);
                    c66721QGn.LJFF = Long.valueOf(seconds);
                    return c66721QGn.LIZ();
                } catch (Throwable th) {
                    LJ.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } while (i2 <= r12);
            throw new C66730QGw("Firebase Installations Service is unavailable. Please try again later.", EnumC66715QGh.UNAVAILABLE);
        }
        throw new C66730QGw("Firebase Installations Service is unavailable. Please try again later.", EnumC66715QGh.UNAVAILABLE);
    }

    public final synchronized void LJIIJ(C66720QGm c66720QGm, C66720QGm c66720QGm2) {
        if (((HashSet) this.LJIIJ).size() != 0 && !c66720QGm.LIZIZ.equals(c66720QGm2.LIZIZ)) {
            Iterator it = ((HashSet) this.LJIIJ).iterator();
            while (it.hasNext()) {
                ((QH1) it.next()).LIZ();
            }
        }
    }
}
