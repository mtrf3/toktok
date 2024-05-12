package X;

import android.view.View;
import android.view.Window;

/* loaded from: classes11.dex */
public final class OOY implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ Window LIZ;

    public OOY(Window window) {
        this.LIZ = window;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        this.LIZ.getDecorView().setSystemUiVisibility(5894);
    }
}
