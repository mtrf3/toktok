package X;

import android.view.accessibility.AccessibilityManager;

/* renamed from: X.0ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC17710ml implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final InterfaceC17700mk LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public AccessibilityManagerTouchExplorationStateChangeListenerC17710ml(InterfaceC17700mk interfaceC17700mk) {
        this.LIZ = interfaceC17700mk;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC17710ml)) {
            return false;
        }
        return this.LIZ.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC17710ml) obj).LIZ);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.LIZ.LIZ();
    }
}
