package X;

import X.C0I6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.1iy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40841iy<T extends C0I6> extends AbstractC29891Fh<T> implements ViewModelStoreOwner {
    public ViewModelStore LJLIL;
    public final C82622Wbi LJLILLLLZI;

    private final Lifecycle.State LJJLIIIIJ() {
        Lifecycle.State currentState = getLifecycle().getCurrentState();
        o.LJIIIIZZ(currentState, "lifecycle.currentState");
        return currentState;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        if (LJJLIIIIJ().isAtLeast(Lifecycle.State.INITIALIZED)) {
            if (this.LJLIL == null) {
                this.LJLIL = new ViewModelStore();
            }
            ViewModelStore viewModelStore = this.LJLIL;
            if (viewModelStore != null) {
                return viewModelStore;
            }
            o.LJIJI("viewModelStore");
            throw null;
        }
        throw new IllegalStateException("can't access ViewModels when component is destroyed");
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        ViewModelStore viewModelStore = this.LJLIL;
        if (viewModelStore != null) {
            viewModelStore.clear();
        }
    }

    public AbstractC40841iy(C82622Wbi parentOC) {
        o.LJIIIZ(parentOC, "parentOC");
        this.LJLILLLLZI = parentOC;
    }

    public static final /* synthetic */ ViewModelStore LJJLI(AbstractC40841iy abstractC40841iy) {
        ViewModelStore viewModelStore = abstractC40841iy.LJLIL;
        if (viewModelStore != null) {
            return viewModelStore;
        }
        o.LJIJI("viewModelStore");
        throw null;
    }
}
