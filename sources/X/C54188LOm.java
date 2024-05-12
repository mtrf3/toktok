package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.LOm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54188LOm extends C16120kC {
    public final /* synthetic */ int LIZ;

    public C54188LOm(int i) {
        this.LIZ = i;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        int i = this.LIZ;
        if (i > 0) {
            c17760mq.LJIILLIIL(new C17730mn(AccessibilityNodeInfo.CollectionInfo.obtain(1, i, false)));
        }
    }
}
