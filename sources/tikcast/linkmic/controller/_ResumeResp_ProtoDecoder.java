package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._AllListUser_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import java.util.ArrayList;
import webcast.data.multilive_biz._BizResumeResponse_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _ResumeResp_ProtoDecoder implements InterfaceC31105CIr<ResumeResp> {
    @Override // X.InterfaceC31105CIr
    public final ResumeResp LIZ(Q9H q9h) {
        ResumeResp resumeResp = new ResumeResp();
        resumeResp.linkedUserInfo = new ArrayList();
        resumeResp.rejectEnlargeLinkmicIdList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 9527) {
                    switch (LJI) {
                        case 1:
                            resumeResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 2:
                            resumeResp.linkedUserInfo.add(_LinkedUserInfo_ProtoDecoder.LIZIZ(q9h));
                            break;
                        case 3:
                            resumeResp.channelId = q9h.LJIIJJI();
                            break;
                        case 4:
                            resumeResp.selfLinkMicId = Q9J.LIZIZ(q9h);
                            break;
                        case 5:
                            resumeResp.list = _AllListUser_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 6:
                            resumeResp.rejectEnlargeLinkmicIdList.add(Q9J.LIZIZ(q9h));
                            break;
                        default:
                            Q9J.LIZJ(q9h);
                            break;
                    }
                } else {
                    resumeResp.multiGuestRespExtra = _BizResumeResponse_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return resumeResp;
            }
        }
    }
}
