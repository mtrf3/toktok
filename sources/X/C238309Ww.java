package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.9Ww, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238309Ww {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C238319Wx.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C238329Wy.LJLIL);

    public static int LIZIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static int LIZ() {
        boolean z;
        boolean z2;
        String str;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        int i = 1;
        if (curUser.getAccountType() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (!o.LJ(curUser.getCustomVerify(), "") || !o.LJ(curUser.getEnterpriseVerifyReason(), "")) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("experiment_value:");
        LIZ2.append(curUser.getUid());
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        if (z || z2) {
            ((Keva) LIZIZ.getValue()).storeInt(LIZIZ2, 0);
            return 0;
        }
        C62822Ol8 c62822Ol8 = LIZIZ;
        if (((Keva) c62822Ol8.getValue()).contains(LIZIZ2)) {
            return ((Keva) c62822Ol8.getValue()).getInt(LIZIZ2, 0);
        }
        if (LIZIZ() == 3 || LIZIZ() == 4) {
            UrlModel avatarVideoUri = curUser.getAvatarVideoUri();
            if (avatarVideoUri != null) {
                str = avatarVideoUri.getUri();
            } else {
                str = null;
            }
            if (C78983UzD.LJJJJ(str)) {
                if (LIZIZ() != 3) {
                    if (LIZIZ() == 4) {
                        i = 2;
                    }
                }
                ((Keva) c62822Ol8.getValue()).storeInt(LIZIZ2, i);
                return i;
            }
        }
        i = LIZIZ();
        ((Keva) c62822Ol8.getValue()).storeInt(LIZIZ2, i);
        return i;
    }

    public static boolean LIZJ() {
        if (LIZ() != 0) {
            return true;
        }
        return false;
    }
}
