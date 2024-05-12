package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0NN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0NN {
    public final HashMap<String, C0NL> LIZ = new HashMap<>();

    public final JSONObject LIZ(Q9H q9h, String messageName) {
        o.LJIIIZ(messageName, "messageName");
        C0NL c0nl = this.LIZ.get(messageName);
        if (c0nl == null) {
            return new JSONObject();
        }
        return c0nl.LIZ(q9h, this.LIZ);
    }
}
