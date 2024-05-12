package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl;

/* renamed from: X.HnC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC45114HnC implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                ((VideoViewCell) this.LJLILLLLZI).LLIZ.setVisibility(4);
                return;
            case 1:
                VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) this.LJLILLLLZI;
                videoRecordNewScene.LLLJIL();
                Activity activity = videoRecordNewScene.mActivity;
                if (activity == null || activity.isFinishing() || !videoRecordNewScene.mArguments.getBoolean("auto_start_recording", false)) {
                    return;
                }
                videoRecordNewScene.LLJIJIL.Tf0();
                return;
            case 2:
                ((EnginePreloader) this.LJLILLLLZI).LJJII.countDown();
                return;
            default:
                ((LiveCoreImpl) this.LJLILLLLZI).lambda$getLiveStreamInfo$2();
                return;
        }
    }

    public /* synthetic */ RunnableC45114HnC(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
