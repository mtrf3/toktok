package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.ml.ab.FeedLoadMorePlan;
import com.ss.android.ugc.aweme.ml.ab.SmartFeedLoadMoreStrategyConfig;
import com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedLoadMoreServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.ItN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48045ItN implements InterfaceC48512J2e {
    public final /* synthetic */ SmartFeedLoadMoreServiceImpl LIZ;
    public final /* synthetic */ Aweme LIZIZ;
    public final /* synthetic */ InterfaceC48047ItP LIZJ;
    public final /* synthetic */ C76732zl LIZLLL;

    public C48045ItN(SmartFeedLoadMoreServiceImpl smartFeedLoadMoreServiceImpl, Aweme aweme, InterfaceC48047ItP interfaceC48047ItP, C76732zl c76732zl) {
        this.LIZ = smartFeedLoadMoreServiceImpl;
        this.LIZIZ = aweme;
        this.LIZJ = interfaceC48047ItP;
        this.LIZLLL = c76732zl;
    }

    @Override // X.InterfaceC48512J2e
    public final void LIZ(boolean z, int i, C48044ItM c48044ItM, IFF iff) {
        long j;
        float f;
        FeedLoadMorePlan feedLoadMorePlan;
        SmartFeedLoadMoreServiceImpl smartFeedLoadMoreServiceImpl = this.LIZ;
        smartFeedLoadMoreServiceImpl.LIZIZ = false;
        if (z && c48044ItM != null && c48044ItM.LIZ != null) {
            SmartFeedLoadMoreService.Companion.getClass();
            boolean z2 = SmartFeedLoadMoreService.debug;
            if (z2) {
                j = System.currentTimeMillis();
            } else {
                j = 0;
            }
            String str = c48044ItM.LIZ;
            if (str == null) {
                str = "";
            }
            Float LIZIZ = c48044ItM.LIZIZ();
            if (LIZIZ != null) {
                f = LIZIZ.floatValue();
            } else {
                f = -1.0f;
            }
            C48046ItO c48046ItO = this.LIZ.LIZJ.get(this.LIZIZ.getAid());
            if (c48046ItO != null) {
                c48046ItO.LIZ = f;
                c48046ItO.LIZIZ = str;
            }
            SmartFeedLoadMoreStrategyConfig LIZ = IW8.LIZ();
            String str2 = null;
            if (LIZ != null) {
                feedLoadMorePlan = LIZ.getPlan(str);
            } else {
                feedLoadMorePlan = null;
            }
            InterfaceC48047ItP interfaceC48047ItP = this.LIZJ;
            if (interfaceC48047ItP != null && feedLoadMorePlan != null) {
                FullFeedFragmentPanel.LJJJJI((FullFeedFragmentPanel) ((C30164Bse) interfaceC48047ItP).LJLIL, feedLoadMorePlan.getPreload(), feedLoadMorePlan.getDelay(), this.LIZLLL.element);
            }
            if (z2) {
                long currentTimeMillis = System.currentTimeMillis() - j;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("startSmartFeedLoadMoreJudge aid:");
                LIZ2.append(this.LIZIZ.getAid());
                LIZ2.append('-');
                User author = this.LIZIZ.getAuthor();
                if (author != null) {
                    str2 = author.getNickname();
                }
                YE1.LIZLLL(LIZ2, str2, " out:", str, " probability:");
                LIZ2.append(f);
                LIZ2.append(" outCost:");
                LIZ2.append(currentTimeMillis);
                LIZ2.append(" plan:");
                LIZ2.append(feedLoadMorePlan);
                X1D.LIZIZ(LIZ2);
                return;
            }
            return;
        }
        smartFeedLoadMoreServiceImpl.LIZLLL = true;
    }
}
