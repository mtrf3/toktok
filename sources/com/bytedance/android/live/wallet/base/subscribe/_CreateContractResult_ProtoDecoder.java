package com.bytedance.android.live.wallet.base.subscribe;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.subscribe.model._WebappSubInfo_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _CreateContractResult_ProtoDecoder implements InterfaceC31105CIr<CreateContractResult> {
    public static CreateContractResult LIZIZ(Q9H q9h) {
        CreateContractResult createContractResult = new CreateContractResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        createContractResult.payChannel = q9h.LJIIJ();
                        break;
                    case 2:
                        createContractResult.status = q9h.LJIIJ();
                        break;
                    case 3:
                        createContractResult.tplType = q9h.LJIIJ();
                        break;
                    case 4:
                        createContractResult.subCircle = q9h.LJIIJ();
                        break;
                    case 5:
                        createContractResult.tplId = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        createContractResult.iapId = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        createContractResult.bizContent = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        createContractResult.timestamp = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        createContractResult.merchantId = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        createContractResult.sign = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        createContractResult.method = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        createContractResult.clientPipoUrl = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        createContractResult.contractId = Q9J.LIZIZ(q9h);
                        break;
                    case 14:
                        createContractResult.webappSubInfo = _WebappSubInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 15:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        createContractResult.clientMpUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 17:
                        createContractResult.orderPlatform = q9h.LJIIJ();
                        break;
                    case 18:
                        createContractResult.pbRequestBody = Q9J.LIZIZ(q9h);
                        break;
                    case 19:
                        createContractResult.pbGenericProductId = Q9J.LIZIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return createContractResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CreateContractResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
