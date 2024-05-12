package X;

import Y.ARunnableS51S0100000_15;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XDa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84466XDa extends XDF<List<? extends Effect>, EffectListResponse> {
    public final XCG LJIIL;
    public final java.util.Map<String, String> LJIILIIL;
    public final String LJIILJJIL;

    @Override // X.XDF
    public final int LJII() {
        return 10003;
    }

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        java.util.Map<String, String> map = this.LJIILIIL;
        if (map != null && (true ^ map.isEmpty())) {
            LIZ.putAll(this.LJIILIIL);
        }
        XD7 xd7 = XD7.GET;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIIL.LIZ, "/user/usedSticker", LIZ2, LIZ), null, xd7, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.EffectListResponse] */
    @Override // X.XDF
    public final EffectListResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, EffectListResponse.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84466XDa(XCG effectConfig, String taskId, java.util.Map map) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskId);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(taskId, "taskId");
        this.LJIIL = effectConfig;
        this.LJIILIIL = map;
        this.LJIILJJIL = taskId;
    }

    @Override // X.XDF
    public final void LJIIL(long j, long j2, long j3, EffectListResponse effectListResponse) {
        EffectListResponse effectListResponse2 = effectListResponse;
        String str = this.LJIIL.LJIIIIZZ;
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
        List<Effect> effect_list2 = effectListResponse2.getEffect_list();
        xdm.getClass();
        XDM.LJIIIZ(str, effect_list2);
        XDM.LJIIIZ(str, effectListResponse2.getCollection_list());
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, effectListResponse2, 33), 64));
    }
}
