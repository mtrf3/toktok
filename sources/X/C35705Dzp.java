package X;

/* renamed from: X.Dzp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35705Dzp extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35705Dzp LJLIL = new C35705Dzp();

    public C35705Dzp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (C00F.LIZ(31744, 1, "player_prerender_need_check_cache", true) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
