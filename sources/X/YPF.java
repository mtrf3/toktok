package X;

import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public class YPF implements YPH {
    @Override // X.YPH
    public final int getId() {
        return 1;
    }

    @Override // X.YPH
    public final boolean LIZ(long j, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
            if (dateValidator != null && dateValidator.LLLILZJ(j)) {
                return true;
            }
        }
        return false;
    }
}
