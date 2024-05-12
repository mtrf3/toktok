package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS0S6300000_4;
import kotlin.jvm.internal.AqS55S0201000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Ay1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27949Ay1 {
    public static int LJIIIIZZ;
    public static PaymentMethod LJIJ;
    public static PaymentMethod LJIJI;
    public static final C27949Ay1 LIZ = new C27949Ay1();
    public static final ConcurrentHashMap<String, Object> LIZIZ = new ConcurrentHashMap<>();
    public static long LIZJ = -1;
    public static long LIZLLL = -1;
    public static long LJ = -1;
    public static long LJFF = -1;
    public static long LJI = -1;
    public static long LJII = -1;
    public static final List<String> LJIIIZ = new ArrayList();
    public static final List<String> LJIIJ = new ArrayList();
    public static final List<String> LJIIJJI = new ArrayList();
    public static final List<String> LJIIL = new ArrayList();
    public static final List<String> LJIILIIL = new ArrayList();
    public static final List<String> LJIILJJIL = new ArrayList();
    public static final List<String> LJIILL = new ArrayList();
    public static String LJIILLIIL = "";
    public static final java.util.Map<String, Long> LJIIZILJ = new LinkedHashMap();
    public static boolean LJIJJ = true;
    public static long LJIJJLI = -1;

    public static void LJIL() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("input_box_name", "phone");
        C76542zS.LIZ("tiktokec_input_click", linkedHashMap);
    }

    public static void LJJJIL() {
        java.util.Map LJJLIL = C113554cx.LJJLIL(LIZIZ);
        LJJLIL.put("button_name", "change_address");
        C76542zS.LIZ("tiktokec_button_click", LJJLIL);
    }

    public static void LJJJJ() {
        LIZJ = SystemClock.elapsedRealtime();
    }

    public static void LJJJJJL() {
        LJIJJLI = SystemClock.elapsedRealtime();
    }

    public static long LIZJ(String str) {
        java.util.Map<String, Long> map = LJIIZILJ;
        Long l = (Long) ((LinkedHashMap) map).get(str);
        if (l != null) {
            long longValue = l.longValue();
            map.remove(str);
            return SystemClock.elapsedRealtime() - longValue;
        }
        return 0L;
    }

    public static HashMap LJ(PlatformPromotion platformPromotion) {
        String str;
        BonusInfo bonusInfo;
        String str2;
        if (platformPromotion != null) {
            str = platformPromotion.daInfo;
        } else {
            str = null;
        }
        HashMap<String, Object> LJII2 = C27739Aud.LJII(str);
        HashMap hashMap = new HashMap();
        if (platformPromotion != null && (bonusInfo = platformPromotion.bonusInfo) != null && o.LJ(bonusInfo.useBonusRedeem, Boolean.TRUE) && (str2 = platformPromotion.bonusInfo.redeemAmountValue) != null) {
            hashMap.put("redeem_bonus", str2);
        }
        if (LJII2 != null) {
            Object obj = LJII2.get("bonus_guide");
            if (obj != null) {
                hashMap.put("bonus_guide", obj);
            }
            Object obj2 = LJII2.get("bonus_to_be_earned_amount");
            if (obj2 != null) {
                hashMap.put("earn_bonus", obj2);
            }
        }
        return hashMap;
    }

    public static void LJIIIZ(Integer num) {
        String str;
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        Object obj = concurrentHashMap.get("click_buynow_start_time");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(concurrentHashMap);
        linkedHashMap.put("page_name", "order_submit");
        if ((obj instanceof Long) && !o.LJ(obj, -1L)) {
            linkedHashMap.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        if (LJIIIIZZ > 0) {
            str = "yes";
        } else {
            str = "no";
        }
        linkedHashMap.put("is_retry", str);
        if (LJIIIIZZ > 0) {
            num = 2;
        }
        linkedHashMap.put("request_type", String.valueOf(num));
        C76542zS.LIZ("rd_tiktokec_first_bill_info_request_send", linkedHashMap);
    }

    public static void LJIIL(PaymentMethod paymentMethod) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("button_name", "info");
        linkedHashMap.put("option_name", paymentMethod.LJIIL());
        linkedHashMap.put("option_type", "payment_type");
        C76542zS.LIZ("tiktokec_button_click", linkedHashMap);
    }

    public static void LJIILIIL(PaymentMethod paymentMethod) {
        ArrayList arrayList = (ArrayList) LJIILJJIL;
        if (arrayList.contains(paymentMethod.LJFF())) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("button_name", "info");
        linkedHashMap.put("option_name", paymentMethod.LJIIL());
        linkedHashMap.put("option_type", "payment_type");
        C76542zS.LIZ("tiktokec_button_show", linkedHashMap);
        arrayList.add(paymentMethod.LJFF());
    }

    public static void LJIILJJIL(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("input_box_name", str);
        C76542zS.LIZ("tiktokec_input_click", linkedHashMap);
    }

    public static void LJIIZILJ(String str) {
        Object obj = LIZIZ.get("previous_page");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.put("module_name", "add_on_module");
        linkedHashMap.put("glide_type", str);
        if (obj == null) {
            obj = "product_detail";
        }
        linkedHashMap.put("previous_page", obj);
        C76542zS.LIZ("tiktokec_module_glide", linkedHashMap);
    }

    public static void LJJIJ(HashMap generalParams) {
        o.LJIIIZ(generalParams, "generalParams");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.putAll(generalParams);
        C76542zS.LIZ("tiktokec_submit_order", linkedHashMap);
    }

    public static void LJJJI(Integer num) {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("verify_object", "mobile_number");
        if (num == null || num.intValue() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        linkedHashMap.put("is_success", Integer.valueOf(i));
        if (num != null) {
            linkedHashMap.put("fail_reason", Integer.valueOf(num.intValue()));
        }
        C76542zS.LIZ("tiktokec_verify_result", linkedHashMap);
    }

    public static void LJJJJIZL(String str) {
        LJIIZILJ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public static String LJJJJJ(String exception) {
        String str;
        String str2;
        String value;
        o.LJIIIZ(exception, "exception");
        try {
            boolean z = false;
            InterfaceC59973NgH find$default = OJD.find$default(new OJD("\"net_error\":-?\\d+"), exception, 0, 2, null);
            if (find$default != null && (value = find$default.getValue()) != null) {
                str = (String) ORZ.LJLLLLLL(1, s.LJLJJL(value, new String[]{":"}, 0, 6));
            } else {
                str = null;
            }
            InterfaceC59973NgH find$default2 = OJD.find$default(new OJD("\\|.*?,"), exception, 0, 2, null);
            if (find$default2 == null || (str2 = find$default2.getValue()) == null) {
                str2 = "";
            }
            if (str == null || ujb.o.LJJJJJL(str)) {
                z = true;
            }
            if (z) {
                return "";
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(str2);
            return X1D.LIZIZ(LIZ2);
        } catch (Exception unused) {
            return exception;
        }
    }

    public static void LIZIZ(Integer num, String str) {
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        if (num == null || concurrentHashMap.put("biz_type", Integer.valueOf(num.intValue())) == null) {
            concurrentHashMap.remove("biz_type");
        }
        concurrentHashMap.put("product_id", str);
    }

    public static void LIZLLL(int i, HashMap hashMap) {
        Object obj = LIZIZ.get("click_buynow_start_time");
        if (obj == null) {
            obj = -1L;
        }
        C76542zS.LIZJ("rd_tiktokec_enter_order_submit_duration", new AqS55S0201000_4(hashMap, (HashMap<String, Object>) i, (int) obj, (Object) 0));
    }

    public static OSZ LJFF(PaymentInfo paymentInfo, List list) {
        PaymentMethod paymentMethod;
        Object obj;
        Boolean bool;
        Object obj2 = null;
        if (paymentInfo == null || (paymentMethod = paymentInfo.paymentMethod) == null) {
            return new OSZ(null, null);
        }
        Iterator it = ((ArrayList) list).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                PaymentMethod paymentMethod2 = (PaymentMethod) obj;
                if (!o.LJ(paymentMethod2.id, "pm_pi_ccdc_all") && paymentMethod2.LJIILJJIL(paymentMethod)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        PaymentMethod paymentMethod3 = (PaymentMethod) obj;
        PaymentMethod paymentMethod4 = LJIJ;
        if (paymentMethod4 == null) {
            bool = null;
        } else if (paymentMethod3 == null) {
            if (C61841OOv.LIZIZ(paymentMethod, paymentMethod4)) {
                bool = Boolean.TRUE;
            }
            bool = Boolean.FALSE;
        } else {
            if (C61841OOv.LIZIZ(paymentMethod3, LJIJ)) {
                bool = Boolean.TRUE;
            }
            bool = Boolean.FALSE;
        }
        if (paymentMethod3 != null) {
            String str = paymentMethod.id;
            PaymentMethod paymentMethod5 = LJIJI;
            if (paymentMethod5 != null) {
                obj2 = paymentMethod5.id;
            }
            obj2 = Boolean.valueOf(o.LJ(str, obj2));
        }
        return new OSZ(bool, obj2);
    }

    public static void LJI(PaymentMethod paymentMethod, List list) {
        boolean z;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJIJ = paymentMethod;
            LJIJI = null;
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PaymentMethod paymentMethod2 = (PaymentMethod) it.next();
            if (C61841OOv.LIZIZ(paymentMethod2, paymentMethod)) {
                LJIJ = paymentMethod2;
                LJIJI = null;
                return;
            } else if (paymentMethod2.LJIILJJIL(paymentMethod)) {
                if (o.LJ(paymentMethod2.id, "pm_pi_ccdc_all")) {
                    LJIJ = paymentMethod2;
                    LJIJI = null;
                    return;
                } else {
                    LJIJ = paymentMethod2;
                    LJIJI = paymentMethod;
                    return;
                }
            }
        }
    }

    public static void LJIIJJI(PaymentMethod paymentMethod, String str) {
        String str2;
        boolean LJJJIL = C78857UxB.LJJJIL(paymentMethod.extraInfo);
        BindInfo bindInfo = paymentMethod.bindInfo;
        if (bindInfo != null) {
            str2 = bindInfo.bindStatus;
        } else {
            str2 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("button_name", "edit");
        linkedHashMap.put("payment_option", paymentMethod.LJIIL());
        linkedHashMap.put("option_type", "payment_type");
        linkedHashMap.put("is_pay_saved", 0);
        linkedHashMap.put("is_option_discounted", Integer.valueOf(LJJJIL ? 1 : 0));
        linkedHashMap.put("is_payment_promoted", Integer.valueOf(C78857UxB.LJJJIL(paymentMethod.LJIIIIZZ()) ? 1 : 0));
        if (str2 != null && str2.length() > 0) {
            linkedHashMap.put("pay_bind_status", str2);
        }
        C76542zS.LIZ(str, linkedHashMap);
    }

    public static void LJJ(long j, HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("stay_time", Long.valueOf(j));
        linkedHashMap.put("input_box_name", "phone");
        linkedHashMap.put("input_method", "normal");
        linkedHashMap.putAll(hashMap);
        C76542zS.LIZ("tiktokec_input_staytime", linkedHashMap);
    }

    public final void LJIIJ(PaymentMethod paymentMethod, HashMap<String, Object> generalParams) {
        o.LJIIIZ(generalParams, "generalParams");
        ArrayList arrayList = (ArrayList) LJIILL;
        if (arrayList.contains(paymentMethod.LJFF())) {
            return;
        }
        LJJIFFI(this, "billing_address", generalParams, null, null, null, null, null, 2044);
        arrayList.add(paymentMethod.LJFF());
    }

    public static void LJIILL(boolean z, String str, HashMap generalParams) {
        o.LJIIIZ(generalParams, "generalParams");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("is_valid", Integer.valueOf(z ? 1 : 0));
        if (str != null) {
            linkedHashMap.put("input_name", str);
        }
        linkedHashMap.put("input_method", "normal");
        linkedHashMap.put("is_fullscreen", 1);
        linkedHashMap.putAll(generalParams);
        C76542zS.LIZ("tiktokec_input_result", linkedHashMap);
    }

    public static void LJIILLIIL(long j, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        linkedHashMap.putAll(concurrentHashMap);
        Object obj = concurrentHashMap.get("summary_info");
        if (obj != null) {
            linkedHashMap.put("order_summary_info", obj);
        }
        linkedHashMap.put("input_box_name", str);
        linkedHashMap.put("stay_time", String.valueOf(j));
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("input_method", str2);
        C76542zS.LIZ("tiktokec_input_staytime", linkedHashMap);
    }

    public static void LJIJJ(String str, Boolean bool, int i) {
        if ((i & 2) != 0) {
            bool = null;
        }
        new B0K(str, bool, null, LIZIZ.get("summary_info")).LIZIZ();
    }

    public static void LJJIIJZLJL(String str, String str2, HashMap hashMap) {
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Map LJJLIL = C113554cx.LJJLIL(LIZIZ);
        if (C78857UxB.LJJJIL(str2)) {
            HashMap LJ2 = C27739Aud.LJ("entrance_info", LJJLIL);
            if (LJ2 != null) {
                LJ2.put("track_id", str2);
                LJ2.put("source_page_type", "add_on_order_submit_rec");
                LJ2.put("entrance_form", "append_goods_card");
                str3 = C27739Aud.LJI(LJ2);
            } else {
                str3 = "{}";
            }
            LJJLIL.put("entrance_info", str3);
        }
        linkedHashMap.putAll(LJJLIL);
        linkedHashMap.putAll(hashMap);
        C76542zS.LIZ(str, linkedHashMap);
    }

    public static void LJJIIZI(String str, String str2, HashMap hashMap) {
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Map LJJLIL = C113554cx.LJJLIL(LIZIZ);
        HashMap LJ2 = C27739Aud.LJ("entrance_info", LJJLIL);
        if (C78857UxB.LJJJIL(str2)) {
            if (LJ2 != null) {
                LJ2.put("track_id", str2);
                LJ2.put("purchase_path", "skip_pdp");
                LJ2.put("source_page_type", "add_on_order_submit_rec");
                LJ2.put("entrance_form", "append_goods_card");
                LJ2.put("source_module", "rec_order_submit_outer_add_on_module");
                str3 = C27739Aud.LJI(LJ2);
            } else {
                str3 = "{}";
            }
            LJJLIL.put("entrance_info", str3);
        }
        linkedHashMap.putAll(LJJLIL);
        linkedHashMap.putAll(hashMap);
        C76542zS.LIZ(str, linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJJI(BillInfoResponse billInfoResponse, Boolean bool, String str) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        if (str != null) {
            LJIIIIZZ(this, false, LJJJJJ(str), z, 2);
            return;
        }
        if (billInfoResponse == null) {
            LJIIIIZZ(this, false, "-1", z, 2);
            return;
        }
        if (!billInfoResponse.isCodeOK()) {
            LJIIIIZZ(this, false, String.valueOf(billInfoResponse.code), z, 2);
            return;
        }
        T t = billInfoResponse.data;
        if (t == 0 || ((BillInfoData) t).isEmpty()) {
            Boolean bool2 = Boolean.TRUE;
            String str2 = billInfoResponse.message;
            if (str2 == null) {
                str2 = "-2";
            }
            LJII(false, z, str2, bool2);
            return;
        }
        LJIIIIZZ(this, true, null, z, 6);
    }

    public static void LIZ(java.util.Map map, HashMap hashMap, String str, LaneParams laneParams) {
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        Object obj = hashMap.get("bundle_id");
        if (obj != null) {
            if (map != null) {
                map.put("bundle_id", obj);
            }
            if (laneParams != null) {
                laneParams.put("bundle_id", obj);
            }
        }
        Object obj2 = hashMap.get("is_discounted_bundle_deal");
        if (obj2 != null) {
            if (map != null) {
                map.put("is_discounted_bundle_deal", obj2);
            }
            if (laneParams != null) {
                laneParams.put("is_discounted_bundle_deal", obj2);
            }
        }
        Object obj3 = hashMap.get("bundle_product_id");
        if (obj3 != null) {
            if (map != null) {
                map.put("bundle_product_id", obj3);
            }
            if (laneParams != null) {
                laneParams.put("bundle_product_id", obj3);
            }
        }
        Object obj4 = hashMap.get("campaign_id");
        if (obj4 != null) {
            if (map != null) {
                map.put("campaign_id", obj4);
            }
            if (laneParams != null) {
                laneParams.put("campaign_id", obj4);
            }
        }
        Object obj5 = hashMap.get("campaign_type");
        if (obj5 != null) {
            if (map != null) {
                map.put("campaign_type", obj5);
            }
            if (laneParams != null) {
                laneParams.put("campaign_type", obj5);
            }
        }
        Object obj6 = hashMap.get("campaign_user_tag");
        if (obj6 != null) {
            if (map != null) {
                map.put("campaign_user_tag", obj6);
            }
            if (laneParams != null) {
                laneParams.put("campaign_user_tag", obj6);
            }
        }
        if (str != null) {
            if (map != null) {
                map.put("other_campaign", str);
            }
            if (laneParams != null) {
                laneParams.put("other_campaign", str);
            }
        }
    }

    public static void LJII(boolean z, boolean z2, String str, Boolean bool) {
        boolean z3;
        boolean z4 = false;
        if (!z) {
            if (LJIIIIZZ > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            new B0L(str, z3, z2).LIZIZ();
        }
        if (z2) {
            if (LJIIIIZZ > 0) {
                z4 = true;
            }
            new C28081B0j(z4, z, str, bool).LIZIZ();
        }
    }

    public static /* synthetic */ void LJIIIIZZ(C27949Ay1 c27949Ay1, boolean z, String str, boolean z2, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        c27949Ay1.getClass();
        LJII(z, z2, str, null);
    }

    public static void LJJIII(String str, String str2, String str3, java.util.Map map, String pageName, boolean z, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            map = null;
        }
        if ((i & 32) != 0) {
            pageName = "order_submit";
        }
        if ((i & 64) != 0) {
            z = false;
        }
        o.LJIIIZ(pageName, "pageName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.putAll(LIZIZ);
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", pageName);
        linkedHashMap.put("popup_name", str);
        if (str2 != null) {
            linkedHashMap.put("action_type", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("error_code", str3);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C76542zS.LIZ("tiktokec_popup_click", linkedHashMap);
    }

    public static void LJJIIJ(String str, String str2, String str3, java.util.Map map, String pageName, boolean z, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        if ((i & 16) != 0) {
            pageName = "order_submit";
        }
        if ((i & 32) != 0) {
            z = false;
        }
        o.LJIIIZ(pageName, "pageName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.putAll(LIZIZ);
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", pageName);
        linkedHashMap.put("popup_name", str);
        if (str2 != null) {
            linkedHashMap.put("error_code", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("pay_type", str3);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C76542zS.LIZ("tiktokec_popup_show", linkedHashMap);
    }

    public static void LJIJI(String str, String str2, HashMap hashMap, String str3, String str4, Boolean bool, String str5, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            hashMap = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 256) != 0) {
            str4 = null;
        }
        if ((i & 512) != 0) {
            bool = null;
        }
        if ((i & 1024) != 0) {
            str5 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("button_name", str);
        if (str2 != null) {
            linkedHashMap.put("button_type", str2);
        }
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap.put("is_recommended", V1M.LJJJJZ(bool.booleanValue()));
        }
        if (str3 != null) {
            linkedHashMap.put("page_name", str3);
        }
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
        if (str4 != null) {
            linkedHashMap.put("previous_page", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("is_next_day_delivery", str5);
        }
        C76542zS.LIZ("tiktokec_button_show", linkedHashMap);
    }

    public static void LJJIFFI(C27949Ay1 c27949Ay1, String str, HashMap generalParams, String str2, String str3, Boolean bool, Boolean bool2, String str4, int i) {
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        if ((i & 128) != 0) {
            bool = null;
        }
        if ((i & 256) != 0) {
            bool2 = null;
        }
        if ((i & 512) != 0) {
            str4 = null;
        }
        c27949Ay1.getClass();
        o.LJIIIZ(generalParams, "generalParams");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("module_name", str);
        linkedHashMap.putAll(generalParams);
        if (o.LJ(str, "logistics") && str2 != null) {
            linkedHashMap.put("free_shipping_condition", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("pay_type", str3);
        }
        if (bool != null) {
            linkedHashMap.put("is_discounted", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (bool2 != null) {
            linkedHashMap.put("is_balance_shown", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (str4 != null && str4.length() != 0) {
            linkedHashMap.put("pay_type_unavailable_code", str4);
        }
        C76542zS.LIZ("tiktokec_module_show", linkedHashMap);
    }

    public static void LJJIJIIJI(PaymentMethod paymentMethod, int i, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, Boolean bool) {
        String str3;
        ArrayList arrayList = (ArrayList) LJIIIZ;
        if (arrayList.contains(paymentMethod.LJFF())) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("option_name", paymentMethod.LJIIL());
        linkedHashMap.put("is_option_discounted", Integer.valueOf(z ? 1 : 0));
        if (bool != null) {
            linkedHashMap.put("is_payment_promoted", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        linkedHashMap.put("rank", Integer.valueOf(i));
        linkedHashMap.put("option_type", "payment_type");
        linkedHashMap.put("is_pay_saved", Integer.valueOf(z2 ? 1 : 0));
        linkedHashMap.put("is_balance_shown", Integer.valueOf(z3 ? 1 : 0));
        linkedHashMap.put("is_default", V1M.LJJJJZ(z4));
        if (str != null && str.length() != 0) {
            linkedHashMap.put("option_unavailable_code", str);
        }
        if (str2 != null && str2.length() != 0) {
            linkedHashMap.put("status_code", str2);
        }
        BindInfo bindInfo = paymentMethod.bindInfo;
        if (bindInfo != null && (str3 = bindInfo.bindStatus) != null && str3.length() > 0) {
            linkedHashMap.put("pay_bind_status", str3);
        }
        C76542zS.LIZ("tiktokec_option_show", linkedHashMap);
        arrayList.add(paymentMethod.LJFF());
    }

    public static /* synthetic */ void LJJIJIIJIL(PaymentMethod paymentMethod, int i, boolean z, boolean z2, boolean z3, boolean z4, String str, Boolean bool, int i2) {
        Boolean bool2 = bool;
        String str2 = str;
        if ((i2 & 128) != 0) {
            str2 = null;
        }
        if ((i2 & 512) != 0) {
            bool2 = null;
        }
        LJJIJIIJI(paymentMethod, i, z, z2, z3, z4, str2, null, bool2);
    }

    public static void LJJIL(String str, Long l, String str2, String str3, Boolean bool, String str4, CommuteType commuteType, String str5, String str6) {
        C76542zS.LIZJ("rd_tiktokec_pay_result", new AqS0S6300000_4(str, l, str2, str3, bool, str4, commuteType, str5, str6, 1));
    }

    public static void LJJI(String str, HashMap generalParams, Float f, String str2, String str3, String str4, Boolean bool, Boolean bool2, String str5, int i) {
        if ((i & 8) != 0) {
            f = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        if ((i & 128) != 0) {
            bool = null;
        }
        if ((i & 256) != 0) {
            bool2 = null;
        }
        if ((i & 512) != 0) {
            str5 = null;
        }
        o.LJIIIZ(generalParams, "generalParams");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("module_name", str);
        linkedHashMap.putAll(generalParams);
        if (o.LJ(str, "logistics")) {
            if (f != null) {
                linkedHashMap.put("shipping_price", f);
            }
            if (str2 != null) {
                linkedHashMap.put("shipping_currency", str2);
            }
            if (str3 != null) {
                linkedHashMap.put("free_shipping_condition", str3);
            }
        }
        if (str4 != null) {
            linkedHashMap.put("pay_type", str4);
        }
        if (bool != null) {
            linkedHashMap.put("is_discounted", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (bool2 != null) {
            linkedHashMap.put("is_balance_shown", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (str5 != null && str5.length() != 0) {
            linkedHashMap.put("pay_type_unavailable_code", str5);
        }
        C76542zS.LIZ("tiktokec_module_click", linkedHashMap);
    }

    public static /* synthetic */ void LJJIJL(String str, boolean z, int i, boolean z2, boolean z3, String str2, String str3, String str4, Boolean bool, int i2) {
        String str5 = str3;
        String str6 = str2;
        Boolean bool2 = null;
        if ((i2 & 64) != 0) {
            str6 = null;
        }
        if ((i2 & 128) != 0) {
            str5 = null;
        }
        if ((i2 & 2048) == 0) {
            bool2 = bool;
        }
        LJJIJIL(i, bool2, str, "payment_type", str6, str5, str4, null, z, z2, z3, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e1, code lost:
    
        if (r0 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIJLIJ(java.lang.String r5, boolean r6, java.lang.String r7, java.lang.String r8, long r9, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.String r0 = "failReason"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = X.C27949Ay1.LIZIZ
            java.lang.String r1 = "add_on_track_id"
            if (r0 == 0) goto L2b
            java.util.Map r4 = X.C113554cx.LJJLIL(r0)
            java.lang.String r3 = "entrance_info"
            java.util.HashMap r0 = X.C27739Aud.LJ(r3, r4)
            if (r15 == 0) goto Le1
            if (r0 == 0) goto Le5
            r0.put(r1, r15)
        L21:
            java.lang.String r0 = X.C27739Aud.LJI(r0)
        L25:
            r4.put(r3, r0)
            r2.putAll(r4)
        L2b:
            java.lang.String r0 = "order_id"
            r2.put(r0, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            java.lang.String r0 = "is_success"
            r2.put(r0, r3)
            java.lang.String r0 = "fail_reason"
            r2.put(r0, r7)
            if (r6 == 0) goto L53
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r3 = X.C27949Ay1.LIZLLL
            long r5 = r5 - r3
            long r3 = X.C27949Ay1.LJFF
            long r5 = r5 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.String r0 = "total_time"
            r2.put(r0, r3)
        L53:
            int r0 = r8.length()
            r4 = 1
            if (r0 != 0) goto Lda
        L5a:
            java.lang.String r3 = "api_duration"
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r2.put(r3, r0)
            if (r11 == 0) goto L6a
            java.lang.String r0 = "pay_error_code"
            r2.put(r0, r11)
        L6a:
            if (r12 == 0) goto L71
            java.lang.String r0 = "pay_result"
            r2.put(r0, r12)
        L71:
            if (r13 == 0) goto L78
            java.lang.String r0 = "redirect_url"
            r2.put(r0, r13)
        L78:
            if (r15 == 0) goto L8b
            r2.put(r1, r15)
            java.lang.String r1 = "add_on_source_page_type"
            java.lang.String r0 = "add_on_order_submit_rec"
            r2.put(r1, r0)
            java.lang.String r1 = "add_on_entrance_form"
            java.lang.String r0 = "append_goods_card"
            r2.put(r1, r0)
        L8b:
            if (r14 == 0) goto Le9
            java.lang.String r0 = "payment_method_id"
            r2.put(r0, r14)
            com.bytedance.ies.abmock.SettingsManager r5 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.core.ab.ECPaymentCategorySettings$EcPaymentCategoryModel> r3 = com.ss.android.ugc.aweme.ecommerce.core.ab.ECPaymentCategorySettings.EcPaymentCategoryModel.class
            com.ss.android.ugc.aweme.ecommerce.core.ab.ECPaymentCategorySettings$EcPaymentCategoryModel r1 = com.ss.android.ugc.aweme.ecommerce.core.ab.ECPaymentCategorySettings.LIZ
            java.lang.String r0 = "ec_payment_category"
            java.lang.Object r0 = r5.LJIIIIZZ(r0, r3, r1)
            com.ss.android.ugc.aweme.ecommerce.core.ab.ECPaymentCategorySettings$EcPaymentCategoryModel r0 = (com.ss.android.ugc.aweme.ecommerce.core.ab.ECPaymentCategorySettings.EcPaymentCategoryModel) r0
            if (r0 != 0) goto Ld8
        La4:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r1.payCategoryMapping
            if (r0 != 0) goto Lac
            X.3mF r0 = X.C113554cx.LJJJLIIL()
        Lac:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        Lb4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Le9
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto Lb4
            boolean r0 = r0.contains(r14)
            if (r0 != r4) goto Lb4
            java.lang.String r0 = "payment_pay_category"
            r2.put(r0, r1)
            goto Lb4
        Ld8:
            r1 = r0
            goto La4
        Lda:
            java.lang.String r0 = "pay_type"
            r2.put(r0, r8)
            goto L5a
        Le1:
            if (r0 == 0) goto Le5
            goto L21
        Le5:
            java.lang.String r0 = "{}"
            goto L25
        Le9:
            java.lang.String r0 = "rd_tiktokec_submit_order_result"
            X.C76542zS.LIZ(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27949Ay1.LJJIJLIJ(java.lang.String, boolean, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void LJJIZ(String parentOptionName, String optionName, int i, boolean z, String str, Boolean bool, InstallmentPlan installmentPlan, String str2, String str3, int i2) {
        String str4;
        if ((i2 & 32) != 0) {
            str = null;
        }
        if ((i2 & 64) != 0) {
            bool = null;
        }
        if ((i2 & 128) != 0) {
            installmentPlan = null;
        }
        if ((i2 & 256) != 0) {
            str2 = null;
        }
        if ((i2 & 1024) != 0) {
            str3 = null;
        }
        o.LJIIIZ(parentOptionName, "parentOptionName");
        o.LJIIIZ(optionName, "optionName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("parent_option_name", parentOptionName);
        linkedHashMap.put("option_name", optionName);
        linkedHashMap.put("option_type", "sub_payment_type");
        linkedHashMap.put("rank", Integer.valueOf(i));
        linkedHashMap.put("is_option_discounted", Integer.valueOf(z ? 1 : 0));
        if (str != null && str.length() != 0) {
            linkedHashMap.put("status_code", str);
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            linkedHashMap.put("is_default", V1M.LJJJJZ(bool.booleanValue()));
        } else {
            linkedHashMap.put("is_default", V1M.LJJJJZ(false));
        }
        if (installmentPlan != null) {
            Amount amount = installmentPlan.totalFee;
            if (amount == null || (str4 = amount.priceStr) == null) {
                str4 = "";
            }
            linkedHashMap.put("service_fee", str4);
            String str5 = installmentPlan.tenure;
            if (str5 == null) {
                str5 = "";
            }
            linkedHashMap.put("installment_cnt", str5);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("total_payment", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("currency", str3);
        }
        C76542zS.LIZ("tiktokec_select_option", linkedHashMap);
    }

    public static void LJJJ(String str, String optionName, int i, boolean z, String str2, Boolean bool, InstallmentPlan installmentPlan, String str3, String str4, Boolean bool2) {
        String str5;
        o.LJIIIZ(optionName, "optionName");
        ArrayList arrayList = (ArrayList) LJIIJ;
        if (arrayList.contains(KMP.LJ(optionName, i))) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("parent_option_name", str);
        linkedHashMap.put("option_name", optionName);
        linkedHashMap.put("option_type", "sub_payment_type");
        linkedHashMap.put("rank", Integer.valueOf(i));
        linkedHashMap.put("is_option_discounted", Integer.valueOf(z ? 1 : 0));
        if (bool2 != null) {
            linkedHashMap.put("is_payment_promoted", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (str2 != null && str2.length() != 0) {
            linkedHashMap.put("status_code", str2);
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            linkedHashMap.put("is_default", 1);
        } else {
            linkedHashMap.put("is_default", 0);
        }
        if (installmentPlan != null) {
            Amount amount = installmentPlan.totalFee;
            if (amount == null || (str5 = amount.priceStr) == null) {
                str5 = "";
            }
            linkedHashMap.put("service_fee", str5);
            String str6 = installmentPlan.tenure;
            if (str6 == null) {
                str6 = "";
            }
            linkedHashMap.put("installment_cnt", str6);
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put("total_payment", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("currency", str4);
        }
        C76542zS.LIZ("tiktokec_option_show", linkedHashMap);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(optionName);
        LIZ2.append(i);
        arrayList.add(X1D.LIZIZ(LIZ2));
    }

    public static void LJJIJIL(int i, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4) {
        C76542zS.LIZIZ("tiktokec_select_option", LIZIZ, new C27979AyV(i, bool, str, str2, str6, str3, str4, str5, z, z4, z2, z3));
    }

    public static void LJJIIZ(boolean z, String quitType, Boolean bool, Boolean bool2, HashMap generalParams, Long l, String str, String str2, Boolean bool3, String str3, Integer num, String str4, int i) {
        HashMap<String, Object> LJII2;
        String str5 = str3;
        Integer num2 = num;
        String str6 = null;
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        if ((i & 32) != 0) {
            l = null;
        }
        if ((i & 64) != 0) {
            str = null;
        }
        if ((i & 128) != 0) {
            str2 = null;
        }
        if ((i & 256) != 0) {
            bool3 = null;
        }
        if ((i & 512) != 0) {
            str5 = null;
        }
        if ((i & 1024) != 0) {
            num2 = null;
        }
        if ((i & 2048) == 0) {
            str6 = str4;
        }
        o.LJIIIZ(quitType, "quitType");
        o.LJIIIZ(generalParams, "generalParams");
        if (LIZJ > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - LIZJ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(LIZIZ);
            linkedHashMap.put("is_load_data", Integer.valueOf(z ? 1 : 0));
            linkedHashMap.put("quit_type", quitType);
            linkedHashMap.put("stay_time", Long.valueOf(elapsedRealtime));
            if (l != null) {
                l.longValue();
                linkedHashMap.put("stay_time", l);
            }
            if (bool != null) {
                linkedHashMap.put("is_edit_address", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            if (bool2 != null) {
                linkedHashMap.put("is_edit_quantity", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
            }
            if (str != null) {
                linkedHashMap.put("page_name", str);
            }
            if (str2 != null) {
                linkedHashMap.put("previous_page", str2);
            }
            if (bool3 != null) {
                bool3.booleanValue();
                linkedHashMap.put("is_fullscreen", Integer.valueOf(bool3.booleanValue() ? 1 : 0));
            }
            linkedHashMap.putAll(generalParams);
            if (str5 != null) {
                linkedHashMap.put("promotion_source", str5);
            }
            if (num2 != null) {
                num2.intValue();
                linkedHashMap.put("add_on_product_num", num2);
            }
            if (str6 != null && (LJII2 = C27739Aud.LJII(str6)) != null) {
                linkedHashMap.putAll(LJII2);
            }
            linkedHashMap.put("shipping_rights_content", LJIILLIIL);
            C76542zS.LIZ("tiktokec_stay_page", linkedHashMap);
        }
    }

    public static void LJIJJLI(Boolean bool, HashMap generalParams, String str, String str2, String str3, String str4, Integer num, String str5, HashMap hashMap, SkuPrice skuPrice, String str6, String str7, Integer num2, C70356RjM c70356RjM, String str8, String str9, Integer num3, Integer num4, HashMap hashMap2, RXX rxx, HashMap hashMap3, int i) {
        HashMap<String, Object> LJII2;
        String str10;
        String str11;
        String str12 = str3;
        String str13 = str;
        String str14 = str2;
        HashMap hashMap4 = hashMap3;
        RXX rxx2 = rxx;
        String str15 = str9;
        String str16 = str8;
        C70356RjM c70356RjM2 = c70356RjM;
        Integer num5 = num;
        String str17 = str7;
        String str18 = str5;
        HashMap hashMap5 = hashMap2;
        HashMap hashMap6 = hashMap;
        Integer num6 = num2;
        SkuPrice skuPrice2 = skuPrice;
        String str19 = str4;
        String str20 = str6;
        if ((i & 4) != 0) {
            str13 = null;
        }
        if ((i & 8) != 0) {
            str14 = null;
        }
        if ((i & 16) != 0) {
            str12 = null;
        }
        if ((i & 32) != 0) {
            str19 = null;
        }
        if ((i & 64) != 0) {
            num5 = null;
        }
        if ((i & 128) != 0) {
            str18 = null;
        }
        if ((i & 256) != 0) {
            hashMap6 = null;
        }
        if ((i & 512) != 0) {
            skuPrice2 = null;
        }
        if ((i & 1024) != 0) {
            str20 = null;
        }
        if ((i & 2048) != 0) {
            str17 = null;
        }
        if ((i & 4096) != 0) {
            num6 = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            c70356RjM2 = null;
        }
        if ((i & 16384) != 0) {
            str16 = null;
        }
        if ((32768 & i) != 0) {
            str15 = null;
        }
        if ((65536 & i) != 0) {
            num3 = null;
        }
        if ((131072 & i) != 0) {
            num4 = null;
        }
        if ((262144 & i) != 0) {
            hashMap5 = null;
        }
        if ((524288 & i) != 0) {
            rxx2 = null;
        }
        if ((i & 1048576) != 0) {
            hashMap4 = null;
        }
        o.LJIIIZ(generalParams, "generalParams");
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        Object obj = concurrentHashMap.get("click_buynow_start_time");
        if (obj == null) {
            obj = -1L;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (skuPrice2 != null) {
            Price price = skuPrice2.realPrice;
            if (price != null) {
                str10 = price.getPriceVal();
            } else {
                str10 = null;
            }
            concurrentHashMap.put("sale_price_value", String.valueOf(str10));
            concurrentHashMap.put("original_price_value", String.valueOf(skuPrice2.originalPriceVal));
            Price price2 = skuPrice2.realPrice;
            if (price2 != null) {
                str11 = price2.getCurrency();
            } else {
                str11 = null;
            }
            concurrentHashMap.put("currency", String.valueOf(str11));
        }
        linkedHashMap.putAll(concurrentHashMap);
        linkedHashMap.putAll(generalParams);
        try {
            Long LJJIZ = C38350F3i.LJJIZ(String.valueOf(concurrentHashMap.get("start_click_time")));
            Object obj2 = concurrentHashMap.get("previous_page");
            if (LJJIZ != null && (o.LJ(obj2, "cart") || o.LJ(obj2, "ecommerce_centre_page") || num4 != null)) {
                linkedHashMap.put("start_click_to_now", Long.valueOf(System.currentTimeMillis() - LJJIZ.longValue()));
            }
        } catch (Exception unused) {
            C78983UzD.LJIILL("logOSPEnterPage startClickTime exception");
        }
        if ((obj instanceof Long) && !o.LJ(obj, -1L)) {
            linkedHashMap.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        if (str13 != null) {
            linkedHashMap.put("page_name", str13);
        }
        if (str14 != null) {
            linkedHashMap.put("previous_page", str14);
        }
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap.put("is_fullscreen", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (str12 != null) {
            linkedHashMap.put("option_list", str12);
        }
        if (str19 != null) {
            linkedHashMap.put("cart_item_id", str19);
        }
        if (num5 != null) {
            linkedHashMap.put("osp_reload_tag", num5);
        }
        if (str18 != null) {
            linkedHashMap.put("payment_option", str18);
        }
        if (hashMap6 != null) {
            linkedHashMap.putAll(hashMap6);
        }
        if (str20 != null) {
            linkedHashMap.put("promotion_source", str20);
        }
        if (c70356RjM2 != null) {
            C70355RjL.LIZJ(c70356RjM2, linkedHashMap);
        }
        if (str16 != null) {
            linkedHashMap.put("delivery_info", str16);
        }
        if (str17 != null && (LJII2 = C27739Aud.LJII(str17)) != null) {
            linkedHashMap.putAll(LJII2);
        }
        if (str15 != null) {
            linkedHashMap.put("purchase_path", str15);
        }
        if (num3 != null) {
            linkedHashMap.put("is_mobile_number_complete", Integer.valueOf(num3.intValue()));
        }
        if (num6 != null) {
            num6.intValue();
            linkedHashMap.put("add_on_product_num", num6);
        }
        linkedHashMap.put("shipping_rights_content", LJIILLIIL);
        LIZ(linkedHashMap, hashMap5, str17, null);
        if (rxx2 != null) {
            C70355RjL.LIZIZ(rxx2, linkedHashMap);
        }
        if (hashMap4 != null) {
            linkedHashMap.putAll(hashMap4);
        }
        C76542zS.LIZ("tiktokec_enter_page", linkedHashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a0, code lost:
    
        if (r0 != null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJ(java.lang.String r22, java.lang.String r23, java.util.HashMap r24, java.lang.String r25, java.lang.String r26, java.lang.Boolean r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.Boolean r32, java.lang.String r33, java.lang.String r34, java.util.HashMap r35, java.lang.String r36, java.lang.Boolean r37, java.lang.Boolean r38, X.C70356RjM r39, java.lang.String r40, java.lang.String r41, java.util.HashMap r42, java.util.HashMap r43, java.lang.String r44, int r45) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27949Ay1.LJIJ(java.lang.String, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.util.HashMap, java.lang.String, java.lang.Boolean, java.lang.Boolean, X.RjM, java.lang.String, java.lang.String, java.util.HashMap, java.util.HashMap, java.lang.String, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x016b, code lost:
    
        if (r1 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJII(boolean r5, boolean r6, java.lang.String r7, boolean r8, java.lang.String r9, java.util.HashMap r10, java.lang.String r11, long r12, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Boolean r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.util.HashMap r24, java.lang.String r25, java.lang.Boolean r26, java.lang.Boolean r27, X.C70356RjM r28, java.lang.String r29, java.lang.String r30, java.util.HashMap r31, X.RXX r32, boolean r33, java.util.HashMap r34) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27949Ay1.LJJII(boolean, boolean, java.lang.String, boolean, java.lang.String, java.util.HashMap, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, java.lang.String, java.lang.Boolean, java.lang.Boolean, X.RjM, java.lang.String, java.lang.String, java.util.HashMap, X.RXX, boolean, java.util.HashMap):void");
    }
}
