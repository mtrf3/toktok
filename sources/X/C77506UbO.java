package X;

import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UbO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77506UbO extends AbstractC77509UbR {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        int i;
        boolean z;
        String str;
        Context context;
        String LJIILJJIL;
        InterfaceC77508UbQ interfaceC77508UbQ = (InterfaceC77508UbQ) xBaseParamModel;
        o.LJIIIZ(type, "type");
        if (interfaceC77508UbQ.getTrackParams().get("exchangeType") instanceof Integer) {
            Object obj = interfaceC77508UbQ.getTrackParams().get("exchangeType");
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
            i = ((Integer) obj).intValue();
        } else {
            i = 0;
        }
        String valueOf = String.valueOf(interfaceC77508UbQ.getTrackParams().get("source"));
        if (interfaceC77508UbQ.getTrackParams().get("isAutoExchange") instanceof Boolean) {
            Object obj2 = interfaceC77508UbQ.getTrackParams().get("isAutoExchange");
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            z = ((Boolean) obj2).booleanValue();
        } else {
            z = false;
        }
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                str = "anchor_income";
            }
        } else {
            str = "ug_exchange";
        }
        if (interfaceC77508UbQ.getTrackParams().get("coins") instanceof Integer) {
            Object obj3 = interfaceC77508UbQ.getTrackParams().get("coins");
            o.LJII(obj3, "null cannot be cast to non-null type kotlin.Int");
            ((Integer) obj3).intValue();
        }
        int intValue = interfaceC77508UbQ.getErrorCode().intValue();
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (context = interfaceC38263Ezz.getContext()) != null) {
            if (interfaceC77508UbQ.getSuccess()) {
                if (o.LJ(valueOf, "redpacket_new")) {
                    LJIILJJIL = C15380j0.LJIILJJIL(R.string.l5w);
                } else if (o.LJ(valueOf, "portal")) {
                    LJIILJJIL = C15380j0.LJIILJJIL(R.string.l5v);
                } else {
                    LJIILJJIL = C15380j0.LJIILJJIL(R.string.l5u);
                }
                String LJIILL = C15380j0.LJIILL(R.string.l62, LJIILJJIL);
                o.LJIIIIZZ(LJIILL, "getString(R.string.pm_ex…ucceed_new, sourceString)");
                C30868C9o.LJI(LJIILL);
                ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIJJLI(context, null, i, 0L, valueOf);
                ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJIIJ();
            } else if (interfaceC77508UbQ.getCustomError().containsKey("custom_error")) {
                CustomErrorExtra customErrorExtra = CustomErrorExtra.getCustomErrorExtra(interfaceC77508UbQ.getCustomError());
                if (customErrorExtra != null) {
                    ((IWalletService) CN1.LIZ(IWalletService.class)).walletException().getClass();
                    UI8 ui8 = new UI8();
                    C29401Dk c29401Dk = new C29401Dk(intValue);
                    ui8.LIZIZ = intValue;
                    ui8.LJIILIIL = false;
                    ui8.LIZLLL = c29401Dk;
                    C77513UbV.LIZJ(context, customErrorExtra, null, null, null, ui8);
                }
                BZI LIZIZ = C0JU.LIZIZ("livesdk_balance_exchange_failed", "exchange", "error_from", str, "enter_from");
                LIZIZ.LJIJJ(valueOf, "gift_enter_from");
                LIZIZ.LJIJJ(Boolean.valueOf(z), "is_auto");
                LIZIZ.LJIJJ("gift", "error_from");
                LIZIZ.LJJIIJZLJL();
            } else if (UII.LIZ(intValue)) {
                C29401Dk c29401Dk2 = new C29401Dk(intValue);
                ((IWalletService) CN1.LIZ(IWalletService.class)).walletException().getClass();
                C76950UHy.LJFF(context, c29401Dk2, null, null, 0, 1002, false);
            } else if (intValue == 4006056 || intValue == 4006057 || intValue == 4006058) {
                C30868C9o.LIZJ(R.string.l44);
            }
        }
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC77527Ubj.class, null), "");
    }
}
