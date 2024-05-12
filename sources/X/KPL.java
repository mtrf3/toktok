package X;

import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes9.dex */
public interface KPL extends InterfaceC212848Wy<C3C8>, C8YM<C3C8>, C8YZ, LifecycleOwner, C3C8 {
    LifecycleOwner getActualLifecycleOwner();

    C8YZ getActualLifecycleOwnerHolder();

    @Override // X.InterfaceC212848Wy
    C3C8 getActualReceiver();

    InterfaceC212848Wy<C3C8> getActualReceiverHolder();

    LifecycleOwner getHostLifecycleOwner();

    LifecycleOwner getOwnLifecycleOwner();

    C3C8 getReceiverForHostVM();
}
