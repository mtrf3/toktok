package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class E4P extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final E4P LJLIL = new E4P();

    public E4P() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        E4G e4g;
        IPluginService.PluginDataWrapper value;
        IPluginService.SimplePluginData simplePluginData;
        int i = 0;
        Iterator<E4G> it = PluginService.createIPluginServicebyMonsterPlugin(false).getCurrentPluginList().iterator();
        do {
            e4g = null;
            if (!it.hasNext()) {
                break;
            }
            e4g = it.next();
        } while (e4g.getType() != EnumC35839E4t.INCREASE_LOGIN_NOTIFY);
        E4G e4g2 = e4g;
        if (e4g2 != null && (value = e4g2.getValue()) != null && (simplePluginData = value.simplePluginData) != null) {
            i = simplePluginData.abGroup;
        }
        return Integer.valueOf(i);
    }
}
