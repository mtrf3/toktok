package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.gift.assets._AssetsModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _AssetMessage_ProtoDecoder implements InterfaceC31105CIr<AssetMessage> {
    @Override // X.InterfaceC31105CIr
    public final AssetMessage LIZ(Q9H q9h) {
        AssetMessage assetMessage = new AssetMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        assetMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        assetMessage.assetId = q9h.LJIIJJI();
                        break;
                    case 3:
                        assetMessage.panelDisplayText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        assetMessage.showMessage = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        assetMessage.showPanel = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        assetMessage.fromUser = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        assetMessage.toUser = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        assetMessage.priority = _GiftIMPriority_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        assetMessage.logId = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        assetMessage.assets = _AssetsModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return assetMessage;
            }
        }
    }
}
