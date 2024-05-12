package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import com.ss.ugc.effectplatform.model.net.ProviderEffectListResponse;
import java.util.HashMap;
import java.util.List;
import ujb.o;

/* renamed from: X.XDe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84470XDe extends XDF<ProviderEffectModel, ProviderEffectListResponse> {
    public final XCG LJIIL;
    public final String LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final String LJIILLIIL;
    public final java.util.Map<String, String> LJIIZILJ;

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        String str = this.LJIILIIL;
        if (str != null) {
            LIZ.put("library", str);
        }
        LIZ.put("cursor", String.valueOf(this.LJIILJJIL));
        LIZ.put("count", String.valueOf(this.LJIILL));
        String str2 = this.LJIILLIIL;
        if (str2 != null && !o.LJJJJJL(str2)) {
            LIZ.put("giphy_type", this.LJIILLIIL);
        }
        java.util.Map<String, String> map = this.LJIIZILJ;
        if (map != null) {
            LIZ.putAll(map);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIIL.LIZ, "/stickers/recommend", LIZ2, LIZ), null, XD7.GET, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.ProviderEffectListResponse] */
    @Override // X.XDF
    public final ProviderEffectListResponse LJIILJJIL(G0J jsonConverter, String str) {
        kotlin.jvm.internal.o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, ProviderEffectListResponse.class);
    }

    @Override // X.XDF
    public final void LJIIJ(String str, String str2, C84418XBe c84418XBe) {
        c84418XBe.LIZ(null, null, null);
        super.LJIIJ(str, str2, c84418XBe);
    }

    @Override // X.XDF
    public final void LJIIL(long j, long j2, long j3, ProviderEffectListResponse providerEffectListResponse) {
        List<ProviderEffect> sticker_list;
        String convertObjToJson;
        InterfaceC84458XCs interfaceC84458XCs;
        ProviderEffectListResponse providerEffectListResponse2 = providerEffectListResponse;
        ProviderEffectModel data = providerEffectListResponse2.getData();
        if (data != null) {
            if (data.getSticker_list() != null && (sticker_list = data.getSticker_list()) != null) {
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
            }
            try {
                String LJIIIIZZ = XDN.LJIIIIZZ(this.LJIIL.LJFF, this.LJIILIIL);
                G0J g0j = this.LJIIL.LJIJ;
                if (g0j != null && (convertObjToJson = ((KNJsonConverter) g0j.LIZ).convertObjToJson(data)) != null && (interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIIL.LJJIFFI)) != null) {
                    interfaceC84458XCs.save(LJIIIIZZ, convertObjToJson);
                }
            } catch (Exception e) {
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                String valueOf = String.valueOf(e);
                c12310e3.getClass();
                C12310e3.LIZIZ("FetchProviderEffectTask", valueOf, null);
            }
            super.LJIIL(j, j2, j3, providerEffectListResponse2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84470XDe(int i, int i2, XCG effectConfig, String taskFlag, String str, String str2) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        kotlin.jvm.internal.o.LJIIJ(effectConfig, "effectConfig");
        kotlin.jvm.internal.o.LJIIJ(taskFlag, "taskFlag");
        this.LJIIL = effectConfig;
        this.LJIILIIL = str;
        this.LJIILJJIL = i;
        this.LJIILL = i2;
        this.LJIILLIIL = str2;
        this.LJIIZILJ = null;
    }
}
