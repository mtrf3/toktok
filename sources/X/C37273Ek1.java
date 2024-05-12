package X;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Ek1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37273Ek1 {
    public final Method LIZ;
    public final List<?> LIZIZ;

    public final String toString() {
        return C16880lQ.LLLZ("%s.%s() %s", new Object[]{this.LIZ.getDeclaringClass().getName(), this.LIZ.getName(), this.LIZIZ});
    }

    public C37273Ek1(Method method, List<?> list) {
        this.LIZ = method;
        this.LIZIZ = Collections.unmodifiableList(list);
    }
}
