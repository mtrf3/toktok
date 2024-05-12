package X;

/* renamed from: X.DsP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35245DsP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35245DsP LJLIL = new C35245DsP();

    public C35245DsP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "player_dash_skip_calculate_cache_size", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
