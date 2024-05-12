package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.E4j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35829E4j {
    public static boolean LIZ() {
        Object obj;
        String str;
        IPluginService.RemoveISData removeISData;
        Iterator LJFF = C79061V1d.LJFF(false);
        while (true) {
            if (LJFF.hasNext()) {
                obj = LJFF.next();
                if (((IPluginService.PluginData) obj).id == EnumC35839E4t.REMOVE_IS_DATA.getValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
        if (pluginData == null || !o.LJ(pluginData.showConfig.shouldShow, Boolean.TRUE) || (str = pluginData.abExposeVid) == null || str.length() == 0) {
            return false;
        }
        String str2 = pluginData.abExposeVid;
        if (str2 != null) {
            FH5.LIZIZ().getClass();
            FH5.LIZ(str2);
        }
        IPluginService.PluginDataWrapper pluginDataWrapper = pluginData.configData;
        return (pluginDataWrapper == null || (removeISData = pluginDataWrapper.removeISData) == null || !removeISData.shouldSkipIS) ? false : true;
    }
}
