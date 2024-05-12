package X;

/* loaded from: classes9.dex */
public final class IFB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final IFB LJLIL = new IFB();

    public IFB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!C19N.LJ("play_num_switch_second", true)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
