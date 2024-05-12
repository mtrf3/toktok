package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C250159rn {
    public final Keva LIZ;
    public final String LIZIZ = "pendant_close_day_list";

    public C250159rn() {
        Keva repo = Keva.getRepo("time_stamp_count_helper");
        o.LJIIIIZZ(repo, "Keva.getRepo(KEVA_NAME)");
        this.LIZ = repo;
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

    public final int LIZIZ(int i) {
        int i2;
        if (i <= 0) {
            i2 = 0;
        } else {
            i2 = i - 1;
        }
        long LIZ = LIZ();
        String[] stringArray = this.LIZ.getStringArray(this.LIZIZ, new String[0]);
        o.LJIIIIZZ(stringArray, "getKeva().getStringArray(type, arrayOf())");
        List LJLIIIL = ORY.LJLIIIL(stringArray);
        ArrayList arrayList = new ArrayList();
        long j = LIZ - (i2 * 86400000);
        Iterator it = ((ArrayList) LJLIIIL).iterator();
        while (it.hasNext()) {
            Long LJJIZ = C38350F3i.LJJIZ((String) it.next());
            if (LJJIZ != null && LJJIZ.longValue() >= j) {
                arrayList.add(String.valueOf(LJJIZ.longValue()));
            }
        }
        return arrayList.size();
    }
}
