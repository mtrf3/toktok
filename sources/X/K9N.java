package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm.ECSearchBarAssemVM;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K9N implements ViewModelProvider.Factory {
    public final InterfaceC55235Lm3 LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    public K9N(InterfaceC55235Lm3 scope) {
        o.LJIIIZ(scope, "scope");
        this.LIZ = scope;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new ECSearchBarAssemVM(this.LIZ);
    }
}
