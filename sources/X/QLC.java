package X;

import android.content.Context;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QLC {
    public final Context LIZ;
    public final QLM LIZIZ = new QLM(this);
    public final QLX LIZJ = new QLX();

    public QLC(Context context) {
        this.LIZ = context;
    }

    public final boolean LIZIZ(String str) {
        QLM qlm = this.LIZIZ;
        synchronized (qlm) {
            if (!C38354F3m.LJ(str) && ((HashMap) qlm.LIZIZ).containsKey(str)) {
                QLU qlu = (QLU) ((HashMap) qlm.LIZIZ).get(str);
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - qlu.LIZLLL;
                long[] jArr = qlm.LIZ[qlu.LIZ];
                if (j >= jArr[0]) {
                    qlu.LIZIZ = 1;
                    qlu.LIZLLL = currentTimeMillis;
                } else {
                    int i = qlu.LIZIZ;
                    if (i < jArr[2]) {
                        qlu.LIZIZ = i + 1;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public final void LIZJ(JSONObject jSONObject) {
        int i;
        QLX qlx = this.LIZJ;
        if (qlx != null) {
            int optInt = jSONObject.optInt("backoff_ratio", 0);
            qlx.LIZ = optInt;
            if (optInt < 0 || optInt > 10000) {
                qlx.LIZ = 0;
            }
            if (qlx.LIZ > 0) {
                i = 1;
            } else {
                i = 6;
            }
            int optInt2 = jSONObject.optInt("max_request_frequency", i);
            qlx.LIZIZ = optInt2;
            if (optInt2 < 1 || optInt2 > 6) {
                qlx.LIZIZ = i;
            }
            int i2 = qlx.LIZ;
            if (i2 > 0) {
                if (qlx.LIZJ == 0) {
                    qlx.LIZJ = System.currentTimeMillis();
                    qlx.LIZLLL = 1;
                    return;
                }
                return;
            }
            if (i2 != 0) {
                return;
            }
            qlx.LIZJ = 0L;
            qlx.LIZLLL = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        r5.LIZ = r9 - 1;
        r5.LIZIZ = 1;
        r5.LIZJ = 1;
        r5.LIZLLL = r2;
        r5.LJ = r2;
        r10 = 0;
        r8 = X.F9J.LIZIZ(r4.LIZJ.LIZ, 0, "applog_stats").edit();
        r9 = r17.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (r10 >= r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r12 = r17[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (X.C38354F3m.LJ(r12) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r12.equals(r6) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (((java.util.HashMap) r4.LIZIZ).containsKey(r12) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        r11 = (X.QLU) ((java.util.HashMap) r4.LIZIZ).get(r12);
        r11.getClass();
        r11.LIZ = r5.LIZ;
        r11.LIZIZ = r5.LIZIZ;
        r11.LIZJ = r5.LIZJ;
        r11.LIZLLL = r5.LIZLLL;
        r11.LJ = r5.LJ;
        r1 = X.X1D.LIZ();
        r1.append(r12);
        r1.append("_downgrade_time");
        r8.putLong(X.X1D.LIZIZ(r1), r2);
        r1 = X.X1D.LIZ();
        r1.append(r12);
        r1.append("_downgrade_index");
        r8.putInt(X.X1D.LIZIZ(r1), r11.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append(r6);
        r1.append("_downgrade_time");
        r8.putLong(X.X1D.LIZIZ(r1), r2);
        r1 = X.X1D.LIZ();
        r1.append(r6);
        r1.append("_downgrade_index");
        r8.putInt(X.X1D.LIZIZ(r1), r5.LIZ);
        r8.commit();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r16, java.lang.String[] r17) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QLC.LIZ(int, java.lang.String[]):void");
    }
}
