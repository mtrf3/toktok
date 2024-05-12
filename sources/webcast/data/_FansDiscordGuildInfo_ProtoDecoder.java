package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _FansDiscordGuildInfo_ProtoDecoder implements InterfaceC31105CIr<FansDiscordGuildInfo> {
    public static FansDiscordGuildInfo LIZIZ(Q9H q9h) {
        FansDiscordGuildInfo fansDiscordGuildInfo = new FansDiscordGuildInfo();
        fansDiscordGuildInfo.roles = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        fansDiscordGuildInfo.guildIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        fansDiscordGuildInfo.guildName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        fansDiscordGuildInfo.guildIcon = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        fansDiscordGuildInfo.ownerIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        fansDiscordGuildInfo.reconnectUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        fansDiscordGuildInfo.roles.add(_FansDiscordRoleInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 7:
                        fansDiscordGuildInfo.guildIconImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return fansDiscordGuildInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansDiscordGuildInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
