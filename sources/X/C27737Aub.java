package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import ujb.o;

/* renamed from: X.Aub, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27737Aub {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZ(SparkContext sparkContext) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("schema", sparkContext.url);
        String LIZIZ = LIZIZ("previous_page", sparkContext.url);
        if (LIZIZ == null) {
            LIZIZ = "";
        }
        linkedHashMap.put("previous_page", LIZIZ);
        return linkedHashMap;
    }

    public static String LIZIZ(String str, String str2) {
        if (!o.LJJJJJL(str) && !o.LJJJJJL(str2)) {
            try {
                return UriProtector.getQueryParameter(UriProtector.parse(str2), str);
            } catch (Exception e) {
                C36746EbW.LIZ(6, e);
            }
        }
        return null;
    }

    public static void LIZLLL(SparkContext sparkContext, int i, String isOffline) {
        kotlin.jvm.internal.o.LJIIIZ(sparkContext, "sparkContext");
        kotlin.jvm.internal.o.LJIIIZ(isOffline, "isOffline");
        java.util.Map LIZ2 = LIZ(sparkContext);
        LIZ2.put("load_status", Integer.valueOf(i));
        LIZ2.put("is_offline", isOffline);
        C76542zS.LIZ("rd_spark_user_back", LIZ2);
    }

    public static void LIZJ(SparkContext sparkContext, int i, int i2, String errorMsg, long j, int i3) {
        Object source;
        int i4;
        Long LJJIZ;
        if ((i3 & 4) != 0) {
            source = "";
        } else {
            source = null;
        }
        if ((i3 & 8) != 0) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if ((i3 & 16) != 0) {
            i2 = -1;
        }
        if ((i3 & 32) != 0) {
            errorMsg = "";
        }
        if ((i3 & 128) != 0) {
            j = 0;
        }
        kotlin.jvm.internal.o.LJIIIZ(sparkContext, "sparkContext");
        kotlin.jvm.internal.o.LJIIIZ(source, "source");
        kotlin.jvm.internal.o.LJIIIZ(errorMsg, "errorMsg");
        java.util.Map LIZ2 = LIZ(sparkContext);
        String LIZIZ = LIZIZ("init_time", sparkContext.url);
        if (LIZIZ != null && (LJJIZ = C38350F3i.LJJIZ(LIZIZ)) != null) {
            j = LJJIZ.longValue();
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        LIZ2.put("load_status", Integer.valueOf(i));
        LIZ2.put("start_click_to_now", Long.valueOf(currentTimeMillis));
        LIZ2.put("source", source);
        LIZ2.put("is_success", Integer.valueOf(i4));
        LIZ2.put("error_code", Integer.valueOf(i2));
        LIZ2.put("error_message", errorMsg);
        LIZ2.put("is_retry", 0);
        FD6.LIZ(new AqS151S0100000_1(LIZ2, (java.util.Map<String, Object>) 953));
    }
}
