package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.goody_bag.GetGoodyBagTemplateResponse;

/* loaded from: classes17.dex */
public final class _GetGoodyBagTemplateResponse_PreCheckResult_ProtoDecoder implements InterfaceC31105CIr<GetGoodyBagTemplateResponse.PreCheckResult> {
    public static GetGoodyBagTemplateResponse.PreCheckResult LIZIZ(Q9H q9h) {
        GetGoodyBagTemplateResponse.PreCheckResult preCheckResult = new GetGoodyBagTemplateResponse.PreCheckResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        preCheckResult.i18nPrompts = Q9J.LIZIZ(q9h);
                    }
                } else {
                    preCheckResult.statusCode = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return preCheckResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetGoodyBagTemplateResponse.PreCheckResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
