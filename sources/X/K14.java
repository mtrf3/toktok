package X;

/* loaded from: classes9.dex */
public final class K14 {
    public static final boolean LIZ;

    static {
        boolean z;
        String property = System.getProperty("kotlin.collections.convert_arg_to_set_in_removeAll");
        if (property != null) {
            z = Boolean.parseBoolean(property);
        } else {
            z = false;
        }
        LIZ = z;
    }
}
