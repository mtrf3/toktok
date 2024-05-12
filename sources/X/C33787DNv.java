package X;

/* renamed from: X.DNv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33787DNv extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33787DNv LJLIL = new C33787DNv();

    public C33787DNv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C33785DNt.LIZ.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
