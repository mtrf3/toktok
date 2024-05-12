package X;

import android.content.res.Resources;
import com.zhiliaoapp.musically.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.VjZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80561VjZ {
    public static final AtomicReference<C80567Vjf> LIZ = new AtomicReference<>();

    public static SimpleDateFormat LJFF() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toLocalizedPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static Calendar LJII() {
        Calendar calendar;
        C80567Vjf c80567Vjf = LIZ.get();
        if (c80567Vjf == null) {
            c80567Vjf = C80567Vjf.LIZJ;
        }
        TimeZone timeZone = c80567Vjf.LIZIZ;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = c80567Vjf.LIZ;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static long LIZ(long j) {
        Calendar LJIIIIZZ = LJIIIIZZ(null);
        LJIIIIZZ.setTimeInMillis(j);
        return LIZLLL(LJIIIIZZ).getTimeInMillis();
    }

    public static Calendar LIZLLL(Calendar calendar) {
        Calendar LJIIIIZZ = LJIIIIZZ(calendar);
        Calendar LJIIIIZZ2 = LJIIIIZZ(null);
        LJIIIIZZ2.set(LJIIIIZZ.get(1), LJIIIIZZ.get(2), LJIIIIZZ.get(5));
        return LJIIIIZZ2;
    }

    public static Calendar LJIIIIZZ(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    public static android.icu.text.DateFormat LIZJ(String str, Locale locale) {
        android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(android.icu.util.TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton;
    }

    public static DateFormat LJ(int i, Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateInstance;
    }

    public static String LJI(Resources resources, SimpleDateFormat simpleDateFormat) {
        String localizedPattern = simpleDateFormat.toLocalizedPattern();
        return localizedPattern.replaceAll("d", resources.getString(R.string.i_e)).replaceAll("M", resources.getString(R.string.i_f)).replaceAll("y", resources.getString(R.string.i_g));
    }

    public static int LIZIZ(int i, int i2, String str, String str2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) != '\'') {
                i2 += i;
            }
            do {
                i2 += i;
                if (i2 >= 0 && i2 < str.length()) {
                }
                i2 += i;
            } while (str.charAt(i2) != '\'');
            i2 += i;
        }
        return i2;
    }
}
