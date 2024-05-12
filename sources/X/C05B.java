package X;

import android.R;
import kotlin.jvm.internal.o;

/* renamed from: X.05B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C05B {
    public static final void LIZ(C17760mq info, C07210Qb semanticsNode) {
        C0QK c0qk;
        o.LJIIIZ(info, "info");
        o.LJIIIZ(semanticsNode, "semanticsNode");
        if (C1A8.LJIIL(semanticsNode) && (c0qk = (C0QK) C0QZ.LIZ(semanticsNode.LJFF, C0QY.LJFF)) != null) {
            info.LIZIZ(new C17720mm(R.id.accessibilityActionSetProgress, c0qk.LIZ));
        }
    }
}
