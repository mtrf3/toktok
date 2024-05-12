package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.friendstab.db.AwemeRecordDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes16.dex */
public final class YX1 extends C0BE {
    public final /* synthetic */ AwemeRecordDatabase_Impl LIZIZ;

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
    public YX1(AwemeRecordDatabase_Impl awemeRecordDatabase_Impl) {
        super(2);
        this.LIZIZ = awemeRecordDatabase_Impl;
    }

    @Override // X.C0BE
    public final void LIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `AWEME_READ_RECORD` (`AWEME_ID` TEXT NOT NULL, `READ_TIME` INTEGER NOT NULL, `PAGE_TYPE` INTEGER NOT NULL, `REPORTED` INTEGER NOT NULL, `USER_ID` TEXT NOT NULL, `SCENE` INTEGER NOT NULL, `INSERT_TIME` INTEGER NOT NULL, PRIMARY KEY(`AWEME_ID`, `SCENE`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a57aa84ce150ca7ad0d33000cf2b3224')");
    }

    @Override // X.C0BE
    public final void LIZIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `AWEME_READ_RECORD`");
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
        hashMap.put("AWEME_ID", new C25090yf(1, 1, "AWEME_ID", "TEXT", null, true));
        hashMap.put("READ_TIME", new C25090yf(0, 1, "READ_TIME", "INTEGER", null, true));
        hashMap.put("PAGE_TYPE", new C25090yf(0, 1, "PAGE_TYPE", "INTEGER", null, true));
        hashMap.put("REPORTED", new C25090yf(0, 1, "REPORTED", "INTEGER", null, true));
        hashMap.put("USER_ID", new C25090yf(0, 1, "USER_ID", "TEXT", null, true));
        hashMap.put("SCENE", new C25090yf(2, 1, "SCENE", "INTEGER", null, true));
        C25130yj c25130yj = new C25130yj("AWEME_READ_RECORD", hashMap, UC7.LIZIZ(hashMap, "INSERT_TIME", new C25090yf(0, 1, "INSERT_TIME", "INTEGER", null, true), 0), new HashSet(0));
        C25130yj LIZ = C25130yj.LIZ(c38451f7, "AWEME_READ_RECORD");
        if (!c25130yj.equals(LIZ)) {
            return new C0BF(false, C169696lJ.LIZJ("AWEME_READ_RECORD(com.ss.android.ugc.aweme.friendstab.db.AwemeReadRecordEntity).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
        }
        return new C0BF(true, null);
    }
}
