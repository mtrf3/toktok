package X;

import com.bytedance.realx.video.SurfaceEglRenderer;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.ZUw, reason: case insensitive filesystem */
/* loaded from: classes33.dex */
public final /* synthetic */ class RunnableC90026ZUw implements Runnable {
    public final /* synthetic */ CountDownLatch LJLIL;

    public /* synthetic */ RunnableC90026ZUw(CountDownLatch countDownLatch) {
        this.LJLIL = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceEglRenderer.lambda$semisugar$countDown$0(this.LJLIL);
    }
}
