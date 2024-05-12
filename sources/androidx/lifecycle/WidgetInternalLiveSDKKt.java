package androidx.lifecycle;

import X.InterfaceC65784Pro;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class WidgetInternalLiveSDKKt {
    public static final void ensureViewModel(Fragment fragment, ViewModel value, InterfaceC65784Pro<String> keyFactory) {
        o.LJIIIZ(fragment, "<this>");
        o.LJIIIZ(value, "value");
        o.LJIIIZ(keyFactory, "keyFactory");
        ViewModelStore viewModelStore = fragment.getViewModelStore();
        o.LJIIIIZZ(viewModelStore, "this.viewModelStore");
        String invoke = keyFactory.invoke();
        if (viewModelStore.get(invoke) == null) {
            viewModelStore.put(invoke, value);
        }
    }
}
