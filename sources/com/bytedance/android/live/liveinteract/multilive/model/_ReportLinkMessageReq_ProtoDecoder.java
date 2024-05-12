package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _ReportLinkMessageReq_ProtoDecoder implements InterfaceC31105CIr<ReportLinkMessageReq> {
    @Override // X.InterfaceC31105CIr
    public final ReportLinkMessageReq LIZ(Q9H q9h) {
        ReportLinkMessageReq reportLinkMessageReq = new ReportLinkMessageReq();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    reportLinkMessageReq.guestClientList = _GuestClientList_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                reportLinkMessageReq.anchorClientList = _AnchorClientList_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            reportLinkMessageReq.channelMessage = _ChannelMessage_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        reportLinkMessageReq.mySelf = _Player_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    reportLinkMessageReq.common = _LinkCommon_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return reportLinkMessageReq;
            }
        }
    }
}
