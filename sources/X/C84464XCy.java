package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponseV2;
import java.util.HashMap;
import ujb.o;

/* renamed from: X.XCy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84464XCy extends XDF<SearchEffectResponseV2, SearchEffectResponseV2> {
    public final XCG LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final java.util.Map<String, String> LJIIZILJ;
    public final String LJIJ;

    @Override // X.XDF
    public final int LJII() {
        return 10014;
    }

    @Override // X.XDF
    public final XD6 LJI() {
        String LJFF;
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        String str = this.LJIILIIL;
        if (str != null) {
            LIZ.put("search_id", str);
        }
        LIZ.put("keyword", this.LJIILJJIL);
        LIZ.put("cursor", String.valueOf(this.LJIILLIIL));
        LIZ.put("count", String.valueOf(this.LJIILL));
        java.util.Map<String, String> map = this.LJIIZILJ;
        if (map != null) {
            LIZ.putAll(map);
        }
        String str2 = this.LJIJ;
        if (str2 == null || o.LJJJJJL(str2)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LJIIL.LJJIIJZLJL);
            LJFF = JBR.LJFF(LIZ2, this.LJIIL.LIZ, "/search/effects", LIZ2);
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LJFF = JBR.LJFF(LIZ3, this.LJIJ, "/aweme/v1/search/effect/", LIZ3);
        }
        return new XD6(C61597OFl.LIZ(LIZ, LJFF), null, XD7.GET, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.SearchEffectResponseV2] */
    @Override // X.XDF
    public final SearchEffectResponseV2 LJIILJJIL(G0J jsonConverter, String str) {
        kotlin.jvm.internal.o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, SearchEffectResponseV2.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84464XCy(XCG effectConfig, String str, String keyword, int i, int i2, java.util.Map<String, String> map, String taskFlag, String str2) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        kotlin.jvm.internal.o.LJIIJ(effectConfig, "effectConfig");
        kotlin.jvm.internal.o.LJIIJ(keyword, "keyword");
        kotlin.jvm.internal.o.LJIIJ(taskFlag, "taskFlag");
        this.LJIIL = effectConfig;
        this.LJIILIIL = str;
        this.LJIILJJIL = keyword;
        this.LJIILL = i;
        this.LJIILLIIL = i2;
        this.LJIIZILJ = map;
        this.LJIJ = str2;
    }
}
