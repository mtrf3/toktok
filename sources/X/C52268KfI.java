package X;

/* renamed from: X.KfI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52268KfI extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52268KfI LJLIL = new C52268KfI();

    public C52268KfI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "live_gson_refactor_setting", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
