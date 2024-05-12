package X;

import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;

/* loaded from: classes8.dex */
public final class HDK implements InterfaceC65753PrJ<ChallengeDetail> {
    public final /* synthetic */ InterfaceC41846Gba LIZ;

    public HDK(HBN hbn) {
        this.LIZ = hbn;
    }

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable th) {
        this.LIZ.accept(null);
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(ChallengeDetail challengeDetail) {
        this.LIZ.accept(challengeDetail);
    }
}
