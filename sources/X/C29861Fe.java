package X;

import Y.IDObserverS9S0101000;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;

/* renamed from: X.1Fe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29861Fe<T> extends C0IB<T> {
    public final MutableLiveData<T> LIZ;

    @Override // X.C0IB
    public final T LIZ() {
        return this.LIZ.getValue();
    }

    public C29861Fe(T t) {
        MutableLiveData<T> mutableLiveData = new MutableLiveData<>();
        this.LIZ = mutableLiveData;
        mutableLiveData.setValue(t);
    }

    @Override // X.C0IB
    public final void LIZJ(InterfaceC29911Fj<T> interfaceC29911Fj) {
        this.LIZ.observeForever(interfaceC29911Fj);
    }

    @Override // X.C0IB
    public final void LJFF(InterfaceC29911Fj<T> interfaceC29911Fj) {
        this.LIZ.removeObserver(interfaceC29911Fj);
    }

    @Override // X.C0IB
    public final void LIZIZ(LifecycleOwner lifecycleOwner, InterfaceC29911Fj<T> interfaceC29911Fj) {
        this.LIZ.observe(lifecycleOwner, interfaceC29911Fj);
    }

    @Override // X.C0IB
    public final void LIZLLL(LifecycleOwner lifecycleOwner, InterfaceC29911Fj<T> interfaceC29911Fj) {
        this.LIZ.observe(lifecycleOwner, new IDObserverS9S0101000(0, interfaceC29911Fj, 1));
    }
}
