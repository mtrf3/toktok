package X;

import com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVSearchChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GrL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42823GrL implements InterfaceC65644PpY<SearchSugChallengeList, AVSearchChallengeList> {
    public static AVSearchChallengeList LIZ(SearchSugChallengeList searchSugChallengeList) {
        ArrayList LIZ;
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (searchSugChallengeList == null) {
            return null;
        }
        AVSearchChallengeList aVSearchChallengeList = new AVSearchChallengeList();
        List<AVChallenge> list = searchSugChallengeList.items;
        if (list == null) {
            LIZ = new ArrayList();
        } else {
            LIZ = C65661Ppp.LIZ(C65661Ppp.LIZLLL(list, new InterfaceC65644PpY<AVChallenge, AVSearchChallenge>() { // from class: X.6cm
                public static final /* synthetic */ int LJLIL = 0;

                @Override // X.InterfaceC65644PpY
                public final AVSearchChallenge apply(AVChallenge aVChallenge) {
                    AVChallenge aVChallenge2 = aVChallenge;
                    if (aVChallenge2 == null) {
                        return null;
                    }
                    AVSearchChallenge aVSearchChallenge = new AVSearchChallenge();
                    aVSearchChallenge.challenge = aVChallenge2;
                    return aVSearchChallenge;
                }
            }));
        }
        aVSearchChallengeList.items = LIZ;
        aVSearchChallengeList.keyword = searchSugChallengeList.keyword;
        LogPbBean logPbBean = new LogPbBean();
        LogPbBean logPbBean2 = searchSugChallengeList.logPb;
        if (logPbBean2 != null) {
            str = logPbBean2.getImprId();
        } else {
            str = null;
        }
        logPbBean.setImprId(str);
        aVSearchChallengeList.logPb = logPbBean;
        aVSearchChallengeList.isMatch = searchSugChallengeList.isMatch;
        RecommendWordMob recommendWordMob = new RecommendWordMob();
        com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob recommendWordMob2 = searchSugChallengeList.recommendWordMob;
        if (recommendWordMob2 != null) {
            str2 = recommendWordMob2.getInfo();
        } else {
            str2 = null;
        }
        recommendWordMob.setInfo(str2);
        com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob recommendWordMob3 = searchSugChallengeList.recommendWordMob;
        if (recommendWordMob3 != null) {
            str3 = recommendWordMob3.getWordsSource();
        } else {
            str3 = null;
        }
        recommendWordMob.setWordsSource(str3);
        com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob recommendWordMob4 = searchSugChallengeList.recommendWordMob;
        if (recommendWordMob4 != null) {
            str4 = recommendWordMob4.getQueryId();
        }
        recommendWordMob.setQueryId(str4);
        aVSearchChallengeList.recommendWordMob = recommendWordMob;
        return aVSearchChallengeList;
    }

    @Override // X.InterfaceC65644PpY
    public final /* bridge */ /* synthetic */ AVSearchChallengeList apply(SearchSugChallengeList searchSugChallengeList) {
        return LIZ(searchSugChallengeList);
    }
}
