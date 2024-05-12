package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import com.lynx.tasm.behavior.ui.UIBody;

/* loaded from: classes15.dex */
public final class VOU extends View.AccessibilityDelegate {
    public final /* synthetic */ UIBody LIZ;

    public VOU(UIBody uIBody) {
        this.LIZ = uIBody;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        return this.LIZ.LJLJI;
    }
}
