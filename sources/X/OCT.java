package X;

import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import o53.IDdS476S0100000_10;

/* loaded from: classes11.dex */
public final class OCT {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(W5G w5g, TuxIconView tuxIconView, String str, String str2) {
        String str3;
        C55382LoQ LJJIZ;
        C86393XvR LJJIJIL;
        if (w5g.getVisibility() == 0) {
            return;
        }
        w5g.setVisibility(0);
        tuxIconView.setVisibility(4);
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL == null || (LJJIZ = LJJJLL.LJJIZ()) == null || (LJJIJIL = LJJIZ.LJJIJIL()) == null || (str3 = LJJIJIL.LJJI(str, str2)) == null) {
            str3 = "";
        }
        OCU ocu = new OCU(1, tuxIconView, w5g, str3);
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJII(str3);
        LIZJ.LJII = new IDdS476S0100000_10(ocu, 11);
        w5g.setController(LIZJ.LIZ());
    }
}
