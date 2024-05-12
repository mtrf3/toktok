package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.anchor.AboutMeResponse;

/* loaded from: classes17.dex */
public final class _AboutMeResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<AboutMeResponse.ResponseData> {
    public static AboutMeResponse.ResponseData LIZIZ(Q9H q9h) {
        AboutMeResponse.ResponseData responseData = new AboutMeResponse.ResponseData();
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
                                    responseData.oldVersion = Q9J.LIZ(q9h);
                                }
                            } else {
                                responseData.mergeType = q9h.LJIIJ();
                            }
                        } else {
                            responseData.conflictInfo = _IntroConflictInfo_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        responseData.benefitsInfo = _BenefitsInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.aboutMe = _AboutMe_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AboutMeResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
