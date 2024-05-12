package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import ujb.s;

/* loaded from: classes7.dex */
public final class F94 {
    public static final boolean LIZ(String str) {
        List LJJZZIII;
        FP1.LJ("AIGCManager -> containWhitelist: info = ", str);
        boolean z = false;
        List LJLJJL = s.LJLJJL(str, new String[]{","}, 0, 6);
        java.util.Set set = null;
        Object[] objArr = (Object[]) SettingsManager.LIZLLL().LJIIIIZZ("whitelist_for_auto_aigc_label", String[].class, null);
        if (objArr != null && (LJJZZIII = ORY.LJJZZIII(objArr)) != null) {
            set = ORZ.LJZI(LJJZZIII, ORZ.LLJJ(LJLJJL));
        }
        if (set == null || set.isEmpty()) {
            z = true;
        }
        return true ^ z;
    }
}
