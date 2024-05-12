package X;

import Y.IDDListenerS140S0100000;
import android.content.Context;
import android.text.TextUtils;
import com.zhiliaoapp.musically.R;

/* renamed from: X.0RO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RO {
    public static void LIZ(Context context, Throwable th, String str) {
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            if (c29401Dk.getErrorCode() != 20006) {
                String prompt = c29401Dk.getPrompt();
                String alert = c29401Dk.getAlert();
                if (!TextUtils.isEmpty(alert)) {
                    String string = context.getResources().getString(R.string.sol);
                    C77437UaH c77437UaH = new C77437UaH(context);
                    c77437UaH.LIZJ = context.getResources().getString(R.string.sp3);
                    c77437UaH.LJI = alert;
                    c77437UaH.LJFF(null, string, false);
                    c77437UaH.LJIILL = new IDDListenerS140S0100000(7);
                    DialogC77438UaI LIZ = c77437UaH.LIZ();
                    if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "3490396839669553871")).LIZ) {
                        return;
                    }
                    LIZ.show();
                    return;
                }
                if (!TextUtils.isEmpty(prompt)) {
                    C30868C9o.LJFF(context, prompt);
                    return;
                } else {
                    C30868C9o.LJFF(context, str);
                    return;
                }
            }
        }
        C30868C9o.LJFF(context, str);
    }
}
