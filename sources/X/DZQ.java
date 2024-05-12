package X;

/* loaded from: classes7.dex */
public final class DZQ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DZQ LJLIL = new DZQ();

    public DZQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "preload_font_cache_enable", true, false);
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }
}
