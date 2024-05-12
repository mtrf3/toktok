package X;

import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;

/* loaded from: classes8.dex */
public final class G5J implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ VideoPublishContainerScene LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.LJLILLLLZI.LLLLJI().LJJJJL && this.LJLILLLLZI.LLJJJIL.getViewTreeObserver().isAlive() && this.LJLILLLLZI.LLJJJIL.getVisibility() == 0) {
            this.LJLILLLLZI.LLLLJI().LJJJJL = true;
            VideoPublishContainerScene videoPublishContainerScene = this.LJLILLLLZI;
            long currentTimeMillis = System.currentTimeMillis() - this.LJLIL;
            videoPublishContainerScene.getClass();
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("type", "tool_performance_publish_page_first_do_frame_time");
            c145995oB.LIZIZ(currentTimeMillis, "totaltime");
            c145995oB.LIZ(1, "totalstep");
            FMX.LJIIL("tool_performance_operation_cost_time", c145995oB.LIZ);
            this.LJLILLLLZI.LLJJJIL.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public G5J(VideoPublishContainerScene videoPublishContainerScene, long j) {
        this.LJLILLLLZI = videoPublishContainerScene;
        this.LJLIL = j;
    }
}
