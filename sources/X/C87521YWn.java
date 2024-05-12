package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.relation.storage.db.RelationDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.YWn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87521YWn extends C0BE {
    public final /* synthetic */ RelationDatabase_Impl LIZIZ;

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
    public C87521YWn(RelationDatabase_Impl relationDatabase_Impl) {
        super(1);
        this.LIZIZ = relationDatabase_Impl;
    }

    @Override // X.C0BE
    public final void LIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `maf_info` (`uid` TEXT NOT NULL, `rec_type` TEXT NOT NULL, `rec_reason` TEXT, `relation_type` TEXT, `social_info` TEXT, `mutual_struct` TEXT, `external_recommend_reason` TEXT, `version` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`uid`, `rec_type`))");
        c38451f7.LJJIJIIJI("CREATE INDEX IF NOT EXISTS `index_maf_info_uid` ON `maf_info` (`uid`)");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `user_info` (`uid` TEXT NOT NULL, `version` INTEGER NOT NULL DEFAULT 0, `nickname` TEXT, `is_private_account` INTEGER, `avatar_168` TEXT, `avatar_300` TEXT, PRIMARY KEY(`uid`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `user_status` (`uid` TEXT NOT NULL, `follow_status` INTEGER, `follower_status` INTEGER, `is_block` INTEGER, `version` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`uid`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f75f2d2e74b409761abba7970ba9bb1b')");
    }

    @Override // X.C0BE
    public final void LIZIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `maf_info`");
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `user_info`");
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `user_status`");
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
        hashMap.put("uid", new C25090yf(1, 1, "uid", "TEXT", null, true));
        hashMap.put("rec_type", new C25090yf(2, 1, "rec_type", "TEXT", null, true));
        hashMap.put("rec_reason", new C25090yf(0, 1, "rec_reason", "TEXT", null, false));
        hashMap.put("relation_type", new C25090yf(0, 1, "relation_type", "TEXT", null, false));
        hashMap.put("social_info", new C25090yf(0, 1, "social_info", "TEXT", null, false));
        hashMap.put("mutual_struct", new C25090yf(0, 1, "mutual_struct", "TEXT", null, false));
        hashMap.put("external_recommend_reason", new C25090yf(0, 1, "external_recommend_reason", "TEXT", null, false));
        HashSet LIZIZ = UC7.LIZIZ(hashMap, "version", new C25090yf(0, 1, "version", "INTEGER", CardStruct.IStatusCode.DEFAULT, true), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new C25120yi(false, "index_maf_info_uid", Arrays.asList("uid"), Arrays.asList("ASC")));
        C25130yj c25130yj = new C25130yj("maf_info", hashMap, LIZIZ, hashSet);
        C25130yj LIZ = C25130yj.LIZ(c38451f7, "maf_info");
        if (!c25130yj.equals(LIZ)) {
            return new C0BF(false, C169696lJ.LIZJ("maf_info(com.ss.android.ugc.aweme.relation.storage.db.entity.MafInfo).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
        }
        HashMap hashMap2 = new HashMap(6);
        hashMap2.put("uid", new C25090yf(1, 1, "uid", "TEXT", null, true));
        hashMap2.put("version", new C25090yf(0, 1, "version", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap2.put("nickname", new C25090yf(0, 1, "nickname", "TEXT", null, false));
        hashMap2.put("is_private_account", new C25090yf(0, 1, "is_private_account", "INTEGER", null, false));
        hashMap2.put("avatar_168", new C25090yf(0, 1, "avatar_168", "TEXT", null, false));
        C25130yj c25130yj2 = new C25130yj("user_info", hashMap2, UC7.LIZIZ(hashMap2, "avatar_300", new C25090yf(0, 1, "avatar_300", "TEXT", null, false), 0), new HashSet(0));
        C25130yj LIZ2 = C25130yj.LIZ(c38451f7, "user_info");
        if (!c25130yj2.equals(LIZ2)) {
            return new C0BF(false, C169696lJ.LIZJ("user_info(com.ss.android.ugc.aweme.relation.storage.db.entity.UserInfo).\n Expected:\n", c25130yj2, "\n Found:\n", LIZ2));
        }
        HashMap hashMap3 = new HashMap(5);
        hashMap3.put("uid", new C25090yf(1, 1, "uid", "TEXT", null, true));
        hashMap3.put("follow_status", new C25090yf(0, 1, "follow_status", "INTEGER", null, false));
        hashMap3.put("follower_status", new C25090yf(0, 1, "follower_status", "INTEGER", null, false));
        hashMap3.put("is_block", new C25090yf(0, 1, "is_block", "INTEGER", null, false));
        C25130yj c25130yj3 = new C25130yj("user_status", hashMap3, UC7.LIZIZ(hashMap3, "version", new C25090yf(0, 1, "version", "INTEGER", CardStruct.IStatusCode.DEFAULT, true), 0), new HashSet(0));
        C25130yj LIZ3 = C25130yj.LIZ(c38451f7, "user_status");
        if (!c25130yj3.equals(LIZ3)) {
            return new C0BF(false, C169696lJ.LIZJ("user_status(com.ss.android.ugc.aweme.relation.storage.db.entity.UserStatus).\n Expected:\n", c25130yj3, "\n Found:\n", LIZ3));
        }
        return new C0BF(true, null);
    }
}
