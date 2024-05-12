package X;

import android.text.TextUtils;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;
import com.zhiliaoapp.musically.R;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* renamed from: X.VjI, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC80544VjI extends C80335Vfv {
    public final C80315Vfb LJLIL;
    public final DateFormat LJLILLLLZI;
    public final CalendarConstraints LJLJI;
    public final String LJLJJI;
    public final RunnableC80545VjJ LJLJJL;
    public RunnableC80551VjP LJLJJLL;

    public abstract void LIZ();

    public abstract void LIZIZ(Long l);

    public AbstractC80544VjI(String str, DateFormat dateFormat, C80315Vfb c80315Vfb, CalendarConstraints calendarConstraints) {
        this.LJLILLLLZI = dateFormat;
        this.LJLIL = c80315Vfb;
        this.LJLJI = calendarConstraints;
        this.LJLJJI = c80315Vfb.getContext().getString(R.string.i_5);
        this.LJLJJL = new RunnableC80545VjJ(this, str);
    }

    @Override // X.C80335Vfv, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.LJLIL.removeCallbacks(this.LJLJJL);
        this.LJLIL.removeCallbacks(this.LJLJJLL);
        this.LJLIL.setError(null);
        LIZIZ(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            Date parse = this.LJLILLLLZI.parse(charSequence.toString());
            this.LJLIL.setError(null);
            long time = parse.getTime();
            if (this.LJLJI.validator.LLLILZJ(time)) {
                CalendarConstraints calendarConstraints = this.LJLJI;
                if (calendarConstraints.start.LJIIIIZZ(1) <= time) {
                    Month month = calendarConstraints.end;
                    if (time <= month.LJIIIIZZ(month.LJLJJI)) {
                        LIZIZ(Long.valueOf(parse.getTime()));
                        return;
                    }
                }
            }
            RunnableC80551VjP runnableC80551VjP = new RunnableC80551VjP(this, time);
            this.LJLJJLL = runnableC80551VjP;
            this.LJLIL.postDelayed(runnableC80551VjP, 1000L);
        } catch (ParseException unused) {
            this.LJLIL.postDelayed(this.LJLJJL, 1000L);
        }
    }
}
