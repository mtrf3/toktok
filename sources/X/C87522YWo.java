package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.YWo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87522YWo extends C0BE {
    public final /* synthetic */ ShowAdDataBase_Impl LIZIZ;

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
    public C87522YWo(ShowAdDataBase_Impl showAdDataBase_Impl) {
        super(2);
        this.LIZIZ = showAdDataBase_Impl;
    }

    @Override // X.C0BE
    public final void LIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `showAd` (`awemeId` TEXT NOT NULL, `cid` TEXT, PRIMARY KEY(`awemeId`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e04cf56d01dc68702059f284d226e920')");
    }

    @Override // X.C0BE
    public final void LIZIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `showAd`");
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
        hashMap.put("awemeId", new C25090yf(1, 1, "awemeId", "TEXT", null, true));
        C25130yj c25130yj = new C25130yj("showAd", hashMap, UC7.LIZIZ(hashMap, "cid", new C25090yf(0, 1, "cid", "TEXT", null, false), 0), new HashSet(0));
        C25130yj LIZ = C25130yj.LIZ(c38451f7, "showAd");
        if (!c25130yj.equals(LIZ)) {
            return new C0BF(false, C169696lJ.LIZJ("showAd(com.ss.android.ugc.aweme.commercialize.dao.ShowAd).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
        }
        return new C0BF(true, null);
    }
}