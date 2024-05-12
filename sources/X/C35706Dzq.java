package X;

/* renamed from: X.Dzq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35706Dzq extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35706Dzq LJLIL = new C35706Dzq();

    public C35706Dzq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (C00F.LIZ(31744, 1, "player_prerender_prev_enable", true) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
