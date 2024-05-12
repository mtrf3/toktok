package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _UpdateSettingParams_ProtoDecoder implements InterfaceC31105CIr<UpdateSettingParams> {
    @Override // X.InterfaceC31105CIr
    public final UpdateSettingParams LIZ(Q9H q9h) {
        UpdateSettingParams updateSettingParams = new UpdateSettingParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        updateSettingParams.newLayout = q9h.LJIIJ();
                        break;
                    case 2:
                        updateSettingParams.newFixMicNum = q9h.LJIIJ();
                        break;
                    case 3:
                        updateSettingParams.newAllowRequestFromUser = q9h.LJIIJ();
                        break;
                    case 4:
                        updateSettingParams.newAllowRequestFromFollowerOnly = q9h.LJIIJ();
                        break;
                    case 5:
                        updateSettingParams.newLayoutId = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        updateSettingParams.backgroundStickerId = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        updateSettingParams.newApplierSortSetting = q9h.LJIIJ();
                        break;
                    case 8:
                        updateSettingParams.newApplierSortGiftScoreThreshold = q9h.LJIIJJI();
                        break;
                    default:
                        switch (LJI) {
                            case 1001:
                                updateSettingParams.channelId = Long.valueOf(q9h.LJIIJJI());
                                break;
                            case 1002:
                                updateSettingParams.roomId = Long.valueOf(q9h.LJIIJJI());
                                break;
                            case 1003:
                                updateSettingParams.liveId = Long.valueOf(q9h.LJIIJJI());
                                break;
                            case 1004:
                                updateSettingParams.updateScene = q9h.LJIIJ();
                                break;
                            default:
                                Q9J.LIZJ(q9h);
                                break;
                        }
                }
            } else {
                q9h.LJ(LIZJ);
                return updateSettingParams;
            }
        }
    }
}
