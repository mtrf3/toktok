package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.wallet.tiktok.UnlockVoucherResult;

/* loaded from: classes17.dex */
public final class _UnlockVoucherResult_Response_ProtoDecoder implements InterfaceC31105CIr<UnlockVoucherResult.Response> {
    public static UnlockVoucherResult.Response LIZIZ(Q9H q9h) {
        UnlockVoucherResult.Response response = new UnlockVoucherResult.Response();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        response.errMsg = Q9J.LIZIZ(q9h);
                    }
                } else {
                    response.resultCode = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return response;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UnlockVoucherResult.Response LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
