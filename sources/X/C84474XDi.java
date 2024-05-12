package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.net.ProviderEffectDetailResponse;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.XDi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84474XDi extends XDF<ProviderEffect, ProviderEffectDetailResponse> {
    public final XCG LJIIL;
    public final String LJIILIIL;
    public final EnumC35455Dvn LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final boolean LJIIZILJ;
    public final java.util.Map<String, String> LJIJ;

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        LIZ.put("library_material_id", this.LJIILLIIL);
        LIZ.put("provider", String.valueOf(this.LJIILJJIL.ordinal() + 1));
        java.util.Map<String, String> map = this.LJIJ;
        if (map != null) {
            LIZ.putAll(map);
        }
        LIZ.putAll(XCH.LIZ(this.LJIIL, true));
        String str = this.LJIILL;
        if (str == null) {
            str = this.LJIIL.LJJIIJZLJL;
        }
        return new XD6(C61597OFl.LIZ(LIZ, o.LJIILLIIL("/media/library/get_library_material_detail", str)), null, XD7.GET, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.ugc.effectplatform.model.net.ProviderEffectDetailResponse, X.XDH] */
    @Override // X.XDF
    public final ProviderEffectDetailResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, ProviderEffectDetailResponse.class);
    }

    @Override // X.XDF
    public final void LJIIJ(String str, String str2, C84418XBe c84418XBe) {
        c84418XBe.LIZ(str, this.LJIIL.LJJIIJZLJL, str2);
        super.LJIIJ(str, str2, c84418XBe);
    }

    @Override // X.XDF
    public final void LJIIL(long j, long j2, long j3, ProviderEffectDetailResponse providerEffectDetailResponse) {
        ProviderEffectDetailResponse providerEffectDetailResponse2 = providerEffectDetailResponse;
        ProviderEffect data = providerEffectDetailResponse2.getData();
        if (data != null) {
            XDM xdm = XDM.LIZ;
            String str = this.LJIIL.LJIIIIZZ;
            xdm.getClass();
            XDM.LJIIIIZZ(str, data);
            if (this.LJIIZILJ) {
                new C84460XCu(this.LJIIL, data, this.LJIILIIL).LIZ();
            } else {
                super.LJIIL(j, j2, j3, providerEffectDetailResponse2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84474XDi(XCG effectConfig, String taskFlag, EnumC35455Dvn enumC35455Dvn, String materialId, boolean z) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(taskFlag, "taskFlag");
        o.LJIIJ(materialId, "materialId");
        this.LJIIL = effectConfig;
        this.LJIILIIL = taskFlag;
        this.LJIILJJIL = enumC35455Dvn;
        this.LJIILL = "https://api.tiktokv.com/tiktok/v1";
        this.LJIILLIIL = materialId;
        this.LJIIZILJ = z;
        this.LJIJ = null;
    }
}
