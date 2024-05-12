package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagCommonSelected_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.goody_bag.GetGoodyBagTemplateResponse;

/* loaded from: classes17.dex */
public final class _GetGoodyBagTemplateResponse_CommonTemplate_ProtoDecoder implements InterfaceC31105CIr<GetGoodyBagTemplateResponse.CommonTemplate> {
    public static GetGoodyBagTemplateResponse.CommonTemplate LIZIZ(Q9H q9h) {
        GetGoodyBagTemplateResponse.CommonTemplate commonTemplate = new GetGoodyBagTemplateResponse.CommonTemplate();
        commonTemplate.participateMethodOptions = new ArrayList();
        commonTemplate.countdownMinuteOptions = new ArrayList();
        commonTemplate.winnerHeadcountOptions = new ArrayList();
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
                                commonTemplate.commonSelected = _GoodyBagCommonSelected_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            commonTemplate.countdownMinuteOptions.add(Integer.valueOf(q9h.LJIIJ()));
                        }
                    } else {
                        commonTemplate.participateMethodOptions.add(Integer.valueOf(q9h.LJIIJ()));
                    }
                } else {
                    commonTemplate.winnerHeadcountOptions.add(Integer.valueOf(q9h.LJIIJ()));
                }
            } else {
                q9h.LJ(LIZJ);
                return commonTemplate;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetGoodyBagTemplateResponse.CommonTemplate LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
