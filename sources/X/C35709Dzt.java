package X;

/* renamed from: X.Dzt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35709Dzt extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35709Dzt LJLIL = new C35709Dzt();

    public C35709Dzt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (C00F.LIZ(31744, 1, "player_scroll_prerender_enable", true) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
