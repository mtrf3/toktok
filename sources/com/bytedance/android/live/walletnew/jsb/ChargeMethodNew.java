package com.bytedance.android.live.walletnew.jsb;

import X.BJM;
import X.BZI;
import X.C0K2;
import X.C16880lQ;
import X.C1EW;
import X.C276516r;
import X.C28787BRn;
import X.C28835BTj;
import X.C29401Dk;
import X.C30725C4b;
import X.C38048EwW;
import X.C38049EwX;
import X.C38354F3m;
import X.C45243HpH;
import X.C77578UcY;
import X.C77579UcZ;
import X.C77608Ud2;
import X.C77630UdO;
import X.CN1;
import X.EnumC77641UdZ;
import X.InterfaceC65349Pkn;
import X.Q7L;
import Y.AfS65S0100000_13;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletException;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.walletnew.BaseRechargeViewModel;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeAuditing;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.api.wallet.tiktok.QueryOrderResult;

/* loaded from: classes14.dex */
public final class ChargeMethodNew extends C77579UcZ {
    public BaseRechargeViewModel LJLJJLL;
    public final C77578UcY LJLJL;

    /* loaded from: classes14.dex */
    public static final class PayResponseSuccessArgs {

        @InterfaceC65349Pkn("code")
        public int code;

        @InterfaceC65349Pkn("kyc_incentive")
        public QueryOrderResult.KYCIncentive kycIncentive;
    }

    public final Diamond LIZLLL() {
        String str;
        List<? extends Diamond> list;
        JSONObject optJSONObject = LIZ().LIZLLL.optJSONObject("args");
        if (optJSONObject == null || (str = optJSONObject.optString("iap_id")) == null) {
            str = "";
        }
        BaseRechargeViewModel baseRechargeViewModel = this.LJLJJLL;
        if (baseRechargeViewModel == null || (list = baseRechargeViewModel.LJLJLJ) == null) {
            return null;
        }
        for (Diamond diamond : list) {
            if (C38354F3m.LIZJ(diamond.iapId, str)) {
                return diamond;
            }
        }
        return null;
    }

    public final List<String> LJ() {
        JSONArray optJSONArray;
        JSONObject optJSONObject = LIZ().LIZLLL.optJSONObject("args");
        if (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("voucher_token_list")) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString = optJSONArray.optString(i);
            o.LJIIIIZZ(optString, "vouchersFromFE.optString(i)");
            arrayList.add(optString);
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargeMethodNew(Context context, C38049EwX bridge) {
        super(context, bridge);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(bridge, "bridge");
        this.LJLJL = new C77578UcY(this);
    }

    public final void LIZJ(Diamond diamond, List<String> list) {
        Object obj;
        Activity activity;
        Object obj2;
        int i = diamond.count;
        HashMap<String, String> eventParams = this.LJLJJL;
        o.LJIIIZ(eventParams, "eventParams");
        HashMap hashMap = new HashMap();
        hashMap.put("recharge_package", String.valueOf(i));
        hashMap.put("request_page", "my_profile");
        hashMap.put("pay_method", C77608Ud2.LIZ());
        hashMap.put("timestamp", String.valueOf(C30725C4b.LIZ()));
        String str = "";
        if (!eventParams.containsKey("charge_reason")) {
            if (!o.LJ(BJM.LJIIIIZZ(), "portal")) {
                obj2 = "";
            } else {
                obj2 = "portal";
            }
            hashMap.put("charge_reason", obj2);
        }
        hashMap.put("portal_id", String.valueOf(BJM.LJIIL()));
        String str2 = "1";
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_portal_user", obj);
        BZI LIZ = C28787BRn.LIZ("livesdk_recharge_click");
        LIZ.LJIIZILJ();
        LIZ.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        if (!((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str2, "is_first_recharge");
        LIZ.LJIJJ("feature_available", "recharge_type");
        LIZ.LJJIFFI(hashMap);
        LIZ.LJJIFFI(eventParams);
        LIZ.LJJIIJZLJL();
        String str3 = this.LJLJJL.get("charge_reason");
        if (str3 == null) {
            str3 = "";
        }
        C77630UdO.LIZ("my_profile", str3, ((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge());
        BaseRechargeViewModel baseRechargeViewModel = this.LJLJJLL;
        if (baseRechargeViewModel != null) {
            Context context = this.LJLIL;
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
            String str4 = this.LJLJJL.get("charge_reason");
            if (str4 != null) {
                str = str4;
            }
            baseRechargeViewModel.gv0(activity, diamond, 1, list, str, "my_profile");
        }
    }

    @Override // X.C77579UcZ, X.InterfaceC38012Evw
    public final void call(C38048EwW msg, JSONObject res) {
        String optString;
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(res, "res");
        super.call(msg, res);
        LIZ().LJIIJ = false;
        JSONObject optJSONObject = LIZ().LIZLLL.optJSONObject("args");
        String str = null;
        if (optJSONObject != null) {
            str = optJSONObject.optString("iap_id");
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (optJSONObject != null && (optString = optJSONObject.optString("diamond_id")) != null) {
            str2 = optString;
        }
        HashMap LIZ = C45243HpH.LIZ("iabId", str, "diamondId", str2);
        LIZ.put("methodName", "ChargeMethod");
        C0K2.LJII(0, "ttlive_wallet_H5_query", LIZ);
        if (this.LJLJJLL == null) {
            BaseRechargeViewModel baseRechargeViewModel = new BaseRechargeViewModel(this, 0L, 0L, 1);
            this.LJLJJLL = baseRechargeViewModel;
            baseRechargeViewModel.LJLJJLL = this.LJLJL;
        }
        Diamond LIZLLL = LIZLLL();
        if (LIZLLL == null) {
            BaseRechargeViewModel baseRechargeViewModel2 = this.LJLJJLL;
            if (baseRechargeViewModel2 != null) {
                baseRechargeViewModel2.lv0(null, EnumC77641UdZ.USE, BaseRechargeViewModel.LJLLJ, true);
                return;
            }
            return;
        }
        LIZJ(LIZLLL, LJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e3  */
    @Override // X.C77579UcZ, X.InterfaceC77595Ucp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j7(com.bytedance.android.livesdk.wallet.Diamond r13, X.C77612Ud6 r14) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.jsb.ChargeMethodNew.j7(com.bytedance.android.livesdk.wallet.Diamond, X.Ud6):void");
    }

    @Override // X.InterfaceC77595Ucp
    public final void me(DiamondPackageExtra diamondPackageExtra, List<? extends Diamond> productList) {
        o.LJIIIZ(productList, "productList");
        Diamond LIZLLL = LIZLLL();
        if (LIZLLL == null) {
            LJFF(1, 0, new Exception("diamond isn null"), null);
        } else {
            LIZJ(LIZLLL, LJ());
        }
    }

    @Override // X.InterfaceC77595Ucp
    public final void df(int i, int i2, Exception exception) {
        o.LJIIIZ(exception, "exception");
        LJFF(1, i, exception, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // X.C77579UcZ, X.InterfaceC77595Ucp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B4(int r7, int r8, int r9, X.C77518Uba r10) {
        /*
            r6 = this;
            java.lang.Exception r4 = r10.LIZ
            if (r4 != 0) goto Lb
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r0 = "unknown exception"
            r4.<init>(r0)
        Lb:
            X.Udf r1 = X.C77607Ud1.LIZLLL()
            java.lang.String r0 = r10.LIZIZ
            X.Udj r0 = r1.LIZLLL(r0)
            r5 = 0
            if (r0 == 0) goto L58
            com.bytedance.android.live.network.response.BaseResponse<com.bytedance.android.live.wallet.model.DiamondBuyResult, com.bytedance.android.live.wallet.data.recharge.CreateOrderExtra> r1 = r0.LIZIZ
            if (r1 == 0) goto L59
            R extends com.bytedance.android.livesdk.model.Extra r0 = r1.extra
            com.bytedance.android.live.wallet.data.recharge.CreateOrderExtra r0 = (com.bytedance.android.live.wallet.data.recharge.CreateOrderExtra) r0
            if (r0 == 0) goto L59
            com.bytedance.android.live.wallet.data.recharge.IapFailExtra r3 = r0.iapFailExtra
        L24:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            if (r3 == 0) goto L54
            if (r1 == 0) goto L39
            R extends com.bytedance.android.livesdk.model.Extra r0 = r1.extra
            com.bytedance.android.live.wallet.data.recharge.CreateOrderExtra r0 = (com.bytedance.android.live.wallet.data.recharge.CreateOrderExtra) r0
            if (r0 == 0) goto L39
            boolean r0 = r0.isWebappRechargeRedirectEnabled
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
        L39:
            boolean r0 = X.C29306Beo.LJJIFFI(r5)
            if (r0 == 0) goto L54
            java.lang.String r1 = "is_webapp_recharge_redirect_enabled"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.put(r1, r0)
            java.lang.String r1 = "msg"
            java.lang.String r0 = r3.toastMessage
            r2.put(r1, r0)
            java.lang.String r1 = "webapp_schema"
            java.lang.String r0 = r3.webappSchema
            r2.put(r1, r0)
        L54:
            r6.LJFF(r7, r8, r4, r2)
            return
        L58:
            r1 = r5
        L59:
            r3 = r5
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.jsb.ChargeMethodNew.B4(int, int, int, X.Uba):void");
    }

    public final void LJFF(int i, int i2, Exception exc, Map map) {
        int i3;
        try {
            JSONObject LIZIZ = LIZIZ();
            if (LiveWebRechargeAuditing.INSTANCE.getValue()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            LIZIZ.put("is_outside_channel", i3);
            LIZIZ().put("code", -1);
            LIZIZ().put("charge_error_code", i2);
            LIZIZ().put("msg", "");
            if (i2 != 31) {
                LIZIZ().put("source", i);
            } else {
                LIZIZ().put("source", 1);
            }
            if (!(exc instanceof C29401Dk) || i2 != 31) {
                if (i == 3 && i2 == 41) {
                    LIZIZ().put("charge_error_code", 1);
                }
            } else {
                LIZIZ().put("msg", ((C29401Dk) exc).getPrompt());
                LIZIZ().put("charge_error_code", ((C276516r) exc).getErrorCode());
            }
            if (exc instanceof C29401Dk) {
                CustomErrorExtra customErrorExtra = CustomErrorExtra.getCustomErrorExtra(exc);
                if (!((WalletException) ((IWalletService) CN1.LIZ(IWalletService.class)).walletException()).LIZLLL(customErrorExtra, i2).booleanValue() && customErrorExtra != null) {
                    LIZIZ().put("custom_error", customErrorExtra.toJSONObject());
                }
            }
            if (map != null) {
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    LIZIZ().put((String) entry.getKey(), entry.getValue());
                }
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (i == 2 && i2 == 206) {
            C1EW.LIZ(((IapApi) Q7L.LIZIZ(IapApi.class)).getFeedBackList(1, 1)).LJJJJZI(new AfS65S0100000_13(this, 0));
        }
        this.LJLILLLLZI.LIZLLL(LIZ().LIZIZ, LIZIZ());
        BaseRechargeViewModel baseRechargeViewModel = this.LJLJJLL;
        if (baseRechargeViewModel != null) {
            baseRechargeViewModel.onDestroy();
        }
        this.LJLJJLL = null;
    }
}
