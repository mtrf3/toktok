package X;

/* loaded from: classes7.dex */
public final class DMZ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DMZ LJLIL = new DMZ();

    public DMZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((DMY.LIZ() & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
