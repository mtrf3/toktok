package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Zjn, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90767Zjn extends AbstractC90235ZbD {
    public static final Class<?> LIZJ = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // X.AbstractC90235ZbD
    public final void LIZ(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) C90376ZdU.LJIIIZ(j, obj);
        if (list instanceof InterfaceC90398Zdq) {
            unmodifiableList = ((InterfaceC90398Zdq) list).LIZLLL();
        } else {
            if (LIZJ.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC90366ZdK) && (list instanceof InterfaceC90352Zd6)) {
                InterfaceC90352Zd6 interfaceC90352Zd6 = (InterfaceC90352Zd6) list;
                if (interfaceC90352Zd6.LIZIZ()) {
                    interfaceC90352Zd6.LIZ();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C90376ZdU.LJIILIIL(j, obj, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC90235ZbD
    public final void LIZIZ(long j, Object obj, Object obj2) {
        C90900Zlw c90900Zlw;
        List list = (List) C90376ZdU.LJIIIZ(j, obj2);
        int size = list.size();
        List list2 = (List) C90376ZdU.LJIIIZ(j, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC90398Zdq) {
                list2 = new C90900Zlw(size);
            } else if ((list2 instanceof InterfaceC90366ZdK) && (list2 instanceof InterfaceC90352Zd6)) {
                list2 = ((InterfaceC90352Zd6) list2).LJIILL(size);
            } else {
                list2 = new ArrayList(size);
            }
            C90376ZdU.LJIILIIL(j, obj, list2);
        } else {
            if (LIZJ.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                C90376ZdU.LJIILIIL(j, obj, arrayList);
                c90900Zlw = arrayList;
            } else if (list2 instanceof C90727Zj9) {
                C90900Zlw c90900Zlw2 = new C90900Zlw(list2.size() + size);
                c90900Zlw2.addAll(c90900Zlw2.size(), list2);
                C90376ZdU.LJIILIIL(j, obj, c90900Zlw2);
                c90900Zlw = c90900Zlw2;
            } else if ((list2 instanceof InterfaceC90366ZdK) && (list2 instanceof InterfaceC90352Zd6)) {
                InterfaceC90352Zd6 interfaceC90352Zd6 = (InterfaceC90352Zd6) list2;
                if (!interfaceC90352Zd6.LIZIZ()) {
                    list2 = interfaceC90352Zd6.LJIILL(list2.size() + size);
                    C90376ZdU.LJIILIIL(j, obj, list2);
                }
            }
            list2 = c90900Zlw;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0) {
            if (size3 > 0) {
                list2.addAll(list);
            }
            list = list2;
        }
        C90376ZdU.LJIILIIL(j, obj, list);
    }
}
