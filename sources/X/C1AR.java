package X;

import Y.IDRunnableS0S0201000;
import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.1AR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AR extends C04330Ez {
    public static final /* synthetic */ int LIZJ = 0;

    public static boolean LJI(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C06P.LIZJ(activity, str);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJFF(Activity activity, String[] strArr, int i) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Permission request for permissions ");
                throw new IllegalArgumentException(JBR.LJFF(LIZ, Arrays.toString(strArr), " must not contain null or empty values", LIZ));
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof C06R) {
                ((C06R) activity).validateRequestPermissionsRequestCode(i);
            }
            C06P.LIZIZ(activity, strArr, i);
        } else {
            if (!(activity instanceof C06Q)) {
                return;
            }
            new Handler(C16880lQ.LLJJJJ()).post(new IDRunnableS0S0201000(i, strArr, activity, 3));
        }
    }
}
