package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.QsH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68361QsH {
    public static InterfaceC68379QsZ LIZ(C68347Qs3 c68347Qs3) {
        if (c68347Qs3 == null) {
            return InterfaceC68379QsZ.LJIIJ;
        }
        int LJIL = c68347Qs3.LJIL() - 1;
        if (LJIL != 1) {
            if (LJIL != 2) {
                if (LJIL != 3) {
                    if (LJIL == 4) {
                        XM7 xm7 = c68347Qs3.zzg;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = xm7.iterator();
                        while (it.hasNext()) {
                            arrayList.add(LIZ((C68347Qs3) it.next()));
                        }
                        return new C68392Qsm(c68347Qs3.zzh, arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                }
                if (c68347Qs3.LJIJI()) {
                    return new C68365QsL(Boolean.valueOf(c68347Qs3.zzj));
                }
                return new C68365QsL(null);
            }
            if (c68347Qs3.LJIJJ()) {
                return new C68366QsM(Double.valueOf(c68347Qs3.zzk));
            }
            return new C68366QsM(null);
        }
        if (c68347Qs3.LJIJJLI()) {
            return new C68376QsW(c68347Qs3.zzi);
        }
        return InterfaceC68379QsZ.LJIIZILJ;
    }

    public static InterfaceC68379QsZ LIZIZ(Object obj) {
        if (obj == null) {
            return InterfaceC68379QsZ.LJIIJJI;
        }
        if (obj instanceof String) {
            return new C68376QsW((String) obj);
        }
        if (obj instanceof Double) {
            return new C68366QsM((Double) obj);
        }
        if (obj instanceof Long) {
            return new C68366QsM(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C68366QsM(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C68365QsL((Boolean) obj);
        }
        if (obj instanceof java.util.Map) {
            C68363QsJ c68363QsJ = new C68363QsJ();
            java.util.Map map = (java.util.Map) obj;
            for (Object obj2 : map.keySet()) {
                InterfaceC68379QsZ LIZIZ = LIZIZ(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    c68363QsJ.LJIIIIZZ((String) obj2, LIZIZ);
                }
            }
            return c68363QsJ;
        }
        if (obj instanceof List) {
            C68375QsV c68375QsV = new C68375QsV();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c68375QsV.LJJIFFI(c68375QsV.LJIILLIIL(), LIZIZ(it.next()));
            }
            return c68375QsV;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
}
