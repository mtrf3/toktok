package X;

/* loaded from: classes7.dex */
public final class DRI extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DRI LJLIL = new DRI();

    public DRI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (DRH.LIZ() == 2 || DRH.LIZ() == 3) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
