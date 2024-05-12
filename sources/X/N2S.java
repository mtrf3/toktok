package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes11.dex */
public final class N2S implements N2X {
    public final /* synthetic */ AwemeRawAd LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    public N2S(AwemeRawAd awemeRawAd, String str, boolean z) {
        this.LIZ = awemeRawAd;
        this.LIZIZ = str;
        this.LIZJ = z;
    }

    @Override // X.N2X
    public final void LIZ(boolean z) {
        if (z) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "deeplink_success", this.LIZ);
            LIZLLL.LIZIZ(this.LIZIZ, "app_url");
            LIZLLL.LJII();
        } else {
            C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "deeplink_failed", this.LIZ);
            LIZLLL2.LIZIZ(this.LIZIZ, "app_url");
            LIZLLL2.LIZIZ(Integer.valueOf(!this.LIZJ ? 1 : 0), "fail_reason");
            LIZLLL2.LJII();
        }
    }
}
