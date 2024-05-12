package androidx.work.impl;

import X.C0BE;
import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C1Y1;
import X.C1Y2;
import X.C262411g;
import X.C34711Xv;
import X.C34721Xw;
import X.C34731Xx;
import X.C34741Xy;
import X.C34751Xz;
import X.InterfaceC19270pH;
import X.InterfaceC19290pJ;
import X.InterfaceC19310pL;
import X.InterfaceC19330pN;
import X.InterfaceC19350pP;
import X.InterfaceC19390pT;
import X.InterfaceC19410pV;
import X.InterfaceC262711j;
import androidx.work.impl.WorkDatabase_Impl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile C1Y1 LJIILJJIL;
    public volatile C34711Xv LJIILL;
    public volatile C1Y2 LJIILLIIL;
    public volatile C34731Xx LJIIZILJ;
    public volatile C34741Xy LJIJ;
    public volatile C34751Xz LJIJI;
    public volatile C34721Xw LJIJJ;

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC19270pH LJIJ() {
        C34711Xv c34711Xv;
        if (this.LJIILL != null) {
            return this.LJIILL;
        }
        synchronized (this) {
            if (this.LJIILL == null) {
                this.LJIILL = new C34711Xv(this);
            }
            c34711Xv = this.LJIILL;
        }
        return c34711Xv;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC19290pJ LJIJI() {
        C34721Xw c34721Xw;
        if (this.LJIJJ != null) {
            return this.LJIJJ;
        }
        synchronized (this) {
            if (this.LJIJJ == null) {
                this.LJIJJ = new C34721Xw(this);
            }
            c34721Xw = this.LJIJJ;
        }
        return c34721Xw;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC19310pL LJIJJ() {
        C34731Xx c34731Xx;
        if (this.LJIIZILJ != null) {
            return this.LJIIZILJ;
        }
        synchronized (this) {
            if (this.LJIIZILJ == null) {
                this.LJIIZILJ = new C34731Xx(this);
            }
            c34731Xx = this.LJIIZILJ;
        }
        return c34731Xx;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC19330pN LJIJJLI() {
        C34741Xy c34741Xy;
        if (this.LJIJ != null) {
            return this.LJIJ;
        }
        synchronized (this) {
            if (this.LJIJ == null) {
                this.LJIJ = new C34741Xy(this);
            }
            c34741Xy = this.LJIJ;
        }
        return c34741Xy;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC19350pP LJIL() {
        C34751Xz c34751Xz;
        if (this.LJIJI != null) {
            return this.LJIJI;
        }
        synchronized (this) {
            if (this.LJIJI == null) {
                this.LJIJI = new C34751Xz(this);
            }
            c34751Xz = this.LJIJI;
        }
        return c34751Xz;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC19390pT LJJ() {
        C1Y1 c1y1;
        if (this.LJIILJJIL != null) {
            return this.LJIILJJIL;
        }
        synchronized (this) {
            if (this.LJIILJJIL == null) {
                this.LJIILJJIL = new C1Y1(this);
            }
            c1y1 = this.LJIILJJIL;
        }
        return c1y1;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC19410pV LJJI() {
        C1Y2 c1y2;
        if (this.LJIILLIIL != null) {
            return this.LJIILLIIL;
        }
        synchronized (this) {
            if (this.LJIILLIIL == null) {
                this.LJIILLIIL = new C1Y2(this);
            }
            c1y2 = this.LJIILLIIL;
        }
        return c1y2;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new C0BE() { // from class: X.1Cx
            @Override // X.C0BE
            public final void LJ() {
            }

            @Override // X.C0BE
            public final void LIZJ() {
                List<C0BX> list = WorkDatabase_Impl.this.LJI;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ListProtector.get(WorkDatabase_Impl.this.LJI, i).getClass();
                    }
                }
            }

            {
                super(12);
            }

            @Override // X.C0BE
            public final void LIZ(C38451f7 c38451f7) {
                c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c38451f7.LJJIJIIJI("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                c38451f7.LJJIJIIJI("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
                c38451f7.LJJIJIIJI("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                c38451f7.LJJIJIIJI("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c38451f7.LJJIJIIJI("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c38451f7.LJJIJIIJI("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
            }

            @Override // X.C0BE
            public final void LIZIZ(C38451f7 c38451f7) {
                c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `Dependency`");
                c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `WorkSpec`");
                c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `WorkTag`");
                c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `SystemIdInfo`");
                c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `WorkName`");
                c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `WorkProgress`");
                c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `Preference`");
                List<C0BX> list = WorkDatabase_Impl.this.LJI;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ListProtector.get(WorkDatabase_Impl.this.LJI, i).getClass();
                    }
                }
            }

            @Override // X.C0BE
            public final void LIZLLL(C38451f7 c38451f7) {
                WorkDatabase_Impl.this.LIZ = c38451f7;
                c38451f7.LJJIJIIJI("PRAGMA foreign_keys = ON");
                WorkDatabase_Impl.this.LJIIL(c38451f7);
                List<C0BX> list = WorkDatabase_Impl.this.LJI;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((C0BX) ListProtector.get(WorkDatabase_Impl.this.LJI, i)).LIZ(c38451f7);
                    }
                }
            }

            @Override // X.C0BE
            public final void LJFF(C38451f7 c38451f7) {
                C25080ye.LIZ(c38451f7);
            }

            @Override // X.C0BE
            public final C0BF LJI(C38451f7 c38451f7) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("work_spec_id", new C25090yf(1, 1, "work_spec_id", "TEXT", null, true));
                HashSet LIZIZ = UC7.LIZIZ(hashMap, "prerequisite_id", new C25090yf(2, 1, "prerequisite_id", "TEXT", null, true), 2);
                LIZIZ.add(new C25100yg("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                LIZIZ.add(new C25100yg("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new C25120yi(false, "index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), null));
                hashSet.add(new C25120yi(false, "index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), null));
                C25130yj c25130yj = new C25130yj("Dependency", hashMap, LIZIZ, hashSet);
                C25130yj LIZ = C25130yj.LIZ(c38451f7, "Dependency");
                if (!c25130yj.equals(LIZ)) {
                    return new C0BF(false, C169696lJ.LIZJ("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
                }
                HashMap hashMap2 = new HashMap(25);
                hashMap2.put("id", new C25090yf(1, 1, "id", "TEXT", null, true));
                hashMap2.put("state", new C25090yf(0, 1, "state", "INTEGER", null, true));
                hashMap2.put("worker_class_name", new C25090yf(0, 1, "worker_class_name", "TEXT", null, true));
                hashMap2.put("input_merger_class_name", new C25090yf(0, 1, "input_merger_class_name", "TEXT", null, false));
                hashMap2.put("input", new C25090yf(0, 1, "input", "BLOB", null, true));
                hashMap2.put("output", new C25090yf(0, 1, "output", "BLOB", null, true));
                hashMap2.put("initial_delay", new C25090yf(0, 1, "initial_delay", "INTEGER", null, true));
                hashMap2.put("interval_duration", new C25090yf(0, 1, "interval_duration", "INTEGER", null, true));
                hashMap2.put("flex_duration", new C25090yf(0, 1, "flex_duration", "INTEGER", null, true));
                hashMap2.put("run_attempt_count", new C25090yf(0, 1, "run_attempt_count", "INTEGER", null, true));
                hashMap2.put("backoff_policy", new C25090yf(0, 1, "backoff_policy", "INTEGER", null, true));
                hashMap2.put("backoff_delay_duration", new C25090yf(0, 1, "backoff_delay_duration", "INTEGER", null, true));
                hashMap2.put("period_start_time", new C25090yf(0, 1, "period_start_time", "INTEGER", null, true));
                hashMap2.put("minimum_retention_duration", new C25090yf(0, 1, "minimum_retention_duration", "INTEGER", null, true));
                hashMap2.put("schedule_requested_at", new C25090yf(0, 1, "schedule_requested_at", "INTEGER", null, true));
                hashMap2.put("run_in_foreground", new C25090yf(0, 1, "run_in_foreground", "INTEGER", null, true));
                hashMap2.put("out_of_quota_policy", new C25090yf(0, 1, "out_of_quota_policy", "INTEGER", null, true));
                hashMap2.put("required_network_type", new C25090yf(0, 1, "required_network_type", "INTEGER", null, false));
                hashMap2.put("requires_charging", new C25090yf(0, 1, "requires_charging", "INTEGER", null, true));
                hashMap2.put("requires_device_idle", new C25090yf(0, 1, "requires_device_idle", "INTEGER", null, true));
                hashMap2.put("requires_battery_not_low", new C25090yf(0, 1, "requires_battery_not_low", "INTEGER", null, true));
                hashMap2.put("requires_storage_not_low", new C25090yf(0, 1, "requires_storage_not_low", "INTEGER", null, true));
                hashMap2.put("trigger_content_update_delay", new C25090yf(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
                hashMap2.put("trigger_max_content_delay", new C25090yf(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
                HashSet LIZIZ2 = UC7.LIZIZ(hashMap2, "content_uri_triggers", new C25090yf(0, 1, "content_uri_triggers", "BLOB", null, false), 0);
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new C25120yi(false, "index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), null));
                hashSet2.add(new C25120yi(false, "index_WorkSpec_period_start_time", Arrays.asList("period_start_time"), null));
                C25130yj c25130yj2 = new C25130yj("WorkSpec", hashMap2, LIZIZ2, hashSet2);
                C25130yj LIZ2 = C25130yj.LIZ(c38451f7, "WorkSpec");
                if (!c25130yj2.equals(LIZ2)) {
                    return new C0BF(false, C169696lJ.LIZJ("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", c25130yj2, "\n Found:\n", LIZ2));
                }
                HashMap hashMap3 = new HashMap(2);
                hashMap3.put("tag", new C25090yf(1, 1, "tag", "TEXT", null, true));
                HashSet LIZIZ3 = UC7.LIZIZ(hashMap3, "work_spec_id", new C25090yf(2, 1, "work_spec_id", "TEXT", null, true), 1);
                LIZIZ3.add(new C25100yg("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet3 = new HashSet(1);
                hashSet3.add(new C25120yi(false, "index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), null));
                C25130yj c25130yj3 = new C25130yj("WorkTag", hashMap3, LIZIZ3, hashSet3);
                C25130yj LIZ3 = C25130yj.LIZ(c38451f7, "WorkTag");
                if (!c25130yj3.equals(LIZ3)) {
                    return new C0BF(false, C169696lJ.LIZJ("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", c25130yj3, "\n Found:\n", LIZ3));
                }
                HashMap hashMap4 = new HashMap(2);
                hashMap4.put("work_spec_id", new C25090yf(1, 1, "work_spec_id", "TEXT", null, true));
                HashSet LIZIZ4 = UC7.LIZIZ(hashMap4, "system_id", new C25090yf(0, 1, "system_id", "INTEGER", null, true), 1);
                LIZIZ4.add(new C25100yg("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                C25130yj c25130yj4 = new C25130yj("SystemIdInfo", hashMap4, LIZIZ4, new HashSet(0));
                C25130yj LIZ4 = C25130yj.LIZ(c38451f7, "SystemIdInfo");
                if (!c25130yj4.equals(LIZ4)) {
                    return new C0BF(false, C169696lJ.LIZJ("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", c25130yj4, "\n Found:\n", LIZ4));
                }
                HashMap hashMap5 = new HashMap(2);
                hashMap5.put("name", new C25090yf(1, 1, "name", "TEXT", null, true));
                HashSet LIZIZ5 = UC7.LIZIZ(hashMap5, "work_spec_id", new C25090yf(2, 1, "work_spec_id", "TEXT", null, true), 1);
                LIZIZ5.add(new C25100yg("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new C25120yi(false, "index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), null));
                C25130yj c25130yj5 = new C25130yj("WorkName", hashMap5, LIZIZ5, hashSet4);
                C25130yj LIZ5 = C25130yj.LIZ(c38451f7, "WorkName");
                if (!c25130yj5.equals(LIZ5)) {
                    return new C0BF(false, C169696lJ.LIZJ("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", c25130yj5, "\n Found:\n", LIZ5));
                }
                HashMap hashMap6 = new HashMap(2);
                hashMap6.put("work_spec_id", new C25090yf(1, 1, "work_spec_id", "TEXT", null, true));
                HashSet LIZIZ6 = UC7.LIZIZ(hashMap6, "progress", new C25090yf(0, 1, "progress", "BLOB", null, true), 1);
                LIZIZ6.add(new C25100yg("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                C25130yj c25130yj6 = new C25130yj("WorkProgress", hashMap6, LIZIZ6, new HashSet(0));
                C25130yj LIZ6 = C25130yj.LIZ(c38451f7, "WorkProgress");
                if (!c25130yj6.equals(LIZ6)) {
                    return new C0BF(false, C169696lJ.LIZJ("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", c25130yj6, "\n Found:\n", LIZ6));
                }
                HashMap hashMap7 = new HashMap(2);
                hashMap7.put("key", new C25090yf(1, 1, "key", "TEXT", null, true));
                C25130yj c25130yj7 = new C25130yj("Preference", hashMap7, UC7.LIZIZ(hashMap7, "long_value", new C25090yf(0, 1, "long_value", "INTEGER", null, false), 0), new HashSet(0));
                C25130yj LIZ7 = C25130yj.LIZ(c38451f7, "Preference");
                if (!c25130yj7.equals(LIZ7)) {
                    return new C0BF(false, C169696lJ.LIZJ("Preference(androidx.work.impl.model.Preference).\n Expected:\n", c25130yj7, "\n Found:\n", LIZ7));
                }
                return new C0BF(true, null);
            }
        }, "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
