package X;

import android.view.accessibility.AccessibilityManager;

/* renamed from: X.0mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17690mj {
    public static boolean LIZ(AccessibilityManager accessibilityManager, InterfaceC17700mk interfaceC17700mk) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC17710ml(interfaceC17700mk));
    }

    public static boolean LIZIZ(AccessibilityManager accessibilityManager, InterfaceC17700mk interfaceC17700mk) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC17710ml(interfaceC17700mk));
    }
}
