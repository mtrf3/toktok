package X;

import Y.ARunnableS27S0200000_8;
import android.content.Context;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public final class JG7 {
    public static void LIZ(Context context, Throwable th) {
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = R.string.tmq;
        if (th instanceof C38333F2r) {
            switch (((C38306F1q) th).getErrorCode()) {
                case 3020003:
                    c76732zl.element = R.string.tmo;
                    break;
                case 3020005:
                    c76732zl.element = R.string.tmp;
                    break;
                case 3020006:
                    c76732zl.element = R.string.ru1;
                    break;
            }
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            LJJIFFI.runOnUiThread(new ARunnableS27S0200000_8(c76732zl, LJJIFFI, 80));
        }
    }
}
