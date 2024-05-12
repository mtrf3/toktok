package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.VqS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80988VqS extends AbstractC80990VqU {
    public C80619VkV LIZJ;
    public C80619VkV LIZLLL;

    @Override // X.AbstractC80990VqU
    public final void LIZIZ(LinearLayout parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.tp, R.attr.tq, R.attr.tr, R.attr.tv, R.attr.tw, R.attr.tx, R.attr.bst, R.attr.bsu}, R.attr.kz, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…,\n            0\n        )");
        int i = obtainStyledAttributes.getInt(5, 0);
        int color = obtainStyledAttributes.getColor(4, 0);
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 0);
        String LLLZLZ2 = C16880lQ.LLLZLZ(obtainStyledAttributes, 1);
        obtainStyledAttributes.recycle();
        parent.removeAllViews();
        AbstractC80990VqU.LIZJ(parent);
        C80619VkV LIZ = AbstractC80990VqU.LIZ(parent);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(i);
        tuxTextView.setTextColor(color);
        tuxTextView.setText(LLLZLZ);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        parent.addView(tuxTextView, layoutParams);
        AbstractC80990VqU.LIZJ(parent);
        C80619VkV LIZ2 = AbstractC80990VqU.LIZ(parent);
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        tuxTextView2.setTuxFont(i);
        tuxTextView2.setTextColor(color);
        tuxTextView2.setText(LLLZLZ2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        parent.addView(tuxTextView2, layoutParams2);
        AbstractC80990VqU.LIZJ(parent);
        this.LIZJ = LIZ;
        this.LIZLLL = LIZ2;
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
        long j2;
        long intValue;
        o.LJIIIZ(levelNewValue, "levelNewValue");
        long j3 = 60000;
        long j4 = j / j3;
        if (i != 0) {
            if (i != 1) {
                return j;
            }
            long j5 = 60;
            j2 = (j4 / j5) * j5;
            intValue = ((Number) levelNewValue).longValue();
        } else {
            j2 = j4 % 60;
            intValue = ((Number) levelNewValue).intValue() * 60;
        }
        return (intValue + j2) * j3;
    }

    @Override // X.AbstractC80990VqU
    public final long LJI(int i, long j, long j2, long j3) {
        long j4 = 60000;
        long j5 = j3 / j4;
        long j6 = 60;
        int i2 = (int) (j5 % j6);
        long j7 = j5 / j6;
        if (i2 % 5 != 0) {
            long j8 = (j7 * j6) + ((i2 / 5) * 5);
            long j9 = j8 * j4;
            if (j <= j9 && j9 <= j2) {
                return j9;
            }
            return (j8 + 5) * j4;
        }
        return j3;
    }

    @Override // X.AbstractC80990VqU
    public final void LIZLLL(long j, long j2, int i, long j3, int i2) {
        long j4 = 60000;
        long j5 = j / j4;
        long j6 = 60;
        long j7 = j5 / j6;
        long j8 = j5 % j6;
        long j9 = j2 / j4;
        long j10 = j9 / j6;
        long j11 = j9 % j6;
        long j12 = j3 / j4;
        long j13 = j12 / j6;
        long j14 = j12 % j6;
        if (i < 0) {
            C80619VkV c80619VkV = this.LIZJ;
            if (c80619VkV != null) {
                UIW uiw = new UIW(j7, j10);
                ArrayList arrayList = new ArrayList(C32I.LJJL(uiw, 10));
                Iterator<Long> it = uiw.iterator();
                while (((C36963Ef1) it).LJLJI) {
                    long nextLong = ((EGU) it).nextLong();
                    arrayList.add(new C80620VkW(Integer.valueOf((int) nextLong), String.valueOf(nextLong)));
                }
                c80619VkV.LIZLLL(arrayList, null);
                C80619VkV c80619VkV2 = this.LIZJ;
                if (c80619VkV2 != null) {
                    c80619VkV2.setCurrentFocusItem$tux_theme_release(Integer.valueOf((int) j13));
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
        if (j13 != j7) {
            j8 = 0;
        }
        int i3 = (int) j8;
        if (j13 != j10) {
            j11 = 59;
        }
        OSZ LJIIJJI = AbstractC80990VqU.LJIIJJI(i2, i3, (int) j11, (int) j14);
        C40511Fv9 c40511Fv9 = (C40511Fv9) LJIIJJI.getFirst();
        int intValue = ((Number) LJIIJJI.getSecond()).intValue();
        C80619VkV c80619VkV3 = this.LIZLLL;
        if (c80619VkV3 != null) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(c40511Fv9, 10));
            C118234kV it2 = c40511Fv9.iterator();
            while (it2.LJLJI) {
                int nextInt = it2.nextInt();
                arrayList2.add(new C80620VkW(Integer.valueOf(nextInt), String.valueOf(nextInt)));
            }
            c80619VkV3.LIZLLL(arrayList2, null);
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
