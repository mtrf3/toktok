package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GetDiscordSettingsRequest_ProtoDecoder implements InterfaceC31105CIr<GetDiscordSettingsRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetDiscordSettingsRequest LIZ(Q9H q9h) {
        GetDiscordSettingsRequest getDiscordSettingsRequest = new GetDiscordSettingsRequest();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return getDiscordSettingsRequest;
    }
}