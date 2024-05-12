package com.ss.android.ugc.aweme.commercialize.utils;

import X.C58096Mr6;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil;

/* loaded from: classes10.dex */
public final class NoticeChallengePropertyUtilImpl implements NoticeChallengePropertyUtil {
    public static NoticeChallengePropertyUtil LIZ() {
        Object LIZ = C58096Mr6.LIZ(NoticeChallengePropertyUtil.class, false);
        if (LIZ != null) {
            return (NoticeChallengePropertyUtil) LIZ;
        }
        if (C58096Mr6.LLLLZLLIL == null) {
            synchronized (NoticeChallengePropertyUtil.class) {
                if (C58096Mr6.LLLLZLLIL == null) {
                    C58096Mr6.LLLLZLLIL = new NoticeChallengePropertyUtilImpl();
                }
            }
        }
        return C58096Mr6.LLLLZLLIL;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil
    public final void LIZLLL(Challenge challenge) {
        CommerceChallengeServiceImpl.LIZIZ().LIZLLL(challenge);
    }
}
