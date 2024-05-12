package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.privilege.QueryBadgeStyleRequest;

/* loaded from: classes17.dex */
public final class _QueryBadgeStyleRequest_Data_ProtoDecoder implements InterfaceC31105CIr<QueryBadgeStyleRequest.Data> {
    @Override // X.InterfaceC31105CIr
    public final QueryBadgeStyleRequest.Data LIZ(Q9H q9h) {
        QueryBadgeStyleRequest.Data data = new QueryBadgeStyleRequest.Data();
        data.wantedBadgeSceneTypeList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 10) {
                                if (LJI != 20) {
                                    switch (LJI) {
                                        case 30:
                                            AdminParam adminParam = new AdminParam();
                                            long LIZJ2 = q9h.LIZJ();
                                            while (q9h.LJI() != -1) {
                                                Q9J.LIZJ(q9h);
                                            }
                                            q9h.LJ(LIZJ2);
                                            data.adminParam = adminParam;
                                            break;
                                        case 31:
                                            FirstRechargeParam firstRechargeParam = new FirstRechargeParam();
                                            long LIZJ3 = q9h.LIZJ();
                                            while (q9h.LJI() != -1) {
                                                Q9J.LIZJ(q9h);
                                            }
                                            q9h.LJ(LIZJ3);
                                            data.firstRechargeParam = firstRechargeParam;
                                            break;
                                        case 32:
                                            data.subscriberParam = _SubscriberParam_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        case 33:
                                            data.rankListParam = _RankListParam_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        case 34:
                                            data.userGradeParam = _UserGradeParam_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        case 35:
                                            data.fansParam = _FansParam_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        default:
                                            Q9J.LIZJ(q9h);
                                            break;
                                    }
                                } else {
                                    data.logicScene = q9h.LJIIJ();
                                }
                            } else {
                                data.wantedBadgeSceneTypeList.add(Integer.valueOf(q9h.LJIIJ()));
                            }
                        } else {
                            data.anchorId = q9h.LJIIJJI();
                        }
                    } else {
                        data.roomId = q9h.LJIIJJI();
                    }
                } else {
                    data.userId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }
}
