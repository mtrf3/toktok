package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _DiamondBuyResult_ProtoDecoder implements InterfaceC31105CIr<DiamondBuyResult> {
    @Override // X.InterfaceC31105CIr
    public final DiamondBuyResult LIZ(Q9H q9h) {
        DiamondBuyResult diamondBuyResult = new DiamondBuyResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        diamondBuyResult.extra = _DiamondBuyResult_DiamondBuyExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    diamondBuyResult.data = _DiamondBuyResult_DiamondBuyData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return diamondBuyResult;
            }
        }
    }
}
