package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.Gyn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43285Gyn {
    public static void LIZ(DialogC25756A8y dialogC25756A8y) {
        if (dialogC25756A8y != null && dialogC25756A8y.isShowing()) {
            Activity LJIJJ = C45804HyK.LJIJJ(((ContextWrapper) dialogC25756A8y.getContext()).getBaseContext());
            if (LJIJJ != null) {
                if (!LJIJJ.isFinishing() && !LJIJJ.isDestroyed()) {
                    try {
                        dialogC25756A8y.dismiss();
                        return;
                    } catch (IllegalArgumentException e) {
                        C16880lQ.LLLLIIL(e);
                        return;
                    } catch (Exception e2) {
                        C16880lQ.LLLLIIL(e2);
                        return;
                    }
                }
                return;
            }
            try {
                dialogC25756A8y.dismiss();
            } catch (IllegalArgumentException e3) {
                C16880lQ.LLLLIIL(e3);
            } catch (Exception e4) {
                C16880lQ.LLLLIIL(e4);
            }
        }
    }

    public static void LIZIZ(DialogC25756A8y dialogC25756A8y) {
        if (dialogC25756A8y == null) {
            return;
        }
        Context context = dialogC25756A8y.getContext();
        if (((context instanceof Activity) && C45804HyK.LJIJJ(context).isFinishing()) || dialogC25756A8y.isShowing()) {
            return;
        }
        try {
            C16880lQ.LIZ(dialogC25756A8y);
        } catch (Throwable unused) {
        }
    }
}
