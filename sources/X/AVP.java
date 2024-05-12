package X;

import java.util.TimerTask;

/* loaded from: classes5.dex */
public final class AVP extends TimerTask {
    public static void LIZ() {
        String str = AVO.LJIIIIZZ;
        if (str == null || str.length() == 0 || AVO.LJ == null) {
            return;
        }
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("a_user_id", AVO.LJIIIIZZ);
        c188727au.LJIIIZ("a_log_id", AVO.LJI);
        c188727au.LJFF(AVO.LJII, "a_server_time");
        c188727au.LJFF(AVO.LJFF, "a_dm_notification_cnt");
        c188727au.LJIIIZ("b_user_id", curUserId);
        c188727au.LJFF(AVO.LIZLLL, "b_server_time");
        c188727au.LJFF(AVO.LJ, "b_dm_notification_cnt");
        FMX.LJIIL("show_dm_notification_switch_account", c188727au.LIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uploadSwitchAccountDMData, lastUID=");
        YE1.LIZLLL(LIZ, AVO.LJIIIIZZ, ", currentUID=", curUserId, ", lastDMUnreadCount=");
        LIZ.append(AVO.LJFF);
        LIZ.append(", lastLogID=");
        LIZ.append(AVO.LJI);
        LIZ.append(", lastServerTime=");
        LIZ.append(AVO.LJII);
        LIZ.append(", currentServerTime=");
        LIZ.append(AVO.LIZLLL);
        LIZ.append(", currentUIDDMUnreadCount=");
        LIZ.append(AVO.LJ);
        C221018lt.LJFF("AccountSwitchDMTrack", X1D.LIZIZ(LIZ));
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
