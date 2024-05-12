package X;

/* renamed from: X.EhM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37108EhM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C37108EhM LJLIL = new C37108EhM();

    public C37108EhM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C37105EhJ.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
