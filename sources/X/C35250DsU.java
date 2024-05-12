package X;

/* renamed from: X.DsU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35250DsU extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35250DsU LJLIL = new C35250DsU();

    public C35250DsU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "player_prerender_replace_cover", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
