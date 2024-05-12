package X;

/* renamed from: X.KiJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52455KiJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52455KiJ LJLIL = new C52455KiJ();

    public C52455KiJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (C00F.LIZ(31744, 1, "set_follow_rec_status_init_loading", true) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
