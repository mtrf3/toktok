package X;

import Y.ARunnableS46S0100000_10;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.Nuw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60882Nuw {
    public static MessageQueue LIZ;

    public static void LIZ(InterfaceC65784Pro action) {
        o.LJIIJ(action, "action");
        MessageQueue messageQueue = LIZ;
        if (messageQueue != null) {
            C16880lQ.LJLI(messageQueue, new C60883Nux(action));
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            Looper LLJJJJ = C16880lQ.LLJJJJ();
            o.LJFF(LLJJJJ, "Looper.getMainLooper()");
            LIZ = LLJJJJ.getQueue();
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, "mMainMessageQueue Looper.getMainLooper().queue", null, null, 6);
            LIZ(action);
            return;
        }
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            LIZ = Looper.myQueue();
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, "mMainMessageQueue Looper.myQueue()", null, null, 6);
            LIZ(action);
            return;
        }
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS46S0100000_10(action, 128));
    }
}
