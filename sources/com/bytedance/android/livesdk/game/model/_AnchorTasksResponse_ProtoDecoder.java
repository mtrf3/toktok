package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _AnchorTasksResponse_ProtoDecoder implements InterfaceC31105CIr<AnchorTasksResponse> {
    @Override // X.InterfaceC31105CIr
    public final AnchorTasksResponse LIZ(Q9H q9h) {
        AnchorTasksResponse anchorTasksResponse = new AnchorTasksResponse();
        anchorTasksResponse.endedProfitInfos = new ArrayList();
        anchorTasksResponse.promotingProfitInfos = new ArrayList();
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
                                    anchorTasksResponse.punishEventInfo = _PunishEventInfo_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                anchorTasksResponse.livePromoteBanBannerText = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            anchorTasksResponse.endedProfitInfos.add(_TaskProfitInfo_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        anchorTasksResponse.promotingProfitInfos.add(_TaskProfitInfo_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    anchorTasksResponse.maximum_task_num = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorTasksResponse;
            }
        }
    }
}
