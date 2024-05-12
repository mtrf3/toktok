package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.XDr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84483XDr extends XDF<RecommendSearchWordsResponse, RecommendSearchWordsResponse> {
    public final XCG LJIIL;

    @Override // X.XDF
    public final int LJII() {
        return 10003;
    }

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIIL.LIZ, "/search/recommend", LIZ2, LIZ), null, XD7.GET, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84483XDr(XCG effectConfig, String taskFlag) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJIIL = effectConfig;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse] */
    @Override // X.XDF
    public final RecommendSearchWordsResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, RecommendSearchWordsResponse.class);
    }
}
