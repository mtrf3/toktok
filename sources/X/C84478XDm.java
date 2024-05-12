package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import com.ss.ugc.effectplatform.model.net.ResourceListResponse;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.XDm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84478XDm extends XDF<ResourceListModel, ResourceListResponse> {
    public final XCG LJIIL;
    public final java.util.Map<String, String> LJIILIIL;

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        java.util.Map<String, String> map = this.LJIILIIL;
        if (map != null) {
            LIZ.putAll(map);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIIL.LIZ, "/moji/resource", LIZ2, LIZ), null, XD7.GET, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.ResourceListResponse] */
    @Override // X.XDF
    public final ResourceListResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, ResourceListResponse.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84478XDm(XCG effectConfig, String taskFlag, java.util.Map<String, String> map) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJIIL = effectConfig;
        this.LJIILIIL = map;
    }
}
