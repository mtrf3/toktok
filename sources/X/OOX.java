package X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class OOX extends C18Z {
    public OOX(Context context) {
        super(context, R.style.a71);
        LJIJI(1);
        Window window = getWindow();
        if (window != null) {
            window.setFlags(1024, 1024);
        }
        if (C90193gN.LIZIZ(context)) {
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setWindowAnimations(R.style.a8p);
                return;
            }
            return;
        }
        Window window3 = getWindow();
        if (window3 == null) {
            return;
        }
        window3.setWindowAnimations(R.style.a_e);
    }

    @Override // X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (C90193gN.LIZIZ(window.getContext())) {
                window.setGravity(3);
            } else {
                window.setGravity(5);
            }
            window.setLayout(-1, -1);
            window.getDecorView().setSystemUiVisibility(6);
            window.getDecorView().setOnSystemUiVisibilityChangeListener(new OOY(window));
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        }
    }
}
