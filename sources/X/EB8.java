package X;

/* loaded from: classes7.dex */
public final class EB8 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final EB8 LJLIL = new EB8();

    public EB8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Boolean) EB7.LIZJ.getValue()).booleanValue() && (((Number) EB7.LIZ.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
