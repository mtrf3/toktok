package X;

/* renamed from: X.DpD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35047DpD extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35047DpD LJLIL = new C35047DpD();

    public C35047DpD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C35044DpA.LIZ.getValue()).intValue() & 2) > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
