package X;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Gec, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42034Gec {
    public static ProgressDialogC43239Gy3 LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        ProgressDialogC43239Gy3 progressDialogC43239Gy3 = new ProgressDialogC43239Gy3(context, EnumC42288Gii.GONE, 0);
        LIZ(context, progressDialogC43239Gy3);
        return progressDialogC43239Gy3;
    }

    public static void LIZ(Context context, ProgressDialogC43239Gy3 progressDialogC43239Gy3) {
        progressDialogC43239Gy3.setCancelable(false);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!V1B.LJJZZI(activity, true) || activity.isFinishing() || new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/view/DoubleBallLoadingDialog", "show", progressDialogC43239Gy3, new Object[0], "void", new C65300Pk0(false, "()V", "-7372129130406622799")).LIZ) {
                return;
            }
            progressDialogC43239Gy3.show();
        }
    }

    public static ProgressDialogC43239Gy3 LIZJ(Context context, EnumC42288Gii cancelType, InterfaceC43240Gy4 interfaceC43240Gy4) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cancelType, "cancelType");
        ProgressDialogC43239Gy3 progressDialogC43239Gy3 = new ProgressDialogC43239Gy3(context, cancelType);
        progressDialogC43239Gy3.LJLJLJ = interfaceC43240Gy4;
        LIZ(context, progressDialogC43239Gy3);
        return progressDialogC43239Gy3;
    }
}
