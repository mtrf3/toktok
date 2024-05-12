package X;

import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.gift.LiveUserRiskVerifySetting;
import com.bytedance.mt.protector.impl.UriProtector;

/* loaded from: classes6.dex */
public final class CLC implements C0K7 {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ CLB LJLILLLLZI;

    public CLC(boolean z, CLB clb) {
        this.LJLIL = z;
        this.LJLILLLLZI = clb;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        String str;
        liveDialog.dismiss();
        if (this.LJLIL) {
            str = LiveUserRiskVerifySetting.INSTANCE.getConfig().emailVerifyUrl;
        } else {
            str = LiveUserRiskVerifySetting.INSTANCE.getConfig().phoneVerifyUrl;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                C32364Cn2 c32364Cn2 = new C32364Cn2(str);
                c32364Cn2.LIZJ("enter_from", "gift_send");
                ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LJLILLLLZI.LIZ, UriProtector.parse(c32364Cn2.LIZLLL()));
            } catch (Exception e) {
                C0NB.LJII(e);
            }
        }
        CLG.LIZ("verify", "live_gift");
    }
}
