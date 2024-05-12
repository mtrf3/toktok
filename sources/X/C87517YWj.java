package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.contact.data.base.IMContactDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.YWj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87517YWj extends C0BE {
    public final /* synthetic */ IMContactDatabase_Impl LIZIZ;

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
    public C87517YWj(IMContactDatabase_Impl iMContactDatabase_Impl) {
        super(1);
        this.LIZIZ = iMContactDatabase_Impl;
    }

    @Override // X.C0BE
    public final void LIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `IM_USER_BASE_INFO` (`UID` INTEGER NOT NULL, `AVATAR_THUMB` TEXT, `AVATAR_MEDIUM` TEXT, `NICK_NAME` TEXT, `UNIQUE_ID` TEXT, `FOLLOW_STATUS` INTEGER, `MAF_STATUS` INTEGER, `REC_TYPE` TEXT, `UPDATE_TIME` INTEGER NOT NULL, `SORT_WEIGHT` TEXT, `INITIAL_LETTER` TEXT, `EXTRA` TEXT, PRIMARY KEY(`UID`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `SHARE_PERMISSION` (`UID` INTEGER NOT NULL, `COLUMN_USER_SHARE_STATUS` INTEGER, `TTN_SHARE_STATUS` INTEGER, `UPDATE_TIME` INTEGER NOT NULL, `EXTRA` TEXT, PRIMARY KEY(`UID`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2faafbedb9959c92d9cd62ef208e804e')");
    }

    @Override // X.C0BE
    public final void LIZIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `IM_USER_BASE_INFO`");
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `SHARE_PERMISSION`");
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
        hashMap.put("UID", new C25090yf(1, 1, "UID", "INTEGER", null, true));
        hashMap.put("AVATAR_THUMB", new C25090yf(0, 1, "AVATAR_THUMB", "TEXT", null, false));
        hashMap.put("AVATAR_MEDIUM", new C25090yf(0, 1, "AVATAR_MEDIUM", "TEXT", null, false));
        hashMap.put("NICK_NAME", new C25090yf(0, 1, "NICK_NAME", "TEXT", null, false));
        hashMap.put("UNIQUE_ID", new C25090yf(0, 1, "UNIQUE_ID", "TEXT", null, false));
        hashMap.put("FOLLOW_STATUS", new C25090yf(0, 1, "FOLLOW_STATUS", "INTEGER", null, false));
        hashMap.put("MAF_STATUS", new C25090yf(0, 1, "MAF_STATUS", "INTEGER", null, false));
        hashMap.put("REC_TYPE", new C25090yf(0, 1, "REC_TYPE", "TEXT", null, false));
        hashMap.put("UPDATE_TIME", new C25090yf(0, 1, "UPDATE_TIME", "INTEGER", null, true));
        hashMap.put("SORT_WEIGHT", new C25090yf(0, 1, "SORT_WEIGHT", "TEXT", null, false));
        hashMap.put("INITIAL_LETTER", new C25090yf(0, 1, "INITIAL_LETTER", "TEXT", null, false));
        C25130yj c25130yj = new C25130yj("IM_USER_BASE_INFO", hashMap, UC7.LIZIZ(hashMap, "EXTRA", new C25090yf(0, 1, "EXTRA", "TEXT", null, false), 0), new HashSet(0));
        C25130yj LIZ = C25130yj.LIZ(c38451f7, "IM_USER_BASE_INFO");
        if (!c25130yj.equals(LIZ)) {
            return new C0BF(false, C169696lJ.LIZJ("IM_USER_BASE_INFO(com.ss.android.ugc.aweme.contact.data.entity.IMUserBaseInfoEntity).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
        }
        HashMap hashMap2 = new HashMap(5);
        hashMap2.put("UID", new C25090yf(1, 1, "UID", "INTEGER", null, true));
        hashMap2.put("COLUMN_USER_SHARE_STATUS", new C25090yf(0, 1, "COLUMN_USER_SHARE_STATUS", "INTEGER", null, false));
        hashMap2.put("TTN_SHARE_STATUS", new C25090yf(0, 1, "TTN_SHARE_STATUS", "INTEGER", null, false));
        hashMap2.put("UPDATE_TIME", new C25090yf(0, 1, "UPDATE_TIME", "INTEGER", null, true));
        C25130yj c25130yj2 = new C25130yj("SHARE_PERMISSION", hashMap2, UC7.LIZIZ(hashMap2, "EXTRA", new C25090yf(0, 1, "EXTRA", "TEXT", null, false), 0), new HashSet(0));
        C25130yj LIZ2 = C25130yj.LIZ(c38451f7, "SHARE_PERMISSION");
        if (!c25130yj2.equals(LIZ2)) {
            return new C0BF(false, C169696lJ.LIZJ("SHARE_PERMISSION(com.ss.android.ugc.aweme.contact.data.entity.SharePermissionEntity).\n Expected:\n", c25130yj2, "\n Found:\n", LIZ2));
        }
        return new C0BF(true, null);
    }
}
