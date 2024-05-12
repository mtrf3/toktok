package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UTU {
    public static boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static boolean LJ;
    public static final UTU LIZ = new UTU();
    public static long LIZIZ = 60000;
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(LTL.INSTANCE);

    public static long LIZ() {
        SpringApiLimitConfig springApiLimitConfig = (SpringApiLimitConfig) LJFF.getValue();
        if (springApiLimitConfig != null) {
            try {
                long longValue = springApiLimitConfig.getEndTime().longValue();
                Long startTime = springApiLimitConfig.getStartTime();
                o.LJIIIIZZ(startTime, "it.startTime");
                long longValue2 = longValue - startTime.longValue();
                long currentTimeMillis = System.currentTimeMillis();
                if (longValue2 >= 0) {
                    Long startTime2 = springApiLimitConfig.getStartTime();
                    o.LJIIIIZZ(startTime2, "it.startTime");
                    if (currentTimeMillis - startTime2.longValue() >= 0) {
                        Long endTime = springApiLimitConfig.getEndTime();
                        o.LJIIIIZZ(endTime, "it.endTime");
                        if (currentTimeMillis - endTime.longValue() <= 0) {
                            try {
                                double random = Math.random();
                                long longValue3 = springApiLimitConfig.getLimitEndTime().longValue();
                                Long limitStartTime = springApiLimitConfig.getLimitStartTime();
                                o.LJIIIIZZ(limitStartTime, "limitStartTime");
                                double longValue4 = random * (longValue3 - limitStartTime.longValue());
                                Long limitStartTime2 = springApiLimitConfig.getLimitStartTime();
                                o.LJIIIIZZ(limitStartTime2, "limitStartTime");
                                return (long) (longValue4 + limitStartTime2.doubleValue());
                            } catch (Exception e) {
                                C16880lQ.LLLLIIL(e);
                                return 60000L;
                            }
                        }
                        return 60000L;
                    }
                    return 60000L;
                }
                return 60000L;
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
                return 60000L;
            }
        }
        return 60000L;
    }

    public static boolean LIZIZ(UTU utu) {
        UTW utw;
        utu.getClass();
        if (LIZLLL && !LIZJ && (TextUtils.isEmpty("") || ((utw = (UTW) ((LinkedHashMap) UTV.LIZ).get("")) != null && utw.LJLIL))) {
            return true;
        }
        return false;
    }
}
