package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _UpdateDiscordSettingsRequest_ProtoDecoder implements InterfaceC31105CIr<UpdateDiscordSettingsRequest> {
    @Override // X.InterfaceC31105CIr
    public final UpdateDiscordSettingsRequest LIZ(Q9H q9h) {
        UpdateDiscordSettingsRequest updateDiscordSettingsRequest = new UpdateDiscordSettingsRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        updateDiscordSettingsRequest.guildIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        updateDiscordSettingsRequest.guildName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        updateDiscordSettingsRequest.guildIcon = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        updateDiscordSettingsRequest.roleIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        updateDiscordSettingsRequest.roleName = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        updateDiscordSettingsRequest.permissions = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return updateDiscordSettingsRequest;
            }
        }
    }
}
