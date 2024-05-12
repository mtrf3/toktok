package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model._LiveStreamGoalContributor_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model.GetSubGoalContributorsResponse;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _GetSubGoalContributorsResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GetSubGoalContributorsResponse.Data> {
    public static GetSubGoalContributorsResponse.Data LIZIZ(Q9H q9h) {
        GetSubGoalContributorsResponse.Data data = new GetSubGoalContributorsResponse.Data();
        data.contributors = new ArrayList();
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
                                data.hasMore = Q9J.LIZ(q9h);
                            }
                        } else {
                            data.nextOffset = q9h.LJIIJJI();
                        }
                    } else {
                        data.total = q9h.LJIIJJI();
                    }
                } else {
                    data.contributors.add(_LiveStreamGoalContributor_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetSubGoalContributorsResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
