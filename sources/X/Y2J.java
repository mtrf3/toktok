package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public final class Y2J implements Y3P {
    public final List<InterfaceC54035LIp> LIZ = new ArrayList();

    @Override // X.Y3P
    public final List<InterfaceC54035LIp> LIZ(List<? extends Class<? extends InterfaceC60152Xr>> list) {
        List<InterfaceC54035LIp> list2 = this.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list2).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (ORZ.LJLJJI(next.getClass(), list)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final void LIZIZ(InterfaceC54035LIp interfaceC54035LIp) {
        if (interfaceC54035LIp != null) {
            ((ArrayList) this.LIZ).add(interfaceC54035LIp);
        }
    }
}
