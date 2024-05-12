package X;

import androidx.lifecycle.MutableLiveData;

/* renamed from: X.75A, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C75A extends AbstractC65781Prl implements InterfaceC65784Pro<MutableLiveData<Integer>> {
    public static final C75A LJLIL = new C75A();

    public C75A() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final MutableLiveData<Integer> invoke() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(1);
        return mutableLiveData;
    }
}
