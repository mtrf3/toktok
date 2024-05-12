package dmt.av.video;

import X.InterfaceC143745kY;
import Y.AObserverS66S0200000_2;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;

/* loaded from: classes3.dex */
public class StoredLiveData<T> extends MutableLiveData<T> {
    public T mOldValue;

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        super.setValue(t);
        this.mOldValue = t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observe$0(InterfaceC143745kY interfaceC143745kY, Object obj) {
        interfaceC143745kY.LIZ(this.mOldValue, obj);
    }

    public void observe(LifecycleOwner lifecycleOwner, InterfaceC143745kY<T> interfaceC143745kY) {
        super.observe(lifecycleOwner, new AObserverS66S0200000_2(this, interfaceC143745kY, 2));
    }
}
