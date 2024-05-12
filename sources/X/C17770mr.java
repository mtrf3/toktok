package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0mr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17770mr extends AccessibilityNodeProvider {
    public final C17780ms LIZ;

    public C17770mr(C17780ms c17780ms) {
        this.LIZ = c17780ms;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C17760mq LIZ = this.LIZ.LIZ(i);
        if (LIZ == null) {
            return null;
        }
        return LIZ.LIZ;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        List<C17760mq> LIZIZ = this.LIZ.LIZIZ(str, i);
        if (LIZIZ == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = LIZIZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((C17760mq) ListProtector.get(LIZIZ, i2)).LIZ);
        }
        return arrayList;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.LIZ.LIZLLL(i, i2, bundle);
    }
}
