package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.trill.share.data.ShareDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.YWx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87531YWx extends C0BE {
    public final /* synthetic */ ShareDatabase_Impl LIZIZ;

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
    public C87531YWx(ShareDatabase_Impl shareDatabase_Impl) {
        super(3);
        this.LIZIZ = shareDatabase_Impl;
    }

    @Override // X.C0BE
    public final void LIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `Record` (`rid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER, `channel` TEXT, `share_type` INTEGER)");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4e670bbb58b1cec9bfaaeb409ecedc0d')");
    }

    @Override // X.C0BE
    public final void LIZIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `Record`");
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
        HashMap hashMap = new HashMap(4);
        hashMap.put("rid", new C25090yf(1, 1, "rid", "INTEGER", null, true));
        hashMap.put("time", new C25090yf(0, 1, "time", "INTEGER", null, false));
        hashMap.put("channel", new C25090yf(0, 1, "channel", "TEXT", null, false));
        C25130yj c25130yj = new C25130yj("Record", hashMap, UC7.LIZIZ(hashMap, "share_type", new C25090yf(0, 1, "share_type", "INTEGER", null, false), 0), new HashSet(0));
        C25130yj LIZ = C25130yj.LIZ(c38451f7, "Record");
        if (!c25130yj.equals(LIZ)) {
            return new C0BF(false, C169696lJ.LIZJ("Record(com.ss.android.ugc.trill.share.data.Record).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
        }
        return new C0BF(true, null);
    }
}
