package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._BorderInfo_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _HourlyRankRewardInfo_ProtoDecoder implements InterfaceC31105CIr<HourlyRankRewardInfo> {
    public static HourlyRankRewardInfo LIZIZ(Q9H q9h) {
        HourlyRankRewardInfo hourlyRankRewardInfo = new HourlyRankRewardInfo();
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
                                hourlyRankRewardInfo.borderInfo = _BorderInfo_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            hourlyRankRewardInfo.notifyMessage = _RoomNotifyMessage_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        hourlyRankRewardInfo.assetId = q9h.LJIIJJI();
                    }
                } else {
                    hourlyRankRewardInfo.userId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return hourlyRankRewardInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final HourlyRankRewardInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
