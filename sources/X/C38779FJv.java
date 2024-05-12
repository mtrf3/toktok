package X;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.FJv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38779FJv {
    public static final C38781FJx LIZJ = new C38781FJx();
    public final java.util.Map<String, AbstractC38780FJw> LIZ = new HashMap();
    public JSONObject LIZIZ;

    public static C38779FJv LIZ() {
        Object obj;
        C38781FJx c38781FJx = LIZJ;
        synchronized (c38781FJx) {
            if (c38781FJx.LIZ == null) {
                c38781FJx.LIZ = new C38779FJv();
            }
            obj = c38781FJx.LIZ;
        }
        return (C38779FJv) obj;
    }
}
