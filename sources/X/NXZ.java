package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.commercialize.assem.AdLightWebPageAssem;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import kotlin.jvm.internal.AqS15S0010000_10;

/* loaded from: classes11.dex */
public final class NXZ implements NVJ {
    public final /* synthetic */ AdLightWebPageAssem LIZ;

    @Override // X.NVJ
    public final void LIZ() {
        ((VideoPlayViewModel) this.LIZ.LLFFF.getValue()).hv0();
    }

    @Override // X.NVJ
    public final void onHide() {
        NVB nvb = this.LIZ.LJZL;
        if (nvb != null) {
            nvb.LJ();
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LIZ.LLFII.getValue();
        assemViewModel.getClass();
        assemViewModel.setState(new AqS15S0010000_10(false, 5));
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJIIJJI(false);
        }
    }

    @Override // X.NVJ
    public final void onShow() {
        AssemViewModel assemViewModel = (AssemViewModel) this.LIZ.LLFII.getValue();
        assemViewModel.getClass();
        assemViewModel.setState(new AqS15S0010000_10(true, 5));
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJIIJJI(true);
        }
    }

    public NXZ(AdLightWebPageAssem adLightWebPageAssem) {
        this.LIZ = adLightWebPageAssem;
    }
}
