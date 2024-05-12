package ms.bd.o;

import X.C278817o;
import java.util.TimeZone;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class o0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        String str2;
        int i2;
        TimeZone timeZone;
        try {
            timeZone = TimeZone.getDefault();
            str2 = timeZone.getID();
        } catch (Throwable unused) {
            str2 = null;
        }
        try {
            i2 = ((timeZone.getRawOffset() / 60) / 60) / 1000;
        } catch (Throwable unused2) {
            i2 = 0;
            StringBuilder LIZJ = C278817o.LIZJ(str2);
            LIZJ.append((String) k.a(16777217, 0, 0L, "31c22b", new byte[]{110}));
            LIZJ.append(i2);
            return LIZJ.toString();
        }
        StringBuilder LIZJ2 = C278817o.LIZJ(str2);
        LIZJ2.append((String) k.a(16777217, 0, 0L, "31c22b", new byte[]{110}));
        LIZJ2.append(i2);
        return LIZJ2.toString();
    }
}
