package X;

import java.util.List;

/* renamed from: X.XLy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84698XLy extends AbstractC84699XLz {
    @Override // X.AbstractC84699XLz
    public final void LIZIZ(long j, YIO yio) {
        ((InterfaceC84678XLe) C87166YIw.LJIIZILJ(j, yio)).LJJJI();
    }

    @Override // X.AbstractC84699XLz
    public final void LIZ(long j, Object obj, Object obj2) {
        InterfaceC84678XLe interfaceC84678XLe = (InterfaceC84678XLe) C87166YIw.LJIIZILJ(j, obj);
        List list = (List) C87166YIw.LJIIZILJ(j, obj2);
        int size = interfaceC84678XLe.size();
        int size2 = list.size();
        if (size > 0) {
            if (size2 > 0) {
                if (!interfaceC84678XLe.LJJJJJL()) {
                    interfaceC84678XLe = interfaceC84678XLe.LJJIL(size2 + size);
                }
                interfaceC84678XLe.addAll(list);
            }
            list = interfaceC84678XLe;
        }
        C87166YIw.LIZIZ(j, obj, list);
    }
}
