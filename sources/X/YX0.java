package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes16.dex */
public final class YX0 extends C0BE {
    public final /* synthetic */ LocalHashTagDataBase_Impl LIZIZ;

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
    public YX0(LocalHashTagDataBase_Impl localHashTagDataBase_Impl) {
        super(1);
        this.LIZIZ = localHashTagDataBase_Impl;
    }

    @Override // X.C0BE
    public final void LIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `localHashTag` (`name` TEXT NOT NULL, `time` INTEGER, PRIMARY KEY(`name`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0fdb23fe113307f93af74ceea527f0a9')");
    }

    @Override // X.C0BE
    public final void LIZIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `localHashTag`");
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
        HashMap hashMap = new HashMap(2);
        hashMap.put("name", new C25090yf(1, 1, "name", "TEXT", null, true));
        C25130yj c25130yj = new C25130yj("localHashTag", hashMap, UC7.LIZIZ(hashMap, "time", new C25090yf(0, 1, "time", "INTEGER", null, false), 0), new HashSet(0));
        C25130yj LIZ = C25130yj.LIZ(c38451f7, "localHashTag");
        if (!c25130yj.equals(LIZ)) {
            return new C0BF(false, C169696lJ.LIZJ("localHashTag(com.ss.android.ugc.aweme.challenge.data.LocalHashTagItem).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
        }
        return new C0BF(true, null);
    }
}
