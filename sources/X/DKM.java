package X;

/* loaded from: classes7.dex */
public final class DKM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DKM LJLIL = new DKM();

    public DKM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!((Boolean) DKN.LIZ.getValue()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
