package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.0mn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17730mn {
    public final Object LIZ;

    public C17730mn(Object obj) {
        this.LIZ = obj;
    }

    public static C17730mn LIZ(int i, int i2, int i3) {
        return new C17730mn(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }
}
