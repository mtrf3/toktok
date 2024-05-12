package androidx.lifecycle;

import X.AnonymousClass107;
import X.C0VK;
import X.C16880lQ;
import X.InterfaceC36571c5;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: classes.dex */
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {
    public Bundle mDefaultArgs;
    public Lifecycle mLifecycle;
    public AnonymousClass107 mSavedStateRegistry;

    public abstract <T extends ViewModel> T create(String str, Class<T> cls, SavedStateHandle savedStateHandle);

    public AbstractSavedStateViewModelFactory() {
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        String LJLLILLLL = C16880lQ.LJLLILLLL(cls);
        if (LJLLILLLL != null) {
            if (this.mLifecycle != null) {
                return (T) create(LJLLILLLL, cls);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(ViewModel viewModel) {
        AnonymousClass107 anonymousClass107 = this.mSavedStateRegistry;
        if (anonymousClass107 != null) {
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, anonymousClass107, this.mLifecycle);
        }
    }

    public AbstractSavedStateViewModelFactory(InterfaceC36571c5 interfaceC36571c5, Bundle bundle) {
        this.mSavedStateRegistry = interfaceC36571c5.getSavedStateRegistry();
        this.mLifecycle = interfaceC36571c5.getLifecycle();
        this.mDefaultArgs = bundle;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls, C0VK c0vk) {
        String str = (String) c0vk.LIZ(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str != null) {
            if (this.mSavedStateRegistry != null) {
                return (T) create(str, cls);
            }
            return (T) create(str, cls, SavedStateHandleSupport.createSavedStateHandle(c0vk));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    private <T extends ViewModel> T create(String str, Class<T> cls) {
        SavedStateHandleController create = LegacySavedStateHandleController.create(this.mSavedStateRegistry, this.mLifecycle, str, this.mDefaultArgs);
        T t = (T) create(str, cls, create.getHandle());
        t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", create);
        return t;
    }
}
