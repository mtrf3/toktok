package X;

/* renamed from: X.OiX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62661OiX extends AbstractC65781Prl implements InterfaceC65784Pro<Class<?>> {
    public static final C62661OiX LJLIL = new C62661OiX();

    public C62661OiX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Class<?> invoke() {
        try {
            return Class.forName("android.view.WindowManagerGlobal");
        } catch (Exception unused) {
            return null;
        }
    }
}
