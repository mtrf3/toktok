package X;

/* renamed from: X.Dzr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35707Dzr extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35707Dzr LJLIL = new C35707Dzr();

    public C35707Dzr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (C00F.LIZ(31744, 1, "player_prerender_download_done_check_enable", true) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
