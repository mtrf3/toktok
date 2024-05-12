package X;

import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.CandidateAdData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YHU {
    public long LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public final java.util.Map<String, CandidateAdData> LIZ = new LinkedHashMap();
    public String LJ = "";

    public final Aweme LIZ(String aid) {
        RankData rankData;
        o.LJIIIZ(aid, "aid");
        CandidateAdData candidateAdData = (CandidateAdData) ((LinkedHashMap) this.LIZ).get(aid);
        if (candidateAdData != null && (rankData = candidateAdData.getRankData()) != null) {
            return rankData.getOriginItem();
        }
        return null;
    }
}
