package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MI7 implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(QnaSuggestedTabViewModel.class)) {
            return new QnaSuggestedTabViewModel(new T7O(0));
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
