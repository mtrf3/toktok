package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes11.dex */
public final class OA6 implements InterfaceC53858LBu {
    public final /* synthetic */ OA5 LIZ;

    public OA6(OA5 oa5) {
        this.LIZ = oa5;
    }

    @Override // X.InterfaceC53858LBu
    public final void LIZ(boolean z) {
        AwemeRawAd awemeRawAd;
        this.LIZ.LJIIIIZZ();
        if (z) {
            OA9 oa9 = this.LIZ.LJLJLJ;
            if (oa9 != null) {
                oa9.LJL();
            }
            Aweme aweme = this.LIZ.LJLJJI;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C025908h.LIZLLL("draw_ad", "close", awemeRawAd, "popup_window", "refer");
        }
    }
}
