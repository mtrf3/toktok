package X;

/* loaded from: classes16.dex */
public final class YJG {
    public static final YJ6 LIZ = new YJ6();
    public static final YJ7<?> LIZIZ;

    static {
        YJ7<?> yj7;
        try {
            yj7 = (YJ7) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            yj7 = null;
        }
        LIZIZ = yj7;
    }
}
