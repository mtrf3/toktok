package androidx.lifecycle;

import X.C221108m2;
import X.C5H3;
import X.C65352Pkq;
import X.InterfaceC74236TBo;
import X.TBT;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class JediViewHolderProxyViewModelStore {
    public static final /* synthetic */ InterfaceC74236TBo[] $$delegatedProperties;
    public final C5H3 viewModels$delegate = C221108m2.LIZIZ(JediViewHolderProxyViewModelStore$viewModels$2.INSTANCE);

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(JediViewHolderProxyViewModelStore.class), "viewModels", "getViewModels()Ljava/util/HashMap;");
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt};
    }

    private final HashMap<String, ViewModel> getViewModels() {
        return (HashMap) this.viewModels$delegate.getValue();
    }

    public final void clear() {
        Collection<ViewModel> values = getViewModels().values();
        o.LJFF(values, "viewModels.values");
        Iterator<ViewModel> it = values.iterator();
        while (it.hasNext()) {
            it.next().onCleared();
        }
        getViewModels().clear();
    }

    public final ViewModel get(String key) {
        o.LJIIJ(key, "key");
        return getViewModels().get(key);
    }

    public final void put(String key, ViewModel viewModel) {
        o.LJIIJ(key, "key");
        o.LJIIJ(viewModel, "viewModel");
        ViewModel put = getViewModels().put(key, viewModel);
        if (put != null) {
            put.onCleared();
        }
    }
}
