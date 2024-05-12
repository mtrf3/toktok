package X;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.Month;

/* renamed from: X.Vj5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80531Vj5 {
    public static final long LJ = C80561VjZ.LIZ(Month.LJ(1900, 0).LJLJJL);
    public static final long LJFF = C80561VjZ.LIZ(Month.LJ(2100, 11).LJLJJL);
    public final long LIZ;
    public final long LIZIZ;
    public Long LIZJ;
    public final CalendarConstraints.DateValidator LIZLLL;

    public C80531Vj5(CalendarConstraints calendarConstraints) {
        this.LIZ = LJ;
        this.LIZIZ = LJFF;
        this.LIZLLL = new DateValidatorPointForward(Long.MIN_VALUE);
        this.LIZ = calendarConstraints.start.LJLJJL;
        this.LIZIZ = calendarConstraints.end.LJLJJL;
        this.LIZJ = Long.valueOf(calendarConstraints.openAt.LJLJJL);
        this.LIZLLL = calendarConstraints.validator;
    }
}
