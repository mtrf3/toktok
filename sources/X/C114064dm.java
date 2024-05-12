package X;

import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.jvm.internal.o;

/* renamed from: X.4dm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C114064dm {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C114084do.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C114074dn.LJLIL);

    public final boolean LIZ(String text) {
        o.LJIIIZ(text, "text");
        ((Paint) this.LIZIZ.getValue()).getTextBounds(text, 0, text.length(), (Rect) this.LIZ.getValue());
        if (((Rect) this.LIZ.getValue()).width() <= C7MY.LIZIZ(62)) {
            return false;
        }
        return true;
    }
}
