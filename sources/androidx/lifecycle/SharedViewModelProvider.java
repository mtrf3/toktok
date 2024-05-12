package androidx.lifecycle;

import X.C16880lQ;
import X.X1D;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SharedViewModelProvider extends ViewModelProvider {
    public HashMap<String, Set<Lifecycle>> map;
    public ViewModelStore store;
    public static final Companion Companion = new Companion();
    public static final ViewModelStore globalStore = new ViewModelStore();
    public static final HashMap<String, Set<Lifecycle>> globalMap = new HashMap<>();

    /* loaded from: classes.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SharedViewModelProvider(androidx.lifecycle.ViewModelProvider.Factory r2) {
        /*
            r1 = this;
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.o.LJIIJ(r2, r0)
            androidx.lifecycle.ViewModelStore r0 = androidx.lifecycle.SharedViewModelProvider.globalStore
            r1.<init>(r0, r2)
            r1.store = r0
            java.util.HashMap<java.lang.String, java.util.Set<androidx.lifecycle.Lifecycle>> r0 = androidx.lifecycle.SharedViewModelProvider.globalMap
            r1.map = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.SharedViewModelProvider.<init>(androidx.lifecycle.ViewModelProvider$Factory):void");
    }

    @Override // androidx.lifecycle.ViewModelProvider
    public <T extends ViewModel> T get(Class<T> modelClass) {
        o.LJIIJ(modelClass, "modelClass");
        throw new IllegalAccessException("Unsupport get viewmodel without lifecycle, please use method get(Lifecycle,Class) or get(Lifecycle,String,Class) instead");
    }

    /* loaded from: classes.dex */
    public static final class ClearUselessViewModelObserver implements LifecycleEventObserver {
        public final String key;
        public final Lifecycle lifecycle;
        public final HashMap<String, Set<Lifecycle>> map;
        public final ViewModelStore store;

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
            o.LJIIJ(source, "source");
            o.LJIIJ(event, "event");
            if (event == Lifecycle.Event.ON_DESTROY) {
                Set<Lifecycle> set = this.map.get(this.key);
                if (set == null) {
                    set = new LinkedHashSet<>();
                }
                Set<Lifecycle> set2 = set;
                set2.remove(this.lifecycle);
                if (set2.isEmpty()) {
                    this.store.put(this.key, null);
                    this.map.remove(this.key);
                }
            }
        }

        public ClearUselessViewModelObserver(Lifecycle lifecycle, String key, ViewModelStore store, HashMap<String, Set<Lifecycle>> map) {
            o.LJIIJ(lifecycle, "lifecycle");
            o.LJIIJ(key, "key");
            o.LJIIJ(store, "store");
            o.LJIIJ(map, "map");
            this.lifecycle = lifecycle;
            this.key = key;
            this.store = store;
            this.map = map;
        }
    }

    public final <T extends ViewModel> T get(Lifecycle lifecycle, Class<T> modelClass) {
        o.LJIIJ(lifecycle, "lifecycle");
        o.LJIIJ(modelClass, "modelClass");
        String LJLLILLLL = C16880lQ.LJLLILLLL(modelClass);
        if (LJLLILLLL != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            LIZ.append(LJLLILLLL);
            return (T) get(lifecycle, X1D.LIZIZ(LIZ), modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider
    public <T extends ViewModel> T get(String key, Class<T> modelClass) {
        o.LJIIJ(key, "key");
        o.LJIIJ(modelClass, "modelClass");
        throw new IllegalAccessException("Unsupport get viewmodel without lifecycle, please use method get(Lifecycle,Class) or get(Lifecycle,String,Class) instead");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedViewModelProvider(ViewModelStore store, HashMap<String, Set<Lifecycle>> map, ViewModelProvider.Factory factory) {
        super(store, factory);
        o.LJIIJ(store, "store");
        o.LJIIJ(map, "map");
        o.LJIIJ(factory, "factory");
        this.store = store;
        this.map = map;
    }

    public final <T extends ViewModel> T get(Lifecycle lifecycle, String key, Class<T> modelClass) {
        o.LJIIJ(lifecycle, "lifecycle");
        o.LJIIJ(key, "key");
        o.LJIIJ(modelClass, "modelClass");
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            if (SharedViewModelHostInjector.INSTANCE.getOptimiseLifecycle()) {
                try {
                    return modelClass.newInstance();
                } catch (Throwable unused) {
                    return (T) super.get(key, modelClass);
                }
            }
            throw new IllegalStateException("Could not get viewmodel when lifecycle was destroyed");
        }
        T t = (T) super.get(key, modelClass);
        Set<Lifecycle> set = this.map.get(key);
        if (set == null) {
            set = new LinkedHashSet<>();
        }
        Set<Lifecycle> set2 = set;
        this.map.put(key, set2);
        if (!set2.contains(lifecycle)) {
            set2.add(lifecycle);
            lifecycle.addObserver(new ClearUselessViewModelObserver(lifecycle, key, this.store, this.map));
        }
        return t;
    }

    public /* synthetic */ SharedViewModelProvider(ViewModelProvider.Factory factory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ViewModelProvider.NewInstanceFactory() : factory);
    }

    public /* synthetic */ SharedViewModelProvider(ViewModelStore viewModelStore, HashMap hashMap, ViewModelProvider.Factory factory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? globalStore : viewModelStore, (HashMap<String, Set<Lifecycle>>) ((i & 2) != 0 ? globalMap : hashMap), (i & 4) != 0 ? new ViewModelProvider.NewInstanceFactory() : factory);
    }
}
