package X;

import Y.ARunnableS51S0100000_15;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.GifProviderEffectModel;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import com.ss.ugc.effectplatform.model.net.GifProviderEffectListResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS162S0200000_15;
import ujb.o;

/* renamed from: X.XDf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84471XDf extends XDF<GifProviderEffectModel, GifProviderEffectListResponse> {
    public final XCG LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final java.util.Map<String, String> LJIILLIIL;
    public final boolean LJIIZILJ;

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        LIZ.put("gif_id", this.LJIILJJIL);
        String str = this.LJIILL;
        if (str != null && !o.LJJJJJL(str)) {
            LIZ.put("giphy_type", this.LJIILL);
        }
        java.util.Map<String, String> map = this.LJIILLIIL;
        if (map != null) {
            LIZ.putAll(map);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIIL.LIZ, "/stickers/list", LIZ2, LIZ), null, null, null, null, 254);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.GifProviderEffectListResponse] */
    @Override // X.XDF
    public final GifProviderEffectListResponse LJIILJJIL(G0J jsonConverter, String str) {
        kotlin.jvm.internal.o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, GifProviderEffectListResponse.class);
    }

    @Override // X.XDF
    public final void LJIIJ(String str, String str2, C84418XBe c84418XBe) {
        c84418XBe.LIZ(null, null, null);
        super.LJIIJ(str, str2, c84418XBe);
    }

    @Override // X.XDF
    public final void LJIIL(long j, long j2, long j3, GifProviderEffectListResponse gifProviderEffectListResponse) {
        List<ProviderEffect> list;
        ProviderEffectModel gifs;
        GifProviderEffectListResponse gifProviderEffectListResponse2 = gifProviderEffectListResponse;
        GifProviderEffectModel data = gifProviderEffectListResponse2.getData();
        if (data != null && (gifs = data.getGifs()) != null) {
            list = gifs.getSticker_list();
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            for (ProviderEffect providerEffect : list) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LJIIL.LJIIIIZZ);
                LIZ.append(C10820be.LIZ);
                LIZ.append(providerEffect.getId());
                LIZ.append(".gif");
                providerEffect.setPath(X1D.LIZIZ(LIZ));
            }
        }
        if (!this.LJIIZILJ || list == null || list.isEmpty()) {
            super.LJIIL(j, j2, j3, gifProviderEffectListResponse2);
            return;
        }
        XDR LIZ2 = this.LJIIL.LJJJ.LIZ(this.LJIILIIL);
        if (LIZ2 instanceof XE9) {
            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(LIZ2, gifProviderEffectListResponse2, 59), 64));
        }
        C84484XDs c84484XDs = new C84484XDs(this, gifProviderEffectListResponse2, list);
        for (ProviderEffect providerEffect2 : list) {
            String LIZ3 = C84410XAw.LIZ();
            this.LJIIL.LJJJ.LIZIZ(LIZ3, c84484XDs);
            XCG xcg = this.LJIIL;
            XCX xcx = xcg.LJJIIJ;
            if (xcx != null) {
                xcx.LIZ(new C84460XCu(xcg, providerEffect2, LIZ3));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84471XDf(XCG effectConfig, String taskFlag, String giphyIds, String str, java.util.Map<String, String> map, boolean z) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        kotlin.jvm.internal.o.LJIIJ(effectConfig, "effectConfig");
        kotlin.jvm.internal.o.LJIIJ(taskFlag, "taskFlag");
        kotlin.jvm.internal.o.LJIIJ(giphyIds, "giphyIds");
        this.LJIIL = effectConfig;
        this.LJIILIIL = taskFlag;
        this.LJIILJJIL = giphyIds;
        this.LJIILL = str;
        this.LJIILLIIL = map;
        this.LJIIZILJ = z;
    }
}
