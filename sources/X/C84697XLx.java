package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.XLx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84697XLx extends AbstractC84699XLz {
    public static final Class<?> LIZJ = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // X.AbstractC84699XLz
    public final void LIZIZ(long j, YIO yio) {
        Object unmodifiableList;
        List list = (List) C87166YIw.LJIIZILJ(j, yio);
        if (list instanceof InterfaceC84696XLw) {
            unmodifiableList = ((InterfaceC84696XLw) list).LJJIIJZLJL();
        } else {
            if (LIZJ.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC84681XLh) && (list instanceof InterfaceC84678XLe)) {
                InterfaceC84678XLe interfaceC84678XLe = (InterfaceC84678XLe) list;
                if (interfaceC84678XLe.LJJJJJL()) {
                    interfaceC84678XLe.LJJJI();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C87166YIw.LIZIZ(j, yio, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC84699XLz
    public final void LIZ(long j, Object obj, Object obj2) {
        C84691XLr c84691XLr;
        List list = (List) C87166YIw.LJIIZILJ(j, obj2);
        int size = list.size();
        List list2 = (List) C87166YIw.LJIIZILJ(j, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC84696XLw) {
                list2 = new C84691XLr(size);
            } else if ((list2 instanceof InterfaceC84681XLh) && (list2 instanceof InterfaceC84678XLe)) {
                list2 = ((InterfaceC84678XLe) list2).LJJIL(size);
            } else {
                list2 = new ArrayList(size);
            }
            C87166YIw.LIZIZ(j, obj, list2);
        } else {
            if (LIZJ.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                C87166YIw.LIZIZ(j, obj, arrayList);
                c84691XLr = arrayList;
            } else if (list2 instanceof C84692XLs) {
                C84691XLr c84691XLr2 = new C84691XLr(list2.size() + size);
                c84691XLr2.addAll(list2);
                C87166YIw.LIZIZ(j, obj, c84691XLr2);
                c84691XLr = c84691XLr2;
            } else if ((list2 instanceof InterfaceC84681XLh) && (list2 instanceof InterfaceC84678XLe)) {
                InterfaceC84678XLe interfaceC84678XLe = (InterfaceC84678XLe) list2;
                if (!interfaceC84678XLe.LJJJJJL()) {
                    list2 = interfaceC84678XLe.LJJIL(list2.size() + size);
                    C87166YIw.LIZIZ(j, obj, list2);
                }
            }
            list2 = c84691XLr;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0) {
            if (size3 > 0) {
                list2.addAll(list);
            }
            list = list2;
        }
        C87166YIw.LIZIZ(j, obj, list);
    }
}
