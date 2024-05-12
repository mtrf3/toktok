package X;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import kotlin.jvm.internal.o;

/* renamed from: X.5Rv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135075Rv implements C5HD {
    public static final C135075Rv LIZ = new C135075Rv();
    public static Toast LIZIZ;

    @Override // X.C5HD
    public final void LIZ(Context context, String message) {
        o.LJIIIZ(message, "message");
        if (Build.VERSION.SDK_INT < 28) {
            if (LIZIZ == null) {
                LIZIZ = Toast.makeText(context, "", 0);
            }
            Toast toast = LIZIZ;
            if (toast != null) {
                toast.setText(message);
            }
        } else {
            Toast toast2 = LIZIZ;
            if (toast2 != null) {
                toast2.cancel();
                LIZIZ = null;
            }
            Toast makeText = Toast.makeText(context, "", 0);
            LIZIZ = makeText;
            if (makeText != null) {
                makeText.setText(message);
            }
        }
        Toast toast3 = LIZIZ;
        if (toast3 != null) {
            C16880lQ.LLZILL(toast3);
        }
    }
}
