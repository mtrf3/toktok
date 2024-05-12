package com.bytedance.ies.sdk.datachannel;

import X.C09G;
import X.C47261Igj;
import X.C76800UCe;
import X.InterfaceC32539Cpr;
import X.InterfaceC32549Cq1;
import X.InterfaceC88472Yns;
import X.ORZ;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DataChannelGlobal extends BaseDataChannel implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public static final DataChannelGlobal LJLJJI = new DataChannelGlobal();
    public static final Map<WeakReference<LifecycleOwner>, List<WeakReference<Object>>> LJLJJL = new ConcurrentHashMap();
    public static final List<Class<?>> LJLJJLL = new ArrayList();
    public static boolean LJLJL;
    public static boolean LJLJLJ;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C09G.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C09G.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    @Override // com.bytedance.ies.sdk.datachannel.BaseDataChannel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((ConcurrentHashMap) this.LJLIL).clear();
        ((HashMap) this.LJLILLLLZI).clear();
    }

    public final void kv0(Class cls) {
        ArrayList arrayList = (ArrayList) LJLJJLL;
        if (!arrayList.contains(cls)) {
            arrayList.add(cls);
        }
    }

    public final <T extends InterfaceC32539Cpr<O>, O> O mv0(Class<T> cls) {
        return (O) ((InterfaceC32549Cq1) gv0(cls)).getValue();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        Object obj = null;
        for (Map.Entry entry : ((ConcurrentHashMap) LJLJJL).entrySet()) {
            if (o.LJ(((Reference) entry.getKey()).get(), owner)) {
                Iterator it = ((Iterable) entry.getValue()).iterator();
                while (it.hasNext()) {
                    Object obj2 = ((Reference) it.next()).get();
                    if (obj2 != null) {
                        DataChannelGlobal dataChannelGlobal = LJLJJI;
                        dataChannelGlobal.getClass();
                        dataChannelGlobal.jv0(obj2);
                    }
                }
                obj = entry.getKey();
            }
        }
        if (obj != null) {
            ((ConcurrentHashMap) LJLJJL).remove(obj);
        }
    }

    public final <T extends GlobalEvent<C76800UCe>> void rv0(Class<T> cls) {
        if (hv0()) {
            ((LiveData) gv0(cls)).postValue(C76800UCe.LIZ);
        } else {
            ((LiveData) gv0(cls)).setValue(C76800UCe.LIZ);
        }
    }

    public final void lv0(LifecycleOwner lifecycleOwner, Object obj) {
        if (LJLJL) {
            Iterator it = ((ArrayList) LJLJJLL).iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isAssignableFrom(lifecycleOwner.getClass())) {
                    return;
                }
            }
            if (!lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.INITIALIZED)) {
                return;
            }
            boolean z = false;
            for (Map.Entry entry : ((ConcurrentHashMap) LJLJJL).entrySet()) {
                if (o.LJ(((Reference) entry.getKey()).get(), lifecycleOwner)) {
                    List list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (o.LJ(((Reference) obj2).get(), obj)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (ORZ.LJLLLLLL(0, arrayList) == null) {
                        ((List) entry.getValue()).add(new WeakReference(obj));
                    }
                    z = true;
                }
            }
            if (z) {
                return;
            }
            lifecycleOwner.getLifecycle().addObserver(this);
            ((ConcurrentHashMap) LJLJJL).put(new WeakReference(lifecycleOwner), C47261Igj.LJJIJIL(new WeakReference(obj)));
        }
    }

    public final <T extends GlobalEvent<O>, O> void sv0(Class<T> cls, O o) {
        if (hv0()) {
            ((LiveData) gv0(cls)).postValue(o);
        } else {
            ((LiveData) gv0(cls)).setValue(o);
        }
    }

    public final <T extends GlobalChannel<O>, O> void tv0(Class<T> cls, O o) {
        if (hv0()) {
            ((LiveData) gv0(cls)).postValue(o);
        } else {
            ((LiveData) gv0(cls)).setValue(o);
        }
    }

    public final void ov0(Class cls, Object observerOwner, InterfaceC88472Yns observer) {
        o.LJIIIZ(observerOwner, "observerOwner");
        o.LJIIIZ(observer, "observer");
        iv0(observerOwner, null, cls, false, observer);
    }

    public final void pv0(Class cls, Object observerOwner, InterfaceC88472Yns observer) {
        o.LJIIIZ(observerOwner, "observerOwner");
        o.LJIIIZ(observer, "observer");
        iv0(observerOwner, null, cls, true, observer);
    }

    public final <T extends NextLiveData<O>, O> void nv0(Object observerOwner, LifecycleOwner lifecycleOwner, Class<T> cls, InterfaceC88472Yns<? super O, C76800UCe> observer) {
        o.LJIIIZ(observerOwner, "observerOwner");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(observer, "observer");
        iv0(observerOwner, lifecycleOwner, cls, false, observer);
        lv0(lifecycleOwner, observerOwner);
    }

    public final <T extends NextLiveData<O>, O> void qv0(Object observerOwner, LifecycleOwner lifecycleOwner, Class<T> cls, InterfaceC88472Yns<? super O, C76800UCe> observer) {
        o.LJIIIZ(observerOwner, "observerOwner");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(observer, "observer");
        iv0(observerOwner, lifecycleOwner, cls, true, observer);
        lv0(lifecycleOwner, observerOwner);
    }
}
