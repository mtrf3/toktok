package X;

import Y.ARunnableS51S0100000_15;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectQRCode;
import com.ss.ugc.effectplatform.model.PlatformEffect;
import com.ss.ugc.effectplatform.model.net.ScanQRCodeResponse;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XDA extends XDF<ScanQRCodeResponse.DataNode, ScanQRCodeResponse> {
    public final XCG LJIIL;
    public final EffectQRCode LJIILIIL;
    public final String LJIILJJIL;

    @Override // X.XDF
    public final XD6 LJI() {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = this.LJIIL.LIZJ;
        if (str2 != null) {
            hashMap.put("sdk_version", str2);
        }
        G0J g0j = this.LJIIL.LJIJ;
        if (g0j != null) {
            C59862Wo c59862Wo = (C59862Wo) ((KNJsonConverter) g0j.LIZ).convertJsonToObj(this.LJIILIIL.getQrCodeText(), C59862Wo.class);
            if (c59862Wo != null && (str = c59862Wo.LIZ) != null) {
                String encode = URLEncoder.encode(str);
                if (encode == null) {
                    encode = "";
                }
                hashMap.put("sec_id", encode);
            }
        }
        String str3 = this.LJIIL.LJIIJ;
        if (str3 != null) {
            hashMap.put("aid", str3);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ, this.LJIIL.LIZ, "/tidyEffect/secId", LIZ, hashMap), null, XD7.GET, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.ScanQRCodeResponse] */
    @Override // X.XDF
    public final ScanQRCodeResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, ScanQRCodeResponse.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XDA(XCG effectConfig, EffectQRCode effectQRCode, String taskId) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskId);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(effectQRCode, "effectQRCode");
        o.LJIIJ(taskId, "taskId");
        this.LJIIL = effectConfig;
        this.LJIILIIL = effectQRCode;
        this.LJIILJJIL = taskId;
    }

    @Override // X.XDF
    public final void LJIIL(long j, long j2, long j3, ScanQRCodeResponse scanQRCodeResponse) {
        PlatformEffect effect;
        Effect effect2;
        ScanQRCodeResponse.DataNode data = scanQRCodeResponse.getData();
        if (data != null && (effect = data.getEffect()) != null && (effect2 = effect.toEffect(data.getUrl_prefix())) != null) {
            effect2.setId(ujb.o.LJJJJZ(ujb.o.LJJJJZ(effect2.getId(), "\"", "_", false), "/", "_", false));
            XDM xdm = XDM.LIZ;
            String str = this.LJIIL.LJIIIIZZ;
            List LJJIJ = C47261Igj.LJJIJ(effect2);
            xdm.getClass();
            XDM.LJIIIZ(str, LJJIJ);
            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(effect2, this, 50), 64));
        }
    }
}
