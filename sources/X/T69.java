package X;

import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T69 extends AbstractC65781Prl implements InterfaceC88471Ynr<ChallengeDetailState, AbstractC26082ALm<? extends ChallengeDetail>, ChallengeDetailState> {
    public static final T69 LJLIL = new T69();

    public T69() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final ChallengeDetailState invoke(ChallengeDetailState challengeDetailState, AbstractC26082ALm<? extends ChallengeDetail> abstractC26082ALm) {
        ChallengeDetailState execute = challengeDetailState;
        AbstractC26082ALm<? extends ChallengeDetail> state = abstractC26082ALm;
        o.LJIIIZ(execute, "$this$execute");
        o.LJIIIZ(state, "state");
        return execute.copy(state);
    }
}
