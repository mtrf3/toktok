package androidx.lifecycle;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class LiveDataKt {
    public static final <T> Observer<T> observe(LiveData<T> observe, LifecycleOwner owner, final InterfaceC88472Yns<? super T, C76800UCe> onChanged) {
        o.LJIIJ(observe, "$this$observe");
        o.LJIIJ(owner, "owner");
        o.LJIIJ(onChanged, "onChanged");
        Observer<T> observer = new Observer<T>() { // from class: androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t) {
                InterfaceC88472Yns.this.invoke(t);
            }
        };
        observe.observe(owner, observer);
        return observer;
    }
}
