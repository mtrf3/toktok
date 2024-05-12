package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;
import kotlin.jvm.internal.o;

/* renamed from: X.E4r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35837E4r {
    public static C35833E4n LIZ(IPluginService.PluginData pluginData) {
        o.LJIIIZ(pluginData, "pluginData");
        C35838E4s c35838E4s = EnumC35839E4t.Companion;
        int i = pluginData.id;
        c35838E4s.getClass();
        EnumC35839E4t enumC35839E4t = EnumC35839E4t.pluginMap.get(Integer.valueOf(i));
        if (enumC35839E4t == null) {
            return null;
        }
        return new C35833E4n(enumC35839E4t, pluginData);
    }
}
