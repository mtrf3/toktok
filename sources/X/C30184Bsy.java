package X;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveHarmonyOSDisablePipSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Bsy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30184Bsy {
    public static boolean LIZ;

    public static boolean LIZJ() {
        boolean booleanValue;
        if (C15380j0.LIZLLL() != null && C15380j0.LIZLLL().getPackageManager() != null && Build.VERSION.SDK_INT >= 26 && C15380j0.LIZLLL().getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            Boolean bool = C21090sD.LIZLLL;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                try {
                    Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                    C21090sD.LIZLLL = Boolean.valueOf("harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])));
                } catch (Exception unused) {
                    C21090sD.LIZLLL = Boolean.FALSE;
                }
                booleanValue = C21090sD.LIZLLL.booleanValue();
            }
            if ((!booleanValue || !LiveHarmonyOSDisablePipSetting.INSTANCE.getValue()) && !LIZ) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZLLL() {
        if (LIZJ()) {
            Context LIZLLL = C15380j0.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "getContext()");
            if (LIZ(LIZLLL)) {
                Boolean LIZJ = InterfaceC30442Bx8.LLJJJJ.LIZJ();
                o.LJIIIIZZ(LIZJ, "LIVE_PIP_SWITCHER_OPEN.value");
                if (LIZJ.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LIZ(Context context) {
        o.LJIIIZ(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Object LLILL = C16880lQ.LLILL(context, "appops");
                o.LJII(LLILL, "null cannot be cast to non-null type android.app.AppOpsManager");
                if (((AppOpsManager) LLILL).checkOpNoThrow("android:picture_in_picture", Binder.getCallingUid(), C16880lQ.LLLLL(context).getPackageName()) == 0) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean LIZIZ(Activity activity) {
        if (Build.VERSION.SDK_INT < 24 || activity == null || !activity.isInPictureInPictureMode()) {
            return false;
        }
        return true;
    }

    public static void LJ(Context context) {
        if (context == null) {
            return;
        }
        if (!LIZ(context)) {
            InterfaceC30442Bx8.LLJJJJ.LIZ(Boolean.FALSE);
            C0NB.LJIIIZ("picture_in_picture", " syncPipPermissionValue LIVE_PIP_SWITCHER_OPEN -> false");
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("syncPipPermissionValue return ");
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLJJJJ;
        LIZ2.append(c48459J0d.LIZJ());
        C0NB.LJIIIZ("picture_in_picture", X1D.LIZIZ(LIZ2));
        Boolean LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_PIP_SWITCHER_OPEN.value");
        LIZJ.booleanValue();
    }
}
