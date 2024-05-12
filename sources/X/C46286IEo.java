package X;

/* renamed from: X.IEo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46286IEo extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C46286IEo LJLIL = new C46286IEo();

    public C46286IEo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "feed_render_callback_opt_on_idle", true) == 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
