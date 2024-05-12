package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Jj2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C49952Jj2 {
    public final HashMap<String, Object> LIZ = new HashMap<>();

    public final void LIZ(Object value, String str) {
        o.LJIIIZ(value, "value");
        this.LIZ.put(str, value);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key = ");
        LIZ.append(str);
        LIZ.append(", value = ");
        LIZ.append(value);
        C15280iq.LIZIZ("SearchChainEventTracker", X1D.LIZIZ(LIZ));
    }
}
