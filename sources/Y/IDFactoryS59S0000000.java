package Y;

import X.C09L;
import X.C0VK;
import androidx.fragment.app.FragmentManagerViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.loader.app.LoaderManagerImpl;

/* loaded from: classes.dex */
public class IDFactoryS59S0000000 implements ViewModelProvider.Factory {
    public final int $t;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        switch (this.$t) {
            case 0:
                return (T) create$0(this, cls);
            case 1:
                return (T) create$1(this, cls);
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
            default:
                return null;
        }
    }

    public IDFactoryS59S0000000(int i) {
        this.$t = i;
    }

    public static final ViewModel create$0(IDFactoryS59S0000000 iDFactoryS59S0000000, Class cls) {
        return new FragmentManagerViewModel(true);
    }

    public static final ViewModel create$1(IDFactoryS59S0000000 iDFactoryS59S0000000, Class cls) {
        return new LoaderManagerImpl.LoaderViewModel();
    }
}
