package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.walletnew.BaseRechargeViewModel;
import com.bytedance.android.live.walletnew.jsb.ChargeMethodNew;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.UcY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77578UcY implements InterfaceC77748UfI {
    public final /* synthetic */ ChargeMethodNew LIZ;

    public C77578UcY(ChargeMethodNew chargeMethodNew) {
        this.LIZ = chargeMethodNew;
    }

    @Override // X.InterfaceC77748UfI
    public final void LIZ(String str, HashMap hashMap) {
        int i;
        String str2;
        Diamond diamond;
        HashMap LIZ = C1R5.LIZ(str, "serviceName");
        if (hashMap != null) {
            ChargeMethodNew chargeMethodNew = this.LIZ;
            LIZ.putAll(hashMap);
            LIZ.putAll(chargeMethodNew.LJLJJL);
        }
        BaseRechargeViewModel baseRechargeViewModel = this.LIZ.LJLJJLL;
        if (baseRechargeViewModel != null && (diamond = baseRechargeViewModel.LJLJLLL) != null) {
            i = diamond.count;
        } else {
            i = 0;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("recharge_package", String.valueOf(i));
        hashMap2.put("pay_method", C77608Ud2.LIZ());
        hashMap2.put("request_page", "my_profile");
        String str3 = "portal";
        if (!o.LJ(BJM.LJIIIIZZ(), "portal")) {
            str3 = "";
        }
        hashMap2.put("charge_reason", str3);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_pay");
        LIZ2.LJIIZILJ();
        LIZ2.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        if (((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(str2, "is_first_recharge");
        LIZ2.LJJIFFI(hashMap2);
        LIZ2.LJJIFFI(LIZ);
        LIZ2.LJJIIJZLJL();
    }
}
