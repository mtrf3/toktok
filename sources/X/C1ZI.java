package X;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.1ZI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZI implements InterfaceC273215k {
    public final InterfaceC88472Yns<C10430b1, C76800UCe> LIZ;
    public final boolean LIZIZ;
    public final float LIZJ;
    public final InterfaceC09420Yo LIZLLL;

    @Override // X.InterfaceC273215k
    public final int LIZ(AbstractC538029g abstractC538029g, List list, int i) {
        o.LJIIIZ(abstractC538029g, "<this>");
        return LJI(abstractC538029g, list, i, AnonymousClass252.LJLIL);
    }

    @Override // X.InterfaceC273215k
    public final int LIZIZ(AbstractC538029g abstractC538029g, List list, int i) {
        o.LJIIIZ(abstractC538029g, "<this>");
        return LJI(abstractC538029g, list, i, C25C.LJLIL);
    }

    @Override // X.InterfaceC273215k
    public final InterfaceC273515n LIZJ(InterfaceC44861pS measure, List<? extends InterfaceC39071g7> measurables, long j) {
        InterfaceC39071g7 interfaceC39071g7;
        AbstractC39201gK abstractC39201gK;
        InterfaceC39071g7 interfaceC39071g72;
        AbstractC39201gK abstractC39201gK2;
        boolean z;
        int i;
        InterfaceC39071g7 interfaceC39071g73;
        AbstractC39201gK abstractC39201gK3;
        InterfaceC39071g7 interfaceC39071g74;
        AbstractC39201gK abstractC39201gK4;
        int i2;
        int i3;
        InterfaceC273515n LJJLIL;
        o.LJIIIZ(measure, "$this$measure");
        o.LJIIIZ(measurables, "measurables");
        int LJJIJ = measure.LJJIJ(this.LIZLLL.LIZIZ());
        long LIZ = C23360vs.LIZ(j, 0, 0, 0, 0, 10);
        Iterator<? extends InterfaceC39071g7> it = measurables.iterator();
        while (true) {
            if (it.hasNext()) {
                interfaceC39071g7 = it.next();
                if (o.LJ(V1M.LJIJJLI(interfaceC39071g7), "Leading")) {
                    break;
                }
            } else {
                interfaceC39071g7 = null;
                break;
            }
        }
        InterfaceC39071g7 interfaceC39071g75 = interfaceC39071g7;
        if (interfaceC39071g75 != null) {
            abstractC39201gK = interfaceC39071g75.LJJJIL(LIZ);
        } else {
            abstractC39201gK = null;
        }
        int LJ = C21640t6.LJ(abstractC39201gK);
        Iterator<? extends InterfaceC39071g7> it2 = measurables.iterator();
        while (true) {
            if (it2.hasNext()) {
                interfaceC39071g72 = it2.next();
                if (o.LJ(V1M.LJIJJLI(interfaceC39071g72), "Trailing")) {
                    break;
                }
            } else {
                interfaceC39071g72 = null;
                break;
            }
        }
        InterfaceC39071g7 interfaceC39071g76 = interfaceC39071g72;
        if (interfaceC39071g76 != null) {
            abstractC39201gK2 = interfaceC39071g76.LJJJIL(C78555UsJ.LJJIJIIJIL(-LJ, 0, LIZ));
        } else {
            abstractC39201gK2 = null;
        }
        int LJ2 = C21640t6.LJ(abstractC39201gK2) + LJ;
        if (this.LIZJ < 1.0f) {
            z = true;
        } else {
            z = false;
        }
        int LJJIJ2 = measure.LJJIJ(this.LIZLLL.LIZ(measure.getLayoutDirection())) + measure.LJJIJ(this.LIZLLL.LIZJ(measure.getLayoutDirection()));
        if (z) {
            i = (-LJ2) - LJJIJ2;
        } else {
            i = -LJJIJ2;
        }
        int i4 = -LJJIJ;
        long LJJIJIIJIL = C78555UsJ.LJJIJIIJIL(i, i4, LIZ);
        Iterator<? extends InterfaceC39071g7> it3 = measurables.iterator();
        while (true) {
            if (it3.hasNext()) {
                interfaceC39071g73 = it3.next();
                if (o.LJ(V1M.LJIJJLI(interfaceC39071g73), "Label")) {
                    break;
                }
            } else {
                interfaceC39071g73 = null;
                break;
            }
        }
        InterfaceC39071g7 interfaceC39071g77 = interfaceC39071g73;
        if (interfaceC39071g77 != null) {
            abstractC39201gK3 = interfaceC39071g77.LJJJIL(LJJIJIIJIL);
            if (abstractC39201gK3 != null) {
                this.LIZ.invoke(new C10430b1(C1DF.LIZIZ(abstractC39201gK3.LJLIL, abstractC39201gK3.LJLILLLLZI)));
            }
        } else {
            abstractC39201gK3 = null;
        }
        long LIZ2 = C23360vs.LIZ(C78555UsJ.LJJIJIIJIL(-LJ2, i4 - Math.max(C21640t6.LIZLLL(abstractC39201gK3) / 2, measure.LJJIJ(this.LIZLLL.LIZLLL())), j), 0, 0, 0, 0, 11);
        for (InterfaceC39071g7 interfaceC39071g78 : measurables) {
            if (o.LJ(V1M.LJIJJLI(interfaceC39071g78), "TextField")) {
                AbstractC39201gK LJJJIL = interfaceC39071g78.LJJJIL(LIZ2);
                long LIZ3 = C23360vs.LIZ(LIZ2, 0, 0, 0, 0, 14);
                Iterator<? extends InterfaceC39071g7> it4 = measurables.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        interfaceC39071g74 = it4.next();
                        if (o.LJ(V1M.LJIJJLI(interfaceC39071g74), "Hint")) {
                            break;
                        }
                    } else {
                        interfaceC39071g74 = null;
                        break;
                    }
                }
                InterfaceC39071g7 interfaceC39071g79 = interfaceC39071g74;
                if (interfaceC39071g79 != null) {
                    abstractC39201gK4 = interfaceC39071g79.LJJJIL(LIZ3);
                } else {
                    abstractC39201gK4 = null;
                }
                int LIZLLL = C21490sr.LIZLLL(measure.getDensity(), C21640t6.LJ(abstractC39201gK), C21640t6.LJ(abstractC39201gK2), LJJJIL.LJLIL, C21640t6.LJ(abstractC39201gK3), C21640t6.LJ(abstractC39201gK4), j, this.LIZLLL, z);
                int LIZJ = C21490sr.LIZJ(C21640t6.LIZLLL(abstractC39201gK), C21640t6.LIZLLL(abstractC39201gK2), LJJJIL.LJLILLLLZI, C21640t6.LIZLLL(abstractC39201gK3), C21640t6.LIZLLL(abstractC39201gK4), j, measure.getDensity(), this.LIZLLL);
                for (InterfaceC39071g7 interfaceC39071g710 : measurables) {
                    if (o.LJ(V1M.LJIJJLI(interfaceC39071g710), "border")) {
                        if (LIZLLL != Integer.MAX_VALUE) {
                            i2 = LIZLLL;
                        } else {
                            i2 = 0;
                        }
                        if (LIZJ != Integer.MAX_VALUE) {
                            i3 = LIZJ;
                        } else {
                            i3 = 0;
                        }
                        LJJLIL = measure.LJJLIL(LIZLLL, LIZJ, C113554cx.LJJJLIIL(), new AnonymousClass258(LIZJ, LIZLLL, abstractC39201gK, abstractC39201gK2, LJJJIL, abstractC39201gK3, abstractC39201gK4, interfaceC39071g710.LJJJIL(C78555UsJ.LIZJ(i2, LIZLLL, i3, LIZJ)), this, measure));
                        return LJJLIL;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // X.InterfaceC273215k
    public final int LIZLLL(AbstractC538029g abstractC538029g, List list, int i) {
        o.LJIIIZ(abstractC538029g, "<this>");
        return LJFF(abstractC538029g, list, i, C526824y.LJLIL);
    }

    @Override // X.InterfaceC273215k
    public final int LJ(AbstractC538029g abstractC538029g, List list, int i) {
        o.LJIIIZ(abstractC538029g, "<this>");
        return LJFF(abstractC538029g, list, i, C25A.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1ZI(InterfaceC88472Yns<? super C10430b1, C76800UCe> onLabelMeasured, boolean z, float f, InterfaceC09420Yo paddingValues) {
        o.LJIIIZ(onLabelMeasured, "onLabelMeasured");
        o.LJIIIZ(paddingValues, "paddingValues");
        this.LIZ = onLabelMeasured;
        this.LIZIZ = z;
        this.LIZJ = f;
        this.LIZLLL = paddingValues;
    }

    public final int LJFF(AbstractC538029g abstractC538029g, List list, int i, InterfaceC88471Ynr interfaceC88471Ynr) {
        int i2;
        int i3;
        int i4;
        int i5;
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
                return C21490sr.LIZJ(i4, i3, intValue, i2, i5, C21640t6.LIZ, abstractC538029g.getDensity(), this.LIZLLL);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int LJI(AbstractC538029g abstractC538029g, List list, int i, InterfaceC88471Ynr interfaceC88471Ynr) {
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
                if (this.LIZJ < 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                return C21490sr.LIZLLL(abstractC538029g.getDensity(), i4, i3, intValue, i2, i5, C21640t6.LIZ, this.LIZLLL, z);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
