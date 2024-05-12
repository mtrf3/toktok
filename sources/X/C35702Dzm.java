package X;

/* renamed from: X.Dzm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35702Dzm extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35702Dzm LJLIL = new C35702Dzm();

    public C35702Dzm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "player_prerender_check_cache_complete", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
