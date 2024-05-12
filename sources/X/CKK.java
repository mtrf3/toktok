package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageCompressRateSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageWidthSetting;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.filter.VideoCatcher;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class CKK implements ILiveStream.CatchPicCallback {
    public final /* synthetic */ CKJ LIZ;
    public final /* synthetic */ long LIZIZ;

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
    public final void onComplete() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
    public final /* synthetic */ void onCompleteOnce(String str, long j, long j2, int i, int i2, int i3) {
        C30533Byb.LIZ(this, str, j, j2, i, i2, i3);
    }

    public CKK(CKJ ckj, long j) {
        this.LIZ = ckj;
        this.LIZIZ = j;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchPicCallback
    public final void onCatchedPic(boolean z, VideoCatcher videoCatcher) {
        if (videoCatcher == null || z) {
            return;
        }
        C0NB.LIZIZ("CaptureImageUploadController", "capture catched pic");
        try {
            this.LIZ.LJ.add(new OSZ<>(videoCatcher.getCompressedStream(LiveBroadcastUploadVideoImageWidthSetting.INSTANCE.getValue(), LiveBroadcastUploadVideoImageHeightSetting.INSTANCE.getValue(), LiveBroadcastUploadVideoImageCompressRateSetting.INSTANCE.getValue()), Long.valueOf(this.LIZIZ)));
            this.LIZ.LJ();
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
    public final void onError(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("capture error code:");
        LIZ.append(i);
        LIZ.append(" msg ");
        LIZ.append(str);
        C0NB.LIZIZ("CaptureImageUploadController", X1D.LIZIZ(LIZ));
    }
}
