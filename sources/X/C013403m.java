package X;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* renamed from: X.03m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C013403m extends LinearLayout {
    public C013403m() {
        throw null;
    }

    public AnonymousClass020 getTab() {
        return null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        boolean z2;
        if (isSelected() != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        super.setSelected(z);
        if (z2 && z) {
            sendAccessibilityEvent(4);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        throw null;
    }
}
