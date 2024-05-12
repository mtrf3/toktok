package X;

/* renamed from: X.Ea7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36659Ea7 {
    public static final Integer LIZ;

    static {
        Integer num = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            if (obj instanceof Integer) {
                Integer num2 = (Integer) obj;
                if (num2 != null && num2.intValue() > 0) {
                    num = num2;
                }
            }
        } catch (Throwable unused) {
        }
        LIZ = num;
    }
}
