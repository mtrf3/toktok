package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Of3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62445Of3 {
    public static void LIZ(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() instanceof C85143Vu) {
                if (i == -1) {
                    return;
                }
                Object LJLLLLLL = ORZ.LJLLLLLL(i, list);
                if (!(LJLLLLLL instanceof C85143Vu) || LJLLLLLL == null) {
                    return;
                }
                Iterator it2 = list.iterator();
                int i2 = 0;
                boolean z = true;
                boolean z2 = true;
                boolean z3 = true;
                int i3 = -1;
                int i4 = -1;
                while (it2.hasNext()) {
                    int i5 = i2 + 1;
                    InterfaceC62486Ofi interfaceC62486Ofi = (InterfaceC62486Ofi) it2.next();
                    if (o.LJ(interfaceC62486Ofi.key(), "duet")) {
                        z2 = interfaceC62486Ofi.enable();
                        i3 = i2;
                    }
                    if (o.LJ(interfaceC62486Ofi.key(), "stitch")) {
                        z3 = interfaceC62486Ofi.enable();
                        i4 = i2;
                    }
                    if (o.LJ(interfaceC62486Ofi.key(), "create_sticker")) {
                        z = interfaceC62486Ofi.enable();
                    }
                    i2 = i5;
                }
                if (C113644d6.LIZ() == 1) {
                    if (z && !z2 && !z3) {
                        list.remove(LJLLLLLL);
                        ListProtector.add(list, i3, LJLLLLLL);
                        return;
                    }
                    return;
                }
                if (C113644d6.LIZ() != 2) {
                    return;
                }
                if (!z) {
                    if (!z2) {
                        if (z3) {
                            return;
                        }
                    } else {
                        if (z3) {
                            return;
                        }
                        list.remove(LJLLLLLL);
                        ListProtector.add(list, i4, LJLLLLLL);
                        return;
                    }
                }
                if (i3 == -1) {
                    if (i4 == -1) {
                        return;
                    } else {
                        i3 = i4;
                    }
                }
                list.remove(LJLLLLLL);
                ListProtector.add(list, i3, LJLLLLLL);
                return;
            }
            i++;
        }
    }

    public static void LIZIZ(List list) {
        if (!C19N.LJ("enable_compliance_biz_monitor", true)) {
            return;
        }
        Iterator it = list.iterator();
        int i = 0;
        InterfaceC62486Ofi interfaceC62486Ofi = null;
        int i2 = 0;
        int i3 = 2;
        while (it.hasNext()) {
            int i4 = i + 1;
            InterfaceC62486Ofi interfaceC62486Ofi2 = (InterfaceC62486Ofi) it.next();
            if (o.LJ(interfaceC62486Ofi2.key(), "live_photo") && interfaceC62486Ofi2.enable()) {
                interfaceC62486Ofi = interfaceC62486Ofi2;
            }
            if ((o.LJ(interfaceC62486Ofi2.key(), "duet") || o.LJ(interfaceC62486Ofi2.key(), "stitch")) && !interfaceC62486Ofi2.enable()) {
                i3--;
                if (i2 == 0) {
                    i2 = i;
                }
            }
            i = i4;
        }
        if (interfaceC62486Ofi != null && i3 == 0) {
            list.remove(interfaceC62486Ofi);
            ListProtector.add(list, i2, interfaceC62486Ofi);
        }
    }
}
