package X;

import android.content.Context;
import ms.bd.o.a;
import ms.bd.o.b;
import ms.bd.o.k;
import ms.bd.o.m2;

/* renamed from: X.FaV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39231FaV extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        int[] iArr = {0, 0};
        try {
            Context context = a.LIZIZ.LIZ;
            if (m2.LIZLLL == null) {
                synchronized (m2.class) {
                    if (m2.LIZLLL == null) {
                        m2.LIZLLL = new m2(context);
                    }
                }
            }
            m2 m2Var = m2.LIZLLL;
            m2Var.LIZ = j;
            return new int[]{m2Var.LIZIZ, m2Var.LIZJ};
        } catch (Throwable unused) {
            k.a(16777217, 0, 0L, "f77be1", new byte[]{94, 27, 109, 34, 26, 33, 96, 2, 38, 55, 111, 54, 65, 6, 78, 47, 106, 24});
            return iArr;
        }
    }
}
