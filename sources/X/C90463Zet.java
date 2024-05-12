package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* renamed from: X.Zet, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90463Zet extends View.AccessibilityDelegate {
    public final /* synthetic */ C90226Zb4 LIZ;

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        accessibilityEvent.setItemCount(this.LIZ.LJLIL.LIZ);
        accessibilityEvent.setCurrentItemIndex(this.LIZ.getProgress());
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(FileUtils.BUFFER_SIZE);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (i == 4096 || i == 8192) {
            this.LIZ.getClass();
            C90226Zb4 c90226Zb4 = this.LIZ;
            c90226Zb4.getProgress();
            c90226Zb4.LJLIL.getClass();
            this.LIZ.getClass();
        }
        return false;
    }
}
