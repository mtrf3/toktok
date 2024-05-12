package X;

/* loaded from: classes10.dex */
public final class L0D extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final L0D LJLIL = new L0D();

    public L0D() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) L0A.LIZ.getValue()).intValue() & 1) == 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
