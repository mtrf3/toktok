package X;

/* renamed from: X.DKn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33701DKn extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33701DKn LJLIL = new C33701DKn();

    public C33701DKn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C33700DKm.LIZ.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
