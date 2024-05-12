package X;

import Y.AfS52S0300000_13;
import Y.AfS65S0100000_13;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Ucx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77603Ucx extends AbstractC77605Ucz {
    public CompletionBlock<InterfaceC77606Ud0> LJLJJL;
    public InterfaceC77604Ucy LJLJJLL;
    public long LJLJL;
    public Diamond LJLJLJ;
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C77654Udm.LJLIL);
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(C77656Udo.LJLIL);
    public final C77587Uch LJLLI = new C77587Uch(this);
    public final C77581Ucb LJLLILLLL = new C77581Ucb(this);

    public final void LJII(HashMap<String, String> hashMap) {
        boolean isFirstRecharge;
        String str;
        String str2;
        String str3;
        java.util.Map<String, Object> eventParams;
        String notificationType;
        Boolean firstRecharge;
        InterfaceC77604Ucy interfaceC77604Ucy = this.LJLJJLL;
        if (interfaceC77604Ucy != null && (firstRecharge = interfaceC77604Ucy.getFirstRecharge()) != null) {
            isFirstRecharge = firstRecharge.booleanValue();
        } else {
            isFirstRecharge = ((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge();
        }
        if (isFirstRecharge) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_first_recharge", str);
        InterfaceC77604Ucy interfaceC77604Ucy2 = this.LJLJJLL;
        String str4 = null;
        if (interfaceC77604Ucy2 != null) {
            str2 = interfaceC77604Ucy2.getRechargeReason();
        } else {
            str2 = null;
        }
        hashMap.put("charge_reason", String.valueOf(str2));
        InterfaceC77604Ucy interfaceC77604Ucy3 = this.LJLJJLL;
        if (interfaceC77604Ucy3 != null) {
            str3 = interfaceC77604Ucy3.getPanelType();
        } else {
            str3 = null;
        }
        hashMap.put("panel_type", String.valueOf(str3));
        InterfaceC77604Ucy interfaceC77604Ucy4 = this.LJLJJLL;
        if (interfaceC77604Ucy4 != null) {
            str4 = interfaceC77604Ucy4.getGiftEnterFrom();
        }
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        hashMap.put("gift_enter_from", C76828UDg.LIZ(str4));
        InterfaceC77604Ucy interfaceC77604Ucy5 = this.LJLJJLL;
        if (interfaceC77604Ucy5 != null && (notificationType = interfaceC77604Ucy5.getNotificationType()) != null) {
            str5 = notificationType;
        }
        hashMap.put("notification_type", str5);
        try {
            InterfaceC77604Ucy interfaceC77604Ucy6 = this.LJLJJLL;
            if (interfaceC77604Ucy6 != null && (eventParams = interfaceC77604Ucy6.getEventParams()) != null) {
                for (Map.Entry<String, Object> entry : eventParams.entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC77604Ucy interfaceC77604Ucy = (InterfaceC77604Ucy) xBaseParamModel;
        o.LJIIIZ(type, "type");
        this.LJLJJL = c37356ElM;
        this.LJLJJLL = interfaceC77604Ucy;
        List LJJIJ = C47261Igj.LJJIJ(interfaceC77604Ucy.getIapId());
        this.LJLJL = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        ((InterfaceC77674Ue6) this.LJLL.getValue()).LIZ(LJJIJ).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS52S0300000_13(c37356ElM, interfaceC77604Ucy, this, 1), new AfS65S0100000_13(this, 11));
    }

    public static void LJIIIIZZ(boolean z, long j, Boolean bool, String str) {
        String str2;
        HashMap hashMap = new HashMap();
        if (z) {
            str2 = "livesdk_wallet_update_info_aftPay_success";
        } else {
            str2 = "livesdk_wallet_update_info_aftPay_failed";
        }
        if (str == null) {
            str = "";
        }
        hashMap.put("error_msg", str);
        hashMap.put("duration", Long.valueOf(j));
        InterfaceC77746UfG walletMonitorService = ((IWalletService) CN1.LIZ(IWalletService.class)).getWalletMonitorService();
        o.LJIIIIZZ(walletMonitorService, "walletMonitorService");
        EnumC77742UfC enumC77742UfC = EnumC77742UfC.BOTH;
        C77744UfE.LIZ(walletMonitorService, enumC77742UfC, str2, C38393F4z.LIZLLL(hashMap), 56);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("charge_channel", C77608Ud2.LIZ());
        hashMap2.put("is_update", Integer.valueOf(o.LJ(bool, Boolean.TRUE) ? 1 : 0));
        C77744UfE.LIZ(walletMonitorService, enumC77742UfC, "livesdk_recharge_coins_balance_response", C38393F4z.LIZLLL(hashMap2), 56);
    }
}
