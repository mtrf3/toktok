package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.gift.VipFeedbackSettings;

/* loaded from: classes6.dex */
public final class CHB implements C0K7 {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public CHB(Context context, String str) {
        this.LJLIL = context;
        this.LJLILLLLZI = str;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LJLIL, VipFeedbackSettings.INSTANCE.getGiftSchema());
        CHD.LIZ(this.LJLILLLLZI, "contact_us");
        CLG.LIZJ("contact_us", "gifting", null);
    }
}
