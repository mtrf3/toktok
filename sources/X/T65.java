package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T65 extends AbstractC65781Prl implements InterfaceC88471Ynr<ChallengeDetailState, Bundle, ChallengeDetailState> {
    public static final T65 INSTANCE = new T65();

    public T65() {
        super(2);
    }

    public final ChallengeDetailState invoke(ChallengeDetailState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ ChallengeDetailState invoke(ChallengeDetailState challengeDetailState, Bundle bundle) {
        ChallengeDetailState challengeDetailState2 = challengeDetailState;
        invoke(challengeDetailState2, bundle);
        return challengeDetailState2;
    }
}
