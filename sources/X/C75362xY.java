package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.2xY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75362xY {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C75372xZ.LJLIL);

    public static String[] LIZ() {
        Keva kevaRepo = (Keva) LIZ.getValue();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("previous_show_camera_icon_user_ids");
        LIZ2.append(curUserId);
        return kevaRepo.getStringArray(X1D.LIZIZ(LIZ2), new String[0]);
    }
}
