package X;

/* renamed from: X.IVr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46731IVr extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C46731IVr LJLIL = new C46731IVr();

    public C46731IVr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "use_own_player_high_level", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
