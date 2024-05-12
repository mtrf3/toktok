package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.2iB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65832iB {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C188727au c188727au, java.util.Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    String str = (String) entry.getKey();
                    Object value2 = entry.getValue();
                    o.LJII(value2, "null cannot be cast to non-null type kotlin.String");
                    c188727au.LJI(str, (String) value2);
                } else if (value instanceof Boolean) {
                    String str2 = (String) entry.getKey();
                    Object value3 = entry.getValue();
                    o.LJII(value3, "null cannot be cast to non-null type kotlin.Boolean");
                    c188727au.LJFF(value3, str2);
                } else if (value instanceof Integer) {
                    String str3 = (String) entry.getKey();
                    Object value4 = entry.getValue();
                    o.LJII(value4, "null cannot be cast to non-null type kotlin.Int");
                    c188727au.LIZLLL(((Integer) value4).intValue(), str3);
                }
            }
        }
    }
}
