package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.wallet.tiktok.GetTotalBalanceResponse;

/* loaded from: classes6.dex */
public final class _GetTotalBalanceResponse_BalanceInfo_ProtoDecoder implements InterfaceC31105CIr<GetTotalBalanceResponse.BalanceInfo> {
    public static GetTotalBalanceResponse.BalanceInfo LIZIZ(Q9H q9h) {
        GetTotalBalanceResponse.BalanceInfo balanceInfo = new GetTotalBalanceResponse.BalanceInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                balanceInfo.decimalPlace = q9h.LJIIJ();
                            }
                        } else {
                            balanceInfo.amount = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        balanceInfo.symbol = Q9J.LIZIZ(q9h);
                    }
                } else {
                    balanceInfo.code = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return balanceInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetTotalBalanceResponse.BalanceInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
