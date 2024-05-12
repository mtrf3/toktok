package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.FVn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39083FVn {
    public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();

    public final void LIZ(Object obj, String str) {
        if (str != null && obj != null) {
            if ((obj instanceof Integer) || o.LJ(obj, C39087FVr.LIZ) || o.LJ(obj, C39086FVq.LIZ)) {
                this.LIZ.put(str, obj);
            } else {
                this.LIZ.put(str, obj.toString());
            }
        }
    }
}
