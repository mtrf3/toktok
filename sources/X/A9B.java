package X;

import android.content.Context;
import android.widget.Toast;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A9B {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(A9C.LJLIL);

    public static final void LIZ(String msg) {
        o.LJIIIZ(msg, "msg");
        ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static final void LIZIZ(Context context, String str) {
        if (context != null && ((Boolean) A9Q.LIZ.getValue()).booleanValue()) {
            C16880lQ.LLZILL(Toast.makeText(context, str, 0));
        }
    }
}
