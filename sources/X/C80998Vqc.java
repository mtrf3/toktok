package X;

import android.widget.LinearLayout;
import java.util.Calendar;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vqc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80998Vqc extends AbstractC80990VqU {
    public C80619VkV LIZJ;
    public C80619VkV LIZLLL;
    public C80619VkV LJ;

    @Override // X.AbstractC80990VqU
    public final long LJI(int i, long j, long j2, long j3) {
        return j3;
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
        AbstractC80990VqU.LJ(C47261Igj.LJJIJIIJI(LIZ, LIZ2, LIZ3), C47261Igj.LJJIJIL(new OSZ(C81008Vqm.LJLIL, new AqS180S0100000_14(this, 15)), new OSZ(C81009Vqn.LJLIL, new AqS180S0100000_14(this, 16)), new OSZ(C81010Vqo.LJLIL, new AqS180S0100000_14(this, 17))));
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
                    LJIIIIZZ().set(5, ((Number) levelNewValue).intValue());
                }
            } else {
                int i2 = LJIIIIZZ().get(5);
                LJIIIIZZ().set(5, 1);
                LJIIIIZZ().set(2, ((Number) levelNewValue).intValue());
                int actualMaximum = LJIIIIZZ().getActualMaximum(5);
                Calendar LJIIIIZZ = LJIIIIZZ();
                if (i2 > actualMaximum) {
                    i2 = actualMaximum;
                }
                LJIIIIZZ.set(5, i2);
            }
        } else {
            LJIIIIZZ().set(1, ((Number) levelNewValue).intValue());
        }
        return LJIIIIZZ().getTimeInMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0195  */
    @Override // X.AbstractC80990VqU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(long r22, long r24, int r26, long r27, int r29) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80998Vqc.LIZLLL(long, long, int, long, int):void");
    }
}
