package X;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import ms.bd.o.a;
import ms.bd.o.a3;
import ms.bd.o.b;

/* renamed from: X.FaZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39235FaZ extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        a3 LIZ = a3.LIZ();
        Application application = (Application) context;
        synchronized (LIZ) {
            if (!LIZ.LJLILLLLZI) {
                LIZ.LJLILLLLZI = true;
                LIZ.LJLJLJ = application;
                application.registerActivityLifecycleCallbacks(LIZ);
                new Handler(C16880lQ.LLJJJJ()).post(new a3.a(application));
                return null;
            }
            return null;
        }
    }
}
