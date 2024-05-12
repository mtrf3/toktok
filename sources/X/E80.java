package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class E80 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<Integer, List<? extends String>>> {
    public final /* synthetic */ L8I LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E80(L8I l8i) {
        super(0);
        this.LJLIL = l8i;
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<Integer, List<? extends String>> invoke() {
        this.LJLIL.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) C53803L9r.LIZ).entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(C32I.LJJL(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String key2 = ((EnumC53808L9w) it.next()).getKey();
                if (key2 != null) {
                    arrayList.add(key2);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalStateException("Required value was null.");
                }
            }
            linkedHashMap.put(key, arrayList);
        }
        return linkedHashMap;
    }
}
