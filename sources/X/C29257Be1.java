package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.Be1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29257Be1 {
    public static boolean LIZIZ;
    public static final C29257Be1 LIZ = new C29257Be1();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C29258Be2.LJLIL);

    public final synchronized void LIZ() {
        if (!LIZIZ) {
            LIZIZ = true;
            C62822Ol8 c62822Ol8 = LIZJ;
            ((HandlerThread) c62822Ol8.getValue()).start();
            new Handler(((HandlerThread) c62822Ol8.getValue()).getLooper());
        }
    }
}
