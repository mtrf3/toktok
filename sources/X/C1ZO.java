package X;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.1ZO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZO implements InterfaceC273215k {
    public final boolean LIZ;
    public final float LIZIZ;
    public final InterfaceC09420Yo LIZJ;

    public C1ZO(boolean z, float f, InterfaceC09420Yo paddingValues) {
        o.LJIIIZ(paddingValues, "paddingValues");
        this.LIZ = z;
        this.LIZIZ = f;
        this.LIZJ = paddingValues;
    }

    public static int LJI(List list, int i, InterfaceC88471Ynr interfaceC88471Ynr) {
        Object obj;
        int i2;
        int i3;
        int i4;
        for (Object obj2 : list) {
            if (o.LJ(C21640t6.LIZJ((InterfaceC274115t) obj2), "TextField")) {
                int intValue = ((Number) interfaceC88471Ynr.invoke(obj2, Integer.valueOf(i))).intValue();
                Iterator it = list.iterator();
                do {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    obj = it.next();
                } while (!o.LJ(C21640t6.LIZJ((InterfaceC274115t) obj), "Label"));
                int i5 = 0;
                if (obj != null) {
                    i2 = ((Number) interfaceC88471Ynr.invoke(obj, Integer.valueOf(i))).intValue();
                } else {
                    i2 = 0;
                }
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (o.LJ(C21640t6.LIZJ((InterfaceC274115t) next), "Trailing")) {
                        if (next != null) {
                            i3 = ((Number) interfaceC88471Ynr.invoke(next, Integer.valueOf(i))).intValue();
                        }
                    }
                }
                i3 = 0;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (o.LJ(C21640t6.LIZJ((InterfaceC274115t) next2), "Leading")) {
                        if (next2 != null) {
                            i4 = ((Number) interfaceC88471Ynr.invoke(next2, Integer.valueOf(i))).intValue();
                        }
                    }
                }
                i4 = 0;
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next3 = it4.next();
                    if (o.LJ(C21640t6.LIZJ((InterfaceC274115t) next3), "Hint")) {
                        if (next3 != null) {
                            i5 = ((Number) interfaceC88471Ynr.invoke(next3, Integer.valueOf(i))).intValue();
                        }
                    }
                }
                return Math.max(Math.max(intValue, Math.max(i2, i5)) + i4 + i3, C23360vs.LJIIIZ(C21640t6.LIZ));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // X.InterfaceC273215k
    public final int LIZ(AbstractC538029g abstractC538029g, List list, int i) {
        o.LJIIIZ(abstractC538029g, "<this>");
        return LJI(list, i, C527725h.LJLIL);
    }

    @Override // X.InterfaceC273215k
    public final int LIZIZ(AbstractC538029g abstractC538029g, List list, int i) {
        o.LJIIIZ(abstractC538029g, "<this>");
        return LJI(list, i, C24X.LJLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019a  */
    @Override // X.InterfaceC273215k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC273515n LIZJ(X.InterfaceC44861pS r40, java.util.List<? extends X.InterfaceC39071g7> r41, long r42) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ZO.LIZJ(X.1pS, java.util.List, long):X.15n");
    }

    @Override // X.InterfaceC273215k
    public final int LIZLLL(AbstractC538029g abstractC538029g, List list, int i) {
        o.LJIIIZ(abstractC538029g, "<this>");
        return LJFF(abstractC538029g, list, i, C527225c.LJLIL);
    }

    @Override // X.InterfaceC273215k
    public final int LJ(AbstractC538029g abstractC538029g, List list, int i) {
        o.LJIIIZ(abstractC538029g, "<this>");
        return LJFF(abstractC538029g, list, i, C528325n.LJLIL);
    }

    public final int LJFF(AbstractC538029g abstractC538029g, List list, int i, InterfaceC88471Ynr interfaceC88471Ynr) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        for (Object obj : list) {
            if (o.LJ(C21640t6.LIZJ((InterfaceC274115t) obj), "TextField")) {
                int intValue = ((Number) interfaceC88471Ynr.invoke(obj, Integer.valueOf(i))).intValue();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (o.LJ(C21640t6.LIZJ((InterfaceC274115t) next), "Label")) {
                        if (next != null) {
                            i2 = ((Number) interfaceC88471Ynr.invoke(next, Integer.valueOf(i))).intValue();
                        }
                    }
                }
                i2 = 0;
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (o.LJ(C21640t6.LIZJ((InterfaceC274115t) next2), "Trailing")) {
                        if (next2 != null) {
                            i3 = ((Number) interfaceC88471Ynr.invoke(next2, Integer.valueOf(i))).intValue();
                        }
                    }
                }
                i3 = 0;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next3 = it3.next();
                    if (o.LJ(C21640t6.LIZJ((InterfaceC274115t) next3), "Leading")) {
                        if (next3 != null) {
                            i4 = ((Number) interfaceC88471Ynr.invoke(next3, Integer.valueOf(i))).intValue();
                        }
                    }
                }
                i4 = 0;
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next4 = it4.next();
                    if (o.LJ(C21640t6.LIZJ((InterfaceC274115t) next4), "Hint")) {
                        if (next4 != null) {
                            i5 = ((Number) interfaceC88471Ynr.invoke(next4, Integer.valueOf(i))).intValue();
                        }
                    }
                }
                i5 = 0;
                if (i2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                return C21750tH.LIZJ(abstractC538029g.getDensity(), intValue, i2, i4, i3, i5, C21640t6.LIZ, this.LIZJ, z);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
