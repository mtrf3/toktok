package X;

import Y.ACallableS5S2000000_7;
import android.app.Activity;
import android.text.TextUtils;
import java.util.concurrent.ExecutorService;

/* loaded from: classes8.dex */
public final class IAX {
    public static ExecutorService LIZ;

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ() {
        /*
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = com.ss.android.ugc.aweme.live.LiveOuterService.LJJJLL()
            X.CJq r0 = r0.LJJI()
            r0.getClass()
            r5 = 0
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = com.ss.android.ugc.aweme.services.BaseUserService.createIUserServicebyMonsterPlugin(r5)
            if (r0 == 0) goto L70
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L70
            boolean r0 = X.C31130CJq.LIZJ
            if (r0 == 0) goto L70
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L70
            java.lang.String r4 = "x86"
            java.lang.String r3 = "armeabi"
            java.lang.String r2 = "arm64"
            java.lang.String[] r1 = android.os.Build.SUPPORTED_ABIS     // Catch: java.lang.Exception -> L61
            int r0 = r1.length     // Catch: java.lang.Exception -> L61
            if (r0 <= 0) goto L44
            r0 = r1[r5]     // Catch: java.lang.Exception -> L61
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L61
            if (r0 != 0) goto L44
            r1 = r1[r5]     // Catch: java.lang.Exception -> L61
        L3d:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L47
            goto L65
        L44:
            java.lang.String r1 = android.os.Build.CPU_ABI     // Catch: java.lang.Exception -> L61
            goto L3d
        L47:
            java.lang.String r1 = r1.toLowerCase()     // Catch: java.lang.Exception -> L61
            boolean r0 = r1.startsWith(r4)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L53
            r3 = r4
            goto L69
        L53:
            boolean r0 = r1.startsWith(r2)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L5a
            goto L68
        L5a:
            boolean r0 = r1.startsWith(r3)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L65
            goto L69
        L61:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L65:
            java.lang.String r3 = "unknown"
            goto L69
        L68:
            r3 = r2
        L69:
            boolean r0 = r3.contains(r4)
            if (r0 != 0) goto L70
            r5 = 1
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IAX.LIZIZ():boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000a. Please report as an issue. */
    public static void LIZ(Activity activity, String str) {
        if (activity == null) {
            return;
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1965615457:
                if (!str.equals("Nearby")) {
                    return;
                }
                C27740Aue.LJIIIIZZ(activity);
                C244389iU.LIZ(activity);
                return;
            case -1672998758:
                if (!str.equals("UNLOGIN_PROFILE")) {
                    return;
                }
                C27740Aue.LJIIIIZZ(activity);
                C27740Aue.LJII(activity);
                return;
            case -1382453013:
                if (!str.equals("NOTIFICATION")) {
                    return;
                }
                C27740Aue.LJIIIIZZ(activity);
                C27740Aue.LJII(activity);
                return;
            case -1376148670:
                if (!str.equals("homepage_explore")) {
                    return;
                }
                C27740Aue.LJIIIIZZ(activity);
                C27740Aue.LJII(activity);
                return;
            case -1116953497:
                if (!str.equals("MUSIC_DSP")) {
                    return;
                }
                if (TextUtils.equals("Daily Mix", "LIBRARY")) {
                    C27740Aue.LJIIIIZZ(activity);
                    C27740Aue.LJII(activity);
                    return;
                } else {
                    C27740Aue.LJIIIIZZ(activity);
                    C244389iU.LIZ(activity);
                    return;
                }
            case -734952021:
                if (!str.equals("FRIENDS_TAB")) {
                    return;
                }
                C27740Aue.LJIIIIZZ(activity);
                C244389iU.LIZ(activity);
                return;
            case 2223327:
                if (!str.equals("HOME")) {
                    return;
                }
                C27740Aue.LJIIIIZZ(activity);
                C244389iU.LIZ(activity);
                return;
            case 2614219:
                if (!str.equals("USER")) {
                    return;
                }
                C27740Aue.LJIIIIZZ(activity);
                C27740Aue.LJII(activity);
                return;
            case 53655674:
                if (!str.equals("UNLOGIN_NOTIFICATION")) {
                    return;
                }
                C27740Aue.LJIIIIZZ(activity);
                C27740Aue.LJII(activity);
                return;
            case 1055811561:
                if (!str.equals("DISCOVER")) {
                    return;
                }
                C27740Aue.LJIIIIZZ(activity);
                C27740Aue.LJII(activity);
                return;
            default:
                return;
        }
    }

    public static void LIZJ(String str, String str2) {
        if (((Boolean) C33809DOr.LIZ.getValue()).booleanValue() && TextUtils.equals("video_view", str)) {
            return;
        }
        if (LIZ == null) {
            synchronized (IAX.class) {
                if (LIZ == null) {
                    C38027EwB c38027EwB = new C38027EwB(FSY.SERIAL);
                    c38027EwB.LIZIZ = "AppsFlyer";
                    LIZ = C38995FSd.LIZ(new C38028EwC(c38027EwB));
                }
            }
        }
        C10K.LIZIZ(new ACallableS5S2000000_7(str, str2, 1), LIZ, null);
    }
}
