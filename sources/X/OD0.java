package X;

import android.text.TextUtils;
import com.bytedance.geckox.policy.v4.UpdateModel;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import defpackage.i0;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public final class OD0 {
    public static java.util.Map<String, java.util.Map<String, UpdateModel>> LJFF;
    public java.util.Map<String, List<GlobalConfigSettings.SyncItem>> LIZJ;
    public java.util.Map<String, List<GlobalConfigSettings.SyncItem>> LJ;
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final AtomicInteger LIZLLL = new AtomicInteger(-1);
    public final C61276O3c LIZIZ = EBC.LIZ.LJ();

    public final List<GlobalConfigSettings.SyncItem> LIZIZ(String str, boolean z) {
        java.util.Map<String, List<GlobalConfigSettings.SyncItem>> map;
        List<GlobalConfigSettings.SyncItem> list;
        if (!EBC.LIZ.LJII() || TextUtils.isEmpty(str) || (map = this.LIZJ) == null || ((HashMap) map).isEmpty()) {
            return null;
        }
        if (z) {
            list = (List) ((HashMap) this.LIZJ).remove(str);
            java.util.Map<String, java.util.Map<String, UpdateModel>> map2 = LJFF;
            if (map2 != null) {
                ((ConcurrentHashMap) map2).remove(str);
            }
        } else {
            list = (List) ((HashMap) this.LIZJ).get(str);
        }
        OC6.LIZ("gecko-debug-tag", i0.LJFF("registered occasion is triggered:", str), list);
        return list;
    }

    public final void LIZ(int i, int i2, List list) {
        java.util.Map<String, List<GlobalConfigSettings.SyncItem>> map;
        if (i == 6 && this.LIZLLL.decrementAndGet() == 0 && (map = this.LJ) != null && !((ConcurrentHashMap) map).isEmpty()) {
            C61572OEm.LIZ.LIZIZ(new OD2(this), 2000L);
        }
        OAR.LIZ.LIZ().execute(new OD1(this, list, i2, i));
    }
}
