package X;

import android.view.View;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.livesdk.adminsetting.LiveCommercialContentToggleFragmentSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class BC3 implements View.OnClickListener {
    public final /* synthetic */ BasePreviewSettingMainFragmentSheet LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public BC3(BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet, boolean z, boolean z2) {
        this.LJLIL = basePreviewSettingMainFragmentSheet;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LiveMode liveMode;
        IAdminSettingService iAdminSettingService = (IAdminSettingService) CN1.LIZ(IAdminSettingService.class);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this.LJLIL);
        if (LJIILIIL != null) {
            liveMode = (LiveMode) LJIILIIL.kv0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        LiveCommercialContentToggleFragmentSheet e80 = iAdminSettingService.e80(liveMode, this.LJLILLLLZI, this.LJLJI, true);
        if (e80 != null) {
            this.LJLIL.LJLZ.LJIIIZ(e80, "live_commercial_content_toggle");
        }
    }
}
