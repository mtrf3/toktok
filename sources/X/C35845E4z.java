package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.E4z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35845E4z extends AbstractC73391SrD<E5L> {
    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object t) {
        Boolean bool;
        IPluginService.PluginData pluginData;
        IPluginService.ShowConfig showConfig;
        String str;
        IPluginService.ShowConfig showConfig2;
        o.LJIIIZ(t, "t");
        boolean z = false;
        Iterator<IPluginService.PluginData> it = PluginService.createIPluginServicebyMonsterPlugin(false).getCurrentPluginListPluginData().iterator();
        while (true) {
            bool = null;
            if (it.hasNext()) {
                pluginData = it.next();
                if (pluginData.id == EnumC35839E4t.REVERSE_IS_DATA.getValue()) {
                    break;
                }
            } else {
                pluginData = null;
                break;
            }
        }
        IPluginService.PluginData pluginData2 = pluginData;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get reverse is plugin should Show ");
        if (pluginData2 != null && (showConfig2 = pluginData2.showConfig) != null) {
            bool = showConfig2.shouldShow;
        }
        LIZ.append(bool);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        if (pluginData2 != null && (str = pluginData2.abExposeVid) != null) {
            FH5.LIZIZ().getClass();
            FH5.LIZ(str);
        }
        if (pluginData2 != null && (showConfig = pluginData2.showConfig) != null) {
            z = o.LJ(showConfig.shouldShow, Boolean.FALSE);
        }
        ((Keva) E59.LIZ.getValue()).storeBoolean("key_enable_reverse_interest_select", z);
    }
}
