package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.wallet.tiktok.DiamondBuyResult;

/* loaded from: classes17.dex */
public final class _DiamondBuyResult_IapFailExtraData_ProtoDecoder implements InterfaceC31105CIr<DiamondBuyResult.IapFailExtraData> {
    public static DiamondBuyResult.IapFailExtraData LIZIZ(Q9H q9h) {
        DiamondBuyResult.IapFailExtraData iapFailExtraData = new DiamondBuyResult.IapFailExtraData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        iapFailExtraData.webappSchema = Q9J.LIZIZ(q9h);
                    }
                } else {
                    iapFailExtraData.toastMessage = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return iapFailExtraData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DiamondBuyResult.IapFailExtraData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
