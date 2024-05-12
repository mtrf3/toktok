package X;

/* renamed from: X.DNe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33770DNe extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33770DNe LJLIL = new C33770DNe();

    public C33770DNe() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C33768DNc.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
