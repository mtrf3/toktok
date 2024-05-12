package X;

import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;

/* loaded from: classes10.dex */
public final class L73 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final L73 LJLIL = new L73();

    public L73() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 0;
        if (C53765L8f.LJIIIZ() != null && !C53765L8f.LJIILLIIL() && !C53765L8f.LJIIJ() && !C53765L8f.LJIILL() && ((Number) C53112Ksu.LIZ.getValue()).intValue() != 0 && !MSAdaptionService.LJIIL().LIZLLL(EF7.LIZIZ())) {
            i = C00F.LIZ(31744, 0, "feed_tab_platform_enable", true);
        }
        return Integer.valueOf(i);
    }
}
