package X;

/* loaded from: classes10.dex */
public final class L06 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final L06 LJLIL = new L06();

    public L06() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) L08.LIZ.getValue()).intValue() & 1) == 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
