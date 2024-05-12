package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.privilege.UpdateDiscordSwitchResponse;

/* loaded from: classes17.dex */
public final class _UpdateDiscordSwitchResponse_SwitchResp_ProtoDecoder implements InterfaceC31105CIr<UpdateDiscordSwitchResponse.SwitchResp> {
    public static UpdateDiscordSwitchResponse.SwitchResp LIZIZ(Q9H q9h) {
        UpdateDiscordSwitchResponse.SwitchResp switchResp = new UpdateDiscordSwitchResponse.SwitchResp();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    switchResp.enableStatus = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return switchResp;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UpdateDiscordSwitchResponse.SwitchResp LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
