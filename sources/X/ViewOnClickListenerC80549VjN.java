package X;

import android.view.View;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;

/* renamed from: X.VjN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC80549VjN implements View.OnClickListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C80538VjC LJLILLLLZI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Month LJ = Month.LJ(this.LJLIL, this.LJLILLLLZI.LJLIL.LJLJJL.LJLIL);
        CalendarConstraints calendarConstraints = this.LJLILLLLZI.LJLIL.LJLJJI;
        if (LJ.compareTo(calendarConstraints.start) < 0) {
            LJ = calendarConstraints.start;
        } else if (LJ.compareTo(calendarConstraints.end) > 0) {
            LJ = calendarConstraints.end;
        }
        this.LJLILLLLZI.LJLIL.wl(LJ);
        this.LJLILLLLZI.LJLIL.xl(EnumC80555VjT.DAY);
    }

    public ViewOnClickListenerC80549VjN(C80538VjC c80538VjC, int i) {
        this.LJLILLLLZI = c80538VjC;
        this.LJLIL = i;
    }
}
