package X;

import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ChallengeTransform;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T5E {
    public static boolean LIZ(ChallengeDetail data) {
        ChallengeTransform challengeTransform;
        o.LJIIIZ(data, "data");
        Challenge challenge = data.challenge;
        if (challenge != null) {
            challengeTransform = challenge.getTransfrom();
        } else {
            challengeTransform = null;
        }
        if (challengeTransform == null || !V1B.LJL(challengeTransform.getText()) || !V1B.LJL(challengeTransform.getAction())) {
            return false;
        }
        return true;
    }
}
