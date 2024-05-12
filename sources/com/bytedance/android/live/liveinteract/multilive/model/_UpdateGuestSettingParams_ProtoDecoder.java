package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _UpdateGuestSettingParams_ProtoDecoder implements InterfaceC31105CIr<UpdateGuestSettingParams> {
    @Override // X.InterfaceC31105CIr
    public final UpdateGuestSettingParams LIZ(Q9H q9h) {
        UpdateGuestSettingParams updateGuestSettingParams = new UpdateGuestSettingParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            switch (LJI) {
                                case 1001:
                                    updateGuestSettingParams.channelId = q9h.LJIIJJI();
                                    break;
                                case 1002:
                                    updateGuestSettingParams.roomId = q9h.LJIIJJI();
                                    break;
                                case 1003:
                                    updateGuestSettingParams.liveId = q9h.LJIIJJI();
                                    break;
                                case 1004:
                                    updateGuestSettingParams.anchorId = q9h.LJIIJJI();
                                    break;
                                default:
                                    Q9J.LIZJ(q9h);
                                    break;
                            }
                        } else {
                            updateGuestSettingParams.guestCameraStatus = q9h.LJIIJ();
                        }
                    } else {
                        updateGuestSettingParams.rankListShowAction = q9h.LJIIJ();
                    }
                } else {
                    updateGuestSettingParams.flowDistribute = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return updateGuestSettingParams;
            }
        }
    }
}
