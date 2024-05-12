package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;
import webcast.data.multilive_biz._BizResumeParams_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _ResumeReq_ProtoDecoder implements InterfaceC31105CIr<ResumeReq> {
    @Override // X.InterfaceC31105CIr
    public final ResumeReq LIZ(Q9H q9h) {
        ResumeReq resumeReq = new ResumeReq();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 9527) {
                                Q9J.LIZJ(q9h);
                            } else {
                                resumeReq.multiGuestReqExtra = _BizResumeParams_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            resumeReq.channelId = q9h.LJIIJJI();
                        }
                    } else {
                        resumeReq.myself = _Player_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    resumeReq.common = _LinkCommon_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return resumeReq;
            }
        }
    }
}
