package X;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.PQq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC64436PQq implements Runnable {
    public static final RunnableC64436PQq LJLIL = new RunnableC64436PQq();

    public static void LIZ() {
        if (((Boolean) C64443PQx.LIZJ.getValue()).booleanValue()) {
            C64441PQv.LIZ.LIZ();
        } else if (((Boolean) C64443PQx.LIZLLL.getValue()).booleanValue()) {
            C64441PQv c64441PQv = C64441PQv.LIZ;
            C64432PQm.LJFF((InterfaceC64435PQp) C64441PQv.LJII.getValue());
            if (C40010Fn4.LIZJ().LJ()) {
                c64441PQv.LIZ();
            }
        }
        Context context = (Context) C64441PQv.LJI.getValue();
        o.LJII(context, "null cannot be cast to non-null type android.app.Application");
        ((Application) context).registerActivityLifecycleCallbacks((EG4) C64441PQv.LJIIIIZZ.getValue());
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
