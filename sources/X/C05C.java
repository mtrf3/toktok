package X;

import android.view.accessibility.AccessibilityEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.05C, reason: invalid class name */
/* loaded from: classes.dex */
public final class C05C {
    public static final void LIZ(AccessibilityEvent event, int i, int i2) {
        o.LJIIIZ(event, "event");
        event.setScrollDeltaX(i);
        event.setScrollDeltaY(i2);
    }
}
