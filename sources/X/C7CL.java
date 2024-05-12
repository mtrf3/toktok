package X;

/* renamed from: X.7CL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7CL extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C7CL LJLIL = new C7CL();

    public C7CL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C7CP.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
