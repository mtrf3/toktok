package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.plugin.PluginService;

/* loaded from: classes7.dex */
public final class E5R implements InterfaceC79713Ax {
    public final /* synthetic */ C68322mC<Observer<java.util.Map<Long, C35833E4n>>> LIZ;
    public final /* synthetic */ PluginService LIZIZ;

    @Override // X.InterfaceC79713Ax
    public final void onComplete() {
        Observer<java.util.Map<Long, C35833E4n>> observer = this.LIZ.element;
        if (observer != null) {
            this.LIZIZ.plugins.removeObserver(observer);
        }
    }

    public E5R(C68322mC<Observer<java.util.Map<Long, C35833E4n>>> c68322mC, PluginService pluginService) {
        this.LIZ = c68322mC;
        this.LIZIZ = pluginService;
    }
}
