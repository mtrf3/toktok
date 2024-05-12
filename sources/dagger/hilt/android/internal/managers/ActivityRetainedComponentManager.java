package dagger.hilt.android.internal.managers;

import X.C1AU;
import X.C244519ih;
import X.InterfaceC244649iu;
import X.YU5;
import X.YU6;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

/* loaded from: classes16.dex */
public final class ActivityRetainedComponentManager implements YU5<InterfaceC244649iu> {
    public final ViewModelProvider LJLIL;
    public volatile InterfaceC244649iu LJLILLLLZI;
    public final Object LJLJI = new Object();

    @Override // X.YU5
    public final InterfaceC244649iu generatedComponent() {
        if (this.LJLILLLLZI == null) {
            synchronized (this.LJLJI) {
                if (this.LJLILLLLZI == null) {
                    this.LJLILLLLZI = ((ActivityRetainedComponentViewModel) this.LJLIL.get(ActivityRetainedComponentViewModel.class)).LJLIL;
                }
            }
        }
        return this.LJLILLLLZI;
    }

    /* loaded from: classes16.dex */
    public static final class ActivityRetainedComponentViewModel extends ViewModel {
        public final InterfaceC244649iu LJLIL;

        public ActivityRetainedComponentViewModel(C244519ih c244519ih) {
            this.LJLIL = c244519ih;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityRetainedComponentManager(C1AU c1au) {
        this.LJLIL = new ViewModelProvider((ViewModelStoreOwner) c1au, new YU6(c1au));
    }
}
