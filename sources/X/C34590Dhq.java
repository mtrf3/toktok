package X;

/* renamed from: X.Dhq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34590Dhq extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34590Dhq LJLIL = new C34590Dhq();

    public C34590Dhq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C34588Dho.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
