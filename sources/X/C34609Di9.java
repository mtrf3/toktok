package X;

/* renamed from: X.Di9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34609Di9 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34609Di9 LJLIL = new C34609Di9();

    public C34609Di9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C34608Di8.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
