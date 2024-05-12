package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.2nv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69392nv extends F9E implements InterfaceC86772Y3s {
    public final HashMap<String, String> LJLIL;
    public final String LJLILLLLZI;
    public final Integer LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    @Override // X.InterfaceC86772Y3s
    public final Integer i() {
        return this.LJLJI;
    }

    public C69392nv(String targetLang, HashMap hashMap) {
        Object next;
        o.LJIIIZ(targetLang, "targetLang");
        this.LJLIL = hashMap;
        this.LJLILLLLZI = targetLang;
        ArrayList arrayList = new ArrayList(hashMap.size());
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((String) ((Map.Entry) it.next()).getValue()).length()));
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            while (it2.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() + ((Number) it2.next()).intValue());
            }
        }
        this.LJLJI = (Integer) next;
    }
}
