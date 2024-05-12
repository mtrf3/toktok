package X;

/* renamed from: X.DsT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35249DsT extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35249DsT LJLIL = new C35249DsT();

    public C35249DsT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "player_prerender_preload_done", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
