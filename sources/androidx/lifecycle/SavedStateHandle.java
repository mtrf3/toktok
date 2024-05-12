package androidx.lifecycle;

import X.AnonymousClass106;
import X.C113554cx;
import X.C16880lQ;
import X.C33R;
import X.F5P;
import X.InterfaceC71762rk;
import X.OSZ;
import X.V1M;
import X.V3N;
import X.V8H;
import X.X1D;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.lifecycle.SavedStateHandle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SavedStateHandle {
    public final Map<String, C33R<Object>> flows;
    public final Map<String, SavingStateLiveData<?>> liveDatas;
    public final Map<String, Object> regular;
    public final AnonymousClass106 savedStateProvider;
    public final Map<String, AnonymousClass106> savedStateProviders;
    public static final Companion Companion = new Companion();
    public static final Class<? extends Object>[] ACCEPTABLE_CLASSES = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    public static final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
        return Companion.createHandle(bundle, bundle2);
    }

    public final Set<String> keys() {
        return F5P.LJIIJJI(F5P.LJIIJJI(this.regular.keySet(), this.savedStateProviders.keySet()), this.liveDatas.keySet());
    }

    public SavedStateHandle() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new AnonymousClass106() { // from class: X.1BE
            @Override // X.AnonymousClass106
            public final Bundle saveState() {
                return SavedStateHandle.m55savedStateProvider$lambda0(SavedStateHandle.this);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final boolean validateValue(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class<? extends Object> cls : SavedStateHandle.ACCEPTABLE_CLASSES) {
                o.LJI(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        public final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new SavedStateHandle();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    o.LJIIIIZZ(key, "key");
                    hashMap.put(key, C16880lQ.LLJJIII(bundle2, key));
                }
                return new SavedStateHandle(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = ListProtector.get(parcelableArrayList, i);
                    if (obj != null) {
                        linkedHashMap.put(obj, ListProtector.get(parcelableArrayList2, i));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                return new SavedStateHandle(linkedHashMap);
            }
            "Invalid bundle passed as restored state".toString();
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
    }

    public final AnonymousClass106 savedStateProvider() {
        return this.savedStateProvider;
    }

    /* loaded from: classes.dex */
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        public SavedStateHandle handle;
        public String key;

        public final void detach() {
            this.handle = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t) {
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null) {
                savedStateHandle.regular.put(this.key, t);
                C33R<Object> c33r = savedStateHandle.flows.get(this.key);
                if (c33r != null) {
                    c33r.setValue(t);
                }
            }
            super.setValue(t);
        }

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String key) {
            o.LJIIIZ(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(SavedStateHandle savedStateHandle, String key, T t) {
            super(t);
            o.LJIIIZ(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }
    }

    public SavedStateHandle(Map<String, ? extends Object> initialState) {
        o.LJIIIZ(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new AnonymousClass106() { // from class: X.1BE
            @Override // X.AnonymousClass106
            public final Bundle saveState() {
                return SavedStateHandle.m55savedStateProvider$lambda0(SavedStateHandle.this);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    /* renamed from: savedStateProvider$lambda-0, reason: not valid java name */
    public static final Bundle m55savedStateProvider$lambda0(SavedStateHandle this$0) {
        o.LJIIIZ(this$0, "this$0");
        for (Map.Entry entry : C113554cx.LJJLIIIJLLLLLLLZ(this$0.savedStateProviders).entrySet()) {
            this$0.set((String) entry.getKey(), ((AnonymousClass106) entry.getValue()).saveState());
        }
        Set<String> keySet = this$0.regular.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.regular.get(str));
        }
        return V3N.LJ(new OSZ("keys", arrayList), new OSZ("values", arrayList2));
    }

    public final void clearSavedStateProvider(String key) {
        o.LJIIIZ(key, "key");
        this.savedStateProviders.remove(key);
    }

    public final boolean contains(String key) {
        o.LJIIIZ(key, "key");
        return this.regular.containsKey(key);
    }

    public final <T> T get(String key) {
        o.LJIIIZ(key, "key");
        return (T) this.regular.get(key);
    }

    public final <T> MutableLiveData<T> getLiveData(String key) {
        o.LJIIIZ(key, "key");
        return getLiveDataInternal(key, false, null);
    }

    public final <T> T remove(String key) {
        o.LJIIIZ(key, "key");
        T t = (T) this.regular.remove(key);
        SavingStateLiveData<?> remove = this.liveDatas.remove(key);
        if (remove != null) {
            remove.detach();
        }
        this.flows.remove(key);
        return t;
    }

    public final <T> MutableLiveData<T> getLiveData(String key, T t) {
        o.LJIIIZ(key, "key");
        return getLiveDataInternal(key, true, t);
    }

    public final <T> InterfaceC71762rk<T> getStateFlow(String key, T t) {
        o.LJIIIZ(key, "key");
        Map<String, C33R<Object>> map = this.flows;
        C33R<Object> c33r = map.get(key);
        if (c33r == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, t);
            }
            c33r = V8H.LIZ(this.regular.get(key));
            this.flows.put(key, c33r);
            map.put(key, c33r);
        }
        return V1M.LIZLLL(c33r);
    }

    public final <T> void set(String key, T t) {
        SavingStateLiveData<?> savingStateLiveData;
        o.LJIIIZ(key, "key");
        if (Companion.validateValue(t)) {
            SavingStateLiveData<?> savingStateLiveData2 = this.liveDatas.get(key);
            if ((savingStateLiveData2 instanceof MutableLiveData) && (savingStateLiveData = savingStateLiveData2) != null) {
                savingStateLiveData.setValue(t);
            } else {
                this.regular.put(key, t);
            }
            C33R<Object> c33r = this.flows.get(key);
            if (c33r == null) {
                return;
            }
            c33r.setValue(t);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Can't put value with type ");
        o.LJI(t);
        LIZ.append(t.getClass());
        LIZ.append(" into saved state");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public final void setSavedStateProvider(String key, AnonymousClass106 provider) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(provider, "provider");
        this.savedStateProviders.put(key, provider);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z, T t) {
        SavingStateLiveData<?> savingStateLiveData;
        SavingStateLiveData<?> savingStateLiveData2;
        SavingStateLiveData<?> savingStateLiveData3 = this.liveDatas.get(str);
        if ((savingStateLiveData3 instanceof MutableLiveData) && (savingStateLiveData2 = savingStateLiveData3) != null) {
            return savingStateLiveData2;
        }
        if (this.regular.containsKey(str)) {
            savingStateLiveData = new SavingStateLiveData<>(this, str, this.regular.get(str));
        } else if (z) {
            this.regular.put(str, t);
            savingStateLiveData = new SavingStateLiveData<>(this, str, t);
        } else {
            savingStateLiveData = new SavingStateLiveData<>(this, str);
        }
        this.liveDatas.put(str, savingStateLiveData);
        return savingStateLiveData;
    }
}
