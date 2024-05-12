package X;

import Y.ARunnableS51S0100000_15;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.net.ModfifyFavoriteResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XD5 extends XDF<List<? extends String>, ModfifyFavoriteResponse> {
    public final XCG LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final List<String> LJIILL;
    public final boolean LJIILLIIL;
    public final java.util.Map<String, String> LJIIZILJ;

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(XCH.LIZ(this.LJIIL, true));
        String str = this.LJIILIIL;
        if (str != null) {
            hashMap.put("panel", str);
        }
        hashMap.put("effect_ids", this.LJIILL);
        hashMap.put("type", Integer.valueOf(this.LJIILLIIL ? 1 : 0));
        java.util.Map<String, String> map = this.LJIIZILJ;
        if (map != null) {
            hashMap.putAll(map);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(JBR.LJFF(LIZ, this.LJIIL.LIZ, "/v3/effect/favorite", LIZ), null, XD7.POST, hashMap, "application/json", 202);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.ugc.effectplatform.model.net.ModfifyFavoriteResponse, X.XDH] */
    @Override // X.XDF
    public final ModfifyFavoriteResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, ModfifyFavoriteResponse.class);
    }

    @Override // X.XDF
    public final void LJIIL(long j, long j2, long j3, ModfifyFavoriteResponse modfifyFavoriteResponse) {
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS165S0100000_15(this, 705), 64));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XD5(XCG effectConfig, String str, String taskFlag, List effectIds, boolean z) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(taskFlag, "taskFlag");
        o.LJIIJ(effectIds, "effectIds");
        this.LJIIL = effectConfig;
        this.LJIILIIL = str;
        this.LJIILJJIL = taskFlag;
        this.LJIILL = effectIds;
        this.LJIILLIIL = z;
        this.LJIIZILJ = null;
    }
}
