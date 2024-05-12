package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.B1o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28112B1o {
    public static String LIZ = "";
    public static final LinkedHashMap<String, Object> LIZIZ = new LinkedHashMap<>();
    public static final java.util.Map<String, Long> LIZJ = new LinkedHashMap();
    public static Integer LIZLLL;
    public static String LJ;
    public static String LJFF;

    public static long LIZ(String str) {
        java.util.Map<String, Long> map = LIZJ;
        Long l = (Long) ((LinkedHashMap) map).get(str);
        if (l != null) {
            long longValue = l.longValue();
            map.remove(str);
            return SystemClock.elapsedRealtime() - longValue;
        }
        return 0L;
    }

    public static List LIZIZ(PaymentMethod paymentMethod) {
        List<ElementDTO> LJI;
        if (paymentMethod != null && (LJI = paymentMethod.LJI()) != null) {
            ArrayList arrayList = new ArrayList();
            for (ElementDTO elementDTO : LJI) {
                if (true ^ o.LJ(elementDTO.id, "eg_ccdc_global_cvv")) {
                    arrayList.add(elementDTO);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(LJIILIIL(((ElementDTO) it.next()).paramName));
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() != 0) {
                    arrayList3.add(next);
                }
            }
            return arrayList3;
        }
        return C61878OQg.INSTANCE;
    }

    public static void LJFF(String inputBoxName) {
        o.LJIIIZ(inputBoxName, "inputBoxName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("input_box_name", inputBoxName);
        C76542zS.LIZ("tiktokec_input_click", linkedHashMap);
    }

    public static void LJIIIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("module_name", str);
        C76542zS.LIZ("tiktokec_module_show", linkedHashMap);
    }

    public static void LJIIJJI(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("popup_for", "quit_editing");
        linkedHashMap.put("popup_name", "quit_editing_ccdc");
        linkedHashMap.put("action_type", str);
        C76542zS.LIZ("tiktokec_popup_click", linkedHashMap);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIILIIL(java.lang.String r1) {
        /*
            if (r1 == 0) goto L33
            int r0 = r1.hashCode()
            switch(r0) {
                case 98896: goto L27;
                case 98915: goto L1e;
                case 766686014: goto L13;
                case 1442881364: goto La;
                default: goto L9;
            }
        L9:
            return r1
        La:
            java.lang.String r0 = "issue_date"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1b
            goto L9
        L13:
            java.lang.String r0 = "expiration_date"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
        L1b:
            java.lang.String r1 = "date"
            goto L9
        L1e:
            java.lang.String r0 = "cvv"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L30
            goto L9
        L27:
            java.lang.String r0 = "cvc"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L30
            goto L9
        L30:
            java.lang.String r1 = "code"
            goto L9
        L33:
            java.lang.String r1 = ""
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28112B1o.LJIILIIL(java.lang.String):java.lang.String");
    }

    public static void LJIILJJIL(String str) {
        LIZJ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public static void LJ(String str, java.util.Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("button_name", str);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C76542zS.LIZ("tiktokec_button_show", linkedHashMap);
    }

    public static /* synthetic */ void LIZLLL(String str, java.util.Map map, int i) {
        if ((i & 2) != 0) {
            map = null;
        }
        LIZJ(str, map, null, null, null);
    }

    public static void LJII(Boolean bool, String str, String str2, boolean z) {
        if (o.LJ(LIZ, str2)) {
            return;
        }
        LJI(bool, str, str2, "card_number_ocr", z);
        LJIIIIZZ(str2, LIZ(str2), "card_number_ocr", Boolean.valueOf(z));
    }

    public static void LJIIIIZZ(String str, long j, String str2, Boolean bool) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("input_box_name", str);
        linkedHashMap.put("stay_time", String.valueOf(j));
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("input_method", str2);
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap.put("is_valid", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        C76542zS.LIZ("tiktokec_input_staytime", linkedHashMap);
    }

    public static void LIZJ(String buttonName, java.util.Map map, Boolean bool, String str, Integer num) {
        o.LJIIIZ(buttonName, "buttonName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("button_name", buttonName);
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap.put("is_use_ocr", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            if (num != null) {
                num.intValue();
                linkedHashMap.put("ocr_mode", V1M.LJJJJZI(num.intValue()));
            }
        }
        if (str != null) {
            linkedHashMap.put("is_edit_ocr_result", str);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C76542zS.LIZ("tiktokec_button_click", linkedHashMap);
    }

    public static void LJI(Boolean bool, String str, String str2, String str3, boolean z) {
        int i;
        String str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        if (str != null) {
            linkedHashMap.put("option_name", str);
        }
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        linkedHashMap.put("is_valid", Integer.valueOf(i));
        if (str2 != null) {
            linkedHashMap.put("input_name", str2);
        }
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("input_method", str3);
        if (bool != null) {
            str4 = V1M.LJJJJZ(bool.booleanValue());
        } else {
            str4 = "-1";
        }
        linkedHashMap.put("if_same_with_last_auto_result", str4);
        C76542zS.LIZ("tiktokec_input_result", linkedHashMap);
    }

    public static void LJIIJ(int i, String str, String str2, long j, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("quit_type", str);
        linkedHashMap.put("stay_time", Long.valueOf(j));
        linkedHashMap.put("ocr_mode", V1M.LJJJJZI(i));
        if (str2 != null) {
            linkedHashMap.put("is_valid", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("if_same_with_last_auto_result", str3);
        }
        C76542zS.LIZ("tiktokec_scan_result", linkedHashMap);
    }

    public static void LJIIL(long j, Boolean bool, String str, Integer num, String str2, boolean z) {
        String str3 = LJFF;
        if (str3 == null) {
            if (ActivityStack.isAppBackGround()) {
                str3 = "close";
            } else {
                str3 = "return";
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("stay_time", String.valueOf(j));
        linkedHashMap.put("page_info", str2);
        linkedHashMap.put("is_complete", V1M.LJJJJZ(z));
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap.put("is_use_ocr", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            if (num != null) {
                num.intValue();
                linkedHashMap.put("ocr_mode", V1M.LJJJJZI(num.intValue()));
            }
        }
        if (str != null) {
            linkedHashMap.put("is_edit_ocr_result", str);
        }
        linkedHashMap.put("quit_type", str3);
        linkedHashMap.put("is_load_data", 1);
        C76542zS.LIZ("tiktokec_stay_page", linkedHashMap);
    }
}
