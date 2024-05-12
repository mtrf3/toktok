package X;

import Y.ARunnableS51S0100000_15;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XDZ extends XDF<List<? extends Effect>, EffectListResponse> {
    public final XCG LJIIL;
    public final List<String> LJIILIIL;
    public final String LJIILJJIL;
    public final java.util.Map<String, String> LJIILL;
    public final boolean LJIILLIIL;
    public final InterfaceC84447XCh LJIIZILJ;

    @Override // X.XDF
    public final int LJII() {
        return 10014;
    }

    @Override // X.XDF
    public final XD6 LJI() {
        String str;
        G0J g0j;
        String convertObjToJson;
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        java.util.Map<String, String> map = this.LJIILL;
        if (map != null) {
            LIZ.putAll(map);
        }
        List<String> list = this.LJIILIIL;
        if (list != null && (g0j = this.LJIIL.LJIJ) != null && (convertObjToJson = ((KNJsonConverter) g0j.LIZ).convertObjToJson(list)) != null) {
            if (this.LJIILLIIL) {
                LIZ.put("effect_ids", convertObjToJson);
            } else {
                LIZ.put("resource_ids", convertObjToJson);
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIL.LJJIIJZLJL);
        LIZ2.append(this.LJIIL.LIZ);
        if (this.LJIILLIIL) {
            str = "/v3/effect/list";
        } else {
            str = "/v3/effect/listByResourceId";
        }
        LIZ2.append(str);
        return new XD6(C61597OFl.LIZ(LIZ, X1D.LIZIZ(LIZ2)), null, XD7.GET, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.EffectListResponse] */
    @Override // X.XDF
    public final EffectListResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, EffectListResponse.class);
    }

    @Override // X.XDF
    public final void LJIIJ(String str, String str2, C84418XBe c84418XBe) {
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, c84418XBe, 51), 64));
    }

    @Override // X.XDF
    public final void LJIIL(long j, long j2, long j3, EffectListResponse effectListResponse) {
        EffectListResponse effectListResponse2 = effectListResponse;
        List<Effect> effect_list = effectListResponse2.getEffect_list();
        if (effect_list != null) {
            for (Effect effect : effect_list) {
                effect.setId(ujb.o.LJJJJZ(ujb.o.LJJJJZ(effect.getId(), "\"", "_", false), "/", "_", false));
            }
        }
        List<Effect> collection_list = effectListResponse2.getCollection_list();
        if (collection_list != null) {
            for (Effect effect2 : collection_list) {
                effect2.setId(ujb.o.LJJJJZ(ujb.o.LJJJJZ(effect2.getId(), "\"", "_", false), "/", "_", false));
            }
        }
        XDM xdm = XDM.LIZ;
        List<String> url_prefix = effectListResponse2.getUrl_prefix();
        List<Effect> effect_list2 = effectListResponse2.getEffect_list();
        xdm.getClass();
        XDM.LJIILIIL(url_prefix, effect_list2);
        XDM.LJIILIIL(effectListResponse2.getUrl_prefix(), effectListResponse2.getCollection_list());
        XDM.LJIILIIL(effectListResponse2.getUrl_prefix(), effectListResponse2.getBind_effects());
        XDM.LJIIIZ(this.LJIIL.LJIIIIZZ, effectListResponse2.getEffect_list());
        XDM.LJIIIZ(this.LJIIL.LJIIIIZZ, effectListResponse2.getCollection_list());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(effectListResponse2.getEffect_list());
        arrayList.addAll(effectListResponse2.getBind_effects());
        arrayList.addAll(effectListResponse2.getCollection_list());
        if (arrayList.isEmpty()) {
            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, effectListResponse2, 54), 64));
        } else {
            XDM.LJIILIIL(null, arrayList);
            this.LJIIZILJ.LIZ(arrayList, new XE8(this, effectListResponse2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XDZ(XCG effectConfig, List list, String taskFlag, java.util.Map map, boolean z, XCY oidHelper) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(taskFlag, "taskFlag");
        o.LJIIJ(oidHelper, "oidHelper");
        this.LJIIL = effectConfig;
        this.LJIILIIL = list;
        this.LJIILJJIL = taskFlag;
        this.LJIILL = map;
        this.LJIILLIIL = z;
        this.LJIIZILJ = oidHelper;
    }
}
