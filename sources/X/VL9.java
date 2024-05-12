package X;

/* loaded from: classes15.dex */
public final class VL9 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final VL9 LJLIL = new VL9();

    public VL9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Boolean) VL7.LIZJ.getValue()).booleanValue() || ((Boolean) VL7.LIZLLL.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
