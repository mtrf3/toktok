package X;

/* loaded from: classes7.dex */
public final class DPV extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DPV LJLIL = new DPV();

    public DPV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C33820DPc.LIZ() == 2 || C33820DPc.LIZ() == 3) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
