package X;

/* renamed from: X.EhL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37107EhL extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C37107EhL LJLIL = new C37107EhL();

    public C37107EhL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C37105EhJ.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
