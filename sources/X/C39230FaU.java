package X;

import android.app.Activity;
import android.content.Context;
import ms.bd.o.a;
import ms.bd.o.b;
import ms.bd.o.k;
import ms.bd.o.m2;
import ms.bd.o.n2;

/* renamed from: X.FaU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39230FaU extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        String replace = str.replace((String) k.a(16777217, 0, 0L, "ef1111", new byte[]{63}), (String) k.a(16777217, 0, 0L, "3de6d7", new byte[]{111})).replace((String) k.a(16777217, 0, 0L, "e2c864", new byte[]{59}), (String) k.a(16777217, 0, 0L, "4ecce5", new byte[]{26}));
        Activity LIZIZ = n2.LIZIZ();
        if (LIZIZ == null) {
            return null;
        }
        if (m2.LIZLLL == null) {
            synchronized (m2.class) {
                if (m2.LIZLLL == null) {
                    m2.LIZLLL = new m2(context);
                }
            }
        }
        m2.LIZLLL.LIZ(LIZIZ, replace);
        return null;
    }
}
