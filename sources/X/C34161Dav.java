package X;

/* renamed from: X.Dav, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34161Dav extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34161Dav LJLIL = new C34161Dav();

    public C34161Dav() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C34162Daw.LIZ.getValue()).intValue() & 1) <= 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
