package X;

/* loaded from: classes7.dex */
public final class DSP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DSP LJLIL = new DSP();

    public DSP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((DSG.LIZ() & 128) == 128) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
