package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3E5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3E5 {
    public static C3E3 LIZ;
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();

    public static String LIZ(IMUser iMUser) {
        if (C3E8.LIZ() || iMUser == null || TextUtils.isEmpty(iMUser.getUid())) {
            return "";
        }
        if (TextUtils.isEmpty(iMUser.getSecUid())) {
            IMUser LJFF = C80533Eb.LJFF(iMUser.getUid(), null);
            if (LJFF == null || TextUtils.isEmpty(LJFF.getSecUid())) {
                return LIZIZ(iMUser.getUid());
            }
            return LJFF.getSecUid();
        }
        return iMUser.getSecUid();
    }

    public static String LIZIZ(String str) {
        if (C3E8.LIZ() || TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = LIZIZ.get(str);
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        return str2;
    }

    public static String LIZJ(String str) {
        if (C3E8.LIZ()) {
            return "";
        }
        String LIZIZ2 = LIZIZ(str);
        if (LIZIZ2 == null || LIZIZ2.length() == 0) {
            IMUser LJFF = C80533Eb.LJFF(str, null);
            if (LJFF == null) {
                return null;
            }
            return LJFF.getSecUid();
        }
        return LIZIZ2;
    }

    public static void LIZLLL(String str) {
        String LIZ2;
        if (C3E8.LIZ() || TextUtils.isEmpty(str)) {
            return;
        }
        IMUser LJFF = C80533Eb.LJFF(str, null);
        if (C3E8.LIZ()) {
            LIZ2 = "";
        } else if (LJFF == null) {
            LIZ2 = LIZIZ(str);
        } else {
            LIZ2 = LIZ(LJFF);
        }
        C40515FvD.LIZJ().LJIIIIZZ(str, LIZ2);
    }
}
