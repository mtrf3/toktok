package X;

/* renamed from: X.LNo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54164LNo extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final C54164LNo LJLIL = new C54164LNo();

    public C54164LNo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        float f;
        int LIZ = C00F.LIZ(31744, 0, "feed_tab_viewpager_scroll_fling_velocity", true);
        C54162LNm.LIZ.getClass();
        if (LIZ == C54162LNm.LIZIZ) {
            f = 1.1f;
        } else if (LIZ == C54162LNm.LIZJ) {
            f = 0.9f;
        } else if (LIZ == C54162LNm.LIZLLL) {
            f = 0.7f;
        } else if (LIZ == C54162LNm.LJ) {
            f = 0.6f;
        } else {
            f = 1.0f;
        }
        return Float.valueOf(f);
    }
}