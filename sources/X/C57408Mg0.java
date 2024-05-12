package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.AppOpenTimes;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.AppOpenedTimesData;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.ScreenTimeDailyUsage;
import defpackage.i0;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.o;

/* renamed from: X.Mg0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57408Mg0 {
    public static final Keva LIZ = Keva.getRepo("used_app_duration_and_times");

    public static long LJ() {
        Keva keva = LIZ;
        long j = keva.getLong(LIZJ("start_time"), 0L);
        long j2 = keva.getLong(LIZJ("login_time"), 0L);
        if (j < j2) {
            j = j2;
        }
        if (j > System.currentTimeMillis() || j == 0) {
            keva.storeLong(LIZJ("start_time"), System.currentTimeMillis());
            keva.storeLong(LIZJ("login_time"), System.currentTimeMillis());
            return 0L;
        }
        return (System.currentTimeMillis() - j) / 1000;
    }

    public static int LIZIZ() {
        TimeZone timeZone = TimeZone.getTimeZone(TimeZone.getDefault().toString());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.get(5);
        Date parse = simpleDateFormat.parse(simpleDateFormat.format(new Date(0L)));
        o.LJI(parse);
        calendar.setTime(parse);
        Calendar calendar2 = Calendar.getInstance();
        Date parse2 = simpleDateFormat.parse(simpleDateFormat.format(new Date(System.currentTimeMillis())));
        o.LJI(parse2);
        calendar2.setTime(parse2);
        return (int) (((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) + r6.getRawOffset()) / 86400000);
    }

    public static String LIZJ(String str) {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null || curUserId.length() == 0) {
            return str;
        }
        return i0.LJFF(str, curUserId);
    }

    public static boolean LIZLLL(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(11);
        if (i >= 22 || i < 6) {
            return true;
        }
        return false;
    }

    public static void LJFF(int i) {
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        Keva keva = LIZ;
        long j = keva.getLong(LIZJ("start_time"), 0L);
        long j2 = keva.getLong(LIZJ("login_time"), 0L);
        if (j < j2) {
            j = j2;
        }
        if (j > System.currentTimeMillis() || j == 0) {
            keva.storeLong(LIZJ("login_time"), System.currentTimeMillis());
            keva.storeLong(LIZJ("start_time"), System.currentTimeMillis());
        } else {
            keva.storeLong(LIZJ("start_time"), j);
        }
        keva.storeLong(LIZJ("duration_time"), keva.getLong(LIZJ("duration_time"), 0L) + (System.currentTimeMillis() - keva.getLong(LIZJ("start_time"), System.currentTimeMillis())));
        if (LIZLLL(System.currentTimeMillis())) {
            C57412Mg4.LIZ(new AppOpenedTimesData(System.currentTimeMillis(), C47261Igj.LJJIJIL(new AppOpenTimes(LIZIZ(), 0, 1)), i));
        } else {
            C57412Mg4.LIZ(new AppOpenedTimesData(System.currentTimeMillis(), C47261Igj.LJJIJIL(new AppOpenTimes(LIZIZ(), 1, 0)), i));
        }
        if (keva.getLong(LIZJ("duration_time"), 0L) < 180000) {
            keva.storeLong(LIZJ("start_time"), System.currentTimeMillis());
            return;
        }
        if (keva.getLong(LIZJ("duration_time"), 0L) < 600000) {
            if (LIZLLL(System.currentTimeMillis())) {
                C57412Mg4.LIZIZ(i, C47261Igj.LJJIJIL(new ScreenTimeDailyUsage(LIZIZ(), 0, (int) (keva.getLong(LIZJ("duration_time"), 0L) / 1000))), System.currentTimeMillis());
            } else {
                C57412Mg4.LIZIZ(i, C47261Igj.LJJIJIL(new ScreenTimeDailyUsage(LIZIZ(), (int) (keva.getLong(LIZJ("duration_time"), 0L) / 1000), 0)), System.currentTimeMillis());
            }
        }
        keva.storeLong(LIZJ("start_time"), System.currentTimeMillis());
        keva.storeLong(LIZJ("duration_time"), 0L);
    }

    public static ConstraintLayout LIZ(Activity activity, int i) {
        ConstraintLayout constraintLayout = new ConstraintLayout(activity);
        ImageView imageView = new ImageView(activity);
        C33381Ss c33381Ss = new C33381Ss();
        c33381Ss.LJLIL = i;
        Context context = imageView.getContext();
        o.LJIIIIZZ(context, "context");
        imageView.setImageDrawable(c33381Ss.LIZ(context));
        C018905p c018905p = new C018905p(-1, -2);
        c018905p.topToTop = 0;
        c018905p.startToStart = 0;
        c018905p.endToEnd = 0;
        ((ViewGroup.MarginLayoutParams) c018905p).topMargin = C7MY.LIZIZ(32);
        ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = C7MY.LIZIZ(36);
        ((ViewGroup.MarginLayoutParams) c018905p).leftMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        ((ViewGroup.MarginLayoutParams) c018905p).rightMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        imageView.setLayoutParams(c018905p);
        constraintLayout.addView(imageView);
        return constraintLayout;
    }
}
