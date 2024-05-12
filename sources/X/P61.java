package X;

import android.graphics.SurfaceTexture;
import com.ss.android.vesdk.video.TEVideoDataInterface;

/* loaded from: classes12.dex */
public final class P61 implements P63 {
    public final /* synthetic */ TEVideoDataInterface LJLIL;

    public P61(TEVideoDataInterface tEVideoDataInterface) {
        this.LJLIL = tEVideoDataInterface;
    }

    @Override // X.P63, X.P7P
    public final void onFrameCaptured(P6E p6e) {
        p6e.LJFF(this.LJLIL.mTextureHolder.LIZ, 0, null, EnumC63901P6b.PIXEL_FORMAT_OpenGL_OES, 0);
        this.LJLIL.setCameraParams(p6e);
        TEVideoDataInterface tEVideoDataInterface = this.LJLIL;
        tEVideoDataInterface.nativeNotifyFrameAvailable(tEVideoDataInterface.mHandler);
    }

    @Override // X.P7P
    public final void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
        this.LJLIL.mSurfaceTexture = surfaceTexture;
    }
}
