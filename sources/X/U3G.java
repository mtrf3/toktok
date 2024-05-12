package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U3G implements U3P {
    public final /* synthetic */ LiveShowAnchorWidget LIZ;

    @Override // X.U3P
    public final void LIZIZ(C28467BFf<CreateShowResponse.ResponseData> response) {
        o.LJIIIZ(response, "response");
    }

    public U3G(LiveShowAnchorWidget liveShowAnchorWidget) {
        this.LIZ = liveShowAnchorWidget;
    }

    @Override // X.U3P
    public final void LIZ(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        BPP.LIZJ(this.LIZ.context, throwable);
    }
}
