package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _AudienceInfo_ProtoDecoder implements InterfaceC31105CIr<AudienceInfo> {
    public static AudienceInfo LIZIZ(Q9H q9h) {
        AudienceInfo audienceInfo = new AudienceInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            audienceInfo.userDisplayId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        audienceInfo.userNickname = Q9J.LIZIZ(q9h);
                    }
                } else {
                    audienceInfo.userAvatar = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return audienceInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AudienceInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}