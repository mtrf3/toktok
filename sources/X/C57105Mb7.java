package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.Mb7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57105Mb7 {
    public static final Locale LIZ;
    public static volatile SimpleDateFormat LIZIZ;
    public static final Object LIZJ;
    public static volatile SimpleDateFormat LIZLLL;
    public static final Object LJ;
    public static volatile SimpleDateFormat LJFF;
    public static final Object LJI;
    public static volatile SimpleDateFormat LJII;
    public static final Object LJIIIIZZ;

    static {
        Locale countryLocale = SettingServiceImpl.LIZ().getCountryLocale();
        LIZ = countryLocale;
        if (DZT.LIZ()) {
            LIZJ = new Object();
            LJ = new Object();
            LJI = new Object();
            LJIIIIZZ = new Object();
            return;
        }
        LIZIZ = new SimpleDateFormat("yyyy-MM-dd", countryLocale);
        LIZLLL = new SimpleDateFormat("MM-dd", countryLocale);
        LJFF = new SimpleDateFormat("M/d/yyyy", countryLocale);
        LJII = new SimpleDateFormat("M/d", countryLocale);
        new SimpleDateFormat("MM-dd", Locale.getDefault());
        new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    }

    public static SimpleDateFormat LJIIIIZZ() {
        if (DZT.LIZ() && LIZIZ == null) {
            synchronized (LIZJ) {
                if (LIZIZ == null) {
                    LIZIZ = new SimpleDateFormat("yyyy-MM-dd", LIZ);
                    return LIZIZ;
                }
            }
        }
        return LIZIZ;
    }

    public static SimpleDateFormat LJIIIZ() {
        if (DZT.LIZ() && LIZLLL == null) {
            synchronized (LJ) {
                if (LIZLLL == null) {
                    LIZLLL = new SimpleDateFormat("MM-dd", LIZ);
                    return LIZLLL;
                }
            }
        }
        return LIZLLL;
    }

    public static SimpleDateFormat LJIIJ() {
        if (DZT.LIZ()) {
            if (LJII == null) {
                synchronized (LJIIIIZZ) {
                    if (LJII == null) {
                        LJII = new SimpleDateFormat("M/d", LIZ);
                        return LJII;
                    }
                }
            }
            return LJII;
        }
        return LJII;
    }

    public static String LIZIZ(long j) {
        SimpleDateFormat simpleDateFormat;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(6, 0);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        if (j >= calendar2.getTimeInMillis() + 86400000) {
            return LJIIJ().format(calendar.getTime());
        }
        if (DZT.LIZ()) {
            if (LJFF == null) {
                synchronized (LJI) {
                    if (LJFF == null) {
                        LJFF = new SimpleDateFormat("M/d/yyyy", LIZ);
                        simpleDateFormat = LJFF;
                    }
                }
            }
            simpleDateFormat = LJFF;
        } else {
            simpleDateFormat = LJFF;
        }
        return simpleDateFormat.format(calendar.getTime());
    }

    public static int LJII(Long l) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(l.longValue()));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return (int) ((calendar2.getTime().getTime() - calendar.getTime().getTime()) / 86400000);
    }

    public static int LJIIJJI(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - calendar.getTimeInMillis();
        if (timeInMillis <= 86400000) {
            return 1;
        }
        if (timeInMillis <= 172800000) {
            return 2;
        }
        if (timeInMillis <= 604800000) {
            return 3;
        }
        if (timeInMillis <= 2592000000L) {
            return 4;
        }
        return 5;
    }

    public static String LIZ(long j, Context context) {
        if (j < 0) {
            return "";
        }
        if (j < 60000) {
            return context.getString(R.string.hkw);
        }
        if (j < 3600000) {
            return context.getString(R.string.sau, Long.valueOf(j / 60000));
        }
        if (j < 86400000) {
            return context.getString(R.string.sas, Long.valueOf(j / 3600000));
        }
        return context.getString(R.string.saq, Long.valueOf(j / 86400000));
    }

    public static String LIZJ(long j, Context context) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis < 60000) {
            long j2 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j2 <= 0) {
                j2 = 1;
            }
            objArr[0] = Long.valueOf(j2);
            return context.getString(R.string.q5f, objArr);
        }
        if (timeInMillis < 3600000) {
            return context.getString(R.string.sau, Long.valueOf(timeInMillis / 60000));
        }
        if (timeInMillis < 86400000) {
            return context.getString(R.string.sas, Long.valueOf(timeInMillis / 3600000));
        }
        if (timeInMillis < 604800000) {
            return context.getString(R.string.saq, Long.valueOf(timeInMillis / 86400000));
        }
        long j3 = timeInMillis - 604800000;
        if (j3 > 0 && j3 <= 86400000) {
            return context.getString(R.string.sax, 1);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(6, 0);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        if (j >= calendar2.getTimeInMillis() + 86400000) {
            return LJIIIZ().format(calendar.getTime());
        }
        return LJIIIIZZ().format(calendar.getTime());
    }

    public static String LIZLLL(long j, Context context) {
        String LIZIZ2;
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis < 604800000) {
            LIZIZ2 = LIZ(timeInMillis, context);
        } else {
            LIZIZ2 = LIZIZ(j);
        }
        if (!TextUtils.isEmpty(LIZIZ2)) {
            return i0.LJFF(" · ", LIZIZ2);
        }
        return LIZIZ2;
    }

    public static String LJ(long j, Context context) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis < 604800000) {
            return LIZ(timeInMillis, context);
        }
        return context.getString(R.string.sax, Long.valueOf(timeInMillis / 604800000));
    }

    public static String LJFF(long j, Context context) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis <= 0) {
            return "";
        }
        if (timeInMillis < 60000) {
            long j2 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j2 == 0) {
                j2 = 1;
            }
            objArr[0] = Long.valueOf(j2);
            return context.getString(R.string.saw, objArr);
        }
        if (timeInMillis < 3600000) {
            return context.getString(R.string.sav, Long.valueOf(timeInMillis / 60000));
        }
        if (timeInMillis < 86400000) {
            return context.getString(R.string.sat, Long.valueOf(timeInMillis / 3600000));
        }
        if (timeInMillis < 604800000) {
            return context.getString(R.string.sar, Long.valueOf(timeInMillis / 86400000));
        }
        long j3 = timeInMillis - 604800000;
        if (j3 > 0 && j3 <= 86400000) {
            return context.getString(R.string.say, 1);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(6, 0);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        if (j >= calendar2.getTimeInMillis() + 86400000) {
            return LJIIIZ().format(calendar.getTime());
        }
        return LJIIIIZZ().format(calendar.getTime());
    }

    public static String LJI(long j, Context context) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis <= 0) {
            return "";
        }
        if (timeInMillis < 60000) {
            long j2 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j2 == 0) {
                j2 = 1;
            }
            objArr[0] = Long.valueOf(j2);
            return context.getString(R.string.saw, objArr);
        }
        if (timeInMillis < 3600000) {
            return context.getString(R.string.sav, Long.valueOf(timeInMillis / 60000));
        }
        if (timeInMillis < 86400000) {
            return context.getString(R.string.sat, Long.valueOf(timeInMillis / 3600000));
        }
        if (timeInMillis < 604800000) {
            return context.getString(R.string.sar, Long.valueOf(timeInMillis / 86400000));
        }
        long j3 = timeInMillis - 604800000;
        if (j3 > 0 && j3 <= 86400000) {
            return context.getString(R.string.say, 1);
        }
        return C86036Xpg.LIZJ(j);
    }
}
