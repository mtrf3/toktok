package X;

/* renamed from: X.Dim, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34648Dim extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34648Dim LJLIL = new C34648Dim();

    public C34648Dim() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C34646Dik.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
