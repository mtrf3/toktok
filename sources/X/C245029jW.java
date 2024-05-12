package X;

import com.bytedance.keva.Keva;
import java.util.HashMap;

/* renamed from: X.9jW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245029jW {
    public static Keva LIZIZ() {
        return (Keva) C245039jX.LJ.getValue();
    }

    public static C245039jX LIZ(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        HashMap hashMap = (HashMap) C245039jX.LJFF.getValue();
        Integer valueOf = Integer.valueOf(i);
        Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new C245039jX(i);
            hashMap.put(valueOf, obj);
        }
        return (C245039jX) obj;
    }
}
