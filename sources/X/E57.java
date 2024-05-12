package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;

/* loaded from: classes7.dex */
public final class E57 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final E57 LJLIL = new E57();

    public E57() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        IPluginService.PluginDataWrapper pluginDataWrapper;
        IPluginService.SimplePluginData simplePluginData;
        IPluginService.PluginData pluginData = (IPluginService.PluginData) E56.LIZ.getValue();
        if (pluginData != null && (pluginDataWrapper = pluginData.configData) != null && (simplePluginData = pluginDataWrapper.simplePluginData) != null) {
            return Integer.valueOf(simplePluginData.abGroup);
        }
        return null;
    }
}
