package X;

import com.bytedance.pitaya.jniwrapper.CallCallbackInNative;

/* renamed from: X.aOP, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class RunnableC93285aOP implements Runnable {
    public final /* synthetic */ long LJLIL;

    public RunnableC93285aOP(long j) {
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
