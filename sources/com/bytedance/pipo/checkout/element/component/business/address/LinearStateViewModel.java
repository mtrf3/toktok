package com.bytedance.pipo.checkout.element.component.business.address;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.lifecycle.ViewModel;
import java.util.List;
import java.util.Map;

/* loaded from: classes20.dex */
public abstract class LinearStateViewModel<T, K> extends ViewModel {
    public abstract ParcelableSnapshotMutableState gv0();

    public abstract Map<T, K> hv0();

    public abstract List<T> iv0();

    public final void jv0(K k) {
        hv0().put(gv0().getValue(), k);
    }

    public final void kv0(T t) {
        if (iv0().contains(t)) {
            gv0().setValue(t);
        }
    }
}
