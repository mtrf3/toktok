package X;

/* renamed from: X.DOa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33792DOa extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33792DOa LJLIL = new C33792DOa();

    public C33792DOa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C33793DOb.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
