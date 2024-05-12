package X;

/* renamed from: X.DqL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35117DqL extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35117DqL LJLIL = new C35117DqL();

    public C35117DqL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C35116DqK.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
