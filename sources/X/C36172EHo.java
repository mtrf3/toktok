package X;

/* renamed from: X.EHo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36172EHo extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C36172EHo LJLIL = new C36172EHo();

    public C36172EHo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "gecko_downgrade_on_mobile_network", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
