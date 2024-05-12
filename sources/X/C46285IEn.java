package X;

/* renamed from: X.IEn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46285IEn extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C46285IEn LJLIL = new C46285IEn();

    public C46285IEn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "feed_render_callback_opt_on_idle", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
