package androidx.lifecycle;

import X.AnonymousClass106;
import X.AnonymousClass107;
import X.C221108m2;
import X.C5H3;
import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SavedStateHandlesProvider implements AnonymousClass106 {
    public boolean restored;
    public Bundle restoredState;
    public final AnonymousClass107 savedStateRegistry;
    public final C5H3 viewModel$delegate;

    private final SavedStateHandlesVM getViewModel() {
        return (SavedStateHandlesVM) this.viewModel$delegate.getValue();
    }

    public final void performRestore() {
        if (!this.restored) {
            this.restoredState = this.savedStateRegistry.LIZ("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.restored = true;
            getViewModel();
        }
    }

    @Override // X.AnonymousClass106
    public Bundle saveState() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, SavedStateHandle> entry : getViewModel().getHandles().entrySet()) {
            String key = entry.getKey();
            Bundle saveState = entry.getValue().savedStateProvider().saveState();
            if (!o.LJ(saveState, Bundle.EMPTY)) {
                bundle.putBundle(key, saveState);
            }
        }
        this.restored = false;
        return bundle;
    }

    public final Bundle consumeRestoredStateForKey(String key) {
        Bundle bundle;
        o.LJIIIZ(key, "key");
        performRestore();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(key);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.restoredState;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.restoredState = null;
        }
        return bundle;
    }

    public SavedStateHandlesProvider(AnonymousClass107 savedStateRegistry, ViewModelStoreOwner viewModelStoreOwner) {
        o.LJIIIZ(savedStateRegistry, "savedStateRegistry");
        o.LJIIIZ(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel$delegate = C221108m2.LIZIZ(new IDqS420S0100000(viewModelStoreOwner, 5));
    }
}
