package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XDC extends XDF<FetchFavoriteListResponse, FetchFavoriteListResponse> {
    public final XCG LJIIL;
    public final String LJIILIIL;
    public final java.util.Map<String, String> LJIILJJIL;

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        String str = this.LJIILIIL;
        if (str != null) {
            LIZ.put("panel", str);
        }
        java.util.Map<String, String> map = this.LJIILJJIL;
        if (map != null) {
            LIZ.putAll(map);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIIL.LIZ, "/v3/effect/my", LIZ2, LIZ), null, XD7.GET, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    @Override // X.XDF
    public final int LJIIIIZZ() {
        return this.LJIIL.LJIILL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse] */
    @Override // X.XDF
    public final FetchFavoriteListResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, FetchFavoriteListResponse.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XDC(XCG effectConfig, String str, String taskFlag, java.util.Map<String, String> map) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJIIL = effectConfig;
        this.LJIILIIL = str;
        this.LJIILJJIL = map;
    }

    @Override // X.XDF
    public final void LJIIL(long j, long j2, long j3, FetchFavoriteListResponse fetchFavoriteListResponse) {
        FetchFavoriteListResponse fetchFavoriteListResponse2 = fetchFavoriteListResponse;
        List<Effect> effect_list = fetchFavoriteListResponse2.getEffect_list();
        if (effect_list != null) {
            for (Effect effect : effect_list) {
                effect.setId(ujb.o.LJJJJZ(ujb.o.LJJJJZ(effect.getId(), "\"", "_", false), "/", "_", false));
            }
        }
        List<Effect> collection_effects = fetchFavoriteListResponse2.getCollection_effects();
        if (collection_effects != null) {
            for (Effect effect2 : collection_effects) {
                effect2.setId(ujb.o.LJJJJZ(ujb.o.LJJJJZ(effect2.getId(), "\"", "_", false), "/", "_", false));
            }
        }
        XDM xdm = XDM.LIZ;
        String str = this.LJIIL.LJIIIIZZ;
        List<Effect> effect_list2 = fetchFavoriteListResponse2.getEffect_list();
        xdm.getClass();
        XDM.LJIIIZ(str, effect_list2);
        XDM.LJIIIZ(this.LJIIL.LJIIIIZZ, fetchFavoriteListResponse2.getCollection_effects());
        super.LJIIL(j, j2, j3, fetchFavoriteListResponse2);
    }
}
