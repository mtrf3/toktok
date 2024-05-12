package X;

import com.bytedance.realx.base.JniCommon;
import com.ss.bytertc.engine.handler.RTCVideoProcessor;
import java.nio.ByteBuffer;

/* renamed from: X.ZUu, reason: case insensitive filesystem */
/* loaded from: classes33.dex */
public final /* synthetic */ class RunnableC90024ZUu implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                JniCommon.nativeFreeByteBuffer((ByteBuffer) this.LJLILLLLZI);
                return;
            default:
                RTCVideoProcessor.LJFF((RTCVideoProcessor) this.LJLILLLLZI);
                return;
        }
    }

    public /* synthetic */ RunnableC90024ZUu(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
