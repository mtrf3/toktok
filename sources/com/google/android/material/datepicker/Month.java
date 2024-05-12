package com.google.android.material.datepicker;

import X.C80556VjU;
import X.C80561VjZ;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* loaded from: classes15.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C80556VjU();
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final long LJLJJL;
    public final Calendar firstOfMonth;
    public String longName;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI)});
    }

    public final int LJII() {
        int firstDayOfWeek = this.firstOfMonth.get(7) - this.firstOfMonth.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            return firstDayOfWeek + this.LJLJI;
        }
        return firstDayOfWeek;
    }

    public final long LJIIJJI() {
        return this.firstOfMonth.getTimeInMillis();
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar LIZLLL = C80561VjZ.LIZLLL(calendar);
        this.firstOfMonth = LIZLLL;
        this.LJLIL = LIZLLL.get(2);
        this.LJLILLLLZI = LIZLLL.get(1);
        this.LJLJI = LIZLLL.getMaximum(7);
        this.LJLJJI = LIZLLL.getActualMaximum(5);
        this.LJLJJL = LIZLLL.getTimeInMillis();
    }

    public static Month LJI(long j) {
        Calendar LJIIIIZZ = C80561VjZ.LJIIIIZZ(null);
        LJIIIIZZ.setTimeInMillis(j);
        return new Month(LJIIIIZZ);
    }

    @Override // java.lang.Comparable
    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Month month) {
        return this.firstOfMonth.compareTo(month.firstOfMonth);
    }

    public final long LJIIIIZZ(int i) {
        Calendar LIZLLL = C80561VjZ.LIZLLL(this.firstOfMonth);
        LIZLLL.set(5, i);
        return LIZLLL.getTimeInMillis();
    }

    public final int LJIIIZ(long j) {
        Calendar LIZLLL = C80561VjZ.LIZLLL(this.firstOfMonth);
        LIZLLL.setTimeInMillis(j);
        return LIZLLL.get(5);
    }

    public final String LJIIJ(Context context) {
        if (this.longName == null) {
            this.longName = DateUtils.formatDateTime(context, this.firstOfMonth.getTimeInMillis() - TimeZone.getDefault().getOffset(r2), 36);
        }
        return this.longName;
    }

    public final Month LJIIL(int i) {
        Calendar LIZLLL = C80561VjZ.LIZLLL(this.firstOfMonth);
        LIZLLL.add(2, i);
        return new Month(LIZLLL);
    }

    public final int LJIILIIL(Month month) {
        if (this.firstOfMonth instanceof GregorianCalendar) {
            return (month.LJLIL - this.LJLIL) + ((month.LJLILLLLZI - this.LJLILLLLZI) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.LJLIL == month.LJLIL && this.LJLILLLLZI == month.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    public static Month LJ(int i, int i2) {
        Calendar LJIIIIZZ = C80561VjZ.LJIIIIZZ(null);
        LJIIIIZZ.set(1, i);
        LJIIIIZZ.set(2, i2);
        return new Month(LJIIIIZZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.LJLILLLLZI);
        parcel.writeInt(this.LJLIL);
    }
}
