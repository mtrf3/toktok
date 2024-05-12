package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._EsportsParticipant_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.partnership.AudienceRoomInfoResponse;

/* loaded from: classes6.dex */
public final class _AudienceRoomInfoResponse_EsportsBriefMatchInfo_ProtoDecoder implements InterfaceC31105CIr<AudienceRoomInfoResponse.EsportsBriefMatchInfo> {
    public static AudienceRoomInfoResponse.EsportsBriefMatchInfo LIZIZ(Q9H q9h) {
        AudienceRoomInfoResponse.EsportsBriefMatchInfo esportsBriefMatchInfo = new AudienceRoomInfoResponse.EsportsBriefMatchInfo();
        esportsBriefMatchInfo.participants = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        esportsBriefMatchInfo.totalParticipants = q9h.LJIIJ();
                    }
                } else {
                    esportsBriefMatchInfo.participants.add(_EsportsParticipant_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return esportsBriefMatchInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AudienceRoomInfoResponse.EsportsBriefMatchInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
