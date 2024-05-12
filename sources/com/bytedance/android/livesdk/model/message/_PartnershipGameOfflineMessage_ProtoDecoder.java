package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _PartnershipGameOfflineMessage_ProtoDecoder implements InterfaceC31105CIr<PartnershipGameOfflineMessage> {
    @Override // X.InterfaceC31105CIr
    public final PartnershipGameOfflineMessage LIZ(Q9H q9h) {
        PartnershipGameOfflineMessage partnershipGameOfflineMessage = new PartnershipGameOfflineMessage();
        partnershipGameOfflineMessage.offlineGameList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        partnershipGameOfflineMessage.offlineGameList.add(_PartnershipGameOfflineMessage_OfflineGameInfo_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    partnershipGameOfflineMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipGameOfflineMessage;
            }
        }
    }
}
