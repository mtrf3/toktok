package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.net.GetCustomizedEffectIDData;
import com.ss.ugc.effectplatform.model.net.GetCustomizedEffectIDResponse;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.XDj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84475XDj extends XDF<GetCustomizedEffectIDData, GetCustomizedEffectIDResponse> {
    public final XCG LJIIL;
    public final long LJIILIIL;
    public final java.util.Map<String, String> LJIILJJIL;

    @Override // X.XDF
    public final int LJII() {
        return 10002;
    }

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        LIZ.put("aid", String.valueOf(this.LJIILIIL));
        java.util.Map<String, String> map = this.LJIILJJIL;
        if (map != null) {
            LIZ.putAll(map);
        }
        XD7 xd7 = XD7.GET;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIIL.LIZ, "/customized/id", LIZ2, LIZ), null, xd7, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    @Override // X.XDF
    public final int LJIIIIZZ() {
        return this.LJIIL.LJIILL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.GetCustomizedEffectIDResponse] */
    @Override // X.XDF
    public final GetCustomizedEffectIDResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, GetCustomizedEffectIDResponse.class);
    }

    @Override // X.XDF
    public final void LJIIJ(String str, String str2, C84418XBe c84418XBe) {
        c84418XBe.LIZ(str, this.LJIIL.LJJIIJZLJL, str2);
        super.LJIIJ(str, str2, c84418XBe);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84475XDj(XCG effectConfig, long j, String taskFlag, java.util.Map<String, String> map) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJIIL = effectConfig;
        this.LJIILIIL = j;
        this.LJIILJJIL = map;
    }
}
