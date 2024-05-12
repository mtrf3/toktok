package X;

/* loaded from: classes15.dex */
public final class VKM {
    public static final VKO LIZ;
    public static final VKN LIZIZ;

    static {
        VKO vko;
        try {
            vko = (VKO) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            vko = null;
        }
        LIZ = vko;
        LIZIZ = new VKN();
    }
}
