package X;

/* loaded from: classes16.dex */
public final class YJ9 implements InterfaceC87174YJe {
    public static final YJ9 LIZ = new YJ9();

    @Override // X.InterfaceC87174YJe
    public final boolean LIZ(Class<?> cls) {
        return YIO.class.isAssignableFrom(cls);
    }

    @Override // X.InterfaceC87174YJe
    public final InterfaceC87181YJl LIZIZ(Class<?> cls) {
        String str;
        String str2;
        if (!YIO.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unsupported message type: ".concat(name);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (InterfaceC87181YJl) YIO.LJIIJJI(cls.asSubclass(YIO.class)).LJIIIIZZ(3);
        } catch (Exception e) {
            String name2 = cls.getName();
            if (name2.length() != 0) {
                str = "Unable to get message info for ".concat(name2);
            } else {
                str = new String("Unable to get message info for ");
            }
            throw new RuntimeException(str, e);
        }
    }
}
