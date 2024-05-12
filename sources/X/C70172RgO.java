package X;

import Y.IDeS356S0100000_11;
import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS39S0210000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.RgO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70172RgO {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(context, "context");
        IAccountService LJIJ = AccountService.LJIJ();
        if (!LJIJ.LJFF().isLogin()) {
            InterfaceC65895Ptb LJI = LJIJ.LJI();
            C78450Uqc c78450Uqc = new C78450Uqc();
            c78450Uqc.LIZ = C27740Aue.LIZ(context);
            c78450Uqc.LJ = new IDeS356S0100000_11(interfaceC65784Pro, 4);
            C40925G4j.LIZ(c78450Uqc, LJI);
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public static String LIZIZ(Integer num, java.util.Map map) {
        Object obj;
        String str;
        if (map != null && (obj = map.get("cart_form")) != null) {
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (C78685UuP.LJJJZ(str)) {
                return (String) obj;
            }
        }
        if (num != null) {
            if (num.intValue() == 2 || num.intValue() == 3) {
                return "confirm";
            }
            if (num.intValue() == 8 || num.intValue() == 0) {
                return "add_to_cart";
            }
            if (num.intValue() == 7) {
                return "cart_picture";
            }
            if (num.intValue() == 10) {
                return "replace";
            }
        }
        return null;
    }

    public static String LIZJ(Context context, IPdpStarter.PdpEnterParam pdpEnterParam, String str, String str2, boolean z) {
        HashMap<String, Object> hashMap;
        HashMap<String, Object> hashMap2;
        String str3 = null;
        if (pdpEnterParam == null || (hashMap = pdpEnterParam.getTrackParams()) == null) {
            hashMap = null;
            if (pdpEnterParam == null) {
                hashMap2 = null;
                return LIZLLL(context, hashMap, hashMap2, str3, str, str2, z);
            }
        }
        hashMap2 = pdpEnterParam.getRequestParams();
        str3 = pdpEnterParam.getChainKey();
        return LIZLLL(context, hashMap, hashMap2, str3, str, str2, z);
    }

    public static String LIZLLL(Context context, HashMap hashMap, HashMap hashMap2, String str, String str2, String str3, boolean z) {
        if (context == null || str3 == null || str3.length() == 0) {
            return null;
        }
        if (!z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            if (str2 != null) {
                linkedHashMap.put("page_name", str2);
            }
            linkedHashMap.put("entrance_name", "cart");
            linkedHashMap.put("entrance_link", str3);
            C76542zS.LIZ("rd_page_entrance_click", linkedHashMap);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (hashMap != null) {
            hashMap.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
        }
        if (str2 != null) {
            if (hashMap != null) {
                hashMap.put("previous_page", str2);
            }
            linkedHashMap2.put("previous_page", str2);
        }
        if (hashMap != null) {
            linkedHashMap2.put("trackParams", hashMap);
        }
        if (hashMap2 != null) {
            linkedHashMap2.put("requestParams", hashMap2);
        }
        if (str != null) {
            linkedHashMap2.put("chainKey", str);
        }
        Uri.Builder LIZJ = C26867AgZ.LIZJ(str3, linkedHashMap2);
        LIZ(context, new AqS39S0210000_9(z, context, LIZJ, 1));
        return LIZJ.toString();
    }
}
