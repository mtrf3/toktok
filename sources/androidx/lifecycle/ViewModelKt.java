package androidx.lifecycle;

import X.C36636EZk;
import X.InterfaceC70422pa;
import X.T2R;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ViewModelKt {
    public static final InterfaceC70422pa getViewModelScope(ViewModel viewModel) {
        o.LJIIIZ(viewModel, "<this>");
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) viewModel.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (interfaceC70422pa != null) {
            return interfaceC70422pa;
        }
        Object tagIfAbsent = viewModel.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new CloseableCoroutineScope(T2R.LJIIJJI().plus(C36636EZk.LIZ.LJJIJIL())));
        o.LJIIIIZZ(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (InterfaceC70422pa) tagIfAbsent;
    }
}
