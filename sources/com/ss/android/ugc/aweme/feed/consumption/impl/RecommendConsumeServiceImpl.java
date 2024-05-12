package com.ss.android.ugc.aweme.feed.consumption.impl;

import X.C86921Y9l;
import X.IFA;
import X.JCF;
import X.JCM;
import com.ss.android.ugc.aweme.utils.IFeedRecommendConsumeService;
import com.ss.android.ugc.aweme.utils.RecommendConsumeParams;

/* loaded from: classes9.dex */
public final class RecommendConsumeServiceImpl implements IFeedRecommendConsumeService {
    @Override // com.ss.android.ugc.aweme.utils.IFeedRecommendConsumeService
    public final RecommendConsumeParams LIZ() {
        RecommendConsumeParams recommendConsumeParams;
        long playTimeBefore;
        JCM jcm = JCM.LIZ;
        synchronized (jcm) {
            if (C86921Y9l.LJIILJJIL) {
                RecommendConsumeParams recommendConsumeParams2 = JCM.LJ;
                if (!IFA.LIZ()) {
                    playTimeBefore = -1;
                } else {
                    playTimeBefore = JCF.LIZJ.getModel().getPlayTimeBefore();
                }
                recommendConsumeParams2.setDay_view_time(Long.valueOf(playTimeBefore + jcm.LIZLLL()));
            }
            recommendConsumeParams = JCM.LJ;
        }
        return recommendConsumeParams;
    }
}
