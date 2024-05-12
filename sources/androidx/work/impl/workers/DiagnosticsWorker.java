package androidx.work.impl.workers;

import X.C0CS;
import X.C0CY;
import X.C0VP;
import X.C0VW;
import X.C16880lQ;
import X.C19300pK;
import X.C19380pS;
import X.C19430pX;
import X.C1CD;
import X.C1OU;
import X.C1Y1;
import X.C1Y2;
import X.C25070yd;
import X.C25080ye;
import X.C29261Cw;
import X.C34731Xx;
import X.C34741Xy;
import X.InterfaceC19310pL;
import X.InterfaceC19330pN;
import X.InterfaceC19390pT;
import X.InterfaceC19410pV;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    static {
        C0VW.LIZIZ("DiagnosticsWrkr");
    }

    @Override // androidx.work.Worker
    public final C0CS LJII() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        WorkDatabase workDatabase = C1OU.LJ(this.LJLIL).LIZJ;
        InterfaceC19390pT LJJ = workDatabase.LJJ();
        InterfaceC19330pN LJIJJLI = workDatabase.LJIJJLI();
        InterfaceC19410pV LJJI = workDatabase.LJJI();
        InterfaceC19310pL LJIJJ = workDatabase.LJIJJ();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        C1Y1 c1y1 = (C1Y1) LJJ;
        c1y1.getClass();
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        LIZJ.LJIIIZ(1, currentTimeMillis);
        c1y1.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(c1y1.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "required_network_type");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "requires_charging");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "requires_device_idle");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "requires_battery_not_low");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "requires_storage_not_low");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "trigger_content_update_delay");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "trigger_max_content_delay");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "content_uri_triggers");
            int LIZIZ10 = C25070yd.LIZIZ(LIZIZ, "id");
            int LIZIZ11 = C25070yd.LIZIZ(LIZIZ, "state");
            int LIZIZ12 = C25070yd.LIZIZ(LIZIZ, "worker_class_name");
            int LIZIZ13 = C25070yd.LIZIZ(LIZIZ, "input_merger_class_name");
            int LIZIZ14 = C25070yd.LIZIZ(LIZIZ, "input");
            int LIZIZ15 = C25070yd.LIZIZ(LIZIZ, "output");
            try {
                int LIZIZ16 = C25070yd.LIZIZ(LIZIZ, "initial_delay");
                int LIZIZ17 = C25070yd.LIZIZ(LIZIZ, "interval_duration");
                int LIZIZ18 = C25070yd.LIZIZ(LIZIZ, "flex_duration");
                int LIZIZ19 = C25070yd.LIZIZ(LIZIZ, "run_attempt_count");
                int LIZIZ20 = C25070yd.LIZIZ(LIZIZ, "backoff_policy");
                int LIZIZ21 = C25070yd.LIZIZ(LIZIZ, "backoff_delay_duration");
                int LIZIZ22 = C25070yd.LIZIZ(LIZIZ, "period_start_time");
                int LIZIZ23 = C25070yd.LIZIZ(LIZIZ, "minimum_retention_duration");
                int LIZIZ24 = C25070yd.LIZIZ(LIZIZ, "schedule_requested_at");
                int LIZIZ25 = C25070yd.LIZIZ(LIZIZ, "run_in_foreground");
                int LIZIZ26 = C25070yd.LIZIZ(LIZIZ, "out_of_quota_policy");
                ArrayList arrayList = new ArrayList(LIZIZ.getCount());
                while (LIZIZ.moveToNext()) {
                    String string = LIZIZ.getString(LIZIZ10);
                    String string2 = LIZIZ.getString(LIZIZ12);
                    C0VP c0vp = new C0VP();
                    c0vp.LIZ = C19430pX.LIZJ(LIZIZ.getInt(LIZIZ2));
                    if (LIZIZ.getInt(LIZIZ3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c0vp.LIZIZ = z;
                    if (LIZIZ.getInt(LIZIZ4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c0vp.LIZJ = z2;
                    if (LIZIZ.getInt(LIZIZ5) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c0vp.LIZLLL = z3;
                    if (LIZIZ.getInt(LIZIZ6) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c0vp.LJ = z4;
                    c0vp.LJFF = LIZIZ.getLong(LIZIZ7);
                    c0vp.LJI = LIZIZ.getLong(LIZIZ8);
                    c0vp.LJII = C19430pX.LIZ(LIZIZ.getBlob(LIZIZ9));
                    C19380pS c19380pS = new C19380pS(string, string2);
                    c19380pS.LIZIZ = C19430pX.LJ(LIZIZ.getInt(LIZIZ11));
                    c19380pS.LIZLLL = LIZIZ.getString(LIZIZ13);
                    c19380pS.LJ = C0CY.LIZ(LIZIZ.getBlob(LIZIZ14));
                    c19380pS.LJFF = C0CY.LIZ(LIZIZ.getBlob(LIZIZ15));
                    c19380pS.LJI = LIZIZ.getLong(LIZIZ16);
                    c19380pS.LJII = LIZIZ.getLong(LIZIZ17);
                    c19380pS.LJIIIIZZ = LIZIZ.getLong(LIZIZ18);
                    c19380pS.LJIIJ = LIZIZ.getInt(LIZIZ19);
                    c19380pS.LJIIJJI = C19430pX.LIZIZ(LIZIZ.getInt(LIZIZ20));
                    c19380pS.LJIIL = LIZIZ.getLong(LIZIZ21);
                    c19380pS.LJIILIIL = LIZIZ.getLong(LIZIZ22);
                    c19380pS.LJIILJJIL = LIZIZ.getLong(LIZIZ23);
                    c19380pS.LJIILL = LIZIZ.getLong(LIZIZ24);
                    if (LIZIZ.getInt(LIZIZ25) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    c19380pS.LJIILLIIL = z5;
                    c19380pS.LJIIZILJ = C19430pX.LIZLLL(LIZIZ.getInt(LIZIZ26));
                    c19380pS.LJIIIZ = c0vp;
                    arrayList.add(c19380pS);
                }
                LIZIZ.close();
                LIZJ.LIZLLL();
                List<C19380pS> LIZLLL = c1y1.LIZLLL();
                List LIZIZ27 = c1y1.LIZIZ();
                if (!arrayList.isEmpty()) {
                    C0VW.LIZ().getClass();
                    C0VW LIZ = C0VW.LIZ();
                    LJIIIIZZ(LJIJJLI, LJJI, LJIJJ, arrayList);
                    LIZ.getClass();
                }
                if (!((ArrayList) LIZLLL).isEmpty()) {
                    C0VW.LIZ().getClass();
                    C0VW LIZ2 = C0VW.LIZ();
                    LJIIIIZZ(LJIJJLI, LJJI, LJIJJ, LIZLLL);
                    LIZ2.getClass();
                }
                if (!((ArrayList) LIZIZ27).isEmpty()) {
                    C0VW.LIZ().getClass();
                    C0VW LIZ3 = C0VW.LIZ();
                    LJIIIIZZ(LJIJJLI, LJJI, LJIJJ, LIZIZ27);
                    LIZ3.getClass();
                }
                return new C29261Cw();
            } catch (Throwable th) {
                th = th;
                LIZIZ.close();
                LIZJ.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static void LJIIIIZZ(InterfaceC19330pN interfaceC19330pN, InterfaceC19410pV interfaceC19410pV, InterfaceC19310pL interfaceC19310pL, List list) {
        String str;
        Integer num;
        if (Build.VERSION.SDK_INT >= 23) {
            str = "Job Id";
        } else {
            str = "Alarm Id";
        }
        C16880lQ.LLLZ("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{str});
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C19380pS c19380pS = (C19380pS) it.next();
            C19300pK LIZ = ((C34731Xx) interfaceC19310pL).LIZ(c19380pS.LIZ);
            if (LIZ != null) {
                num = Integer.valueOf(LIZ.LIZIZ);
            } else {
                num = null;
            }
            String str2 = c19380pS.LIZ;
            C34741Xy c34741Xy = (C34741Xy) interfaceC19330pN;
            c34741Xy.getClass();
            C1CD LIZJ = C1CD.LIZJ(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                LIZJ.LLLLLLJ(1);
            } else {
                LIZJ.LJJII(1, str2);
            }
            c34741Xy.LIZ.LIZIZ();
            Cursor LIZIZ = C25080ye.LIZIZ(c34741Xy.LIZ, LIZJ, false);
            try {
                ArrayList arrayList = new ArrayList(LIZIZ.getCount());
                while (LIZIZ.moveToNext()) {
                    arrayList.add(LIZIZ.getString(0));
                }
                LIZIZ.close();
                LIZJ.LIZLLL();
                C16880lQ.LLLZ("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{c19380pS.LIZ, c19380pS.LIZJ, num, c19380pS.LIZIZ.name(), TextUtils.join(",", arrayList), TextUtils.join(",", ((C1Y2) interfaceC19410pV).LIZ(c19380pS.LIZ))});
            } catch (Throwable th) {
                LIZIZ.close();
                LIZJ.LIZLLL();
                throw th;
            }
        }
    }
}
