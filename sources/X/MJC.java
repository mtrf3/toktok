package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes10.dex */
public final class MJC implements InterfaceC90433gl {
    public final /* synthetic */ T5F LIZ;

    public MJC(T5F t5f) {
        this.LIZ = t5f;
    }

    @Override // X.InterfaceC90433gl
    public final void LIZ(Aweme aweme) {
        NextLiveData<OSZ<Integer, MH1>> nextLiveData;
        OSZ<Integer, MH1> value;
        MH1 second;
        ChallengeDetailViewModel mViewModel = this.LIZ.getMViewModel();
        if (mViewModel == null || (nextLiveData = mViewModel.LJLILLLLZI) == null || (value = nextLiveData.getValue()) == null || (second = value.getSecond()) == null) {
            return;
        }
        C55457Lpd.LJLJJLL = second;
        C61200O0e LIZLLL = C61200O0e.LIZLLL();
        ActivityC45651qj activity = this.LIZ.getActivity();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://aweme/detail/");
        LIZ.append(aweme.getAid());
        C39061g6 c39061g6 = new C39061g6(X1D.LIZIZ(LIZ));
        c39061g6.LIZIZ("refer", "challenge");
        c39061g6.LIZIZ("video_from", "from_challenge");
        c39061g6.LIZIZ("challenge_id", this.LIZ.getMChallenge().getCid());
        c39061g6.LIZ(2, "video_type");
        c39061g6.LIZ(aweme.getEnterpriseType(), "profile_enterprise_type");
        LIZLLL.LJI(activity, c39061g6.LIZJ());
        C77125UOr.LJIJ(aweme);
    }
}
