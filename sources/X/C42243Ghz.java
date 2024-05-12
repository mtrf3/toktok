package X;

import androidx.lifecycle.MutableLiveData;
import java.util.HashSet;

/* renamed from: X.Ghz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42243Ghz extends AbstractC65781Prl implements InterfaceC65784Pro<MutableLiveData<java.util.Set<Integer>>> {
    public static final C42243Ghz LJLIL = new C42243Ghz();

    public C42243Ghz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final MutableLiveData<java.util.Set<Integer>> invoke() {
        MutableLiveData<java.util.Set<Integer>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new HashSet());
        return mutableLiveData;
    }
}
