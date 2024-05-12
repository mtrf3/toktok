package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _DiscordEntrance_ProtoDecoder implements InterfaceC31105CIr<DiscordEntrance> {
    public static DiscordEntrance LIZIZ(Q9H q9h) {
        DiscordEntrance discordEntrance = new DiscordEntrance();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        discordEntrance.enableStatus = q9h.LJIIJ();
                        break;
                    case 2:
                        discordEntrance.grantDiscordAccess = Q9J.LIZ(q9h);
                        break;
                    case 3:
                        discordEntrance.joinedDiscordServer = Q9J.LIZ(q9h);
                        break;
                    case 4:
                        discordEntrance.anchorId = q9h.LJIIJJI();
                        break;
                    case 5:
                        discordEntrance.oauthUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        discordEntrance.guildId = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return discordEntrance;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DiscordEntrance LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
