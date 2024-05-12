package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.1Wn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C34371Wn extends C17770mr {
    public C34371Wn(C17780ms c17780ms) {
        super(c17780ms);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C17760mq LIZJ = this.LIZ.LIZJ(i);
        if (LIZJ == null) {
            return null;
        }
        return LIZJ.LIZ;
    }
}
