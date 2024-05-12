package X;

import com.bytedance.pitaya.jniwrapper.DefaultAdapter;

/* renamed from: X.aOS, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class RunnableC93288aOS implements Runnable {
    public final /* synthetic */ DefaultAdapter LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public RunnableC93288aOS(DefaultAdapter defaultAdapter, int i, long j) {
        this.LJLIL = defaultAdapter;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.async(this.LJLILLLLZI, this.LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }
}
