package X;

import com.ss.android.ugc.aweme.challenge.recommend.model.RecommendHashTagData;
import com.ss.android.ugc.aweme.challenge.recommend.model.RecommendHashTagResponse;
import com.ss.android.ugc.aweme.shortvideo.AVRecommendHashTagData;
import com.ss.android.ugc.aweme.shortvideo.AVRecommendHashTagResponse;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Gqw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42798Gqw implements InterfaceC65644PpY<RecommendHashTagData, AVRecommendHashTagData> {
    public static AVRecommendHashTagResponse LIZ(RecommendHashTagResponse recommendHashTagResponse) {
        if (recommendHashTagResponse == null) {
            return null;
        }
        AVRecommendHashTagResponse aVRecommendHashTagResponse = new AVRecommendHashTagResponse();
        aVRecommendHashTagResponse.fillHistoryEnd = recommendHashTagResponse.fillHistoryEnd;
        aVRecommendHashTagResponse.needHistory = recommendHashTagResponse.needHistory;
        aVRecommendHashTagResponse.showPrivacyCount = recommendHashTagResponse.showPrivacyCount;
        aVRecommendHashTagResponse.needPrivacyHistory = recommendHashTagResponse.needPrivacyHistory;
        List list = recommendHashTagResponse.data;
        if (list == null) {
            list = new ArrayList(0);
        }
        aVRecommendHashTagResponse.data = C65661Ppp.LIZ(C65661Ppp.LIZLLL(list, new C42798Gqw()));
        return aVRecommendHashTagResponse;
    }

    @Override // X.InterfaceC65644PpY
    public final AVRecommendHashTagData apply(RecommendHashTagData recommendHashTagData) {
        RecommendHashTagData recommendHashTagData2 = recommendHashTagData;
        AVRecommendHashTagData aVRecommendHashTagData = new AVRecommendHashTagData();
        aVRecommendHashTagData.mark = recommendHashTagData2.mark;
        aVRecommendHashTagData.pos = recommendHashTagData2.pos;
        new HWD();
        aVRecommendHashTagData.challenge = HWD.LIZ(recommendHashTagData2.challenge);
        aVRecommendHashTagData.LIZ = recommendHashTagData2.adData;
        return aVRecommendHashTagData;
    }
}
