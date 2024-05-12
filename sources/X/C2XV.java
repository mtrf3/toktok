package X;

/* renamed from: X.2XV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2XV extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C2XV LJLIL = new C2XV();

    public C2XV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C36152EGu.LJ()) {
            z = ((Boolean) C33839DPv.LIZIZ.getValue()).booleanValue();
        } else if (((Number) C2XT.LIZIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
