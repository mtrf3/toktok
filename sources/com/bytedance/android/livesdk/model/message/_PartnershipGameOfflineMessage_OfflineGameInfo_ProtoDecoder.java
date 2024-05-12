package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.PartnershipGameOfflineMessage;

/* loaded from: classes6.dex */
public final class _PartnershipGameOfflineMessage_OfflineGameInfo_ProtoDecoder implements InterfaceC31105CIr<PartnershipGameOfflineMessage.OfflineGameInfo> {
    public static PartnershipGameOfflineMessage.OfflineGameInfo LIZIZ(Q9H q9h) {
        PartnershipGameOfflineMessage.OfflineGameInfo offlineGameInfo = new PartnershipGameOfflineMessage.OfflineGameInfo();
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
                                offlineGameInfo.offlineType = q9h.LJIIJ();
                            }
                        } else {
                            offlineGameInfo.taskListLen = q9h.LJIIJ();
                        }
                    } else {
                        offlineGameInfo.toastText = Q9J.LIZIZ(q9h);
                    }
                } else {
                    offlineGameInfo.taskId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return offlineGameInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipGameOfflineMessage.OfflineGameInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
