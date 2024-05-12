package X;

/* renamed from: X.Dzs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35708Dzs extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35708Dzs LJLIL = new C35708Dzs();

    public C35708Dzs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (C00F.LIZ(31744, 1, "player_prerender_first_frame_check_enable", true) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
