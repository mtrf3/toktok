package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.gift.LiveUserRiskVerifySetting;
import com.bytedance.mt.protector.impl.UriProtector;

/* loaded from: classes6.dex */
public final class CLD implements C0K7 {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    public CLD(int i, Context context) {
        this.LJLIL = i;
        this.LJLILLLLZI = context;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        String str;
        liveDialog.dismiss();
        CLG.LIZ("verify", "live_recharge");
        if (this.LJLIL == 4005257) {
            str = LiveUserRiskVerifySetting.INSTANCE.getConfig().phoneVerifyUrl;
        } else {
            str = LiveUserRiskVerifySetting.INSTANCE.getConfig().emailVerifyUrl;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                C32364Cn2 c32364Cn2 = new C32364Cn2(str);
                c32364Cn2.LIZJ("enter_from", "recharge_live_room");
                ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LJLILLLLZI, UriProtector.parse(c32364Cn2.LIZLLL()));
            } catch (Exception e) {
                C0NB.LJII(e);
            }
        }
    }
}
