package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes16.dex */
public final class XM4 extends XM6 {
    public static final Class LIZJ = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // X.XM6
    public final void LIZ(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) C87167YIx.LJIIIZ(j, obj);
        if (list instanceof XM3) {
            unmodifiableList = ((XM3) list).LJ();
        } else {
            if (LIZJ.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC84688XLo) && (list instanceof XM7)) {
                XM7 xm7 = (XM7) list;
                if (xm7.LIZIZ()) {
                    xm7.LIZ();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C87167YIx.LJIILIIL(j, obj, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.XM6
    public final void LIZIZ(long j, Object obj, Object obj2) {
        XM2 xm2;
        List list = (List) C87167YIx.LJIIIZ(j, obj2);
        int size = list.size();
        List list2 = (List) C87167YIx.LJIIIZ(j, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof XM3) {
                list2 = new XM2(size);
            } else if ((list2 instanceof InterfaceC84688XLo) && (list2 instanceof XM7)) {
                list2 = ((XM7) list2).LJIJI(size);
            } else {
                list2 = new ArrayList(size);
            }
            C87167YIx.LJIILIIL(j, obj, list2);
        } else {
            if (LIZJ.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                C87167YIx.LJIILIIL(j, obj, arrayList);
                xm2 = arrayList;
            } else if (list2 instanceof XM1) {
                XM2 xm22 = new XM2(list2.size() + size);
                xm22.addAll(xm22.size(), list2);
                C87167YIx.LJIILIIL(j, obj, xm22);
                xm2 = xm22;
            } else if ((list2 instanceof InterfaceC84688XLo) && (list2 instanceof XM7)) {
                XM7 xm7 = (XM7) list2;
                if (!xm7.LIZIZ()) {
                    list2 = xm7.LJIJI(list2.size() + size);
                    C87167YIx.LJIILIIL(j, obj, list2);
                }
            }
            list2 = xm2;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0) {
            if (size3 > 0) {
                list2.addAll(list);
            }
            list = list2;
        }
        C87167YIx.LJIILIIL(j, obj, list);
    }
}
