package X;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.concurrent.locks.ReentrantLock;
import ms.bd.o.a;
import ms.bd.o.a3;
import ms.bd.o.b;

/* renamed from: X.Fac, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39238Fac extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        a3 LIZ = a3.LIZ();
        Application application = (Application) C16880lQ.LLLLL(context);
        if (!LIZ.LJLIL && application != null) {
            synchronized (LIZ) {
                if (!LIZ.LJLIL) {
                    LIZ.LJLIL = true;
                    LIZ.LJLJL = false;
                    a3.LJLLI = i;
                    if (!LIZ.LJLILLLLZI) {
                        application.registerActivityLifecycleCallbacks(LIZ);
                        LIZ.LJLJLJ = application;
                        new Handler(C16880lQ.LLJJJJ()).post(new a3.b(application));
                    }
                }
            }
        }
        if (((ReentrantLock) LIZ.LJLJJLL).tryLock()) {
            LIZ.LJLJJL.clear();
            LIZ.LJFF();
            return null;
        }
        return null;
    }
}
