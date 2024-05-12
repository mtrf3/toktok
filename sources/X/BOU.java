package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.bytedance.android.livesdk.drawerfeed.LiveNonPersonalizedDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class BOU implements View.OnLongClickListener {
    public final /* synthetic */ LiveDrawerDialogV3 LJLIL;

    public BOU(LiveDrawerDialogV3 liveDrawerDialogV3) {
        this.LJLIL = liveDrawerDialogV3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        FragmentManager fragmentManager;
        BOT.LIZ = "click_subfeed_icon";
        BOT.LIZIZ = "subfeed";
        DataChannel dataChannel = this.LJLIL.LJLJJLL;
        BZI LIZ = C28787BRn.LIZ("livesdk_manage_feeds_click");
        LIZ.LJIJJ(BOT.LIZ, "source");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJJIIJZLJL();
        DataChannel dataChannel2 = this.LJLIL.LJLJJLL;
        if (dataChannel2 != null && (fragmentManager = (FragmentManager) dataChannel2.kv0(C29494Bhq.class)) != null) {
            LiveNonPersonalizedDialog liveNonPersonalizedDialog = new LiveNonPersonalizedDialog();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_in_sheet", false);
            liveNonPersonalizedDialog.setArguments(bundle);
            liveNonPersonalizedDialog.show(fragmentManager, "LiveNonPersonalizedDialog");
            return true;
        }
        return true;
    }
}
