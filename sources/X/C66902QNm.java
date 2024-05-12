package X;

import ms.bd.o.a2;
import ms.bd.o.b2;

/* renamed from: X.QNm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66902QNm {
    public static synchronized C66895QNf LIZ(String str) {
        C66895QNf c66895QNf;
        synchronized (C66902QNm.class) {
            a2 LIZ = b2.LIZ(str);
            c66895QNf = LIZ != null ? new C66895QNf(LIZ) : null;
        }
        return c66895QNf;
    }
}
