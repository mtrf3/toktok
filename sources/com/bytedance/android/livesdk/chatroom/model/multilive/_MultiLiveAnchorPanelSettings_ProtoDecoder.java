package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _MultiLiveAnchorPanelSettings_ProtoDecoder implements InterfaceC31105CIr<MultiLiveAnchorPanelSettings> {
    public static MultiLiveAnchorPanelSettings LIZIZ(Q9H q9h) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = new MultiLiveAnchorPanelSettings();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        multiLiveAnchorPanelSettings.userId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        multiLiveAnchorPanelSettings.layoutType = q9h.LJIIJ();
                        break;
                    case 3:
                        multiLiveAnchorPanelSettings.fixMicNumAction = q9h.LJIIJ();
                        break;
                    case 4:
                        multiLiveAnchorPanelSettings.allowViewerReq = q9h.LJIIJ();
                        break;
                    case 5:
                        multiLiveAnchorPanelSettings.onlyAllowFollowerReq = q9h.LJIIJ();
                        break;
                    case 6:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 7:
                        multiLiveAnchorPanelSettings.applierSortSetting = q9h.LJIIJ();
                        break;
                    case 8:
                        multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold = q9h.LJIIJJI();
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return multiLiveAnchorPanelSettings;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MultiLiveAnchorPanelSettings LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
