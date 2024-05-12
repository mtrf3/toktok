package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.b;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes9.dex */
public final class J5K implements J3L {
    @Override // X.J3L
    public final void LIZ(C48545J3l c48545J3l) {
        float f;
        HashMap<String, Object> hashMap = c48545J3l.LIZ;
        J5M j5m = c48545J3l.LIZLLL;
        List<String> args = j5m.getArgs();
        Number number = (Number) b.LJIILL((String) ListProtector.get(args, 0), hashMap);
        Number number2 = (Number) b.LJIILL((String) ListProtector.get(args, 1), hashMap);
        float f2 = 0.0f;
        if (number != null) {
            f = number.floatValue();
        } else {
            f = 0.0f;
        }
        if (number2 != null) {
            f2 = number2.floatValue();
        }
        hashMap.put(j5m.getFeature(), Float.valueOf(f / f2));
    }
}
