package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* renamed from: X.03E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C03E {
    public static void LIZ(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        C03H c03h = C03H.LJLL;
        if (c03h != null && c03h.LJLIL == view) {
            C03H.LIZIZ(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C03H c03h2 = C03H.LJLLI;
            if (c03h2 != null && c03h2.LJLIL == view) {
                c03h2.LIZ();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new C03H(view, charSequence);
    }
}
