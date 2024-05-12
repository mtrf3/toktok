package X;

import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vqa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80996Vqa extends AbstractC80990VqU {
    public C80619VkV LIZJ;
    public C80619VkV LIZLLL;

    @Override // X.AbstractC80990VqU
    public final void LIZIZ(LinearLayout parent) {
        o.LJIIIZ(parent, "parent");
        parent.removeAllViews();
        AbstractC80990VqU.LIZJ(parent);
        C80619VkV LIZ = AbstractC80990VqU.LIZ(parent);
        AbstractC80990VqU.LIZJ(parent);
        C80619VkV LIZ2 = AbstractC80990VqU.LIZ(parent);
        AbstractC80990VqU.LIZJ(parent);
        AbstractC80990VqU.LJ(C47261Igj.LJJIJIIJI(LIZ, LIZ2), C47261Igj.LJJIJIL(new OSZ(C81006Vqk.LJLIL, new AqS180S0100000_14(this, 13)), new OSZ(C81007Vql.LJLIL, new AqS180S0100000_14(this, 14))));
    }

    @Override // X.AbstractC80990VqU
    public final void LJIIJ(C80995VqZ c80995VqZ) {
        C80619VkV c80619VkV = this.LIZJ;
        if (c80619VkV != null) {
            c80619VkV.setLevel(0);
            C80619VkV c80619VkV2 = this.LIZJ;
            if (c80619VkV2 != null) {
                c80619VkV2.setCallback(c80995VqZ);
                C80619VkV c80619VkV3 = this.LIZLLL;
                if (c80619VkV3 != null) {
                    c80619VkV3.setLevel(1);
                    C80619VkV c80619VkV4 = this.LIZLLL;
                    if (c80619VkV4 != null) {
                        c80619VkV4.setCallback(c80995VqZ);
                        return;
                    } else {
                        o.LJIJI("pickerSecondLevel");
                        throw null;
                    }
                }
                o.LJIJI("pickerSecondLevel");
                throw null;
            }
            o.LJIJI("pickerFirstLevel");
            throw null;
        }
        o.LJIJI("pickerFirstLevel");
        throw null;
    }

    @Override // X.AbstractC80990VqU
    public final long LJIIL(long j, int i, Object levelNewValue) {
        o.LJIIIZ(levelNewValue, "levelNewValue");
        LJIIIIZZ().setTimeInMillis(j);
        if (i != 0) {
            if (i == 1) {
                LJIIIIZZ().set(12, ((Number) levelNewValue).intValue());
            }
        } else {
            IRU iru = (IRU) levelNewValue;
            LJIIIZ().setTimeInMillis(iru.LIZIZ);
            LJIIIIZZ().set(1, LJIIIZ().get(1));
            LJIIIIZZ().set(2, LJIIIZ().get(2));
            LJIIIIZZ().set(5, LJIIIZ().get(5));
            LJIIIIZZ().set(11, iru.LIZ);
        }
        return LJIIIIZZ().getTimeInMillis();
    }

    @Override // X.AbstractC80990VqU
    public final long LJI(int i, long j, long j2, long j3) {
        return AbstractC80990VqU.LJFF(LJIIIIZZ(), j, j2, j3, i);
    }

    @Override // X.AbstractC80990VqU
    public final void LIZLLL(long j, long j2, int i, long j3, int i2) {
        boolean z;
        LJIIIIZZ().setTimeInMillis(j3);
        int i3 = 11;
        int i4 = LJIIIIZZ().get(11);
        int i5 = LJIIIIZZ().get(12);
        LJIIIIZZ().setTimeInMillis(j);
        int i6 = LJIIIIZZ().get(11);
        int i7 = LJIIIIZZ().get(12);
        LJIIIZ().setTimeInMillis(j2);
        int i8 = LJIIIZ().get(11);
        int i9 = LJIIIZ().get(12);
        if (i < 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new IRU(i6, j));
            LJIIIIZZ().add(11, 1);
            while (true) {
                if (LJIIIIZZ().before(LJIIIZ())) {
                    int i10 = LJIIIIZZ().get(i3);
                    if (i10 == i6) {
                        z = true;
                        break;
                    } else {
                        arrayList.add(new IRU(i10, LJIIIIZZ().getTimeInMillis()));
                        LJIIIIZZ().add(11, 1);
                        i3 = 11;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (((IRU) ORZ.LLFF(arrayList)).LIZ != i8 && !z) {
                arrayList.add(new IRU(i8, LJIIIZ().getTimeInMillis()));
            }
            LJIIIIZZ().setTimeInMillis(j3);
            C80619VkV c80619VkV = this.LIZJ;
            if (c80619VkV != null) {
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IRU iru = (IRU) it.next();
                    arrayList2.add(new C80620VkW(iru, String.valueOf(iru.LIZ)));
                }
                c80619VkV.LIZLLL(arrayList2, null);
                C80619VkV c80619VkV2 = this.LIZJ;
                if (c80619VkV2 != null) {
                    c80619VkV2.setCurrentFocusItem$tux_theme_release(new IRU(i4, j3));
                } else {
                    o.LJIJI("pickerFirstLevel");
                    throw null;
                }
            } else {
                o.LJIJI("pickerFirstLevel");
                throw null;
            }
        } else if (i >= 1) {
            return;
        }
        LJIIIIZZ().setTimeInMillis(j3);
        int actualMinimum = LJIIIIZZ().getActualMinimum(12);
        int actualMaximum = LJIIIIZZ().getActualMaximum(12);
        if (i4 != i6) {
            i7 = actualMinimum;
        }
        if (i4 != i8) {
            i9 = actualMaximum;
        }
        OSZ LJIIJJI = AbstractC80990VqU.LJIIJJI(i2, i7, i9, i5);
        C40511Fv9 c40511Fv9 = (C40511Fv9) LJIIJJI.getFirst();
        int intValue = ((Number) LJIIJJI.getSecond()).intValue();
        C80619VkV c80619VkV3 = this.LIZLLL;
        if (c80619VkV3 != null) {
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(c40511Fv9, 10));
            C118234kV it2 = c40511Fv9.iterator();
            while (it2.LJLJI) {
                int nextInt = it2.nextInt();
                arrayList3.add(new C80620VkW(Integer.valueOf(nextInt), String.valueOf(nextInt)));
            }
            c80619VkV3.LIZLLL(arrayList3, null);
            C80619VkV c80619VkV4 = this.LIZLLL;
            if (c80619VkV4 != null) {
                c80619VkV4.setCurrentFocusItem$tux_theme_release(Integer.valueOf(intValue));
                return;
            } else {
                o.LJIJI("pickerSecondLevel");
                throw null;
            }
        }
        o.LJIJI("pickerSecondLevel");
        throw null;
    }
}
