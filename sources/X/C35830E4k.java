package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.Iterator;

/* renamed from: X.E4k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35830E4k extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35830E4k LJLIL = new C35830E4k();

    public C35830E4k() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Object obj;
        int intValue;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        IPluginService.SimplePluginData simplePluginData;
        Iterator LJFF = C79061V1d.LJFF(false);
        while (true) {
            if (LJFF.hasNext()) {
                obj = LJFF.next();
                if (((IPluginService.PluginData) obj).id == EnumC35839E4t.SIGNUP_AVATAR_ANDROID.getValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
        if (pluginData != null && (pluginDataWrapper = pluginData.configData) != null && (simplePluginData = pluginDataWrapper.simplePluginData) != null) {
            intValue = simplePluginData.abGroup;
        } else {
            intValue = ((Number) C35831E4l.LIZIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
