package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class J5E implements J3L {
    @Override // X.J3L
    public final void LIZ(C48545J3l c48545J3l) {
        HashMap<String, Object> hashMap = c48545J3l.LIZ;
        J5M j5m = c48545J3l.LIZLLL;
        List<String> args = j5m.getArgs();
        List<Float> oPTs = j5m.getOPTs();
        Iterator<String> it = args.iterator();
        while (it.hasNext()) {
            Number number = (Number) b.LJIILL(it.next(), hashMap);
            if (number != null) {
                hashMap.put(j5m.getFeature(), Float.valueOf(Math.min(number.floatValue(), ((Float) ListProtector.get(oPTs, 0)).floatValue())));
            }
        }
    }
}
