package X;

/* loaded from: classes9.dex */
public final class IFI extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final IFI LJLIL = new IFI();

    public IFI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 1;
        try {
            FFL.LJIIIZ().getClass();
            i = LFH.LIZIZ.LIZLLL().LJIIJ().LJFF(FFL.LJIIJ(31744, 1, "playback_speed", true));
        } catch (Exception unused) {
        }
        return Integer.valueOf(i);
    }
}
