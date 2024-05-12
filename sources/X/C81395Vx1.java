package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Vx1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81395Vx1 implements InterfaceC81391Vwx {
    public final List<InterfaceC81391Vwx> LIZ;

    public C81395Vx1(InterfaceC81391Vwx... interfaceC81391VwxArr) {
        ArrayList arrayList = new ArrayList(interfaceC81391VwxArr.length);
        this.LIZ = arrayList;
        Collections.addAll(arrayList, interfaceC81391VwxArr);
    }

    public final synchronized void LIZIZ(InterfaceC81391Vwx interfaceC81391Vwx) {
        ((ArrayList) this.LIZ).add(interfaceC81391Vwx);
    }

    @Override // X.InterfaceC81391Vwx
    public final synchronized void LIZ(int i, String str, boolean z) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC81391Vwx interfaceC81391Vwx = (InterfaceC81391Vwx) ((ArrayList) this.LIZ).get(i2);
            if (interfaceC81391Vwx != null) {
                try {
                    interfaceC81391Vwx.LIZ(i, str, z);
                } catch (Exception e) {
                    W58.LJII("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", e);
                }
            }
        }
    }
}
