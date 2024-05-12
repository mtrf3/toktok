package X;

import android.content.Context;
import com.bytedance.android.live.wallet.viewmodel.exchange.AutoExchangeConfirmExchangeDialogVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UIR extends UHX {
    public final String LJII;
    public final AutoExchangeConfirmExchangeDialogVM LJIIIIZZ;

    @Override // X.UHX
    public final boolean LJI() {
        String LJIILJJIL;
        this.LJIIIIZZ.LJLJJI = C30725C4b.LIZ();
        String str = this.LJII;
        if (o.LJ(str, "live")) {
            String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.kbu);
            o.LJIIIIZZ(LJIILJJIL2, "getString(\n             …modal_title\n            )");
            if (UHX.LJFF()) {
                LJIILJJIL = C15380j0.LJIILJJIL(R.string.l2a);
            } else {
                LJIILJJIL = C15380j0.LJIILJJIL(R.string.kc1);
            }
            o.LJIIIIZZ(LJIILJJIL, "if (isPeriodicPayout()) …_gift_desc)\n            }");
            this.LJ = new UHY(LJIILJJIL2, LJIILJJIL, R.string.kbm, R.string.kc9, 0, false, false, 896);
            this.LIZLLL = true;
        } else if (o.LJ(str, "ug")) {
            String LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.kbu);
            o.LJIIIIZZ(LJIILJJIL3, "getString(\n             …modal_title\n            )");
            String LJIILJJIL4 = C15380j0.LJIILJJIL(R.string.kc8);
            o.LJIIIIZZ(LJIILJJIL4, "getString(R.string.pm_auto_exchange_reward_desc)");
            this.LJ = new UHY(LJIILJJIL3, LJIILJJIL4, R.string.kbm, R.string.kc9, 0, false, false, 896);
            this.LIZLLL = true;
        }
        LIZIZ();
        return true;
    }

    @Override // X.UHX
    public final /* bridge */ /* synthetic */ ExchangeDialogVM LIZJ() {
        return this.LJIIIIZZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIR(Context context, InterfaceC77468Uam interfaceC77468Uam, C77453UaX liveExchangeParam, String callFrom) {
        super(context, liveExchangeParam);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(liveExchangeParam, "liveExchangeParam");
        o.LJIIIZ(callFrom, "callFrom");
        this.LJII = callFrom;
        this.LJIIIIZZ = new AutoExchangeConfirmExchangeDialogVM(liveExchangeParam, interfaceC77468Uam, callFrom);
    }
}
