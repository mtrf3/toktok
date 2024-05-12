package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _GiftMonitorInfo_ProtoDecoder implements InterfaceC31105CIr<GiftMonitorInfo> {
    public static GiftMonitorInfo LIZIZ(Q9H q9h) {
        GiftMonitorInfo giftMonitorInfo = new GiftMonitorInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        giftMonitorInfo.anchor_id = q9h.LJIIJJI();
                        break;
                    case 2:
                        giftMonitorInfo.profit_api_message_dur = q9h.LJIIJJI();
                        break;
                    case 3:
                        giftMonitorInfo.send_gift_profit_api_start_ms = q9h.LJIIJJI();
                        break;
                    case 4:
                        giftMonitorInfo.send_gift_profit_core_start_ms = q9h.LJIIJJI();
                        break;
                    case 5:
                        giftMonitorInfo.send_gift_req_start_ms = q9h.LJIIJJI();
                        break;
                    case 6:
                        giftMonitorInfo.send_gift_send_message_success_ms = q9h.LJIIJJI();
                        break;
                    case 7:
                        giftMonitorInfo.send_profit_api_dur = q9h.LJIIJJI();
                        break;
                    case 8:
                        giftMonitorInfo.to_user_id = q9h.LJIIJJI();
                        break;
                    case 9:
                        giftMonitorInfo.sendGiftStartClientLocalMs = q9h.LJIIJJI();
                        break;
                    case 10:
                        giftMonitorInfo.fromPlatform = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        giftMonitorInfo.fromVersion = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return giftMonitorInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftMonitorInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
