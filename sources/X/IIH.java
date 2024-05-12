package X;

/* loaded from: classes9.dex */
public final class IIH extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final IIH LJLIL = new IIH();

    public IIH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        float f;
        int LIZ = C00F.LIZ(31744, 0, "feed_viewpager_scroll_fling_velocity", true);
        IIF.LIZ.getClass();
        if (LIZ == IIF.LIZIZ) {
            f = 0.9f;
        } else if (LIZ == IIF.LIZJ) {
            f = 0.8f;
        } else if (LIZ == IIF.LIZLLL) {
            f = 0.7f;
        } else if (LIZ == IIF.LJ) {
            f = 0.6f;
        } else if (LIZ == IIF.LJFF) {
            f = 0.5f;
        } else if (LIZ == IIF.LJI) {
            f = 0.4f;
        } else {
            f = 1.0f;
        }
        return Float.valueOf(f);
    }
}
