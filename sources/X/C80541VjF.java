package X;

import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.VjF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80541VjF extends BaseAdapter {
    public static final int LJLJJLL = C80561VjZ.LJIIIIZZ(null).getMaximum(4);
    public final Month LJLIL;
    public final DateSelector<?> LJLILLLLZI;
    public Collection<Long> LJLJI;
    public C80546VjK LJLJJI;
    public final CalendarConstraints LJLJJL;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public final int LIZIZ() {
        return this.LJLIL.LJII();
    }

    public final int LIZLLL() {
        return (this.LJLIL.LJII() + this.LJLIL.LJLJJI) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return LIZIZ() + this.LJLIL.LJLJJI;
    }

    @Override // android.widget.Adapter
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < this.LJLIL.LJII() || i > LIZLLL()) {
            return null;
        }
        Month month = this.LJLIL;
        return Long.valueOf(month.LJIIIIZZ((i - month.LJII()) + 1));
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.LJLIL.LJLJI;
    }

    public final void LJ(TextView textView, long j) {
        C80339Vfz c80339Vfz;
        if (textView == null) {
            return;
        }
        if (this.LJLJJL.validator.LLLILZJ(j)) {
            textView.setEnabled(true);
            Iterator<Long> it = this.LJLILLLLZI.LJLLILLLL().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C80561VjZ.LIZ(j) == C80561VjZ.LIZ(it.next().longValue())) {
                        c80339Vfz = this.LJLJJI.LIZIZ;
                        break;
                    }
                } else if (C80561VjZ.LJII().getTimeInMillis() == j) {
                    c80339Vfz = this.LJLJJI.LIZJ;
                } else {
                    c80339Vfz = this.LJLJJI.LIZ;
                }
            }
        } else {
            textView.setEnabled(false);
            c80339Vfz = this.LJLJJI.LJI;
        }
        c80339Vfz.LIZIZ(textView);
    }

    public final void LJFF(C80539VjD c80539VjD, long j) {
        if (Month.LJI(j).equals(this.LJLIL)) {
            LJ((TextView) c80539VjD.getChildAt((c80539VjD.getAdapter2().LIZIZ() + (this.LJLIL.LJIIIZ(j) - 1)) - c80539VjD.getFirstVisiblePosition()), j);
        }
    }

    public C80541VjF(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.LJLIL = month;
        this.LJLILLLLZI = dateSelector;
        this.LJLJJL = calendarConstraints;
        this.LJLJI = dateSelector.LJLLILLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
            r9 = this;
            android.content.Context r1 = r12.getContext()
            X.VjK r0 = r9.LJLJJI
            if (r0 != 0) goto Lf
            X.VjK r0 = new X.VjK
            r0.<init>(r1)
            r9.LJLJJI = r0
        Lf:
            r4 = r11
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 0
            if (r11 != 0) goto L1e
            r0 = 2131561808(0x7f0d0d50, float:1.8749027E38)
            android.view.View r4 = X.C28289B8j.LIZ(r12, r0, r12, r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
        L1e:
            int r0 = r9.LIZIZ()
            int r2 = r10 - r0
            if (r2 < 0) goto L2c
            com.google.android.material.datepicker.Month r1 = r9.LJLIL
            int r0 = r1.LJLJJI
            if (r2 < r0) goto L43
        L2c:
            r0 = 8
            r4.setVisibility(r0)
            r4.setEnabled(r5)
        L34:
            java.lang.Long r0 = r9.getItem(r10)
            if (r0 != 0) goto L3b
        L3a:
            return r4
        L3b:
            long r0 = r0.longValue()
            r9.LJ(r4, r0)
            goto L3a
        L43:
            r6 = 1
            int r3 = r2 + 1
            r4.setTag(r1)
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r2 = r0.locale
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1[r5] = r0
            java.lang.String r0 = "%d"
            java.lang.String r0 = X.C16880lQ.LLLZI(r2, r0, r1)
            r4.setText(r0)
            com.google.android.material.datepicker.Month r0 = r9.LJLIL
            long r2 = r0.LJIIIIZZ(r3)
            com.google.android.material.datepicker.Month r0 = r9.LJLIL
            int r8 = r0.LJLILLLLZI
            com.google.android.material.datepicker.Month r1 = new com.google.android.material.datepicker.Month
            java.util.Calendar r0 = X.C80561VjZ.LJII()
            r1.<init>(r0)
            int r0 = r1.LJLILLLLZI
            r7 = 24
            if (r8 != r0) goto Lac
            java.util.Locale r1 = java.util.Locale.getDefault()
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r7) goto L9e
            java.lang.String r0 = "MMMEd"
            android.icu.text.DateFormat r1 = X.C80561VjZ.LIZJ(r0, r1)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.lang.String r0 = r1.format(r0)
        L94:
            r4.setContentDescription(r0)
        L97:
            r4.setVisibility(r5)
            r4.setEnabled(r6)
            goto L34
        L9e:
            java.text.DateFormat r1 = X.C80561VjZ.LJ(r5, r1)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.lang.String r0 = r1.format(r0)
            goto L94
        Lac:
            java.util.Locale r1 = java.util.Locale.getDefault()
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r7) goto Lc7
            java.lang.String r0 = "yMMMEd"
            android.icu.text.DateFormat r1 = X.C80561VjZ.LIZJ(r0, r1)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.lang.String r0 = r1.format(r0)
        Lc3:
            r4.setContentDescription(r0)
            goto L97
        Lc7:
            java.text.DateFormat r1 = X.C80561VjZ.LJ(r5, r1)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.lang.String r0 = r1.format(r0)
            goto Lc3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80541VjF.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
