package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes11.dex */
public final class NPJ implements InterfaceC59429NUb {
    public final /* synthetic */ AwemeRawAd LIZ;

    public NPJ(AwemeRawAd awemeRawAd) {
        this.LIZ = awemeRawAd;
    }

    @Override // X.InterfaceC59429NUb
    public final void LIZ(boolean z) {
        if (z) {
            NPI.LIZIZ(EF7.LIZIZ(), "deeplink_opened", this.LIZ);
        }
    }
}
