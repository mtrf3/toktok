package X;

import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.converter.WebRTCConverter;

/* loaded from: classes33.dex */
public final /* synthetic */ class ZWH implements Runnable {
    public final /* synthetic */ VideoFrame LJLIL;

    public /* synthetic */ ZWH(VideoFrame videoFrame) {
        this.LJLIL = videoFrame;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebRTCConverter.lambda$semisugar$release$0(this.LJLIL);
    }
}
