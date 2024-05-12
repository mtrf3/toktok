package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide;

import X.C27739Aud;
import X.C56109M0j;
import X.C56144M1s;
import X.C56145M1t;
import X.C65330PkU;
import X.C65352Pkq;
import X.C73340SqO;
import X.C78404Ups;
import X.ECG;
import X.EV6;
import X.EnumC55928LxE;
import X.M15;
import X.ORZ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionData;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceRes;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionTargetRes;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachResponse;
import java.util.List;

/* loaded from: classes10.dex */
public final class EcVideoGuideVM extends AssemViewModel<C56145M1t> {
    public static final /* synthetic */ int LJLJLLL = 0;
    public String LJLIL = "";
    public final EV6 LJLILLLLZI = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(ECG.class));
    public final String LJLJI = "-1";
    public final String LJLJJI = "{{product_category}}";
    public final String LJLJJL = "homepage_hot";
    public final String LJLJJLL = "homepage_hot_video";
    public final String LJLJL = "mall_homepage";
    public C56144M1s LJLJLJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C56145M1t defaultState() {
        return new C56145M1t(0);
    }

    public static void gv0(FeedReachResponse feedReachResponse, C56144M1s c56144M1s) {
        ReachCfg reachCfg;
        DiversionData diversionData;
        DiversionEntranceRes diversionEntranceRes;
        List<ReachCfg> reachConfigList;
        String data;
        DiversionTargetRes diversionTargetRes = null;
        if (feedReachResponse != null && (reachConfigList = feedReachResponse.getReachConfigList()) != null) {
            reachCfg = (ReachCfg) ORZ.LJLLLL(reachConfigList);
            if (reachCfg != null && (data = reachCfg.getData()) != null) {
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), data, C65330PkU.LIZJ(C65352Pkq.LJI(DiversionData.class)));
                    if (!(fromJson instanceof DiversionData)) {
                        fromJson = null;
                    }
                    diversionData = (DiversionData) fromJson;
                } catch (s unused) {
                }
                if (diversionData != null) {
                    diversionEntranceRes = C73340SqO.LJJIIJZLJL(diversionData, EnumC55928LxE.FYP_ECOM_VIDEO_GUIDE_MASK);
                    diversionTargetRes = C73340SqO.LJJIIZ(diversionData, M15.BACK_TO_PREVIOUS_PAGE);
                    c56144M1s.LIZLLL = new C56109M0j(reachCfg, diversionData, diversionEntranceRes, diversionTargetRes);
                }
                diversionEntranceRes = null;
                c56144M1s.LIZLLL = new C56109M0j(reachCfg, diversionData, diversionEntranceRes, diversionTargetRes);
            }
        } else {
            reachCfg = null;
        }
        diversionData = null;
        diversionEntranceRes = null;
        c56144M1s.LIZLLL = new C56109M0j(reachCfg, diversionData, diversionEntranceRes, diversionTargetRes);
    }
}
