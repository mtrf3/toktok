package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.wallet.tiktok.DiamondBuyResult;

/* loaded from: classes17.dex */
public final class _DiamondBuyResult_DiamondBuyData_ProtoDecoder implements InterfaceC31105CIr<DiamondBuyResult.DiamondBuyData> {
    public static DiamondBuyResult.DiamondBuyData LIZIZ(Q9H q9h) {
        DiamondBuyResult.DiamondBuyData diamondBuyData = new DiamondBuyResult.DiamondBuyData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    diamondBuyData.absPipoInfo = _DiamondBuyResult_ABSPIPOInfo_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                diamondBuyData.orderPlatform = q9h.LJIIJ();
                            }
                        } else {
                            diamondBuyData.pipoDetails = _PIPODetails_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        diamondBuyData.params = Q9J.LIZIZ(q9h);
                    }
                } else {
                    diamondBuyData.orderId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return diamondBuyData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DiamondBuyResult.DiamondBuyData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
