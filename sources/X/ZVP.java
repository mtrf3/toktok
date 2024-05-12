package X;

import com.bytedance.realx.video.Texture2DToWebRTCVideoFrame;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;

/* loaded from: classes33.dex */
public final /* synthetic */ class ZVP implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                Texture2DToWebRTCVideoFrame.LIZ((Texture2DToWebRTCVideoFrame) this.LJLILLLLZI);
                return;
            default:
                RTCEngineImpl.LIZ((RTCEngineImpl) this.LJLILLLLZI);
                return;
        }
    }

    public /* synthetic */ ZVP(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
