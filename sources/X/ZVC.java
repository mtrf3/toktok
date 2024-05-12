package X;

import com.bytedance.realx.video.SurfaceTextureHelper;
import com.ss.bytertc.engine.adapter.VideoFrameConverter;

/* loaded from: classes33.dex */
public final /* synthetic */ class ZVC implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                SurfaceTextureHelper.LJFF((SurfaceTextureHelper) this.LJLILLLLZI);
                return;
            default:
                VideoFrameConverter.lambda$convertToJavaI420Buffer$3((VideoFrameConverter.ByteBufferHolder) this.LJLILLLLZI);
                return;
        }
    }

    public /* synthetic */ ZVC(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
