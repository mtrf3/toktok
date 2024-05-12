package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.privilege.FansDiscordOauthCallbackResponse;
import webcast.data._FansDiscordGuildInfo_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _FansDiscordOauthCallbackResponse_Data_ProtoDecoder implements InterfaceC31105CIr<FansDiscordOauthCallbackResponse.Data> {
    public static FansDiscordOauthCallbackResponse.Data LIZIZ(Q9H q9h) {
        FansDiscordOauthCallbackResponse.Data data = new FansDiscordOauthCallbackResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.guildInfo = _FansDiscordGuildInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansDiscordOauthCallbackResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
