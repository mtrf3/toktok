package androidx.lifecycle;

import X.InterfaceC65784Pro;
import X.WM7;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SceneInternalKt {
    public static final void ensureViewModel(WM7 ensureViewModel, ViewModel value, InterfaceC65784Pro<String> keyFactory) {
        o.LJIIJ(ensureViewModel, "$this$ensureViewModel");
        o.LJIIJ(value, "value");
        o.LJIIJ(keyFactory, "keyFactory");
        ViewModelStore viewModelStore = ensureViewModel.getViewModelStore();
        o.LJFF(viewModelStore, "viewModelStore");
        String invoke = keyFactory.invoke();
        if (viewModelStore.get(invoke) == null) {
            viewModelStore.put(invoke, value);
        }
    }
}
