package X;

import com.bytedance.hybrid.spark.SparkContext;
import java.util.LinkedHashMap;

/* renamed from: X.FcZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39359FcZ {
    public static InterfaceC40159FpT LIZ(String str) {
        java.util.Map<String, String> map = F1U.LIZ;
        if (map.containsKey(str)) {
            str = (String) ((LinkedHashMap) map).get(str);
        }
        C60737Nsb LIZIZ = LIZIZ(str);
        if (LIZIZ != null) {
            return (InterfaceC40159FpT) LIZIZ.LIZIZ(InterfaceC40159FpT.class);
        }
        return null;
    }

    public static C60737Nsb LIZIZ(String str) {
        return SparkContext.hybridContextMap.get(str);
    }
}
