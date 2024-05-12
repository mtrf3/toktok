package X;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* renamed from: X.6a1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162696a1 {
    public static void LIZ(Activity activity) {
        InputMethodManager inputMethodManager;
        if (activity == null || activity.getCurrentFocus() == null || (inputMethodManager = (InputMethodManager) C16880lQ.LLILIL(activity, "input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
    }

    public static void LIZJ(Activity activity) {
        Window window = activity.getWindow();
        if (window.getStatusBarColor() == 0) {
            return;
        }
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
        window.setStatusBarColor(0);
    }

    public static void LIZIZ(C8HN c8hn, CharSequence charSequence) {
        if (c8hn == null) {
            return;
        }
        if (TextUtils.isEmpty(c8hn.getText())) {
            if (!TextUtils.isEmpty(charSequence)) {
                c8hn.setText(charSequence);
            }
        } else {
            if (c8hn.getText().equals(charSequence)) {
                return;
            }
            c8hn.setText(charSequence);
        }
    }

    public static void LIZLLL(int i, W5G w5g) {
        if (w5g == null || w5g.getVisibility() == i) {
            return;
        }
        if (i == 0 && w5g.getAlpha() < Float.MIN_VALUE) {
            w5g.setAlpha(1.0f);
        }
        w5g.setVisibility(i);
    }

    public static void LJ(int i, View view) {
        if (view.getVisibility() == i) {
            return;
        }
        view.setVisibility(i);
    }
}
