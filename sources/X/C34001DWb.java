package X;

/* renamed from: X.DWb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34001DWb extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34001DWb LJLIL = new C34001DWb();

    public C34001DWb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C34002DWc.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
