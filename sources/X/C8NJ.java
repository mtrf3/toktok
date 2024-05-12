package X;

/* renamed from: X.8NJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C8NJ LJLIL = new C8NJ();

    public C8NJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C2NW.LIZ().isNewUser()) {
            z = ((Boolean) C33839DPv.LIZLLL.getValue()).booleanValue();
        } else if (((Number) C72Y.LIZ.getValue()).intValue() == 11) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
