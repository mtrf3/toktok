package X;

import Y.IDd0S16S0000000;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Y1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Y1 implements InterfaceC19390pT {
    public final AbstractC03300Ba LIZ;
    public final C43551nL LIZIZ;
    public final IDd0S16S0000000 LIZJ;
    public final IDd0S16S0000000 LIZLLL;
    public final IDd0S16S0000000 LJ;
    public final IDd0S16S0000000 LJFF;
    public final IDd0S16S0000000 LJI;
    public final IDd0S16S0000000 LJII;
    public final IDd0S16S0000000 LJIIIIZZ;

    public final List LIZIZ() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        LIZJ.LJIIIZ(1, 200);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
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
                return arrayList;
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

    public final List<C19380pS> LIZLLL() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
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
                return arrayList;
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

    public final List<C19380pS> LJ() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
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
                return arrayList;
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

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1nL] */
    public C1Y1(final AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        this.LIZIZ = new C1CG<C19380pS>(abstractC03300Ba) { // from class: X.1nL
            @Override // X.C0BI
            public final String LIZIZ() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX WARN: Can't wrap try/catch for region: R(7:47|(2:48|49)|(5:51|52|(2:55|53)|56|57)|59|60|61|(2:63|64)) */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x016f, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
            
                X.C16880lQ.LLLLIIL(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x01cf, code lost:
            
                if (r2 == null) goto L104;
             */
            /* JADX WARN: Removed duplicated region for block: B:63:0x017a  */
            @Override // X.C1CG
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZLLL(X.InterfaceC37591dj r18, X.C19380pS r19) {
                /*
                    Method dump skipped, instructions count: 551
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C43551nL.LIZLLL(X.1dj, java.lang.Object):void");
            }
        };
        this.LIZJ = new IDd0S16S0000000(abstractC03300Ba, 4);
        this.LIZLLL = new IDd0S16S0000000(abstractC03300Ba, 5);
        this.LJ = new IDd0S16S0000000(abstractC03300Ba, 6);
        this.LJFF = new IDd0S16S0000000(abstractC03300Ba, 7);
        this.LJI = new IDd0S16S0000000(abstractC03300Ba, 8);
        this.LJII = new IDd0S16S0000000(abstractC03300Ba, 9);
        this.LJIIIIZZ = new IDd0S16S0000000(abstractC03300Ba, 10);
        new IDd0S16S0000000(abstractC03300Ba, 11);
    }

    public final void LIZ(String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZJ.LIZ();
        if (str == null) {
            LIZ.LLLLLLJ(1);
        } else {
            LIZ.LJJII(1, str);
        }
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZJ.LIZJ(LIZ);
        }
    }

    public final List<C19380pS> LIZJ(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        LIZJ.LJIIIZ(1, i);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
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
                return arrayList;
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

    public final EnumC08510Vb LJFF(String str) {
        EnumC08510Vb enumC08510Vb;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            if (LIZIZ.moveToFirst()) {
                enumC08510Vb = C19430pX.LJ(LIZIZ.getInt(0));
            } else {
                enumC08510Vb = null;
            }
            return enumC08510Vb;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    public final List<String> LJI(String str) {
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                arrayList.add(LIZIZ.getString(0));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    public final List<String> LJII(String str) {
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                arrayList.add(LIZIZ.getString(0));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    public final C19380pS LJIIIIZZ(String str) {
        C19380pS c19380pS;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
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
                if (LIZIZ.moveToFirst()) {
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
                    c19380pS = new C19380pS(string, string2);
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
                } else {
                    c19380pS = null;
                }
                LIZIZ.close();
                LIZJ.LIZLLL();
                return c19380pS;
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

    public final List<C19360pQ> LJIIIZ(String str) {
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "id");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "state");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                C19360pQ c19360pQ = new C19360pQ();
                c19360pQ.LIZ = LIZIZ.getString(LIZIZ2);
                c19360pQ.LIZIZ = C19430pX.LJ(LIZIZ.getInt(LIZIZ3));
                arrayList.add(c19360pQ);
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    public final int LJIIJ(String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJFF.LIZ();
        if (str == null) {
            LIZ.LLLLLLJ(1);
        } else {
            LIZ.LJJII(1, str);
        }
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
            this.LJFF.LIZJ(LIZ);
        }
    }

    public final int LJIIL(String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJI.LIZ();
        if (str == null) {
            LIZ.LLLLLLJ(1);
        } else {
            LIZ.LJJII(1, str);
        }
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
            this.LJI.LIZJ(LIZ);
        }
    }

    public final int LJIIJJI(long j, String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJII.LIZ();
        LIZ.LJIIIZ(1, j);
        if (str == null) {
            LIZ.LLLLLLJ(2);
        } else {
            LIZ.LJJII(2, str);
        }
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
            this.LJII.LIZJ(LIZ);
        }
    }

    public final void LJIILIIL(String str, C0CY c0cy) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZLLL.LIZ();
        byte[] LIZLLL = C0CY.LIZLLL(c0cy);
        if (LIZLLL == null) {
            LIZ.LLLLLLJ(1);
        } else {
            LIZ.LJJIIZ(1, LIZLLL);
        }
        if (str == null) {
            LIZ.LLLLLLJ(2);
        } else {
            LIZ.LJJII(2, str);
        }
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZLLL.LIZJ(LIZ);
        }
    }

    public final void LJIILJJIL(long j, String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJ.LIZ();
        LIZ.LJIIIZ(1, j);
        if (str == null) {
            LIZ.LLLLLLJ(2);
        } else {
            LIZ.LJJII(2, str);
        }
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LJ.LIZJ(LIZ);
        }
    }

    public final int LJIILL(EnumC08510Vb enumC08510Vb, String... strArr) {
        this.LIZ.LIZIZ();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=? WHERE id IN (");
        C217818gj.LIZ(strArr.length, sb);
        sb.append(")");
        InterfaceC37591dj LJ = this.LIZ.LJ(sb.toString());
        LJ.LJIIIZ(1, C19430pX.LJFF(enumC08510Vb));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                LJ.LLLLLLJ(i);
            } else {
                LJ.LJJII(i, str);
            }
            i++;
        }
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LJ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
        }
    }
}
