package X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.F7o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC38460F7o<V> implements Callable {
    public static final CallableC38460F7o<V> LJLIL = new CallableC38460F7o<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "connectivity");
        o.LJII(LLILL, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) LLILL);
        C48202Ivu c48202Ivu = C2NU.LIZ;
        c48202Ivu.getClass();
        synchronized (C48202Ivu.class) {
            c48202Ivu.LIZ = LJJLI;
            c48202Ivu.LJFF(LJJLI);
        }
        return C76800UCe.LIZ;
    }
}
