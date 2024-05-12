package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.2sM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72142sM {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C72132sL.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C72112sJ.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C72122sK.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C72102sI.LJLIL);

    public static void LIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        Keva kevaRepo = C91093hp.LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key_last_enter_chat");
        LIZ.append(curUserId);
        kevaRepo.storeLong(X1D.LIZIZ(LIZ), currentTimeMillis);
    }

    public static void LIZIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        Keva kevaRepo = C91093hp.LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key_last_enter_panel");
        LIZ.append(curUserId);
        kevaRepo.storeLong(X1D.LIZIZ(LIZ), currentTimeMillis);
        C91093hp.LJIIJJI(false);
    }

    public static boolean LIZJ(C72142sM c72142sM) {
        long currentTimeMillis = System.currentTimeMillis();
        Keva kevaRepo = C91093hp.LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key_show_red_dot_v2");
        LIZ.append(curUserId);
        boolean z = kevaRepo.getBoolean(X1D.LIZIZ(LIZ), false);
        Keva kevaRepo2 = C91093hp.LIZLLL();
        o.LJIIIIZZ(kevaRepo2, "kevaRepo");
        String curUserId2 = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId2, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_auto_dismiss_red_dot_count");
        LIZ2.append(curUserId2);
        int i = kevaRepo2.getInt(X1D.LIZIZ(LIZ2), 0);
        Keva kevaRepo3 = C91093hp.LIZLLL();
        o.LJIIIIZZ(kevaRepo3, "kevaRepo");
        String curUserId3 = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId3, "userService().curUserId");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("key_last_enter_chat");
        LIZ3.append(curUserId3);
        long j = kevaRepo3.getLong(X1D.LIZIZ(LIZ3), 0L);
        Keva kevaRepo4 = C91093hp.LIZLLL();
        o.LJIIIIZZ(kevaRepo4, "kevaRepo");
        String curUserId4 = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId4, "userService().curUserId");
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("key_last_enter_panel");
        LIZ4.append(curUserId4);
        long j2 = kevaRepo4.getLong(X1D.LIZIZ(LIZ4), 0L);
        Keva kevaRepo5 = C91093hp.LIZLLL();
        o.LJIIIIZZ(kevaRepo5, "kevaRepo");
        String curUserId5 = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId5, "userService().curUserId");
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("key_last_show_red_dot");
        LIZ5.append(curUserId5);
        long j3 = kevaRepo5.getLong(X1D.LIZIZ(LIZ5), 0L);
        Keva kevaRepo6 = C91093hp.LIZLLL();
        o.LJIIIIZZ(kevaRepo6, "kevaRepo");
        String curUserId6 = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId6, "userService().curUserId");
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("key_last_auto_dismiss_red_dot");
        LIZ6.append(curUserId6);
        long j4 = kevaRepo6.getLong(X1D.LIZIZ(LIZ6), 0L);
        C72182sQ setShowRedDotV2 = C72182sQ.LJLIL;
        C72152sN setLastDismissRedDotTime = C72152sN.LJLIL;
        C72162sO setAutoDismissCount = C72162sO.LJLIL;
        C72172sP setLastShowRedDotTime = C72172sP.LJLIL;
        o.LJIIIZ(setShowRedDotV2, "setShowRedDotV2");
        o.LJIIIZ(setLastDismissRedDotTime, "setLastDismissRedDotTime");
        o.LJIIIZ(setAutoDismissCount, "setAutoDismissCount");
        o.LJIIIZ(setLastShowRedDotTime, "setLastShowRedDotTime");
        if (z) {
            if (currentTimeMillis - j3 >= ((Number) c72142sM.LIZLLL.getValue()).longValue()) {
                setShowRedDotV2.invoke(Boolean.FALSE);
                setLastDismissRedDotTime.invoke(Long.valueOf(currentTimeMillis));
                setAutoDismissCount.invoke(Integer.valueOf(i + 1));
            } else {
                return true;
            }
        } else {
            if (j2 != 0) {
                j = j2;
            }
            if (currentTimeMillis - j >= ((Number) c72142sM.LIZ.getValue()).longValue()) {
                if (i == 0 || (i == 1 ? currentTimeMillis - j4 >= ((Number) c72142sM.LIZIZ.getValue()).longValue() : currentTimeMillis - j4 >= ((Number) c72142sM.LIZJ.getValue()).longValue())) {
                    setLastShowRedDotTime.invoke(Long.valueOf(currentTimeMillis));
                    setShowRedDotV2.invoke(Boolean.TRUE);
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
