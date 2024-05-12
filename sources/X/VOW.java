package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* loaded from: classes15.dex */
public final class VOW extends View.AccessibilityDelegate {
    public final /* synthetic */ VPN LIZ;

    public VOW(VPN vpn) {
        this.LIZ = vpn;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        return this.LIZ;
    }
}
