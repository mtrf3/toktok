package com.bytedance.android.livesdk.model.message;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._PrivilegeLogExtra_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _RoomNotifyMessage_ProtoDecoder implements InterfaceC31105CIr<RoomNotifyMessage> {
    public static RoomNotifyMessage LIZIZ(Q9H q9h) {
        RoomNotifyMessage roomNotifyMessage = new RoomNotifyMessage();
        roomNotifyMessage.flexSetting = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        roomNotifyMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        roomNotifyMessage.schema = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        roomNotifyMessage.notifyType = q9h.LJIIJJI();
                        break;
                    case 4:
                        roomNotifyMessage.content = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        roomNotifyMessage.user = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        roomNotifyMessage.extra = _RoomNotifyMessageExtra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        roomNotifyMessage.notifyClass = (int) q9h.LJIIJJI();
                        break;
                    case 8:
                        C29991Fr.LIZ(q9h, roomNotifyMessage.flexSetting);
                        break;
                    case 9:
                        roomNotifyMessage.source = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        roomNotifyMessage.from_user_id = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        roomNotifyMessage.logExtra = _PrivilegeLogExtra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        roomNotifyMessage.to_anchor_id = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return roomNotifyMessage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomNotifyMessage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
