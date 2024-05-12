package X;

import androidx.lifecycle.JediViewHolderProxyViewModelStore;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AMH {
    public static final /* synthetic */ int LIZJ = 0;
    public final ViewModelProvider.Factory LIZ;
    public final JediViewHolderProxyViewModelStore LIZIZ;

    public AMH(ViewModelProvider.Factory factory, JediViewHolderProxyViewModelStore store) {
        o.LJIIJ(factory, "factory");
        o.LJIIJ(store, "store");
        this.LIZ = factory;
        this.LIZIZ = store;
    }

    public final <VM extends ViewModel> VM LIZ(String key, Class<VM> cls) {
        VM it;
        o.LJIIJ(key, "key");
        VM vm = (VM) this.LIZIZ.get(key);
        if (cls.isInstance(vm)) {
            if (vm != null) {
                return vm;
            }
            throw new C37692Eqm("null cannot be cast to non-null type VM");
        }
        synchronized (cls) {
            it = (VM) this.LIZ.create(cls);
        }
        JediViewHolderProxyViewModelStore jediViewHolderProxyViewModelStore = this.LIZIZ;
        o.LJFF(it, "it");
        jediViewHolderProxyViewModelStore.put(key, it);
        return it;
    }
}
