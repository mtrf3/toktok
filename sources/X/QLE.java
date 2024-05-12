package X;

import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.common.applog.AppLog;

/* loaded from: classes12.dex */
public final class QLE {
    public Context LIZ;

    public final void LIZ() {
        try {
            SharedPreferences.Editor edit = F9J.LIZIZ(this.LIZ, 0, "applog_stats").edit();
            edit.putString("key_task_session", "");
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public QLE(Context context) {
        this.LIZ = C16880lQ.LLLLL(context);
        QLB.LIZJ(context);
        HandlerThreadC36423ERf.LIZJ().LIZ(new ARunnableS47S0100000_11(this, 138));
    }

    public final void LIZIZ(QLG qlg) {
        QLB LIZJ = QLB.LIZJ(this.LIZ);
        LIZJ.getClass();
        if (qlg == null) {
            return;
        }
        QLG qlg2 = new QLG();
        qlg2.LIZ = qlg.LIZ;
        qlg2.LIZIZ = qlg.LIZIZ;
        qlg2.LIZJ = qlg.LIZJ;
        qlg2.LIZLLL = qlg.LIZLLL;
        qlg2.LJ = qlg.LJ;
        qlg2.LJFF = qlg.LJFF;
        qlg2.LJI = qlg.LJI;
        qlg2.LJII = qlg.LJII;
        qlg2.LJIIIIZZ = qlg.LJIIIIZZ;
        QLY qly = new QLY();
        qly.LIZ = qlg2;
        AppLog appLog = AppLog.getInstance((Context) LIZJ.LIZ);
        if (appLog == null) {
            return;
        }
        appLog.enqueue(qly);
    }

    public final void LIZJ(QLG qlg) {
        if (qlg == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("saveTaskSessionToSp : ");
        LIZ.append(qlg);
        X1D.LIZIZ(LIZ);
        String LIZ2 = qlg.LIZ();
        if (LIZ2 == null) {
            LIZ2 = "";
        }
        try {
            SharedPreferences.Editor edit = F9J.LIZIZ(this.LIZ, 0, "applog_stats").edit();
            edit.putString("key_task_session", LIZ2);
            edit.apply();
        } catch (Throwable unused) {
        }
    }
}
