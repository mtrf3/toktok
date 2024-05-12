package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;

/* loaded from: classes14.dex */
public final class _GuideInfoResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GuideInfoResponse.Data> {
    public static GuideInfoResponse.Data LIZIZ(Q9H q9h) {
        GuideInfoResponse.Data data = new GuideInfoResponse.Data();
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
                                    data.guideEntry = _GuideInfoResponse_GuideEntry_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                data.shouldUseConfig = Q9J.LIZ(q9h);
                            }
                        } else {
                            data.schemaUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        data.guideType = Q9J.LIZIZ(q9h);
                    }
                } else {
                    data.userStats = _GuideInfoResponse_UserStats_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GuideInfoResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
