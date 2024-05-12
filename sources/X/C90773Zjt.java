package X;

import java.util.List;

/* renamed from: X.Zjt, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90773Zjt extends AbstractC90235ZbD {
    @Override // X.AbstractC90235ZbD
    public final void LIZ(long j, Object obj) {
        ((InterfaceC90352Zd6) C90376ZdU.LJIIIZ(j, obj)).LIZ();
    }

    @Override // X.AbstractC90235ZbD
    public final void LIZIZ(long j, Object obj, Object obj2) {
        InterfaceC90352Zd6 interfaceC90352Zd6 = (InterfaceC90352Zd6) C90376ZdU.LJIIIZ(j, obj);
        List list = (List) C90376ZdU.LJIIIZ(j, obj2);
        int size = interfaceC90352Zd6.size();
        int size2 = list.size();
        if (size > 0) {
            if (size2 > 0) {
                if (!interfaceC90352Zd6.LIZIZ()) {
                    interfaceC90352Zd6 = interfaceC90352Zd6.LJIILL(size2 + size);
                }
                interfaceC90352Zd6.addAll(list);
            }
            list = interfaceC90352Zd6;
        }
        C90376ZdU.LJIILIIL(j, obj, list);
    }
}
