package X;

/* renamed from: X.DuG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35360DuG extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final C35360DuG LJLIL = new C35360DuG();

    public C35360DuG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        float f;
        int LIZ = C00F.LIZ(31744, 0, "feed_tab_viewpager_scroll_page_offset", true);
        C35359DuF.LIZ.getClass();
        if (LIZ == C35359DuF.LIZIZ) {
            f = 0.05f;
        } else if (LIZ == C35359DuF.LIZJ) {
            f = 0.1f;
        } else if (LIZ == C35359DuF.LIZLLL) {
            f = 0.15f;
        } else if (LIZ == C35359DuF.LJ) {
            f = 0.2f;
        } else {
            f = 0.0f;
        }
        return Float.valueOf(f);
    }
}
