package X;

import android.content.Context;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.walletnew.BaseRechargeViewModel;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeAuditing;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.UcX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77577UcX extends C77579UcZ {
    public BaseRechargeViewModel LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77577UcX(Context context, C38049EwX jsBridge) {
        super(context, jsBridge);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(jsBridge, "jsBridge");
    }

    @Override // X.C77579UcZ, X.InterfaceC38012Evw
    public final void call(C38048EwW msg, JSONObject res) {
        Boolean bool;
        boolean z;
        EnumC77641UdZ cachePolicy;
        JSONObject optJSONObject;
        String str;
        JSONObject optJSONObject2;
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(res, "res");
        super.call(msg, res);
        msg.LJIIJ = false;
        HashMap hashMap = new HashMap();
        hashMap.put("methodName", "GetPurchaseItemListMethod");
        C0K2.LJII(0, "ttlive_wallet_H5_query", hashMap);
        JSONObject jSONObject = LIZ().LIZLLL;
        if (jSONObject != null && (optJSONObject2 = jSONObject.optJSONObject("args")) != null) {
            bool = Boolean.valueOf(optJSONObject2.optBoolean("disable_event_tracking"));
        } else {
            bool = null;
        }
        if (!o.LJ(bool, Boolean.TRUE)) {
            HashMap<String, String> eventParams = this.LJLJJL;
            o.LJIIIZ(eventParams, "eventParams");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("request_page", "my_profile");
            hashMap2.put("pay_method", C77608Ud2.LIZ());
            hashMap2.put("timestamp", String.valueOf(C30725C4b.LIZ()));
            String str2 = "portal";
            String str3 = "";
            if (!o.LJ(BJM.LJIIIIZZ(), "portal")) {
                str2 = "";
            }
            hashMap2.put("charge_reason", str2);
            if (!C38354F3m.LJ(BJM.LJII())) {
                String LJII = BJM.LJII();
                if (LJII != null) {
                    str3 = LJII;
                }
                hashMap2.put("enter_url_source", str3);
            }
            if (BJM.LJI() != 0) {
                hashMap2.put("enter_gift_id", String.valueOf(BJM.LJI()));
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_recharge_show");
            LIZ.LJIIZILJ();
            LIZ.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
            if (((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJIJJ(str, "is_first_recharge");
            LIZ.LJJIFFI(hashMap2);
            LIZ.LJJIFFI(eventParams);
            LIZ.LJJIIJZLJL();
        }
        JSONObject jSONObject2 = LIZ().LIZLLL;
        if (jSONObject2 != null && (optJSONObject = jSONObject2.optJSONObject("args")) != null) {
            z = optJSONObject.optBoolean("use_cache");
        } else {
            z = true;
        }
        if (this.LJLJJLL == null) {
            this.LJLJJLL = new BaseRechargeViewModel(this, 0L, 0L, 1);
        }
        if (z) {
            cachePolicy = EnumC77641UdZ.USE;
        } else {
            cachePolicy = EnumC77641UdZ.NON_USE;
        }
        BaseRechargeViewModel baseRechargeViewModel = this.LJLJJLL;
        if (baseRechargeViewModel != null) {
            o.LJIIIZ(cachePolicy, "cachePolicy");
            baseRechargeViewModel.lv0(null, cachePolicy, BaseRechargeViewModel.LJLLJ, true);
        }
    }

    @Override // X.InterfaceC77595Ucp
    public final void me(DiamondPackageExtra diamondPackageExtra, List<? extends Diamond> productList) {
        o.LJIIIZ(productList, "productList");
        if (productList.isEmpty()) {
            df(0, 0, new Exception("product list is empty"));
            return;
        }
        ArrayList arrayList = new ArrayList(productList.size());
        int size = productList.size();
        for (int i = 0; i < size; i++) {
            Diamond diamond = (Diamond) ListProtector.get(productList, i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", diamond.id);
                jSONObject.put("iapId", diamond.iapId);
                jSONObject.put("price", diamond.price);
                jSONObject.put("count", diamond.count);
                jSONObject.put("currency", diamond.LJLILLLLZI);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            arrayList.add(jSONObject);
        }
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, diamondPackageExtra);
        try {
            LIZIZ().put("code", 1);
            LIZIZ().put("status", 1);
            LIZIZ().put("args", arrayList);
            LIZIZ().put("extra_args", json);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        this.LJLILLLLZI.LIZLLL(LIZ().LIZIZ, LIZIZ());
        BaseRechargeViewModel baseRechargeViewModel = this.LJLJJLL;
        if (baseRechargeViewModel != null) {
            baseRechargeViewModel.onDestroy();
        }
        this.LJLJJLL = null;
    }

    @Override // X.InterfaceC77595Ucp
    public final void df(int i, int i2, Exception exception) {
        int i3;
        o.LJIIIZ(exception, "exception");
        try {
            LIZIZ().put("code", 1);
            JSONObject LIZIZ = LIZIZ();
            if (LiveWebRechargeAuditing.INSTANCE.getValue()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            LIZIZ.put("is_outside_channel", i3);
            LIZIZ().put("charge_error_code", i);
            LIZIZ().put("source", 1);
            LIZIZ().put("status", 0);
            LIZIZ().put("msg", exception.getMessage());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LJLILLLLZI.LIZLLL(LIZ().LIZIZ, LIZIZ());
        BaseRechargeViewModel baseRechargeViewModel = this.LJLJJLL;
        if (baseRechargeViewModel != null) {
            baseRechargeViewModel.onDestroy();
        }
        this.LJLJJLL = null;
    }
}
