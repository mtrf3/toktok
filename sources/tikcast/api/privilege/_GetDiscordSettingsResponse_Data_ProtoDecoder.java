package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.privilege.GetDiscordSettingsResponse;
import webcast.data._FansDiscordGuildInfo_ProtoDecoder;
import webcast.data._FansDiscordRoleInfo_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _GetDiscordSettingsResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GetDiscordSettingsResponse.Data> {
    public static GetDiscordSettingsResponse.Data LIZIZ(Q9H q9h) {
        GetDiscordSettingsResponse.Data data = new GetDiscordSettingsResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        data.roleInfo = _FansDiscordRoleInfo_ProtoDecoder.LIZIZ(q9h);
                    }
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
    public final GetDiscordSettingsResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
