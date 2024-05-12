package X;

import android.hardware.display.DisplayManager;
import com.ss.ttm.player.VsyncTimeHelper;

/* loaded from: classes9.dex */
public final class J2L implements DisplayManager.DisplayListener {
    public final DisplayManager LJLIL;
    public final /* synthetic */ VsyncTimeHelper LJLILLLLZI;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.LJLILLLLZI.LIZ();
        }
    }

    public J2L(VsyncTimeHelper vsyncTimeHelper, DisplayManager displayManager) {
        this.LJLILLLLZI = vsyncTimeHelper;
        this.LJLIL = displayManager;
    }
}
