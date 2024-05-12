package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MoL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57925MoL implements InterfaceC57861MnJ {
    public final InterfaceC65784Pro<C76800UCe> LIZ;
    public final String LIZIZ = "RemoveProcessor";

    public C57925MoL(C57946Mog c57946Mog) {
        this.LIZ = c57946Mog;
    }

    @Override // X.InterfaceC57861MnJ
    public final List<InterfaceC57927MoN> LIZ(C57850Mn8 c57850Mn8) {
        List<InterfaceC57927MoN> list = c57850Mn8.LIZ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC57927MoN interfaceC57927MoN : list) {
            InterfaceC57927MoN interfaceC57927MoN2 = interfaceC57927MoN;
            if (interfaceC57927MoN2.isRemoved()) {
                AYY ayy = AYY.LIZ;
                String str = this.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("element: ");
                LIZ.append(interfaceC57927MoN2.getElementId());
                LIZ.append(" is removed!");
                String LIZIZ = X1D.LIZIZ(LIZ);
                ayy.getClass();
                AYY.LIZIZ(str, LIZIZ);
            } else {
                arrayList.add(interfaceC57927MoN);
            }
        }
        return arrayList;
    }
}
