package androidx.lifecycle;

import X.C0VK;
import X.C1NF;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ViewModelProviderGetKt {
    public static final C0VK defaultCreationExtras(ViewModelStoreOwner owner) {
        o.LJIIIZ(owner, "owner");
        if (owner instanceof HasDefaultViewModelProviderFactory) {
            C0VK defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelCreationExtras();
            o.LJIIIIZZ(defaultViewModelCreationExtras, "{\n        owner.defaultV…ModelCreationExtras\n    }");
            return defaultViewModelCreationExtras;
        }
        return C1NF.LIZIZ;
    }

    public static final <VM extends ViewModel> VM get(ViewModelProvider viewModelProvider) {
        o.LJIIIZ(viewModelProvider, "<this>");
        o.LJIJ();
        throw null;
    }
}
