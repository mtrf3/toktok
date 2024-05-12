package X;

import com.bytedance.keva.Keva;
import java.util.Calendar;

/* loaded from: classes7.dex */
public final class E7Q {
    public static final Keva LIZ = Keva.getRepo("click_on_this_day");

    public static OSZ LIZ(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return new OSZ(Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)));
    }
}
