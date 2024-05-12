package X;

/* renamed from: X.DiW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34632DiW extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34632DiW LJLIL = new C34632DiW();

    public C34632DiW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C34631DiV.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
