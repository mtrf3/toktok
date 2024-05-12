package X;

import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.UaZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77455UaZ extends AbstractC77457Uab {
    public static final /* synthetic */ int LJLJJLL = 0;
    public String LJLJJL = "";

    public static final String LJII(ExchangeParams exchangeParams) {
        int i = exchangeParams.way;
        if (i == 0) {
            return "ug_exchange";
        }
        if (i == 1) {
            return "anchor_income";
        }
        return "refund_credit";
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        InterfaceC77456Uaa interfaceC77456Uaa = (InterfaceC77456Uaa) xBaseParamModel;
        o.LJIIIZ(type, "type");
        this.LJLJJL = ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJII(interfaceC77456Uaa.getSource().intValue());
        ExchangeParams exchangeParams = new ExchangeParams();
        exchangeParams.diamondId = interfaceC77456Uaa.getDiamondId().intValue();
        exchangeParams.symbol = interfaceC77456Uaa.getSymbol();
        exchangeParams.currency = interfaceC77456Uaa.getCurrencyCode();
        exchangeParams.way = interfaceC77456Uaa.getWay().intValue();
        exchangeParams.source = interfaceC77456Uaa.getSource().intValue();
        exchangeParams.coinsCount = interfaceC77456Uaa.getCoinsCount().longValue();
        exchangeParams.localAmount = interfaceC77456Uaa.getLocalAmount().longValue();
        exchangeParams.currencyDot = interfaceC77456Uaa.getCurrencyDot().longValue();
        exchangeParams.amount = interfaceC77456Uaa.getShowAmount();
        exchangeParams.exchangeLevel = interfaceC77456Uaa.getExchangeLevel();
        exchangeParams.isFirstRecharge = interfaceC77456Uaa.isFirstRecharge();
        String penaltyWarningSkip = interfaceC77456Uaa.getPenaltyWarningSkip();
        if (penaltyWarningSkip == null) {
            penaltyWarningSkip = "";
        }
        exchangeParams.penaltyWarningSkip = penaltyWarningSkip;
        java.util.Map<String, Object> eventParams = interfaceC77456Uaa.getEventParams();
        if (eventParams != null) {
            exchangeParams.eventParams = new HashMap<>();
            for (Map.Entry<String, Object> entry : eventParams.entrySet()) {
                HashMap<String, String> eventParams2 = exchangeParams.eventParams;
                o.LJIIIIZZ(eventParams2, "eventParams");
                eventParams2.put(entry.getKey(), entry.getValue().toString());
            }
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            context = interfaceC38263Ezz.getContext();
        } else {
            context = null;
        }
        LJIIIIZZ(context, exchangeParams, c37356ElM);
    }

    public final void LJIIIIZZ(Context context, ExchangeParams exchangeParams, CompletionBlock<InterfaceC77461Uaf> completionBlock) {
        long LIZ = C30725C4b.LIZ();
        ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJI(exchangeParams, new C77447UaR(exchangeParams, this, LIZ, completionBlock, context));
    }
}
