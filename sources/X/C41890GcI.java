package X;

import Y.AObjectS43S0101000_7;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;

/* renamed from: X.GcI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41890GcI implements GI1 {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ VideoPublishContainerScene LIZIZ;

    @Override // X.GI1
    public final InterfaceC88472Yns<AwemeDraft, C76800UCe> LIZ() {
        return new AObjectS43S0101000_7(2, this, 0);
    }

    @Override // X.GI1
    public final void LIZIZ(C142535ib c142535ib) {
        VideoPublishContainerScene videoPublishContainerScene = this.LIZIZ;
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        videoPublishContainerScene.getClass();
        VideoPublishContainerScene.LLZLI(currentTimeMillis, "tool_performance_click_publish_save_draft_cost_time_success");
        C44172HVg.LJJI.LJI().LIZ().LJ(c142535ib.LJLILLLLZI);
        ActivityC45651qj LLII = this.LIZIZ.LLII();
        if (LLII != null) {
            new C41896GcO(LLII, new C41893GcL(LLII, this.LIZIZ.LLILZLL)).LIZ(c142535ib.LJLILLLLZI);
        }
        C86793Y4n.LJJIJ(this.LIZIZ.LLILZLL, false, true);
        if (!((Boolean) C42541Gmn.LIZ.getValue()).booleanValue()) {
            this.LIZIZ.I();
        }
    }

    @Override // X.GI1
    public final void LIZJ(C142535ib c142535ib) {
        VideoPublishContainerScene videoPublishContainerScene = this.LIZIZ;
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        videoPublishContainerScene.getClass();
        VideoPublishContainerScene.LLZLI(currentTimeMillis, "tool_performance_click_publish_save_draft_cost_time_failed");
        C86793Y4n.LJJIJ(this.LIZIZ.LLILZLL, false, false);
        if (!((Boolean) C42541Gmn.LIZ.getValue()).booleanValue()) {
            this.LIZIZ.I();
        }
    }

    public C41890GcI(VideoPublishContainerScene videoPublishContainerScene, long j) {
        this.LIZIZ = videoPublishContainerScene;
        this.LIZ = j;
    }
}
