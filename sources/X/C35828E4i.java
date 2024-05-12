package X;

import androidx.lifecycle.Observer;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import kotlin.jvm.internal.o;

/* renamed from: X.E4i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35828E4i<T> implements Observer {
    public static final C35828E4i<T> LJLIL = new C35828E4i<>();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get reverse nuj plugin should Show ");
        LIZ.append(pluginData.showConfig.shouldShow);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        String str = pluginData.abExposeVid;
        if (str != null) {
            FH5.LIZIZ().getClass();
            FH5.LIZ(str);
        }
        ((Keva) E5B.LIZ.getValue()).storeBoolean("key_enable_reverse_nuj", o.LJ(pluginData.showConfig.shouldShow, Boolean.FALSE));
        InterfaceC79713Ax interfaceC79713Ax = E5B.LIZJ;
        if (interfaceC79713Ax != null) {
            interfaceC79713Ax.onComplete();
        }
    }
}
