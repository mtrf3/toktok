package X;

import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;

/* loaded from: classes8.dex */
public final class HWD implements InterfaceC65644PpY<Challenge, AVChallenge> {
    public static final AVChallenge LIZ(Challenge challenge) {
        AVChallenge aVChallenge = new AVChallenge();
        aVChallenge.cid = challenge.getCid();
        aVChallenge.challengeName = challenge.getChallengeName();
        aVChallenge.stickerId = challenge.getStickerId();
        aVChallenge.type = challenge.getType();
        aVChallenge.viewCount = challenge.getViewCount();
        aVChallenge.userCount = challenge.getUserCount();
        aVChallenge.isCommerce = challenge.isCommerce();
        return aVChallenge;
    }

    @Override // X.InterfaceC65644PpY
    public final /* bridge */ /* synthetic */ AVChallenge apply(Challenge challenge) {
        return LIZ(challenge);
    }
}
