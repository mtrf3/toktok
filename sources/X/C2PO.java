package X;

/* renamed from: X.2PO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2PO extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C2PO LJLIL = new C2PO();

    public C2PO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) C2PN.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}