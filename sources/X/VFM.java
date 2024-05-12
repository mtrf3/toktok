package X;

import android.view.accessibility.AccessibilityManager;
import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public class VFM implements AccessibilityManager.AccessibilityStateChangeListener {
    public final WeakReference<VPJ> LIZ;

    public VFM(VPJ vpj) {
        this.LIZ = new WeakReference<>(vpj);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAccessibilityStateChanged: ");
        LIZ.append(z);
        LLog.LIZLLL(2, "LynxA11yDelegate", X1D.LIZIZ(LIZ));
        WeakReference<VPJ> weakReference = this.LIZ;
        if (weakReference != null && weakReference.get() != null) {
            this.LIZ.get().LJIIIZ = z;
        }
    }
}
