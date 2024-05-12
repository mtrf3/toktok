package X;

import androidx.lifecycle.MutableLiveData;
import java.util.HashMap;

/* renamed from: X.7W8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7W8 extends AbstractC65781Prl implements InterfaceC65784Pro<MutableLiveData<HashMap<Long, String>>> {
    public static final C7W8 LJLIL = new C7W8();

    public C7W8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final MutableLiveData<HashMap<Long, String>> invoke() {
        MutableLiveData<HashMap<Long, String>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new HashMap<>());
        return mutableLiveData;
    }
}
