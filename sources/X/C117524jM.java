package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;

/* renamed from: X.4jM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117524jM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, EditText editText) {
        Activity LJIJJ;
        Window window;
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            int requestedOrientation = LJIJJ.getRequestedOrientation();
            if (requestedOrientation == 0 || requestedOrientation == 8 || requestedOrientation == 6 || requestedOrientation == 11) {
                if (editText != null) {
                    editText.setImeOptions(268435456);
                }
                Activity LJIJJ2 = C45804HyK.LJIJJ(context);
                if (LJIJJ2 != null && (window = LJIJJ2.getWindow()) != null) {
                    window.setSoftInputMode(32);
                }
            }
        }
    }

    public static void LIZIZ(Dialog dialog, FrameLayout frameLayout) {
        View view;
        View decorView;
        if (dialog != null) {
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(false);
            }
            Window window = dialog.getWindow();
            WindowManager.LayoutParams layoutParams = null;
            if (window != null) {
                view = window.getDecorView();
            } else {
                view = null;
            }
            if (view != null) {
                view.setSystemUiVisibility(3846);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                Window window2 = dialog.getWindow();
                if (window2 != null && (layoutParams = window2.getAttributes()) != null) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                Window window3 = dialog.getWindow();
                if (window3 != null) {
                    window3.setAttributes(layoutParams);
                }
                Window window4 = dialog.getWindow();
                if (window4 == null || (decorView = window4.getDecorView()) == null) {
                    return;
                }
                decorView.setSystemUiVisibility(3846);
            }
        }
    }
}
