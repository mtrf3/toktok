package X;

/* loaded from: classes7.dex */
public final class DZO extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DZO LJLIL = new DZO();

    public DZO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "photomode_replace_sound_switch", true, true);
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }
}
