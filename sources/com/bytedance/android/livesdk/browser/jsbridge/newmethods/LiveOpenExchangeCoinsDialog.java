package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38123Exj;
import X.BZI;
import X.C15380j0;
import X.C16880lQ;
import X.C259710f;
import X.C28787BRn;
import X.C30725C4b;
import X.C38131Exr;
import X.C77437UaH;
import X.C77443UaN;
import X.C77444UaO;
import X.C87277YNd;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.UHY;
import X.X1D;
import Y.IDCListenerS164S0100000_13;
import Y.IDCListenerS209S0100000_13;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class LiveOpenExchangeCoinsDialog extends AbstractC38123Exj<ExchangeParams, Object> {
    public String exchangeEntrance = "";

    @Override // X.AbstractC38123Exj
    public void onTerminate() {
    }

    private int textId(ExchangeParams exchangeParams) {
        int i = exchangeParams.way;
        if (i == 0) {
            return R.string.l41;
        }
        if (i == 1) {
            RevenueExchange revenueExchange = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL.revenue;
            boolean z = exchangeParams.isPeriodicPayout;
            if (revenueExchange != null && revenueExchange.isRevenue()) {
                if (z) {
                    return R.string.l1j;
                }
                return R.string.l3p;
            }
            if (z) {
                return R.string.l29;
            }
            return R.string.l3o;
        }
        return R.string.kpj;
    }

    public String chargeReason(ExchangeParams exchangeParams) {
        int i = exchangeParams.way;
        if (i == 0) {
            return "ug_exchange";
        }
        if (i == 1) {
            return "anchor_income";
        }
        return "refund_credit";
    }

    public void finishResult(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 1);
            jSONObject.put("complete", i);
        } catch (JSONException unused) {
            finishWithFailure();
        }
        finishWithResult(jSONObject);
    }

    public String requestPage(ExchangeParams exchangeParams) {
        int i = exchangeParams.source;
        if (i == 0) {
            return "live_detail";
        }
        if (i == 9) {
            return "my_profile";
        }
        return "";
    }

    public void goExchangeToCoins(Context context, ExchangeParams exchangeParams) {
        Long valueOf = Long.valueOf(C30725C4b.LIZ());
        ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJI(exchangeParams, new C77444UaO(this, exchangeParams, valueOf, context));
    }

    @Override // X.AbstractC38123Exj
    public void invoke(ExchangeParams exchangeParams, C38131Exr c38131Exr) {
        String LIZIZ;
        boolean z;
        this.exchangeEntrance = ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJII(exchangeParams.source);
        if (InterfaceC30442Bx8.LLLIIII.LIZJ().booleanValue()) {
            String str = exchangeParams.formattedShowAmount;
            if (str != null && !str.isEmpty() && exchangeParams.way == 0) {
                LIZIZ = exchangeParams.formattedShowAmount;
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(exchangeParams.symbol);
                LIZ.append(exchangeParams.amount);
                LIZIZ = X1D.LIZIZ(LIZ);
            }
            IWalletExchange walletExchange = ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange();
            Context context = c38131Exr.LIZ;
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.l42);
            String LJIILL = C15380j0.LJIILL(textId(exchangeParams), LIZIZ);
            if (exchangeParams.way == 0) {
                z = true;
            } else {
                z = false;
            }
            UHY uhy = new UHY(LJIILJJIL, LJIILL, R.string.l3z, R.string.l3y, R.string.l40, z, false, null, Boolean.valueOf(exchangeParams.ignoreSuppress), false);
            C77443UaN c77443UaN = new C77443UaN(this, exchangeParams, c38131Exr);
            walletExchange.getClass();
            if (context != null) {
                C77437UaH c77437UaH = new C77437UaH(context);
                c77437UaH.LJIIIIZZ = R.drawable.csn;
                c77437UaH.LJJII = false;
                c77437UaH.LIZJ = uhy.LIZ;
                c77437UaH.LJ(uhy.LIZLLL, new IDCListenerS164S0100000_13(c77443UaN, 9), false);
                c77437UaH.LIZJ(uhy.LIZJ, new IDCListenerS164S0100000_13(c77443UaN, 10), false);
                View view = uhy.LJII;
                if (view != null) {
                    c77437UaH.LJIJI = view;
                } else if (uhy.LJFF) {
                    View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cuh, C16880lQ.LLZIL(new ContextThemeWrapper(context, C259710f.LIZ.LJFF(context))), null);
                    View findViewById = LLLZIIL.findViewById(R.id.b_d);
                    o.LJIIIIZZ(findViewById, "view.findViewById(R.id.check_box)");
                    CompoundButton compoundButton = (CompoundButton) findViewById;
                    TextView textView = (TextView) LLLZIIL.findViewById(R.id.d0z);
                    textView.setText(uhy.LIZIZ);
                    C87277YNd.LJJIJ(textView);
                    compoundButton.setText(uhy.LJ);
                    compoundButton.setOnCheckedChangeListener(new IDCListenerS209S0100000_13(c77443UaN, 8));
                    c77437UaH.LJIJI = LLLZIIL;
                } else {
                    c77437UaH.LJI = uhy.LIZIZ;
                }
                if (o.LJ(uhy.LJIIIIZZ, Boolean.TRUE)) {
                    c77437UaH.LIZIZ = true;
                } else {
                    c77437UaH.LIZIZ = false;
                }
                WalletExchange.LJ(c77437UaH.LIZ());
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_exchange_second_confirm_popup");
            LIZ2.LJIJJ(this.exchangeEntrance, "exchange_entrance");
            LIZ2.LJIJJ(chargeReason(exchangeParams), "charge_reason");
            LIZ2.LJJIFFI(exchangeParams.eventParams);
            LIZ2.LJJIIJZLJL();
            return;
        }
        goExchangeToCoins(c38131Exr.LIZ, exchangeParams);
    }

    public void finishResultWithOrderId(int i, String str, Boolean bool) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 1);
            jSONObject.put("complete", i);
            jSONObject.put("order_id", str);
            jSONObject.put("is_show_success_page", bool);
        } catch (JSONException unused) {
            finishWithFailure();
        }
        finishWithResult(jSONObject);
    }
}
