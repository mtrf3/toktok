package X;

import com.bytedance.android.live.rank.impl.setting.PreviewRankingSettingFragmentSheet;
import com.bytedance.android.livesdk.rank.api.GiftRankSwitchChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BJS implements BJT {
    public final /* synthetic */ PreviewRankingSettingFragmentSheet LIZ;
    public final /* synthetic */ BJW LIZIZ;

    @Override // X.BJT
    public final void onCancel() {
    }

    @Override // X.BJT
    public final void onFailed() {
    }

    @Override // X.BJT
    public final void LIZ() {
        ((C011602u) this.LIZ._$_findCachedViewById(R.id.duo)).toggle();
        this.LIZ.LLFII = this.LIZIZ.getValue();
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this.LIZ);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(GiftRankSwitchChannel.class, Integer.valueOf((int) this.LIZ.LLFII));
        }
    }

    public BJS(PreviewRankingSettingFragmentSheet previewRankingSettingFragmentSheet, BJW bjw) {
        this.LIZ = previewRankingSettingFragmentSheet;
        this.LIZIZ = bjw;
    }
}