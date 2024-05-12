package X;

import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XDG extends XDF<FetchHotEffectResponse, FetchHotEffectResponse> {
    public final XCG LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final java.util.Map<String, String> LJIILL;

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be A[ADDED_TO_REGION, EDGE_INSN: B:69:0x00be->B:41:0x00be BREAK  A[LOOP:0: B:2:0x000e->B:34:0x0166], SYNTHETIC] */
    @Override // X.XDF, X.XCZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XDG.LIZ():void");
    }

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        LIZ.put("cursor", String.valueOf(this.LJIILJJIL));
        LIZ.put("count", String.valueOf(this.LJIILIIL));
        LIZ.put("panel", "default");
        java.util.Map<String, String> map = this.LJIILL;
        if (map != null) {
            LIZ.putAll(map);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIIL.LIZ, "/hoteffects", LIZ2, LIZ), null, null, null, null, 254);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse] */
    @Override // X.XDF
    public final FetchHotEffectResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, FetchHotEffectResponse.class);
    }

    @Override // X.XDF
    /* renamed from: LJIILL, reason: merged with bridge method [inline-methods] */
    public final void LJIIL(long j, long j2, long j3, FetchHotEffectResponse fetchHotEffectResponse) {
        String convertObjToJson;
        InterfaceC84458XCs interfaceC84458XCs;
        long currentTimeMillis = System.currentTimeMillis();
        List<Effect> effect_list = fetchHotEffectResponse.getEffect_list();
        if (effect_list != null) {
            for (Effect effect : effect_list) {
                effect.setId(ujb.o.LJJJJZ(ujb.o.LJJJJZ(effect.getId(), "\"", "_", false), "/", "_", false));
            }
        }
        List<Effect> collection_list = fetchHotEffectResponse.getCollection_list();
        if (collection_list != null) {
            for (Effect effect2 : collection_list) {
                effect2.setId(ujb.o.LJJJJZ(ujb.o.LJJJJZ(effect2.getId(), "\"", "_", false), "/", "_", false));
            }
        }
        XDM xdm = XDM.LIZ;
        String str = this.LJIIL.LJIIIIZZ;
        List<Effect> effect_list2 = fetchHotEffectResponse.getEffect_list();
        xdm.getClass();
        XDM.LJIIIZ(str, effect_list2);
        XDM.LJIIIZ(this.LJIIL.LJIIIIZZ, fetchHotEffectResponse.getCollection_list());
        XDM.LJIILIIL(fetchHotEffectResponse.getUrlPrefix(), fetchHotEffectResponse.getEffect_list());
        XDM.LJIILIIL(fetchHotEffectResponse.getUrlPrefix(), fetchHotEffectResponse.getCollection_list());
        XDM.LJIIJ(fetchHotEffectResponse.getRecId(), fetchHotEffectResponse.getEffect_list());
        XDM.LJIIJ(fetchHotEffectResponse.getRecId(), fetchHotEffectResponse.getCollection_list());
        XCG xcg = this.LJIIL;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        if (interfaceC58749N3x != null) {
            C63081OpJ.LLIIZ(interfaceC58749N3x, true, "hot", xcg, C113554cx.LJJL(new OSZ("log_id", this.LJI), new OSZ("duration", Long.valueOf(currentTimeMillis - j)), new OSZ("network_time", Long.valueOf(j2 - j)), new OSZ("json_time", Long.valueOf(j3 - j2))), "");
        }
        super.LJIIL(j, j2, j3, fetchHotEffectResponse);
        try {
            G0J g0j = this.LJIIL.LJIJ;
            if (g0j != null && (convertObjToJson = ((KNJsonConverter) g0j.LIZ).convertObjToJson(fetchHotEffectResponse)) != null && (interfaceC84458XCs = (InterfaceC84458XCs) this.LJIIL.LJJIFFI.LIZ) != null) {
                interfaceC84458XCs.save("effectgalleryhot", convertObjToJson);
            }
        } catch (Exception e) {
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("saveHotEffectList: ");
            LIZ.append(e);
            String LIZIZ = X1D.LIZIZ(LIZ);
            c12310e3.getClass();
            C12310e3.LIZIZ("FetchHotEffectListTask", LIZIZ, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XDG(XCG effectConfig, int i, int i2, String taskFlag, java.util.Map<String, String> map) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJIIL = effectConfig;
        this.LJIILIIL = i;
        this.LJIILJJIL = i2;
        this.LJIILL = map;
    }
}
