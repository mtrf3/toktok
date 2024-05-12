package X;

import com.bytedance.android.live.rank.impl.setting.AnchorRankingSettingFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BBi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28366BBi extends AbstractViewOnClickListenerC28292B8m {
    public final /* synthetic */ AnchorRankingSettingFragment LJLJJL;

    @Override // X.AbstractViewOnClickListenerC28292B8m
    public final void LIZ() {
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this.LJLJJL);
        if (LJIILIIL != null) {
            BBP bbp = BBP.GUIDE;
            bbp.pre();
            LJIILIIL.rv0(BroadcastDialogPageChannel.class, bbp);
        }
    }

    public C28366BBi(AnchorRankingSettingFragment anchorRankingSettingFragment) {
        this.LJLJJL = anchorRankingSettingFragment;
    }
}
