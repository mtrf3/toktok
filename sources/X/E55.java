package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class E55 extends AbstractC65781Prl implements InterfaceC65784Pro<IPluginService.PluginData> {
    public static final E55 LJLIL = new E55();

    public E55() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.plugin.IPluginService$PluginData, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final IPluginService.PluginData invoke() {
        Iterator LJFF = C79061V1d.LJFF(false);
        while (LJFF.hasNext()) {
            ?? next = LJFF.next();
            if (((IPluginService.PluginData) next).id == EnumC35839E4t.NUJ_NUDGE_FOR_NEW_INSTALL.getValue()) {
                return next;
            }
        }
        return null;
    }
}
