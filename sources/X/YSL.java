package X;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.videoshop.controller.VideoController;

/* loaded from: classes16.dex */
public class YSL implements WeakHandler.IHandler {
    public final /* synthetic */ VideoController LJLIL;

    public YSL(VideoController videoController) {
        this.LJLIL = videoController;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        int i;
        C79985VaH c79985VaH;
        boolean z = true;
        if (C81333Vw1.LIZ[EnumC81331Vvz.getMsg(message.what).ordinal()] != 1) {
            return;
        }
        C79994VaQ playSettings = this.LJLIL.getPlaySettings();
        if (playSettings == null || (i = playSettings.LIZLLL) <= 0) {
            i = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        }
        if (this.LJLIL.videoEngine != null) {
            Object obj = message.obj;
            if (obj == null || !((Boolean) obj).booleanValue()) {
                z = false;
            }
            int currentPosition = this.LJLIL.getCurrentPosition();
            int LJIL = this.LJLIL.videoEngine.LJIL();
            if (currentPosition >= LJIL) {
                currentPosition = LJIL;
            }
            if (LJIL > 0 && (!z || currentPosition < i)) {
                VideoController videoController = this.LJLIL;
                if (videoController.videoPlayListener != null && !videoController.filterProgressUpdate(currentPosition)) {
                    VideoController videoController2 = this.LJLIL;
                    videoController2.videoPlayListener.onProgressUpdate(videoController2.videoStateInquirer, videoController2.playEntity, currentPosition, LJIL);
                }
            }
            VideoController videoController3 = this.LJLIL;
            if (!videoController3.playCompleted && currentPosition > 0 && (c79985VaH = videoController3.playEntity) != null && !TextUtils.isEmpty(c79985VaH.LIZ)) {
                VideoController videoController4 = this.LJLIL;
                C25990AHy.LIZIZ(currentPosition, videoController4.playEntity.LIZ, videoController4.shouldMarkPushTime);
            }
        }
        if (this.LJLIL.isVideoPlayCompleted() || !this.LJLIL.isPlaying()) {
            return;
        }
        this.LJLIL.handler.sendMessageDelayed(this.LJLIL.handler.obtainMessage(EnumC81331Vvz.UPDATE_PROGRESS.getWhat()), i);
    }
}
