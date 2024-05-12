package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.5Rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135115Rz {
    public static void LIZ(Dialog dialog) {
        if (dialog != null && dialog.isShowing()) {
            Context baseContext = ((ContextWrapper) dialog.getContext()).getBaseContext();
            if (baseContext instanceof Activity) {
                Activity activity = (Activity) baseContext;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    try {
                        dialog.dismiss();
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
                dialog.dismiss();
            } catch (IllegalArgumentException e3) {
                C16880lQ.LLLLIIL(e3);
            } catch (Exception e4) {
                C16880lQ.LLLLIIL(e4);
            }
        }
    }
}
