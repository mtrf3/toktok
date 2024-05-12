package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes11.dex */
public final class NPM implements InterfaceC59429NUb {
    public final /* synthetic */ AwemeRawAd LIZ;

    public NPM(AwemeRawAd awemeRawAd) {
        this.LIZ = awemeRawAd;
    }

    @Override // X.InterfaceC59429NUb
    public final void LIZ(boolean z) {
        InterfaceC59440NUm LIZ;
        if (z) {
            NPI.LIZIZ(EF7.LIZIZ(), "landing_deeplink_success", this.LIZ);
            C58909NAb.LIZ.getClass();
            if (NH3.LIZ() != null && (LIZ = NH3.LIZ()) != null) {
                ((NTF) LIZ).LJIILIIL(this.LIZ);
                return;
            }
            return;
        }
        NPI.LIZIZ(EF7.LIZIZ(), "landing_deeplink_failed", this.LIZ);
    }
}
