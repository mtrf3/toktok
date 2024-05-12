package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.aHB, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92837aHB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ C92220a7E LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92837aHB(C92220a7E c92220a7E) {
        super(0);
        this.LJLIL = c92220a7E;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        Collection values = ((LinkedHashMap) this.LJLIL.LIZIZ).values();
        ArrayList arrayList = new ArrayList(C32I.LJJL(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC91938a2g) it.next()).LIZLLL());
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((C91941a2j) ((InterfaceC24760y8) it2.next()).getValue()).LIZ) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
