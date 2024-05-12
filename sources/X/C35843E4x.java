package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.Iterator;

/* renamed from: X.E4x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35843E4x {
    public static int LIZ() {
        Object obj;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        IPluginService.SimplePluginData simplePluginData;
        Iterator LJFF = C79061V1d.LJFF(false);
        while (true) {
            if (LJFF.hasNext()) {
                obj = LJFF.next();
                if (((IPluginService.PluginData) obj).id == EnumC35839E4t.NUJ_POPUP_CLEAN.getValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
        if (pluginData == null || (pluginDataWrapper = pluginData.configData) == null || (simplePluginData = pluginDataWrapper.simplePluginData) == null) {
            return 0;
        }
        return simplePluginData.abGroup;
    }
}
