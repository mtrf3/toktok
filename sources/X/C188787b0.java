package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.7b0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188787b0 {
    public final synchronized com.bytedance.hox.Hox LIZ(final ActivityC45651qj activity) {
        ViewModel viewModel;
        o.LJIIJ(activity, "activity");
        viewModel = new ViewModelProvider(activity, new ViewModelProvider.Factory() { // from class: X.7az
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
                return C09L.LIZIZ(this, cls, c0vk);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> modelClass) {
                o.LJIIJ(modelClass, "modelClass");
                return new com.bytedance.hox.Hox(ActivityC45651qj.this);
            }
        }).get(com.bytedance.hox.Hox.class);
        o.LJFF(viewModel, "ViewModelProvider(activi…  }).get(Hox::class.java)");
        return (com.bytedance.hox.Hox) viewModel;
    }
}
