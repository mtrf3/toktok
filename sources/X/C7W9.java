package X;

import androidx.lifecycle.MutableLiveData;

/* renamed from: X.7W9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7W9 extends AbstractC65781Prl implements InterfaceC65784Pro<MutableLiveData<Long>> {
    public static final C7W9 LJLIL = new C7W9();

    public C7W9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final MutableLiveData<Long> invoke() {
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Long.MIN_VALUE);
        return mutableLiveData;
    }
}
