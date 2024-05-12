package X;

import android.os.Handler;
import kotlin.jvm.internal.o;

/* renamed from: X.93G, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C93G {
    public static Handler LIZ;
    public static final C93G LIZIZ = new C93G();

    public static final Handler LIZ() {
        Handler handler;
        synchronized (C93G.class) {
            LIZIZ.getClass();
            if (LIZ == null) {
                LIZ = new Handler(C16880lQ.LLJJJJ());
            }
            handler = LIZ;
            o.LJI(handler);
        }
        return handler;
    }
}
