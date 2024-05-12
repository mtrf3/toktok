package X;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.HRk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44072HRk {
    public static void LIZ(ProgressDialogC44073HRl progressDialogC44073HRl) {
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/DoubleBallLoadingDialog", "show", progressDialogC44073HRl, new Object[0], "void", new C65300Pk0(false, "()V", "-3912418219991735077")).LIZ) {
            return;
        }
        progressDialogC44073HRl.show();
    }

    public static ProgressDialogC44073HRl LIZJ(C44071HRj c44071HRj) {
        String str = c44071HRj.LJ;
        if (o.LJ(str, "no_cancel")) {
            Context context = c44071HRj.LIZ;
            Context context2 = c44071HRj.LIZ;
            int i = c44071HRj.LIZIZ;
            o.LJIIIZ(context2, "context");
            ProgressDialogC44073HRl progressDialogC44073HRl = new ProgressDialogC44073HRl(context2, i, EnumC44076HRo.GONE);
            progressDialogC44073HRl.setCancelable(false);
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    LIZ(progressDialogC44073HRl);
                    return progressDialogC44073HRl;
                }
                return progressDialogC44073HRl;
            }
            return progressDialogC44073HRl;
        }
        if (o.LJ(str, "has_cancel") && c44071HRj.LIZLLL != null) {
            Context context3 = c44071HRj.LIZ;
            ProgressDialogC44073HRl progressDialogC44073HRl2 = new ProgressDialogC44073HRl(c44071HRj.LIZ, c44071HRj.LIZIZ, c44071HRj.LIZJ);
            progressDialogC44073HRl2.LJLJLJ = c44071HRj.LIZLLL;
            LIZIZ(context3, progressDialogC44073HRl2);
            return progressDialogC44073HRl2;
        }
        return null;
    }

    public static void LIZIZ(Context context, ProgressDialogC44073HRl progressDialogC44073HRl) {
        progressDialogC44073HRl.setCancelable(false);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if ((V1B.LJJZZI(activity, false) || L95.LIZIZ()) && !activity.isFinishing()) {
                LIZ(progressDialogC44073HRl);
            }
        }
    }
}
