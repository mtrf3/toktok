package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sync.v2.presistence.AppDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.YWu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87528YWu extends C0BE {
    public final /* synthetic */ AppDatabase_Impl LIZIZ;

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
    public C87528YWu(AppDatabase_Impl appDatabase_Impl) {
        super(2);
        this.LIZIZ = appDatabase_Impl;
    }

    @Override // X.C0BE
    public final void LIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `t_business` (`id` INTEGER NOT NULL, `consume_type` INTEGER, `bucket` INTEGER, PRIMARY KEY(`id`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `t_report_synclog` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sync_id` TEXT, `business` INTEGER NOT NULL, `did` TEXT, `uid` TEXT, `bucket` INTEGER, `cursor` INTEGER NOT NULL, `data` BLOB, `md5` TEXT)");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `t_sync_cursor` (`sync_id` TEXT NOT NULL, `did` TEXT, `uid` TEXT, `topic_type` INTEGER, `bucket` INTEGER, `recv_cursor` INTEGER NOT NULL, `report_cursor` INTEGER NOT NULL, PRIMARY KEY(`sync_id`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `t_synclog` (`sync_id` TEXT NOT NULL, `did` TEXT, `uid` TEXT, `sync_cursor` INTEGER NOT NULL, `data` BLOB, `md5` TEXT, `business` INTEGER NOT NULL, `consume_type` INTEGER, `data_type` INTEGER, `publish_ts` INTEGER NOT NULL, `receive_ts` INTEGER NOT NULL, `bucket` INTEGER, `req_id` TEXT, PRIMARY KEY(`sync_id`, `sync_cursor`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `t_snapshot` (`sync_id` TEXT NOT NULL, `business` INTEGER NOT NULL, `uid` TEXT, `did` TEXT, `cursor` INTEGER NOT NULL, `data` BLOB, `notified` INTEGER NOT NULL, `bucket` INTEGER, `data_type` INTEGER, `publish_ts` INTEGER NOT NULL, `receive_ts` INTEGER NOT NULL, `consume_type` INTEGER, `patch_cnt` INTEGER NOT NULL, PRIMARY KEY(`sync_id`, `business`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"176b0459a5a82eb6a61d248ab647643b\")");
    }

    @Override // X.C0BE
    public final void LIZIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `t_business`");
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `t_report_synclog`");
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `t_sync_cursor`");
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `t_synclog`");
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `t_snapshot`");
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
    public final void LJII(C38451f7 c38451f7) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("id", new C25090yf("id", "INTEGER", true, 1));
        hashMap.put("consume_type", new C25090yf("consume_type", "INTEGER", false, 0));
        C25130yj c25130yj = new C25130yj("t_business", hashMap, UC7.LIZIZ(hashMap, "bucket", new C25090yf("bucket", "INTEGER", false, 0), 0), new HashSet(0));
        C25130yj LIZ = C25130yj.LIZ(c38451f7, "t_business");
        if (c25130yj.equals(LIZ)) {
            HashMap hashMap2 = new HashMap(9);
            hashMap2.put("id", new C25090yf("id", "INTEGER", true, 1));
            hashMap2.put("sync_id", new C25090yf("sync_id", "TEXT", false, 0));
            hashMap2.put("business", new C25090yf("business", "INTEGER", true, 0));
            hashMap2.put("did", new C25090yf("did", "TEXT", false, 0));
            hashMap2.put("uid", new C25090yf("uid", "TEXT", false, 0));
            hashMap2.put("bucket", new C25090yf("bucket", "INTEGER", false, 0));
            hashMap2.put("cursor", new C25090yf("cursor", "INTEGER", true, 0));
            hashMap2.put("data", new C25090yf("data", "BLOB", false, 0));
            C25130yj c25130yj2 = new C25130yj("t_report_synclog", hashMap2, UC7.LIZIZ(hashMap2, "md5", new C25090yf("md5", "TEXT", false, 0), 0), new HashSet(0));
            C25130yj LIZ2 = C25130yj.LIZ(c38451f7, "t_report_synclog");
            if (c25130yj2.equals(LIZ2)) {
                HashMap hashMap3 = new HashMap(7);
                hashMap3.put("sync_id", new C25090yf("sync_id", "TEXT", true, 1));
                hashMap3.put("did", new C25090yf("did", "TEXT", false, 0));
                hashMap3.put("uid", new C25090yf("uid", "TEXT", false, 0));
                hashMap3.put("topic_type", new C25090yf("topic_type", "INTEGER", false, 0));
                hashMap3.put("bucket", new C25090yf("bucket", "INTEGER", false, 0));
                hashMap3.put("recv_cursor", new C25090yf("recv_cursor", "INTEGER", true, 0));
                C25130yj c25130yj3 = new C25130yj("t_sync_cursor", hashMap3, UC7.LIZIZ(hashMap3, "report_cursor", new C25090yf("report_cursor", "INTEGER", true, 0), 0), new HashSet(0));
                C25130yj LIZ3 = C25130yj.LIZ(c38451f7, "t_sync_cursor");
                if (c25130yj3.equals(LIZ3)) {
                    HashMap hashMap4 = new HashMap(13);
                    hashMap4.put("sync_id", new C25090yf("sync_id", "TEXT", true, 1));
                    hashMap4.put("did", new C25090yf("did", "TEXT", false, 0));
                    hashMap4.put("uid", new C25090yf("uid", "TEXT", false, 0));
                    hashMap4.put("sync_cursor", new C25090yf("sync_cursor", "INTEGER", true, 2));
                    hashMap4.put("data", new C25090yf("data", "BLOB", false, 0));
                    hashMap4.put("md5", new C25090yf("md5", "TEXT", false, 0));
                    hashMap4.put("business", new C25090yf("business", "INTEGER", true, 0));
                    hashMap4.put("consume_type", new C25090yf("consume_type", "INTEGER", false, 0));
                    hashMap4.put("data_type", new C25090yf("data_type", "INTEGER", false, 0));
                    hashMap4.put("publish_ts", new C25090yf("publish_ts", "INTEGER", true, 0));
                    hashMap4.put("receive_ts", new C25090yf("receive_ts", "INTEGER", true, 0));
                    hashMap4.put("bucket", new C25090yf("bucket", "INTEGER", false, 0));
                    C25130yj c25130yj4 = new C25130yj("t_synclog", hashMap4, UC7.LIZIZ(hashMap4, "req_id", new C25090yf("req_id", "TEXT", false, 0), 0), new HashSet(0));
                    C25130yj LIZ4 = C25130yj.LIZ(c38451f7, "t_synclog");
                    if (c25130yj4.equals(LIZ4)) {
                        HashMap hashMap5 = new HashMap(13);
                        hashMap5.put("sync_id", new C25090yf("sync_id", "TEXT", true, 1));
                        hashMap5.put("business", new C25090yf("business", "INTEGER", true, 2));
                        hashMap5.put("uid", new C25090yf("uid", "TEXT", false, 0));
                        hashMap5.put("did", new C25090yf("did", "TEXT", false, 0));
                        hashMap5.put("cursor", new C25090yf("cursor", "INTEGER", true, 0));
                        hashMap5.put("data", new C25090yf("data", "BLOB", false, 0));
                        hashMap5.put("notified", new C25090yf("notified", "INTEGER", true, 0));
                        hashMap5.put("bucket", new C25090yf("bucket", "INTEGER", false, 0));
                        hashMap5.put("data_type", new C25090yf("data_type", "INTEGER", false, 0));
                        hashMap5.put("publish_ts", new C25090yf("publish_ts", "INTEGER", true, 0));
                        hashMap5.put("receive_ts", new C25090yf("receive_ts", "INTEGER", true, 0));
                        hashMap5.put("consume_type", new C25090yf("consume_type", "INTEGER", false, 0));
                        C25130yj c25130yj5 = new C25130yj("t_snapshot", hashMap5, UC7.LIZIZ(hashMap5, "patch_cnt", new C25090yf("patch_cnt", "INTEGER", true, 0), 0), new HashSet(0));
                        C25130yj LIZ5 = C25130yj.LIZ(c38451f7, "t_snapshot");
                        if (c25130yj5.equals(LIZ5)) {
                            return;
                        } else {
                            throw new IllegalStateException(C169696lJ.LIZJ("Migration didn't properly handle t_snapshot(com.bytedance.sync.v2.presistence.table.Snapshot).\n Expected:\n", c25130yj5, "\n Found:\n", LIZ5));
                        }
                    }
                    throw new IllegalStateException(C169696lJ.LIZJ("Migration didn't properly handle t_synclog(com.bytedance.sync.v2.presistence.table.SyncLog).\n Expected:\n", c25130yj4, "\n Found:\n", LIZ4));
                }
                throw new IllegalStateException(C169696lJ.LIZJ("Migration didn't properly handle t_sync_cursor(com.bytedance.sync.v2.presistence.table.SyncCursor).\n Expected:\n", c25130yj3, "\n Found:\n", LIZ3));
            }
            throw new IllegalStateException(C169696lJ.LIZJ("Migration didn't properly handle t_report_synclog(com.bytedance.sync.v2.presistence.table.UploadItem).\n Expected:\n", c25130yj2, "\n Found:\n", LIZ2));
        }
        throw new IllegalStateException(C169696lJ.LIZJ("Migration didn't properly handle t_business(com.bytedance.sync.v2.presistence.table.Business).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
    }
}
