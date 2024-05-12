package X;

/* renamed from: X.DsV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35251DsV extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35251DsV LJLIL = new C35251DsV();

    public C35251DsV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "player_prerender_texture_available_repeat_opt", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
