package X;

/* loaded from: classes7.dex */
public final class DOT extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DOT LJLIL = new DOT();

    public DOT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C34580Dhg.LIZ().getLong("app_update_versioncode", -1L) != C2NW.LIZ().getUpdateVersionCode()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
