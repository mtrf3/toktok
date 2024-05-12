package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.service.INUJDebugService;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EAW {
    public static boolean LIZ() {
        IPluginService.PluginData pluginData;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        IPluginService.SimplePluginData simplePluginData;
        if (C39263Fb1.LJIIIIZZ.getBoolean("consent_once_shown", false)) {
            return false;
        }
        ((INUJDebugService) ServiceManager.get().getService(INUJDebugService.class)).LIZIZ();
        Iterator<IPluginService.PluginData> it = PluginService.createIPluginServicebyMonsterPlugin(false).getCurrentPluginListPluginData().iterator();
        while (true) {
            if (it.hasNext()) {
                pluginData = it.next();
                if (pluginData.id == EnumC35839E4t.SP_REMOVE_CONSENT.getValue()) {
                    break;
                }
            } else {
                pluginData = null;
                break;
            }
        }
        IPluginService.PluginData pluginData2 = pluginData;
        if (pluginData2 == null || o.LJ(pluginData2.showConfig.shouldShow, Boolean.FALSE) || (pluginDataWrapper = pluginData2.configData) == null || (simplePluginData = pluginDataWrapper.simplePluginData) == null) {
            return true;
        }
        int i = simplePluginData.abGroup;
        EAX.Companion.getClass();
        for (EAX eax : EAX.values()) {
            if (eax.getValue() == i) {
                if (eax == EAX.TREATMENT) {
                    return false;
                }
                return true;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
