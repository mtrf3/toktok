package X;

import com.bytedance.ies.abmock.ClientExpManager;
import com.ss.android.ugc.aweme.plugin.PluginEventConfig;

/* renamed from: X.DyW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35624DyW extends AbstractC65781Prl implements InterfaceC65784Pro<PluginEventConfig> {
    public static final C35624DyW LJLIL = new C35624DyW();

    public C35624DyW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final PluginEventConfig invoke() {
        PluginEventConfig pluginEventConfig;
        try {
            if (FFL.LJIIIZ().LJIIJJI(ClientExpManager.plugin_interceptor_experiment(), "plugin_interceptor_experiment") == 0) {
                pluginEventConfig = new PluginEventConfig(false, 0, null, 4, null);
            } else {
                pluginEventConfig = new PluginEventConfig(true, 50, null, 4, null);
            }
            return pluginEventConfig;
        } catch (Exception unused) {
            return new PluginEventConfig(false, 0, null, 4, null);
        }
    }
}
