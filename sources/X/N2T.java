package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes11.dex */
public final class N2T implements N2X {
    public final /* synthetic */ AwemeRawAd LIZ;

    public N2T(AwemeRawAd awemeRawAd) {
        this.LIZ = awemeRawAd;
    }

    @Override // X.N2X
    public final void LIZ(boolean z) {
        if (z) {
            C58704N2e.LIZLLL("draw_ad", "deeplink_opened", this.LIZ).LJI();
        }
    }
}
