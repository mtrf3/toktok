package X;

import android.content.SharedPreferences;
import android.os.Process;
import com.bytedance.monitor.collector.MonitorJni;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.PGl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64171PGl {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final C64192PHg LIZIZ;
    public final C64194PHi LIZJ;
    public SharedPreferences LIZLLL;
    public PG9 LJ;
    public final C46625IRp LJFF;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (0 != 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r8 = this;
            android.content.SharedPreferences r0 = r8.LIZLLL
            java.util.Map r0 = r0.getAll()
            if (r0 == 0) goto La9
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L10:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = ","
            java.lang.String[] r1 = r1.split(r0)     // Catch: java.lang.Throwable -> L10
            r0 = 0
            r2 = r1[r0]     // Catch: java.lang.Throwable -> L10
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L10
            r1.append(r2)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = "/stat"
            r1.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L10
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r5 = ""
            r4 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L65
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = r6.getPath()     // Catch: java.lang.Throwable -> L65
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L65
            r0 = 100
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = r2.readLine()     // Catch: java.lang.Throwable -> L63
            goto L6b
        L63:
            r4 = r2
            goto L67
        L65:
            if (r4 == 0) goto L6e
        L67:
            r4.close()     // Catch: java.lang.Throwable -> L10
            goto L6e
        L6b:
            r2.close()     // Catch: java.lang.Throwable -> L10
        L6e:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L82
            android.content.SharedPreferences r0 = r8.LIZLLL     // Catch: java.lang.Throwable -> L10
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L10
            android.content.SharedPreferences$Editor r0 = r0.remove(r3)     // Catch: java.lang.Throwable -> L10
            r0.apply()     // Catch: java.lang.Throwable -> L10
            goto L10
        L82:
            java.lang.String r0 = " "
            java.lang.String[] r0 = r5.split(r0)     // Catch: java.lang.Throwable -> L10
            r2 = 1
            r1 = r0[r2]     // Catch: java.lang.Throwable -> L10
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L10
            int r0 = r0 - r2
            java.lang.String r0 = r1.substring(r2, r0)     // Catch: java.lang.Throwable -> L10
            boolean r0 = r3.endsWith(r0)     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L10
            android.content.SharedPreferences r0 = r8.LIZLLL     // Catch: java.lang.Throwable -> L10
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L10
            android.content.SharedPreferences$Editor r0 = r0.remove(r3)     // Catch: java.lang.Throwable -> L10
            r0.apply()     // Catch: java.lang.Throwable -> L10
            goto L10
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64171PGl.LIZ():void");
    }

    public final boolean LIZIZ() {
        boolean z;
        if (this.LJ.isForeground()) {
            SharedPreferences.Editor edit = this.LIZLLL.edit();
            String LJIJJ = PC5.LJIJJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(Process.myPid());
            LIZ.append(",");
            LIZ.append(this.LJ.isForeground());
            edit.putString(LJIJJ, X1D.LIZIZ(LIZ)).apply();
            return true;
        }
        java.util.Map<String, ?> all = this.LIZLLL.getAll();
        if (all != null) {
            Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
            while (it.hasNext()) {
                if (((String) it.next().getValue()).split(",")[1].equals("true")) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        C64125PEr LIZLLL = C64125PEr.LIZLLL();
        int i = C64173PGn.LIZ;
        LIZLLL.getClass();
        EnumC64172PGm valueOf = EnumC64172PGm.valueOf(MonitorJni.getProcCGroup(i));
        if (z || this.LJ.isForeground() || valueOf == EnumC64172PGm.TOP_APP || valueOf == EnumC64172PGm.FOREGROUND) {
            return true;
        }
        return false;
    }

    public C64171PGl() {
        try {
            this.LJFF = UC0.LJIIJ(C09970aH.LIZ);
        } catch (Throwable unused) {
        }
        C64194PHi c64194PHi = new C64194PHi(this.LJFF);
        this.LIZJ = c64194PHi;
        this.LIZIZ = new C64192PHg(c64194PHi, this.LJFF);
    }
}
