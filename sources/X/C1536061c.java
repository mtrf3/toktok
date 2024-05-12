package X;

import androidx.lifecycle.MutableLiveData;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.61c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1536061c extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<Integer, ? extends MutableLiveData<Boolean>>> {
    public static final C1536061c LJLIL = new C1536061c();

    public C1536061c() {
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
