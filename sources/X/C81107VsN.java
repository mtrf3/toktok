package X;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.VsN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81107VsN extends LinearLayout implements InterfaceC80609VkL {
    public C80607VkJ LJLIL;
    public C80607VkJ LJLILLLLZI;
    public C80607VkJ LJLJI;
    public LinearLayout LJLJJI;
    public Calendar LJLJJL;
    public Calendar LJLJJLL;
    public InterfaceC81111VsR LJLJL;
    public final LayoutInflater LJLJLJ;

    public final int getDayOfMonth() {
        Calendar calendar = this.LJLJJL;
        o.LJI(calendar);
        return calendar.get(5);
    }

    public final int getMonth() {
        Calendar calendar = this.LJLJJL;
        o.LJI(calendar);
        return calendar.get(2) + 1;
    }

    public final int getYear() {
        Calendar calendar = this.LJLJJL;
        o.LJI(calendar);
        return calendar.get(1);
    }

    public final LinearLayout getContainer() {
        return this.LJLJJI;
    }

    public final C80607VkJ getDayOfMonthPicker() {
        return this.LJLJI;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.LJLJLJ;
    }

    public final C80607VkJ getMonthPicker() {
        return this.LJLILLLLZI;
    }

    public final C80607VkJ getYearPicker() {
        return this.LJLIL;
    }

    public final void LIZIZ(Date date) {
        if (this.LJLJJL == null) {
            this.LJLJJL = Calendar.getInstance();
        }
        Calendar calendar = this.LJLJJL;
        o.LJI(calendar);
        calendar.setTime(date);
        C80607VkJ c80607VkJ = this.LJLJI;
        if (c80607VkJ != null) {
            Calendar calendar2 = this.LJLJJL;
            o.LJI(calendar2);
            c80607VkJ.LJ(calendar2.getActualMaximum(5));
        }
        C80607VkJ c80607VkJ2 = this.LJLIL;
        if (c80607VkJ2 != null) {
            Calendar calendar3 = this.LJLJJL;
            o.LJI(calendar3);
            c80607VkJ2.LIZLLL(calendar3.get(1));
        }
        C80607VkJ c80607VkJ3 = this.LJLILLLLZI;
        if (c80607VkJ3 != null) {
            Calendar calendar4 = this.LJLJJL;
            o.LJI(calendar4);
            c80607VkJ3.LIZLLL(calendar4.get(2) + 1);
        }
        C80607VkJ c80607VkJ4 = this.LJLJI;
        if (c80607VkJ4 != null) {
            Calendar calendar5 = this.LJLJJL;
            o.LJI(calendar5);
            c80607VkJ4.LIZLLL(calendar5.get(5));
        }
    }

    public final void setContainer(LinearLayout linearLayout) {
        this.LJLJJI = linearLayout;
    }

    public final void setDayOfMonthPicker(C80607VkJ c80607VkJ) {
        this.LJLJI = c80607VkJ;
    }

    public final void setLowerBoundDate(Calendar calendar) {
        C80607VkJ c80607VkJ;
        if (calendar != null && (c80607VkJ = this.LJLIL) != null) {
            c80607VkJ.LJLLL = calendar.get(1);
            c80607VkJ.LJFF();
            c80607VkJ.LIZJ();
            c80607VkJ.invalidate();
        }
    }

    public final void setMonthPicker(C80607VkJ c80607VkJ) {
        this.LJLILLLLZI = c80607VkJ;
    }

    public final void setNonRecurrentForYear(boolean z) {
        C80607VkJ c80607VkJ = this.LJLIL;
        if (c80607VkJ != null) {
            c80607VkJ.setNonRecurrent(z);
        }
    }

    public final void setUpperBoundDate(Calendar calendar) {
        C80607VkJ c80607VkJ;
        this.LJLJJLL = calendar;
        if (calendar != null) {
            C80607VkJ c80607VkJ2 = this.LJLIL;
            if (c80607VkJ2 != null) {
                c80607VkJ2.LJ(calendar.get(1));
            }
            Calendar calendar2 = this.LJLJJL;
            o.LJI(calendar2);
            int i = calendar2.get(1);
            Calendar calendar3 = this.LJLJJLL;
            o.LJI(calendar3);
            if (i == calendar3.get(1)) {
                C80607VkJ c80607VkJ3 = this.LJLILLLLZI;
                if (c80607VkJ3 != null) {
                    Calendar calendar4 = this.LJLJJLL;
                    o.LJI(calendar4);
                    c80607VkJ3.LJ(calendar4.get(2) + 1);
                }
                Calendar calendar5 = this.LJLJJL;
                o.LJI(calendar5);
                int i2 = calendar5.get(2);
                Calendar calendar6 = this.LJLJJLL;
                o.LJI(calendar6);
                if (i2 == calendar6.get(2) && (c80607VkJ = this.LJLJI) != null) {
                    Calendar calendar7 = this.LJLJJLL;
                    o.LJI(calendar7);
                    c80607VkJ.LJ(calendar7.get(5));
                }
            }
        }
    }

    public final void setYearPicker(C80607VkJ c80607VkJ) {
        this.LJLIL = c80607VkJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        r2 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C81107VsN(android.content.Context r16, android.util.AttributeSet r17) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81107VsN.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // X.InterfaceC80609VkL
    public final void LIZ(C80607VkJ c80607VkJ, int i) {
        int i2 = 2;
        if (o.LJ(c80607VkJ, this.LJLIL)) {
            Calendar calendar = this.LJLJJL;
            o.LJI(calendar);
            int i3 = calendar.get(5);
            Calendar calendar2 = this.LJLJJL;
            o.LJI(calendar2);
            int i4 = calendar2.get(2);
            Calendar calendar3 = this.LJLJJLL;
            if (calendar3 != null && i == calendar3.get(1)) {
                Calendar calendar4 = this.LJLJJLL;
                o.LJI(calendar4);
                if (i4 > calendar4.get(2)) {
                    Calendar calendar5 = this.LJLJJLL;
                    o.LJI(calendar5);
                    i4 = calendar5.get(2);
                }
                C80607VkJ c80607VkJ2 = this.LJLILLLLZI;
                if (c80607VkJ2 != null) {
                    Calendar calendar6 = this.LJLJJLL;
                    o.LJI(calendar6);
                    c80607VkJ2.LJ(calendar6.get(2) + 1);
                }
            } else {
                C80607VkJ c80607VkJ3 = this.LJLILLLLZI;
                if (c80607VkJ3 != null) {
                    Calendar calendar7 = this.LJLJJL;
                    o.LJI(calendar7);
                    c80607VkJ3.LJ(calendar7.getActualMaximum(2) + 1);
                }
            }
            Calendar calendar8 = this.LJLJJL;
            o.LJI(calendar8);
            calendar8.set(i, i4, 1);
            Calendar calendar9 = this.LJLJJL;
            o.LJI(calendar9);
            int actualMaximum = calendar9.getActualMaximum(5);
            Calendar calendar10 = this.LJLJJLL;
            if (calendar10 != null && i == calendar10.get(1)) {
                Calendar calendar11 = this.LJLJJLL;
                o.LJI(calendar11);
                if (i4 == calendar11.get(2)) {
                    Calendar calendar12 = this.LJLJJLL;
                    o.LJI(calendar12);
                    actualMaximum = calendar12.get(5);
                }
            }
            if (i3 > actualMaximum) {
                i3 = actualMaximum;
            }
            Calendar calendar13 = this.LJLJJL;
            o.LJI(calendar13);
            calendar13.set(5, i3);
            C80607VkJ c80607VkJ4 = this.LJLJI;
            if (c80607VkJ4 != null) {
                c80607VkJ4.LJ(actualMaximum);
            }
            i2 = 1;
        } else if (o.LJ(c80607VkJ, this.LJLILLLLZI)) {
            Calendar calendar14 = this.LJLJJL;
            o.LJI(calendar14);
            int i5 = calendar14.get(5);
            Calendar calendar15 = this.LJLJJL;
            o.LJI(calendar15);
            Calendar calendar16 = this.LJLJJL;
            o.LJI(calendar16);
            int i6 = i - 1;
            calendar15.set(calendar16.get(1), i6, 1);
            Calendar calendar17 = this.LJLJJL;
            o.LJI(calendar17);
            int actualMaximum2 = calendar17.getActualMaximum(5);
            if (this.LJLJJLL != null) {
                Calendar calendar18 = this.LJLJJL;
                o.LJI(calendar18);
                int i7 = calendar18.get(1);
                Calendar calendar19 = this.LJLJJLL;
                o.LJI(calendar19);
                if (i7 == calendar19.get(1)) {
                    Calendar calendar20 = this.LJLJJLL;
                    o.LJI(calendar20);
                    if (i6 == calendar20.get(2)) {
                        Calendar calendar21 = this.LJLJJLL;
                        o.LJI(calendar21);
                        actualMaximum2 = calendar21.get(5);
                    }
                }
            }
            if (i5 > actualMaximum2) {
                i5 = actualMaximum2;
            }
            Calendar calendar22 = this.LJLJJL;
            o.LJI(calendar22);
            calendar22.set(5, i5);
            C80607VkJ c80607VkJ5 = this.LJLJI;
            if (c80607VkJ5 != null) {
                c80607VkJ5.LJ(actualMaximum2);
            }
        } else if (o.LJ(c80607VkJ, this.LJLJI)) {
            Calendar calendar23 = this.LJLJJL;
            o.LJI(calendar23);
            calendar23.set(5, i);
            i2 = 3;
        } else {
            i2 = 0;
        }
        InterfaceC81111VsR interfaceC81111VsR = this.LJLJL;
        if (interfaceC81111VsR != null) {
            getYear();
            getMonth();
            getDayOfMonth();
            interfaceC81111VsR.LIZ(this.LJLJJL, i2);
        }
    }
}
