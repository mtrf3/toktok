package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import com.ss.ugc.effectplatform.model.net.ProviderEffectListResponse;
import java.util.HashMap;
import java.util.List;
import ujb.o;

/* renamed from: X.XDg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84472XDg extends XDF<ProviderEffectModel, ProviderEffectListResponse> {
    public final XCG LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final String LJIIZILJ;

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        String str = this.LJIILJJIL;
        if (str != null) {
            LIZ.put("library", str);
        }
        String str2 = this.LJIILIIL;
        if (str2 != null) {
            LIZ.put("word", str2);
        }
        LIZ.put("cursor", String.valueOf(this.LJIILL));
        LIZ.put("count", String.valueOf(this.LJIILLIIL));
        String str3 = this.LJIIZILJ;
        if (str3 != null && !o.LJJJJJL(str3)) {
            LIZ.put("giphy_type", this.LJIIZILJ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIIL.LIZ, "/stickers/search", LIZ2, LIZ), null, XD7.GET, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.ProviderEffectListResponse] */
    @Override // X.XDF
    public final ProviderEffectListResponse LJIILJJIL(G0J jsonConverter, String str) {
        kotlin.jvm.internal.o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, ProviderEffectListResponse.class);
    }

    @Override // X.XDF
    public final void LJIIJ(String str, String str2, C84418XBe c84418XBe) {
        c84418XBe.LIZ(str, this.LJIIL.LJJIIJZLJL, str2);
        super.LJIIJ(str, str2, c84418XBe);
    }

    @Override // X.XDF
    public final void LJIIL(long j, long j2, long j3, ProviderEffectListResponse providerEffectListResponse) {
        List<ProviderEffect> sticker_list;
        ProviderEffectListResponse providerEffectListResponse2 = providerEffectListResponse;
        ProviderEffectModel data = providerEffectListResponse2.getData();
        if (data != null && (sticker_list = data.getSticker_list()) != null) {
            for (ProviderEffect providerEffect : sticker_list) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LJIIL.LJIIIIZZ);
                LIZ.append(C10820be.LIZ);
                LIZ.append(providerEffect.getId());
                LIZ.append(".gif");
                providerEffect.setPath(X1D.LIZIZ(LIZ));
                String media_source = providerEffect.getMedia_source();
                if (media_source == null || o.LJJJJJL(media_source)) {
                    String media_source2 = data.getMedia_source();
                    if (media_source2 != null) {
                        providerEffect.setMedia_source(media_source2);
                    }
                }
            }
            super.LJIIL(j, j2, j3, providerEffectListResponse2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84472XDg(XCG effectConfig, String taskFlag, String str, String str2, int i, int i2, String str3) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        kotlin.jvm.internal.o.LJIIJ(effectConfig, "effectConfig");
        kotlin.jvm.internal.o.LJIIJ(taskFlag, "taskFlag");
        this.LJIIL = effectConfig;
        this.LJIILIIL = str;
        this.LJIILJJIL = str2;
        this.LJIILL = i;
        this.LJIILLIIL = i2;
        this.LJIIZILJ = str3;
    }
}
