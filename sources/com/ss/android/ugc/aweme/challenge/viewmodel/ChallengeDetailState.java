package com.ss.android.ugc.aweme.challenge.viewmodel;

import X.AbstractC26082ALm;
import X.C26092ALw;
import X.F9E;
import X.InterfaceC61312at;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ChallengeDetailState extends F9E implements InterfaceC61312at {
    public final AbstractC26082ALm<ChallengeDetail> challengeDetail;

    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeDetailState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChallengeDetailState copy$default(ChallengeDetailState challengeDetailState, AbstractC26082ALm abstractC26082ALm, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC26082ALm = challengeDetailState.challengeDetail;
        }
        return challengeDetailState.copy(abstractC26082ALm);
    }

    public final ChallengeDetailState copy(AbstractC26082ALm<? extends ChallengeDetail> challengeDetail) {
        o.LJIIIZ(challengeDetail, "challengeDetail");
        return new ChallengeDetailState(challengeDetail);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.challengeDetail};
    }

    public final AbstractC26082ALm<ChallengeDetail> getChallengeDetail() {
        return this.challengeDetail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeDetailState(AbstractC26082ALm<? extends ChallengeDetail> challengeDetail) {
        o.LJIIIZ(challengeDetail, "challengeDetail");
        this.challengeDetail = challengeDetail;
    }

    public /* synthetic */ ChallengeDetailState(AbstractC26082ALm abstractC26082ALm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C26092ALw.LIZ : abstractC26082ALm);
    }
}
