package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.ecommerce.search.sug.vm.EcSearchSugAssemVM;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KAQ implements ViewModelProvider.Factory {
    public final InterfaceC55235Lm3 LIZ;
    public final ActivityC45651qj LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new EcSearchSugAssemVM(this.LIZIZ, this.LIZ);
    }

    public KAQ(ActivityC45651qj activityC45651qj, InterfaceC55235Lm3 scope) {
        o.LJIIIZ(scope, "scope");
        this.LIZ = scope;
        this.LIZIZ = activityC45651qj;
    }
}
