package X;

import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* renamed from: X.EZn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36639EZn {
    public V0Q LIZIZ() {
        return new C36641EZp();
    }

    public void LIZ(Throwable cause, Throwable exception) {
        o.LJIIIZ(cause, "cause");
        o.LJIIIZ(exception, "exception");
        Method method = C36638EZm.LIZ;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }
}
