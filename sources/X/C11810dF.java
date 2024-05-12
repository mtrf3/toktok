package X;

import android.graphics.Canvas;
import kotlin.jvm.internal.o;

/* renamed from: X.0dF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11810dF {
    public static final C11810dF LIZ = new C11810dF();

    public static final void LIZ(Canvas canvas, boolean z) {
        o.LJIIIZ(canvas, "canvas");
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
