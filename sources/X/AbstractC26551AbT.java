package X;

import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;
import kotlin.jvm.internal.o;

/* renamed from: X.AbT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC26551AbT<VM extends ViewModel> implements IComponentStrategyService<VM> {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService, androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        VM LIZIZ = LIZIZ();
        o.LJII(LIZIZ, "null cannot be cast to non-null type T of com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService.create");
        return LIZIZ;
    }
}
