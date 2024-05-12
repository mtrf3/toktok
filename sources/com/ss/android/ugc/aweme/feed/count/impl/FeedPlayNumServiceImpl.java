package com.ss.android.ugc.aweme.feed.count.impl;

import X.C58096Mr6;
import X.IFA;
import X.JCF;
import X.JCG;
import X.JCM;
import Y.ARunnableS9S1100000_8;
import com.ss.android.ugc.aweme.count.IFeedPlayNumService;
import com.ss.android.ugc.aweme.feed.count.FeedPlayNumModel;
import com.ss.android.ugc.aweme.feed.count.UserPlayNum;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FeedPlayNumServiceImpl implements IFeedPlayNumService {
    @Override // com.ss.android.ugc.aweme.count.IFeedPlayNumService
    public final void LIZ() {
        if (!IFA.LIZ()) {
            return;
        }
        JCG jcg = JCF.LIZ;
        jcg.LIZIZ(JCF.LIZJ);
        JCF.LIZJ = jcg.LIZ(JCF.LIZIZ.LJFF().getCurUserId());
    }

    @Override // com.ss.android.ugc.aweme.count.IFeedPlayNumService
    public final void LIZIZ() {
        if (!IFA.LIZ()) {
            return;
        }
        JCG jcg = JCF.LIZ;
        jcg.LIZIZ(JCF.LIZJ);
        JCF.LIZJ = jcg.LIZ(JCF.LIZIZ.LJFF().getCurUserId());
    }

    @Override // com.ss.android.ugc.aweme.count.IFeedPlayNumService
    public final void LIZJ() {
        if (!IFA.LIZ()) {
            return;
        }
        JCG jcg = JCF.LIZ;
        String uid = JCF.LIZJ.getUid();
        jcg.getClass();
        o.LJIIIZ(uid, "uid");
        if (IFA.LIZ()) {
            new ARunnableS9S1100000_8(jcg, uid, 5).run();
        }
        UserPlayNum LIZ = jcg.LIZ(JCF.LIZIZ.LJFF().getCurUserId());
        JCF.LIZJ.setUid(LIZ.getUid());
        FeedPlayNumModel model = JCF.LIZJ.getModel();
        model.setBatchNum(LIZ.getModel().getBatchNum() + model.getBatchNum());
        FeedPlayNumModel model2 = JCF.LIZJ.getModel();
        model2.setBatchNumAll(LIZ.getModel().getBatchNumAll() + model2.getBatchNumAll());
        FeedPlayNumModel model3 = JCF.LIZJ.getModel();
        model3.setPlayNum(LIZ.getModel().getPlayNum() + model3.getPlayNum());
        FeedPlayNumModel model4 = JCF.LIZJ.getModel();
        model4.setPlayNumAll(LIZ.getModel().getPlayNumAll() + model4.getPlayNumAll());
        jcg.LIZIZ(JCF.LIZJ);
    }

    @Override // com.ss.android.ugc.aweme.count.IFeedPlayNumService
    public final void LIZLLL() {
        if (!IFA.LIZ()) {
            return;
        }
        FeedPlayNumModel model = JCF.LIZJ.getModel();
        model.setPlayTimeBefore(JCM.LIZ.LIZLLL() + model.getPlayTimeBefore());
        JCF.LIZ.LIZIZ(JCF.LIZJ);
    }

    public static IFeedPlayNumService LJ() {
        Object LIZ = C58096Mr6.LIZ(IFeedPlayNumService.class, false);
        if (LIZ != null) {
            return (IFeedPlayNumService) LIZ;
        }
        if (C58096Mr6.E0 == null) {
            synchronized (IFeedPlayNumService.class) {
                if (C58096Mr6.E0 == null) {
                    C58096Mr6.E0 = new FeedPlayNumServiceImpl();
                }
            }
        }
        return C58096Mr6.E0;
    }
}
