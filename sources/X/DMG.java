package X;

/* loaded from: classes7.dex */
public final class DMG extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DMG LJLIL = new DMG();

    public DMG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((DMB.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
