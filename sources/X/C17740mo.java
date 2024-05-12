package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.0mo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17740mo {
    public final Object LIZ;

    public C17740mo(Object obj) {
        this.LIZ = obj;
    }

    public static C17740mo LIZ(int i, int i2, int i3, int i4, boolean z) {
        return new C17740mo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
