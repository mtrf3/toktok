package X;

import com.bytedance.realx.base.JniCommon;
import com.ss.bytertc.engine.mediaio.TextureEglRenderer;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes33.dex */
public final /* synthetic */ class ZVO implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                JniCommon.nativeFreeByteBuffer((ByteBuffer) this.LJLILLLLZI);
                return;
            default:
                TextureEglRenderer.lambda$semisugar$countDown$0((CountDownLatch) this.LJLILLLLZI);
                return;
        }
    }

    public /* synthetic */ ZVO(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
