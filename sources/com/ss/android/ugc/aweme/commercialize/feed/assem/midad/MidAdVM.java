package com.ss.android.ugc.aweme.commercialize.feed.assem.midad;

import X.C1DJ;
import X.C33Q;
import X.C73318Sq2;
import X.C770830u;
import X.EFJ;
import X.JAY;
import X.JBB;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes9.dex */
public final class MidAdVM extends FeedBaseViewModel<JBB> {
    public Aweme LJLJLLL;
    public Aweme LJLL;
    public long LJLLI = -1;
    public boolean LJLLILLLL;
    public final MidAdRequestApi LJLLJ;
    public final C73318Sq2 LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new JBB(0);
    }

    public MidAdVM() {
        MidAdRequestApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LJLLJ = (MidAdRequestApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(MidAdRequestApi.class);
        this.LJLLL = new C73318Sq2();
    }

    public final void kv0(Aweme aweme) {
        Aweme aweme2;
        Long l;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        String creativeIdStr;
        this.LJLJLLL = aweme;
        if (C1DJ.LJJ(aweme)) {
            String str = null;
            if (aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || (creativeIdStr = awemeRawAd2.getCreativeIdStr()) == null) {
                aweme2 = null;
            } else {
                aweme2 = JAY.LIZ.get(creativeIdStr);
            }
            this.LJLL = aweme2;
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                str = awemeRawAd.getCreativeIdStr();
            }
            long j = 0;
            if (str != null && (l = JAY.LIZLLL.get(str)) != null) {
                j = l.longValue();
            }
            this.LJLLI = j;
        }
    }
}
