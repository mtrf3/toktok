package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E64 {
    public static E68 LIZ() {
        Object obj;
        E66 e66 = new E66();
        if (E63.LIZJ() && (!((RBX) HG3.LJIILL()).isLogin() || E63.LIZIZ())) {
            Iterator LJFF = C79061V1d.LJFF(false);
            while (true) {
                if (LJFF.hasNext()) {
                    obj = LJFF.next();
                    if (((IPluginService.PluginData) obj).id == EnumC35839E4t.COHORT_NEW_USER_MODE.getValue()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
            if ((pluginData == null || !o.LJ(pluginData.showConfig.shouldShow, Boolean.FALSE)) && E63.LIZ.getInt("active_days", 0) < 4) {
                return e66;
            }
        }
        return new E65();
    }
}
