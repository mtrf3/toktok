package com.ss.android.ugc.aweme.commercialize.feed.candidate;

import X.C55735Lu7;
import X.C56575MIh;
import X.C56579MIl;
import X.C73318Sq2;
import X.C73969T1h;
import X.C770830u;
import X.C78999UzT;
import X.EFJ;
import X.FLE;
import X.ILE;
import X.T16;
import Y.AfS58S0200000_9;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.AdReRankServiceManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ad.feed.candidate.ICandidateRequestService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import yq4.a;

/* loaded from: classes10.dex */
public final class CandidateRequestImpl implements ICandidateRequestService {
    public final CandidateAdRequestApi LIZ;
    public final C73318Sq2 LIZIZ;

    public CandidateRequestImpl() {
        CandidateAdRequestApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (CandidateAdRequestApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(CandidateAdRequestApi.class);
        this.LIZIZ = new C73318Sq2();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.candidate.ICandidateRequestService
    public final void LIZ(List<? extends Aweme> list) {
        C56575MIh c56575MIh = new C56575MIh(new Object[0]);
        C56579MIl.LIZ.getClass();
        c56575MIh.LIZIZ(C56579MIl.LIZJ);
        C78999UzT.LJFF(this.LIZ.request(a.LJIIZILJ().LIZJ(), FLE.LIZ("feed"), AdReRankServiceManager.LIZJ().LIZIZ(ILE.FEED).LIZLLL()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS58S0200000_9(list, this, 3), C55735Lu7.LJLIL), this.LIZIZ);
    }
}
