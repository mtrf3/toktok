package X;

/* renamed from: X.DsQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35246DsQ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35246DsQ LJLIL = new C35246DsQ();

    public C35246DsQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "player_prerender_scroll_post_enable", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
