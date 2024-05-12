package X;

import Y.IDComparatorS33S0000000_5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Ct4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32738Ct4 {
    public static final void LIZ(LinkedList linkedList, EnumC32766CtW state, List frequentlyUsedGiftsId) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Long l;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(frequentlyUsedGiftsId, "frequentlyUsedGiftsId");
        Iterator it = linkedList.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (it.hasNext()) {
                if (it.next() instanceof C32732Csy) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        Iterator it2 = linkedList.iterator();
        int i3 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next() instanceof C32741Ct7) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i3 = -1;
                break;
            }
        }
        Iterator it3 = linkedList.iterator();
        int i4 = 0;
        while (true) {
            if (it3.hasNext()) {
                if (it3.next() instanceof C32740Ct6) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        Iterator it4 = linkedList.iterator();
        int i5 = 0;
        while (it4.hasNext()) {
            Object next = it4.next();
            if ((next instanceof C32774Cte) || (next instanceof C32742Ct8)) {
                i = i5;
                break;
            }
            i5++;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it5 = linkedList.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            AbstractC32698CsQ abstractC32698CsQ = (AbstractC32698CsQ) next2;
            if (abstractC32698CsQ != null) {
                l = Long.valueOf(abstractC32698CsQ.LIZJ());
            } else {
                l = null;
            }
            if (ORZ.LJLJJI(l, frequentlyUsedGiftsId)) {
                arrayList.add(next2);
            }
        }
        Iterator it6 = linkedList.iterator();
        while (true) {
            if (it6.hasNext()) {
                obj = it6.next();
                if (obj instanceof C32732Csy) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Iterator it7 = linkedList.iterator();
        while (true) {
            if (it7.hasNext()) {
                obj2 = it7.next();
                if (obj2 instanceof C32741Ct7) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Iterator it8 = linkedList.iterator();
        while (true) {
            if (it8.hasNext()) {
                obj3 = it8.next();
                if (obj3 instanceof C32740Ct6) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        Iterator it9 = linkedList.iterator();
        while (true) {
            if (it9.hasNext()) {
                obj4 = it9.next();
                if ((obj4 instanceof C32774Cte) || (obj4 instanceof C32742Ct8)) {
                    break;
                }
            } else {
                obj4 = null;
                break;
            }
        }
        int i6 = C32767CtX.LIZ[state.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    C29306Beo.LJJIJIIJI(new AqS171S0100000_5(arrayList, (List<? extends AbstractC32698CsQ<? extends C30896CAq>>) 585), linkedList);
                    if (linkedList.size() > 1) {
                        C40675Fxn.LJJLIIIJ(linkedList, new IDComparatorS33S0000000_5(7));
                    }
                    linkedList.addAll(0, arrayList);
                    if (obj != null) {
                        linkedList.add(i2, obj);
                    }
                    if (obj2 != null) {
                        linkedList.add(i3, obj2);
                    }
                    if (obj3 != null) {
                        linkedList.add(i4, obj3);
                    }
                    if (obj4 != null) {
                        linkedList.add(i, obj4);
                        return;
                    }
                    return;
                }
                throw new C162476Zf();
            }
            C29306Beo.LJJIJIIJI(new AqS171S0100000_5(arrayList, (List<? extends AbstractC32698CsQ<? extends C30896CAq>>) 584), linkedList);
            if (linkedList.size() > 1) {
                C40675Fxn.LJJLIIIJ(linkedList, new IDComparatorS33S0000000_5(6));
            }
            linkedList.addAll(0, arrayList);
            if (obj != null) {
                linkedList.add(i2, obj);
            }
            if (obj2 != null) {
                linkedList.add(i3, obj2);
            }
            if (obj3 != null) {
                linkedList.add(i4, obj3);
            }
            if (obj4 != null) {
                linkedList.add(i, obj4);
            }
        }
    }
}
