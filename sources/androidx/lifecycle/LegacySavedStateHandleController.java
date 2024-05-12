package androidx.lifecycle;

import X.AnonymousClass104;
import X.AnonymousClass107;
import X.InterfaceC36571c5;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import java.util.Iterator;

/* loaded from: classes.dex */
public class LegacySavedStateHandleController {

    /* loaded from: classes.dex */
    public static final class OnRecreation implements AnonymousClass104 {
        @Override // X.AnonymousClass104
        public void onRecreated(InterfaceC36571c5 interfaceC36571c5) {
            if (interfaceC36571c5 instanceof ViewModelStoreOwner) {
                ViewModelStore viewModelStore = ((ViewModelStoreOwner) interfaceC36571c5).getViewModelStore();
                AnonymousClass107 savedStateRegistry = interfaceC36571c5.getSavedStateRegistry();
                Iterator it = viewModelStore.keys().iterator();
                while (it.hasNext()) {
                    LegacySavedStateHandleController.attachHandleIfNeeded(viewModelStore.get((String) it.next()), savedStateRegistry, interfaceC36571c5.getLifecycle());
                }
                if (!viewModelStore.keys().isEmpty()) {
                    savedStateRegistry.LIZLLL(OnRecreation.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    public static void tryToAddRecreator(final AnonymousClass107 anonymousClass107, final Lifecycle lifecycle) {
        Lifecycle.State currentState = lifecycle.getCurrentState();
        if (currentState == Lifecycle.State.INITIALIZED || currentState.isAtLeast(Lifecycle.State.STARTED)) {
            anonymousClass107.LIZLLL(OnRecreation.class);
        } else {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.lifecycle.LegacySavedStateHandleController.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_START) {
                        Lifecycle.this.removeObserver(this);
                        anonymousClass107.LIZLLL(OnRecreation.class);
                    }
                }
            });
        }
    }

    public static void attachHandleIfNeeded(ViewModel viewModel, AnonymousClass107 anonymousClass107, Lifecycle lifecycle) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.isAttached()) {
            savedStateHandleController.attachToLifecycle(anonymousClass107, lifecycle);
            tryToAddRecreator(anonymousClass107, lifecycle);
        }
    }

    public static SavedStateHandleController create(AnonymousClass107 anonymousClass107, Lifecycle lifecycle, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, SavedStateHandle.createHandle(anonymousClass107.LIZ(str), bundle));
        savedStateHandleController.attachToLifecycle(anonymousClass107, lifecycle);
        tryToAddRecreator(anonymousClass107, lifecycle);
        return savedStateHandleController;
    }
}
