package X;

import com.bytedance.keva.Keva;
import java.util.Calendar;
import kotlin.jvm.internal.o;

/* renamed from: X.9sr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C250819sr {
    public final String LIZ = "pendant_close_day_list";
    public final Keva LIZIZ;

    public C250819sr() {
        Keva repo = Keva.getRepo("time_stamp_count_helper");
        o.LJIIIIZZ(repo, "getRepo(KEVA_NAME)");
        this.LIZIZ = repo;
    }

    public static long LIZ() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
