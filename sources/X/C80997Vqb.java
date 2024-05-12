package X;

import android.widget.LinearLayout;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vqb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80997Vqb extends AbstractC80990VqU {
    public C80619VkV LIZJ;
    public C80619VkV LIZLLL;
    public C80619VkV LJ;

    @Override // X.AbstractC80990VqU
    public final long LJII(long j) {
        return j;
    }

    @Override // X.AbstractC80990VqU
    public final void LIZIZ(LinearLayout parent) {
        o.LJIIIZ(parent, "parent");
        parent.removeAllViews();
        AbstractC80990VqU.LIZJ(parent);
        C80619VkV LIZ = AbstractC80990VqU.LIZ(parent);
        AbstractC80990VqU.LIZJ(parent);
        C80619VkV LIZ2 = AbstractC80990VqU.LIZ(parent);
        AbstractC80990VqU.LIZJ(parent);
        C80619VkV LIZ3 = AbstractC80990VqU.LIZ(parent);
        AbstractC80990VqU.LIZJ(parent);
        AbstractC80990VqU.LJ(C47261Igj.LJJIJIIJI(LIZ, LIZ2, LIZ3), C47261Igj.LJJIJIL(new OSZ(C81003Vqh.LJLIL, new AqS180S0100000_14(this, 10)), new OSZ(C81004Vqi.LJLIL, new AqS180S0100000_14(this, 11)), new OSZ(C81005Vqj.LJLIL, new AqS180S0100000_14(this, 12))));
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
                        C80619VkV c80619VkV5 = this.LJ;
                        if (c80619VkV5 != null) {
                            c80619VkV5.setLevel(2);
                            C80619VkV c80619VkV6 = this.LJ;
                            if (c80619VkV6 != null) {
                                c80619VkV6.setCallback(c80995VqZ);
                                return;
                            } else {
                                o.LJIJI("pickerThirdLevel");
                                throw null;
                            }
                        }
                        o.LJIJI("pickerThirdLevel");
                        throw null;
                    }
                    o.LJIJI("pickerSecondLevel");
                    throw null;
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
            if (i != 1) {
                if (i == 2) {
                    LJIIIIZZ().set(12, ((Number) levelNewValue).intValue());
                }
            } else {
                IRU iru = (IRU) levelNewValue;
                LJIIIZ().setTimeInMillis(iru.LIZIZ);
                LJIIIIZZ().set(1, LJIIIZ().get(1));
                LJIIIIZZ().set(2, LJIIIZ().get(2));
                LJIIIIZZ().set(5, LJIIIZ().get(5));
                LJIIIIZZ().set(10, iru.LIZ);
            }
        } else {
            LJIIIIZZ().set(9, ((Number) levelNewValue).intValue());
        }
        return LJIIIIZZ().getTimeInMillis();
    }

    @Override // X.AbstractC80990VqU
    public final long LJI(int i, long j, long j2, long j3) {
        return AbstractC80990VqU.LJFF(LJIIIIZZ(), j, j2, j3, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0238  */
    @Override // X.AbstractC80990VqU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(long r25, long r27, int r29, long r30, int r32) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80997Vqb.LIZLLL(long, long, int, long, int):void");
    }
}
