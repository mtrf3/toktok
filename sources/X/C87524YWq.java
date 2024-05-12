package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.offlinemode.database.OfflineModeFeedPBDataBase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.YWq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87524YWq extends C0BE {
    public final /* synthetic */ OfflineModeFeedPBDataBase_Impl LIZIZ;

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
    public C87524YWq(OfflineModeFeedPBDataBase_Impl offlineModeFeedPBDataBase_Impl) {
        super(1);
        this.LIZIZ = offlineModeFeedPBDataBase_Impl;
    }

    @Override // X.C0BE
    public final void LIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `offline_mode_feed_pb` (`sec_uid` TEXT NOT NULL, `insert_time` INTEGER NOT NULL, `aweme_struct` BLOB NOT NULL, `aid` TEXT NOT NULL, `has_cached` INTEGER NOT NULL, `has_watched` INTEGER NOT NULL, `cached_time` INTEGER NOT NULL, `url_key` TEXT NOT NULL, PRIMARY KEY(`sec_uid`, `aid`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dcb159507d4c74ee870b9334529c1b8f')");
    }

    @Override // X.C0BE
    public final void LIZIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `offline_mode_feed_pb`");
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
        HashMap hashMap = new HashMap(8);
        hashMap.put("sec_uid", new C25090yf(1, 1, "sec_uid", "TEXT", null, true));
        hashMap.put("insert_time", new C25090yf(0, 1, "insert_time", "INTEGER", null, true));
        hashMap.put("aweme_struct", new C25090yf(0, 1, "aweme_struct", "BLOB", null, true));
        hashMap.put("aid", new C25090yf(2, 1, "aid", "TEXT", null, true));
        hashMap.put("has_cached", new C25090yf(0, 1, "has_cached", "INTEGER", null, true));
        hashMap.put("has_watched", new C25090yf(0, 1, "has_watched", "INTEGER", null, true));
        hashMap.put("cached_time", new C25090yf(0, 1, "cached_time", "INTEGER", null, true));
        C25130yj c25130yj = new C25130yj("offline_mode_feed_pb", hashMap, UC7.LIZIZ(hashMap, "url_key", new C25090yf(0, 1, "url_key", "TEXT", null, true), 0), new HashSet(0));
        C25130yj LIZ = C25130yj.LIZ(c38451f7, "offline_mode_feed_pb");
        if (!c25130yj.equals(LIZ)) {
            return new C0BF(false, C169696lJ.LIZJ("offline_mode_feed_pb(com.ss.android.ugc.aweme.offlinemode.database.OfflineModeFeedPBRecordEntity).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
        }
        return new C0BF(true, null);
    }
}
