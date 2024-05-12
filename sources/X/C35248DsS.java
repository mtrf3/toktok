package X;

/* renamed from: X.DsS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35248DsS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35248DsS LJLIL = new C35248DsS();

    public C35248DsS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "player_prerender_not_replace_first_cover", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
