package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _TemplateListData_ProtoDecoder implements InterfaceC31105CIr<TemplateListData> {
    public static TemplateListData LIZIZ(Q9H q9h) {
        TemplateListData templateListData = new TemplateListData();
        templateListData.templateList = new ArrayList();
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
                                    templateListData.webappPayment = Q9J.LIZ(q9h);
                                }
                            } else {
                                templateListData.paymentRedirect = Q9J.LIZ(q9h);
                            }
                        } else {
                            templateListData.subScenario = q9h.LJIIJ();
                        }
                    } else {
                        templateListData.balance = Q9J.LIZIZ(q9h);
                    }
                } else {
                    templateListData.templateList.add(_TemplateInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return templateListData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TemplateListData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
