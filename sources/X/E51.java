package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class E51 extends AbstractC65781Prl implements InterfaceC65784Pro<IPluginService.PluginData> {
    public static final E51 LJLIL = new E51();

    public E51() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.plugin.IPluginService$PluginData, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final IPluginService.PluginData invoke() {
        Iterator LJFF = C79061V1d.LJFF(false);
        while (LJFF.hasNext()) {
            ?? next = LJFF.next();
            if (((IPluginService.PluginData) next).id == EnumC35839E4t.REDUCE_LOGIN_NOTIFICATION_PLUGIN.getValue()) {
                return next;
            }
        }
        return null;
    }
}
