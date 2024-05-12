package X;

import com.google.gson.internal.b;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class J5J implements J3L {
    @Override // X.J3L
    public final void LIZ(C48545J3l c48545J3l) {
        HashMap<String, Object> hashMap = c48545J3l.LIZ;
        J5M j5m = c48545J3l.LIZLLL;
        Iterator<String> it = j5m.getArgs().iterator();
        while (it.hasNext()) {
            if (((Number) b.LJIILL(it.next(), hashMap)) != null) {
                hashMap.put(j5m.getFeature(), Float.valueOf((float) Math.log1p(r0.floatValue() + 1.0f)));
            }
        }
    }
}
