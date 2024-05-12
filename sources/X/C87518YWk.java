package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.nows.cache.NowMediaCacheDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.YWk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87518YWk extends C0BE {
    public final /* synthetic */ NowMediaCacheDatabase_Impl LIZIZ;

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
    public C87518YWk(NowMediaCacheDatabase_Impl nowMediaCacheDatabase_Impl) {
        super(1);
        this.LIZIZ = nowMediaCacheDatabase_Impl;
    }

    @Override // X.C0BE
    public final void LIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `now_media_cache` (`aid` TEXT NOT NULL, `create_time_in_mills` INTEGER NOT NULL, `photo_front_img_path` TEXT, `photo_back_img_path` TEXT, `mix_front_cover_path` TEXT, `mix_back_cover_path` TEXT, `mix_video_path` TEXT, PRIMARY KEY(`aid`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bf446c0383e9d6806fb4799bd2414938')");
    }

    @Override // X.C0BE
    public final void LIZIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `now_media_cache`");
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
        HashMap hashMap = new HashMap(7);
        hashMap.put("aid", new C25090yf(1, 1, "aid", "TEXT", null, true));
        hashMap.put("create_time_in_mills", new C25090yf(0, 1, "create_time_in_mills", "INTEGER", null, true));
        hashMap.put("photo_front_img_path", new C25090yf(0, 1, "photo_front_img_path", "TEXT", null, false));
        hashMap.put("photo_back_img_path", new C25090yf(0, 1, "photo_back_img_path", "TEXT", null, false));
        hashMap.put("mix_front_cover_path", new C25090yf(0, 1, "mix_front_cover_path", "TEXT", null, false));
        hashMap.put("mix_back_cover_path", new C25090yf(0, 1, "mix_back_cover_path", "TEXT", null, false));
        C25130yj c25130yj = new C25130yj("now_media_cache", hashMap, UC7.LIZIZ(hashMap, "mix_video_path", new C25090yf(0, 1, "mix_video_path", "TEXT", null, false), 0), new HashSet(0));
        C25130yj LIZ = C25130yj.LIZ(c38451f7, "now_media_cache");
        if (!c25130yj.equals(LIZ)) {
            return new C0BF(false, C169696lJ.LIZJ("now_media_cache(com.ss.android.ugc.aweme.nows.cache.NowMediaCacheEntity).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
        }
        return new C0BF(true, null);
    }
}
