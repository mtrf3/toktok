package X;

import com.ss.ttlivestreamer.core.engine.ShortVideoPushManager;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;

/* loaded from: classes12.dex */
public final class P3D implements ShortVideoPushManager.IFrameAvailableListener {
    public final /* synthetic */ LiveCore LIZ;

    public P3D(LiveCore liveCore) {
        this.LIZ = liveCore;
    }

    @Override // com.ss.ttlivestreamer.core.engine.ShortVideoPushManager.IFrameAvailableListener
    public final void onFrameAvailable(int i, int i2, int i3, long j) {
        this.LIZ.pushVideoFrame(i, false, i2, i3, 0, (float[]) null, j);
    }
}
