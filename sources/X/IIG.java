package X;

/* loaded from: classes9.dex */
public final class IIG extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final IIG LJLIL = new IIG();

    public IIG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        float f;
        int LIZ = C00F.LIZ(31744, 0, "feed_viewpager_scroll_fling_velocity", true);
        IIF.LIZ.getClass();
        if (LIZ == IIF.LIZIZ) {
            f = 0.95f;
        } else if (LIZ == IIF.LIZJ) {
            f = 0.9f;
        } else if (LIZ == IIF.LIZLLL) {
            f = 0.85f;
        } else if (LIZ == IIF.LJ) {
            f = 0.8f;
        } else if (LIZ == IIF.LJFF) {
            f = 0.75f;
        } else if (LIZ == IIF.LJI) {
            f = 0.7f;
        } else {
            f = 1.0f;
        }
        return Float.valueOf(f);
    }
}
