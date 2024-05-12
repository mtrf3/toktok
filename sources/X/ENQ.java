package X;

/* loaded from: classes7.dex */
public final class ENQ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final ENQ LJLIL = new ENQ();

    public ENQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) ENR.LIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
