package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UIO {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, HashMap hashMap) {
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        hashMap.put("big_optimize", 1);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append("_all");
        C0K2.LJII(0, X1D.LIZIZ(LIZ2), hashMap);
    }

    public static void LIZIZ(String str, Throwable e) {
        o.LJIIIZ(e, "e");
        UIM.Companion.getClass();
        UIM LIZ2 = UIL.LIZ(e);
        LIZJ(str, LIZ2.getErrorCode(), LIZ2.getDetailCode(), e.getMessage(), null);
    }

    public static void LIZJ(String str, Integer num, Integer num2, String str2, HashMap hashMap) {
        int i;
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        int i2 = -1;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        hashMap.put("error_code", Integer.valueOf(i));
        if (num2 != null) {
            i2 = num2.intValue();
        }
        hashMap.put("detail_code", Integer.valueOf(i2));
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("error_msg", str2);
        hashMap.put("big_optimize", 1);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append("_all");
        C0K2.LJII(1, X1D.LIZIZ(LIZ2), hashMap);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(str);
        LIZ3.append("_error");
        C0K2.LJII(1, X1D.LIZIZ(LIZ3), hashMap);
    }
}
