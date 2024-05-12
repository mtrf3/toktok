package X;

import android.view.accessibility.AccessibilityManager;
import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public class VFN implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final WeakReference<VPJ> LIZ;

    public VFN(VPJ vpj) {
        this.LIZ = new WeakReference<>(vpj);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onTouchExplorationStateChanged: ");
        LIZ.append(z);
        LLog.LIZLLL(2, "LynxA11yDelegate", X1D.LIZIZ(LIZ));
        WeakReference<VPJ> weakReference = this.LIZ;
        if (weakReference != null && weakReference.get() != null) {
            this.LIZ.get().LJIIJ = z;
        }
    }
}
