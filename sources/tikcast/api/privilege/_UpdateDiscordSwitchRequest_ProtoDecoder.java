package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _UpdateDiscordSwitchRequest_ProtoDecoder implements InterfaceC31105CIr<UpdateDiscordSwitchRequest> {
    @Override // X.InterfaceC31105CIr
    public final UpdateDiscordSwitchRequest LIZ(Q9H q9h) {
        UpdateDiscordSwitchRequest updateDiscordSwitchRequest = new UpdateDiscordSwitchRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    updateDiscordSwitchRequest.enableStatus = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return updateDiscordSwitchRequest;
            }
        }
    }
}
