package com.bytedance.ies.sdk.datachannel;

import X.C16880lQ;
import X.C221108m2;
import X.C32667Crv;
import X.C32668Crw;
import X.C62822Ol8;
import X.C76800UCe;
import X.InterfaceC32540Cps;
import X.InterfaceC88472Yns;
import X.X1D;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class BaseDataChannel extends ViewModel {
    public final Map<Class<?>, InterfaceC32540Cps<?>> LJLIL = new ConcurrentHashMap();
    public final Map<Object, Map<Class<?>, C32668Crw<Object>>> LJLILLLLZI = new HashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C32667Crv.INSTANCE);

    public final boolean hv0() {
        if (C16880lQ.LLLLIIIILLL() != this.LJLJI.getValue()) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        ((ConcurrentHashMap) this.LJLIL).clear();
    }

    public final synchronized <T extends InterfaceC32540Cps<O>, O> T gv0(Class<T> clazz) {
        T it;
        o.LJIIIZ(clazz, "clazz");
        InterfaceC32540Cps interfaceC32540Cps = (InterfaceC32540Cps) ((ConcurrentHashMap) this.LJLIL).get(clazz);
        if (interfaceC32540Cps == null || (it = clazz.cast(interfaceC32540Cps)) == null) {
            try {
                try {
                    it = clazz.newInstance();
                    Map<Class<?>, InterfaceC32540Cps<?>> map = this.LJLIL;
                    o.LJIIIIZZ(it, "it");
                    ((ConcurrentHashMap) map).put(clazz, it);
                } catch (IllegalAccessException e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("class ");
                    LIZ.append(clazz);
                    LIZ.append(" init fail");
                    throw new RuntimeException(X1D.LIZIZ(LIZ), e);
                }
            } catch (InstantiationException e2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("class ");
                LIZ2.append(clazz);
                LIZ2.append(" init fail");
                throw new RuntimeException(X1D.LIZIZ(LIZ2), e2);
            }
        }
        return it;
    }

    public final void jv0(Object observerOwner) {
        o.LJIIIZ(observerOwner, "observerOwner");
        Map map = (Map) ((HashMap) this.LJLILLLLZI).remove(observerOwner);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object obj = (InterfaceC32540Cps) ((ConcurrentHashMap) this.LJLIL).get(entry.getKey());
                if (obj != null && (obj instanceof NextLiveData)) {
                    LiveData liveData = (LiveData) obj;
                    liveData.removeObserver((Observer) entry.getValue());
                    if (!liveData.hasObservers() && (((obj instanceof GlobalChannel) && !((GlobalChannel) obj).getKeepInMemory$live_datachannel_release()) || (obj instanceof Event))) {
                        ((ConcurrentHashMap) this.LJLIL).remove(entry.getKey());
                    }
                }
            }
        }
    }

    public final <T extends NextLiveData<O>, O> void iv0(Object observerOwner, LifecycleOwner lifecycleOwner, Class<T> clazz, boolean z, InterfaceC88472Yns<? super O, C76800UCe> observer) {
        Map map;
        C32668Crw observe;
        o.LJIIIZ(observerOwner, "observerOwner");
        o.LJIIIZ(clazz, "clazz");
        o.LJIIIZ(observer, "observer");
        if (!((HashMap) this.LJLILLLLZI).containsKey(observerOwner)) {
            ((HashMap) this.LJLILLLLZI).put(observerOwner, new HashMap());
        }
        Map map2 = (Map) ((HashMap) this.LJLILLLLZI).get(observerOwner);
        if ((map2 == null || !map2.containsKey(clazz)) && (map = (Map) ((HashMap) this.LJLILLLLZI).get(observerOwner)) != null) {
            NextLiveData nextLiveData = (NextLiveData) gv0(clazz);
            if (lifecycleOwner == null) {
                observe = nextLiveData.observeForever(observer, z);
            } else {
                observe = nextLiveData.observe(lifecycleOwner, observer, z);
            }
            o.LJII(observe, "null cannot be cast to non-null type com.bytedance.ies.sdk.datachannel.NextObserver<kotlin.Any?>");
            map.put(clazz, observe);
        }
    }
}
