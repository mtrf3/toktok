package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E50 {
    public static IPluginService.PluginData LIZ() {
        Object obj;
        Iterator LJFF = C79061V1d.LJFF(false);
        while (true) {
            if (LJFF.hasNext()) {
                obj = LJFF.next();
                if (((IPluginService.PluginData) obj).id == EnumC35839E4t.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
        if (pluginData == null || !o.LJ(pluginData.showConfig.shouldShow, Boolean.TRUE)) {
            return null;
        }
        return pluginData;
    }

    public static IPluginService.PluginData LIZIZ() {
        Object obj;
        Iterator LJFF = C79061V1d.LJFF(false);
        while (true) {
            if (LJFF.hasNext()) {
                obj = LJFF.next();
                if (((IPluginService.PluginData) obj).id == EnumC35839E4t.PERSONALIZED_NUJ_PRELOAD_DATA.getValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
        if (pluginData == null || !o.LJ(pluginData.showConfig.shouldShow, Boolean.TRUE)) {
            return null;
        }
        return pluginData;
    }

    public static IPluginService.PluginData LIZJ() {
        Object obj;
        Iterator LJFF = C79061V1d.LJFF(false);
        while (true) {
            if (LJFF.hasNext()) {
                obj = LJFF.next();
                if (((IPluginService.PluginData) obj).id == EnumC35839E4t.NON_FORCED_REGION_QUICK_LOGIN.getValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
        if (pluginData == null || !o.LJ(pluginData.showConfig.shouldShow, Boolean.TRUE)) {
            return null;
        }
        return pluginData;
    }
}
