package X;

import Y.AfS0S0400100_13;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Udt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77661Udt extends AbstractC77662Udu {
    public static void LJII(CompletionBlock completionBlock, Throwable th, HashMap hashMap) {
        hashMap.put("error_msg", th.toString());
        InterfaceC77746UfG walletMonitorService = ((IWalletService) CN1.LIZ(IWalletService.class)).getWalletMonitorService();
        o.LJIIIIZZ(walletMonitorService, "getService(IWalletServic…ava).walletMonitorService");
        C77744UfE.LIZ(walletMonitorService, EnumC77742UfC.BOTH, "livesdk_wallet_recharge_panel_load_package_fail", C38393F4z.LIZLLL(hashMap), 56);
        completionBlock.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC77663Udv.class, null), String.valueOf(th.getMessage()));
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        HashMap hashMap = new HashMap();
        hashMap.put("charge_source", "JSB_fetchProductDetails");
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC77660Uds rechargeService = ((IWalletService) CN1.LIZ(IWalletService.class)).getRechargeService();
        EnumC77641UdZ enumC77641UdZ = EnumC77641UdZ.USE;
        rechargeService.LIZLLL(2, 0L, 0L, null, enumC77641UdZ).LJII(new C62705OjF()).LJJJLIIL(new AfS0S0400100_13(hashMap, currentTimeMillis, enumC77641UdZ, this, c37356ElM, 0), new AfS0S0400100_13(hashMap, currentTimeMillis, enumC77641UdZ, this, c37356ElM, 1));
    }
}
