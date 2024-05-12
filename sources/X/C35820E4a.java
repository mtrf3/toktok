package X;

import Y.ARunnableS14S0201000_11;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import java.io.File;

/* renamed from: X.E4a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35820E4a {
    public static SharedPreferences LIZ;

    public static SharedPreferences LIZLLL(Context context) {
        if (LIZ == null) {
            LIZ = context.getSharedPreferences("cold_boot_sp", 0);
        }
        return LIZ;
    }

    public static void LIZJ(Application application, Context context) {
        C38891fp.LJLILLLLZI = application;
        try {
            C38891fp.LJLJI = LIZIZ(context, "optimize_cold_boot_hook_app_context", true);
        } catch (Throwable unused) {
        }
        if (FCD.LJI(context)) {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(C16880lQ.LLIIJLIL(context));
                LIZ2.append("cold_boot_sp");
                if (!new File(X1D.LIZIZ(LIZ2)).exists()) {
                    C38995FSd.LIZLLL().execute(new ARunnableS14S0201000_11(1, application, context, 4));
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public static void LJ(AwemeHostApplication awemeHostApplication, int i) {
        LIZLLL(awemeHostApplication).edit().putInt("thread_convergence_init_async", i).apply();
    }

    public static int LIZ(Context context, int i, String str) {
        return LIZLLL(context).getInt(str, i);
    }

    public static boolean LIZIZ(Context context, String str, boolean z) {
        return LIZLLL(context).getBoolean(str, z);
    }
}
