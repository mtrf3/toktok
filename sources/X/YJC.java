package X;

/* loaded from: classes16.dex */
public final class YJC implements InterfaceC87184YJo {
    public static final YJC LIZ = new YJC();

    @Override // X.InterfaceC87184YJo
    public final boolean LIZ(Class cls) {
        return YIN.class.isAssignableFrom(cls);
    }

    @Override // X.InterfaceC87184YJo
    public final InterfaceC87182YJm LIZIZ(Class cls) {
        if (YIN.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC87182YJm) YIN.LJIIL(cls.asSubclass(YIN.class)).LJIIZILJ(3);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }
}
