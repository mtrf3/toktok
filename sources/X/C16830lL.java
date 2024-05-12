package X;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* renamed from: X.0lL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16830lL {
    public final C16820lK LIZ;

    public C16830lL(final Window window, final View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.LIZ = new C16820lK(window) { // from class: X.1V5
                public final WindowInsetsController LIZ;
                public final Window LIZIZ;

                {
                    WindowInsetsController insetsController = window.getInsetsController();
                    new C0MA();
                    this.LIZ = insetsController;
                    this.LIZIZ = window;
                }

                @Override // X.C16820lK
                public final void LIZ(boolean z) {
                    if (z) {
                        Window window2 = this.LIZIZ;
                        if (window2 != null) {
                            View decorView = window2.getDecorView();
                            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | FileUtils.BUFFER_SIZE);
                        }
                        this.LIZ.setSystemBarsAppearance(8, 8);
                        return;
                    }
                    Window window3 = this.LIZIZ;
                    if (window3 != null) {
                        View decorView2 = window3.getDecorView();
                        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
                    }
                    this.LIZ.setSystemBarsAppearance(0, 8);
                }
            };
            return;
        }
        if (i >= 26) {
            this.LIZ = new C43281mu(window, view) { // from class: X.224
            };
        } else if (i >= 23) {
            this.LIZ = new C43281mu(window, view);
        } else {
            this.LIZ = new C1V4(window, view);
        }
    }
}
