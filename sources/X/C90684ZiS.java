package X;

/* renamed from: X.ZiS, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90684ZiS implements InterfaceC90313ZcT {
    public static final C90684ZiS LIZ = new C90684ZiS();

    @Override // X.InterfaceC90313ZcT
    public final boolean LIZ(Class<?> cls) {
        return AbstractC90950Zmk.class.isAssignableFrom(cls);
    }

    @Override // X.InterfaceC90313ZcT
    public final InterfaceC90305ZcL LIZIZ(Class<?> cls) {
        String str;
        String str2;
        if (!AbstractC90950Zmk.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unsupported message type: ".concat(name);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (InterfaceC90305ZcL) AbstractC90950Zmk.LJII(cls.asSubclass(AbstractC90950Zmk.class)).LJ(3, null);
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
