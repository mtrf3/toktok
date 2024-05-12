package X;

import com.bytedance.pitaya.api.PitayaProxy;

/* renamed from: X.F6s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC38438F6s implements Runnable {
    public static final RunnableC38438F6s LJLIL = new RunnableC38438F6s();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            PitayaProxy.loadProxySoImpl();
        } finally {
            if (LIZ) {
            }
        }
    }
}
