package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.wallet.tiktok.DiamondBuyResult;
import webcast.data._RechargeCustomError_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _DiamondBuyResult_DiamondBuyExtra_ProtoDecoder implements InterfaceC31105CIr<DiamondBuyResult.DiamondBuyExtra> {
    public static DiamondBuyResult.DiamondBuyExtra LIZIZ(Q9H q9h) {
        DiamondBuyResult.DiamondBuyExtra diamondBuyExtra = new DiamondBuyResult.DiamondBuyExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            diamondBuyExtra.iapFailExtra = _DiamondBuyResult_IapFailExtraData_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        diamondBuyExtra.isWebappRechargeRedirectEnabled = Q9J.LIZ(q9h);
                    }
                } else {
                    diamondBuyExtra.customError = _RechargeCustomError_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return diamondBuyExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DiamondBuyResult.DiamondBuyExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
