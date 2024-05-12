package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SI5 implements ViewModelStoreOwner, LifecycleOwner {
    public final ActivityC45651qj LJLIL;
    public final Fragment LJLILLLLZI;
    public final SIS LJLJI;
    public final Lifecycle LJLJJI;
    public final ViewModelStore LJLJJL;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLJJI;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.LJLJJL;
    }

    public SI5(ActivityC45651qj activityC45651qj, Fragment fragment, SIS sis) {
        Lifecycle lifecycle;
        ViewModelStore viewModelStore;
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = fragment;
        this.LJLJI = sis;
        if (fragment != null) {
            fragment.mo49getActivity();
        }
        if (fragment == null || (lifecycle = fragment.getLifecycle()) == null) {
            lifecycle = activityC45651qj.getLifecycle();
            o.LJIIIIZZ(lifecycle, "activity.lifecycle");
        }
        this.LJLJJI = lifecycle;
        if (fragment == null || (viewModelStore = fragment.getViewModelStore()) == null) {
            viewModelStore = activityC45651qj.getViewModelStore();
            o.LJIIIIZZ(viewModelStore, "activity.viewModelStore");
        }
        this.LJLJJL = viewModelStore;
    }
}
