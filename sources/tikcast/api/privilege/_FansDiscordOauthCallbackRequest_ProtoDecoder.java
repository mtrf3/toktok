package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FansDiscordOauthCallbackRequest_ProtoDecoder implements InterfaceC31105CIr<FansDiscordOauthCallbackRequest> {
    @Override // X.InterfaceC31105CIr
    public final FansDiscordOauthCallbackRequest LIZ(Q9H q9h) {
        FansDiscordOauthCallbackRequest fansDiscordOauthCallbackRequest = new FansDiscordOauthCallbackRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 10) {
                            if (LJI != 11) {
                                Q9J.LIZJ(q9h);
                            } else {
                                fansDiscordOauthCallbackRequest.permissionStr = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            fansDiscordOauthCallbackRequest.guildIdStr = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        fansDiscordOauthCallbackRequest.state = Q9J.LIZIZ(q9h);
                    }
                } else {
                    fansDiscordOauthCallbackRequest.code = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fansDiscordOauthCallbackRequest;
            }
        }
    }
}
