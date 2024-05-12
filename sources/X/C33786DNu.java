package X;

/* renamed from: X.DNu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33786DNu extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33786DNu LJLIL = new C33786DNu();

    public C33786DNu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C33785DNt.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
