package X;

import android.app.Dialog;
import android.view.View;
import android.view.Window;

/* loaded from: classes11.dex */
public final class OOZ implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ Dialog LIZ;

    public OOZ(Dialog dialog) {
        this.LIZ = dialog;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        View decorView;
        Window window = this.LIZ.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(5894);
        }
    }
}
