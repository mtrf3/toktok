package X;

import com.byted.cast.common.CommonOptionConstants;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XDK extends XDF<FetchFavoriteListResponse, FetchFavoriteListResponse> {
    public final C0FT LJIIL;
    public final XCG LJIILIIL;
    public final String LJIILJJIL;
    public final java.util.Map<String, String> LJIILL;

    @Override // X.XDF
    public final int LJII() {
        return 10002;
    }

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap LIZ = XCH.LIZ(this.LJIILIIL, true);
        LIZ.put("panel", this.LJIILJJIL);
        java.util.Map<String, String> map = this.LJIILL;
        if (map != null) {
            LIZ.putAll(map);
        }
        XD7 xd7 = XD7.GET;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIILIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIILIIL.LIZ, "/effect/user/effects", LIZ2, LIZ), null, xd7, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    @Override // X.XDF
    public final int LJIIIIZZ() {
        return this.LJIILIIL.LJIILL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse] */
    @Override // X.XDF
    public final FetchFavoriteListResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, FetchFavoriteListResponse.class);
    }

    @Override // X.XDF
    public final void LJIIJ(String str, String str2, C84418XBe c84418XBe) {
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Failed: ");
        LIZ.append(c84418XBe);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZIZ("QueryRecentUsedEffectTask", LIZIZ, null);
        c84418XBe.LIZ(str, this.LJIILIIL.LJJIIJZLJL, str2);
        super.LJIIJ(str, str2, c84418XBe);
        XCG xcg = this.LJIILIIL;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        if (interfaceC58749N3x != null) {
            C63081OpJ.LLIIZ(interfaceC58749N3x, false, "recent_use_effect", xcg, C113554cx.LJJL(new OSZ("log_id", this.LJI), new OSZ("panel", this.LJIILJJIL), new OSZ("error_code", Integer.valueOf(c84418XBe.LIZ))), c84418XBe.LIZIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XDK(XCG effectConfig, String panel, String taskFlag, java.util.Map<String, String> map) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(panel, "panel");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJIILIIL = effectConfig;
        this.LJIILJJIL = panel;
        this.LJIILL = map;
        this.LJIIL = new C0FT((Object) 0L);
    }

    @Override // X.XDF
    public final void LJIIL(long j, long j2, long j3, FetchFavoriteListResponse fetchFavoriteListResponse) {
        FetchFavoriteListResponse fetchFavoriteListResponse2 = fetchFavoriteListResponse;
        if (fetchFavoriteListResponse2.getData().isEmpty()) {
            LJIIJ(null, null, new C84418XBe(CommonOptionConstants.OPTION_SET_FILE_LOG_ENABLED));
            return;
        }
        for (Effect effect : fetchFavoriteListResponse2.getEffect_list()) {
            effect.setId(ujb.o.LJJJJZ(ujb.o.LJJJJZ(effect.getId(), "\"", "_", false), "/", "_", false));
        }
        for (Effect effect2 : fetchFavoriteListResponse2.getCollection_effects()) {
            effect2.setId(ujb.o.LJJJJZ(ujb.o.LJJJJZ(effect2.getId(), "\"", "_", false), "/", "_", false));
        }
        XDM xdm = XDM.LIZ;
        String str = this.LJIILIIL.LJIIIIZZ;
        List<Effect> effect_list = fetchFavoriteListResponse2.getEffect_list();
        xdm.getClass();
        XDM.LJIIIZ(str, effect_list);
        XDM.LJIIIZ(this.LJIILIIL.LJIIIIZZ, fetchFavoriteListResponse2.getCollection_effects());
        super.LJIIL(j, j2, j3, fetchFavoriteListResponse2);
        long currentTimeMillis = System.currentTimeMillis();
        XCG xcg = this.LJIILIIL;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        if (interfaceC58749N3x != null) {
            C63081OpJ.LLIIZ(interfaceC58749N3x, true, "recent_use_effect", xcg, C113554cx.LJJL(new OSZ("log_id", this.LJI), new OSZ("panel", this.LJIILJJIL), new OSZ("duration", Long.valueOf(currentTimeMillis - j)), new OSZ("network_time", Long.valueOf(j2 - j)), new OSZ("json_time", Long.valueOf(j3 - j2)), new OSZ("io_time", Long.valueOf(currentTimeMillis - j3)), new OSZ("size", this.LJIIL.LIZ)), "");
        }
    }
}
