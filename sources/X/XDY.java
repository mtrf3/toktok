package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XDY extends XDF<List<? extends Effect>, EffectListResponse> {
    public final XCG LJIIL;
    public final List<String> LJIILIIL;
    public final java.util.Map<String, String> LJIILJJIL;
    public final InterfaceC84447XCh LJIILL;

    @Override // X.XDF
    public final XD6 LJI() {
        G0J g0j;
        String convertObjToJson;
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        java.util.Map<String, String> map = this.LJIILJJIL;
        if (map != null) {
            LIZ.putAll(map);
        }
        List<String> list = this.LJIILIIL;
        if (list != null && (g0j = this.LJIIL.LJIJ) != null && (convertObjToJson = ((KNJsonConverter) g0j.LIZ).convertObjToJson(list)) != null) {
            LIZ.put("effect_ids", convertObjToJson);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIIL.LIZ, "/v3/effect/list", LIZ2, LIZ), null, XD7.GET, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.EffectListResponse] */
    @Override // X.XDF
    public final EffectListResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, EffectListResponse.class);
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
        XDM xdm = XDM.LIZ;
        String str = this.LJIIL.LJIIIIZZ;
        List<Effect> effect_list2 = effectListResponse2.getEffect_list();
        xdm.getClass();
        XDM.LJIIIZ(str, effect_list2);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(effectListResponse2.getEffect_list());
        arrayList.addAll(effectListResponse2.getBind_effects());
        arrayList.addAll(effectListResponse2.getCollection_list());
        if (arrayList.isEmpty()) {
            super.LJIIL(j, j2, j3, effectListResponse2);
        } else {
            XDM.LJIILIIL(null, arrayList);
            this.LJIILL.LIZ(arrayList, new XE2(this, j, j2, j3, effectListResponse2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XDY(XCG config, List list, String taskFlag, java.util.Map map, XCY oidHelper) {
        super((X62) config.LJIJI.LIZ, config.LJIJ, config.LJJJ, taskFlag);
        o.LJIIJ(config, "config");
        o.LJIIJ(taskFlag, "taskFlag");
        o.LJIIJ(oidHelper, "oidHelper");
        this.LJIIL = config;
        this.LJIILIIL = list;
        this.LJIILJJIL = map;
        this.LJIILL = oidHelper;
    }
}
