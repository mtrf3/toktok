package X;

/* renamed from: X.Dzn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35703Dzn extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35703Dzn LJLIL = new C35703Dzn();

    public C35703Dzn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (C00F.LIZ(31744, 1, "player_prerender_set_source_id", true) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
