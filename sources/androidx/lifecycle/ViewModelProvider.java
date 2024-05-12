package androidx.lifecycle;

import X.C09K;
import X.C09L;
import X.C0VJ;
import X.C0VK;
import X.C0VL;
import X.C16880lQ;
import X.C1NF;
import X.C1NG;
import X.C1NH;
import X.X1D;
import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class ViewModelProvider {
    public final C0VK defaultCreationExtras;
    public final Factory factory;
    public final ViewModelStore store;

    /* loaded from: classes.dex */
    public static class OnRequeryFactory {
        public void onRequery(ViewModel viewModel) {
            o.LJIIIZ(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelProvider(ViewModelStore store, Factory factory) {
        this(store, factory, null, 4, 0 == true ? 1 : 0);
        o.LJIIIZ(store, "store");
        o.LJIIIZ(factory, "factory");
    }

    /* loaded from: classes.dex */
    public static class AndroidViewModelFactory extends NewInstanceFactory {
        public static AndroidViewModelFactory sInstance;
        public final Application application;
        public static final Companion Companion = new Companion();
        public static final C0VJ<Application> APPLICATION_KEY = Companion.ApplicationKeyImpl.INSTANCE;

        public AndroidViewModelFactory() {
            this(null, 0);
        }

        public static final AndroidViewModelFactory getInstance(Application application) {
            return Companion.getInstance(application);
        }

        /* loaded from: classes.dex */
        public static final class Companion {

            /* loaded from: classes.dex */
            public static final class ApplicationKeyImpl implements C0VJ<Application> {
                public static final ApplicationKeyImpl INSTANCE = new ApplicationKeyImpl();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            public final Factory defaultFactory$lifecycle_viewmodel_release(ViewModelStoreOwner owner) {
                o.LJIIIZ(owner, "owner");
                if (owner instanceof HasDefaultViewModelProviderFactory) {
                    Factory defaultViewModelProviderFactory = ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelProviderFactory();
                    o.LJIIIIZZ(defaultViewModelProviderFactory, "owner.defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory;
                }
                return NewInstanceFactory.Companion.getInstance();
            }

            public final AndroidViewModelFactory getInstance(Application application) {
                o.LJIIIZ(application, "application");
                if (AndroidViewModelFactory.sInstance == null) {
                    AndroidViewModelFactory.sInstance = new AndroidViewModelFactory(application);
                }
                AndroidViewModelFactory androidViewModelFactory = AndroidViewModelFactory.sInstance;
                o.LJI(androidViewModelFactory);
                return androidViewModelFactory;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AndroidViewModelFactory(Application application) {
            this(application, 0);
            o.LJIIIZ(application, "application");
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            o.LJIIIZ(modelClass, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) create(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public AndroidViewModelFactory(Application application, int i) {
            this.application = application;
        }

        private final <T extends ViewModel> T create(Class<T> cls, Application application) {
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    o.LJIIIIZZ(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(C09K.LIZIZ("Cannot create an instance of ", cls), e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException(C09K.LIZIZ("Cannot create an instance of ", cls), e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(C09K.LIZIZ("Cannot create an instance of ", cls), e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(C09K.LIZIZ("Cannot create an instance of ", cls), e4);
                }
            }
            return (T) super.create(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, C0VK extras) {
            o.LJIIIZ(modelClass, "modelClass");
            o.LJIIIZ(extras, "extras");
            if (this.application != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.LIZ(APPLICATION_KEY);
            if (application != null) {
                return (T) create(modelClass, application);
            }
            if (!AndroidViewModel.class.isAssignableFrom(modelClass)) {
                return (T) super.create(modelClass);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
    }

    /* loaded from: classes.dex */
    public interface Factory {
        public static final Companion Companion = Companion.$$INSTANCE;

        <T extends ViewModel> T create(Class<T> cls);

        <T extends ViewModel> T create(Class<T> cls, C0VK c0vk);

        /* loaded from: classes.dex */
        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();

            public final Factory from(C0VL<?>... initializers) {
                o.LJIIIZ(initializers, "initializers");
                return new C1NG((C0VL[]) Arrays.copyOf(initializers, initializers.length));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class NewInstanceFactory implements Factory {
        public static final Companion Companion = new Companion();
        public static final C0VJ<String> VIEW_MODEL_KEY = Companion.ViewModelKeyImpl.INSTANCE;
        public static NewInstanceFactory sInstance;

        /* loaded from: classes.dex */
        public static final class Companion {

            /* loaded from: classes.dex */
            public static final class ViewModelKeyImpl implements C0VJ<String> {
                public static final ViewModelKeyImpl INSTANCE = new ViewModelKeyImpl();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ void getInstance$annotations() {
            }

            public final NewInstanceFactory getInstance() {
                if (NewInstanceFactory.sInstance == null) {
                    NewInstanceFactory.sInstance = new NewInstanceFactory();
                }
                NewInstanceFactory newInstanceFactory = NewInstanceFactory.sInstance;
                o.LJI(newInstanceFactory);
                return newInstanceFactory;
            }

            public Companion() {
            }
        }

        public static final NewInstanceFactory getInstance() {
            return Companion.getInstance();
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
            return C09L.LIZIZ(this, cls, c0vk);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            o.LJIIIZ(modelClass, "modelClass");
            try {
                T newInstance = modelClass.newInstance();
                o.LJIIIIZZ(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(C09K.LIZIZ("Cannot create an instance of ", modelClass), e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(C09K.LIZIZ("Cannot create an instance of ", modelClass), e2);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewModelProvider(androidx.lifecycle.ViewModelStoreOwner r4) {
        /*
            r3 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            androidx.lifecycle.ViewModelStore r2 = r4.getViewModelStore()
            java.lang.String r0 = "owner.viewModelStore"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion
            androidx.lifecycle.ViewModelProvider$Factory r1 = r0.defaultFactory$lifecycle_viewmodel_release(r4)
            X.0VK r0 = androidx.lifecycle.ViewModelProviderGetKt.defaultCreationExtras(r4)
            r3.<init>(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ViewModelProvider.<init>(androidx.lifecycle.ViewModelStoreOwner):void");
    }

    public <T extends ViewModel> T get(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        String LJLLILLLL = C16880lQ.LJLLILLLL(modelClass);
        if (LJLLILLLL != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            LIZ.append(LJLLILLLL);
            return (T) get(X1D.LIZIZ(LIZ), modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewModelProvider(androidx.lifecycle.ViewModelStoreOwner r3, androidx.lifecycle.ViewModelProvider.Factory r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            androidx.lifecycle.ViewModelStore r1 = r3.getViewModelStore()
            java.lang.String r0 = "owner.viewModelStore"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.0VK r0 = androidx.lifecycle.ViewModelProviderGetKt.defaultCreationExtras(r3)
            r2.<init>(r1, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ViewModelProvider.<init>(androidx.lifecycle.ViewModelStoreOwner, androidx.lifecycle.ViewModelProvider$Factory):void");
    }

    public <T extends ViewModel> T get(String key, Class<T> modelClass) {
        T t;
        OnRequeryFactory onRequeryFactory;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(modelClass, "modelClass");
        T viewModel = (T) this.store.get(key);
        if (modelClass.isInstance(viewModel)) {
            Object obj = this.factory;
            if ((obj instanceof OnRequeryFactory) && (onRequeryFactory = (OnRequeryFactory) obj) != null) {
                o.LJIIIIZZ(viewModel, "viewModel");
                onRequeryFactory.onRequery(viewModel);
            }
            if (viewModel != null) {
                return viewModel;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        C1NH c1nh = new C1NH(this.defaultCreationExtras);
        c1nh.LIZIZ(NewInstanceFactory.VIEW_MODEL_KEY, key);
        try {
            t = (T) this.factory.create(modelClass, c1nh);
        } catch (AbstractMethodError unused) {
            t = (T) this.factory.create(modelClass);
        }
        this.store.put(key, t);
        return t;
    }

    public ViewModelProvider(ViewModelStore store, Factory factory, C0VK defaultCreationExtras) {
        o.LJIIIZ(store, "store");
        o.LJIIIZ(factory, "factory");
        o.LJIIIZ(defaultCreationExtras, "defaultCreationExtras");
        this.store = store;
        this.factory = factory;
        this.defaultCreationExtras = defaultCreationExtras;
    }

    public /* synthetic */ ViewModelProvider(ViewModelStore viewModelStore, Factory factory, C0VK c0vk, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelStore, factory, (i & 4) != 0 ? C1NF.LIZIZ : c0vk);
    }
}
