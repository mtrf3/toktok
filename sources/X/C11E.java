package X;

import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.11E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11E {
    public static final C11E LIZ = new C11E();

    public static final long LIZ(MotionEvent motionEvent, int i) {
        o.LJIIIZ(motionEvent, "motionEvent");
        return C78923UyF.LIZ(motionEvent.getRawX(i), motionEvent.getRawY(i));
    }
}
