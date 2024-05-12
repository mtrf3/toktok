package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerListResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XDB extends XDF<InfoStickerListResponse, InfoStickerListResponse> {
    public final XCG LJIIL;
    public final int LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final Integer LJIILLIIL;
    public final Integer LJIIZILJ;
    public final String LJIJ;
    public final java.util.Map<String, String> LJIJI;

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        LIZ.put("creation_id", this.LJIILJJIL);
        LIZ.put("source", String.valueOf(this.LJIILIIL));
        LIZ.put("image_uri", this.LJIILL);
        Integer num = this.LJIILLIIL;
        if (num != null) {
            C0EM.LIZJ(num, LIZ, "count");
        }
        Integer num2 = this.LJIIZILJ;
        if (num2 != null) {
            C0EM.LIZJ(num2, LIZ, "cursor");
        }
        String str = this.LJIJ;
        if (str != null) {
            LIZ.put("library", str);
        }
        java.util.Map<String, String> map = this.LJIJI;
        if (map != null && !map.isEmpty()) {
            LIZ.putAll(this.LJIJI);
        }
        XD7 xd7 = XD7.GET;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIIL.LIZ, "/sticker/recommend", LIZ2, LIZ), null, xd7, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.InfoStickerListResponse] */
    @Override // X.XDF
    public final InfoStickerListResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, InfoStickerListResponse.class);
    }

    @Override // X.XDF
    public final void LJIIL(long j, long j2, long j3, InfoStickerListResponse infoStickerListResponse) {
        List<InfoStickerEffect> list;
        InfoStickerListResponse infoStickerListResponse2 = infoStickerListResponse;
        XDM xdm = XDM.LIZ;
        String str = this.LJIIL.LJIIIIZZ;
        InfoStickerListModel data = infoStickerListResponse2.getData();
        if (data != null) {
            list = data.getSticker_list();
        } else {
            list = null;
        }
        xdm.getClass();
        XDM.LJIIL(str, list);
        super.LJIIL(j, j2, j3, infoStickerListResponse2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XDB(XCG effectConfig, int i, String creationId, String imageUri, Integer num, Integer num2, String str, java.util.Map<String, String> map, String taskId) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskId);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(creationId, "creationId");
        o.LJIIJ(imageUri, "imageUri");
        o.LJIIJ(taskId, "taskId");
        this.LJIIL = effectConfig;
        this.LJIILIIL = i;
        this.LJIILJJIL = creationId;
        this.LJIILL = imageUri;
        this.LJIILLIIL = num;
        this.LJIIZILJ = num2;
        this.LJIJ = str;
        this.LJIJI = map;
    }
}
