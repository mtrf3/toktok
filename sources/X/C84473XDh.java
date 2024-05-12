package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import com.ss.ugc.effectplatform.model.net.ProviderEffectListResponse;
import java.util.HashMap;
import java.util.List;
import ujb.o;

/* renamed from: X.XDh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84473XDh extends XDF<ProviderEffectModel, ProviderEffectListResponse> {
    public final XCG LJIIL;
    public final String LJIILIIL;
    public final EnumC35455Dvn LJIILJJIL;
    public final String LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final String LJIJI;
    public final String LJIJJ;
    public final java.util.Map<String, String> LJIJJLI;

    @Override // X.XDF
    public final XD6 LJI() {
        String str;
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        String str2 = this.LJIILL;
        if (str2 == null || o.LJJJJJL(str2)) {
            str = "/media/library/get_library_trending";
        } else {
            LIZ.put("keyword", this.LJIILL);
            str = "/media/library/search_library";
        }
        LIZ.put("num", String.valueOf(this.LJIILLIIL));
        LIZ.put("gif_cursor", String.valueOf(this.LJIIZILJ));
        LIZ.put("clip_cursor", String.valueOf(this.LJIJ));
        LIZ.put("provider", String.valueOf(this.LJIILJJIL.ordinal() + 1));
        String str3 = this.LJIJI;
        if (str3 != null) {
            LIZ.put("rate", str3);
        }
        String str4 = this.LJIJJ;
        if (str4 != null) {
            LIZ.put("feed_session_id", str4);
        }
        java.util.Map<String, String> map = this.LJIJJLI;
        if (map != null) {
            LIZ.putAll(map);
        }
        LIZ.putAll(XCH.LIZ(this.LJIIL, true));
        String str5 = this.LJIILIIL;
        if (str5 == null) {
            str5 = this.LJIIL.LJJIIJZLJL;
        }
        return new XD6(C61597OFl.LIZ(LIZ, kotlin.jvm.internal.o.LJIILLIIL(str, str5)), null, XD7.GET, null, null, LiveCoverMinSizeSetting.DEFAULT);
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
        ProviderEffectListResponse providerEffectListResponse2 = providerEffectListResponse;
        ProviderEffectModel data = providerEffectListResponse2.getData();
        if (data != null) {
            List<ProviderEffect> library_list = data.getLibrary_list();
            if (library_list != null && !library_list.isEmpty()) {
                List<ProviderEffect> library_list2 = data.getLibrary_list();
                if (library_list2 != null) {
                    for (ProviderEffect providerEffect : library_list2) {
                        XDM xdm = XDM.LIZ;
                        String str = this.LJIIL.LJIIIIZZ;
                        xdm.getClass();
                        XDM.LJIIIIZZ(str, providerEffect);
                        String media_source = providerEffect.getMedia_source();
                        if (media_source == null || o.LJJJJJL(media_source)) {
                            String media_source2 = data.getMedia_source();
                            if (media_source2 != null) {
                                providerEffect.setMedia_source(media_source2);
                            }
                        }
                    }
                } else {
                    kotlin.jvm.internal.o.LJIIZILJ();
                    throw null;
                }
            }
            super.LJIIL(j, j2, j3, providerEffectListResponse2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84473XDh(XCG effectConfig, String taskFlag, EnumC35455Dvn provider, String str, int i, int i2, int i3, String str2, java.util.Map map) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        kotlin.jvm.internal.o.LJIIJ(effectConfig, "effectConfig");
        kotlin.jvm.internal.o.LJIIJ(taskFlag, "taskFlag");
        kotlin.jvm.internal.o.LJIIJ(provider, "provider");
        this.LJIIL = effectConfig;
        this.LJIILIIL = "https://api.tiktokv.com/tiktok/v1";
        this.LJIILJJIL = provider;
        this.LJIILL = str;
        this.LJIILLIIL = i;
        this.LJIIZILJ = i2;
        this.LJIJ = i3;
        this.LJIJI = null;
        this.LJIJJ = str2;
        this.LJIJJLI = map;
    }
}
