package X;

import com.bytedance.android.live.rank.impl.setting.PreviewRankingSettingFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class BEE extends AbstractViewOnClickListenerC28292B8m {
    public final /* synthetic */ PreviewRankingSettingFragment LJLJJL;

    @Override // X.AbstractViewOnClickListenerC28292B8m
    public final void LIZ() {
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this.LJLJJL);
        if (LJIILIIL != null) {
            BBP bbp = BBP.GUIDE;
            bbp.pre();
            LJIILIIL.rv0(BroadcastDialogPageChannel.class, bbp);
        }
    }

    public BEE(PreviewRankingSettingFragment previewRankingSettingFragment) {
        this.LJLJJL = previewRankingSettingFragment;
    }
}
