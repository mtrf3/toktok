package X;

/* renamed from: X.E0l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35727E0l extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final C35727E0l LJLIL = new C35727E0l();

    public C35727E0l() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        float f;
        int LIZ = C00F.LIZ(31744, 0, "feed_viewpager_scroll_page_offset_opt", true);
        C35726E0k.LIZ.getClass();
        if (LIZ == C35726E0k.LIZIZ) {
            f = 0.05f;
        } else if (LIZ == C35726E0k.LIZJ) {
            f = 0.1f;
        } else if (LIZ == C35726E0k.LIZLLL) {
            f = 0.15f;
        } else if (LIZ == C35726E0k.LJ) {
            f = 0.2f;
        } else {
            f = 0.0f;
        }
        return Float.valueOf(f);
    }
}
