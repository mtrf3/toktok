package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS0S6300000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Azw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28068Azw {
    public static void LIZIZ(Integer num, String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "payment_method");
        linkedHashMap.put("popup_name", str);
        if (str2 != null) {
            linkedHashMap.put("pay_type", str2);
        }
        if (num != null) {
            linkedHashMap.put("installment_cnt", Integer.valueOf(num.intValue()));
        }
        if (str3 != null) {
            linkedHashMap.put("entrance_info", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("previous_page", str4);
        }
        C76542zS.LIZ("tiktokec_popup_show", linkedHashMap);
    }

    public static void LJFF(String str, String str2, String str3, String str4, String str5) {
        C76542zS.LIZJ("rd_tiktokec_toast_show", new C28071Azz(str, str2, str3, str4, str5));
    }

    public static void LIZLLL(String prePage, String payType, String str, String str2, String str3, boolean z) {
        o.LJIIIZ(prePage, "prePage");
        o.LJIIIZ(payType, "payType");
        new C28070Azy(z, prePage, payType, str, str2, str3).LIZIZ();
    }

    public static void LIZJ(String str, Long l, String str2, String str3, Boolean bool, String str4, CommuteType commuteType, String str5, String str6) {
        C76542zS.LIZJ("rd_tiktokec_pay_result", new AqS0S6300000_4(str, l, str2, str3, bool, str4, commuteType, str5, str6, 0));
    }

    public static void LJ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j) {
        C76542zS.LIZJ("rd_tiktokec_request_duration", new C28067Azv(str, str2, str3, str4, str5, str6, str7, str8, j));
    }

    public static void LIZ(String str, boolean z, String str2, String str3, long j, long j2, String str4, String str5, String str6, String str7) {
        C76542zS.LIZJ("rd_tiktokec_page_load_duration", new C28069Azx(str, z, str2, str3, j2, j, str4, str6, str5, str7));
    }
}
