package kotlin.jvm.internal;

import X.AbstractC274515x;
import X.AbstractC39201gK;
import X.AbstractC65781Prl;
import X.C07090Pp;
import X.C0O8;
import X.C0Q1;
import X.C0Q9;
import X.C0YZ;
import X.C1JK;
import X.C1OD;
import X.C1OH;
import X.C24380xW;
import X.C2CP;
import X.C2CR;
import X.C2CV;
import X.C2GY;
import X.C36001bA;
import X.C36441bs;
import X.C49381wk;
import X.C68322mC;
import X.C76732zl;
import X.C76800UCe;
import X.InterfaceC07130Pt;
import X.InterfaceC07760Se;
import X.InterfaceC09480Yu;
import X.InterfaceC13080fI;
import X.InterfaceC14660hq;
import X.InterfaceC35811ar;
import X.InterfaceC35841au;
import X.InterfaceC39071g7;
import X.InterfaceC44861pS;
import X.InterfaceC70422pa;
import X.InterfaceC88472Yns;
import X.ORS;
import X.XKX;
import X.XKY;
import android.os.Trace;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class IDqS0S0600000 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, X.0Q1] */
    public static final Object invoke$0(IDqS0S0600000 iDqS0S0600000, Object obj) {
        long longValue = ((Number) obj).longValue();
        C68322mC c68322mC = (C68322mC) iDqS0S0600000.l0;
        ?? c0q1 = new C0Q1(iDqS0S0600000.l1, ((InterfaceC07130Pt) iDqS0S0600000.l2).LIZLLL(), (C0Q9) iDqS0S0600000.l3, longValue, ((InterfaceC07130Pt) iDqS0S0600000.l2).LJFF(), longValue, new IDqS420S0100000((C1JK) iDqS0S0600000.l4, 78));
        C07090Pp.LIZIZ(c0q1, longValue, (InterfaceC07130Pt) iDqS0S0600000.l2, (C1JK) iDqS0S0600000.l4, (InterfaceC88472Yns) iDqS0S0600000.l5);
        c68322mC.element = c0q1;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS0S0600000 iDqS0S0600000, Object obj) {
        InterfaceC09480Yu it = (InterfaceC09480Yu) obj;
        o.LJIIIZ(it, "it");
        ((InterfaceC35811ar) iDqS0S0600000.l1).setValue(Boolean.valueOf(it.isFocused()));
        if (C49381wk.LIZ((InterfaceC35811ar) iDqS0S0600000.l1)) {
            XKX.LIZLLL((InterfaceC70422pa) iDqS0S0600000.l0, null, XKY.UNDISPATCHED, new C2CP((InterfaceC14660hq) iDqS0S0600000.l2, (InterfaceC35811ar) iDqS0S0600000.l3, null), 1);
            XKX.LIZLLL((InterfaceC70422pa) iDqS0S0600000.l0, null, null, new C2CR((C1OH) iDqS0S0600000.l5, (InterfaceC35811ar) iDqS0S0600000.l4, null), 3);
        } else {
            XKX.LIZLLL((InterfaceC70422pa) iDqS0S0600000.l0, null, null, new C2CV((C1OH) iDqS0S0600000.l5, (InterfaceC35811ar) iDqS0S0600000.l4, null), 3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS0S0600000 iDqS0S0600000, Object obj) {
        AbstractC274515x layout = (AbstractC274515x) obj;
        o.LJIIIZ(layout, "$this$layout");
        AbstractC39201gK[] abstractC39201gKArr = (AbstractC39201gK[]) iDqS0S0600000.l0;
        List list = (List) iDqS0S0600000.l1;
        InterfaceC44861pS interfaceC44861pS = (InterfaceC44861pS) iDqS0S0600000.l2;
        C76732zl c76732zl = (C76732zl) iDqS0S0600000.l3;
        C76732zl c76732zl2 = (C76732zl) iDqS0S0600000.l4;
        InterfaceC07760Se interfaceC07760Se = (InterfaceC07760Se) iDqS0S0600000.l5;
        int length = abstractC39201gKArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            AbstractC39201gK abstractC39201gK = abstractC39201gKArr[i2];
            o.LJII(abstractC39201gK, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            C0YZ.LIZIZ(layout, abstractC39201gK, (InterfaceC39071g7) ListProtector.get(list, i), interfaceC44861pS.getLayoutDirection(), c76732zl.element, c76732zl2.element, interfaceC07760Se);
            i2++;
            i++;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS0S0600000 iDqS0S0600000, Object obj) {
        boolean z;
        boolean z2;
        long longValue = ((Number) obj).longValue();
        if (((C36001bA) iDqS0S0600000.l0).LIZ.LJII()) {
            C36001bA c36001bA = (C36001bA) iDqS0S0600000.l0;
            Trace.beginSection("Recomposer:animation");
            try {
                c36001bA.LIZ.LJIIIIZZ(longValue);
                C0O8.LIZLLL();
            } finally {
            }
        }
        C36001bA c36001bA2 = (C36001bA) iDqS0S0600000.l0;
        List list = (List) iDqS0S0600000.l1;
        List<C24380xW> list2 = (List) iDqS0S0600000.l2;
        Set set = (Set) iDqS0S0600000.l3;
        list = (List) iDqS0S0600000.l4;
        set = (Set) iDqS0S0600000.l5;
        Trace.beginSection("Recomposer:recompose");
        try {
            synchronized (c36001bA2.LIZLLL) {
                C36001bA.LJIJJ(c36001bA2);
                ArrayList arrayList = (ArrayList) c36001bA2.LJIIIIZZ;
                int size = arrayList.size();
                z = false;
                for (int i = 0; i < size; i++) {
                    list.add((InterfaceC35841au) arrayList.get(i));
                }
                ((ArrayList) c36001bA2.LJIIIIZZ).clear();
            }
            C36441bs<Object> c36441bs = new C36441bs<>();
            C36441bs c36441bs2 = new C36441bs();
            while (true) {
                if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                    break;
                }
                try {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        InterfaceC35841au interfaceC35841au = (InterfaceC35841au) list.get(i2);
                        c36441bs2.add(interfaceC35841au);
                        InterfaceC35841au LJIJI = C36001bA.LJIJI(c36001bA2, interfaceC35841au, c36441bs);
                        if (LJIJI != null) {
                            list.add(LJIJI);
                        }
                    }
                    list.clear();
                    if (c36441bs.LJLIL > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        synchronized (c36001bA2.LIZLLL) {
                            ArrayList arrayList2 = (ArrayList) c36001bA2.LJI;
                            int size3 = arrayList2.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                InterfaceC35841au interfaceC35841au2 = (InterfaceC35841au) arrayList2.get(i3);
                                if (!c36441bs2.contains(interfaceC35841au2) && interfaceC35841au2.LJ(c36441bs)) {
                                    list.add(interfaceC35841au2);
                                }
                            }
                        }
                    }
                    if (list.isEmpty()) {
                        try {
                            C2GY.LJFF(list2, c36001bA2);
                            while (!list2.isEmpty()) {
                                ORS.LJJLIIIJILLIZJL(c36001bA2.LJJIIJZLJL(list2, c36441bs), set);
                                C2GY.LJFF(list2, c36001bA2);
                            }
                        } catch (Exception e) {
                            C36001bA.LJJIIZI(c36001bA2, e, true, 2);
                            C2GY.LJ(list, list2, list, set, set);
                        }
                    }
                    z = false;
                } catch (Exception e2) {
                    C36001bA.LJJIIZI(c36001bA2, e2, true, 2);
                    C2GY.LJ(list, list2, list, set, set);
                } finally {
                }
            }
            try {
                if (!list.isEmpty()) {
                    try {
                        ORS.LJJLIIIJILLIZJL(list, set);
                        int size4 = list.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            ((InterfaceC35841au) list.get(i4)).LJII();
                        }
                    } catch (Exception e3) {
                        C36001bA.LJJIIZI(c36001bA2, e3, z, 6);
                        C2GY.LJ(list, list2, list, set, set);
                        list.clear();
                    }
                }
                if (!set.isEmpty()) {
                    try {
                        try {
                            ORS.LJJLIIIJILLIZJL(set, set);
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC35841au) it.next()).LJIIJ();
                            }
                        } catch (Exception e4) {
                            C36001bA.LJJIIZI(c36001bA2, e4, z, 6);
                            C2GY.LJ(list, list2, list, set, set);
                            set.clear();
                        }
                    } finally {
                    }
                }
                try {
                    if (!set.isEmpty()) {
                        try {
                            Iterator it2 = set.iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC35841au) it2.next()).LJIIIZ();
                            }
                        } catch (Exception e5) {
                            C36001bA.LJJIIZI(c36001bA2, e5, z, 6);
                            C2GY.LJ(list, list2, list, set, set);
                            set.clear();
                        }
                    }
                    synchronized (c36001bA2.LIZLLL) {
                        c36001bA2.LJJIFFI();
                    }
                    Trace.endSection();
                    return C76800UCe.LIZ;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS0S0600000(C36001bA c36001bA, C36001bA c36001bA2, List<InterfaceC35841au> list, List<C24380xW> list2, Set<InterfaceC35841au> set, List<InterfaceC35841au> list3, Set<InterfaceC35841au> set2) {
        super(1);
        this.$t = set2;
        this.l0 = c36001bA;
        this.l1 = c36001bA2;
        this.l2 = list;
        this.l3 = list2;
        this.l4 = set;
        this.l5 = list3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS0S0600000(C68322mC c68322mC, C68322mC<C0Q1<T, V>> c68322mC2, T t, InterfaceC07130Pt<T, V> interfaceC07130Pt, V v, C1JK<T, V> c1jk, InterfaceC88472Yns<? super C0Q1<T, V>, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
        this.l2 = t;
        this.l3 = interfaceC07130Pt;
        this.l4 = v;
        this.l5 = c1jk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS0S0600000(InterfaceC70422pa interfaceC70422pa, InterfaceC70422pa interfaceC70422pa2, InterfaceC35811ar<Boolean> interfaceC35811ar, InterfaceC14660hq interfaceC14660hq, InterfaceC35811ar<InterfaceC13080fI> interfaceC35811ar2, InterfaceC35811ar<C1OD> interfaceC35811ar3, C1OH c1oh) {
        super(1);
        this.$t = c1oh;
        this.l0 = interfaceC70422pa;
        this.l1 = interfaceC70422pa2;
        this.l2 = interfaceC35811ar;
        this.l3 = interfaceC14660hq;
        this.l4 = interfaceC35811ar2;
        this.l5 = interfaceC35811ar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS0S0600000(AbstractC39201gK[] abstractC39201gKArr, AbstractC39201gK[] abstractC39201gKArr2, List<? extends InterfaceC39071g7> list, InterfaceC44861pS interfaceC44861pS, C76732zl c76732zl, C76732zl c76732zl2, InterfaceC07760Se interfaceC07760Se) {
        super(1);
        this.$t = interfaceC07760Se;
        this.l0 = abstractC39201gKArr;
        this.l1 = abstractC39201gKArr2;
        this.l2 = list;
        this.l3 = interfaceC44861pS;
        this.l4 = c76732zl;
        this.l5 = c76732zl2;
    }
}
