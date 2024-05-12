package X;

/* renamed from: X.DNs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33784DNs extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33784DNs LJLIL = new C33784DNs();

    public C33784DNs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33785DNt.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
