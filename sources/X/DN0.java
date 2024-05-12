package X;

/* loaded from: classes7.dex */
public final class DN0 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DN0 LJLIL = new DN0();

    public DN0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33765DMz.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
