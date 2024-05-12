package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.android.live.room.SubscribeSuccessToastEvent;
import com.bytedance.android.live.wallet.model.CheckSubOrderResultStruct;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscribeShortPaySetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveUseNewSubsData;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CZv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31551CZv extends AbstractC38123Exj<JSONObject, Object> implements InterfaceC77737Uf7 {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C31552CZw.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C31553CZx.LJLIL);
    public C68395Qsp LJLJI;
    public Diamond LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public final java.util.Map<String, String> LJLJL;
    public boolean LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public boolean LJLLLLLL;
    public java.util.Map<String, String> LJLZ;
    public long LJZ;
    public long LJZI;
    public long LJZL;
    public long LL;

    @Override // X.InterfaceC77737Uf7
    public final InterfaceC77748UfI LIZJ() {
        return null;
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIIIZZ(C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIJJLI() {
    }

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
    }

    public final void LJJI() {
        C68395Qsp c68395Qsp;
        Diamond diamond;
        Object obj;
        Diamond diamond2 = this.LJLJJI;
        if (diamond2 != null && (c68395Qsp = this.LJLJI) != null) {
            if (LiveUseNewSubsData.INSTANCE.getValue() && (!((HashMap) this.LJLJL).isEmpty())) {
                java.util.Map map = (java.util.Map) c68395Qsp.LJLILLLLZI;
                if (map != null && (obj = map.get(this.LJLJJL)) != null) {
                    JSONObject LJJII = LJJII(diamond2);
                    String json = GsonProtectorUtils.toJson(new Gson(), obj);
                    json.toString();
                    JSONObject jSONObject = new JSONObject(json);
                    JSONObject LIZLLL = C770830u.LIZLLL("code", 1);
                    LIZLLL.put(this.LJLJJLL, LJJII);
                    LIZLLL.put(this.LJLJJL, jSONObject);
                    finishWithRawResult(LIZLLL);
                    return;
                }
                return;
            }
            List list = (List) c68395Qsp.LJLIL;
            if (list == null || (diamond = (Diamond) ORZ.LJLLLLLL(0, list)) == null) {
                return;
            }
            JSONObject LJJII2 = LJJII(diamond2);
            JSONObject LJJII3 = LJJII(diamond);
            JSONObject LIZLLL2 = C770830u.LIZLLL("code", 1);
            LIZLLL2.put(this.LJLJJLL, LJJII2);
            LIZLLL2.put(this.LJLJJL, LJJII3);
            finishWithRawResult(LIZLLL2);
        }
    }

    public final InterfaceC31557Ca1 LJJIII() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-payManager>(...)");
        return (InterfaceC31557Ca1) value;
    }

    public final C31058CGw LJJIIJ() {
        return (C31058CGw) this.LJLILLLLZI.getValue();
    }

    public C31551CZv() {
        LJJIII().init();
        this.LJLJJL = "";
        this.LJLJJLL = "";
        this.LJLJL = new HashMap();
        this.LJLJLLL = "";
        this.LJLL = "";
        this.LJLLI = "";
        this.LJLLILLLL = "";
        this.LJLLJ = "";
        this.LJLLL = "";
        this.LJLLLL = "";
        this.LJLZ = new HashMap();
    }

    public static JSONObject LJJII(Diamond diamond) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("currency", diamond.LJLILLLLZI);
        jSONObject.put("price", diamond.price);
        jSONObject.put("price_amount_micros", diamond.LJLJI);
        jSONObject.put("sku_name", diamond.LJLJJI);
        return jSONObject;
    }

    @Override // X.InterfaceC77737Uf7
    public final void LIZ(C77623UdH c77623UdH) {
        long currentTimeMillis = System.currentTimeMillis() - this.LL;
        this.LL = System.currentTimeMillis();
        if (LJJIIJ() != null) {
            C31058CGw.LIZLLL(c77623UdH.getCheckOrderRetryCount(), c77623UdH.getDetailCode(), currentTimeMillis, c77623UdH.getOrderId(), true);
        }
    }

    @Override // X.InterfaceC77737Uf7
    public final void LIZLLL(C31556Ca0 c31556Ca0) {
        long currentTimeMillis = System.currentTimeMillis() - this.LJZL;
        String str = c31556Ca0.LJLJI.LIZIZ;
        if (str == null) {
            str = "";
        }
        if (LJJIIJ() != null) {
            C31058CGw.LIZIZ(currentTimeMillis, true, str);
        }
        this.LL = System.currentTimeMillis();
        if (LJJIIJ() != null) {
            C31058CGw.LJ(str, true);
        }
        LJJIII().LJFF(this.LJLJLLL, this.LJLLL, this);
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJI(C77623UdH c77623UdH) {
        long currentTimeMillis = System.currentTimeMillis() - this.LJZ;
        if (LJJIIJ() != null) {
            C31058CGw.LJI(c77623UdH.getErrorCode(), c77623UdH.getDetailCode(), currentTimeMillis, true);
        }
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIJJI(C31556Ca0 c31556Ca0) {
        long currentTimeMillis = System.currentTimeMillis() - this.LJZL;
        String str = c31556Ca0.LJLJI.LIZIZ;
        if (str == null) {
            str = "";
        }
        if (LJJIIJ() != null) {
            C31058CGw.LIZIZ(currentTimeMillis, false, str);
        }
        this.LL = System.currentTimeMillis();
        if (LJJIIJ() != null) {
            C31058CGw.LJ(str, false);
        }
        LJJIII().LJFF(this.LJLJLLL, this.LJLLL, this);
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIL(C77623UdH c77623UdH) {
        long currentTimeMillis = System.currentTimeMillis() - this.LJZL;
        if (LJJIIJ() != null) {
            C31058CGw.LIZ(c77623UdH.getErrorCode(), c77623UdH.getDetailCode(), currentTimeMillis, c77623UdH.getOrderId(), true);
        }
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIILJJIL(C31556Ca0 c31556Ca0) {
        String str;
        String str2 = c31556Ca0.LJLJLJ.contractId;
        String orderId = "";
        if (str2 == null) {
            str2 = "";
        }
        this.LJLLL = str2;
        long currentTimeMillis = System.currentTimeMillis() - this.LJZI;
        boolean LJ = o.LJ(this.LJLLLL, "auto_sub");
        try {
            JSONObject jSONObject = new JSONObject(c31556Ca0.LJLJLJ.bizContent);
            if (!LJ) {
                str = "order_id";
            } else {
                str = "MerchantSubscriptionID";
            }
            orderId = jSONObject.optString(str);
        } catch (Exception unused) {
        }
        if (LJJIIJ() != null) {
            o.LJIIIIZZ(orderId, "orderId");
            C31058CGw.LIZJ(orderId, LJ);
        }
        if (LJJIIJ() != null) {
            o.LJIIIIZZ(orderId, "orderId");
            BZI LIZIZ = C0JU.LIZIZ("livesdk_subscription_create_order_success", "normal_sub", "source", orderId, "order_id");
            LIZIZ.LJIL("duration", Float.valueOf((float) currentTimeMillis));
            LIZIZ.LJIJJ(Integer.valueOf(LJ ? 1 : 0), "type");
            LIZIZ.LJJIIJZLJL();
        }
        this.LJZL = System.currentTimeMillis();
        if (LJJIIJ() != null) {
            o.LJIIIIZZ(orderId, "orderId");
            UFE.LIZIZ(LJ ? 1 : 0, C0JU.LIZIZ("livesdk_subscription_create_iap_order_start", "normal_sub", "source", orderId, "order_id"), "type");
        }
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIILLIIL(C31556Ca0 c31556Ca0) {
        long currentTimeMillis = System.currentTimeMillis() - this.LL;
        LJJIFFI(c31556Ca0.LJLJJI);
        String str = c31556Ca0.LJLJJI.LIZIZ;
        if (str == null) {
            str = "";
        }
        if (LJJIIJ() != null) {
            C31058CGw.LJFF(c31556Ca0.LJLJJI.LIZLLL, currentTimeMillis, false, str);
        }
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIJJ(C77623UdH c77623UdH) {
        long currentTimeMillis = System.currentTimeMillis() - this.LJZI;
        if (LJJIIJ() != null) {
            C31058CGw.LIZJ(c77623UdH.getOrderId(), o.LJ(this.LJLLLL, "auto_sub"));
        }
        if (LJJIIJ() != null) {
            boolean LJ = o.LJ(this.LJLLLL, "auto_sub");
            String orderId = c77623UdH.getOrderId();
            int detailCode = c77623UdH.getDetailCode();
            o.LJIIIZ(orderId, "orderId");
            BZI LIZIZ = C0JU.LIZIZ("livesdk_subscription_create_order_fail", "normal_sub", "source", orderId, "order_id");
            LIZIZ.LJIJJ(Integer.valueOf(detailCode), "error_code");
            LIZIZ.LJIL("duration", Float.valueOf((float) currentTimeMillis));
            LIZIZ.LJIJJ(Integer.valueOf(LJ ? 1 : 0), "type");
            LIZIZ.LJJIIJZLJL();
        }
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIL(C31556Ca0 c31556Ca0) {
        long currentTimeMillis = System.currentTimeMillis() - this.LL;
        String str = c31556Ca0.LJLJL.orderID;
        if (str == null) {
            str = "";
        }
        if (LJJIIJ() != null) {
            C31058CGw.LJFF(c31556Ca0.LJLJJI.LIZLLL, currentTimeMillis, true, str);
        }
        LJJIFFI(c31556Ca0.LJLJL);
    }

    public final void LJJIFFI(Object obj) {
        CheckSubOrderResultStruct checkSubOrderResultStruct;
        Object obj2;
        CheckSubOrderResultStruct.SubLevel subLevel;
        SubscribeBadge subscribeBadge;
        Object obj3;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", 1);
        finishWithRawResult(jSONObject);
        if (obj instanceof CheckSubOrderResultStruct) {
            checkSubOrderResultStruct = (CheckSubOrderResultStruct) obj;
        } else {
            checkSubOrderResultStruct = null;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_subscription_purchase_successfully");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(this.LJLLLL, "subscribe_type");
        String str = "coins";
        if (this.LJLLLLLL) {
            obj2 = "coins";
        } else {
            obj2 = "IAP";
        }
        LIZ.LJIJJ(obj2, "payment_method");
        LIZ.LJJIFFI(this.LJLZ);
        LIZ.LJIJJ(Integer.valueOf(SubscribeShortPaySetting.INSTANCE.getValue() ? 1 : 0), "is_shorten_version");
        LIZ.LJJIIJZLJL();
        if (checkSubOrderResultStruct != null) {
            CheckSubOrderResultStruct.SubChargeInfo subChargeInfo = checkSubOrderResultStruct.subChargeInfo;
            if (subChargeInfo != null && (subLevel = subChargeInfo.subLevel) != null && (subscribeBadge = subLevel.subscribeBadge) != null) {
                DataChannelGlobal.LJLJJI.tv0(SubscribeSuccessEvent.class, new C29742Blq(subscribeBadge, this.LJLJLJ, false, 12));
                BZI LIZ2 = C28787BRn.LIZ("livesdk_subscribe_successfully");
                LIZ2.LJIIZILJ();
                LIZ2.LJIJJ(this.LJLLLL, "subscribe_type");
                if (this.LJLLLLLL) {
                    obj3 = "coins";
                } else {
                    obj3 = "IAP";
                }
                LIZ2.LJIJJ(obj3, "payment_method");
                LIZ2.LJJIFFI(this.LJLZ);
                LIZ2.LJJIIJZLJL();
            }
            String str2 = checkSubOrderResultStruct.toast;
            if (str2 != null) {
                DataChannelGlobal.LJLJJI.tv0(SubscribeSuccessToastEvent.class, str2);
                BZI LIZ3 = C28787BRn.LIZ("livesdk_subscribe_success_toast");
                LIZ3.LJIIZILJ();
                LIZ3.LJIJJ(this.LJLLLL, "subscribe_type");
                if (!this.LJLLLLLL) {
                    str = "IAP";
                }
                LIZ3.LJIJJ(str, "payment_method");
                LIZ3.LJJIFFI(this.LJLZ);
                LIZ3.LJJIIJZLJL();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    @Override // X.InterfaceC77737Uf7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r18, X.C77623UdH r19) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31551CZv.LIZIZ(int, X.UdH):void");
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJFF(int i, C77623UdH c77623UdH) {
        long currentTimeMillis = System.currentTimeMillis() - this.LJZ;
        if (LJJIIJ() != null) {
            C31058CGw.LJI(c77623UdH.getErrorCode(), c77623UdH.getDetailCode(), currentTimeMillis, false);
        }
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIIZ(int i, C31556Ca0 c31556Ca0) {
        int i2;
        this.LJLJI = c31556Ca0.LJLJJL;
        long currentTimeMillis = System.currentTimeMillis() - this.LJZ;
        C68395Qsp c68395Qsp = c31556Ca0.LJLJJL;
        java.util.Map map = (java.util.Map) c68395Qsp.LJLILLLLZI;
        if (map != null) {
            i2 = map.size();
        } else {
            List list = (List) c68395Qsp.LJLIL;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
        }
        if (LJJIIJ() != null) {
            C31058CGw.LJII(i2, currentTimeMillis, true);
        }
        LJJI();
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIZILJ(int i, C77623UdH c77623UdH) {
        long currentTimeMillis = System.currentTimeMillis() - this.LJZL;
        if (LJJIIJ() != null) {
            C31058CGw.LIZ(c77623UdH.getErrorCode(), c77623UdH.getDetailCode(), currentTimeMillis, c77623UdH.getOrderId(), false);
        }
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIJI(int i, C77623UdH c77623UdH) {
        long currentTimeMillis = System.currentTimeMillis() - this.LL;
        this.LL = System.currentTimeMillis();
        if (LJJIIJ() != null) {
            C31058CGw.LIZLLL(c77623UdH.getCheckOrderRetryCount(), c77623UdH.getDetailCode(), currentTimeMillis, c77623UdH.getOrderId(), false);
        }
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJJ(int i, C31556Ca0 c31556Ca0) {
        this.LJLJJI = (Diamond) ORZ.LJLLLLLL(0, c31556Ca0.LJLILLLLZI);
        long currentTimeMillis = System.currentTimeMillis() - this.LJZ;
        if (LJJIIJ() != null) {
            C31058CGw.LJII(c31556Ca0.LJLILLLLZI.size(), currentTimeMillis, false);
        }
        LJJI();
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject jSONObject, C38131Exr context) {
        JSONObject params = jSONObject;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        int optInt = params.optInt("action", -1);
        String optString = params.optString("track_info", "");
        this.LJLJLJ = params.optBoolean("need_open_onboarding", false);
        this.LJLZ.clear();
        if (!TextUtils.isEmpty(optString)) {
            Object fromJson = GsonProtectorUtils.fromJson(new Gson(), optString, (Class<Object>) this.LJLZ.getClass());
            o.LJIIIIZZ(fromJson, "gson.fromJson(logStrings, loggerMap.javaClass)");
            this.LJLZ = (java.util.Map) fromJson;
        }
        if (optInt != 1) {
            if (optInt != 2) {
                if (optInt != 3) {
                    return;
                }
                this.LL = System.currentTimeMillis();
                String optString2 = params.optString("subscribe_type");
                o.LJIIIIZZ(optString2, "params.optString(\"subscribe_type\")");
                this.LJLLLL = optString2;
                this.LJLLLLLL = true;
                String optString3 = params.optString("to_uid");
                o.LJIIIIZZ(optString3, "params.optString(\"to_uid\")");
                this.LJLJLLL = optString3;
                String optString4 = params.optString("contract_id");
                o.LJIIIIZZ(optString4, "params.optString(\"contract_id\")");
                this.LJLLL = optString4;
                LJJIII().LJFF(this.LJLJLLL, this.LJLLL, this);
                return;
            }
            String optString5 = params.optString("subscribe_type");
            o.LJIIIIZZ(optString5, "params.optString(\"subscribe_type\")");
            this.LJLLLL = optString5;
            this.LJLLLLLL = false;
            String optString6 = params.optString("to_uid");
            o.LJIIIIZZ(optString6, "params.optString(\"to_uid\")");
            this.LJLJLLL = optString6;
            String optString7 = params.optString("product_id");
            o.LJIIIIZZ(optString7, "params.optString(\"product_id\")");
            this.LJLL = optString7;
            String optString8 = params.optString("sku_name");
            o.LJIIIIZZ(optString8, "params.optString(\"sku_name\")");
            this.LJLLJ = optString8;
            String optString9 = params.optString("offer_id", "");
            o.LJIIIIZZ(optString9, "params.optString(\"offer_id\", \"\")");
            this.LJLLI = optString9;
            String optString10 = params.optString("offer_token", "");
            o.LJIIIIZZ(optString10, "params.optString(\"offer_token\", \"\")");
            this.LJLLILLLL = optString10;
            HashMap hashMap = new HashMap();
            hashMap.put("order_source", Integer.valueOf(params.optInt("order_source")));
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                hashMap.put("room_id", Long.valueOf(room.getId()));
            }
            if (LJJIIJ() != null) {
                boolean LJ = o.LJ(this.LJLLLL, "auto_sub");
                UFE.LIZIZ(LJ ? 1 : 0, C28787BRn.LIZ("livesdk_subscription_tpl_page_sub_click"), "type");
            }
            this.LJZI = System.currentTimeMillis();
            LJJIII().LIZ(C29306Beo.LIZIZ(context.LIZ), this.LJLJLLL, this.LJLL, this.LJLLJ, hashMap, this, this.LJLLLL, this.LJLLI, this.LJLLILLLL);
            return;
        }
        String optString11 = params.optString("subscribe_id");
        o.LJIIIIZZ(optString11, "params.optString(\"subscribe_id\")");
        this.LJLJJL = optString11;
        String optString12 = params.optString("single_purchase_id");
        o.LJIIIIZZ(optString12, "params.optString(\"single_purchase_id\")");
        this.LJLJJLL = optString12;
        String optString13 = params.optString("renewal_subscription");
        if (C29306Beo.LJIJJLI(optString13)) {
            JSONObject jSONObject2 = new JSONObject(optString13);
            java.util.Map<String, String> map = this.LJLJL;
            String optString14 = jSONObject2.optString("iap_id", "");
            o.LJIIIIZZ(optString14, "offerIdObj.optString(\"iap_id\", \"\")");
            String optString15 = jSONObject2.optString("offer_id", "");
            o.LJIIIIZZ(optString15, "offerIdObj.optString(\"offer_id\", \"\")");
            ((HashMap) map).put(optString14, optString15);
        }
        this.LJZ = System.currentTimeMillis();
        LJJIII().LJ(C47261Igj.LJJIJ(this.LJLJJLL), this);
        LJJIII().LJI(C47261Igj.LJJIJ(this.LJLJJL), this);
    }
}
