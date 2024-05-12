package X;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: X.JEm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48832JEm extends C48835JEp {
    public boolean LJLIL;
    public long LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C48834JEo.INSTANCE);

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        DisplayManager displayManager;
        Display display;
        try {
            if (!this.LJLIL && (displayManager = (DisplayManager) this.LJLJI.getValue()) != null && (display = displayManager.getDisplay(i)) != null && ((int) display.getRefreshRate()) > 60) {
                C48833JEn.LIZ(false, true);
                this.LJLIL = true;
                DisplayManager displayManager2 = (DisplayManager) this.LJLJI.getValue();
                if (displayManager2 != null) {
                    displayManager2.unregisterDisplayListener(this);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
