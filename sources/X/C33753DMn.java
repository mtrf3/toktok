package X;

/* renamed from: X.DMn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33753DMn extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33753DMn LJLIL = new C33753DMn();

    public C33753DMn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33752DMm.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
