package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.ecommerce.base.sku.engine.DefaultSkuStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.AfA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26780AfA implements ViewModelProvider.Factory {
    public final EnumC28000Ayq LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        T newInstance;
        o.LJIIIZ(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(SkuPanelViewModel.class)) {
            ViewModelProvider.Factory LIZIZ = C27206Am2.LIZIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
            if (LIZIZ == null) {
                LIZIZ = new DefaultSkuStrategyService();
            }
            newInstance = (T) LIZIZ.create(modelClass);
        } else {
            newInstance = modelClass.newInstance();
        }
        o.LJII(newInstance, "null cannot be cast to non-null type T of com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment.ViewModelFactory.create$lambda$0");
        return newInstance;
    }

    public C26780AfA(EnumC28000Ayq biz, String pageName) {
        o.LJIIIZ(biz, "biz");
        o.LJIIIZ(pageName, "pageName");
        this.LIZ = biz;
        this.LIZIZ = pageName;
        this.LIZJ = null;
        this.LIZLLL = null;
    }
}
