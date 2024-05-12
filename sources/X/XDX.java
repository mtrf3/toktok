package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XDX extends XDF<QueryRewardEffectsResponse, QueryRewardEffectsResponse> {
    public final XCG LJIIL;
    public final String LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final java.util.Map<String, String> LJIILLIIL;

    @Override // X.XDF
    public final int LJII() {
        return 10002;
    }

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        LIZ.put("panel", this.LJIILIIL);
        LIZ.put("cursor", String.valueOf(this.LJIILL));
        LIZ.put("count", String.valueOf(this.LJIILJJIL));
        java.util.Map<String, String> map = this.LJIILLIIL;
        if (map != null) {
            LIZ.putAll(map);
        }
        XD7 xd7 = XD7.GET;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIIL.LIZ, "/v3/effect/reward", LIZ2, LIZ), null, xd7, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    @Override // X.XDF
    public final int LJIIIIZZ() {
        return this.LJIIL.LJIILL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse, X.XDH] */
    @Override // X.XDF
    public final QueryRewardEffectsResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, QueryRewardEffectsResponse.class);
    }

    @Override // X.XDF
    public final void LJIIJ(String str, String str2, C84418XBe c84418XBe) {
        c84418XBe.LIZ(str, this.LJIIL.LJJIIJZLJL, str2);
        super.LJIIJ(str, str2, c84418XBe);
    }

    @Override // X.XDF
    public final void LJIIL(long j, long j2, long j3, QueryRewardEffectsResponse queryRewardEffectsResponse) {
        QueryRewardEffectsResponse queryRewardEffectsResponse2 = queryRewardEffectsResponse;
        XDM xdm = XDM.LIZ;
        String str = this.LJIIL.LJIIIIZZ;
        String str2 = this.LJIILIIL;
        List<Effect> reward_effects = queryRewardEffectsResponse2.getReward_effects();
        xdm.getClass();
        XDM.LJII(str, str2, reward_effects);
        if (this.LJIIL.LJIIZILJ == 2) {
            XDM.LJIILIIL(queryRewardEffectsResponse2.getUrl_prefix(), queryRewardEffectsResponse2.getReward_effects());
        }
        super.LJIIL(j, j2, j3, queryRewardEffectsResponse2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XDX(XCG effectConfig, String panel, String taskFlag, int i, int i2, java.util.Map<String, String> map) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(panel, "panel");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJIIL = effectConfig;
        this.LJIILIIL = panel;
        this.LJIILJJIL = i;
        this.LJIILL = i2;
        this.LJIILLIIL = map;
    }
}
