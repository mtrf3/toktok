package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import ujb.s;

/* loaded from: classes7.dex */
public final class EJV {
    public static Keva LIZ;

    public static final String LIZ() {
        String str;
        String str2;
        if (LIZ == null) {
            LIZ = Keva.getRepo("PosterSR");
        }
        Keva keva = LIZ;
        String str3 = null;
        if (keva != null) {
            str = keva.getString("cpu_model", null);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String LJIIIIZZ = C39687Fhr.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            str2 = s.LJZI(LJIIIIZZ).toString();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = Build.HARDWARE;
        }
        if (str2 != null) {
            str3 = s.LJZI(str2).toString();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("not use cacheCpuModel:");
        LIZ2.append(str3);
        C36922EeM.LIZLLL(4, "cacheCpuModel", X1D.LIZIZ(LIZ2));
        Keva keva2 = LIZ;
        if (keva2 != null) {
            keva2.storeString("cpu_model", str3);
        }
        return str3;
    }
}
