package X;

/* loaded from: classes7.dex */
public final class DTR extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DTR LJLIL = new DTR();

    public DTR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DTQ.LIZIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
