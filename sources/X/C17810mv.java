package X;

import android.view.accessibility.AccessibilityRecord;

/* renamed from: X.0mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17810mv {
    public final AccessibilityRecord LIZ;

    public final int hashCode() {
        AccessibilityRecord accessibilityRecord = this.LIZ;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    public C17810mv(Object obj) {
        this.LIZ = (AccessibilityRecord) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17810mv)) {
            return false;
        }
        C17810mv c17810mv = (C17810mv) obj;
        AccessibilityRecord accessibilityRecord = this.LIZ;
        if (accessibilityRecord == null) {
            if (c17810mv.LIZ == null) {
                return true;
            }
            return false;
        }
        return accessibilityRecord.equals(c17810mv.LIZ);
    }
}
