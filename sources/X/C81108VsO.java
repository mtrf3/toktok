package X;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.VsO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81108VsO extends LinearLayout implements InterfaceC80609VkL {
    public C80607VkJ LJLIL;
    public C80607VkJ LJLILLLLZI;
    public C80607VkJ LJLJI;
    public LinearLayout LJLJJI;
    public Calendar LJLJJL;
    public Calendar LJLJJLL;
    public InterfaceC81110VsQ LJLJL;
    public final LayoutInflater LJLJLJ;

    public void LIZIZ() {
        C16880lQ.LLLLIILL(this.LJLJLJ, R.layout.rh, this, true);
        this.LJLJJI = (LinearLayout) findViewById(R.id.hia);
        this.LJLIL = (C80607VkJ) findViewById(R.id.nkk);
        this.LJLILLLLZI = (C80607VkJ) findViewById(R.id.gm0);
        C80607VkJ c80607VkJ = (C80607VkJ) findViewById(R.id.c3r);
        this.LJLJI = c80607VkJ;
        C80607VkJ c80607VkJ2 = this.LJLIL;
        if (c80607VkJ2 != null) {
            c80607VkJ2.LLIILZL = this;
        }
        C80607VkJ c80607VkJ3 = this.LJLILLLLZI;
        if (c80607VkJ3 != null) {
            c80607VkJ3.LLIILZL = this;
        }
        if (c80607VkJ != null) {
            c80607VkJ.LLIILZL = this;
        }
    }

    public final int getDayOfMonth() {
        return this.LJLJJL.get(5);
    }

    public final int getMonth() {
        return this.LJLJJL.get(2) + 1;
    }

    public final int getYear() {
        return this.LJLJJL.get(1);
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

    public final void LIZJ(Date date) {
        this.LJLJJL.setTime(date);
        C80607VkJ c80607VkJ = this.LJLJI;
        if (c80607VkJ != null) {
            c80607VkJ.LJ(this.LJLJJL.getActualMaximum(5));
        }
        C80607VkJ c80607VkJ2 = this.LJLIL;
        if (c80607VkJ2 != null) {
            c80607VkJ2.LIZLLL(this.LJLJJL.get(1));
        }
        C80607VkJ c80607VkJ3 = this.LJLILLLLZI;
        if (c80607VkJ3 != null) {
            c80607VkJ3.LIZLLL(this.LJLJJL.get(2) + 1);
        }
        C80607VkJ c80607VkJ4 = this.LJLJI;
        if (c80607VkJ4 != null) {
            c80607VkJ4.LIZLLL(this.LJLJJL.get(5));
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
        Calendar calendar2;
        C80607VkJ c80607VkJ;
        if (calendar == null) {
            calendar2 = Calendar.getInstance();
            o.LJIIIIZZ(calendar2, "getInstance()");
        } else {
            calendar2 = calendar;
        }
        this.LJLJJLL = calendar2;
        if (calendar != null) {
            C80607VkJ c80607VkJ2 = this.LJLIL;
            if (c80607VkJ2 != null) {
                c80607VkJ2.LJ(calendar2.get(1));
            }
            if (this.LJLJJL.get(1) == this.LJLJJLL.get(1)) {
                C80607VkJ c80607VkJ3 = this.LJLILLLLZI;
                if (c80607VkJ3 != null) {
                    c80607VkJ3.LJ(this.LJLJJLL.get(2) + 1);
                }
                if (this.LJLJJL.get(2) == this.LJLJJLL.get(2) && (c80607VkJ = this.LJLJI) != null) {
                    c80607VkJ.LJ(this.LJLJJLL.get(5));
                }
            }
        }
    }

    public final void setYearPicker(C80607VkJ c80607VkJ) {
        this.LJLIL = c80607VkJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0037, code lost:
    
        r3 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C81108VsO(android.content.Context r16, android.util.AttributeSet r17) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81108VsO.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // X.InterfaceC80609VkL
    public final void LIZ(C80607VkJ c80607VkJ, int i) {
        int i2 = 2;
        if (o.LJ(c80607VkJ, this.LJLIL)) {
            int i3 = this.LJLJJL.get(5);
            int i4 = this.LJLJJL.get(2);
            Calendar calendar = this.LJLJJLL;
            if (calendar != null && i == calendar.get(1)) {
                if (i4 > this.LJLJJLL.get(2)) {
                    i4 = this.LJLJJLL.get(2);
                }
                C80607VkJ c80607VkJ2 = this.LJLILLLLZI;
                if (c80607VkJ2 != null) {
                    c80607VkJ2.LJ(this.LJLJJLL.get(2) + 1);
                }
            } else {
                C80607VkJ c80607VkJ3 = this.LJLILLLLZI;
                if (c80607VkJ3 != null) {
                    c80607VkJ3.LJ(this.LJLJJL.getActualMaximum(2) + 1);
                }
            }
            this.LJLJJL.set(i, i4, 1);
            int actualMaximum = this.LJLJJL.getActualMaximum(5);
            Calendar calendar2 = this.LJLJJLL;
            if (calendar2 != null && i == calendar2.get(1) && i4 == this.LJLJJLL.get(2)) {
                actualMaximum = this.LJLJJLL.get(5);
            }
            if (i3 > actualMaximum) {
                i3 = actualMaximum;
            }
            this.LJLJJL.set(5, i3);
            C80607VkJ c80607VkJ4 = this.LJLJI;
            if (c80607VkJ4 != null) {
                c80607VkJ4.LJ(actualMaximum);
            }
            i2 = 1;
        } else if (o.LJ(c80607VkJ, this.LJLILLLLZI)) {
            int i5 = this.LJLJJL.get(5);
            Calendar calendar3 = this.LJLJJL;
            int i6 = i - 1;
            calendar3.set(calendar3.get(1), i6, 1);
            int actualMaximum2 = this.LJLJJL.getActualMaximum(5);
            if (this.LJLJJLL != null && this.LJLJJL.get(1) == this.LJLJJLL.get(1) && i6 == this.LJLJJLL.get(2)) {
                actualMaximum2 = this.LJLJJLL.get(5);
            }
            if (i5 > actualMaximum2) {
                i5 = actualMaximum2;
            }
            this.LJLJJL.set(5, i5);
            C80607VkJ c80607VkJ5 = this.LJLJI;
            if (c80607VkJ5 != null) {
                c80607VkJ5.LJ(actualMaximum2);
            }
        } else if (o.LJ(c80607VkJ, this.LJLJI)) {
            this.LJLJJL.set(5, i);
            i2 = 3;
        } else {
            i2 = 0;
        }
        InterfaceC81110VsQ interfaceC81110VsQ = this.LJLJL;
        if (interfaceC81110VsQ != null) {
            int year = getYear();
            getMonth();
            getDayOfMonth();
            interfaceC81110VsQ.LIZ(year, this.LJLJJL, i2);
        }
    }
}
