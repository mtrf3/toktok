package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.wallet.tiktok.GetABSStatusResponse;

/* loaded from: classes17.dex */
public final class _GetABSStatusResponse_ABSData_ProtoDecoder implements InterfaceC31105CIr<GetABSStatusResponse.ABSData> {
    public static GetABSStatusResponse.ABSData LIZIZ(Q9H q9h) {
        GetABSStatusResponse.ABSData aBSData = new GetABSStatusResponse.ABSData();
        aBSData.absPipoAvatars = new ArrayList();
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
                                    aBSData.priorityRegion = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                aBSData.absPipoAvatars.add(Q9J.LIZIZ(q9h));
                            }
                        } else {
                            aBSData.isAbsOn = Q9J.LIZ(q9h);
                        }
                    } else {
                        aBSData.isAgreed = Q9J.LIZ(q9h);
                    }
                } else {
                    aBSData.isEligible = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return aBSData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetABSStatusResponse.ABSData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
