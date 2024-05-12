package X;

import android.os.Build;

/* renamed from: X.0CZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0CZ {
    public static final C29281Cy LIZ = new AbstractC23740wU() { // from class: X.1Cy
        @Override // X.AbstractC23740wU
        public final void LIZ(C38451f7 c38451f7) {
            c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c38451f7.LJJIJIIJI("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS alarmInfo");
            c38451f7.LJJIJIIJI("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    };
    public static final C29291Cz LIZIZ = new AbstractC23740wU() { // from class: X.1Cz
        @Override // X.AbstractC23740wU
        public final void LIZ(C38451f7 c38451f7) {
            if (Build.VERSION.SDK_INT >= 23) {
                c38451f7.LJJIJIIJI("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    };
    public static final C1D0 LIZJ = new AbstractC23740wU() { // from class: X.1D0
        @Override // X.AbstractC23740wU
        public final void LIZ(C38451f7 c38451f7) {
            c38451f7.LJJIJIIJI("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            c38451f7.LJJIJIIJI("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    };
    public static final C1D1 LIZLLL = new AbstractC23740wU() { // from class: X.1D1
        @Override // X.AbstractC23740wU
        public final void LIZ(C38451f7 c38451f7) {
            c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    };
    public static final C1D2 LJ = new AbstractC23740wU() { // from class: X.1D2
        @Override // X.AbstractC23740wU
        public final void LIZ(C38451f7 c38451f7) {
            c38451f7.LJJIJIIJI("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    };
    public static final C1D3 LJFF = new AbstractC23740wU() { // from class: X.1D3
        @Override // X.AbstractC23740wU
        public final void LIZ(C38451f7 c38451f7) {
            c38451f7.LJJIJIIJI("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    };
    public static final C1D4 LJI = new AbstractC23740wU() { // from class: X.1D4
        @Override // X.AbstractC23740wU
        public final void LIZ(C38451f7 c38451f7) {
            c38451f7.LJJIJIIJI("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    };
}
