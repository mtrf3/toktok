package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model._LiveStreamGoal_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model.GetResponse;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class _GetResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GetResponse.Data> {
    public static GetResponse.Data LIZIZ(Q9H q9h) {
        GetResponse.Data data = new GetResponse.Data();
        data.notStartGoals = new ArrayList();
        data.recommendInfo = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        data.ongoingGoal = _LiveStreamGoal_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        data.notStartGoals.add(_LiveStreamGoal_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 3:
                        long LIZJ2 = q9h.LIZJ();
                        Integer num = null;
                        SubGoalRecommendInfo subGoalRecommendInfo = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        subGoalRecommendInfo = _SubGoalRecommendInfo_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    num = Integer.valueOf(q9h.LJIIJ());
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (num != null) {
                                    if (subGoalRecommendInfo != null) {
                                        data.recommendInfo.put(num, subGoalRecommendInfo);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 4:
                        data.isContributor = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        data.specifiedGoal = _LiveStreamGoal_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        data.pin = _GetResponse_Pin_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        data.ishost = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        data.anchorOnboardPermit = _AnchorOnBoardPermit_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        data.autoCreate = q9h.LJIIJ();
                        break;
                    case 10:
                        data.showDefaultDescription = Q9J.LIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        data.owner = _GoalOwner_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
