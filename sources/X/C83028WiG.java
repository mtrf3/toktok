package X;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.WiG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83028WiG extends AbstractC83029WiH {
    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final void release() {
        String str;
        InterfaceC37790EsM interfaceC37790EsM = (InterfaceC37790EsM) LJII(InterfaceC37790EsM.class);
        if (interfaceC37790EsM == null || (str = interfaceC37790EsM.LIZ()) == null) {
            str = "";
        }
        for (Map.Entry entry : C72818Shy.LIZIZ().entrySet()) {
            for (C72820Si0 c72820Si0 : (Iterable) entry.getValue()) {
                if (o.LJ(c72820Si0.LIZ, str)) {
                    ((CopyOnWriteArrayList) entry.getValue()).remove(c72820Si0);
                }
            }
        }
    }
}
