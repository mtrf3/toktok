package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: X.VgN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80363VgN extends C16120kC {
    public final /* synthetic */ C80364VgO LIZ;

    public C80363VgN(C80364VgO c80364VgO) {
        this.LIZ = c80364VgO;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.LIZ.isChecked());
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        c17760mq.LJIIL(this.LIZ.LJLJJL);
        c17760mq.LJIILIIL(this.LIZ.isChecked());
    }
}
