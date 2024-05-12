package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.friendstab.cache.FriendsFeeRespDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.YWm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87520YWm extends C0BE {
    public final /* synthetic */ FriendsFeeRespDatabase_Impl LIZIZ;

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
    public C87520YWm(FriendsFeeRespDatabase_Impl friendsFeeRespDatabase_Impl) {
        super(1);
        this.LIZIZ = friendsFeeRespDatabase_Impl;
    }

    @Override // X.C0BE
    public final void LIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `friends_feed_resp_cache` (`uid` TEXT NOT NULL, `friends_feed_resp` TEXT, `created_time_millis` INTEGER NOT NULL, PRIMARY KEY(`uid`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5f668dd49414fc71f4ae6f08222e15bd')");
    }

    @Override // X.C0BE
    public final void LIZIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `friends_feed_resp_cache`");
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
        HashMap hashMap = new HashMap(3);
        hashMap.put("uid", new C25090yf(1, 1, "uid", "TEXT", null, true));
        hashMap.put("friends_feed_resp", new C25090yf(0, 1, "friends_feed_resp", "TEXT", null, false));
        C25130yj c25130yj = new C25130yj("friends_feed_resp_cache", hashMap, UC7.LIZIZ(hashMap, "created_time_millis", new C25090yf(0, 1, "created_time_millis", "INTEGER", null, true), 0), new HashSet(0));
        C25130yj LIZ = C25130yj.LIZ(c38451f7, "friends_feed_resp_cache");
        if (!c25130yj.equals(LIZ)) {
            return new C0BF(false, C169696lJ.LIZJ("friends_feed_resp_cache(com.ss.android.ugc.aweme.friendstab.cache.FriendsFeeRespEntity).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
        }
        return new C0BF(true, null);
    }
}
