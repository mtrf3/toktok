package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FansDiscordRoleInfo_ProtoDecoder implements InterfaceC31105CIr<FansDiscordRoleInfo> {
    public static FansDiscordRoleInfo LIZIZ(Q9H q9h) {
        FansDiscordRoleInfo fansDiscordRoleInfo = new FansDiscordRoleInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        fansDiscordRoleInfo.roleIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        fansDiscordRoleInfo.roleName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        fansDiscordRoleInfo.permissions = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        fansDiscordRoleInfo.isPositionAboveBot = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        fansDiscordRoleInfo.isPermissionHigherBot = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        fansDiscordRoleInfo.isFansFuncNormalRole = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return fansDiscordRoleInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansDiscordRoleInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
