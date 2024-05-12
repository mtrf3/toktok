package X;

import Y.ARunnableS5S0201000_2;
import android.content.Context;
import android.os.Handler;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes15.dex */
public final class VPK {
    public static void LIZ(Context context, String str, long j, boolean z) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) C16880lQ.LLILL(context, "accessibility");
        if (accessibilityManager.isTouchExplorationEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.getText().add(str);
            try {
                if (z) {
                    new Handler().postDelayed(new ARunnableS5S0201000_2(0, accessibilityManager, obtain, 5), j);
                } else {
                    accessibilityManager.sendAccessibilityEvent(obtain);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }
}
