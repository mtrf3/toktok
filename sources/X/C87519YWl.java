package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.localnotify.database.WorkManagerTaskDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.YWl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87519YWl extends C0BE {
    public final /* synthetic */ WorkManagerTaskDatabase_Impl LIZIZ;

    @Override // X.C0BE
    public final void LJ() {
    }

    @Override // X.C0BE
    public final void LIZJ() {
        List<C0BX> list = this.LIZIZ.LJI;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ListProtector.get(this.LIZIZ.LJI, i).getClass();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87519YWl(WorkManagerTaskDatabase_Impl workManagerTaskDatabase_Impl) {
        super(1);
        this.LIZIZ = workManagerTaskDatabase_Impl;
    }

    @Override // X.C0BE
    public final void LIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `workmanager_task` (`id` TEXT NOT NULL, `rule_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `scheduled_date_timestamp` INTEGER NOT NULL, `interval_index` INTEGER NOT NULL, `time_offset` INTEGER NOT NULL, `scheduled_timestamp` INTEGER NOT NULL, `actual_timestamp` INTEGER NOT NULL, `is_executed` INTEGER NOT NULL DEFAULT false, `is_published` INTEGER NOT NULL DEFAULT false, `extra` TEXT NOT NULL, PRIMARY KEY(`id`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6dd4eddad51a28e754515de777b23425')");
    }

    @Override // X.C0BE
    public final void LIZIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `workmanager_task`");
        List<C0BX> list = this.LIZIZ.LJI;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ListProtector.get(this.LIZIZ.LJI, i).getClass();
            }
        }
    }

    @Override // X.C0BE
    public final void LIZLLL(C38451f7 c38451f7) {
        this.LIZIZ.LIZ = c38451f7;
        this.LIZIZ.LJIIL(c38451f7);
        List<C0BX> list = this.LIZIZ.LJI;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C0BX) ListProtector.get(this.LIZIZ.LJI, i)).LIZ(c38451f7);
            }
        }
    }

    @Override // X.C0BE
    public final void LJFF(C38451f7 c38451f7) {
        C25080ye.LIZ(c38451f7);
    }

    @Override // X.C0BE
    public final C0BF LJI(C38451f7 c38451f7) {
        HashMap hashMap = new HashMap(11);
        hashMap.put("id", new C25090yf(1, 1, "id", "TEXT", null, true));
        hashMap.put("rule_id", new C25090yf(0, 1, "rule_id", "INTEGER", null, true));
        hashMap.put("type", new C25090yf(0, 1, "type", "INTEGER", null, true));
        hashMap.put("scheduled_date_timestamp", new C25090yf(0, 1, "scheduled_date_timestamp", "INTEGER", null, true));
        hashMap.put("interval_index", new C25090yf(0, 1, "interval_index", "INTEGER", null, true));
        hashMap.put("time_offset", new C25090yf(0, 1, "time_offset", "INTEGER", null, true));
        hashMap.put("scheduled_timestamp", new C25090yf(0, 1, "scheduled_timestamp", "INTEGER", null, true));
        hashMap.put("actual_timestamp", new C25090yf(0, 1, "actual_timestamp", "INTEGER", null, true));
        hashMap.put("is_executed", new C25090yf(0, 1, "is_executed", "INTEGER", "false", true));
        hashMap.put("is_published", new C25090yf(0, 1, "is_published", "INTEGER", "false", true));
        C25130yj c25130yj = new C25130yj("workmanager_task", hashMap, UC7.LIZIZ(hashMap, "extra", new C25090yf(0, 1, "extra", "TEXT", null, true), 0), new HashSet(0));
        C25130yj LIZ = C25130yj.LIZ(c38451f7, "workmanager_task");
        if (!c25130yj.equals(LIZ)) {
            return new C0BF(false, C169696lJ.LIZJ("workmanager_task(com.ss.android.ugc.localnotify.database.WorkManagerTaskRecord).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
        }
        return new C0BF(true, null);
    }
}
