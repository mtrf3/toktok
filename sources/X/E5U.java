package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.plugin.PluginService;

/* loaded from: classes7.dex */
public final class E5U implements InterfaceC79713Ax {
    public final /* synthetic */ PluginService LIZ;
    public final /* synthetic */ Observer<E5L> LIZIZ;

    @Override // X.InterfaceC79713Ax
    public final void onComplete() {
        this.LIZ.getInitialRequestResultLiveData().removeObserver(this.LIZIZ);
    }

    public E5U(PluginService pluginService, Observer<E5L> observer) {
        this.LIZ = pluginService;
        this.LIZIZ = observer;
    }
}
