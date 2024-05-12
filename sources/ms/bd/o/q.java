package ms.bd.o;

import X.EJ6;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class q extends o {
    public static String LJII(List list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EJ6 ej6 = (EJ6) it.next();
            if (ej6 != null && ((String) k.a(16777217, 0, 0L, "8ac53c", new byte[]{49, 46, 4, 85, 65, 120, 52, 71, 59, 97})).equalsIgnoreCase(ej6.LIZ)) {
                return ej6.LIZIZ;
            }
        }
        return null;
    }

    @Override // ms.bd.o.o
    public final Object[] LJ(String str, String str2, String str3) {
        return LJIIIIZZ(str, null, str3, str2, false, null);
    }

    @Override // ms.bd.o.o
    public final Object[] LJFF(String str, String str2, String str3, byte[] bArr) {
        return LJIIIIZZ(str, str2, str3, null, true, bArr);
    }

    @Override // ms.bd.o.o
    public final Object[] LJI(String str, String str2, String str3) {
        return LJIIIIZZ(str, str2, str3, null, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0385 A[Catch: all -> 0x03d1, TryCatch #1 {all -> 0x03d1, blocks: (B:62:0x035a, B:64:0x0385, B:66:0x038f, B:70:0x0396, B:76:0x03a6, B:79:0x03cf, B:80:0x03d0, B:69:0x0394), top: B:61:0x035a, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0391  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object[] LJIIIIZZ(java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, boolean r47, byte[] r48) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.q.LJIIIIZZ(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, byte[]):java.lang.Object[]");
    }
}
