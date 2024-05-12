package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U3K implements U3V {
    public final /* synthetic */ LiveShowAnchorWidget LIZ;

    @Override // X.U3V
    public final void LIZ() {
    }

    public U3K(LiveShowAnchorWidget liveShowAnchorWidget) {
        this.LIZ = liveShowAnchorWidget;
    }

    @Override // X.U3V
    public final void LIZIZ(C28467BFf<EndShowResponse.ResponseData> response) {
        o.LJIIIZ(response, "response");
        this.LIZ.LLFZ();
    }
}
