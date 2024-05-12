package X;

/* renamed from: X.KgK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52332KgK extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52332KgK LJLIL = new C52332KgK();

    public C52332KgK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "inner_push_live_markstatus_enabled", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
