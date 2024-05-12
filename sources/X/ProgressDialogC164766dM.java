package X;

import android.app.Activity;
import android.content.Context;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6dM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ProgressDialogC164766dM extends ProgressDialogC173686rk {
    public ProgressDialogC164766dM(Context context) {
        super(context);
        this.LJLIL = false;
    }

    public static ProgressDialogC164766dM LIZLLL(Context context, String str) {
        if (context != null && (context instanceof Activity) && !C45804HyK.LJIJJ(context).isFinishing()) {
            ProgressDialogC164766dM progressDialogC164766dM = new ProgressDialogC164766dM(context);
            progressDialogC164766dM.setCancelable(false);
            progressDialogC164766dM.setIndeterminate(false);
            progressDialogC164766dM.setMax(100);
            if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/widgetcompat/AwemeLoadingDialog", "show", progressDialogC164766dM, new Object[0], "void", new C65300Pk0(false, "()V", "-5645925859097686113")).LIZ) {
                progressDialogC164766dM.show();
            }
            progressDialogC164766dM.setContentView(R.layout.k0);
            progressDialogC164766dM.setMessage(str);
            progressDialogC164766dM.LIZIZ();
            return progressDialogC164766dM;
        }
        return null;
    }
}
