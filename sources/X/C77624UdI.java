package X;

import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletUserEnvLog;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.UdI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77624UdI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJ(HashMap hashMap) {
        C77739Uf9 c77739Uf9 = C77739Uf9.LIZ;
        EnumC77742UfC enumC77742UfC = EnumC77742UfC.BOTH;
        C77744UfE.LIZ(c77739Uf9, enumC77742UfC, "livesdk_wallet_recharge_success", C38393F4z.LIZLLL(hashMap), 56);
        if (LiveWalletUserEnvLog.INSTANCE.getValue()) {
            C77744UfE.LIZ(c77739Uf9, enumC77742UfC, "livesdk_iap_google_env_investigate", C66649QDt.LIZ(0, 0, ""), 56);
        }
    }

    public static void LIZ(int i, String str, HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        hashMap2.put("detail_code", Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        hashMap2.put("error_msg", str);
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        C77744UfE.LIZ(C77739Uf9.LIZ, EnumC77742UfC.BOTH, "livesdk_iap_create_order_fail", C38393F4z.LIZLLL(hashMap2), 56);
    }

    public static void LIZIZ(int i, int i2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", Integer.valueOf(i));
        hashMap.put("detail_code", Integer.valueOf(i2));
        hashMap.put("error_msg", str);
        C77739Uf9 c77739Uf9 = C77739Uf9.LIZ;
        EnumC77742UfC enumC77742UfC = EnumC77742UfC.BOTH;
        C77744UfE.LIZ(c77739Uf9, enumC77742UfC, "livesdk_wallet_recharge_query_one_time_product_failed", C38393F4z.LIZLLL(hashMap), 56);
        if (LiveWalletUserEnvLog.INSTANCE.getValue()) {
            C77744UfE.LIZ(c77739Uf9, enumC77742UfC, "livesdk_iap_google_env_investigate", C66649QDt.LIZ(i, i2, str), 56);
        }
    }

    public static void LIZJ(int i, int i2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", Integer.valueOf(i));
        hashMap.put("detail_code", Integer.valueOf(i2));
        hashMap.put("error_msg", str);
        C77739Uf9 c77739Uf9 = C77739Uf9.LIZ;
        EnumC77742UfC enumC77742UfC = EnumC77742UfC.BOTH;
        C77744UfE.LIZ(c77739Uf9, enumC77742UfC, "livesdk_wallet_recharge_query_subscription_product_failed", C38393F4z.LIZLLL(hashMap), 56);
        if (LiveWalletUserEnvLog.INSTANCE.getValue()) {
            C77744UfE.LIZ(c77739Uf9, enumC77742UfC, "livesdk_iap_google_env_investigate", C66649QDt.LIZ(i, i2, str), 56);
        }
    }

    public static void LJFF(int i, int i2, String str, HashMap hashMap) {
        hashMap.put("error_code", Integer.valueOf(i));
        hashMap.put("detail_code", Integer.valueOf(i2));
        hashMap.put("error_msg", str);
        C77744UfE.LIZ(C77739Uf9.LIZ, EnumC77742UfC.BOTH, "livesdk_iap_finish_order_repeat_failed", C38393F4z.LIZLLL(hashMap), 56);
    }

    public static void LJII(boolean z, long j, Boolean bool, String str) {
        String str2;
        HashMap hashMap = new HashMap();
        if (z) {
            str2 = "livesdk_wallet_update_info_aftPay_success";
        } else {
            if (str == null) {
                str = "";
            }
            hashMap.put("error_msg", str);
            str2 = "livesdk_wallet_update_info_aftPay_failed";
        }
        hashMap.put("duration", Long.valueOf(j));
        C77739Uf9 c77739Uf9 = C77739Uf9.LIZ;
        EnumC77742UfC enumC77742UfC = EnumC77742UfC.BOTH;
        C77744UfE.LIZ(c77739Uf9, enumC77742UfC, str2, C38393F4z.LIZLLL(hashMap), 56);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("charge_channel", C77608Ud2.LIZ());
        hashMap2.put("is_update", Integer.valueOf(o.LJ(bool, Boolean.TRUE) ? 1 : 0));
        C77744UfE.LIZ(c77739Uf9, enumC77742UfC, "livesdk_recharge_coins_balance_response", C38393F4z.LIZLLL(hashMap2), 56);
    }

    public static void LIZLLL(int i, int i2, String str, HashMap hashMap, int i3) {
        hashMap.put("error_code", Integer.valueOf(i));
        hashMap.put("detail_code", Integer.valueOf(i2));
        hashMap.put("error_msg", str);
        hashMap.put("stage", Integer.valueOf(i3));
        C77739Uf9 c77739Uf9 = C77739Uf9.LIZ;
        EnumC77742UfC enumC77742UfC = EnumC77742UfC.BOTH;
        C77744UfE.LIZ(c77739Uf9, enumC77742UfC, "livesdk_wallet_recharge_failed", C38393F4z.LIZLLL(hashMap), 56);
        if (LiveWalletUserEnvLog.INSTANCE.getValue()) {
            C77744UfE.LIZ(c77739Uf9, enumC77742UfC, "livesdk_iap_google_env_investigate", C66649QDt.LIZ(i, i2, str), 56);
        }
    }

    public static void LJI(long j, String productId, boolean z, String orderId, String str) {
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(orderId, "orderId");
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put("productId", productId);
        hashMap.put("orderId", orderId);
        if (str == null) {
            str = "";
        }
        hashMap.put("error_msg", str);
        hashMap.put("is_subscription", Boolean.valueOf(z));
        C77744UfE.LIZ(C77739Uf9.LIZ, EnumC77742UfC.BOTH, "livesdk_wallet_check_order_failed", C38393F4z.LIZLLL(hashMap), 56);
    }
}
