package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q1Y {
    public final Q1Z<String, List<String>> LIZ;
    public final String LIZIZ;

    public Q1Y(String source) {
        o.LJIIJ(source, "source");
        this.LIZIZ = source;
        Q1Z<String, List<String>> q1z = new Q1Z<>();
        this.LIZ = q1z;
        q1z.LIZ = new Q1L(this);
    }
}
