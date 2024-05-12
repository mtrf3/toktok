package X;

import androidx.lifecycle.MutableLiveData;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.61P, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C61P extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<Integer, ? extends MutableLiveData<Boolean>>> {
    public static final C61P LJLIL = new C61P();

    public C61P() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<Integer, ? extends MutableLiveData<Boolean>> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Integer> it = C1536461g.LJII.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(Integer.valueOf(it.next().intValue()), new MutableLiveData());
        }
        return C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap);
    }
}
