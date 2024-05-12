package X;

/* renamed from: X.FzF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40765FzF {
    public static EnumC40761FzB LIZ(int i) {
        return EnumC40761FzB.map.get(Integer.valueOf(i));
    }

    public static String LIZIZ(Integer num) {
        if (num != null && LIZ(num.intValue()) != null) {
            EnumC40761FzB LIZ = LIZ(num.intValue());
            if (LIZ != null) {
                return LIZ.getDesc();
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        return "unknown";
    }
}
