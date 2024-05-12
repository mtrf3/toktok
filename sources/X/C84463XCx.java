package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.net.ConvertOidToUrlResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XCx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84463XCx extends XDF<ConvertOidToUrlResponse, ConvertOidToUrlResponse> {
    public final XCG LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final List<String> LJIILL;
    public final java.util.Map<String, String> LJIILLIIL;

    @Override // X.XDF
    public final int LJII() {
        return 10002;
    }

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap hashMap = new HashMap();
        hashMap.put(WM7.SCENE_SERVICE, this.LJIILJJIL);
        G0J g0j = this.LJIIL.LJIJ;
        if (g0j != null) {
            String convertObjToJson = ((KNJsonConverter) g0j.LIZ).convertObjToJson(this.LJIILL);
            if (convertObjToJson != null) {
                hashMap.put("object_ids", convertObjToJson);
            }
        }
        java.util.Map<String, String> map = this.LJIILLIIL;
        if (map != null) {
            hashMap.putAll(map);
        }
        return new XD6(C61597OFl.LIZ(hashMap, this.LJIILIIL), null, XD7.GET, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    @Override // X.XDF
    public final int LJIIIIZZ() {
        return this.LJIIL.LJIILL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.ConvertOidToUrlResponse] */
    @Override // X.XDF
    public final ConvertOidToUrlResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, ConvertOidToUrlResponse.class);
    }

    @Override // X.XDF
    public final void LJIIJ(String str, String str2, C84418XBe c84418XBe) {
        c84418XBe.LIZ(str, this.LJIIL.LJJIIJZLJL, str2);
        super.LJIIJ(str, str2, c84418XBe);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84463XCx(XCG effectConfig, String url, String scene, List oidList, String taskFlag) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(url, "url");
        o.LJIIJ(scene, "scene");
        o.LJIIJ(oidList, "oidList");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJIIL = effectConfig;
        this.LJIILIIL = url;
        this.LJIILJJIL = scene;
        this.LJIILL = oidList;
        this.LJIILLIIL = null;
    }
}
