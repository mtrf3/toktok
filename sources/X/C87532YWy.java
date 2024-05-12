package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.freeflowcard.data.database.FreeFlowDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.YWy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87532YWy extends C0BE {
    public final /* synthetic */ FreeFlowDatabase_Impl LIZIZ;

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
    public C87532YWy(FreeFlowDatabase_Impl freeFlowDatabase_Impl) {
        super(1);
        this.LIZIZ = freeFlowDatabase_Impl;
    }

    @Override // X.C0BE
    public final void LIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `tb_auto_play_setting` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `is_open` INTEGER NOT NULL, `change_type` INTEGER NOT NULL, `reset_time` INTEGER NOT NULL, `monthly_state` INTEGER NOT NULL, `day_open` INTEGER NOT NULL, `day_open_reset_time` INTEGER NOT NULL)");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `tb_user_click_event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `click_type` INTEGER NOT NULL, `is_auto_play` INTEGER NOT NULL)");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `tb_app_start_mode` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `start_mode` INTEGER NOT NULL)");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1967f4d2e5a4f7e5e76e753b06cafe2b')");
    }

    @Override // X.C0BE
    public final void LIZIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `tb_auto_play_setting`");
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `tb_user_click_event`");
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `tb_app_start_mode`");
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
        hashMap.put("id", new C25090yf(1, 1, "id", "INTEGER", null, true));
        hashMap.put("is_open", new C25090yf(0, 1, "is_open", "INTEGER", null, true));
        hashMap.put("change_type", new C25090yf(0, 1, "change_type", "INTEGER", null, true));
        hashMap.put("reset_time", new C25090yf(0, 1, "reset_time", "INTEGER", null, true));
        hashMap.put("monthly_state", new C25090yf(0, 1, "monthly_state", "INTEGER", null, true));
        hashMap.put("day_open", new C25090yf(0, 1, "day_open", "INTEGER", null, true));
        C25130yj c25130yj = new C25130yj("tb_auto_play_setting", hashMap, UC7.LIZIZ(hashMap, "day_open_reset_time", new C25090yf(0, 1, "day_open_reset_time", "INTEGER", null, true), 0), new HashSet(0));
        C25130yj LIZ = C25130yj.LIZ(c38451f7, "tb_auto_play_setting");
        if (!c25130yj.equals(LIZ)) {
            return new C0BF(false, C169696lJ.LIZJ("tb_auto_play_setting(com.ss.android.ugc.aweme.freeflowcard.data.entity.AutoPlaySetting).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
        }
        HashMap hashMap2 = new HashMap(4);
        hashMap2.put("id", new C25090yf(1, 1, "id", "INTEGER", null, true));
        hashMap2.put("time", new C25090yf(0, 1, "time", "INTEGER", null, true));
        hashMap2.put("click_type", new C25090yf(0, 1, "click_type", "INTEGER", null, true));
        C25130yj c25130yj2 = new C25130yj("tb_user_click_event", hashMap2, UC7.LIZIZ(hashMap2, "is_auto_play", new C25090yf(0, 1, "is_auto_play", "INTEGER", null, true), 0), new HashSet(0));
        C25130yj LIZ2 = C25130yj.LIZ(c38451f7, "tb_user_click_event");
        if (!c25130yj2.equals(LIZ2)) {
            return new C0BF(false, C169696lJ.LIZJ("tb_user_click_event(com.ss.android.ugc.aweme.freeflowcard.data.entity.UserClickEvent).\n Expected:\n", c25130yj2, "\n Found:\n", LIZ2));
        }
        HashMap hashMap3 = new HashMap(3);
        hashMap3.put("id", new C25090yf(1, 1, "id", "INTEGER", null, true));
        hashMap3.put("time", new C25090yf(0, 1, "time", "INTEGER", null, true));
        C25130yj c25130yj3 = new C25130yj("tb_app_start_mode", hashMap3, UC7.LIZIZ(hashMap3, "start_mode", new C25090yf(0, 1, "start_mode", "INTEGER", null, true), 0), new HashSet(0));
        C25130yj LIZ3 = C25130yj.LIZ(c38451f7, "tb_app_start_mode");
        if (!c25130yj3.equals(LIZ3)) {
            return new C0BF(false, C169696lJ.LIZJ("tb_app_start_mode(com.ss.android.ugc.aweme.freeflowcard.data.entity.AppStartMode).\n Expected:\n", c25130yj3, "\n Found:\n", LIZ3));
        }
        return new C0BF(true, null);
    }
}
