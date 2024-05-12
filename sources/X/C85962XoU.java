package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.XoU, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85962XoU extends C40322Fs6 {
    public static WeakReference<C26231ARf> LIZ;

    public static boolean LJIIIZ(Context context, boolean z, boolean z2) {
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "NotificationGuide");
        if (C40322Fs6.LIZJ(context)) {
            return false;
        }
        if (z2 || z) {
            return true;
        }
        if ((Build.VERSION.SDK_INT >= 33 && PushPermissionPopupManager.LJII().LJ() == 4) || LIZIZ.getInt("guide_show_times", 0) >= 1) {
            return false;
        }
        if (System.currentTimeMillis() - LIZIZ.getLong("guide_last_time", 0L) < 60000) {
            return false;
        }
        return true;
    }

    public static void LJII(Context context, boolean z, InterfaceC85967XoZ interfaceC85967XoZ, boolean z2) {
        LJIIIIZZ(context, z, interfaceC85967XoZ, z2, false, "", null);
    }

    public static void LJIIIIZZ(Context context, boolean z, InterfaceC85967XoZ interfaceC85967XoZ, boolean z2, boolean z3, String str, ALS als) {
        ALY LIZIZ;
        if (LJIIIZ(context, z, z3)) {
            if (als == null) {
                LIZIZ = null;
            } else {
                try {
                    LIZIZ = als.LIZIZ();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI == null || LJJIFFI.isFinishing()) {
                return;
            }
            C38816FLg.LIZJ(new RunnableC85959XoR(LJJIFFI, z, LIZIZ, z3, str, z2, interfaceC85967XoZ, als));
            Keva repoFromSp = KevaImpl.getRepoFromSp(EF7.LIZIZ(), "NotificationSharePreferences", 0);
            o.LJIIIIZZ(repoFromSp, "getRepoFromSp(AppContext…ants.MODE_SINGLE_PROCESS)");
            repoFromSp.storeBoolean("noticeGuideShown", true);
            return;
        }
        if (interfaceC85967XoZ != null) {
            interfaceC85967XoZ.onCancel();
        }
    }
}
