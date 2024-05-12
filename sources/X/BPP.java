package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BPP {
    public static void LIZJ(Context context, Throwable th) {
        if (th == null || context == null) {
            return;
        }
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            String alert = c29401Dk.getAlert();
            String prompt = c29401Dk.getPrompt();
            if (!TextUtils.isEmpty(alert)) {
                LIZ(context, alert, context.getResources().getString(R.string.sol));
                return;
            } else {
                if (TextUtils.isEmpty(prompt)) {
                    return;
                }
                C30868C9o.LJFF(context, prompt);
                return;
            }
        }
        C30868C9o.LIZLLL(R.string.sp2, context);
    }

    public static void LJ(Context context, Throwable th) {
        if (th == null || context == null) {
            return;
        }
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            String alert = c29401Dk.getAlert();
            String prompt = c29401Dk.getPrompt();
            if (!TextUtils.isEmpty(alert)) {
                LIZ(context, alert, context.getResources().getString(R.string.sol));
                return;
            } else {
                if (TextUtils.isEmpty(prompt)) {
                    return;
                }
                C30868C9o.LJFF(context, prompt);
                return;
            }
        }
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest()) {
            C30868C9o.LIZLLL(R.string.sp2, context);
        }
        if (!InterfaceC30442Bx8.LLILLL.LIZJ().booleanValue() || !((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest()) {
        } else {
            throw th;
        }
    }

    public static void LIZ(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        C77437UaH c77437UaH = new C77437UaH(context);
        c77437UaH.LIZJ = context.getResources().getString(R.string.sp3);
        c77437UaH.LJI = str;
        c77437UaH.LJFF(null, str2, false);
        DialogC77438UaI LIZ = c77437UaH.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "5664097949867104339")).LIZ) {
            return;
        }
        LIZ.show();
    }

    public static void LIZIZ(Context context, String str, Throwable th) {
        if (context == null) {
            return;
        }
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            String prompt = c29401Dk.getPrompt();
            String alert = c29401Dk.getAlert();
            if (!TextUtils.isEmpty(alert)) {
                LIZ(context, alert, context.getResources().getString(R.string.sol));
                return;
            } else if (!TextUtils.isEmpty(prompt)) {
                C30868C9o.LJFF(context, prompt);
                return;
            } else {
                C30868C9o.LJFF(context, str);
                return;
            }
        }
        C30868C9o.LJFF(context, str);
    }

    public static void LIZLLL(Context context, Throwable th, int i) {
        if (th == null || context == null) {
            return;
        }
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            String prompt = c29401Dk.getPrompt();
            String alert = c29401Dk.getAlert();
            if (!TextUtils.isEmpty(alert)) {
                LIZ(context, alert, context.getResources().getString(R.string.sol));
                return;
            } else if (!TextUtils.isEmpty(prompt)) {
                C30868C9o.LJFF(context, prompt);
                return;
            } else {
                C30868C9o.LIZLLL(i, context);
                return;
            }
        }
        C30868C9o.LIZLLL(i, context);
    }
}
