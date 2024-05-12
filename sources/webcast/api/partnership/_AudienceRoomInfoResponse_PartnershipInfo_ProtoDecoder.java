package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._BriefGameTask_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._UserInfo_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.partnership.AudienceRoomInfoResponse;

/* loaded from: classes6.dex */
public final class _AudienceRoomInfoResponse_PartnershipInfo_ProtoDecoder implements InterfaceC31105CIr<AudienceRoomInfoResponse.PartnershipInfo> {
    public static AudienceRoomInfoResponse.PartnershipInfo LIZIZ(Q9H q9h) {
        AudienceRoomInfoResponse.PartnershipInfo partnershipInfo = new AudienceRoomInfoResponse.PartnershipInfo();
        partnershipInfo.gameTasks = new ArrayList();
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
                                partnershipInfo.downloadedCount = q9h.LJIIJJI();
                            }
                        } else {
                            partnershipInfo.info = _UserInfo_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        partnershipInfo.displayTaskId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    partnershipInfo.gameTasks.add(_BriefGameTask_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AudienceRoomInfoResponse.PartnershipInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
