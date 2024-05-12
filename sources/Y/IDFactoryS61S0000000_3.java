package Y;

import X.C09L;
import X.C0VK;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.comment.commentlist.viewmodel.CommentViewModelImpl;
import com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager;
import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDFactoryS61S0000000_3 implements ViewModelProvider.Factory {
    public final int $t;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        switch (this.$t) {
            case 0:
                return (T) create$0(this, cls);
            case 1:
                return (T) create$1(this, cls);
            case 2:
                return (T) create$2(this, cls);
            default:
                return null;
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        switch (this.$t) {
            case 0:
                return C09L.LIZIZ(this, cls, c0vk);
            case 1:
                return C09L.LIZIZ(this, cls, c0vk);
            case 2:
                return C09L.LIZIZ(this, cls, c0vk);
            default:
                return null;
        }
    }

    public IDFactoryS61S0000000_3(int i) {
        this.$t = i;
    }

    public static final ViewModel create$0(IDFactoryS61S0000000_3 iDFactoryS61S0000000_3, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new CommentViewModelImpl();
    }

    public static final ViewModel create$1(IDFactoryS61S0000000_3 iDFactoryS61S0000000_3, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new DetailLoadStateManager();
    }

    public static final ViewModel create$2(IDFactoryS61S0000000_3 iDFactoryS61S0000000_3, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        Object newInstance = MentionFavoriteVideoVM.class.getConstructor(new Class[0]).newInstance(new Object[0]);
        o.LJII(newInstance, "null cannot be cast to non-null type T of com.ss.android.ugc.aweme.compose.MentionFavoriteComposeFragment.getViewModelProviderFactory.<no name provided>.create");
        return (ViewModel) newInstance;
    }
}
