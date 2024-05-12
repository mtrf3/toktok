package X;

import com.tiktok.zero.rating.manager.ZeroRatingApi;

/* loaded from: classes7.dex */
public final class F7R implements C10I {
    public final /* synthetic */ F7O LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ ZeroRatingApi.FetchMsisdnResponse LIZJ;

    public F7R(F7O f7o, String str, ZeroRatingApi.FetchMsisdnResponse fetchMsisdnResponse) {
        this.LIZ = f7o;
        this.LIZIZ = str;
        this.LIZJ = fetchMsisdnResponse;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        this.LIZ.LIZIZ(this.LIZIZ, this.LIZJ, "retry");
        return C76800UCe.LIZ;
    }
}
