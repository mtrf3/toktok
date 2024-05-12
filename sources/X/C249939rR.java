package X;

import com.bytedance.keva.Keva;
import java.util.Calendar;
import kotlin.jvm.internal.o;

/* renamed from: X.9rR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249939rR {
    public static final /* synthetic */ int LJI = 0;
    public final Keva LIZ = Keva.getRepo("fission_sp");
    public final C250159rn LIZIZ = new C250159rn();
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public int LJ = -1;
    public int LJFF = -1;

    public final Keva LIZLLL() {
        Keva keva = this.LIZ;
        o.LJIIIIZZ(keva, "keva");
        return keva;
    }

    public static long LIZ() {
        Calendar calendar = Calendar.getInstance();
        o.LJIIIIZZ(calendar, "calendar");
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static String LIZIZ() {
        Calendar calendar = Calendar.getInstance();
        o.LJIIIIZZ(calendar, "calendar");
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return String.valueOf(calendar.getTimeInMillis());
    }

    public final int LIZJ() {
        if (o.LJ(LIZIZ(), LIZLLL().getString("current_day", ""))) {
            return LIZLLL().getInt("today_showed_time", 0);
        }
        LIZLLL().storeString("current_day", LIZIZ());
        LIZLLL().storeInt("today_showed_time", 0);
        return 0;
    }
}
