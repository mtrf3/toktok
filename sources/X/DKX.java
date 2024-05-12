package X;

/* loaded from: classes7.dex */
public final class DKX extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DKX LJLIL = new DKX();

    public DKX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DKW.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
