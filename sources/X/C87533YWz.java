package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.nows.cache.NowSelfAwemeDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.YWz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87533YWz extends C0BE {
    public final /* synthetic */ NowSelfAwemeDatabase_Impl LIZIZ;

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
    public C87533YWz(NowSelfAwemeDatabase_Impl nowSelfAwemeDatabase_Impl) {
        super(1);
        this.LIZIZ = nowSelfAwemeDatabase_Impl;
    }

    @Override // X.C0BE
    public final void LIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `now_self_aweme_cache` (`aid` TEXT NOT NULL, `uid` TEXT NOT NULL, `aweme_type` INTEGER NOT NULL, `author_name` TEXT NOT NULL, `like_count` INTEGER NOT NULL, `comment_count` INTEGER NOT NULL, `front_image_thumbnail` TEXT, `back_image` TEXT, `video_cover` TEXT, `create_time_at_sec` INTEGER NOT NULL, `last_pushed_at_sec` INTEGER NOT NULL, `expired_time_at_sec` INTEGER NOT NULL, PRIMARY KEY(`aid`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '870d4cd8c31f56069a4ed14699f7f18b')");
    }

    @Override // X.C0BE
    public final void LIZIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `now_self_aweme_cache`");
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
        HashMap hashMap = new HashMap(12);
        hashMap.put("aid", new C25090yf(1, 1, "aid", "TEXT", null, true));
        hashMap.put("uid", new C25090yf(0, 1, "uid", "TEXT", null, true));
        hashMap.put("aweme_type", new C25090yf(0, 1, "aweme_type", "INTEGER", null, true));
        hashMap.put("author_name", new C25090yf(0, 1, "author_name", "TEXT", null, true));
        hashMap.put("like_count", new C25090yf(0, 1, "like_count", "INTEGER", null, true));
        hashMap.put("comment_count", new C25090yf(0, 1, "comment_count", "INTEGER", null, true));
        hashMap.put("front_image_thumbnail", new C25090yf(0, 1, "front_image_thumbnail", "TEXT", null, false));
        hashMap.put("back_image", new C25090yf(0, 1, "back_image", "TEXT", null, false));
        hashMap.put("video_cover", new C25090yf(0, 1, "video_cover", "TEXT", null, false));
        hashMap.put("create_time_at_sec", new C25090yf(0, 1, "create_time_at_sec", "INTEGER", null, true));
        hashMap.put("last_pushed_at_sec", new C25090yf(0, 1, "last_pushed_at_sec", "INTEGER", null, true));
        C25130yj c25130yj = new C25130yj("now_self_aweme_cache", hashMap, UC7.LIZIZ(hashMap, "expired_time_at_sec", new C25090yf(0, 1, "expired_time_at_sec", "INTEGER", null, true), 0), new HashSet(0));
        C25130yj LIZ = C25130yj.LIZ(c38451f7, "now_self_aweme_cache");
        if (!c25130yj.equals(LIZ)) {
            return new C0BF(false, C169696lJ.LIZJ("now_self_aweme_cache(com.ss.android.ugc.aweme.nows.cache.NowSelfAwemeEntity).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
        }
        return new C0BF(true, null);
    }
}
