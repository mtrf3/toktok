package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _ReportLinkMessageResp_ProtoDecoder implements InterfaceC31105CIr<ReportLinkMessageResp> {
    @Override // X.InterfaceC31105CIr
    public final ReportLinkMessageResp LIZ(Q9H q9h) {
        ReportLinkMessageResp reportLinkMessageResp = new ReportLinkMessageResp();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        reportLinkMessageResp.interval = q9h.LJIIJJI();
                    }
                } else {
                    reportLinkMessageResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return reportLinkMessageResp;
            }
        }
    }
}
