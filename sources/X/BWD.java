package X;

import android.view.View;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.interaction.InteractionFeaturesDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class BWD extends AbstractViewOnClickListenerC76629U5p {
    public final /* synthetic */ InteractionFeaturesDialog LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BWD(InteractionFeaturesDialog interactionFeaturesDialog) {
        super(0);
        this.LJLJJL = interactionFeaturesDialog;
    }

    @Override // X.AbstractViewOnClickListenerC76629U5p
    public final void LIZ(View view) {
        BEF bef;
        DataChannel dataChannel = this.LJLJJL.dataChannel;
        if (dataChannel != null && (bef = (BEF) dataChannel.kv0(LiveBanCapabilityChannel.class)) != null && bef.LJLJJI) {
            C30868C9o.LIZJ(R.string.o8j);
            return;
        }
        IBroadcastService iBroadcastService = (IBroadcastService) CN1.LIZ(IBroadcastService.class);
        InteractionFeaturesDialog interactionFeaturesDialog = this.LJLJJL;
        iBroadcastService.disableFunctionAccordingLevel(interactionFeaturesDialog.dataChannel, BWE.LJLIL, new AqS171S0100000_5(interactionFeaturesDialog, this, 27), BWF.LJLIL, this.LJLJJL.getString(R.string.kpw), Boolean.TRUE);
    }
}
