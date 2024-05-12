package androidx.lifecycle;

import X.InterfaceC65784Pro;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class InternalKt {
    public static final void ensureViewModel(Fragment ensureViewModel, ViewModel value, InterfaceC65784Pro<String> keyFactory) {
        o.LJIIJ(ensureViewModel, "$this$ensureViewModel");
        o.LJIIJ(value, "value");
        o.LJIIJ(keyFactory, "keyFactory");
        ViewModelStore of = ViewModelStores.of(ensureViewModel);
        o.LJFF(of, "ViewModelStores.of(this)");
        String invoke = keyFactory.invoke();
        if (of.get(invoke) == null) {
            of.put(invoke, value);
        }
    }
}
