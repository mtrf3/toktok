package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Etp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37881Etp implements InterfaceC37882Etq {
    public final List<InterfaceC37882Etq> LIZ;

    public C37881Etp() {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        arrayList.add(new C37880Eto());
        arrayList.add(new C37879Etn());
        arrayList.add(new C37883Etr());
    }

    @Override // X.InterfaceC37882Etq
    public final Boolean LIZ(C37955Ev1 call) {
        o.LJIIJ(call, "call");
        Boolean bool = Boolean.FALSE;
        Iterator<InterfaceC37882Etq> it = this.LIZ.iterator();
        while (it.hasNext()) {
            Boolean LIZ = it.next().LIZ(call);
            Boolean bool2 = Boolean.TRUE;
            if (o.LJ(LIZ, bool2)) {
                return bool2;
            }
            if (LIZ == null) {
                bool = null;
            }
        }
        return bool;
    }
}
