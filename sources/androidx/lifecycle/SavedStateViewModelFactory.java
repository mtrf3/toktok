package androidx.lifecycle;

import X.AnonymousClass107;
import X.C0VK;
import X.C16880lQ;
import X.InterfaceC36571c5;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {
    public Application application;
    public Bundle defaultArgs;
    public final ViewModelProvider.Factory factory;
    public Lifecycle lifecycle;
    public AnonymousClass107 savedStateRegistry;

    public SavedStateViewModelFactory() {
        this.factory = new ViewModelProvider.AndroidViewModelFactory();
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        String LJLLILLLL = C16880lQ.LJLLILLLL(modelClass);
        if (LJLLILLLL != null) {
            return (T) create(LJLLILLLL, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(ViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle != null) {
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, this.savedStateRegistry, lifecycle);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SavedStateViewModelFactory(Application application, InterfaceC36571c5 owner) {
        this(application, owner, null);
        o.LJIIIZ(owner, "owner");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, C0VK extras) {
        Constructor findMatchingConstructor;
        o.LJIIIZ(modelClass, "modelClass");
        o.LJIIIZ(extras, "extras");
        String str = (String) extras.LIZ(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str != null) {
            if (extras.LIZ(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY) != null && extras.LIZ(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY) != null) {
                Object LIZ = extras.LIZ(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
                boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
                if (isAssignableFrom && LIZ != null) {
                    findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE);
                } else {
                    findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE);
                }
                if (findMatchingConstructor == null) {
                    return (T) this.factory.create(modelClass, extras);
                }
                if (isAssignableFrom && LIZ != null) {
                    return (T) SavedStateViewModelFactoryKt.newInstance(modelClass, findMatchingConstructor, LIZ, SavedStateHandleSupport.createSavedStateHandle(extras));
                }
                return (T) SavedStateViewModelFactoryKt.newInstance(modelClass, findMatchingConstructor, SavedStateHandleSupport.createSavedStateHandle(extras));
            }
            if (this.lifecycle != null) {
                return (T) create(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public final <T extends ViewModel> T create(String key, Class<T> modelClass) {
        Constructor findMatchingConstructor;
        T t;
        Application application;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(modelClass, "modelClass");
        if (this.lifecycle != null) {
            boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
            if (isAssignableFrom && this.application != null) {
                findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE);
            } else {
                findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE);
            }
            if (findMatchingConstructor == null) {
                if (this.application != null) {
                    return (T) this.factory.create(modelClass);
                }
                return (T) ViewModelProvider.NewInstanceFactory.Companion.getInstance().create(modelClass);
            }
            SavedStateHandleController create = LegacySavedStateHandleController.create(this.savedStateRegistry, this.lifecycle, key, this.defaultArgs);
            if (isAssignableFrom && (application = this.application) != null) {
                o.LJI(application);
                SavedStateHandle handle = create.getHandle();
                o.LJIIIIZZ(handle, "controller.handle");
                t = (T) SavedStateViewModelFactoryKt.newInstance(modelClass, findMatchingConstructor, application, handle);
            } else {
                SavedStateHandle handle2 = create.getHandle();
                o.LJIIIIZZ(handle2, "controller.handle");
                t = (T) SavedStateViewModelFactoryKt.newInstance(modelClass, findMatchingConstructor, handle2);
            }
            t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", create);
            return t;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public SavedStateViewModelFactory(Application application, InterfaceC36571c5 owner, Bundle bundle) {
        ViewModelProvider.AndroidViewModelFactory androidViewModelFactory;
        o.LJIIIZ(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(application);
        } else {
            androidViewModelFactory = new ViewModelProvider.AndroidViewModelFactory();
        }
        this.factory = androidViewModelFactory;
    }
}
