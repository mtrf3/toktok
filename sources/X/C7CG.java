package X;

/* renamed from: X.7CG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7CG extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C7CG LJLIL = new C7CG();

    public C7CG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C7CT.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
