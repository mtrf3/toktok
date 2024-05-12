package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Amb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27241Amb {
    public final java.util.Map<String, Object> LIZ;
    public long LIZIZ;
    public long LIZJ;
    public final boolean LIZLLL;
    public final List<String> LJ;

    public C27241Amb(AddressPageStarter.AddressEditEnterParams addressEditEnterParams) {
        Object obj;
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = linkedHashMap;
        this.LIZIZ = -1L;
        this.LIZJ = -1L;
        if (addressEditEnterParams != null) {
            if (addressEditEnterParams.address == null) {
                obj = "add";
            } else {
                obj = "edit";
            }
            linkedHashMap.put("page_info", obj);
            HashMap<String, Object> LJII = C27739Aud.LJII(addressEditEnterParams.trackParams);
            if (LJII != null) {
                linkedHashMap.putAll(LJII);
            }
            linkedHashMap.put("previous_page", addressEditEnterParams.fromPage);
            if (addressEditEnterParams.templateData != null) {
                z = true;
            } else {
                z = false;
            }
            this.LIZLLL = z;
            linkedHashMap.put("fill_type", addressEditEnterParams.address != null ? "edit" : "add");
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "shipping_address");
        this.LJ = C47261Igj.LJJIJIIJI("name", "phone", "address", "zipcode", "email", "address_other_detail");
    }

    public final void LIZJ(String str, java.util.Map<String, ? extends Object> diyParams) {
        o.LJIIIZ(diyParams, "diyParams");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.putAll(diyParams);
        linkedHashMap.put("button_name", str);
        C76542zS.LIZ("tiktokec_button_show", linkedHashMap);
    }

    public final void LJ(long j, String str, boolean z) {
        C76542zS.LIZJ("rd_tiktokec_page_load_duration", new C27245Amf(this, z, str, j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(C27241Amb c27241Amb, String str, String str2, String str3, String str4, int i) {
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        if ((i & 128) != 0) {
            str4 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "shipping_address");
        linkedHashMap.put("popup_name", str);
        Object obj = ((LinkedHashMap) c27241Amb.LIZ).get("previous_page");
        String str5 = "";
        if (obj == null) {
            obj = "";
        }
        linkedHashMap.put("previous_page", obj);
        Object obj2 = ((LinkedHashMap) c27241Amb.LIZ).get("biz_type");
        if (obj2 == null) {
            obj2 = "";
        }
        linkedHashMap.put("biz_type", obj2);
        Object obj3 = ((LinkedHashMap) c27241Amb.LIZ).get("product_id");
        if (obj3 != 0) {
            str5 = obj3;
        }
        linkedHashMap.put("product_id", str5);
        if (str2 != null) {
            linkedHashMap.put("entrance_info", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("fill_type", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("popup_for", str4);
        }
        C76542zS.LIZ("tiktokec_popup_show", linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C27241Amb c27241Amb, String str, String str2, String str3, String str4, String str5, int i) {
        if ((i & 64) != 0) {
            str3 = null;
        }
        if ((i & 128) != 0) {
            str4 = null;
        }
        if ((i & 256) != 0) {
            str5 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "shipping_address");
        Object obj = ((LinkedHashMap) c27241Amb.LIZ).get("previous_page");
        String str6 = "";
        if (obj == null) {
            obj = "";
        }
        linkedHashMap.put("previous_page", obj);
        linkedHashMap.put("popup_name", str);
        linkedHashMap.put("action_type", str2);
        Object obj2 = ((LinkedHashMap) c27241Amb.LIZ).get("biz_type");
        if (obj2 == null) {
            obj2 = "";
        }
        linkedHashMap.put("biz_type", obj2);
        Object obj3 = ((LinkedHashMap) c27241Amb.LIZ).get("product_id");
        if (obj3 != 0) {
            str6 = obj3;
        }
        linkedHashMap.put("product_id", str6);
        if (str3 != null) {
            linkedHashMap.put("entrance_info", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("fill_type", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("popup_for", str5);
        }
        C76542zS.LIZ("tiktokec_popup_click", linkedHashMap);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Long l) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "shipping_address");
        if (str != null) {
            linkedHashMap.put("entrance_info", str);
        }
        if (str2 != null) {
            if (!ujb.o.LJJJJJL(str2)) {
                linkedHashMap.put("coupon_id", str2);
            } else {
                linkedHashMap.put("coupon_id", "-1");
            }
        }
        if (str3 != null) {
            linkedHashMap.put("coupon_type_id", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("coupon_name", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("coupon_type", str5);
        }
        if (str6 != null) {
            linkedHashMap.put("coupon_type_info", str6);
        }
        linkedHashMap.put("coupon_zone", "quit_editing_address_promotion");
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap.put("is_success", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (l != null) {
            l.longValue();
            linkedHashMap.put("fail_reason", l);
        }
        C76542zS.LIZ("tiktokec_coupon_result", linkedHashMap);
    }
}
