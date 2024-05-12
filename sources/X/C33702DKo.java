package X;

/* renamed from: X.DKo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33702DKo extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33702DKo LJLIL = new C33702DKo();

    public C33702DKo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C33700DKm.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
