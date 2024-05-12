package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.interact._LastLayoutSetting_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _BizCreateChannelResponseData_ProtoDecoder implements InterfaceC31105CIr<BizCreateChannelResponseData> {
    public static BizCreateChannelResponseData LIZIZ(Q9H q9h) {
        BizCreateChannelResponseData bizCreateChannelResponseData = new BizCreateChannelResponseData();
        bizCreateChannelResponseData.lastLayoutSettings = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 5) {
                        if (LJI != 6) {
                            Q9J.LIZJ(q9h);
                        } else {
                            bizCreateChannelResponseData.backgroundStickerId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        bizCreateChannelResponseData.lastLayoutSettings.add(_LastLayoutSetting_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    bizCreateChannelResponseData.multiLiveAnchorPanelSettings = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return bizCreateChannelResponseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizCreateChannelResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
