package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _AudienceRoomInfoRequest_ProtoDecoder implements InterfaceC31105CIr<AudienceRoomInfoRequest> {
    @Override // X.InterfaceC31105CIr
    public final AudienceRoomInfoRequest LIZ(Q9H q9h) {
        AudienceRoomInfoRequest audienceRoomInfoRequest = new AudienceRoomInfoRequest();
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
                                    audienceRoomInfoRequest.idfv = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                audienceRoomInfoRequest.ua = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            audienceRoomInfoRequest.adId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        audienceRoomInfoRequest.anchorUid = Q9J.LIZIZ(q9h);
                    }
                } else {
                    audienceRoomInfoRequest.roomId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return audienceRoomInfoRequest;
            }
        }
    }
}
