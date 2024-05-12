package X;

import com.bytedance.pitaya.jniwrapper.CallCallbackInNative;

/* renamed from: X.aOR, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class RunnableC93287aOR implements Runnable {
    public final /* synthetic */ long LJLIL;

    public RunnableC93287aOR(long j) {
        this.LJLIL = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            CallCallbackInNative.LIZ.LIZIZ(this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }
}
