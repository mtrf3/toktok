package X;

import com.bytedance.android.livesdk.i18n.db.I18nDatabase_Impl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.YWv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87529YWv extends C0BE {
    public final /* synthetic */ I18nDatabase_Impl LIZIZ;

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
    public C87529YWv(I18nDatabase_Impl i18nDatabase_Impl) {
        super(1);
        this.LIZIZ = i18nDatabase_Impl;
    }

    @Override // X.C0BE
    public final void LIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `translation` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `information` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'db08c04e8a10c6c1ddb9d9ab384c2f17')");
    }

    @Override // X.C0BE
    public final void LIZIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `translation`");
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `information`");
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
        hashMap.put("key", new C25090yf(1, 1, "key", "TEXT", null, true));
        C25130yj c25130yj = new C25130yj("translation", hashMap, UC7.LIZIZ(hashMap, "value", new C25090yf(0, 1, "value", "TEXT", null, false), 0), new HashSet(0));
        C25130yj LIZ = C25130yj.LIZ(c38451f7, "translation");
        if (!c25130yj.equals(LIZ)) {
            return new C0BF(false, C169696lJ.LIZJ("translation(com.bytedance.android.livesdk.i18n.db.I18nTranslation).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
        }
        HashMap hashMap2 = new HashMap(2);
        hashMap2.put("key", new C25090yf(1, 1, "key", "TEXT", null, true));
        C25130yj c25130yj2 = new C25130yj("information", hashMap2, UC7.LIZIZ(hashMap2, "value", new C25090yf(0, 1, "value", "TEXT", null, false), 0), new HashSet(0));
        C25130yj LIZ2 = C25130yj.LIZ(c38451f7, "information");
        if (!c25130yj2.equals(LIZ2)) {
            return new C0BF(false, C169696lJ.LIZJ("information(com.bytedance.android.livesdk.i18n.db.I18nInformation).\n Expected:\n", c25130yj2, "\n Found:\n", LIZ2));
        }
        return new C0BF(true, null);
    }
}
