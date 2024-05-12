package X;

import com.bytedance.hybrid.spark.SparkContext;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4ik, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117144ik {
    public static final C117144ik LIZIZ = new C117144ik();
    public static final java.util.Map<String, SparkContext> LIZ = new LinkedHashMap();

    public static SparkContext LIZ(String str) {
        java.util.Map<String, SparkContext> map = LIZ;
        if (str == null) {
            str = "";
        }
        return (SparkContext) ((LinkedHashMap) map).get(str);
    }

    public static void LIZIZ(SparkContext sparkContext) {
        o.LJIIJ(sparkContext, "sparkContext");
        LIZ.put(sparkContext.containerId, sparkContext);
    }
}
