package X;

import Y.AObserverS70S0100000_2;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8VA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8VA {
    public final C8VA LIZ;
    public final java.util.Map<C62582cw, C8V9> LIZIZ;
    public final java.util.Map<C62582cw, MutableLiveData<? extends InterfaceC198557ql>> LIZJ;

    public C8VA() {
        this(null);
    }

    public C8VA(C8VA c8va) {
        this.LIZ = c8va;
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = new LinkedHashMap();
    }

    public final <DATA extends InterfaceC198557ql> DATA LIZ(Class<? extends C8VB<DATA>> cls, String str) {
        InterfaceC198557ql interfaceC198557ql;
        C62582cw c62582cw = new C62582cw(cls, str);
        for (C8VA c8va = this; c8va != null; c8va = c8va.LIZ) {
            if (c8va.LIZJ.containsKey(c62582cw)) {
                LiveData liveData = (LiveData) ((LinkedHashMap) c8va.LIZJ).get(c62582cw);
                if (liveData != null) {
                    interfaceC198557ql = (InterfaceC198557ql) liveData.getValue();
                } else {
                    interfaceC198557ql = null;
                }
                if (!(interfaceC198557ql instanceof InterfaceC198557ql)) {
                    return null;
                }
                return (DATA) interfaceC198557ql;
            }
        }
        return null;
    }

    public final <SERVICE extends C8VB<?>> SERVICE LIZIZ(Class<SERVICE> cls, String str) {
        C62582cw c62582cw = new C62582cw(cls, str);
        for (C8VA c8va = this; c8va != null; c8va = c8va.LIZ) {
            if (c8va.LIZIZ.containsKey(c62582cw)) {
                Object obj = ((LinkedHashMap) c8va.LIZIZ).get(c62582cw);
                o.LJII(obj, "null cannot be cast to non-null type SERVICE of com.bytedance.assem.arch.core.AssemServiceStore.getService");
                return (SERVICE) obj;
            }
        }
        return null;
    }

    public final <SERVICE extends C8V9> SERVICE LIZJ(Class<SERVICE> cls, String str) {
        C62582cw c62582cw = new C62582cw(cls, str);
        for (C8VA c8va = this; c8va != null; c8va = c8va.LIZ) {
            if (c8va.LIZIZ.containsKey(c62582cw)) {
                Object obj = ((LinkedHashMap) c8va.LIZIZ).get(c62582cw);
                o.LJII(obj, "null cannot be cast to non-null type SERVICE of com.bytedance.assem.arch.core.AssemServiceStore.getService");
                return (SERVICE) obj;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(Class<?> cls, C8V9 assemService) {
        o.LJIIIZ(assemService, "assemService");
        if (!o.LJ(cls, C8V9.class) && !o.LJ(cls, C8VB.class)) {
            C62582cw c62582cw = new C62582cw(cls, assemService.serviceKey());
            if (this.LIZIZ.containsKey(c62582cw) && assemService != ((LinkedHashMap) this.LIZIZ).get(c62582cw)) {
                if (!C214368bA.LIZ) {
                    this.LIZIZ.remove(c62582cw);
                    this.LIZJ.remove(c62582cw);
                    C8V7 c8v7 = C214368bA.LIZIZ;
                    if (c8v7 != null) {
                        StringBuilder LIZIZ = C770830u.LIZIZ("(service=", cls, ", serviceKey =");
                        LIZIZ.append(assemService.serviceKey());
                        LIZIZ.append(") has been already registered on service store. the service real instance is ");
                        LIZIZ.append(assemService);
                        LIZIZ.append(", the registered service real instance is ");
                        LIZIZ.append(((LinkedHashMap) this.LIZIZ).get(c62582cw));
                        LIZIZ.append(", currentMap info is ");
                        LIZIZ.append(this.LIZIZ);
                        c8v7.LIZ(new IllegalStateException(), X1D.LIZIZ(LIZIZ));
                    }
                } else {
                    StringBuilder LIZIZ2 = C770830u.LIZIZ("(service=", cls, ", serviceKey =");
                    LIZIZ2.append(assemService.serviceKey());
                    LIZIZ2.append(") has been already registered on service store. the service real instance is ");
                    LIZIZ2.append(assemService);
                    LIZIZ2.append(", the registered service real instance is ");
                    LIZIZ2.append(((LinkedHashMap) this.LIZIZ).get(c62582cw));
                    throw new IllegalStateException(X1D.LIZIZ(LIZIZ2));
                }
            }
            this.LIZIZ.put(c62582cw, assemService);
            if (assemService instanceof C8VB) {
                InterfaceC198557ql defaultObservableData = ((C8VB) assemService).defaultObservableData();
                LiveData liveData = (LiveData) ((LinkedHashMap) this.LIZJ).get(c62582cw);
                if (liveData == null) {
                    liveData = new MutableLiveData();
                    this.LIZJ.put(c62582cw, liveData);
                }
                if (liveData.getValue() == null) {
                    if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                        liveData.setValue(defaultObservableData);
                        return;
                    } else {
                        liveData.postValue(defaultObservableData);
                        return;
                    }
                }
                return;
            }
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('{');
        LIZ.append(cls);
        LIZ.append(" - ");
        LIZ.append(assemService);
        LIZ.append("}: AssemService or AssemObservableService can't be registered directly, use subclass instead");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public final void LJ(Class<?> cls, C8V9 c8v9) {
        C62582cw c62582cw = new C62582cw(cls, c8v9.serviceKey());
        this.LIZIZ.remove(c62582cw);
        if (c8v9 instanceof C8VB) {
            this.LIZJ.remove(c62582cw);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI(Class cls, InterfaceC88472Yns reducer) {
        C8V9 c8v9;
        o.LJIIIZ(reducer, "reducer");
        Object obj = null;
        C62582cw c62582cw = new C62582cw(cls, null);
        for (C8VA c8va = this; c8va != null; c8va = c8va.LIZ) {
            if (c8va.LIZIZ.containsKey(c62582cw)) {
                java.util.Map<C62582cw, MutableLiveData<? extends InterfaceC198557ql>> map = c8va.LIZJ;
                if (map.containsKey(c62582cw)) {
                    LiveData liveData = (LiveData) ((LinkedHashMap) map).get(c62582cw);
                    if (liveData == null) {
                        liveData = new MutableLiveData();
                        map.put(c62582cw, liveData);
                    }
                    Object value = liveData.getValue();
                    if (value == null && (c8v9 = (C8V9) ((LinkedHashMap) c8va.LIZIZ).get(c62582cw)) != null && (c8v9 instanceof C8VB)) {
                        value = ((C8VB) c8v9).defaultObservableData();
                    }
                    if (value instanceof InterfaceC198557ql) {
                        obj = value;
                    }
                    Object invoke = reducer.invoke(obj);
                    if (value != null && !value.equals(invoke)) {
                        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                            liveData.setValue(invoke);
                            return;
                        } else {
                            liveData.postValue(invoke);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    public final void LJFF(LifecycleOwner lifecycleOwner, Class cls, final InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        C62582cw c62582cw = new C62582cw(cls, null);
        for (C8VA c8va = this; c8va != null; c8va = c8va.LIZ) {
            if (c8va.LIZIZ.containsKey(c62582cw)) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) c8va.LIZJ;
                LiveData liveData = (LiveData) linkedHashMap.get(c62582cw);
                if (linkedHashMap.containsKey(c62582cw) && liveData == null) {
                    liveData = new MutableLiveData();
                    linkedHashMap.put(c62582cw, liveData);
                }
                if ((liveData instanceof LiveData) && liveData != null) {
                    Transformations.map(liveData, new C14Q() { // from class: X.8VD
                        @Override // X.C14Q
                        public final /* synthetic */ Object apply(Object obj) {
                            return InterfaceC88472Yns.this.invoke(obj);
                        }
                    }).observe(lifecycleOwner, new AObserverS70S0100000_2(interfaceC88472Yns2, 14));
                    return;
                }
                return;
            }
        }
    }
}
