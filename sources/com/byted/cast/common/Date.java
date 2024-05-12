package com.byted.cast.common;

import X.X1D;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes29.dex */
public class Date {
    public static final String[] MONTH_STRING = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] WEEK_STRING = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    public Calendar cal;

    public static final Date getInstance() {
        return new Date(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
    }

    public static final Date getLocalInstance() {
        return new Date(Calendar.getInstance());
    }

    public String getDateString() {
        Calendar calendar = getCalendar();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(toWeekString(calendar.get(7)));
        LIZ.append(", ");
        LIZ.append(toTimeString(calendar.get(5)));
        LIZ.append(" ");
        LIZ.append(toMonthString(calendar.get(2)));
        LIZ.append(" ");
        LIZ.append(Integer.toString(calendar.get(1)));
        LIZ.append(" ");
        LIZ.append(toTimeString(calendar.get(11)));
        LIZ.append(":");
        LIZ.append(toTimeString(calendar.get(12)));
        LIZ.append(":");
        LIZ.append(toTimeString(calendar.get(13)));
        LIZ.append(" GMT");
        return X1D.LIZIZ(LIZ);
    }

    public int getHour() {
        return getCalendar().get(11);
    }

    public int getMinute() {
        return getCalendar().get(12);
    }

    public int getSecond() {
        return getCalendar().get(13);
    }

    public String getTimeString() {
        String str;
        Calendar calendar = getCalendar();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(toDateString(calendar.get(11)));
        if (calendar.get(13) % 2 == 0) {
            str = ":";
        } else {
            str = " ";
        }
        LIZ.append(str);
        LIZ.append(toDateString(calendar.get(12)));
        return X1D.LIZIZ(LIZ);
    }

    public Calendar getCalendar() {
        return this.cal;
    }

    public Date(Calendar calendar) {
        this.cal = calendar;
    }

    public static final String toDateString(int i) {
        if (i < 10) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(CardStruct.IStatusCode.DEFAULT);
            LIZ.append(Integer.toString(i));
            return X1D.LIZIZ(LIZ);
        }
        return Integer.toString(i);
    }

    public static final String toMonthString(int i) {
        if (i >= 0 && i < 12) {
            return MONTH_STRING[i];
        }
        return "";
    }

    public static final String toTimeString(int i) {
        String str = "";
        if (i < 10) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(CardStruct.IStatusCode.DEFAULT);
            str = X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(Integer.toString(i));
        return X1D.LIZIZ(LIZ2);
    }

    public static final String toWeekString(int i) {
        int i2 = i - 1;
        if (i2 >= 0 && i2 < 7) {
            return WEEK_STRING[i2];
        }
        return "";
    }
}
