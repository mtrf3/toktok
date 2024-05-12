package X;

import com.bytedance.realx.video.SurfaceTextureHelper;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;

/* loaded from: classes33.dex */
public final /* synthetic */ class ZVE implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                SurfaceTextureHelper.LIZIZ((SurfaceTextureHelper) this.LJLILLLLZI);
                return;
            default:
                RTCEngineImpl.LJ((RTCEngineImpl) this.LJLILLLLZI);
                return;
        }
    }

    public /* synthetic */ ZVE(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
