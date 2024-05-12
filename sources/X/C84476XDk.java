package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XDk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84476XDk extends XDF<SearchEffectResponse, SearchEffectResponse> {
    public final XCG LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final java.util.Map<String, String> LJIIZILJ;

    @Override // X.XDF
    public final int LJII() {
        return 10014;
    }

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        LIZ.put("panel", this.LJIILIIL);
        LIZ.put("keyword", this.LJIILJJIL);
        LIZ.put("cursor", String.valueOf(this.LJIILLIIL));
        LIZ.put("count", String.valueOf(this.LJIILL));
        java.util.Map<String, String> map = this.LJIIZILJ;
        if (map != null) {
            LIZ.putAll(map);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIIL.LIZ, "/search", LIZ2, LIZ), null, XD7.GET, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.SearchEffectResponse] */
    @Override // X.XDF
    public final SearchEffectResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, SearchEffectResponse.class);
    }

    @Override // X.XDF
    public final void LJIIL(long j, long j2, long j3, SearchEffectResponse searchEffectResponse) {
        SearchEffectResponse searchEffectResponse2 = searchEffectResponse;
        XDM xdm = XDM.LIZ;
        String str = this.LJIIL.LJIIIIZZ;
        String str2 = this.LJIILIIL;
        List<Effect> effect_list = searchEffectResponse2.getEffect_list();
        xdm.getClass();
        XDM.LJII(str, str2, effect_list);
        XDM.LJII(this.LJIIL.LJIIIIZZ, this.LJIILIIL, searchEffectResponse2.getCollection_list());
        XDM.LJII(this.LJIIL.LJIIIIZZ, this.LJIILIIL, searchEffectResponse2.getBind_effects());
        super.LJIIL(j, j2, j3, searchEffectResponse2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84476XDk(int i, int i2, XCG effectConfig, String panel, String keyword, String taskFlag, java.util.Map map) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(panel, "panel");
        o.LJIIJ(keyword, "keyword");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJIIL = effectConfig;
        this.LJIILIIL = panel;
        this.LJIILJJIL = keyword;
        this.LJIILL = i;
        this.LJIILLIIL = i2;
        this.LJIIZILJ = map;
    }
}
