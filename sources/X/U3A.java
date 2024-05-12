package X;

import Y.AfS29S0110000_13;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.anchor.LiveShowAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowConfig;

/* loaded from: classes14.dex */
public final class U3A implements U3Z {
    public final /* synthetic */ LiveShowAnchorWidget LIZ;

    @Override // X.U3Z
    public final void LIZ() {
        this.LIZ.LLII();
    }

    public U3A(LiveShowAnchorWidget liveShowAnchorWidget) {
        this.LIZ = liveShowAnchorWidget;
    }

    @Override // X.U3Z
    public final void LIZIZ(ShowConfig showConfig) {
        ShowConfig value;
        BaseLiveShowViewModel baseLiveShowViewModel = this.LIZ.LJLILLLLZI;
        if (baseLiveShowViewModel != null) {
            ShowConfig value2 = baseLiveShowViewModel.LJLJJI.getValue();
            if (value2 != null && value2.allowOpenMicFreely == showConfig.allowOpenMicFreely && (value = baseLiveShowViewModel.LJLJJI.getValue()) != null && value.durationPerGuest == showConfig.durationPerGuest) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("storeLiveShowConfig: allowOpenMicFreely: ");
            LIZ.append(showConfig.allowOpenMicFreely);
            LIZ.append(", durationPerGuest: ");
            LIZ.append(showConfig.durationPerGuest);
            C0NB.LIZIZ("LiveShowAnchorViewModel", X1D.LIZIZ(LIZ));
            baseLiveShowViewModel.LJLJJI.setValue(showConfig);
        }
    }

    @Override // X.U3Z
    public final void LIZJ(boolean z) {
        AbstractC73638SvC<C28467BFf<UpdateShowContentResponse.ResponseData>> updateShowContent;
        LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) this.LIZ.LJLILLLLZI;
        if (liveShowAnchorViewModel != null) {
            UpdateShowContentParams updateShowContentParams = new UpdateShowContentParams();
            updateShowContentParams.roomId = liveShowAnchorViewModel.LJLJL;
            updateShowContentParams.channelId = liveShowAnchorViewModel.LJJLI();
            updateShowContentParams.allowOpenMicFreely = z;
            updateShowContentParams.showId = BaseLiveShowViewModel.ov0();
            updateShowContentParams.updateType = 1;
            U35 LIZ = TQA.LIZ();
            if (LIZ != null && (updateShowContent = LIZ.updateShowContent(updateShowContentParams)) != null) {
                InterfaceC92693kP LJJII = T28.LIZLLL(updateShowContent).LJJII(new AfS29S0110000_13(liveShowAnchorViewModel, z, 8), U3N.LJLIL);
                C73318Sq2 cb = liveShowAnchorViewModel.nv0();
                o.LJIIIZ(cb, "cb");
                cb.LIZ(LJJII);
            }
        }
    }
}
