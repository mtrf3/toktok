package X;

/* loaded from: classes7.dex */
public final class DN8 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DN8 LJLIL = new DN8();

    public DN8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((DN4.LIZ() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
