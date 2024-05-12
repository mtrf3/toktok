package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.concurrent.TimeUnit;
import ujb.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class ERY {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ(String str) {
        if (o.LJJJJ(str, "h", false)) {
            return TimeUnit.HOURS.toSeconds(CastLongProtector.parseLong((String) ListProtector.get(s.LJLJJL(str, new String[]{"h"}, 0, 6), 0)));
        }
        if (o.LJJJJ(str, "ms", false)) {
            return TimeUnit.MILLISECONDS.toSeconds(CastLongProtector.parseLong((String) ListProtector.get(s.LJLJJL(str, new String[]{"ms"}, 0, 6), 0)));
        }
        if (o.LJJJJ(str, "m", false)) {
            return TimeUnit.MINUTES.toSeconds(CastLongProtector.parseLong((String) ListProtector.get(s.LJLJJL(str, new String[]{"m"}, 0, 6), 0)));
        }
        if (o.LJJJJ(str, "s", false)) {
            return TimeUnit.SECONDS.toSeconds(CastLongProtector.parseLong((String) ListProtector.get(s.LJLJJL(str, new String[]{"s"}, 0, 6), 0)));
        }
        return 0L;
    }
}
