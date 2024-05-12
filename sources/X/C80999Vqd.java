package X;

import android.content.res.TypedArray;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vqd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80999Vqd extends AbstractC80990VqU {
    public C80619VkV LIZJ;
    public C80619VkV LIZLLL;
    public C80619VkV LJ;
    public String LJFF;
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C81011Vqp.LJLIL);

    @Override // X.AbstractC80990VqU
    public final void LIZIZ(LinearLayout parent) {
        o.LJIIIZ(parent, "parent");
        TypedArray obtainStyledAttributes = parent.getContext().obtainStyledAttributes(null, new int[]{R.attr.tp, R.attr.tq, R.attr.tr, R.attr.tv, R.attr.tw, R.attr.tx, R.attr.bst, R.attr.bsu}, R.attr.kz, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…r.TuxWheelPickerStyle, 0)");
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 3);
        if (LLLZLZ == null) {
            LLLZLZ = "";
        }
        this.LJFF = LLLZLZ;
        obtainStyledAttributes.recycle();
        parent.removeAllViews();
        AbstractC80990VqU.LIZJ(parent);
        C80619VkV LIZ = AbstractC80990VqU.LIZ(parent);
        AbstractC80990VqU.LIZJ(parent);
        C80619VkV LIZ2 = AbstractC80990VqU.LIZ(parent);
        AbstractC80990VqU.LIZJ(parent);
        C80619VkV LIZ3 = AbstractC80990VqU.LIZ(parent);
        AbstractC80990VqU.LIZJ(parent);
        AbstractC80990VqU.LJ(C47261Igj.LJJIJIIJI(LIZ, LIZ2, LIZ3), C47261Igj.LJJIJIL(new OSZ(C81000Vqe.LJLIL, new AqS180S0100000_14(this, 7)), new OSZ(C81001Vqf.LJLIL, new AqS180S0100000_14(this, 8)), new OSZ(C81002Vqg.LJLIL, new AqS180S0100000_14(this, 9))));
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
                LJIIIIZZ().set(11, ((Number) levelNewValue).intValue());
            }
        } else {
            int intValue = ((Number) levelNewValue).intValue();
            int i2 = (intValue / 100) % 100;
            OSJ osj = new OSJ(Integer.valueOf(intValue / 10000), Integer.valueOf(i2), Integer.valueOf(intValue % 100));
            int intValue2 = ((Number) osj.getFirst()).intValue();
            int intValue3 = ((Number) osj.getSecond()).intValue();
            int intValue4 = ((Number) osj.getThird()).intValue();
            LJIIIIZZ().set(1, intValue2);
            LJIIIIZZ().set(2, intValue3);
            LJIIIIZZ().set(5, intValue4);
        }
        return LJIIIIZZ().getTimeInMillis();
    }

    @Override // X.AbstractC80990VqU
    public final long LJI(int i, long j, long j2, long j3) {
        return AbstractC80990VqU.LJFF(LJIIIIZZ(), j, j2, j3, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f6  */
    @Override // X.AbstractC80990VqU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(long r29, long r31, int r33, long r34, int r36) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80999Vqd.LIZLLL(long, long, int, long, int):void");
    }
}
