package X;

/* loaded from: classes7.dex */
public final class DZM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DZM LJLIL = new DZM();

    public DZM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "photomode_paging_datacontroller", true, true);
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }
}
