package X;

import android.view.Window;

/* renamed from: X.VtK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81166VtK {
    public static boolean LIZ(Window window) {
        if (window != null && window.getAttributes() != null && (window.getAttributes().flags & 1024) == 1024) {
            return true;
        }
        return false;
    }
}
