package X;

import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.memory.RXVideoTextureMemory;
import com.bytedance.realx.video.memory.helper.AndroidOpenGLTextureMemoryHelper;
import com.ss.bytertc.engine.handler.RTCVideoProcessor;
import com.ss.bytertc.engine.video.IVideoProcessor;
import java.util.concurrent.Callable;

/* loaded from: classes33.dex */
public final /* synthetic */ class ZW8 implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.LJLIL) {
            case 0:
                return AndroidOpenGLTextureMemoryHelper.LIZJ((AndroidOpenGLTextureMemoryHelper) this.LJLILLLLZI, (RXVideoTextureMemory) this.LJLJI);
            default:
                return RTCVideoProcessor.lambda$processVideoFrameInternal$3((VideoFrame) this.LJLILLLLZI, (IVideoProcessor) this.LJLJI);
        }
    }

    public /* synthetic */ ZW8(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
    }
}
